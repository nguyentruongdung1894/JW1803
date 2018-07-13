<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
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

        <!-- slide -->
        <jsp:include flush="true" page="slide.jsp"/>
        <!-- //slide -->

        <!-- slide-bottom -->
        <jsp:include flush="true" page="slidebottom.jsp"/>
        <!-- //slide-bottom -->

        <!-- schedule-bottom -->
        <jsp:include flush="true" page="schedule.jsp"/>
        <!-- //schedule-bottom -->

        <!-- /banner-bootom-w3-agileits -->     
        <jsp:include flush="true" page="banner-bootom-w3-agileits.jsp"/>
        <!-- //banner-bootom-w3-agileits -->   

        <!--/grids-->
        <jsp:include flush="true" page="grids.jsp"/>					
        <!--/grids-->

        <!-- /new_arrivals --> 
        <jsp:include flush="true" page="new_arrivals.jsp"/>
        <!-- //new_arrivals --> 

        <!-- /we-offer -->
        <jsp:include flush="true" page="we-offer.jsp"/>
        <!-- //we-offer -->

        <!--/grids-1-->
        <jsp:include flush="true" page="grids-1.jsp"/>
        <!--grids-1-->

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
        <script src="../jsp/js/modernizr.custom.js"></script>
        <!-- Custom-JavaScript-File-Links --> 
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
        <!-- script for responsive tabs -->						
        <script src="../jsp/js/easy-responsive-tabs.js"></script>
        <script>
            $(document).ready(function () {
                $('#horizontalTab').easyResponsiveTabs({
                    type: 'default', //Types: default, vertical, accordion           
                    width: 'auto', //auto or any width like 600px
                    fit: true, // 100% fit in a container
                    closed: 'accordion', // Start closed if in accordion view
                    activate: function (event) { // Callback function if tab is switched
                        var $tab = $(this);
                        var $info = $('#tabInfo');
                        var $name = $('span', $info);
                        $name.text($tab.text());
                        $info.show();
                    }
                });
                $('#verticalTab').easyResponsiveTabs({
                    type: 'vertical',
                    width: 'auto',
                    fit: true
                });
            });
        </script>
        <!-- //script for responsive tabs -->		
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
