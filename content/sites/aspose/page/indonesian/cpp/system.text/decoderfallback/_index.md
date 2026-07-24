---
title: "System::Text::DecoderFallback kelas"
linktitle: "DecoderFallback"
second_title: "Aspose.Page untuk C++"
description: "System::Text::DecoderFallback kelas. Menyediakan API fallback untuk menangani kesalahan decoding. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 500
url: /id/cpp/system.text/decoderfallback/
---
## DecoderFallback class


Menyediakan API fallback untuk menangani kesalahan decoding. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class DecoderFallback : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | Mendapatkan buffer yang terkait dengan algoritma fallback. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | Mendapatkan implementasi fallback pengecualian default. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | Mendapatkan jumlah maksimum karakter yang dapat dikembalikan oleh fallback. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | Mendapatkan implementasi fallback pengganti default. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | Mendapatkan implementasi fallback standar aman default. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
