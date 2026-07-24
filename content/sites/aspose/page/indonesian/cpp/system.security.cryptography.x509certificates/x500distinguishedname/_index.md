---
title: "System::Security::Cryptography::X509Certificates::X500DistinguishedName kelas"
linktitle: "X500DistinguishedName"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::X509Certificates::X500DistinguishedName kelas. Mewakili distinguished name dari sertifikat X509. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 200
url: /id/cpp/system.security.cryptography.x509certificates/x500distinguishedname/
---
## X500DistinguishedName class


Mewakili distinguished name dari sertifikat X509. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class X500DistinguishedName : public System::Security::Cryptography::AsnEncodedData
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Decode](./decode/)(X500DistinguishedNameFlags) const | Mendekode nama menggunakan parameter yang ditentukan oleh flag. |
| [Format](./format/)(bool) const override | Memformat nama untuk pencetakan. |
| [get_Name](./get_name/)() const | Mendapatkan distinguished name sertifikat. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<AsnEncodedData\>\&) | Informasi RTTI. |
| [X500DistinguishedName](./x500distinguishedname/)(const ByteArrayPtr\&) | Konstruktor. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&) | Konstruktor. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<X500DistinguishedName\>\&) | Konstruktor penyalinan. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&, X500DistinguishedNameFlags) | Konstruktor. |
## Lihat Juga

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
