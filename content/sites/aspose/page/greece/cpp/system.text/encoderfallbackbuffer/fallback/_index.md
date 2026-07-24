---
title: "System::Text::EncoderFallbackBuffer::Fallback μέθοδος"
linktitle: "Fallback"
second_title: "Aspose.Page για C++"
description: "System::Text::EncoderFallbackBuffer::Fallback μέθοδος. Υλοποιεί την πραγματική διαδικασία εναλλακτικού χειρισμού σε C++."
type: docs
weight: 100
url: /el/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


Υλοποιεί την πραγματική διαδικασία fallback.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| charUnknown | char_t | Ο κωδικοποιητής χαρακτήρων αποτυγχάνει να κωδικοποιήσει. |
| δείκτης | int | Δείκτης του χαρακτήρα που προκάλεσε το σφάλμα. |

### ReturnValue

Αληθές εάν η προσωρινή μνήμη επεξεργάζεται άγνωστους χαρακτήρες, ψευδές εάν τους αγνοεί.

## Δείτε επίσης

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


Υλοποιεί την πραγματική διαδικασία fallback.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| charUnknownHigh | char_t | Υψηλό μέρος του ζεύγους υποκατάστασης που προκάλεσε το σφάλμα. |
| charUnknownLow | char_t | Χαμηλό μέρος του ζεύγους υποκατάστασης που προκάλεσε το σφάλμα. |
| δείκτης | int | Δείκτης του χαρακτήρα που προκάλεσε το σφάλμα. |

### ReturnValue

Αληθές εάν η προσωρινή μνήμη επεξεργάζεται άγνωστους χαρακτήρες, ψευδές εάν τους αγνοεί.

## Δείτε επίσης

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
