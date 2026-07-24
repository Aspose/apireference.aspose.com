---
title: "System::Security::Cryptography::AsnEncodedData κλάση"
linktitle: "AsnEncodedData"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::AsnEncodedData κλάση. Δεδομένα κωδικοποιημένα σε ASN.1. Τα αντικείμενα αυτής της κλάσης θα πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας operator new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


Δεδομένα κωδικοποιημένα σε ASN.1. Τα αντικείμενα αυτής της κλάσης θα πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας operator new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class AsnEncodedData : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | Πληροφορίες RTTI. |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | Κατασκευαστής. |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | Κατασκευαστής. |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | Κατασκευαστής. |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | Αντιγράφει δεδομένα από διαφορετικό αντικείμενο. |
| virtual [Format](./format/)(bool) const | Μορφοποιεί τα δεδομένα σε μορφή κατανοητή από άνθρωπο. |
| [get_Oid](./get_oid/)() const | Λαμβάνει το αναγνωριστικό αντικειμένου των κωδικοποιημένων δεδομένων. |
| [get_RawData](./get_rawdata/)() const | Λαμβάνει τα ακατέργαστα κωδικοποιημένα δεδομένα. |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | Ορίζει το αναγνωριστικό αντικειμένου των κωδικοποιημένων δεδομένων. |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | Ορίζει τα ακατέργαστα κωδικοποιημένα δεδομένα. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
