---
title: "System::Security::Cryptography::Pkcs::SignedCms kelas"
linktitle: "SignedCms"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::Pkcs::SignedCms kelas. Menandatangani konten sesuai standar CMS/PKCS #7. Tidak diimplementasikan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


Menandatangani konten sesuai standar CMS/PKCS #7. Tidak diimplementasikan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class SignedCms : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ComputeSignature](./computesignature/)(const SharedPtr\<CmsSigner\>\&, bool) | Membuat tanda tangan. |
| [Encode](./encode/)() | Menkode pesan CMS/PKCS #7. |
| [SignedCms](./signedcms/)(const SharedPtr\<ContentInfo\>\&, bool) | Konstruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
