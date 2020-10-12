window.onload = function () {
    // do the work after everything was loaded (DOM, media elements)
    setBackgroundToBlue();

}
function setBackgroundToRed() {
    document.getElementById("greetingBox").style.background = "red";
}
function setBackgroundToBlue() {
    document.getElementById("greetingBox").style.background = "blue";
}
function postMessage() {
    alert();
    return false;
}
