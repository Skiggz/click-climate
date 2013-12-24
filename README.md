# Click Climate 

---

## Build & Run 

```sh
$ ./sbt
> container:start
```

Navigate to [http://localhost:8080/](http://localhost:8080/) in your browser.

---

##Overview

* **This is imcomplete and in progress (along with the functionality documented)**
* Expect nothing! (For now...)
* I will tag things as `[In progress]` for time being. Future additions will then come with documentation, this is merely the beginning pre-planned stuff

###Client Side [In progress]

Client side, data points build up over a specified time and are shipped off to the server in batches.

###Server Side [In progress]

On the server side, the data points are processed to get a current running value which is served to the client when viewing live streaming. 

The client then polls for updates from the server for a "live" representation of the data.

###Viewing the data [In progress]

When viewing the data, tabs will display the different pages you've requested data from, which you specify via javascript

---

##Creating a click climate object [In progress]

```javascript
var config = {
	// Url to stream data to
	serverUrl: "http://localhost:8080",

	// Max # of data points before flushing data
	updateMaxDataPoints: 100,

	// Number of seconds between flushes if max data points not met
	updateTime: 90,

	// Log events from flushing data, and other things
	logEvents: false,

	/* 
		Log object to log to (customize logging)
	   	Will be called by logObject("I'm a log") 
	   	otherwise console.log("I'm a log") if set to null
	*/
	logObject: null
};
var clickClimate = new ClickClimate(config);

```

##Navigating pages and views [In progress]

Every time you navigate to a different page or change views (some apps are single page based but change views dynamically) you should tell the `clickClimate` object. This way you can separate click climates per view.

```javascript
clickClimate.currentView = "/home"
```

There is no required pattern for this name, this is simply going to turn into a page view tab on the dashboard titled with what you send. Call if `"foo man choo shoe"` if you want.

---

##The website [In progress]

Below are the pages on the project that demo the functionality for both server and client side code

###/

The home page where you will find links to everything, including a little bit about the site

---

###/demo

A demo page where you can see the action live! Everything you do here is streamed to /live

---

###/live

This is where you can see an example of the data streaming server side


