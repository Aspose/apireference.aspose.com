---
title: "System::Text::EncoderFallbackBuffer κλάση"
linktitle: "EncoderFallbackBuffer"
second_title: "Aspose.Page για C++"
description: "System::Text::EncoderFallbackBuffer κλάση. Παρέχει buffer για υλοποίηση fallback. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε στις συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1300
url: /el/cpp/system.text/encoderfallbackbuffer/
---
## EncoderFallbackBuffer class


Παρέχει buffer για υλοποίηση fallback. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε στις συναρτήσεις ως όρισμα.

```cpp
class EncoderFallbackBuffer : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Fallback](./fallback/)(char_t, int) | Υλοποιεί την πραγματική διαδικασία fallback. |
| virtual [Fallback](./fallback/)(char_t, char_t, int) | Υλοποιεί την πραγματική διαδικασία fallback. |
| virtual [get_Remaining](./get_remaining/)() const | Λαμβάνει τον εναπομείναντα αριθμό χαρακτήρων που πρέπει να επεξεργαστούν. |
| virtual [GetNextChar](./getnextchar/)() | Εξάγει τον επόμενο χαρακτήρα στο buffer fallback. |
| virtual [MovePrevious](./moveprevious/)() | Μετακινεί τη θέση του buffer ένα βήμα πίσω αν είναι δυνατόν. |
| virtual [Reset](./reset/)() | Επαναφέρει το buffer στην αρχική κατάσταση. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
