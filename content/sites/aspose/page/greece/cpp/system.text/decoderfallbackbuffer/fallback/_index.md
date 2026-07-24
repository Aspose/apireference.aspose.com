---
title: "System::Text::DecoderFallbackBuffer::Fallback μέθοδος"
linktitle: "Fallback"
second_title: "Aspose.Page για C++"
description: "System::Text::DecoderFallbackBuffer::Fallback μέθοδος. Υλοποιεί την πραγματική διαδικασία fallback σε C++."
type: docs
weight: 100
url: /el/cpp/system.text/decoderfallbackbuffer/fallback/
---
## DecoderFallbackBuffer::Fallback method


Υλοποιεί την πραγματική διαδικασία fallback.

```cpp
virtual bool System::Text::DecoderFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) από byte που περιλαμβάνει και το byte που ο αποκωδικοποιητής δεν μπορεί να αποκωδικοποιήσει. |
| δείκτης | int | Δείκτης του byte που προκάλεσε το σφάλμα. |

### ReturnValue

Αληθές εάν το buffer επεξεργάζεται άγνωστα byte, ψευδές εάν τα αγνοεί.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
