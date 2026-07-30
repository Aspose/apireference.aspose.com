---
title: "Metodo System::Xml::XmlDocument::CreateDocumentType"
linktitle: "CreateDocumentType"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlDocument::CreateDocumentType. Restituisce un nuovo oggetto XmlDocumentType in C++."
type: docs
weight: 700
url: /it/cpp/system.xml/xmldocument/createdocumenttype/
---
## XmlDocument::CreateDocumentType method


Restituisce un nuovo oggetto [XmlDocumentType](../../xmldocumenttype/).

```cpp
virtual SharedPtr<XmlDocumentType> System::Xml::XmlDocument::CreateDocumentType(const String &name, const String &publicId, const String &systemId, const String &internalSubset)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | const String\& | Nome del tipo di documento. |
| publicId | const String\& | L'identificatore pubblico del tipo di documento o **nullptr**. È possibile specificare un URI pubblico e anche un identificatore di sistema per identificare la posizione del sottoinsieme DTD esterno. |
| systemId | const String\& | L'identificatore di sistema del tipo di documento o **nullptr**. Specifica l'URL della posizione del file per il sottoinsieme DTD esterno. |
| internalSubset | const String\& | Il sottoinsieme interno DTD del tipo di documento o **nullptr**. |

### ReturnValue

Il nuovo [XmlDocumentType](../../xmldocumenttype/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDocumentType](../../xmldocumenttype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
