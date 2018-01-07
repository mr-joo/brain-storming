let prevNum = 0;
let currentNum = 0;
let operator = undefined;
let digit = 1;

$(document).ready(function () {


    $("#reset").click(function () {
        $("#display").val(0);
        prevNum = 0;
        currentNum = 0;
        operator = undefined;
        digit = 1;
    });

    $("#alert").click(function () {
        alert("현재 값 : " + $("#display").val());
    });

    $("#confirm").click(function () {
        let input = prompt("수식을 입력해주세요.", "");
        for (let i = 0; i < input.length; i++) {
            let findVal = input.charAt(i);
            console.log($("input[value='" + findVal + "']"));
            $("input[value='" + findVal + "']").click();
        }
        $("#equal").click();
    });

    $("#dot").click(function () {
        if (digit == 1) {
            digit = 0.1;
        } else {
            //do nothing
        }
    })

    $(".num > input").click(function () {
        if (digit == 1) {
            let new_num = parseInt($(this).val());
            currentNum = currentNum * 10 + new_num;
            $("#display").val(currentNum);
        } else {
            let new_num = parseInt($(this).val());
            currentNum = currentNum + new_num * digit;
            $("#display").val(parseFloat(currentNum));
            digit = 1;
        }

    });

    $(".calculation > input").click(function () {
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
        } else {
            operator = $(this).val();
        }
        currentNum = 0;
    });
})
;