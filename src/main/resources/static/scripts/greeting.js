window.onload = function () {
    // do the work after everything was loaded (DOM, media elements)
    setBackgroundToRed();

}
function setBackgroundToRed() {
    document.getElementById("greetingBox").style.background = "red";
}
function postMessage() {
    alert();
    return false;
}
