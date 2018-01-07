let num = 0;
let interval;

$(document).ready(function () {
    startSlide();
    
    $("div").on({
        mouseenter: stopSlide,
        mouseleave: startSlide
    })
});

function startSlide() {
    interval = setInterval(function () {
        slideIn("#img0" + (num % 3 + 1));
        console.log("#img0" + (num % 3 + 1));
        num++;
    }, 3000);
}

function stopSlide() {
    clearInterval(interval);
}

function slideIn(imgNum) {
    $("img").css("z-index", "0");
    $("#img0" + ((num + 5) % 3 + 1)).css("z-index", "50");
    $(imgNum).css("left", "500px");
    $(imgNum).css("position", "absolute");
    $(imgNum).css("z-index", "100");
    $(imgNum).animate({left: "0px"}, 1000);
}