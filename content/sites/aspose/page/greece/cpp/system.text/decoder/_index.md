---
title: "System::Text::Decoder κλάση"
linktitle: "Decoder"
second_title: "Aspose.Page για C++"
description: "System::Text::Decoder κλάση. Περιβάλλει την αποκωδικοποίηση ακολουθίας byte σε ακολουθία χαρακτήρων. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 200
url: /el/cpp/system.text/decoder/
---
## Decoder class


Περιβάλλει την αποκωδικοποίηση ακολουθίας byte σε ακολουθία χαρακτήρων. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class Decoder : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Μετατρέπει byte σε χαρακτήρες. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Μετατρέπει byte σε χαρακτήρες. |
| [get_Fallback](./get_fallback/)() const | Λαμβάνει την εναλλακτική διαχείριση σφαλμάτων. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Λαμβάνει το buffer εναλλακτικής λειτουργίας. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer. |
| virtual [Reset](./reset/)() | Καθαρίζει την εσωτερική κατάσταση του αποκωδικοποιητή. |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | Ορίζει την εναλλακτική διαχείριση σφαλμάτων. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
