---
title: "kelas System::Xml::XmlUrlResolver"
linktitle: "XmlUrlResolver"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Xml::XmlUrlResolver. Menyelesaikan sumber daya XML eksternal yang dinamai oleh Uniform Resource Identifier (URI) dalam C++."
type: docs
weight: 4100
url: /id/cpp/system.xml/xmlurlresolver/
---
## XmlUrlResolver class


Menyelesaikan sumber daya XML eksternal yang dinamai oleh Uniform Resource Identifier (URI).

```cpp
class XmlUrlResolver : public System::Xml::XmlResolver
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Memetakan URI ke objek yang berisi sumber daya sebenarnya. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Menyelesaikan URI absolut dari URI dasar dan relatif. |
| [set_CachePolicy](./set_cachepolicy/)(const SharedPtr\<Net::Cache::RequestCachePolicy\>\&) | Menetapkan kebijakan cache untuk objek WebRequest yang mendasari. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Menetapkan kredensial yang digunakan untuk mengautentikasi permintaan web. |
| [set_Proxy](./set_proxy/)(const SharedPtr\<Net::IWebProxy\>\&) | Menetapkan proxy jaringan untuk objek WebRequest yang mendasari. |
| [XmlUrlResolver](./xmlurlresolver/)() | Menginisialisasi instance baru dari kelas [XmlUrlResolver](./). |
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
