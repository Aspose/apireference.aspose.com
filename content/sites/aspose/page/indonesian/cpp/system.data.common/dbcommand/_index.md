---
title: "System::Data::Common::DbCommand kelas"
linktitle: "DbCommand"
second_title: "Aspose.Page untuk C++"
description: "System::Data::Common::DbCommand kelas. Perintah basis data. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.data.common/dbcommand/
---
## DbCommand class


Perintah basis data. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class DbCommand : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | Menjalankan perintah non-kueri. |
| virtual [ExecuteReader](./executereader/)() | Menjalankan perintah kueri. |
| virtual [get_CommandText](./get_commandtext/)() const | Informasi RTTI. |
| virtual [get_Connection](./get_connection/)() const | Mendapatkan koneksi basis data yang terkait dengan perintah. |
| virtual [set_CommandText](./set_commandtext/)(String) const | Mengatur teks perintah DB. |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | Mendapatkan koneksi basis data yang terkait dengan perintah. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
