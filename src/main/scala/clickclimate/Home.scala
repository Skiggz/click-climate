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

}
