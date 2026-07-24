---
title: "System::Text::EncoderReplacementFallbackBuffer κλάση"
linktitle: "EncoderReplacementFallbackBuffer"
second_title: "Aspose.Page για C++"
description: "System::Text::EncoderReplacementFallbackBuffer κλάση. Ενδιάμεσος για την αντικατάσταση της στρατηγικής εναλλακτικής κωδικοποίησης. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1500
url: /el/cpp/system.text/encoderreplacementfallbackbuffer/
---
## EncoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing encoding fallback strategy. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderReplacementFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [EncoderReplacementFallbackBuffer](./encoderreplacementfallbackbuffer/)(const EncoderReplacementFallbackPtr\&) | Κατασκευαστής. |
| [Fallback](./fallback/)(char_t, int) override | Διαχειρίζεται αποτυχία κωδικοποίησης. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Διαχειρίζεται αποτυχία κωδικοποίησης. |
| [get_Remaining](./get_remaining/)() const override | Λαμβάνει τον αριθμό των υπόλοιπων χαρακτήρων στη μνήμη. |
| [GetNextChar](./getnextchar/)() override | Λαμβάνει τον επόμενο διαθέσιμο χαρακτήρα. |
| [MovePrevious](./moveprevious/)() override | Μετακινείται στον προηγούμενο χαρακτήρα. |
| [Reset](./reset/)() override | Επαναφέρει τη μνήμη στην αρχική κατάσταση (πριν από την κλήση του [Fallback()](./fallback/)). |
## Δείτε επίσης

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
