package clickclimate

import org.scalatra._

class Home extends ClickClimateStack {

  get("/") {
    <html>
  		<body>
  			<div>
	  			<h1>Welcome</h1>
	  			<p>This is in progress...</p>
  			</div>
  		</body>
  	</html>
  }

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
