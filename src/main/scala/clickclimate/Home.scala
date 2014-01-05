package clickclimate

import org.scalatra._

class Home extends ClickClimateStack {

	// Home page / Welcome page
	get("/") {
		contentType = "text/html"
  	ssp("index", "title" -> "Welcome to Click Climate")
	}

	// Demo page for live data viewing
	get("/live") {
		contentType = "text/html"
		ssp("live", "title" -> "Click Climate View Demo")
	}

	// Demo page for client side data feeding
	get("/demo") {
		contentType = "text/html"
		ssp("demo", "title" -> "Click Climate Client Demo", "jsFile" -> "js/clickclimate.js")
	}

}
