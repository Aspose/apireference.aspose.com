---
title: "System::Data::Common::DbDataReader kelas"
linktitle: "DbDataReader"
second_title: "Aspose.Page untuk C++"
description: "System::Data::Common::DbDataReader kelas. API untuk menerima data dari basis data. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


API untuk menerima data dari basis data. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class DbDataReader : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Close](./close/)() | Menutup saluran pengambilan data. |
| virtual [idx_get](./idx_get/)(String) | Mendapatkan item bernama. |
| virtual [idx_get](./idx_get/)(int) | Mendapatkan item berdasarkan indeks. |
| virtual [Read](./read/)() | Membaca rekaman berikutnya dari basis data. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Informasi RTTI. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
