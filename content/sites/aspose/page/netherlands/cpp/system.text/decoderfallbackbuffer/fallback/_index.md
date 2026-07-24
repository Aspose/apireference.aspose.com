---
title: "System::Text::DecoderFallbackBuffer::Fallback methode"
linktitle: "Fallback"
second_title: "Aspose.Page voor C++"
description: "System::Text::DecoderFallbackBuffer::Fallback methode. Implementeert de daadwerkelijke fallback-procedure in C++."
type: docs
weight: 100
url: /nl/cpp/system.text/decoderfallbackbuffer/fallback/
---
## DecoderFallbackBuffer::Fallback method


Implementeert de daadwerkelijke fallback‑procedure.

```cpp
virtual bool System::Text::DecoderFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) van bytes inclusief de byte die de decoder niet kan decoderen. |
| index | int | Index van byte die de fout veroorzaakte. |

### ReturnValue

Waar als de buffer onbekende bytes verwerkt, onwaar als hij ze negeert.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
