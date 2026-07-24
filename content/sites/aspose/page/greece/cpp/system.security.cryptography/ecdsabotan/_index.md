---
title: "System::Security::Cryptography::ECDsaBotan κλάση"
linktitle: "ECDsaBotan"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::ECDsaBotan κλάση. Αλγόριθμος ECDsa σε μορφή Botan. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1400
url: /el/cpp/system.security.cryptography/ecdsabotan/
---
## ECDsaBotan class


[ECDsa](../ecdsa/) algorithm in Botan form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ECDsaBotan : public System::Security::Cryptography::ECDsa
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ECDsaBotan](./ecdsabotan/)() | Κατασκευαστής. Χρησιμοποιεί προεπιλεγμένες παραμέτρους. |
| [ECDsaBotan](./ecdsabotan/)(const ECParameters\&) | Κατασκευαστής. |
| [ECDsaBotan](./ecdsabotan/)(const ECCurve\&) | Κατασκευαστής. |
| [ECDsaBotan](./ecdsabotan/)(int32_t) | Κατασκευαστής. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PublicKey\&) | Κατασκευαστής. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PrivateKey\&) | Κατασκευαστής. |
| [ExportExplicitParameters](./exportexplicitparameters/)(bool) override | Εξάγει ρητές παραμέτρους. |
| [ExportParameters](./exportparameters/)(bool) override | Εξάγει ονομαστικές ή ρητές παραμέτρους. |
| [FromXmlString](./fromxmlstring/)(String) override | Αρχικοποιεί το αντικείμενο χρησιμοποιώντας παραμέτρους κωδικοποιημένες σε XML. Δεν έχει υλοποιηθεί. |
| [FromXmlString](./fromxmlstring/)(const String\&, ECKeyXmlFormat) | Αρχικοποιεί το αντικείμενο χρησιμοποιώντας παραμέτρους κωδικοποιημένες σε XML. Δεν έχει υλοποιηθεί. |
| [GenerateKey](./generatekey/)(const ECCurve\&) override | Δημιουργεί ένα νέο ζεύγος δημόσιου/ιδιωτικού κλειδιού για την καθορισμένη καμπύλη. |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | Λαμβάνει τον αλγόριθμο κατακερματισμού. |
| [HashData](./hashdata/)(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) override | Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού. |
| [HashData](./hashdata/)(StreamPtr, HashAlgorithmName) override | Υπολογίζει την τιμή κατακερματισμού της καθορισμένης δυαδικής ροής χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού. |
| [ImportParameters](./importparameters/)(const ECParameters\&) override | Εισάγει όλες τις παραμέτρους από τη δομή δεδομένων. |
| [set_HashAlgorithm](./set_hashalgorithm/)(const HashAlgorithmName\&) | Ορίζει τον αλγόριθμο κατακερματισμού. |
| [set_KeySize](./set_keysize/)(int32_t) override | Ορίζει το μέγεθος κλειδιού. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων και υπογράφει το αποτέλεσμα. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων και υπογράφει το αποτέλεσμα. |
| [SignData](./signdata/)(const StreamPtr\&) | Υπολογίζει την τιμή κατακερματισμού της καθορισμένης δυαδικής ροής και υπογράφει το αποτέλεσμα. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Πληροφορίες RTTI. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Πληροφορίες RTTI. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Πληροφορίες RTTI. |
| [SignHash](./signhash/)(const ByteArrayPtr\&) override | Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου. |
| [ToXmlString](./toxmlstring/)(bool) override | Εξάγει όλες τις παραμέτρους σε μορφή XML. Δεν έχει υλοποιηθεί. |
| [ToXmlString](./toxmlstring/)(ECKeyXmlFormat) | Εξάγει όλες τις παραμέτρους σε μορφή XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) | Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&) | Επαληθεύει ότι η υπογραφή της καθορισμένης δυαδικής ροής είναι έγκυρη. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Επαληθεύει ότι η υπογραφή της καθορισμένης δυαδικής ροής είναι έγκυρη. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) override | Ελέγχει την υπογραφή δεδομένων. |
## Δείτε επίσης

* Class [ECDsa](../ecdsa/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
