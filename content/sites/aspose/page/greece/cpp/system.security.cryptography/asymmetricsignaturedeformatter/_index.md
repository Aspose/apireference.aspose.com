---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter class"
linktitle: "AsymmetricSignatureDeformatter"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter class. Βασική κλάση για ασύμμετρους αποδιαμορφωτές υπογραφών. Αντικείμενα αυτής της κλάσης πρέπει να καταλαμβάνονται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας operator new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 300
url: /el/cpp/system.security.cryptography/asymmetricsignaturedeformatter/
---
## AsymmetricSignatureDeformatter class


Βασική κλάση για ασύμμετρους αποδιαμορφωτές υπογραφών. Αντικείμενα αυτής της κλάσης πρέπει να καταλαμβάνονται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας operator new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class AsymmetricSignatureDeformatter : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | Πληροφορίες RTTI. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | Ορίζει το κλειδί για χρήση με τον αλγόριθμο. |
| virtual [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Επαληθεύει την υπογραφή στα δεδομένα. |
| virtual [VerifySignature](./verifysignature/)(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) | Επαληθεύει την υπογραφή στα δεδομένα. Δεν έχει υλοποιηθεί. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
