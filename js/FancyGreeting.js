function FancyGreeting(message) {
    this.proclaim = function(element) {
        element.appendChild(document.createTextNode("yay: " + message));
    }
}
_greeting = new Greeting();
FancyGreeting.prototype = _greeting;
