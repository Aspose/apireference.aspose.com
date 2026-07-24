---
title: "System::Xml::XmlSecureResolver::ResolveUri metode"
linktitle: "ResolveUri"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlSecureResolver::ResolveUri metode. Menyelesaikan URI absolut dari URI dasar dan relatif dengan memanggil ResolveUri pada XmlResolver yang mendasari dalam C++."
type: docs
weight: 300
url: /id/cpp/system.xml/xmlsecureresolver/resolveuri/
---
## XmlSecureResolver::ResolveUri method


Menyelesaikan URI absolut dari URI dasar dan relatif dengan memanggil **ResolveUri** pada [XmlResolver](../../xmlresolver/) yang mendasari.

```cpp
SharedPtr<Uri> System::Xml::XmlSecureResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | URI dasar yang digunakan untuk menyelesaikan URI relatif. |
| relativeUri | String | URI yang akan diselesaikan. URI dapat berupa absolut atau relatif. Jika absolut, nilai ini secara efektif menggantikan nilai **baseUri**. Jika relatif, nilai ini digabungkan dengan **baseUri** untuk membuat URI absolut. |

### ReturnValue

URI absolut atau **nullptr** jika URI relatif tidak dapat diselesaikan (dikembalikan dengan memanggil **ResolveUri** pada [XmlResolver](../../xmlresolver/) yang mendasari).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
