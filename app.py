from flask import Flask, render_template, request, redirect, session
import sqlite3

app = Flask(__name__)
app.secret_key = "secret123"

def get_db():
    return sqlite3.connect("database.db")

@app.route("/")
def home():
    return render_template("login.html")

@app.route("/register", methods=["GET","POST"])
def register():

    if request.method == "POST":
        name = request.form["name"]
        email = request.form["email"]
        password = request.form["password"]

        conn = get_db()
        cur = conn.cursor()

        cur.execute("INSERT INTO voters(name,email,password) VALUES(?,?,?)",
                    (name,email,password))
        conn.commit()

        return redirect("/")

    return render_template("register.html")


@app.route("/login", methods=["POST"])
def login():

    email = request.form["email"]
    password = request.form["password"]

    conn = get_db()
    cur = conn.cursor()

    cur.execute("SELECT * FROM voters WHERE email=? AND password=?",
                (email,password))

    user = cur.fetchone()

    if user:
        session["voter_id"] = user[0]
        return redirect("/vote")
    else:
        return "Invalid Login"


@app.route("/vote")
def vote():

    conn = sqlite3.connect("database.db")
    cur = conn.cursor()

    cur.execute("SELECT * FROM candidates")
    candidates = cur.fetchall()

    return render_template("vote.html", candidates=candidates)


@app.route("/submit_vote", methods=["POST"])
def submit_vote():

    candidate_id = request.form.get('candidate')

    if candidate_id is None:
        return "Please select a candidate before voting"

    conn = sqlite3.connect("database.db")
    cur = conn.cursor()

    cur.execute("INSERT INTO votes(candidate_id) VALUES(?)",(candidate_id,))
    conn.commit()

    return redirect("/result")

@app.route("/result")
def result():

    conn = get_db()
    cur = conn.cursor()

    cur.execute("""
    SELECT candidates.name, COUNT(votes.candidate_id)
    FROM votes
    JOIN candidates
    ON votes.candidate_id = candidates.id
    GROUP BY candidates.name
    """)

    results = cur.fetchall()

    return render_template("result.html", results=results)


if __name__ == "__main__":
    app.run(debug=True)