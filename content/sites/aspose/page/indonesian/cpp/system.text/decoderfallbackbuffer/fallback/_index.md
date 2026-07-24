---
title: "System::Text::DecoderFallbackBuffer::Fallback metode"
linktitle: "Fallback"
second_title: "Aspose.Page untuk C++"
description: "System::Text::DecoderFallbackBuffer::Fallback metode. Mengimplementasikan prosedur fallback sebenarnya dalam C++."
type: docs
weight: 100
url: /id/cpp/system.text/decoderfallbackbuffer/fallback/
---
## DecoderFallbackBuffer::Fallback method


Mengimplementasikan prosedur fallback aktual.

```cpp
virtual bool System::Text::DecoderFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) dari byte termasuk byte yang gagal didekode oleh decoder. |
| indeks | int | Indeks byte yang memicu kesalahan. |

### ReturnValue

True jika buffer memproses byte yang tidak diketahui, false jika mengabaikannya.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
