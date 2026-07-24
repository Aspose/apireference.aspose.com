---
title: "System::Web::Services::Protocols::SoapHttpClientProtocol κλάση"
linktitle: "SoapHttpClientProtocol"
second_title: "Aspose.Page για C++"
description: "System::Web::Services::Protocols::SoapHttpClientProtocol κλάση. Οι υπηρεσίες διαμεσολαβητή πελάτη πρέπει να κληρονομούν αυτήν την κλάση όταν χρησιμοποιείται το SOAP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 900
url: /el/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


Οι υπηρεσίες διαμεσολαβητή πελάτη πρέπει να κληρονομούν αυτήν την κλάση όταν χρησιμοποιείται το SOAP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Discover](./discover/)() | Συνδέει το τρέχον στιγμιότυπο με την υπηρεσία XML [Web](../../system.web/). |
| [get_SoapVersion](./get_soapversion/)() | Λαμβάνει την έκδοση του SOAP. |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | Αρχικοποιεί τα εσωτερικά πεδία. |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | Ορίζει την έκδοση του SOAP. |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
