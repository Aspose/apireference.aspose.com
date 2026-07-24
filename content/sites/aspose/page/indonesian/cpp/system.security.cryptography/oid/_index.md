---
title: "System::Security::Cryptography::Oid kelas"
linktitle: "Oid"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::Oid kelas. Pengidentifikasi objek kriptografi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2500
url: /id/cpp/system.security.cryptography/oid/
---
## Oid class


Pengidentifikasi objek kriptografi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class Oid : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | Buat objek OID dari nama ramah OID yang ditentukan. |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | Buat objek OID dari nilai OID yang ditentukan. |
| [get_FriendlyName](./get_friendlyname/)() const | Mendapatkan nama ramah pengguna dari objek. |
| [get_Value](./get_value/)() const | Mendapatkan string pengidentifikasi objek. |
| [Oid](./oid/)() | Informasi RTTI. |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | Konstruktor penyalinan. |
| [Oid](./oid/)(const String\&) | Konstruktor. |
| [Oid](./oid/)(const String\&, const String\&) | Konstruktor. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Mengatur nama ramah pengguna dari objek. |
| [set_Value](./set_value/)(const String\&) | Mengatur string pengidentifikasi objek. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
