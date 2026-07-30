---
title: "Methode System::Xml::XmlDocument::CreateDocumentType"
linktitle: "CreateDocumentType"
second_title: "Aspose.Font für C++"
description: "Methode System::Xml::XmlDocument::CreateDocumentType. Gibt ein neues XmlDocumentType-Objekt in C++ zurück."
type: docs
weight: 700
url: /de/cpp/system.xml/xmldocument/createdocumenttype/
---
## XmlDocument::CreateDocumentType method


Gibt ein neues [XmlDocumentType](../../xmldocumenttype/) Objekt zurück.

```cpp
virtual SharedPtr<XmlDocumentType> System::Xml::XmlDocument::CreateDocumentType(const String &name, const String &publicId, const String &systemId, const String &internalSubset)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | const String\& | Name des Dokumenttyps. |
| publicId | const String\& | Der öffentliche Bezeichner des Dokumenttyps oder **nullptr**. Sie können eine öffentliche URI angeben und auch einen Systembezeichner, um den Ort des externen DTD-Teilsatzes zu identifizieren. |
| systemId | const String\& | Der Systembezeichner des Dokumenttyps oder **nullptr**. Gibt die URL des Dateistandorts für den externen DTD-Teilsatz an. |
| internalSubset | const String\& | Der interne DTD-Teilsatz des Dokumenttyps oder **nullptr**. |

### ReturnValue

Der neue [XmlDocumentType](../../xmldocumenttype/).

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDocumentType](../../xmldocumenttype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
