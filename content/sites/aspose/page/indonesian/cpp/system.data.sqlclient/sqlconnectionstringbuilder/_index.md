---
title: "Kelas System::Data::SqlClient::SqlConnectionStringBuilder"
linktitle: "SqlConnectionStringBuilder"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Data::SqlClient::SqlConnectionStringBuilder. Pembuat koneksi berbasis SQL. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.data.sqlclient/sqlconnectionstringbuilder/
---
## SqlConnectionStringBuilder class


Pembuat koneksi berbasis SQL. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class SqlConnectionStringBuilder : public System::Data::Common::DbConnectionStringBuilder
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_DataSource](./get_datasource/)() const | Mendapatkan sumber data (mis. nama host dan port). |
| [get_Encrypt](./get_encrypt/)() const | Memeriksa apakah enkripsi diaktifkan pada baris. |
| [get_InitialCatalog](./get_initialcatalog/)() const | Mendapatkan nama basis data yang terkait dengan koneksi. |
| [get_NetworkLibrary](./get_networklibrary/)() const | Mendapatkan nama perpustakaan jaringan yang digunakan. |
| [get_Password](./get_password/)() const | Mendapatkan kata sandi yang digunakan untuk terhubung ke basis data. |
| [get_TrustServerCertificate](./get_trustservercertificate/)() const | Memeriksa apakah koneksi dilindungi menggunakan sertifikat server tepercaya. |
| [get_UserID](./get_userid/)() const | Mendapatkan ID pengguna yang digunakan untuk koneksi. |
| [idx_get](./idx_get/)(String) override | Informasi RTTI. |
| [idx_set](./idx_set/)(String, Object::ptr) override | Mengatur objek berkey. |
| [set_DataSource](./set_datasource/)(const String\&) | Mendapatkan sumber data (mis. nama host dan port). |
| [set_Encrypt](./set_encrypt/)(bool) | Mengaktifkan atau menonaktifkan enkripsi. |
| [set_InitialCatalog](./set_initialcatalog/)(const String\&) | Mengatur nama basis data yang terkait dengan koneksi. |
| [set_NetworkLibrary](./set_networklibrary/)(const String\&) | Memilih pustaka jaringan yang akan digunakan. |
| [set_Password](./set_password/)(const String\&) | Mengatur kata sandi yang akan digunakan untuk terhubung ke basis data. |
| [set_TrustServerCertificate](./set_trustservercertificate/)(bool) | Menentukan apakah koneksi dilindungi menggunakan sertifikat server tepercaya. |
| [set_UserID](./set_userid/)(const String\&) | Mengatur ID pengguna yang akan digunakan untuk koneksi. |
## Lihat Juga

* Class [DbConnectionStringBuilder](../../system.data.common/dbconnectionstringbuilder/)
* Namespace [System::Data::SqlClient](../)
* Library [Aspose.Page for C++](../../)
