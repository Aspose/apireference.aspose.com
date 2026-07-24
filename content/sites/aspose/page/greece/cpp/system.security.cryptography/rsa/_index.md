---
title: "System::Security::Cryptography::RSA κλάση"
linktitle: "RSA"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RSA κλάση. Βασική κλάση για υλοποιήσεις του αλγορίθμου RSA. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3400
url: /el/cpp/system.security.cryptography/rsa/
---
## RSA class


Βασική κλάση για υλοποιήσεις του αλγορίθμου [RSA](./). Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class RSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [Create](./create/)() | Δημιουργεί προεπιλεγμένη υλοποίηση αλγορίθμου [RSA](./). |
| static [Create](./create/)(const String\&) | Δημιουργεί προεπιλεγμένη υλοποίηση αλγορίθμου [RSA](./). |
| static [Create](./create/)(int32_t) | Δημιουργεί προεπιλεγμένη υλοποίηση αλγορίθμου [RSA](./) με καθορισμένο μέγεθος κλειδιού. |
| static [Create](./create/)(const RSAParameters\&) | Δημιουργεί προεπιλεγμένη υλοποίηση αλγορίθμου [RSA](./) με καθορισμένες παραμέτρους. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Δημιουργεί προεπιλεγμένη υλοποίηση αλγορίθμου [RSA](./) με καθορισμένες παραμέτρους κωδικοποιημένες σε XML. |
| virtual [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Αποκρυπτογραφεί τα εισερχόμενα δεδομένα χρησιμοποιώντας τη συγκεκριμένη λειτουργία γεμίσματος. |
| virtual [DecryptValue](./decryptvalue/)(ByteArrayPtr) | Αποκρυπτογραφεί την τιμή χρησιμοποιώντας το ιδιωτικό κλειδί. |
| virtual [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Κρυπτογραφεί τα εισερχόμενα δεδομένα χρησιμοποιώντας τη συγκεκριμένη λειτουργία γεμίσματος. |
| virtual [EncryptValue](./encryptvalue/)(ByteArrayPtr) | Κρυπτογραφεί την τιμή χρησιμοποιώντας το ιδιωτικό κλειδί. |
| virtual [ExportParameters](./exportparameters/)(bool) | Εξάγει όλες τις παραμέτρους. |
| [FromXmlString](./fromxmlstring/)(String) override | Αρχικοποιεί το αντικείμενο χρησιμοποιώντας παραμέτρους κωδικοποιημένες σε XML. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Πληροφορίες RTTI. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Αποκτά τον αλγόριθμο υπογραφής που σχετίζεται με το αντικείμενο CSP. |
| virtual [ImportParameters](./importparameters/)(RSAParameters) | Εισάγει όλες τις παραμέτρους από τη δομή δεδομένων. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και το γέμισμα, και υπογράφει το αποτέλεσμα. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και το γέμισμα, και υπογράφει το αποτέλεσμα. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Υπολογίζει την τιμή κατακερματισμού της καθορισμένης δυαδικής ροής χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και το γέμισμα, και υπογράφει το αποτέλεσμα. |
| virtual [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) | Υπολογίζει την υπογραφή για την καθορισμένη τιμή κατακερματισμού. |
| [ToXmlString](./toxmlstring/)(bool) override | Εξάγει όλες τις παραμέτρους σε μορφή XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Επαληθεύει ότι η υπογραφή της καθορισμένης δυαδικής ροής είναι έγκυρη. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) | Επιβεβαιώνει ότι η υπογραφή του καθορισμένου κατακερματισμού είναι έγκυρη. |
## Δείτε επίσης

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
