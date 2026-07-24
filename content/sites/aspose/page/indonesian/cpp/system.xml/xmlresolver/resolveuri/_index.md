---
title: "System::Xml::XmlResolver::ResolveUri metode"
linktitle: "ResolveUri"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlResolver::ResolveUri metode. Ketika dioverride dalam kelas turunan, menyelesaikan URI absolut dari URI dasar dan relatif dalam C++."
type: docs
weight: 200
url: /id/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


Ketika dioverride dalam kelas turunan, menyelesaikan URI absolut dari URI dasar dan relatif.

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | URI dasar yang digunakan untuk menyelesaikan URI relatif. |
| relativeUri | String | URI yang akan diselesaikan. URI dapat berupa absolut atau relatif. Jika absolut, nilai ini secara efektif menggantikan nilai **baseUri**. Jika relatif, nilai ini digabungkan dengan **baseUri** untuk membuat URI absolut. |

### ReturnValue

URI absolut atau **nullptr** jika URI relatif tidak dapat diselesaikan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
