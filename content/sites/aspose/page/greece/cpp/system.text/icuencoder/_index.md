---
title: "System::Text::ICUEncoder κλάση"
linktitle: "ICUEncoder"
second_title: "Aspose.Page για C++"
description: "System::Text::ICUEncoder κλάση. Κωδικοποιητής που χρησιμοποιεί το ICU για κωδικοποίηση. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2100
url: /el/cpp/system.text/icuencoder/
---
## ICUEncoder class


[Encoder](../encoder/) that uses ICU for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUEncoder : public System::Text::Encoder
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Μετατρέπει χαρακτήρες σε byte. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Μετατρέπει χαρακτήρες σε byte. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Λαμβάνει τον αριθμό των byte που απαιτούνται για την κωδικοποίηση ενός buffer. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Λαμβάνει τον αριθμό των byte που απαιτούνται για την κωδικοποίηση ενός buffer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer. |
| [ICUEncoder](./icuencoder/)(ICUEncoding *) | Κατασκευαστής. |
| virtual [Reset](./reset/)() | Ορίζει τις εσωτερικές μεταβλητές στην αρχική κατάσταση. |
| [~ICUEncoder](./~icuencoder/)() | Καταστροφέας. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Base](./base/) | Τύπος [Base](./base/). |
## Δείτε επίσης

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
