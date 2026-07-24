---
title: "System::Web::Services::Protocols::SoapDocumentMethodAttribute κλάση"
linktitle: "SoapDocumentMethodAttribute"
second_title: "Aspose.Page για C++"
description: "System::Web::Services::Protocols::SoapDocumentMethodAttribute κλάση. Καθορίζει ότι όλα τα μηνύματα SOAP που περνούν ή επιστρέφονται από τη μέθοδο χρησιμοποιούν τη μορφοποίηση Document. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε ένα αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.web.services.protocols/soapdocumentmethodattribute/
---
## SoapDocumentMethodAttribute class


Καθορίζει ότι όλα τα μηνύματα SOAP που περνούν ή επιστρέφονται από τη μέθοδο χρησιμοποιούν τη μορφοποίηση Document. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class SoapDocumentMethodAttribute : public System::Attribute
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Action](./get_action/)() | Πληροφορίες RTTI. |
| [get_Binding](./get_binding/)() | Επιστρέφει τη σύνδεση για την οποία μια μέθοδος υπηρεσίας ιστού XML υλοποιεί μια λειτουργία. |
| [get_OneWay](./get_oneway/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν ο πελάτης δεν περιμένει ο διακομιστής να ολοκληρώσει την επεξεργασία μιας μεθόδου. |
| [get_ParameterStyle](./get_parameterstyle/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν οι παράμετροι είναι ενσωματωμένες μέσα σε ένα μοναδικό στοιχείο XML κάτω από το στοιχείο 'Body'. |
| [get_RequestElementName](./get_requestelementname/)() | Επιστρέφει το όνομα του στοιχείου XML που σχετίζεται με το αίτημα SOAP, το οποίο ορίζεται σε περιγραφή υπηρεσίας ως λειτουργία. |
| [get_RequestNamespace](./get_requestnamespace/)() | Λαμβάνει το χώρο ονομάτων που σχετίζεται με το αίτημα SOAP. |
| [get_ResponseElementName](./get_responseelementname/)() | Λαμβάνει το όνομα του στοιχείου XML που σχετίζεται με την απόκριση SOAP. |
| [get_ResponseNamespace](./get_responsenamespace/)() | Λαμβάνει το χώρο ονομάτων που σχετίζεται με την απόκριση SOAP. |
| [get_Use](./get_use/)() | Λαμβάνει μια τιμή που καθορίζει τη μέθοδο κωδικοποίησης του μηνύματος. |
| [set_Action](./set_action/)(String) | Ορίζει μια τιμή του χαρακτηριστικού 'SOAPAction'. |
| [set_Binding](./set_binding/)(String) | Ορίζει τη σύνδεση για την οποία μια μέθοδος υπηρεσίας ιστού XML υλοποιεί μια λειτουργία. |
| [set_OneWay](./set_oneway/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν ο πελάτης δεν περιμένει τον διακομιστή να ολοκληρώσει την επεξεργασία μιας μεθόδου. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Ορίζει μια τιμή που υποδεικνύει εάν οι παράμετροι είναι ενσωματωμένες μέσα σε ένα ενιαίο στοιχείο XML κάτω από το στοιχείο 'Body'. |
| [set_RequestElementName](./set_requestelementname/)(String) | Ορίζει το όνομα του στοιχείου XML που σχετίζεται με το αίτημα SOAP, το οποίο ορίζεται σε μια περιγραφή υπηρεσίας ως λειτουργία. |
| [set_RequestNamespace](./set_requestnamespace/)(String) | Ορίζει το χώρο ονομάτων που σχετίζεται με το αίτημα SOAP. |
| [set_ResponseElementName](./set_responseelementname/)(String) | Ορίζει το όνομα του στοιχείου XML που σχετίζεται με την απόκριση SOAP. |
| [set_ResponseNamespace](./set_responsenamespace/)(String) | Ορίζει το χώρο ονομάτων που σχετίζεται με την απόκριση SOAP. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Ορίζει μια τιμή που καθορίζει τη μέθοδο κωδικοποίησης του μηνύματος. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)() | Δημιουργεί μια νέα παρουσία. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)(String) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
