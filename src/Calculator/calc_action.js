let prevNum = 0;
let currentNum = 0;
let operator = undefined;

$(document).ready(function () {


    $("#reset").click(function () {
        $("#display").val(0);
        prevNum = 0;
        currentNum = 0;
        operator = undefined;
    });

    $("#alert").click(function () {
        alert("현재 값 : " + $("#display").val());
    });

    $("#confirm").click(function () {
        let confirm = prompt("수식을 입력해주세요.", "");
        let input = confirm;
    });

    $(".num > input").click(function () {
        let new_num = parseInt($(this).val());
        currentNum = currentNum * 10 + new_num;
        $("#display").val(currentNum);
    });

    $(".calculation > input").click(function () {
    console.log(operator);
        if (operator != undefined) {
             switch (operator) {
             case "+" :
                      prevNum += currentNum;
                      break;

             case "-" :
                      prevNum -= currentNum;
                      break;

             case "*" :
                       prevNum *= currentNum;
                       break;

             case "/" :
             prevNum /= currentNum;
             break;
             }
            $("#display").val(prevNum);
        } else {
            prevNum = currentNum;
        }

        if ($(this).val() == "=") {
            operator = undefined;
        }else {
            operator = $(this).val();
        }
        currentNum = 0;
    });
});