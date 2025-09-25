import React,{useState} from 'react';
function RestaurentMenu(){
const[order,setOrder]=useState([]);
const menuItems=[
{id:1,name:'Dum Biryani',price:180},
{id:2,name:'Special Biryani',price:200},
{id:3,name:'Hyderabad Biryani',price:260}
];
const addToOrder=(item)=>setOrder([..order,item]);
const total=order.reduce((sum,item)=>sum+item.price,0);
return(
<div style={{
minHeight:'100vh',
background:'linear-gradient(rgba(0,0,0,0.7),rgba(0,0,0,0.7)),
url(link)',
backgroundSize:'cover',
color:'white',
padding:'40px'
}}>
<div style={{maxWidth:'600px',margin:'0 auto'}}>
<h1 style={{fontFamily:'Georgia',borderBottom:'1px solid goldenrod'}}>Biryani House</h1>
<div style={{display:'grid',gap:'20px',margin:'30px 0'}}>
{menuItems.mao(item=>(
<div key={item.id} style={{
display:'flex',
justifyContent:'space-between',
alignItems:'center'
background:'rgba(255,255,255,0.1)',
padding:'15px',
borderRadius:'5px'
}}>
<div>
<h3 style={{margin:0}}>{item.name}</h3>
<p style={{color:'goldenrod',margin:'5px 00'}}>rupees{item.price}</p>
</div>
<button onClick={()=>addToOrder(item)}style={{
background:'goldenrod',
border:'none',
padding:'8px 15px',
borderRadius:'3px',
cursor:'pointer'
}}>+Add</button>
</div>
))}
</div>
{order.length>0&&(
<div style={{
background:'rgba(0,0,0,0.7)',
padding:'20px',
borderRadius}})})}