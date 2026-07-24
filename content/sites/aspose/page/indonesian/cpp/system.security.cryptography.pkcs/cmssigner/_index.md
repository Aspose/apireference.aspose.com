---
title: "System::Security::Cryptography::Pkcs::CmsSigner kelas"
linktitle: "CmsSigner"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::Pkcs::CmsSigner kelas. Menyediakan API untuk menandatangani objek menggunakan CMS. Tidak menandatangani objek secara langsung, gunakan kelas SignedCMS untuk melakukannya. Tidak diimplementasikan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.security.cryptography.pkcs/cmssigner/
---
## CmsSigner class


Menyediakan API untuk menandatangani objek menggunakan CMS. Tidak menandatangani objek secara langsung, gunakan kelas SignedCMS untuk melakukannya. Tidak diimplementasikan. Objek dari kelas ini hanya boleh dialokasikan menggunakan [System::MakeObject()](../../system/makeobject/) fungsi. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class CmsSigner : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CmsSigner](./cmssigner/)(const SharedPtr\<X509Certificates::X509Certificate2\>\&) | Menginisialisasi penandatangan dengan sertifikat X509. |
| [get_DigestAlgorithm](./get_digestalgorithm/)() const | Mendapatkan algoritma hash yang digunakan dengan tanda tangan. |
| [get_IncludeOption](./get_includeoption/)() const | Memeriksa sertifikat mana dari rantai yang akan dimasukkan ke dalam tanda tangan. |
| [set_DigestAlgorithm](./set_digestalgorithm/)(const SharedPtr\<Oid\>\&) | Mengatur algoritma hash yang digunakan dengan tanda tangan. |
| [set_IncludeOption](./set_includeoption/)(X509Certificates::X509IncludeOption) | Menentukan sertifikat mana dari rantai yang akan dimasukkan ke dalam tanda tangan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
