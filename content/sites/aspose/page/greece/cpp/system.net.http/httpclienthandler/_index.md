---
title: "System::Net::Http::HttpClientHandler class"
linktitle: "HttpClientHandler"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::HttpClientHandler class. Αντιπροσωπεύει τον προεπιλεγμένο διαχειριστή μηνυμάτων που χρησιμοποιείται από την κλάση HttpClient. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 300
url: /el/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


Αντιπροσωπεύει τον προεπιλεγμένο διαχειριστή μηνυμάτων που χρησιμοποιείται από την κλάση [HttpClient](../httpclient/). Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Dispose](./dispose/)() override | Δεν κάνει τίποτα. |
| [get_CookieContainer](./get_cookiecontainer/)() | Λαμβάνει το δοχείο cookie που χρησιμοποιείται για την αποθήκευση των cookie του διακομιστή. |
| [get_Credentials](./get_credentials/)() | Λαμβάνει τις πληροφορίες ταυτοποίησης. |
| [HttpClientHandler](./httpclienthandler/)() | Πληροφορίες RTTI. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | Πληροφορίες RTTI. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Ορίζει το δοχείο cookie που χρησιμοποιείται για την αποθήκευση των cookie του διακομιστή. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Ορίζει τις πληροφορίες ταυτοποίησης. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Ορίζει τις πληροφορίες του διαμεσολαβητή. |
| [set_Timeout](./set_timeout/)(int32_t) | Λαμβάνει μια διάρκεια χρόνου σε χιλιοστά του δευτερολέπτου μετά την οποία το αίτημα θα λήξει. |
| [set_UseCookies](./set_usecookies/)(bool) | Ορίζει την τιμή που υποδεικνύει εάν η τρέχουσα παρουσία χρησιμοποιεί το δοχείο cookie για την αποθήκευση των cookie του διακομιστή και εάν η παρουσία χρησιμοποιεί τα cookie του διακομιστή κατά την αποστολή αιτημάτων. |
| [set_UseProxy](./set_useproxy/)(bool) | Ορίζει την τιμή που υποδεικνύει εάν η τρέχουσα παρουσία χρησιμοποιεί τον διακομιστή μεσολάβησης για την αποστολή αιτημάτων. |
## Δείτε επίσης

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
