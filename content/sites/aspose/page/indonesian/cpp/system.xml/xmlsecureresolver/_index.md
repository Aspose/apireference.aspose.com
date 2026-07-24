---
title: "Kelas System::Xml::XmlSecureResolver"
linktitle: "XmlSecureResolver"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlSecureResolver. Membantu mengamankan implementasi lain dari XmlResolver dengan membungkus objek XmlResolver dan membatasi sumber daya yang dapat diakses oleh XmlResolver yang mendasarinya dalam C++."
type: docs
weight: 3600
url: /id/cpp/system.xml/xmlsecureresolver/
---
## XmlSecureResolver class


Membantu mengamankan implementasi lain dari [XmlResolver](../xmlresolver/) dengan membungkus objek [XmlResolver](../xmlresolver/) dan membatasi sumber daya yang dapat diakses oleh [XmlResolver](../xmlresolver/) yang mendasarinya.

```cpp
class XmlSecureResolver : public System::Xml::XmlResolver
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Memetakan URI ke objek yang berisi sumber daya sebenarnya. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Menyelesaikan URI absolut dari URI dasar dan relatif dengan memanggil **ResolveUri** pada [XmlResolver](../xmlresolver/) yang mendasarinya. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Menetapkan kredensial yang digunakan untuk mengautentikasi permintaan web. |
| [XmlSecureResolver](./xmlsecureresolver/)(const SharedPtr\<XmlResolver\>\&, const String\&) | Menginisialisasi instance baru dari kelas [XmlSecureResolver](./) dengan [XmlResolver](../xmlresolver/) dan URL yang disediakan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
