---
title: "System::Text::DecoderFallbackBuffer::Fallback-Methode"
linktitle: "Fallback"
second_title: "Aspose.Font für C++"
description: "System::Text::DecoderFallbackBuffer::Fallback-Methode. Implementiert das eigentliche Fallback-Verfahren in C++."
type: docs
weight: 100
url: /de/cpp/system.text/decoderfallbackbuffer/fallback/
---
## DecoderFallbackBuffer::Fallback method


Implementiert das eigentliche Fallback-Verfahren.

```cpp
virtual bool System::Text::DecoderFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) von Bytes, einschließlich desjenigen, den der Decoder nicht dekodieren kann. |
| Index | int | Index des Bytes, das den Fehler ausgelöst hat. |

### ReturnValue

Wahr, wenn der Puffer unbekannte Bytes verarbeitet, falsch, wenn er sie ignoriert.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
