---
title: "System::Xml::XmlDocument::CreateDocumentType method"
linktitle: "CreateDocumentType"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDocument::CreateDocumentType method. Retourneert een nieuw XmlDocumentType-object in C++."
type: docs
weight: 700
url: /nl/cpp/system.xml/xmldocument/createdocumenttype/
---
## XmlDocument::CreateDocumentType method


Retourneert een nieuw [XmlDocumentType](../../xmldocumenttype/) object.

```cpp
virtual SharedPtr<XmlDocumentType> System::Xml::XmlDocument::CreateDocumentType(const String &name, const String &publicId, const String &systemId, const String &internalSubset)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | const String\& | Naam van het documenttype. |
| publicId | const String\& | De publieke identifier van het documenttype of **nullptr**. U kunt een publieke URI opgeven en ook een systeemidentifier om de locatie van de externe DTD-subset te identificeren. |
| systemId | const String\& | De systeemidentifier van het documenttype of **nullptr**. Specificeert de URL van de bestandslocatie voor de externe DTD-subset. |
| internalSubset | const String\& | De interne DTD-subset van het documenttype of **nullptr**. |

### ReturnValue

De nieuwe [XmlDocumentType](../../xmldocumenttype/).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDocumentType](../../xmldocumenttype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
