---
title: "System::Security::Cryptography::X509Certificates::X509Extension κλάση"
linktitle: "X509Extension"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::X509Certificates::X509Extension κλάση. Αντικείμενο επέκτασης για τη διατήρηση πρόσθετων πληροφοριών που σχετίζονται με το πιστοποιητικό X.509. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1200
url: /el/cpp/system.security.cryptography.x509certificates/x509extension/
---
## X509Extension class


Αντικείμενο επέκτασης για τη διατήρηση πρόσθετων πληροφοριών που σχετίζονται με το πιστοποιητικό X.509. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class X509Extension : public System::Security::Cryptography::AsnEncodedData
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Αντιγράφει δεδομένα επέκτασης από άλλο αντικείμενο. |
| [get_Critical](./get_critical/)() const | Ελέγχει εάν η επέκταση είναι κρίσιμη. |
| [set_Critical](./set_critical/)(bool) | Ορίζει εάν η επέκταση είναι κρίσιμη. |
| [X509Extension](./x509extension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Πληροφορίες RTTI. |
| [X509Extension](./x509extension/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&, bool) | Κατασκευαστής. |
| [X509Extension](./x509extension/)(const String\&, const ByteArrayPtr\&, bool) | Κατασκευαστής. |
## Δείτε επίσης

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
