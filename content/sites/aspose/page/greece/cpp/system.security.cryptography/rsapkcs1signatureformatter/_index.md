---
title: "System::Security::Cryptography::RSAPKCS1SignatureFormatter κλάση"
linktitle: "RSAPKCS1SignatureFormatter"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureFormatter κλάση. Υπογράφει δεδομένα με υπογραφή RSA PKCS # 1 v1.5. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3800
url: /el/cpp/system.security.cryptography/rsapkcs1signatureformatter/
---
## RSAPKCS1SignatureFormatter class


Υπογράφει δεδομένα με υπογραφή [RSA](../rsa/) PKCS # 1 v1.5. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class RSAPKCS1SignatureFormatter : public System::Security::Cryptography::AsymmetricSignatureFormatter
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) override | Υπογράφει δεδομένα. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)() | Πληροφορίες RTTI. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | Κατασκευαστής. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | Ορίζει τον αλγόριθμο κατακερματισμού που θα χρησιμοποιηθεί. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | Ορίζει την τιμή του κλειδιού. Δεν έχει υλοποιηθεί. |
| [~RSAPKCS1SignatureFormatter](./~rsapkcs1signatureformatter/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [AsymmetricSignatureFormatter](../asymmetricsignatureformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
