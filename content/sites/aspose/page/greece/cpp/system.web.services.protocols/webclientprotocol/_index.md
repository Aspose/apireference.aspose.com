---
title: "Κλάση System::Web::Services::Protocols::WebClientProtocol"
linktitle: "WebClientProtocol"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Web::Services::Protocols::WebClientProtocol. Αυτή η βασική κλάση χρησιμοποιείται σε όλα τα διαμεσολαβητές πελατών υπηρεσιών XML Web που δημιουργήθηκαν χρησιμοποιώντας το ASP.NET. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως παράμετρο σε C++."
type: docs
weight: 1100
url: /el/cpp/system.web.services.protocols/webclientprotocol/
---
## WebClientProtocol class


Αυτή η βασική κλάση χρησιμοποιείται σε όλα τα διαμεσολαβητές πελατών υπηρεσιών XML [Web](../../system.web/) που δημιουργήθηκαν χρησιμοποιώντας το ASP.NET. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως παράμετρο.

```cpp
class WebClientProtocol : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Abort](./abort/)() | Ακυρώνει το αίτημα. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() | Λαμβάνει το όνομα της ομάδας σύνδεσης. |
| [get_Credentials](./get_credentials/)() | Λαμβάνει τις πληροφορίες ταυτοποίησης. |
| [get_PreAuthenticate](./get_preauthenticate/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν η προ-επαλήθευση είναι ενεργοποιημένη. |
| [get_RequestEncoding](./get_requestencoding/)() | Λαμβάνει την κωδικοποίηση που χρησιμοποιείται για τη δημιουργία των αιτημάτων του πελάτη. |
| [get_Timeout](./get_timeout/)() | Λαμβάνει το χρονικό διάστημα αναμονής πριν λήξει η αίτηση. |
| [get_Uri](./get_uri/)() | Λαμβάνει το URI της υπηρεσίας XML [Web](../../system.web/). |
| [get_Url](./get_url/)() | Λαμβάνει το URL της υπηρεσίας XML [Web](../../system.web/). |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν η ιδιότητα 'Credential' είναι ίση με την ιδιότητα 'DefaultCredentials'. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(String) | Ορίζει το όνομα της ομάδας σύνδεσης. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<Net::ICredentials\>) | Ορίζει τις πληροφορίες ταυτοποίησης. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν η προ-επαλήθευση είναι ενεργοποιημένη. |
| [set_RequestEncoding](./set_requestencoding/)(System::SharedPtr\<Text::Encoding\>) | Ορίζει την κωδικοποίηση που χρησιμοποιείται για τη δημιουργία των αιτημάτων του πελάτη. |
| [set_Timeout](./set_timeout/)(int32_t) | Ορίζει το χρονικό διάστημα αναμονής πριν λήξει η αίτηση. |
| [set_Uri](./set_uri/)(System::SharedPtr\<Uri\>) | Ορίζει το URI της υπηρεσίας XML [Web](../../system.web/). |
| [set_Url](./set_url/)(String) | Ορίζει τη διεύθυνση URL της υπηρεσίας XML [Web](../../system.web/). |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν η ιδιότητα 'Credential' είναι ίση με την ιδιότητα 'DefaultCredentials'. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
