package clickclimate

import org.scalatra._

class Home extends ClickClimateStack {

	get("/") {
		contentType = "text/html"
  	ssp("index", "title" -> "Welcome to Click Climate")
	}

	get("/home") {
		contentType = "text/html"
		ssp("home", "title" -> "Welcome to Click Climate")
	}

	get("/demo") {
		contentType = "text/html"
		ssp("demo", "title" -> "Click Climate Demo App", "jsFile" -> "js/clickclimate.js")
	}

  // TODO: /live /demo
	notFound {
		<html>
		    <body>
		        <div>
		            <h1>Are you lost...?</h1>
		            <p>...cause you look lost. Let's try heading back <a href="/">home</a>.</p>
		        </div>
		    </body>
		</html>
	} 

}
