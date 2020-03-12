let base = document.getElementById("base").href;
let split = base.split("/");
const cxt = split[0] + "//" + split[2];


function ck() {
    $.ajax({
        url: cxt + '/' + 'freemarker/info',
        contentType: "application/x-www-form-urlencoded; charset=utf-8",
        dataType: 'json',
        type: 'post',
        success: function (data) {
            console.log(data);
        },
        error: function (data) {
            console.log(data);
        }
    });
}