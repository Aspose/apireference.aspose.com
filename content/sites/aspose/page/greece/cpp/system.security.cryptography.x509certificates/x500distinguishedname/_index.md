---
title: "System::Security::Cryptography::X509Certificates::X500DistinguishedName κλάση"
linktitle: "X500DistinguishedName"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::X509Certificates::X500DistinguishedName κλάση. Αντιπροσωπεύει το διακεκριμένο όνομα του πιστοποιητικού X509. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 200
url: /el/cpp/system.security.cryptography.x509certificates/x500distinguishedname/
---
## X500DistinguishedName class


Αντιπροσωπεύει το διακεκριμένο όνομα του πιστοποιητικού X509. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class X500DistinguishedName : public System::Security::Cryptography::AsnEncodedData
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Decode](./decode/)(X500DistinguishedNameFlags) const | Αποκωδικοποιεί το όνομα χρησιμοποιώντας τις παραμέτρους που καθορίζονται από σημαίες. |
| [Format](./format/)(bool) const override | Μορφοποιεί το όνομα για εκτύπωση. |
| [get_Name](./get_name/)() const | Λαμβάνει το διακεκριμένο όνομα του πιστοποιητικού. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<AsnEncodedData\>\&) | Πληροφορίες RTTI. |
| [X500DistinguishedName](./x500distinguishedname/)(const ByteArrayPtr\&) | Κατασκευαστής. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&) | Κατασκευαστής. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<X500DistinguishedName\>\&) | Κατασκευαστής αντιγραφής. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&, X500DistinguishedNameFlags) | Κατασκευαστής. |
## Δείτε επίσης

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
