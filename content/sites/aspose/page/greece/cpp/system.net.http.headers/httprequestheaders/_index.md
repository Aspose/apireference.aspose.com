---
title: "Κλάση System::Net::Http::Headers::HttpRequestHeaders"
linktitle: "HttpRequestHeaders"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Net::Http::Headers::HttpRequestHeaders. Αντιπροσωπεύει τη συλλογή των κεφαλίδων ''Request''. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή με τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1000
url: /el/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


Αντιπροσωπεύει τη συλλογή των κεφαλίδων 'Request'. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή με τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Συνενώνει την καθορισμένη παρουσία της κλάσης HttpHeaders με την τρέχουσα. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Προσθέτει τις γνωστές κεφαλίδες στη καθορισμένη συλλογή. |
| [get_Accept](./get_accept/)() | Πληροφορίες RTTI. |
| [get_AcceptCharset](./get_acceptcharset/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Accept-Charset'. |
| [get_AcceptEncoding](./get_acceptencoding/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Accept-Encoding'. |
| [get_AcceptLanguage](./get_acceptlanguage/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Accept-Language'. |
| [get_Authorization](./get_authorization/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Authorization'. |
| [get_CacheControl](./get_cachecontrol/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Cache-Control'. |
| [get_Connection](./get_connection/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Connection'. |
| [get_ConnectionClose](./get_connectionclose/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν η τιμή της κεφαλίδας 'Connection' περιέχει το 'Close'. |
| [get_Date](./get_date/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Date'. |
| [get_Expect](./get_expect/)() | Επιστρέφει την τιμή της κεφαλίδας 'Expect'. |
| [get_ExpectContinue](./get_expectcontinue/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν η τιμή της κεφαλίδας 'Expect' περιέχει το 'Continue'. |
| [get_From](./get_from/)() | Λαμβάνει μια τιμή της κεφαλίδας 'From'. |
| [get_Host](./get_host/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Host'. |
| [get_IfMatch](./get_ifmatch/)() | Επιστρέφει μια τιμή της κεφαλίδας 'If-Match'. |
| [get_IfModifiedSince](./get_ifmodifiedsince/)() | Λαμβάνει μια τιμή της κεφαλίδας 'If-Modified-Since'. |
| [get_IfNoneMatch](./get_ifnonematch/)() | Επιστρέφει μια τιμή της κεφαλίδας 'If-None-Match'. |
| [get_IfRange](./get_ifrange/)() | Λαμβάνει μια τιμή της κεφαλίδας 'If-Range'. |
| [get_IfUnmodifiedSince](./get_ifunmodifiedsince/)() | Λαμβάνει μια τιμή της κεφαλίδας 'If-Unmodified-Since'. |
| [get_MaxForwards](./get_maxforwards/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Max-Forwards'. |
| [get_Pragma](./get_pragma/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Pragma'. |
| [get_ProxyAuthorization](./get_proxyauthorization/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Proxy-Authorization'. |
| [get_Range](./get_range/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Range'. |
| [get_Referrer](./get_referrer/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Referer'. |
| [get_TE](./get_te/)() | Επιστρέφει μια τιμή της κεφαλίδας 'TE'. |
| [get_Trailer](./get_trailer/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Trailer'. |
| [get_TransferEncoding](./get_transferencoding/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Transfer-Encoding'. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Λαμβάνει μια τιμή που υποδεικνύει αν η τιμή της κεφαλίδας 'Transfer-Encoding' περιέχει το 'Chunked'. |
| [get_Upgrade](./get_upgrade/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Upgrade'. |
| [get_UserAgent](./get_useragent/)() | Επιστρέφει μια τιμή της κεφαλίδας 'User-Agent'. |
| [get_Via](./get_via/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Via'. |
| [get_Warning](./get_warning/)() | Επιστρέφει μια τιμή της κεφαλίδας 'Warning'. |
| [HttpRequestHeaders](./httprequestheaders/)() | Δημιουργεί μια νέα παρουσία. |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Ορίζει μια τιμή της κεφαλίδας 'Authorization'. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Ορίζει μια τιμή της κεφαλίδας 'Cache-Control'. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Ορίζει μια τιμή που υποδεικνύει αν η τιμή της κεφαλίδας 'Connection' περιέχει το 'Close'. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Ορίζει μια τιμή της κεφαλίδας 'Date'. |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | Ορίζει μια τιμή που υποδεικνύει αν η τιμή της κεφαλίδας 'Expect' περιέχει το 'Continue'. |
| [set_From](./set_from/)(String) | Ορίζει μια τιμή της κεφαλίδας 'From'. |
| [set_Host](./set_host/)(String) | Ορίζει μια τιμή της κεφαλίδας 'Host'. |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | Ορίζει μια τιμή της κεφαλίδας 'If-Modified-Since'. |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | Ορίζει μια τιμή της κεφαλίδας 'If-Range'. |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | Ορίζει μια τιμή της κεφαλίδας 'If-Unmodified-Since'. |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | Ορίζει μια τιμή της κεφαλίδας 'Max-Forwards'. |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Ορίζει μια τιμή της κεφαλίδας 'Proxy-Authorization'. |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | Ορίζει μια τιμή της κεφαλίδας 'Range'. |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | Ορίζει μια τιμή της κεφαλίδας 'Referer'. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Ορίζει μια τιμή που υποδεικνύει αν η τιμή της κεφαλίδας 'Transfer-Encoding' περιέχει το 'Chunked'. |
## Δείτε επίσης

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
