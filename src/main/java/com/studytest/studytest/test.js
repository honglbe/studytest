var fs = require("fs");
var path = "/Users/honglibin/temp";
var log = path + "/" + "log6.txt";
console.log(log);

module.exports = {
    *beforeSendRequest(requestDetail){
        url = requestDetail.url;
        Request = requestDetail.requestData.length;
}
    *beforeSendResponse(requestDetail, responseDetail){
    Response = responseDetail.response.body.length;
    let xxx = Response;
};
    fs.appendFileSync(log, "time:"+new Date().getTime()+"|"+url + "|请求大小：" + Request + "|body大小：" + xxx + "B" +  "\n", 'utf-8', function (err) {
        if (err) throw err;
        console.log('err');
    });
};