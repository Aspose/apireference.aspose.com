---
title: "Kelas System::Text::DecoderExceptionFallbackBuffer"
linktitle: "DecoderExceptionFallbackBuffer"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Text::DecoderExceptionFallbackBuffer. Buffer untuk strategi fallback decoding yang melempar pengecualian. Sebenarnya tidak menyimpan apa pun, melainkan melempar pengecualian. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system.text/decoderexceptionfallbackbuffer/
---
## DecoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing decoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DecoderExceptionFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [DecoderExceptionFallbackBuffer](./decoderexceptionfallbackbuffer/)() | Konstruktor. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Menangani kegagalan decoding. |
| [get_Remaining](./get_remaining/)() const override | Mendapatkan jumlah karakter yang tersisa. |
| [GetNextChar](./getnextchar/)() override | Mendapatkan karakter berikutnya yang tersedia. |
| [MovePrevious](./moveprevious/)() override | Berpindah ke karakter sebelumnya. |
## Lihat Juga

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
