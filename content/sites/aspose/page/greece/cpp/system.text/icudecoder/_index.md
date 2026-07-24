---
title: "System::Text::ICUDecoder κλάση"
linktitle: "ICUDecoder"
second_title: "Aspose.Page για C++"
description: "System::Text::ICUDecoder κλάση. Αποκωδικοποιητής που χρησιμοποιεί το ICU για αποκωδικοποίηση. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2000
url: /el/cpp/system.text/icudecoder/
---
## ICUDecoder class


[Decoder](../decoder/) that uses ICU for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUDecoder : public System::Text::Decoder
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Μετατρέπει byte σε χαρακτήρες. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Μετατρέπει byte σε χαρακτήρες. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer. |
| [ICUDecoder](./icudecoder/)(ICUEncoding *) | Κατασκευαστής. |
| virtual [Reset](./reset/)() | Ορίζει τις εσωτερικές μεταβλητές στην αρχική κατάσταση. |
| virtual [~ICUDecoder](./~icudecoder/)() | Καταστροφέας. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Base](./base/) | Τύπος [Base](./base/). |
## Δείτε επίσης

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
