/*function work(a=4,b=4){
    let c=a+b;
    return c;
}
console.log(work(10,59));*/

/*let conditions = function(a){
    if(a%2==0){
        return true;
    }
    else{
        return false;
    }
}
let a=9;
console.log(conditions(a));*/

/*let a=12;

let oddOrEven = (a) => {
    a%2==0?'Even':'Odd';
}
console.log(oddOrEven(a));*/

/*let a=-10;

let variable =(a) => {
    if(a>=0){
        return true;
    }
    else{
        return false;
    }
}
console.log(variable(a)?'Positive':'Negative');*/

/*function operations(op,a,b){
    return op(a,b);
}
//method 1
let add=(a,b)=> a+b;

//method 2
function sub(a,b){
    return a-b;
}
console.log(operations(sub,20,3));*/

/*let multi= (a) => a*5;
console.log(multi(5));*/

/*let EngineOptions = " Petrole , Diesel";

let car = {
    name : "Ebony",
    brand: "Range Rover",
    "driven Train" : EngineOptions + "ev",
    price : 15,
    onRoadPrice(price){
        return this.price+2;
    }
};
//console.log(car);

//delete car.price;
car["Model Year"] = 2024;

// car.price=18;

console.log(car.onRoadPrice(car.price));*/

/*let user ={
    name : 'Rohith',
    age : 21,
    height : 5.9,
    weight : '78kg'
}
for(key in user){
    console.log(key+" -> "+user[key]);
}*/

/*const a={
    name:'Rohith',
    age:21
}
let b=a;
console.log(a,b);

b.age=31;
console.log(a,b);*/

/*let a={
    name:'rohith'
}
function User(a){
    this.name=a;
    this.age=function(){
        return 21;
    }
}
let rohith=new User('rohith');
let ajay=new User('ajay');

console.log(rohith.age(),ajay.age());*/

/*let score={
    a:'ajay',
    b:'rohith',
    c:'rishi',
    d:'vishwa',
    e:'tarun'
}
function Team(a){
    this.score=a;
    return a*10+'/100';
}
let team1=new Team(7);
let team2=new Team(9);

console.log(score.a+" "+Team(7));*/

/*class User{
    #name;
    #age;
    constructor(name,age){
        this.#name=name;
        this.#age=age;
    }

    display(){
        console.log('Name: '+this.#name);
        console.log('Age: '+this.#age);
        return true;
    }
    //name
    get name(){
        return this.#name;
    }
    set name(name){
        this.#name=name;
    }
    //age
    get age(){
        return this.#age;
    }
    set age(age){
        this.#age=age;
    }
}
//obj
let obj=new User('Ajay',22);

console.log(obj.display());

obj.name="ROHITH";
obj.age=25;

console.log(obj.display());*/

//promise

/*isHalwaThere =true;

function waitInQueue(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            if(isHalwaThere){
                resolve('Buy Halwa 2Kg');
            }
            else{
                reject('Halwa Got Over');
            }
        },1000);
    });
}
function buyHalwa(){
    waitInQueue().then((message)=>{
        console.log(message);
    })
    .catch((error)=>{
        console.log('error is'+error);
    })
    .finally(()=>{
        console.log('Thank you!!');
    })
}

buyHalwa();*/

/*isHalwaThere =false;

function waitInQueue(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            if(isHalwaThere){
                resolve('Buy Halwa 2Kg');
            }
            else{
                reject('Halwa Got Over');
            }
        },1000);
    });
}
async function buyHalwa(){
    try{
        let result=await waitInQueue();
        console.log(result);
    }
    catch(error){
        console.log("Halwa Over");
    }
}

buyHalwa();*/