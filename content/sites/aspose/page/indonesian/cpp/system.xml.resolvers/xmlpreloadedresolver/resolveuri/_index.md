---
title: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri method"
linktitle: "ResolveUri"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri method. Menyelesaikan URI absolut dari URI dasar dan relatif dalam C++."
type: docs
weight: 600
url: /id/cpp/system.xml.resolvers/xmlpreloadedresolver/resolveuri/
---
## XmlPreloadedResolver::ResolveUri method


Menyelesaikan URI absolut dari URI dasar dan relatif.

```cpp
SharedPtr<Uri> System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | URI dasar yang digunakan untuk menyelesaikan URI relatif. |
| relativeUri | String | URI yang akan diselesaikan. URI dapat berupa absolut atau relatif. Jika absolut, nilai ini secara efektif menggantikan nilai **baseUri**. Jika relatif, nilai ini digabungkan dengan **baseUri** untuk membuat URI absolut. |

### ReturnValue

[Uri](../../../system/uri/) yang mewakili URI absolut atau **nullptr** jika URI relatif tidak dapat diselesaikan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
