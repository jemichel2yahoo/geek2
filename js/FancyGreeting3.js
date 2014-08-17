function FancyGreeting3(message) {
    this.proclaim = function(element) {
        document.write("yay:" + message);
    }
}
_greeting = new Greeting();
FancyGreeting3.prototype = _greeting;
