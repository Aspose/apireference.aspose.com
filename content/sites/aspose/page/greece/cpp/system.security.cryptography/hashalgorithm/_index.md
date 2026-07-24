---
title: "System::Security::Cryptography::HashAlgorithm class"
linktitle: "HashAlgorithm"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::HashAlgorithm class. Βασική κλάση για αλγορίθμους κατακερματισμού. Αντικείμενα αυτής της κλάσης πρέπει να καταλαμβάνονται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας operator new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1600
url: /el/cpp/system.security.cryptography/hashalgorithm/
---
## HashAlgorithm class


Βασική κλάση για αλγορίθμους κατακερματισμού. Αντικείμενα αυτής της κλάσης πρέπει να καταλαμβάνονται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας operator new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class HashAlgorithm : public System::Security::Cryptography::ICryptoTransform
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | Κατακερματίζει το buffer. |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&, int, int) | Κατακερματίζει το τμήμα του buffer. |
| [ComputeHash](./computehash/)(SharedPtr\<IO::Stream\> const\&) | Διαβάζει τη ροή μέχρι το τέλος και υπολογίζει το κατακερματισμό για τα διαβασμένα δεδομένα. |
| static [Create](./create/)(const String\&) | Δημιουργεί αλγόριθμο κατακερματισμού βάσει ονόματος. |
| virtual [get_Hash](./get_hash/)() | Λαμβάνει την τιμή του υπολογισμένου κώδικα κατακερματισμού. |
| virtual [get_HashSize](./get_hashsize/)() | Λαμβάνει το μέγεθος της υπολογισμένης τιμής κατακερματισμού σε bytes. |
| [get_InputBlockSize](./get_inputblocksize/)() override | Μέγεθος μπλοκ εισόδου. |
| [get_OutputBlockSize](./get_outputblocksize/)() override | Μέγεθος μπλοκ εξόδου. |
| virtual [Initialize](./initialize/)() | Επαναφέρει τον κατακερματιστή στην αρχική κατάσταση. |
| [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Επεξεργάζεται μπλοκ δεδομένων και αντιγράφει τα δεδομένα στον πίνακα εξόδου. |
| [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) override | Επεξεργάζεται το τελευταίο μπλοκ δεδομένων και υπολογίζει το κατακερματισμό. |
| virtual [~HashAlgorithm](./~hashalgorithm/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
