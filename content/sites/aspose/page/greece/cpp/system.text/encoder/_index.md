---
title: "System::Text::Encoder κλάση"
linktitle: "Encoder"
second_title: "Aspose.Page για C++"
description: "System::Text::Encoder κλάση. Συμπυκνώνει τη σειρά χαρακτήρων κωδικοποίησης σε σειρά byte. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα."
type: docs
weight: 900
url: /el/cpp/system.text/encoder/
---
## Encoder class


Συμπυκνώνει τη σειρά χαρακτήρων κωδικοποίησης σε σειρά byte. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class Encoder : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Μετατρέπει χαρακτήρες σε byte. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Μετατρέπει χαρακτήρες σε byte. |
| [get_Fallback](./get_fallback/)() const | Λαμβάνει την εναλλακτική διαχείριση σφαλμάτων. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Λαμβάνει το buffer εναλλακτικής λειτουργίας. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Λαμβάνει τον αριθμό των byte που απαιτούνται για την κωδικοποίηση ενός buffer. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Λαμβάνει τον αριθμό των byte που απαιτούνται για την κωδικοποίηση ενός buffer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer. |
| virtual [Reset](./reset/)() | Καθαρίζει την εσωτερική κατάσταση του κωδικοποιητή. |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | Ορίζει την εναλλακτική διαχείριση σφαλμάτων. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
