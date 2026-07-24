---
title: "System::Drawing::Text::PrivateFontCollection kelas"
linktitle: "PrivateFontCollection"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Text::PrivateFontCollection kelas. Mewakili kumpulan keluarga font yang disediakan oleh aplikasi klien. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


Mewakili kumpulan keluarga font yang disediakan oleh aplikasi klien. Objek dari kelas ini hanya boleh dialokasikan menggunakan [System::MakeObject()](../../system/makeobject/) fungsi. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | Menambahkan font yang ditentukan ke dalam koleksi. |
| [AddFontFile](./addfontfile/)(const String\&) | Menambahkan font dari file yang ditentukan ke dalam koleksi. |
| [get_Families](./get_families/)() override | Mengembalikan array objek [FontFamily](../../system.drawing/fontfamily/) yang terkait dengan koleksi font yang diwakili oleh objek saat ini. |
## Lihat Juga

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Page for C++](../../)
