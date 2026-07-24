---
title: "System::Xml::Xsl::XsltArgumentList::GetParam metode"
linktitle: "GetParam"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Xsl::XsltArgumentList::GetParam metode. Mengembalikan parameter yang terkait dengan nama yang memenuhi syarat namespace dalam C++."
type: docs
weight: 600
url: /id/cpp/system.xml.xsl/xsltargumentlist/getparam/
---
## XsltArgumentList::GetParam method


Mengembalikan parameter yang terkait dengan nama yang memenuhi syarat namespace.

```cpp
SharedPtr<Object> System::Xml::Xsl::XsltArgumentList::GetParam(const String &name, const String &namespaceUri)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | const String\& | Nama parameter. [XsltArgumentList](../) tidak memeriksa untuk memastikan nama yang diberikan adalah nama lokal yang valid; namun, nama tidak boleh **nullptr**. |
| namespaceUri | const String\& | URI namespace yang terkait dengan parameter. |

### ReturnValue

Objek parameter atau **nullptr** jika tidak ditemukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XsltArgumentList](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
