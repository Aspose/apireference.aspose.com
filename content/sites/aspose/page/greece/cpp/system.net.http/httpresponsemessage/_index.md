---
title: "System::Net::Http::HttpResponseMessage κλάση"
linktitle: "HttpResponseMessage"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::HttpResponseMessage κλάση. Αντιπροσωπεύει ένα μήνυμα απόκρισης HTTP. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 900
url: /el/cpp/system.net.http/httpresponsemessage/
---
## HttpResponseMessage class


Αντιπροσωπεύει ένα μήνυμα απόκρισης HTTP. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class HttpResponseMessage : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Dispose](./dispose/)() override | Αποδεσμεύει την τρέχουσα παρουσία. Αυτή η μέθοδος αποδεσμεύει επίσης το περιεχόμενο της απόκρισης HTTP. |
| [EnsureSuccessStatusCode](./ensuresuccessstatuscode/)() | Ελέγχει τον κωδικό κατάστασης. Το [HttpRequestException](../httprequestexception/) θα εξαχθεί όταν ο κωδικός κατάστασης δεν ανήκει στο 2xx. |
| [get_Content](./get_content/)() const | Λαμβάνει το περιεχόμενο της απόκρισης HTTP. |
| [get_Headers](./get_headers/)() const | Επιστρέφει τις κεφαλίδες περιεχομένου HTTP. |
| [get_IsSuccessStatusCode](./get_issuccessstatuscode/)() const | Ελέγχει εάν ο κωδικός κατάστασης υποδεικνύει ότι η ενέργεια που ζήτησε ο πελάτης ελήφθη, κατανοήθηκε και έγινε αποδεκτή. |
| [get_ReasonPhrase](./get_reasonphrase/)() const | Λαμβάνει τη φράση Reason-Phrase που αποστέλλεται από τους διακομιστές μαζί με τον κωδικό κατάστασης. |
| [get_RequestMessage](./get_requestmessage/)() const | Λαμβάνει το μήνυμα αίτησης HTTP. |
| [get_StatusCode](./get_statuscode/)() const | Λαμβάνει τον κωδικό κατάστασης HTTP. |
| [get_Version](./get_version/)() const | Πληροφορίες RTTI. |
| [HttpResponseMessage](./httpresponsemessage/)() | Δημιουργεί μια νέα παρουσία. |
| [HttpResponseMessage](./httpresponsemessage/)(HttpStatusCode) | Δημιουργεί μια νέα παρουσία. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Ορίζει το περιεχόμενο της απόκρισης HTTP. |
| [set_ReasonPhrase](./set_reasonphrase/)(String) | Ορίζει τη φράση Reason-Phrase που αποστέλλεται από τους διακομιστές μαζί με τον κωδικό κατάστασης. |
| [set_RequestMessage](./set_requestmessage/)(System::SharedPtr\<HttpRequestMessage\>) | Ορίζει το μήνυμα αίτησης HTTP. |
| [set_StatusCode](./set_statuscode/)(HttpStatusCode) | Ορίζει τον κωδικό κατάστασης HTTP. |
| [set_Version](./set_version/)(System::Version) | Ορίζει την έκδοση του HTTP. |
| [ToString](./tostring/)() const override | [System::Object::ToString](../../system/object/tostring/). |
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
