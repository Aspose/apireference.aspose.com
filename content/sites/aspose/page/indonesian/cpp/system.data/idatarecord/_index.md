---
title: "kelas System::Data::IDataRecord"
linktitle: "IDataRecord"
second_title: "Aspose.Page untuk C++"
description: "System::Data::IDataRecord class. Antarmuka untuk merekam dengan kolom. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.data/idatarecord/
---
## IDataRecord class


Antarmuka untuk merekam dengan kolom. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class IDataRecord : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | Informasi RTTI. |
| virtual [GetName](./getname/)(const int32_t) | Mendapatkan nama bidang pada posisi yang ditentukan. |
| virtual [idx_get](./idx_get/)(const int32_t) | Mendapatkan nilai pada indeks yang ditentukan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
