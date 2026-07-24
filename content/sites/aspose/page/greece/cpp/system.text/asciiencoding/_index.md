---
title: "Κλάση System::Text::ASCIIEncoding"
linktitle: "ASCIIEncoding"
second_title: "Aspose.Page για C++"
description: "System::Text::ASCIIEncoding class. Αντιπροσωπεύει την κωδικοποίηση ASCII. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.text/asciiencoding/
---
## ASCIIEncoding class


Represents ASCII encoding. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class ASCIIEncoding : public System::Text::ICUEncoding
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ASCIIEncoding](./asciiencoding/)() | Κατασκευαστής. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Λαμβάνει το μέγιστο πλήθος byte που μπορεί να χωρέσει μια συμβολοσειρά με γνωστό αριθμό χαρακτήρων. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Λαμβάνει τον μέγιστο αριθμό χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός συγκεκριμένου αριθμού byte. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [ASCII_CODE_PAGE](./ascii_code_page/) | RTTI. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Προεπιλεγμένη τιμή κωδικοσελίδας. |
## Δείτε επίσης

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
