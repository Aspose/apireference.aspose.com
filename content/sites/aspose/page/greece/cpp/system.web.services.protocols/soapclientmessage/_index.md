---
title: "Κλάση System::Web::Services::Protocols::SoapClientMessage"
linktitle: "SoapClientMessage"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Web::Services::Protocols::SoapClientMessage. Αντιπροσωπεύει τα δεδομένα σε ένα αίτημα SOAP που αποστέλλεται ή σε μια απάντηση SOAP που λαμβάνεται. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως παράμετρο σε C++."
type: docs
weight: 300
url: /el/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


Αντιπροσωπεύει τα δεδομένα σε ένα αίτημα SOAP που αποστέλλεται ή σε μια απάντηση SOAP που λαμβάνεται. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως παράμετρο.

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Action](./get_action/)() override | Επιστρέφει μια τιμή του χαρακτηριστικού 'SOAPAction'. |
| [get_Client](./get_client/)() | Επιστρέφει ένα στιγμιότυπο της κλάσης διαμεσολαβητή πελάτη. |
| virtual [get_OneWay](./get_oneway/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν ο πελάτης δεν περιμένει τον διακομιστή να ολοκληρώσει την επεξεργασία μιας μεθόδου. |
| [get_SoapVersion](./get_soapversion/)() override | Επιστρέφει την έκδοση του SOAP που χρησιμοποιείται. |
| [get_Url](./get_url/)() override | Επιστρέφει το URL της υπηρεσίας XML [Web](../../system.web/). |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
