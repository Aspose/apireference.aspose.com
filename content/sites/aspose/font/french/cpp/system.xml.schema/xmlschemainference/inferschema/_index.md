---
title: "Méthode System::Xml::Schema::XmlSchemaInference::InferSchema"
linktitle: "InferSchema"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema méthode. Infère un schéma XML Schema Definition Language (XSD) à partir du document XML contenu dans l'objet XmlReader spécifié en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


Infère un schéma XML [Schema](../../) Definition Language (XSD) à partir du document XML contenu dans l'objet [XmlReader](../../../system.xml/xmlreader/) spécifié.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Un objet [XmlReader](../../../system.xml/xmlreader/) contenant le document XML à partir duquel inférer un schéma. |

### ReturnValue

Un objet [XmlSchemaSet](../../xmlschemaset/) contenant les schémas inférés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


Infère un schéma XML [Schema](../../) Definition Language (XSD) à partir du document XML contenu dans l'objet [XmlReader](../../../system.xml/xmlreader/) spécifié, et affine le schéma inféré en utilisant un schéma existant dans l'objet [XmlSchemaSet](../../xmlschemaset/) spécifié avec le même espace de noms cible.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Un objet [XmlReader](../../../system.xml/xmlreader/) contenant le document XML à partir duquel inférer un schéma. |
| schemas | SharedPtr\<XmlSchemaSet\> | Un objet [XmlSchemaSet](../../xmlschemaset/) contenant un schéma existant utilisé pour affiner le schéma inféré. |

### ReturnValue

Un objet [XmlSchemaSet](../../xmlschemaset/) contenant les schémas inférés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
