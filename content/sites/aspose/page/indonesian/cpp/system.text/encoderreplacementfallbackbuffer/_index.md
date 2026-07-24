---
title: "System::Text::EncoderReplacementFallbackBuffer kelas"
linktitle: "EncoderReplacementFallbackBuffer"
second_title: "Aspose.Page untuk C++"
description: "System::Text::EncoderReplacementFallbackBuffer kelas. Buffer untuk menggantikan strategi fallback enkoding. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1500
url: /id/cpp/system.text/encoderreplacementfallbackbuffer/
---
## EncoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing encoding fallback strategy. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderReplacementFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [EncoderReplacementFallbackBuffer](./encoderreplacementfallbackbuffer/)(const EncoderReplacementFallbackPtr\&) | Konstruktor. |
| [Fallback](./fallback/)(char_t, int) override | Menangani kegagalan enkoding. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Menangani kegagalan enkoding. |
| [get_Remaining](./get_remaining/)() const override | Mendapatkan jumlah karakter yang tersisa dalam buffer. |
| [GetNextChar](./getnextchar/)() override | Mendapatkan karakter berikutnya yang tersedia. |
| [MovePrevious](./moveprevious/)() override | Berpindah ke karakter sebelumnya. |
| [Reset](./reset/)() override | Mengatur ulang buffer ke keadaan awal (sebelum pemanggilan [Fallback()](./fallback/)). |
## Lihat Juga

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
