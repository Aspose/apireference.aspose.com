---
title: "kelas System::Text::EncoderExceptionFallbackBuffer"
linktitle: "EncoderExceptionFallbackBuffer"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Text::EncoderExceptionFallbackBuffer. Buffer untuk strategi fallback enkoding yang melempar pengecualian. Tidak menyimpan apa pun sebenarnya, tetapi melempar pengecualian sebagai gantinya. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.text/encoderexceptionfallbackbuffer/
---
## EncoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing encoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderExceptionFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [EncoderExceptionFallbackBuffer](./encoderexceptionfallbackbuffer/)() | Konstruktor. |
| [Fallback](./fallback/)(char_t, int) override | Menangani kegagalan enkoding. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Menangani kegagalan enkoding. |
| [get_Remaining](./get_remaining/)() const override | Mendapatkan jumlah karakter yang tersisa. |
| [GetNextChar](./getnextchar/)() override | Mendapatkan karakter berikutnya yang tersedia. |
| [MovePrevious](./moveprevious/)() override | Berpindah ke karakter sebelumnya. |
## Lihat Juga

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
