---
title: "System::Web::Services::Protocols::SoapHeader class"
linktitle: "SoapHeader"
second_title: "Aspose.Page για C++"
description: "System::Web::Services::Protocols::SoapHeader class. Αναπαριστά το περιεχόμενο της κεφαλίδας SOAP. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 600
url: /el/cpp/system.web.services.protocols/soapheader/
---
## SoapHeader class


Αντιπροσωπεύει το περιεχόμενο της κεφαλίδας SOAP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class SoapHeader : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Actor](./get_actor/)() | Επιστρέφει το URI του παραλήπτη της κεφαλίδας SOAP όταν χρησιμοποιείται η έκδοση 1.1 του SOAP. |
| [get_DidUnderstand](./get_didunderstand/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η κεφαλίδα SOAP έχει επεξεργαστεί σωστά. |
| [get_EncodedMustUnderstand](./get_encodedmustunderstand/)() | Επιστρέφει μια τιμή του χαρακτηριστικού 'mustUnderstand' όταν χρησιμοποιείται η έκδοση 1.1 του SOAP. |
| [get_EncodedMustUnderstand12](./get_encodedmustunderstand12/)() | Επιστρέφει μια τιμή του χαρακτηριστικού 'mustUnderstand' όταν χρησιμοποιείται η έκδοση 1.2 του SOAP. |
| [get_EncodedRelay](./get_encodedrelay/)() | Επιστρέφει μια συμβολοσειρά που αντιπροσωπεύει την τιμή του χαρακτηριστικού 'relay'. |
| [get_MustUnderstand](./get_mustunderstand/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η κεφαλίδα SOAP πρέπει να γίνει κατανοητή. |
| [get_Relay](./get_relay/)() | Επιστρέφει μια τιμή του χαρακτηριστικού 'relay'. |
| [get_Role](./get_role/)() | Επιστρέφει το URI του παραλήπτη της κεφαλίδας SOAP όταν χρησιμοποιείται η έκδοση 1.2 του SOAP. |
| [set_Actor](./set_actor/)(String) | Ορίζει το URI του παραλήπτη της κεφαλίδας SOAP όταν χρησιμοποιείται η έκδοση 1.1 του SOAP. |
| [set_DidUnderstand](./set_didunderstand/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν η κεφαλίδα SOAP έχει επεξεργαστεί σωστά. |
| [set_EncodedMustUnderstand](./set_encodedmustunderstand/)(String) | Ορίζει μια τιμή του χαρακτηριστικού 'mustUnderstand' όταν χρησιμοποιείται η έκδοση 1.1 του SOAP. |
| [set_EncodedMustUnderstand12](./set_encodedmustunderstand12/)(String) | Ορίζει μια τιμή του χαρακτηριστικού 'mustUnderstand' όταν χρησιμοποιείται η έκδοση 1.2 του SOAP. |
| [set_EncodedRelay](./set_encodedrelay/)(String) | Ορίζει μια συμβολοσειρά που αντιπροσωπεύει την τιμή του χαρακτηριστικού 'relay'. |
| [set_MustUnderstand](./set_mustunderstand/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν η κεφαλίδα SOAP πρέπει να γίνει κατανοητή. |
| [set_Relay](./set_relay/)(bool) | Ορίζει μια τιμή του χαρακτηριστικού 'relay'. |
| [set_Role](./set_role/)(String) | Ορίζει το URI του παραλήπτη της κεφαλίδας SOAP όταν χρησιμοποιείται η έκδοση 1.2 του SOAP. |
| [SoapHeader](./soapheader/)(System::SharedPtr\<Xml::XmlElement\>) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
