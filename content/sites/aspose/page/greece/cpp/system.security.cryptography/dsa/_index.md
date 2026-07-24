---
title: "System::Security::Cryptography::DSA κλάση"
linktitle: "DSA"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::DSA κλάση. Βασική κλάση για υλοποιήσεις του αλγορίθμου DSA. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στην στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα στην C++."
type: docs
weight: 900
url: /el/cpp/system.security.cryptography/dsa/
---
## DSA class


Βασική κλάση για υλοποιήσεις του αλγορίθμου [DSA](./). Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στην στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class DSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [Create](./create/)() | Δημιουργεί προεπιλεγμένη υλοποίηση αλγορίθμου [DSA](./). |
| static [Create](./create/)(const String\&) | Δημιουργεί προεπιλεγμένη υλοποίηση αλγορίθμου [DSA](./). |
| static [Create](./create/)(int32_t) | Δημιουργεί προεπιλεγμένη υλοποίηση αλγορίθμου [DSA](./) με καθορισμένο μέγεθος κλειδιού. |
| static [Create](./create/)(const DSAParameters\&) | Δημιουργεί προεπιλεγμένη υλοποίηση αλγορίθμου [DSA](./) με καθορισμένες παραμέτρους. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Δημιουργεί προεπιλεγμένη υλοποίηση αλγορίθμου [DSA](./) με καθορισμένες παραμέτρους κωδικοποιημένες σε XML. |
| virtual [CreateSignature](./createsignature/)(ByteArrayPtr) | Πληροφορίες RTTI. |
| virtual [ExportParameters](./exportparameters/)(bool) | Εξάγει όλες τις παραμέτρους. |
| [FromXmlString](./fromxmlstring/)(String) override | Αρχικοποιεί το αντικείμενο χρησιμοποιώντας παραμέτρους κωδικοποιημένες σε XML. |
| virtual [ImportParameters](./importparameters/)(DSAParameters) | Εισάγει όλες τις παραμέτρους από τη δομή δεδομένων. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Υπολογίζει την τιμή κατακερματισμού της καθορισμένης δυαδικής ροής χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα. |
| [ToXmlString](./toxmlstring/)(bool) override | Εξάγει όλες τις παραμέτρους σε μορφή XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Επαληθεύει ότι η υπογραφή της καθορισμένης δυαδικής ροής είναι έγκυρη. |
| virtual [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) | Επαληθεύει την υπογραφή [DSA](./) για τα καθορισμένα δεδομένα. |
## Δείτε επίσης

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
