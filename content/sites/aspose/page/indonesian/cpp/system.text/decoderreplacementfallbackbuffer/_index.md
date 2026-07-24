---
title: "System::Text::DecoderReplacementFallbackBuffer kelas"
linktitle: "DecoderReplacementFallbackBuffer"
second_title: "Aspose.Page untuk C++"
description: "System::Text::DecoderReplacementFallbackBuffer kelas. Buffer untuk menggantikan strategi fallback decoding dalam C++."
type: docs
weight: 800
url: /id/cpp/system.text/decoderreplacementfallbackbuffer/
---
## DecoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing decoding fallback strategy.

```cpp
class DecoderReplacementFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [DecoderReplacementFallbackBuffer](./decoderreplacementfallbackbuffer/)(const DecoderReplacementFallbackPtr\&) | Konstruktor. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Menangani kegagalan decoding. |
| [get_Remaining](./get_remaining/)() const override | Mendapatkan jumlah karakter yang tersisa dalam buffer. |
| [GetNextChar](./getnextchar/)() override | Mendapatkan karakter berikutnya yang tersedia. |
| [MovePrevious](./moveprevious/)() override | Berpindah ke karakter sebelumnya. |
| [Reset](./reset/)() override | Mengatur ulang buffer ke keadaan awal (sebelum pemanggilan [Fallback()](./fallback/)). |
## Lihat Juga

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
