---
title: "System::Text::RegularExpressions::Group class"
linktitle: "Group"
second_title: "Aspose.Page untuk C++"
description: "System::Text::RegularExpressions::Group class. Hasil pencocokan yang dilakukan oleh satu grup penangkap. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen di C++."
type: docs
weight: 300
url: /id/cpp/system.text.regularexpressions/group/
---
## Group class


Hasil pencocokan yang dilakukan oleh satu grup penangkap. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class Group : public System::Text::RegularExpressions::Capture
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Menambahkan penangkapan ke dalam grup. |
| [get_Captures](./get_captures/)() | Mendapatkan penangkapan yang tersedia. |
| [get_Success](./get_success/)() | Memeriksa apakah penangkapan berhasil untuk grup ini. |
| [Group](./group/)(const UStringPtr\&, int, int) | Konstruktor. |
| [Group](./group/)() | Konstruktor grup kosong. |
## Lihat Juga

* Class [Capture](../capture/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
