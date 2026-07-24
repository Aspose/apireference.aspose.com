---
title: "Kelas System::Text::DecoderReplacementFallback"
linktitle: "DecoderReplacementFallback"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Text::DecoderReplacementFallback. Menyediakan strategi fallback dengan mengganti simbol yang salah dengan stub. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen di C++."
type: docs
weight: 700
url: /id/cpp/system.text/decoderreplacementfallback/
---
## DecoderReplacementFallback class


Menyediakan strategi fallback dengan mengganti simbol yang salah dengan stub. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class DecoderReplacementFallback : public System::Text::DecoderFallback
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Membuat buffer fallback. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)() | Konstruktor yang menggunakan string pengganti "?" default. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)(const String\&) | Konstruktor. |
| [get_DefaultString](./get_defaultstring/)() const | Mendapatkan string pengganti. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Mendapatkan jumlah maksimal karakter yang dapat dikembalikan oleh instance. |
## Lihat Juga

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
