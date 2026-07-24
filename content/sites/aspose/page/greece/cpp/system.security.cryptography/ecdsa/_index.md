---
title: "System::Security::Cryptography::ECDsa κλάση"
linktitle: "ECDsa"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::ECDsa κλάση. Βασική κλάση για υλοποιήσεις του αλγορίθμου ECDsa. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε στις συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1300
url: /el/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


Βασική κλάση για υλοποιήσεις του αλγορίθμου [ECDsa](./). Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε στις συναρτήσεις ως όρισμα.

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [Create](./create/)() | Δημιουργεί προεπιλεγμένη υλοποίηση αλγορίθμου ECDSA. |
| static [Create](./create/)(const ECCurve\&) | Δημιουργεί προεπιλεγμένη υλοποίηση αλγορίθμου ECDSA με νέο κλειδί πάνω στην καθορισμένη καμπύλη. |
| static [Create](./create/)(const ECParameters\&) | Δημιουργεί προεπιλεγμένη υλοποίηση αλγορίθμου ECDSA χρησιμοποιώντας τις καθορισμένες παραμέτρους. |
| static [Create](./create/)(const String\&) | Δημιουργεί την καθορισμένη υλοποίηση αλγορίθμου ECDSA. |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | Εξάγει ρητές παραμέτρους. |
| virtual [ExportParameters](./exportparameters/)(bool) | Εξάγει ονομαστικές ή ρητές παραμέτρους. |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | Δημιουργεί ένα νέο ζεύγος δημόσιου/ιδιωτικού κλειδιού για την καθορισμένη καμπύλη. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Πληροφορίες RTTI. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Λαμβάνει τον αλγόριθμο υπογραφής που θα χρησιμοποιηθεί. |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | Εισάγει όλες τις παραμέτρους από τη δομή δεδομένων. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Υπολογίζει την τιμή κατακερματισμού της καθορισμένης δυαδικής ροής χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα. |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Επαληθεύει ότι η υπογραφή της καθορισμένης δυαδικής ροής είναι έγκυρη. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | Ελέγχει την υπογραφή δεδομένων. |
## Δείτε επίσης

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
