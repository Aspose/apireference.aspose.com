---
title: "System::Security::Cryptography::RijndaelManaged κλάση"
linktitle: "RijndaelManaged"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RijndaelManaged κλάση. Διαχειριζόμενος αλγόριθμος Rijndael. Υποστηρίζει μόνο τις λειτουργίες ECB και CFB με συμπλήρωση None και τη λειτουργία CBC με συμπλήρωση None και Zeros. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3100
url: /el/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


Διαχειριζόμενος αλγόριθμος [Rijndael](../rijndael/). Υποστηρίζει μόνο τις λειτουργίες ECB και CFB με συμπλήρωση None και τη λειτουργία CBC με συμπλήρωση None και Zeros. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class RijndaelManaged : public System::Security::Cryptography::Rijndael
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

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
