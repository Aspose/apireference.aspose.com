---
title: "Μέθοδος System::Text::EncoderReplacementFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Text::EncoderReplacementFallbackBuffer::Fallback. Διαχειρίζεται αποτυχία κωδικοποίησης σε C++."
type: docs
weight: 200
url: /el/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


Διαχειρίζεται αποτυχία κωδικοποίησης.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| charUnknown | char_t | Άγνωστος χαρακτήρας· αγνοήθηκε. |
| δείκτης | int | Άγνωστη θέση χαρακτήρα· αγνοήθηκε. |

### ReturnValue

Αληθές εάν η συμβολοσειρά αντικατάστασης παρέχεται και δεν είναι κενή, αλλιώς ψευδές.

## Δείτε επίσης

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


Διαχειρίζεται αποτυχία κωδικοποίησης.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| charUnknownHigh | char_t | Υψηλό μέρος του ζεύγους υποκατάστασης που προκάλεσε το σφάλμα. |
| charUnknownLow | char_t | Χαμηλό μέρος του ζεύγους υποκατάστασης που προκάλεσε το σφάλμα. |
| δείκτης | int | Άγνωστη θέση χαρακτήρα· αγνοήθηκε. |

### ReturnValue

Αληθές εάν η συμβολοσειρά αντικατάστασης παρέχεται και δεν είναι κενή, αλλιώς ψευδές.

## Δείτε επίσης

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
