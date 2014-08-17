function Greeting(message) {
    this.message = message;

    this.proclaim = function(element) {
        element.appendChild(document.createTextNode(this.message));
    }
}
