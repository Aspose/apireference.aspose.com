---
title: "Κλάση System::Web::Services::Protocols::SoapDocumentServiceAttribute"
linktitle: "SoapDocumentServiceAttribute"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Web::Services::Protocols::SoapDocumentServiceAttribute. Ορίζει τη προεπιλεγμένη μορφή για τα αιτήματα SOAP και τις απαντήσεις. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως παράμετρο σε C++."
type: docs
weight: 500
url: /el/cpp/system.web.services.protocols/soapdocumentserviceattribute/
---
## SoapDocumentServiceAttribute class


Ορίζει τη προεπιλεγμένη μορφή για τα αιτήματα SOAP και τις απαντήσεις. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως παράμετρο.

```cpp
class SoapDocumentServiceAttribute : public System::Attribute
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_ParameterStyle](./get_parameterstyle/)() | Πληροφορίες RTTI. |
| [get_RoutingStyle](./get_routingstyle/)() | Λαμβάνει μια τιμή που δείχνει πώς δρομολογούνται τα μηνύματα SOAP στην υπηρεσία. |
| [get_Use](./get_use/)() | Λαμβάνει τη μορφοποίηση των παραμέτρων. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Ορίζει μια τιμή που υποδεικνύει εάν οι παράμετροι είναι ενσωματωμένες μέσα σε ένα ενιαίο στοιχείο XML κάτω από το στοιχείο 'Body'. |
| [set_RoutingStyle](./set_routingstyle/)(SoapServiceRoutingStyle) | Ορίζει μια τιμή που δείχνει πώς δρομολογούνται τα μηνύματα SOAP στην υπηρεσία. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Ορίζει τη μορφοποίηση των παραμέτρων. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)() | Δημιουργεί μια νέα παρουσία. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse) | Δημιουργεί μια νέα παρουσία. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse, SoapParameterStyle) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
