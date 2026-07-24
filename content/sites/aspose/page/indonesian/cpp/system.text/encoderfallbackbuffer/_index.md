---
title: "System::Text::EncoderFallbackBuffer kelas"
linktitle: "EncoderFallbackBuffer"
second_title: "Aspose.Page untuk C++"
description: "System::Text::EncoderFallbackBuffer kelas. Menyediakan buffer untuk implementasi fallback. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.text/encoderfallbackbuffer/
---
## EncoderFallbackBuffer class


Menyediakan buffer untuk implementasi fallback. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class EncoderFallbackBuffer : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Fallback](./fallback/)(char_t, int) | Mengimplementasikan prosedur fallback aktual. |
| virtual [Fallback](./fallback/)(char_t, char_t, int) | Mengimplementasikan prosedur fallback aktual. |
| virtual [get_Remaining](./get_remaining/)() const | Mendapatkan jumlah karakter yang tersisa untuk diproses. |
| virtual [GetNextChar](./getnextchar/)() | Mengambil karakter berikutnya dalam buffer fallback. |
| virtual [MovePrevious](./moveprevious/)() | Memindahkan posisi buffer satu langkah mundur jika memungkinkan. |
| virtual [Reset](./reset/)() | Mengatur ulang buffer ke keadaan awal. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
