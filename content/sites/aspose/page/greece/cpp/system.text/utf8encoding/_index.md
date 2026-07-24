---
title: "System::Text::UTF8Encoding κλάση"
linktitle: "UTF8Encoding"
second_title: "Aspose.Page για C++"
description: "System::Text::UTF8Encoding κλάση. Κωδικοποίηση UTF-8. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2800
url: /el/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


Κωδικοποίηση UTF-8. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class UTF8Encoding : public System::Text::ICUEncoding
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Κλωνοποιεί το αντικείμενο κωδικοποίησης. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Συγκρίνει με το αντικείμενο. |
| [GetHashCode](./gethashcode/)() const override | Λαμβάνει τον κωδικό κατακερματισμού της κωδικοποίησης. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Λαμβάνει τον μέγιστο αριθμό byte που απαιτούνται για την κωδικοποίηση ενός συγκεκριμένου αριθμού χαρακτήρων. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Λαμβάνει τον μέγιστο αριθμό χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός συγκεκριμένου αριθμού byte. |
| [GetPreamble](./getpreamble/)() override | Λαμβάνει την προαπόσπασμα κωδικοσελίδας. |
| [operator==](./operator==/)(const UTF8Encoding\&) const | Συγκρίνει τις παραμέτρους των κωδικοποιήσεων. |
| [UTF8Encoding](./utf8encoding/)() | Κατασκευαστής. |
| [UTF8Encoding](./utf8encoding/)(bool) | Κατασκευαστής. |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | Κατασκευαστής. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Προεπιλεγμένη τιμή κωδικοσελίδας. |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | Πληροφορίες RTTI. |
## Δείτε επίσης

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
