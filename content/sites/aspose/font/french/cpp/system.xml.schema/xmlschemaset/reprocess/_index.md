---
title: "Méthode System::Xml::Schema::XmlSchemaSet::Reprocess"
linktitle: "Reprocess"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::Schema::XmlSchemaSet::Reprocess. Reprocède un schéma de langage de définition XML Schema (XSD) qui existe déjà dans le XmlSchemaSet en C++."
type: docs
weight: 1500
url: /fr/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


Reprocède un schéma de langage de définition XML [Schema](../../) (XSD) qui existe déjà dans le [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| schéma | SharedPtr\<XmlSchema\> | Le schéma à retraiter. |

### ReturnValue

Un objet [XmlSchema](../../xmlschema/) si le schéma est valide. Si le schéma n'est pas valide et qu'un [ValidationEventHandler](../../validationeventhandler/) est spécifié, **nullptr** est renvoyé et l'événement de validation approprié est déclenché. Sinon, une [XmlSchemaException](../../xmlschemaexception/) est levée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
