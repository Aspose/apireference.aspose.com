---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension κλάση"
linktitle: "X509KeyUsageExtension"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension κλάση. Αντικείμενο επέκτασης για τη διατήρηση πρόσθετων πληροφοριών σχετικά με τη χρήση ενός κλειδιού. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας operator new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1600
url: /el/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


Αντικείμενο επέκτασης για τη διατήρηση πρόσθετων πληροφοριών σχετικά με τη χρήση ενός κλειδιού. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας operator new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Αντιγράφει δεδομένα επέκτασης από άλλο αντικείμενο. |
| [get_KeyUsages](./get_keyusages/)() | Λαμβάνει χρήσεις κλειδιού. |
| [X509KeyUsageExtension](./x509keyusageextension/)() | Πληροφορίες RTTI. |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Κατασκευαστής. |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | Κατασκευαστής. |
## Δείτε επίσης

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
