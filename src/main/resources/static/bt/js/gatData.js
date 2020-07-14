$(function () {
    $.post({
        url:'xiangmubiao/getAll',
        success: function (data) {
            for (var i=0 ; i<data.length; i++){
                var text=" <tr>\n" +
                    "                    <td>"+data[i].xiangmuid+"</td>\n" +
                    "                    <td>"+data[i].xiangmuname+"</td>\n" +
                    "                    <td>"+data[i].xiangmuzijin+"</td>\n" +
                    "                    <td>"+data[i].cehuaren+"</td>\n" +
                    "                    <td>\n" +
                    "                        <a href=\"xiangmubiao/delByXiangmuid?xiangmuid="+data[i].xiangmuid+"\" class=\"btn btn-danger\">删除</a>\n" +
                    "                        <a href=\"update.html?xiangmuid="+data[i].xiangmuid+"\" class=\"btn btn-success\">修改</a>\n" +
                    "                    </td>\n" +
                    "                </tr>"

                var obj = $(".pool");
                obj.append(text);

            }
        }
    });
});