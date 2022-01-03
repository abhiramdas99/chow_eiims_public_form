<!DOCTYPE html>
<html lang="en">
<head><jsp:include page="../common/header.jsp" /></head>

<body class="layout-boxed navbar-top">

	<!-- Main navbar -->
	<!-- /main navbar -->


	<!-- Page container -->
	<div class="page-container">

		<!-- Page content -->
		<div class="page-content">

			<!-- Main content -->
			<div class="content-wrapper">

				<!-- Page header -->
				<div class="page-header page-header-default">
				</div>
				<!-- /page header -->


				<!-- Content area -->
				<div class="content">
					<jsp:include page="content/header.jsp" />
					<jsp:include page="content/default.jsp" />

					<!-- Footer -->
					<div class="footer text-muted">
						&copy; 2021. <a href="#">Copyright Chowgule Development Center</a>
					</div>
					<!-- /footer -->

				</div>
				<!-- /content area -->

			</div>
			<!-- /main content -->

		</div>
		<!-- /page content -->

	</div>
	<!-- /page container -->
<jsp:include page="content/script.jsp" />
</body>
</html>
