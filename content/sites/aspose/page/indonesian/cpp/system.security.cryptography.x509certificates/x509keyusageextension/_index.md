---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension kelas"
linktitle: "X509KeyUsageExtension"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension kelas. Objek ekstensi untuk menyimpan informasi tambahan tentang penggunaan sebuah kunci. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1600
url: /id/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


Objek ekstensi untuk menyimpan informasi tambahan tentang penggunaan sebuah kunci. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Menyalin data ekstensi dari objek lain. |
| [get_KeyUsages](./get_keyusages/)() | Mendapatkan penggunaan kunci. |
| [X509KeyUsageExtension](./x509keyusageextension/)() | Informasi RTTI. |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Konstruktor. |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | Konstruktor. |
## Lihat Juga

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
