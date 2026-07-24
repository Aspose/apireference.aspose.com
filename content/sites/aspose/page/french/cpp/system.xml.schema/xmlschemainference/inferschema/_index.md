---
title: "System::Xml::Schema::XmlSchemaInference::InferSchema méthode"
linktitle: "InferSchema"
second_title: "Aspose.Page pour C++"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema méthode. Déduit un schéma XML Schema Definition Language (XSD) à partir du document XML contenu dans l'objet XmlReader spécifié en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


Déduit un schéma XML [Schema](../../) Definition Language (XSD) à partir du document XML contenu dans l'objet [XmlReader](../../../system.xml/xmlreader/) spécifié.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Un objet [XmlReader](../../../system.xml/xmlreader/) contenant le document XML à partir duquel déduire un schéma. |

### ReturnValue

Un objet [XmlSchemaSet](../../xmlschemaset/) contenant les schémas déduits.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


Déduit un schéma XML [Schema](../../) Definition Language (XSD) à partir du document XML contenu dans l'objet [XmlReader](../../../system.xml/xmlreader/) spécifié, et affine le schéma déduit en utilisant un schéma existant dans l'objet [XmlSchemaSet](../../xmlschemaset/) spécifié avec le même espace de noms cible.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Un objet [XmlReader](../../../system.xml/xmlreader/) contenant le document XML à partir duquel déduire un schéma. |
| schemas | SharedPtr\<XmlSchemaSet\> | Un objet [XmlSchemaSet](../../xmlschemaset/) contenant un schéma existant utilisé pour affiner le schéma déduit. |

### ReturnValue

Un objet [XmlSchemaSet](../../xmlschemaset/) contenant les schémas déduits.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
