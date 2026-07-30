---
title: "System::Xml::XmlDocument::CreateDocumentType méthode"
linktitle: "CreateDocumentType"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlDocument::CreateDocumentType méthode. Renvoie un nouvel objet XmlDocumentType en C++."
type: docs
weight: 700
url: /fr/cpp/system.xml/xmldocument/createdocumenttype/
---
## XmlDocument::CreateDocumentType method


Renvoie un nouvel objet [XmlDocumentType](../../xmldocumenttype/).

```cpp
virtual SharedPtr<XmlDocumentType> System::Xml::XmlDocument::CreateDocumentType(const String &name, const String &publicId, const String &systemId, const String &internalSubset)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | const String\& | Nom du type de document. |
| publicId | const String\& | L'identifiant public du type de document ou **nullptr**. Vous pouvez spécifier un URI public ainsi qu'un identifiant système pour identifier l'emplacement du sous-ensemble DTD externe. |
| systemId | const String\& | L'identifiant système du type de document ou **nullptr**. Spécifie l'URL de l'emplacement du fichier pour le sous-ensemble DTD externe. |
| internalSubset | const String\& | Le sous-ensemble interne DTD du type de document ou **nullptr**. |

### ReturnValue

Le nouveau [XmlDocumentType](../../xmldocumenttype/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDocumentType](../../xmldocumenttype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
