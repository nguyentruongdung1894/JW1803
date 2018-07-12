<%-- 
    Document   : about
    Created on : Jul 11, 2018, 8:25:49 PM
    Author     : ScorPius 31
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include flush="true" page="head.jsp"/>
    <body>
        <!-- header -->
        <jsp:include flush="true" page="header.jsp"/>
        <!-- //header -->

        <!-- header-bot -->
        <jsp:include flush="true" page="header-bot.jsp"/>
        <!-- //header-bot -->

        <!-- banner -->
        <jsp:include flush="true" page="banner.jsp"/>
        <!-- //banner -->

        <!-- Modal1 -->
        <jsp:include flush="true" page="modal1.jsp"/>
        <!-- //Modal1 -->

        <!-- Modal2 -->
        <jsp:include flush="true" page="modal2.jsp"/>
        <!-- //Modal2 -->

        <!-- /banner_bottom_agile_info -->
        <div class="page-head_agile_info_w3l">
            <div class="container">
                <h3>About <span>Us </span></h3>
                <!--/w3_short-->
                <div class="services-breadcrumb">
                    <div class="agile_inner_breadcrumb">

                        <ul class="w3_short">
                            <li><a href="index.html">Home</a><i>|</i></li>
                            <li>About</li>
                        </ul>
                    </div>
                </div>
                <!--//w3_short-->
            </div>
        </div>
        <!-- /banner_bottom_agile_info -->
        <jsp:include flush="true" page="banner_bottom_agile_info_1.jsp"/>


        <!-- team -->
        <jsp:include flush="true" page="team.jsp"/>
        <!-- //team -->

        <!-- schedule-bottom -->
        <jsp:include flush="true" page="schedule.jsp"/>
        <!-- //schedule-bottom -->

        <!-- banner-bootom-w3-agileits -->
        <jsp:include flush="true" page="banner-bootom-w3-agileits.jsp"/>
        <!-- //banner-bootom-w3-agileits -->

        <!--/grids-->
        <jsp:include flush="true" page="grids.jsp"/>							
        <!--/grids-->

        <!-- /we-offer -->
        <jsp:include flush="true" page="we-offer.jsp"/>
        <!-- //we-offer -->

        <!--/grids-->
        <jsp:include flush="true" page="grids-1.jsp"/>
        <!--grids-->

        <!-- footer -->
        <jsp:include flush="true" page="footer.jsp"/>
        <!-- //footer -->

        <!-- login -->
        <jsp:include flush="true" page="login.jsp"/>
        <!-- //login -->

        <a href="#home" class="scroll" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
        <!-- js -->
        <script type="text/javascript" src="../jsp/js/jquery-2.1.4.min.js"></script>
        <!-- //js -->	
        <!-- cart-js -->
        <script src="../jsp/js/minicart.min.js"></script>
        <script>
            // Mini Cart
            paypal.minicart.render({
                action: '#'
            });

            if (~window.location.search.indexOf('reset=true')) {
                paypal.minicart.reset();
            }
        </script>

        <!-- //cart-js --> 

        <!-- stats -->
        <script src="../jsp/js/jquery.waypoints.min.js"></script>
        <script src="../jsp/js/jquery.countup.js"></script>
        <script>
            $('.counter').countUp();
        </script>
        <!-- //stats -->
        <!-- start-smoth-scrolling -->
        <script type="text/javascript" src="../jsp/js/move-top.js"></script>
        <script type="text/javascript" src="../jsp/js/jquery.easing.min.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!-- here stars scrolling icon -->
        <script type="text/javascript">
            $(document).ready(function () {
                /*
                 var defaults = {
                 containerID: 'toTop', // fading element id
                 containerHoverID: 'toTopHover', // fading element hover id
                 scrollSpeed: 1200,
                 easingType: 'linear' 
                 };
                 */

                $().UItoTop({easingType: 'easeOutQuart'});

            });
        </script>
        <!-- //here ends scrolling icon -->

        <!-- for bootstrap working -->
        <script type="text/javascript" src="../jsp/js/bootstrap.js"></script>
    </body>
</html>
