---
title: "System::Xml::XmlDocument::CreateDocumentType metode"
linktitle: "CreateDocumentType"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlDocument::CreateDocumentType metode. Mengembalikan objek XmlDocumentType baru dalam C++."
type: docs
weight: 700
url: /id/cpp/system.xml/xmldocument/createdocumenttype/
---
## XmlDocument::CreateDocumentType method


Mengembalikan objek [XmlDocumentType](../../xmldocumenttype/) baru.

```cpp
virtual SharedPtr<XmlDocumentType> System::Xml::XmlDocument::CreateDocumentType(const String &name, const String &publicId, const String &systemId, const String &internalSubset)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | const String\& | Nama tipe dokumen. |
| publicId | const String\& | Pengidentifikasi publik dari tipe dokumen atau **nullptr**. Anda dapat menentukan URI publik dan juga pengidentifikasi sistem untuk mengidentifikasi lokasi subset DTD eksternal. |
| systemId | const String\& | Pengidentifikasi sistem dari tipe dokumen atau **nullptr**. Menentukan URL lokasi berkas untuk subset DTD eksternal. |
| internalSubset | const String\& | Subset internal DTD dari tipe dokumen atau **nullptr**. |

### ReturnValue

[XmlDocumentType](../../xmldocumenttype/) baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDocumentType](../../xmldocumenttype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
