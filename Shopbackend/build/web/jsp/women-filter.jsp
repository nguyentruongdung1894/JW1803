<%-- 
    Document   : AccountAdmin
    Created on : Jul 18, 2018, 11:14:45 AM
    Author     : ScorPius 31
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <meta charset="utf-8" />
        <title>Product - admin</title>

        <meta name="description" content="Dynamic tables and grids using jqGrid plugin" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

        <!-- bootstrap & fontawesome -->
        <link rel="stylesheet" href="../jsp/assets/css/bootstrap.min.css" />
        <link rel="stylesheet" href="../jsp/assets/font-awesome/4.2.0/css/font-awesome.min.css" />

        <!-- page specific plugin styles -->
        <link rel="stylesheet" href="../jsp/assets/css/jquery-ui.min.css" />
        <link rel="stylesheet" href="../jsp/assets/css/datepicker.min.css" />
        <link rel="stylesheet" href="../jsp/assets/css/ui.jqgrid.min.css" />

        <!-- text fonts -->
        <link rel="stylesheet" href="../jsp/assets/fonts/fonts.googleapis.com.css" />

        <!-- ace styles -->
        <link rel="stylesheet" href="../jsp/assets/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" />
        <style>
            form.example input[type=text] {
                padding: 5px;
                font-size: 15px;
                box-sizing: border-box;
                border: 1px solid #ccc;
                float: left;
                width: 10%;
                background: #f1f1f1;
                margin-bottom: 10px;
                -webkit-transition: width 0.4s ease-in-out;
                transition: width 0.4s ease-in-out;
            }
            form.example input[type=text]:focus {
                width: 50%;
            }
            form.example button {
                float: left;
                width: 40px;
                padding: 5px;
                background: #2196F3;
                color: white;
                font-size: 15px;
                box-sizing: border-box;
                border: 1px solid #ccc;
                border-left: none;
                cursor: pointer;
                margin-bottom: 10px;
            }

            form.example button:hover {
                background: #0b7dda;
            }

            form.example::after {
                content: "";
                clear: both;
                display: table;
            }
        </style>
    </head>

    <body class="no-skin">
        <jsp:include flush="true" page="navbar-admin.jsp"/>

        <div class="main-container" id="main-container">
            <script type="text/javascript">
                try {
                    ace.settings.check('main-container', 'fixed')
                } catch (e) {
                }
            </script>

            <jsp:include flush="true" page="sidebar-admin.jsp"/>

            <div class="main-content">
                <div class="main-content-inner">
                    <div class="breadcrumbs" id="breadcrumbs">
                        <script type="text/javascript">
                            try {
                                ace.settings.check('breadcrumbs', 'fixed')
                            } catch (e) {
                            }
                        </script>

                        <ul class="breadcrumb">
                            <li>
                                <i class="ace-icon fa fa-home home-icon"></i>
                                <a href="">Home</a>
                            </li>

                            <li>
                                <a href="">Tables</a>
                            </li>
                            <li class="active">Product - admin</li>
                        </ul><!-- /.breadcrumb -->

                        <div class="nav-search" id="nav-search">
                            <form class="form-search">
                                <span class="input-icon">
                                    <input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
                                    <i class="ace-icon fa fa-search nav-search-icon"></i>
                                </span>
                            </form>
                        </div><!-- /.nav-search -->
                    </div>

                    <div class="page-content">
                        <div class="ace-settings-container" id="ace-settings-container">
                            <div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
                                <i class="ace-icon fa fa-cog bigger-130"></i>
                            </div>

                            <div class="ace-settings-box clearfix" id="ace-settings-box">
                                <div class="pull-left width-50">
                                    <div class="ace-settings-item">
                                        <div class="pull-left">
                                            <select id="skin-colorpicker" class="hide">
                                                <option data-skin="no-skin" value="#438EB9">#438EB9</option>
                                                <option data-skin="skin-1" value="#222A2D">#222A2D</option>
                                                <option data-skin="skin-2" value="#C6487E">#C6487E</option>
                                                <option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
                                            </select>
                                        </div>
                                        <span>&nbsp; Choose Skin</span>
                                    </div>

                                    <div class="ace-settings-item">
                                        <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-navbar" />
                                        <label class="lbl" for="ace-settings-navbar"> Fixed Navbar</label>
                                    </div>

                                    <div class="ace-settings-item">
                                        <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar" />
                                        <label class="lbl" for="ace-settings-sidebar"> Fixed Sidebar</label>
                                    </div>

                                    <div class="ace-settings-item">
                                        <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-breadcrumbs" />
                                        <label class="lbl" for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
                                    </div>

                                    <div class="ace-settings-item">
                                        <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" />
                                        <label class="lbl" for="ace-settings-rtl"> Right To Left (rtl)</label>
                                    </div>

                                    <div class="ace-settings-item">
                                        <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container" />
                                        <label class="lbl" for="ace-settings-add-container">
                                            Inside
                                            <b>.container</b>
                                        </label>
                                    </div>
                                </div><!-- /.pull-left -->

                                <div class="pull-left width-50">
                                    <div class="ace-settings-item">
                                        <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-hover" />
                                        <label class="lbl" for="ace-settings-hover"> Submenu on Hover</label>
                                    </div>

                                    <div class="ace-settings-item">
                                        <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-compact" />
                                        <label class="lbl" for="ace-settings-compact"> Compact Sidebar</label>
                                    </div>

                                    <div class="ace-settings-item">
                                        <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-highlight" />
                                        <label class="lbl" for="ace-settings-highlight"> Alt. Active Item</label>
                                    </div>
                                </div><!-- /.pull-left -->
                            </div><!-- /.ace-settings-box -->
                        </div><!-- /.ace-settings-container -->

                        <div class="page-header">
                            <h1>
                                Product
                                <small>
                                    <i class="ace-icon fa fa-angle-double-right"></i>
                                    Dynamic tables and grids using Product plugin
                                </small>
                            </h1>
                        </div><!-- /.page-header -->

                        <div class="row">
                            <div class="col-xs-12">
                                <!-- PAGE CONTENT BEGINS -->


                                <form class="example" action="">
                                    <input type="text" placeholder="Search.." name="search">
                                    <button type="submit"><i class="fa fa-search"></i></button>
                                </form>
                                <div class="">
                                    <div class="dropdown">
                                        <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Lọc Sản Phẩm
                                            <span class="caret"></span></button>
                                        <ul class="dropdown-menu">
                                            <c:forEach items="${listBannerWomen}" var="W">
                                                <li><a href="<%=request.getContextPath()%>/admin/womens-filter.htm?productWomenById=${W.madanhmuccon}">${W.tendanhmuccon}</a></li>
                                            </c:forEach>
                                        </ul>
                                    </div>
                                    <div class="dropdown">
                                        <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Click Me...!
                                            <span class="caret"></span></button>
                                        <ul class="dropdown-menu">
                                            <li><a href="productMen-admin.htm">Men's wear</a></li>
                                            <li><a href="productWomen-admin.htm">Women's wear</a></li>
                                            <li><a href="productBag-admin.htm">Bag</a></li>
                                            <li><a href="productFootwear-admin.htm">Footwear</a></li>
                                        </ul>
                                    </div>
                                </div>



                                <div class="">          
                                    <table class="table table-bordered">
                                        <thead>
                                            <tr class="">
                                                <th>Id</th>
                                                <th>References</th>
                                                <th>Ten_san_pham</th>
                                                <th>Image</th>
                                                <th>Input Date</th>
                                                <th>Image-Id</th>
                                                <th>Quantity</th>
                                                <th>Description</th>
                                                <th>Price</th>
                                                <th>Sale-Id</th>
                                                <th>View</th>
                                                <th>Supplier</th>
                                                <th>Status</th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody id="id01">
                                            <c:forEach items="${listProductW}" var="W">
                                                <tr>
                                                    <td>${W.productId}</td>
                                                    <td>${W.categoryId}</td>
                                                    <td>${W.productName}</td>
                                                    <td>${W.productImage}</td>
                                                    <td>${W.date}</td>
                                                    <td>${W.imageId}</td>
                                                    <td>${W.quantity}</td>
                                                    <td>${W.description}</td>
                                                    <td>${W.price}</td>
                                                    <td>${W.saleId}</td>
                                                    <td>${W.view}</td>
                                                    <td>${W.supplier}</td>                                                    
                                                    <td>${W.status}</td>
                                                    <td>
                                                        <div class="hidden-sm hidden-xs action-buttons">
                                                            <a class="blue" href="#">
                                                                <i class="ace-icon fa fa-search-plus bigger-130"></i>
                                                            </a>

                                                            <a class="green" href="#">
                                                                <i class="ace-icon fa fa-pencil bigger-130"></i>
                                                            </a>

                                                            <a class="red" href="#">
                                                                <i class="ace-icon fa fa-trash-o bigger-130"></i>
                                                            </a>
                                                        </div>
                                                    </td>
                                                </tr> 
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>    
<!--                                <a href="">${url}</a>-->
                                <!-- PAGE CONTENT ENDS -->
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.page-content -->
                </div>
            </div><!-- /.main-content -->

            <jsp:include flush="true" page="footer-admin.jsp"/>

            <a href="" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
                <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
            </a>
        </div><!-- /.main-container -->

        <script src="../jsp/assets/js/jquery.2.1.1.min.js"></script>

        <script type="text/javascript">
                            window.jQuery || document.write("<script src='../jsp/assets/js/jquery.min.js'>" + "<" + "/script>");
        </script>

        <script type="text/javascript">
            if ('ontouchstart' in document.documentElement)
                document.write("<script src='../jsp/assets/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
        </script>
        <script src="../jsp/assets/js/bootstrap.min.js"></script>

        <!-- page specific plugin scripts -->
        <script src="../jsp/assets/js/bootstrap-datepicker.min.js"></script>
        <script src="../jsp/assets/js/jquery.jqGrid.min.js"></script>
        <script src="../jsp/assets/js/grid.locale-en.js"></script>

        <!-- ace scripts -->
        <script src="../jsp/assets/js/ace-elements.min.js"></script>
        <script src="../jsp/assets/js/ace.min.js"></script>


    </body>
</html>
