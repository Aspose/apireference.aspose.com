---
title: "System::Security::Cryptography::X509Certificates::PublicKey κλάση"
linktitle: "PublicKey"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::X509Certificates::PublicKey κλάση. Αντιπροσωπεύει τις πληροφορίες του δημόσιου κλειδιού ενός πιστοποιητικού X509. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.security.cryptography.x509certificates/publickey/
---
## PublicKey class


Αντιπροσωπεύει τις πληροφορίες του δημόσιου κλειδιού ενός πιστοποιητικού X509. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class PublicKey : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_EncodedKeyValue](./get_encodedkeyvalue/)() const | Λαμβάνει την τιμή του δημόσιου κλειδιού κωδικοποιημένη σε ASN.1. |
| [get_EncodedParameters](./get_encodedparameters/)() const | Λαμβάνει τις παραμέτρους του δημόσιου κλειδιού κωδικοποιημένες σε ASN.1. |
| [get_Key](./get_key/)() const | Λαμβάνει ένα [RSACryptoServiceProvider](../../system.security.cryptography/rsacryptoserviceprovider/) ή [DSACryptoServiceProvider](../../system.security.cryptography/dsacryptoserviceprovider/). |
| [get_Oid](./get_oid/)() const | Λαμβάνει το αναγνωριστικό (OID) του δημόσιου κλειδιού. |
| [PublicKey](./publickey/)(const SharedPtr\<Oid\>\&, const SharedPtr\<AsnEncodedData\>\&, const SharedPtr\<AsnEncodedData\>) | Κατασκευαστής. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
