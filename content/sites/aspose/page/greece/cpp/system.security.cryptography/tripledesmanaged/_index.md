---
title: "Κλάση System::Security::Cryptography::TripleDESManaged"
linktitle: "TripleDESManaged"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Security::Cryptography::TripleDESManaged. Διαχειριζόμενη υλοποίηση TripleDES. Υποστηρίζει μόνο τις λειτουργίες ECB και CFB με συμπλήρωση None και τη λειτουργία CBC με συμπλήρωση None, Zeros και PKCS7. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 5200
url: /el/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


Διαχειριζόμενη υλοποίηση [TripleDES](../tripledes/). Υποστηρίζει μόνο τις λειτουργίες ECB και CFB με συμπλήρωση None και τη λειτουργία CBC με συμπλήρωση None, Zeros και PKCS7. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Δημιουργεί αντικείμενο αποκρυπτογράφησης με ρητές παραμέτρους. |
| virtual [CreateDecryptor](./createdecryptor/)() | Δημιουργεί αντικείμενο αποκρυπτογράφησης με παραμέτρους που ορίζονται από το αντικείμενο αλγορίθμου. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Δημιουργεί αντικείμενο κρυπτογράφησης με ρητές παραμέτρους. |
| virtual [CreateEncryptor](./createencryptor/)() | Δημιουργεί αντικείμενο κρυπτογράφησης με παραμέτρους που ορίζονται από το αντικείμενο αλγορίθμου. |
| [GenerateIV](./generateiv/)() override | Δημιουργεί τυχαία αρχική τιμή και την αποθηκεύει στα εσωτερικά του αλγορίθμου. |
| [GenerateKey](./generatekey/)() override | Δημιουργεί τυχαίο κλειδί και το αποθηκεύει στα εσωτερικά του αλγορίθμου. |
## Δείτε επίσης

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
