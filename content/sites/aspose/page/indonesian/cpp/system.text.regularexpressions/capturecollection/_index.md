---
title: "System::Text::RegularExpressions::CaptureCollection class"
linktitle: "CaptureCollection"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Text::RegularExpressions::CaptureCollection. Daftar penangkapan yang dilakukan oleh satu grup penangkap. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 200
url: /id/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


Daftar penangkapan yang dilakukan oleh satu grup penangkap. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | Menonaktifkan perubahan koleksi. |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Metode layanan untuk menambahkan penangkapan ke dalam koleksi. |
| [Clear](./clear/)() override | Menonaktifkan pembersihan koleksi. |
| [get_Count](./get_count/)() const override | Mendapatkan jumlah penangkapan. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Menandai koleksi sebagai hanya-baca. |
| [get_IsSynchronized](./get_issynchronized/)() const | Menandai koleksi sebagai tidak tersinkronisasi. |
| [idx_get](./idx_get/)(int) const override | [Capture](../capture/) akses. |
| [operator[]](./operator[]/)(int) | [Capture](../capture/) akses. |
| [operator[]](./operator[]/)(int) const | [Capture](../capture/) akses. |
| [Remove](./remove/)(const CapturePtr\&) override | Menonaktifkan perubahan koleksi. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Base](./base/) | [Base](./base/) tipe. |
## Lihat Juga

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
