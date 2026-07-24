---
title: "Κλάση System::Security::Cryptography::AsymmetricSignatureFormatter"
linktitle: "AsymmetricSignatureFormatter"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Security::Cryptography::AsymmetricSignatureFormatter. Βασική κλάση για μορφοποιητές ασύμμετρων υπογραφών. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε στις συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.security.cryptography/asymmetricsignatureformatter/
---
## AsymmetricSignatureFormatter class


Βασική κλάση για μορφοποιητές ασύμμετρων υπογραφών. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε στις συναρτήσεις ως όρισμα.

```cpp
class AsymmetricSignatureFormatter : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) | Πληροφορίες RTTI. |
| virtual [CreateSignature](./createsignature/)(System::SharedPtr\<HashAlgorithm\>) | Δημιουργεί την υπογραφή για την καθορισμένη τιμή κατακερματισμού. |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | Ορίζει τον αλγόριθμο κατακερματισμού που θα χρησιμοποιηθεί. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | Ορίζει τον ασυμμετρικό αλγόριθμο που θα χρησιμοποιηθεί κατά τον υπολογισμό της υπογραφής. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
