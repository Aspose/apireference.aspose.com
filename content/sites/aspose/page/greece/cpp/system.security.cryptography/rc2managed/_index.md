---
title: "System::Security::Cryptography::RC2Managed κλάση"
linktitle: "RC2Managed"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RC2Managed κλάση. Διαχειριζόμενος αλγόριθμος RC2. Υποστηρίζονται μόνο οι λειτουργίες κρυπτογράφησης ECB, CFB και CBC. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2800
url: /el/cpp/system.security.cryptography/rc2managed/
---
## RC2Managed class


Διαχειριζόμενος αλγόριθμος [RC2](../rc2/). Υποστηρίζονται μόνο οι λειτουργίες κρυπτογράφησης ECB, CFB και CBC. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class RC2Managed : public System::Security::Cryptography::RC2
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

* Class [RC2](../rc2/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
