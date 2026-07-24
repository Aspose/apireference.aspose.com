---
title: "System::Text::EncoderExceptionFallbackBuffer κλάση"
linktitle: "EncoderExceptionFallbackBuffer"
second_title: "Aspose.Page για C++"
description: "System::Text::EncoderExceptionFallbackBuffer κλάση. Buffer για στρατηγική εναλλακτικής κωδικοποίησης που ρίχνει εξαιρέσεις. Στην πραγματικότητα δεν αποθηκεύει τίποτα, αλλά ρίχνει εξαιρέσεις. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1100
url: /el/cpp/system.text/encoderexceptionfallbackbuffer/
---
## EncoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing encoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderExceptionFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [EncoderExceptionFallbackBuffer](./encoderexceptionfallbackbuffer/)() | Κατασκευαστής. |
| [Fallback](./fallback/)(char_t, int) override | Διαχειρίζεται αποτυχία κωδικοποίησης. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Διαχειρίζεται αποτυχία κωδικοποίησης. |
| [get_Remaining](./get_remaining/)() const override | Λαμβάνει τον αριθμό των υπόλοιπων χαρακτήρων. |
| [GetNextChar](./getnextchar/)() override | Λαμβάνει τον επόμενο διαθέσιμο χαρακτήρα. |
| [MovePrevious](./moveprevious/)() override | Μετακινείται στον προηγούμενο χαρακτήρα. |
## Δείτε επίσης

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
