---
title: "System::Security::Cryptography::AsnEncodedData class"
linktitle: "AsnEncodedData"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::AsnEncodedData class. Data yang dikodekan ASN.1. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


Data yang dikodekan ASN.1. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class AsnEncodedData : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | Informasi RTTI. |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | Konstruktor. |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | Konstruktor. |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | Konstruktor. |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | Menyalin data dari objek lain. |
| virtual [Format](./format/)(bool) const | Memformat data dalam bentuk yang dapat dibaca manusia. |
| [get_Oid](./get_oid/)() const | Mendapatkan pengidentifikasi objek dari data yang dikodekan. |
| [get_RawData](./get_rawdata/)() const | Mendapatkan data mentah yang dikodekan. |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | Mengatur pengidentifikasi objek dari data yang dikodekan. |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | Mengatur data mentah yang dikodekan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
