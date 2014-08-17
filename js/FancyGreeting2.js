function FancyGreeting2(message) {
    this.proclaim = function(element) {
        alert("yay:" + message);
    }
}
_greeting = new Greeting();
FancyGreeting2.prototype = _greeting;
