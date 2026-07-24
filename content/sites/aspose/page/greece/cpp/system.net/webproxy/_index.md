---
title: "System::Net::WebProxy κλάση"
linktitle: "WebProxy"
second_title: "Aspose.Page για C++"
description: "System::Net::WebProxy κλάση. Αντιπροσωπεύει έναν διακομιστή http web-proxy. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα αντίτυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3700
url: /el/cpp/system.net/webproxy/
---
## WebProxy class


Αντιπροσωπεύει έναν διακομιστή http web-proxy. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα αντίτυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class WebProxy : public System::Net::IWebProxy
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Address](./get_address/)() | Λαμβάνει τη διεύθυνση του τρέχοντος διακομιστή proxy. |
| [get_BypassList](./get_bypasslist/)() | Λαμβάνει τη λίστα των διευθύνσεων που δεν χρησιμοποιούν τον διακομιστή proxy. |
| [get_BypassProxyOnLocal](./get_bypassproxyonlocal/)() | Λαμβάνει μια τιμή που υποδεικνύει αν ο διακομιστής proxy πρέπει να χρησιμοποιείται για τοπικές διευθύνσεις. |
| virtual [get_Credentials](./get_credentials/)() | Λαμβάνει τα διαπιστευτήρια που αποστέλλονται στον διακομιστή proxy για έλεγχο ταυτότητας. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Λαμβάνει μια τιμή που υποδεικνύει αν τα προεπιλεγμένα διαπιστευτήρια πρέπει να αποστέλλονται με τα αιτήματα. |
| static [GetDefaultProxy](./getdefaultproxy/)() | Επιστρέφει τον proxy που χρησιμοποιεί τις μη-δυναμικές ρυθμίσεις του Internet Explorer. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Επιστρέφει το URI μέσω proxy για ένα web αίτημα. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Ελέγχει αν ο διακομιστής proxy δεν χρησιμοποιείται για το καθορισμένο URI. |
| [set_Address](./set_address/)(System::SharedPtr\<Uri\>) | Ορίζει τη διεύθυνση του τρέχοντος διακομιστή proxy. |
| [set_BypassList](./set_bypasslist/)(System::ArrayPtr\<String\>) | Ορίζει τη λίστα των διευθύνσεων που δεν χρησιμοποιούν τον διακομιστή μεσολάβησης. |
| [set_BypassProxyOnLocal](./set_bypassproxyonlocal/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν ο διακομιστής μεσολάβησης πρέπει να χρησιμοποιείται για τοπικές διευθύνσεις. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Ορίζει τα διαπιστευτήρια που αποστέλλονται στον διακομιστή μεσολάβησης για έλεγχο ταυτότητας. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν τα προεπιλεγμένα διαπιστευτήρια πρέπει να αποστέλλονται με τα αιτήματα. |
| [WebProxy](./webproxy/)() | Δημιουργεί μια νέα παρουσία. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>) | Δημιουργεί μια νέα παρουσία. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool) | Δημιουργεί μια νέα παρουσία. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>) | Δημιουργεί μια νέα παρουσία. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Δημιουργεί μια νέα παρουσία. |
| [WebProxy](./webproxy/)(String, int32_t) | Δημιουργεί μια νέα παρουσία. |
| [WebProxy](./webproxy/)(String) | Δημιουργεί μια νέα παρουσία. |
| [WebProxy](./webproxy/)(String, bool) | Δημιουργεί μια νέα παρουσία. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>) | Δημιουργεί μια νέα παρουσία. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [IWebProxy](../iwebproxy/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
