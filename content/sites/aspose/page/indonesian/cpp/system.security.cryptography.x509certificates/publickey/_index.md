---
title: "System::Security::Cryptography::X509Certificates::PublicKey kelas"
linktitle: "PublicKey"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::X509Certificates::PublicKey kelas. Mewakili informasi kunci publik dari sertifikat X509. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.security.cryptography.x509certificates/publickey/
---
## PublicKey class


Mewakili informasi kunci publik dari sertifikat X509. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class PublicKey : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_EncodedKeyValue](./get_encodedkeyvalue/)() const | Mendapatkan nilai kunci publik yang dienkode ASN.1. |
| [get_EncodedParameters](./get_encodedparameters/)() const | Mendapatkan parameter kunci publik yang dienkode ASN.1. |
| [get_Key](./get_key/)() const | Mendapatkan sebuah [RSACryptoServiceProvider](../../system.security.cryptography/rsacryptoserviceprovider/) atau [DSACryptoServiceProvider](../../system.security.cryptography/dsacryptoserviceprovider/). |
| [get_Oid](./get_oid/)() const | Mendapatkan pengidentifikasi (OID) kunci publik. |
| [PublicKey](./publickey/)(const SharedPtr\<Oid\>\&, const SharedPtr\<AsnEncodedData\>\&, const SharedPtr\<AsnEncodedData\>) | Konstruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
