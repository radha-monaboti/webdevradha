import sqlite3

conn = sqlite3.connect("database.db")
cursor = conn.cursor()

cursor.execute("""
CREATE TABLE IF NOT EXISTS voters(
id INTEGER PRIMARY KEY AUTOINCREMENT,
name TEXT,
email TEXT,
password TEXT,
has_voted INTEGER DEFAULT 0
)
""")

cursor.execute("""
CREATE TABLE IF NOT EXISTS candidates(
id INTEGER PRIMARY KEY AUTOINCREMENT,
name TEXT,
party TEXT
)
""")

cursor.execute("""
CREATE TABLE IF NOT EXISTS votes(
id INTEGER PRIMARY KEY AUTOINCREMENT,
voter_id INTEGER,
candidate_id INTEGER
)
""")

cursor.execute("INSERT INTO candidates(name,party) VALUES('Ramesh','Party A')")
cursor.execute("INSERT INTO candidates(name,party) VALUES('Suresh','Party B')")
cursor.execute("INSERT INTO candidates(name,party) VALUES('Mahesh','Party C')")

conn.commit()
conn.close()

print("Database created successfully")