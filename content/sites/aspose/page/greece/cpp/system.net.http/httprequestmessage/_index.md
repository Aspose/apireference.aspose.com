---
title: "System::Net::Http::HttpRequestMessage class"
linktitle: "HttpRequestMessage"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::HttpRequestMessage class. Αντιπροσωπεύει ένα μήνυμα HTTP αίτησης. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 800
url: /el/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


Αντιπροσωπεύει ένα μήνυμα HTTP αίτησης. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class HttpRequestMessage : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Dispose](./dispose/)() override | Αποδεσμεύει το τρέχον στιγμιότυπο. Αυτή η μέθοδος αποδεσμεύει επίσης το περιεχόμενο του HTTP αιτήματος. |
| [get_Content](./get_content/)() | Αποκτά το περιεχόμενο του HTTP αιτήματος. |
| [get_Headers](./get_headers/)() | Επιστρέφει τις κεφαλίδες περιεχομένου HTTP. |
| [get_Method](./get_method/)() | Λαμβάνει τη μέθοδο του HTTP αιτήματος. |
| [get_Properties](./get_properties/)() | Επιστρέφει τη συλλογή των ιδιοτήτων του HTTP αιτήματος. |
| [get_RequestUri](./get_requesturi/)() | Λαμβάνει το URI του ζητούμενου πόρου. |
| [get_Version](./get_version/)() | Πληροφορίες RTTI. |
| [HttpRequestMessage](./httprequestmessage/)() | Δημιουργεί μια νέα παρουσία. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | Δημιουργεί μια νέα παρουσία. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | Δημιουργεί μια νέα παρουσία. |
| [MarkAsSent](./markassent/)() | Σημαδεύει το τρέχον αίτημα ως αποσταλμένο. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Ορίζει το περιεχόμενο του HTTP αιτήματος. |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | Ορίζει τη μέθοδο του HTTP αιτήματος. |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | Ορίζει το URI του ζητούμενου πόρου. |
| [set_Version](./set_version/)(System::Version) | Ορίζει την έκδοση του HTTP. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
