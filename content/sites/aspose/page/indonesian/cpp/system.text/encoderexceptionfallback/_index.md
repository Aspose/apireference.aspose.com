---
title: "System::Text::EncoderExceptionFallback class"
linktitle: "EncoderExceptionFallback"
second_title: "Aspose.Page untuk C++"
description: "System::Text::EncoderExceptionFallback class. Menyediakan strategi fallback yang melempar pengecualian. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.text/encoderexceptionfallback/
---
## EncoderExceptionFallback class


Menyediakan strategi fallback yang melempar pengecualian. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class EncoderExceptionFallback : public System::Text::EncoderFallback
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Membuat buffer fallback. |
| [EncoderExceptionFallback](./encoderexceptionfallback/)() | Konstruktor. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Mendapatkan jumlah maksimal karakter yang dapat dikembalikan oleh instance. |
## Lihat Juga

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
