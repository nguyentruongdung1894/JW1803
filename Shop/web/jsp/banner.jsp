<%-- 
    Document   : banner
    Created on : Jul 11, 2018, 7:48:15 PM
    Author     : ScorPius 31
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div class="ban-top">
    <div class="container">
        <div class="top_nav_left">
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse menu--shylock" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav menu__list">
                            <li class="active menu__item menu__item--current"><a class="menu__link" href="<%=request.getContextPath()%>/home/index.htm">Home <span class="sr-only">(current)</span></a></li>
                            <li class=" menu__item"><a class="menu__link" href="<%=request.getContextPath()%>/home/about.htm">About</a></li>
                            <li class="dropdown menu__item">
                                <a href="#" class="dropdown-toggle menu__link" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Men's wear<span class="caret"></span></a>
                                <ul class="dropdown-menu multi-column columns-3">
                                    <div class="agile_inner_drop_nav_info">
                                        <div class="col-sm-6 multi-gd-img1 multi-gd-text ">
                                            <a href=""><img src="../jsp/images/top2.jpg" alt=" "/></a>
                                        </div>
                                        <div class="col-sm-3 multi-gd-img">
                                            <ul class="multi-column-dropdown">
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(0).madanhmuccon}">${listBannerMen.get(0).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(1).madanhmuccon}">${listBannerMen.get(1).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(2).madanhmuccon}">${listBannerMen.get(2).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(3).madanhmuccon}">${listBannerMen.get(3).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(4).madanhmuccon}">${listBannerMen.get(4).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(5).madanhmuccon}">${listBannerMen.get(5).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(6).madanhmuccon}">${listBannerMen.get(6).tendanhmuccon}</a></li>                                             
                                            </ul>
                                        </div>
                                        <div class="col-sm-3 multi-gd-img">
                                            <ul class="multi-column-dropdown">
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(7).madanhmuccon}">${listBannerMen.get(7).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(8).madanhmuccon}">${listBannerMen.get(8).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(9).madanhmuccon}">${listBannerMen.get(9).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(10).madanhmuccon}">${listBannerMen.get(10).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(11).madanhmuccon}">${listBannerMen.get(11).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(12).madanhmuccon}">${listBannerMen.get(12).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/mens.htm?productMenById=${listBannerMen.get(13).madanhmuccon}">${listBannerMen.get(13).tendanhmuccon}</a></li>                                            
                                            </ul>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                </ul>
                            </li>
                            <li class="dropdown menu__item">
                                <a href="#" class="dropdown-toggle menu__link" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Women's wear<span class="caret"></span></a>
                                <ul class="dropdown-menu multi-column columns-3">
                                    <div class="agile_inner_drop_nav_info">
                                        <div class="col-sm-3 multi-gd-img">
                                            <ul class="multi-column-dropdown">
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(0).madanhmuccon}">${listBannerWomen.get(0).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(1).madanhmuccon}">${listBannerWomen.get(1).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(2).madanhmuccon}">${listBannerWomen.get(2).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(3).madanhmuccon}">${listBannerWomen.get(3).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(4).madanhmuccon}">${listBannerWomen.get(4).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(5).madanhmuccon}">${listBannerWomen.get(5).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(6).madanhmuccon}">${listBannerWomen.get(6).tendanhmuccon}</a></li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-3 multi-gd-img">
                                            <ul class="multi-column-dropdown">
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(7).madanhmuccon}">${listBannerWomen.get(7).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(8).madanhmuccon}">${listBannerWomen.get(8).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(9).madanhmuccon}">${listBannerWomen.get(9).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(10).madanhmuccon}">${listBannerWomen.get(10).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(11).madanhmuccon}">${listBannerWomen.get(11).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(12).madanhmuccon}">${listBannerWomen.get(12).tendanhmuccon}</a></li>
                                                <li><a href="<%=request.getContextPath()%>/home/womens.htm?productWomenById=${listBannerWomen.get(13).madanhmuccon}">${listBannerWomen.get(13).tendanhmuccon}</a></li>  
                                            </ul>
                                        </div>
                                        <div class="col-sm-6 multi-gd-img multi-gd-text ">
                                            <a href=""><img src="../jsp/images/top1.jpg" alt=" "/></a>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                </ul>
                            </li>                            
                            <li class=" menu__item"><a class="menu__link" href="<%=request.getContextPath()%>/home/contact.htm">Contact</a></li>
                        </ul>
                    </div>
                </div>
            </nav>	
        </div>
        <div class="top_nav_right">
            <div class="wthreecartaits wthreecartaits2 cart cart box_1"> 
                <form action="#" method="post" class="last"> 
                    <input type="hidden" name="cmd" value="_cart">
                    <input type="hidden" name="display" value="1">
                    <button class="w3view-cart" type="submit" name="submit" value=""><i class="fa fa-cart-arrow-down" aria-hidden="true"></i></button>
            </form>  
            </div>
        </div>
        <div class="clearfix"></div>
    </div>
</div>