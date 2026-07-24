---
title: "System::Text::UnicodeEncoding class"
linktitle: "UnicodeEncoding"
second_title: "Aspose.Page για C++"
description: "System::Text::UnicodeEncoding class. Κωδικοποίηση Unicode. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2500
url: /el/cpp/system.text/unicodeencoding/
---
## UnicodeEncoding class


Κωδικοποίηση Unicode. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class UnicodeEncoding : public System::Text::ICUEncoding
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Κλωνοποιεί το αντικείμενο κωδικοποίησης. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Συγκρίνει κωδικοποιήσεις. |
| [GetHashCode](./gethashcode/)() const override | Δημιουργεί κατακερματισμό της κωδικοποίησης. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Λαμβάνει τον μέγιστο αριθμό byte που απαιτούνται για την κωδικοποίηση ενός συγκεκριμένου αριθμού χαρακτήρων. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Λαμβάνει τον μέγιστο αριθμό χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός συγκεκριμένου αριθμού byte. |
| [GetPreamble](./getpreamble/)() override | Επιστρέφει μια ακολουθία byte που υποδεικνύει την κωδικοποίηση (π.χ. BOM). |
| [operator==](./operator==/)(const UnicodeEncoding\&) const | Συγκρίνει κωδικοποιήσεις βάσει κωδικοσελίδων και σημαιών. |
| [UnicodeEncoding](./unicodeencoding/)() | Κατασκευαστής. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool) | Κατασκευαστής. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool, bool) | Κατασκευαστής. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [BIG_UNICODE_CODE_PAGE](./big_unicode_code_page/) | Αριθμός κωδικοσελίδας big endian. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Προεπιλεγμένη τιμή κωδικοσελίδας. |
| static constexpr [UNICODE_CODE_PAGE](./unicode_code_page/) | Αριθμός κωδικοσελίδας little endian. |
## Δείτε επίσης

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
