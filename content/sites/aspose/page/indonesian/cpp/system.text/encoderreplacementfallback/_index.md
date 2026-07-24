---
title: "kelas System::Text::EncoderReplacementFallback"
linktitle: "EncoderReplacementFallback"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Text::EncoderReplacementFallback. Menyediakan strategi fallback dengan mengganti simbol yang salah dengan stub. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.text/encoderreplacementfallback/
---
## EncoderReplacementFallback class


Menyediakan strategi fallback dengan mengganti simbol yang salah dengan stub. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class EncoderReplacementFallback : public System::Text::EncoderFallback
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Membuat buffer fallback. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)() | Konstruktor yang menggunakan string pengganti "?" default. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)(const String\&) | Konstruktor. |
| [get_DefaultString](./get_defaultstring/)() const | Mendapatkan string pengganti. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Mendapatkan jumlah maksimal karakter yang dapat dikembalikan oleh instance. |
## Lihat Juga

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
