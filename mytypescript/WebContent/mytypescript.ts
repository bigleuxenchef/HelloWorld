/**
 * Created by rumi on 2015-10-31.
 */
//declare var GlobalUser:string;


function greeter(person) {
    return "Hello, " + person;
}

function change(user) {
    // document.body.innerHTML = greeter(user);
  //let GlobalUser = "Jane User";
 // var count: number;
  
 // count = use + 1;
  
    console.log("user " + user);
    document.getElementById("eric").innerHTML = greeter(user) + " Global User@@@@";
    document.getElementById("eric2").innerHTML = "*****classic ****" + document.getElementById("name").value;
}
// greeter(user);
//# sourceMappingURL=mytypescript.js.map