
package rbsla.utils;

import com.google.gdata.client.*;
import com.google.gdata.client.calendar.*;
import com.google.gdata.data.*;
import com.google.gdata.data.calendar.*;
import com.google.gdata.data.extensions.*;

import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.List;
import java.util.ArrayList;

/**
 * Provides access methods to the Google Calendar Data API using the Google Java client
 * library:
 *
 *    (1) Retrieving the list of all the user's calendars;
 *    (2) Retrieving all events on a single calendar;
 *    (3) Performing a full-text query on a calendar;
 *    (4) Performing a date-range query on a calendar;
 *    (5) Creating single-occurrence and recurring events;
 *    (6) Updating events;
 *    (7) Adding reminders and extended properties;
 *    (8) Deleting events.
 */
public class CalendarClient {

  private String userName, userPassword, feedUri;
  private CalendarService cService; //Calendar service
  

  
  /**
   * Constructor with username, password and feedURI
   * @param username   Google Calendar username
   * @param password   Google Calendar password
   * @param feedURI    Google Calendar feedURI
   */
  public CalendarClient(String username, String password, String feedURI) {
	  userName = username;
	  userPassword = password;
	  feedUri = feedURI;
	  cService = new CalendarService("userName-CalendarApp-1");
	  try {
	        cService.setUserCredentials(userName, userPassword);
	  } catch (Exception e) {
	        e.printStackTrace();
	  }      
  }

  /**
   * Return a list of all the user's calendars.
   * 
   * @return List  A list of user calendars (String names)
   * @throws Exception If an error occurs during feed retrieval.
   */
  public List getUserCalendars() throws Exception {
    URL feedUrl = new URL("http://www.google.com/calendar/feeds/default");

    new CalendarFeed().declareExtensions(cService.getExtensionProfile());

    // Send the request and receive the response:
    CalendarFeed resultFeed = cService.getFeed(feedUrl, CalendarFeed.class);

    List<CalendarEntry> calendars = new ArrayList<CalendarEntry>();
    
    for (int i = 0; i < resultFeed.getEntries().size(); i++) {
      CalendarEntry entry = resultFeed.getEntries().get(i);
      calendars.add(entry);
    }
    
    return calendars;
  }


  
  /**
   * Returns a list of all titles of all events on the calendar specified by
   * {@code feedUri}.
   * 
   * @return List A list of all events in the Calendar
   * @throws Exception If an error occurs during feed retrieval.
   */
  public List getAllEvents() throws Exception {
	  
    // Set up the URL and the object that will handle the connection:
    URL feedUrl = new URL(feedUri);

    // Mark the feed as an Event feed:
    new EventFeed().declareExtensions(cService.getExtensionProfile());

    // Send the request and receive the response:
    CalendarEventFeed resultFeed = cService.getFeed(feedUrl,
        CalendarEventFeed.class);

    List<CalendarEventEntry> events = new ArrayList<CalendarEventEntry>();
    
    for (int i = 0; i < resultFeed.getEntries().size(); i++) {
      CalendarEventEntry entry = (CalendarEventEntry)
          resultFeed.getEntries().get(i);
      events.add(entry);
    }
    
    return events;
  }  
  
  /**
   * Returns a list of all events matching a full-text query.
   * 
   * @param query The text for which to query.
   * @return List A list of events matching the query
   * @throws Exception If an error occurs during feed retrieval.
   */
  public List fullTextQuery(String query)
      throws Exception {
    Query myQuery = new Query(new URL(feedUri));
    myQuery.setFullTextQuery(query);

    CalendarEventFeed resultFeed = cService.query(myQuery, CalendarEventFeed.class);

    List<CalendarEventEntry> events = new ArrayList<CalendarEventEntry>();
    
    for (int i = 0; i < resultFeed.getEntries().size(); i++) {
      CalendarEventEntry entry = (CalendarEventEntry)
          resultFeed.getEntries().get(i);
      
      events.add(entry);
    }
    
    return events;    
  }

  
  
  /**
   * Return a list of all events in a specified date/time range.
   * 
   * @param startTime Start time (inclusive) of events to print.
   * @param endTime End time (exclusive) of events to print.
   * @return List a list of events between the time interval
   * @throws Exception If an error occurs during feed retrieval.
   */
  public List dateRangeQuery(DateTime startTime, DateTime endTime) throws Exception {
    URL feedUrl = new URL(feedUri);

    CalendarQuery myQuery = new CalendarQuery(feedUrl);
    myQuery.setMinimumStartTime(startTime);
    myQuery.setMaximumStartTime(endTime);

    // Send the request and receive the response:
    CalendarEventFeed resultFeed = cService.query(myQuery,
        CalendarEventFeed.class);

    List<CalendarEventEntry> events = new ArrayList<CalendarEventEntry>();
    
    for (int i = 0; i < resultFeed.getEntries().size(); i++) {
      CalendarEventEntry entry = (CalendarEventEntry)
          resultFeed.getEntries().get(i);   
      events.add(entry);
    }
    return events;
  }  
  
 
  //TODO: Add methods which create XML or POSL facts from the Event data 
  //TODO: Add method to write fact to temp document which can be read by OO-jDrew
  //TODO: Add thread to continously update the temp document with the facts ???
  //      or find solution to trigger the CalendarClient from OO-jDrew at query time 
  
  public static void main(String[] args) {
        
    // Set username, password and feed URI from command-line arguments.
    if (args.length != 3) {
      System.err.println("Syntax: CalendarClient <username> <password>"
          + " <feed URI>");
      return;
    }
    
    CalendarClient cClient = new CalendarClient(args[0],args[1],args[2]);

    try {
  
    	//TODO: Insert Demonstration Code

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
