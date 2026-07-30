---
title: "System::Text::DecoderFallbackBuffer::Fallback metodo"
linktitle: "Fallback"
second_title: "Aspose.Font per C++"
description: "System::Text::DecoderFallbackBuffer::Fallback metodo. Implementa la procedura di fallback reale in C++."
type: docs
weight: 100
url: /it/cpp/system.text/decoderfallbackbuffer/fallback/
---
## DecoderFallbackBuffer::Fallback method


Implementa la procedura di fallback reale.

```cpp
virtual bool System::Text::DecoderFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) di byte includendo quello che il decoder non riesce a decodificare. |
| indice | int | Indice del byte che ha generato l'errore. |

### ReturnValue

Vero se il buffer elabora byte sconosciuti, falso se li ignora.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
