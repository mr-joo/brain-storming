$(document).ready(function () {
    let num1;
    let num2;
    let result;
    let operator;

    $("#reset").click(function () {
        $("#textBox").val(0);
    });

    $("#alert").click(function () {
        alert("현재 값 : " + $("#textBox").val());
    });

    $("#confirm").click(function () {
        let confirm = prompt("수식을 입력해주세요.", "");
        let input = confirm;
        let translate = input.replace()
        $("#textBox").val(translate);
    });

    $(".num > input").click(function () {
        num1 = $(this).val();
        $("#textBox").val($(this).val());
        console.log(num1);
    });

    $(".calculation > input").click(function () {
        operator = $(this).val();
        console.log(operator);
    })

    if (operator == "/"){
        result = num1 / num2;
    } else if (operator == "*") {
        result = num1 * num2;
    } else if (operator == "-") {
        result = num1 - num2;
    } else if (operator == "+") {
        result = num1 + num2;
    }


    $("#equal").click(function () {
        $("#textBox").val(result);
    })
});