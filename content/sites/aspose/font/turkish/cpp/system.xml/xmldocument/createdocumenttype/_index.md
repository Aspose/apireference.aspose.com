---
title: "System::Xml::XmlDocument::CreateDocumentType yöntemi"
linktitle: "CreateDocumentType"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlDocument::CreateDocumentType yöntemi. C++'ta yeni bir XmlDocumentType nesnesi döndürür."
type: docs
weight: 700
url: /tr/cpp/system.xml/xmldocument/createdocumenttype/
---
## XmlDocument::CreateDocumentType method


Yeni bir [XmlDocumentType](../../xmldocumenttype/) nesnesi döndürür.

```cpp
virtual SharedPtr<XmlDocumentType> System::Xml::XmlDocument::CreateDocumentType(const String &name, const String &publicId, const String &systemId, const String &internalSubset)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | const String\& | Belge türünün adı. |
| publicId | const String\& | Belge türünün genel tanımlayıcısı veya **nullptr**. Dış DTD alt kümesinin konumunu belirlemek için bir genel URI ve ayrıca bir sistem tanımlayıcısı belirtebilirsiniz. |
| systemId | const String\& | Belge türünün sistem tanımlayıcısı veya **nullptr**. Dış DTD alt kümesinin dosya konumunun URL'sini belirtir. |
| internalSubset | const String\& | Belge türünün DTD iç alt kümesi veya **nullptr**. |

### ReturnValue

Yeni [XmlDocumentType](../../xmldocumenttype/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDocumentType](../../xmldocumenttype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
