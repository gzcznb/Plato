const base = document.getElementById("base").href;
// 与后台交互

console.log("base: " + base);


function ck() {
    $.ajax({
        url: base + '/' + 'freemarker/info',
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