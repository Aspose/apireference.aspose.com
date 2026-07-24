---
title: "System::Net::Http::HttpClient κλάση"
linktitle: "HttpClient"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::HttpClient κλάση. Αντιπροσωπεύει μια βασική κλάση ενός πελάτη HTTP για αποστολή αιτήσεων και λήψη απαντήσεων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 200
url: /el/cpp/system.net.http/httpclient/
---
## HttpClient class


Αντιπροσωπεύει μια βασική κλάση ενός πελάτη HTTP για αποστολή αιτήσεων και λήψη απαντήσεων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class HttpClient : public System::Net::Http::HttpMessageInvoker
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CancelPendingRequests](./cancelpendingrequests/)() | Ακυρώνει όλα τα εκκρεμή αιτήματα. |
| [get_BaseAddress](./get_baseaddress/)() | Λαμβάνει τη βασική διεύθυνση του πόρου που χρησιμοποιείται για την αποστολή αιτήσεων. |
| [get_DefaultRequestHeaders](./get_defaultrequestheaders/)() | Πληροφορίες RTTI. |
| [get_MaxResponseContentBufferSize](./get_maxresponsecontentbuffersize/)() | Λαμβάνει το μέγιστο αριθμό byte του περιεχομένου της απάντησης. |
| [get_Timeout](./get_timeout/)() | Λαμβάνει το χρονικό διάστημα αναμονής πριν λήξει η αίτηση. |
| [HttpClient](./httpclient/)() | Δημιουργεί μια νέα παρουσία. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>) | Δημιουργεί μια νέα παρουσία. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Δημιουργεί μια νέα παρουσία. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>, HttpCompletionOption) | Αποστέλλει την καθορισμένη αίτηση HTTP. |
| [set_BaseAddress](./set_baseaddress/)(System::SharedPtr\<Uri\>) | Ορίζει τη βασική διεύθυνση του πόρου που χρησιμοποιείται για την αποστολή αιτημάτων. |
| [set_MaxResponseContentBufferSize](./set_maxresponsecontentbuffersize/)(int64_t) | Ορίζει το μέγιστο αριθμό byte του περιεχομένου της απάντησης. |
| [set_Timeout](./set_timeout/)(TimeSpan) | Ορίζει το χρονικό διάστημα αναμονής πριν λήξει η αίτηση. |
## Δείτε επίσης

* Class [HttpMessageInvoker](../httpmessageinvoker/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
