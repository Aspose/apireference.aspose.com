---
title: "kelas System::Xml::XmlResolver"
linktitle: "XmlResolver"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlResolver. Menyelesaikan sumber daya XML eksternal yang dinamai oleh Uniform Resource Identifier (URI) dalam C++."
type: docs
weight: 3500
url: /id/cpp/system.xml/xmlresolver/
---
## XmlResolver class


Menyelesaikan sumber daya XML eksternal yang dinamai oleh Uniform Resource Identifier (URI).

```cpp
class XmlResolver : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | Ketika dioverride dalam kelas turunan, memetakan sebuah URI ke objek yang berisi sumber daya aktual. |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | Ketika dioverride dalam kelas turunan, menyelesaikan URI absolut dari URI dasar dan relatif. |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | Ketika dioverride dalam kelas turunan, mengatur kredensial yang digunakan untuk mengotentikasi permintaan web. |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | Mengizinkan resolver mengembalikan tipe selain Stream. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
