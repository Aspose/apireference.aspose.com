---
title: "Κλάση System::Net::Http::Headers::HttpResponseHeaders"
linktitle: "HttpResponseHeaders"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Net::Http::Headers::HttpResponseHeaders. Αντιπροσωπεύει τη συλλογή των κεφαλίδων ''Response''. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1100
url: /el/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


Αντιπροσωπεύει τη συλλογή των κεφαλίδων 'Response'. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Συνενώνει την καθορισμένη παρουσία της κλάσης HttpHeaders με την τρέχουσα. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Προσθέτει τις γνωστές κεφαλίδες στη καθορισμένη συλλογή. |
| [get_AcceptRanges](./get_acceptranges/)() | Πληροφορίες RTTI. |
| [get_Age](./get_age/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Age'. |
| [get_CacheControl](./get_cachecontrol/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Cache-Control'. |
| [get_Connection](./get_connection/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Connection'. |
| [get_ConnectionClose](./get_connectionclose/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν η τιμή της κεφαλίδας 'Connection' περιέχει το 'Close'. |
| [get_Date](./get_date/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Date'. |
| [get_ETag](./get_etag/)() | Λαμβάνει μια τιμή της κεφαλίδας 'ETag'. |
| [get_Location](./get_location/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Location'. |
| [get_Pragma](./get_pragma/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Pragma'. |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Proxy-Authenticate'. |
| [get_RetryAfter](./get_retryafter/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Retry-After'. |
| [get_Server](./get_server/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Server'. |
| [get_Trailer](./get_trailer/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Trailer'. |
| [get_TransferEncoding](./get_transferencoding/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Transfer-Encoding'. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Λαμβάνει μια τιμή που υποδεικνύει αν η τιμή της κεφαλίδας 'Transfer-Encoding' περιέχει το 'Chunked'. |
| [get_Upgrade](./get_upgrade/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Upgrade'. |
| [get_Vary](./get_vary/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Vary'. |
| [get_Via](./get_via/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Via'. |
| [get_Warning](./get_warning/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Warning'. |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | Επιστρέφει μια τιμή της κεφαλίδας 'WWW-Authenticate'. |
| [HttpResponseHeaders](./httpresponseheaders/)() | Δημιουργεί μια νέα παρουσία. |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | Ορίζει μια τιμή για την κεφαλίδα 'Age'. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Ορίζει μια τιμή της κεφαλίδας 'Cache-Control'. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Ορίζει μια τιμή που υποδεικνύει αν η τιμή της κεφαλίδας 'Connection' περιέχει το 'Close'. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Ορίζει μια τιμή της κεφαλίδας 'Date'. |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | Ορίζει μια τιμή για την κεφαλίδα 'ETag'. |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | Ορίζει μια τιμή για την κεφαλίδα 'Location'. |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | Ορίζει μια τιμή για την κεφαλίδα 'Retry-After'. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Ορίζει μια τιμή που υποδεικνύει αν η τιμή της κεφαλίδας 'Transfer-Encoding' περιέχει το 'Chunked'. |
## Δείτε επίσης

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
