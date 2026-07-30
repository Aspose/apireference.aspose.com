---
title: "System::Text::DecoderFallbackBuffer::Fallback yöntemi"
linktitle: "Fallback"
second_title: "Aspose.Font için C++"
description: "System::Text::DecoderFallbackBuffer::Fallback yöntemi. C++'ta gerçek geri dönüş prosedürünü uygular."
type: docs
weight: 100
url: /tr/cpp/system.text/decoderfallbackbuffer/fallback/
---
## DecoderFallbackBuffer::Fallback method


Gerçek geri dönüş prosedürünü uygular.

```cpp
virtual bool System::Text::DecoderFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) baytları, çözücünün çözemediği baytı da içeren |
| indeks | int | Hatanın tetiklendiği baytın indeksi. |

### ReturnValue

Arabellek bilinmeyen baytları işliyorsa doğru, yok sayıyorsa yanlış.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
