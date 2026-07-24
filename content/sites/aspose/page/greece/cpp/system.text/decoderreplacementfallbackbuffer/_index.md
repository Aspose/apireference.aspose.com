---
title: "System::Text::DecoderReplacementFallbackBuffer κλάση"
linktitle: "DecoderReplacementFallbackBuffer"
second_title: "Aspose.Page για C++"
description: "System::Text::DecoderReplacementFallbackBuffer κλάση. Προσωρινή μνήμη για την αντικατάσταση της στρατηγικής εναλλακτικής αποκωδικοποίησης σε C++."
type: docs
weight: 800
url: /el/cpp/system.text/decoderreplacementfallbackbuffer/
---
## DecoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing decoding fallback strategy.

```cpp
class DecoderReplacementFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [DecoderReplacementFallbackBuffer](./decoderreplacementfallbackbuffer/)(const DecoderReplacementFallbackPtr\&) | Κατασκευαστής. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Διαχειρίζεται αποτυχία αποκωδικοποίησης. |
| [get_Remaining](./get_remaining/)() const override | Λαμβάνει τον αριθμό των υπόλοιπων χαρακτήρων στη μνήμη. |
| [GetNextChar](./getnextchar/)() override | Λαμβάνει τον επόμενο διαθέσιμο χαρακτήρα. |
| [MovePrevious](./moveprevious/)() override | Μετακινείται στον προηγούμενο χαρακτήρα. |
| [Reset](./reset/)() override | Επαναφέρει τη μνήμη στην αρχική κατάσταση (πριν από την κλήση του [Fallback()](./fallback/)). |
## Δείτε επίσης

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
