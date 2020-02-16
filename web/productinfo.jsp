<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>商品详情</title>
    <script src="js/axios.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/head.js"></script>
    <style type="text/css">
        .layout-footer-center {
            text-align: center;
        }

        .aside-ul .div2 {
            width: 97px;
            height: 320px;
            background: skyblue;
            position: absolute;
            top: 23px;
            left: 138px;
            display: none;
            text-align: center;
            line-height: 100px;
        }

        .aside-ul li:hover .div2 {
            display: block;
            background: #CC6600;
            width: 60px;
            height: 300px;
            transition: .5s;
        }

        .aside-ul li {
            height: 42px;
            line-height: -1px;
            padding-left: 65px;

        }

        .aside-ul li:hover {
            background: #CC6600;
        }

        .aside-ul li a {
            color: #fff;
            text-decoration: none;
            font-size: 15px;
        }

        .book-img {
            max-width: 100%;
            height: 100px;
            z-index: 1;
            position: absolute;
            margin: 30px auto auto 33px;
        }

        .wrapper {
            height: 220px;
            width: 159px;
            background: #FFFFFF;
            float: left;
        }

        .wrapper:hover {
            box-shadow: 0 0 5px 5px #F0F0F0;
            transform: translate3d(0, -2px, 4px);
            transition: .3s;
        }

        body {
            background: #F5F5F5;
        }


        .nav-li:hover ul {
            display: block;


        }


        .logo1 {
            border-radius: 50px;
            width: 60px;
            height: 60px;

        }

        .first-wrapper {
            margin-left: 50px;
        }


        .line-wrapper {
            margin-top: 540px;

        }


        .foot {
            width: 100%;
            height: 100px;
            background: #CCCC66;

        }

        .foot-img {
            height: 70px;
            width: 70px;
            margin-top: 10px;
            font: white;
            border-radius: 50px;

        }

        .foot-sp {
            text-decoration: none;
            color: black;


        }

        .foot-span {
            margin: 120px auto auto 20px;
        }

        .head-theme {
            background: #CCCC66;
        }

        .lay-logo {
            top: -10px;
            float: left;
            margin-left: 50px;
        }


        .line {
            font-size: 500px;
            position: absolute;
        }


        .number_choose {
            margin-left: 50px;

        }

        .card-style {
            width: 900px;
            position: absolute;
            margin-top: -450px;
            height: 540px;
        }

        .inner-style {
            height: 500px;
        }

        .font-style {
            color: #CCCC66;
        }
    </style>
</head>
<body>
<div id="book_app">
    <Header>
        <i-menu mode="horizontal" active-name="1" class="head-theme">
            <div class="lay-logo"><img src="images/home/logo_main.jpg" class="logo1"/></div>
        </i-menu>
    </Header>
    <div>
        <br/>
        <div class="wrapper first-wrapper" id="wrapper">&nbsp;&nbsp;
            <img src="images/home/book/dx(3).jpeg" id="img1" class="book-img"/>
        </div>
        <Divider type="vertical" class="line"/>
        <div style="background:#eee;padding: 20px" class="card-style">
            <Card :bordered="false" class="inner-style">
                <p slot="title">{{bookinfo.name}} {{bookinfo.listprice}}元</p>

                <p class="font-style">书虫自营</p><br/>
                购买数量:
                <input-number :max="10" :min="1" v-model="value1" class="number_choose"></input-number>


                <i-button type="info" class="btn" @click="resCart()">加入购物车</i-button>
                <i-button type="warning" @click="resHome()">返回</i-button>
            </Card>
        </div>
    </div>
    <Footer class="layout-footer-center foot line-wrapper"><img src="images/home/logo.jpeg" class="foot-img"/>
        <span class="foot-span"><a href="https://www.mi.com/" class="foot-sp">小米商城</a>|<a
                href="http://www.dangdang.com/"
                class="foot-sp">当当网</a>|图书|图片
					&copy; bookworm
				</span></Footer>
</div>
<script>
    new Vue({
        el: '#book_app',
        data() {
            return {
                value1: 1,
                value5: '',
                id:<%=request.getParameter("id")%>,
                bookinfo:{
                }
            }
        },

        created(){
            axios({
                url:"http://localhost/product/productinfo?id="+this.id,
                method:"GET"
            }).then(res=>{
               this.bookinfo=res.data;
        });
        },

        methods: {
            resHome() {
                location.href = "home.html";
            },
            resCart() {
                axios({
                    url:"http://localhost/MyCart/add",
                    method:"POST",
                    data:{qty:this.value1,book:this.bookinfo}
                }).then(res=>{
                    if(res.data.is==true)
                        alert("添加成功！");
                    else
                        if(res.data.code==1) alert("未登录 或者参数补齐！");


            });
            }

        }
    })
</script>
</body>
</html>
