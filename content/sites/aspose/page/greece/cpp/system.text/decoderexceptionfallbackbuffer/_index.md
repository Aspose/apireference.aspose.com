---
title: "System::Text::DecoderExceptionFallbackBuffer κλάση"
linktitle: "DecoderExceptionFallbackBuffer"
second_title: "Aspose.Page για C++"
description: "System::Text::DecoderExceptionFallbackBuffer class. Πρόσθετο για στρατηγική εναλλακτικού αποκωδικοποιητή που ρίχνει εξαιρέσεις. Δεν αποθηκεύει τίποτα στην πραγματικότητα, αλλά ρίχνει εξαίρεση. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα αντίγραφο αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.text/decoderexceptionfallbackbuffer/
---
## DecoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing decoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DecoderExceptionFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [DecoderExceptionFallbackBuffer](./decoderexceptionfallbackbuffer/)() | Κατασκευαστής. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Διαχειρίζεται αποτυχία αποκωδικοποίησης. |
| [get_Remaining](./get_remaining/)() const override | Λαμβάνει τον αριθμό των υπόλοιπων χαρακτήρων. |
| [GetNextChar](./getnextchar/)() override | Λαμβάνει τον επόμενο διαθέσιμο χαρακτήρα. |
| [MovePrevious](./moveprevious/)() override | Μετακινείται στον προηγούμενο χαρακτήρα. |
## Δείτε επίσης

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
