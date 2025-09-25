import React from 'react';
import UserGreeting from'./UserGreeting';
import UserInfo from'./UserInfo';
import'./App.css';
function App(){
const user={
name:'RADHA MONABOTI',
age:19
};
return(
<div className="app-container">
<div className="card">
<h2>Sharing Data Using props</h2>
<UserGreeting name={user.name}/>
<UserInfo name={user.name} age={user.age}/>
</div>
</div>
);
}