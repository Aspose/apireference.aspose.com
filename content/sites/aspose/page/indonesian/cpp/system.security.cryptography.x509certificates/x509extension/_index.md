---
title: "System::Security::Cryptography::X509Certificates::X509Extension kelas"
linktitle: "X509Extension"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::X509Certificates::X509Extension kelas. Objek ekstensi untuk menyimpan informasi tambahan yang terkait dengan sertifikat X.509. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.security.cryptography.x509certificates/x509extension/
---
## X509Extension class


Objek ekstensi untuk menyimpan informasi tambahan yang terkait dengan sertifikat X.509. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class X509Extension : public System::Security::Cryptography::AsnEncodedData
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Menyalin data ekstensi dari objek lain. |
| [get_Critical](./get_critical/)() const | Memeriksa apakah ekstensi bersifat kritis. |
| [set_Critical](./set_critical/)(bool) | Mendefinisikan apakah ekstensi bersifat kritis. |
| [X509Extension](./x509extension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Informasi RTTI. |
| [X509Extension](./x509extension/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&, bool) | Konstruktor. |
| [X509Extension](./x509extension/)(const String\&, const ByteArrayPtr\&, bool) | Konstruktor. |
## Lihat Juga

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
