---
title: "méthode System::Xml::XmlReader::get_SchemaInfo"
linktitle: "get_SchemaInfo"
second_title: "Aspose.Font pour C++"
description: "méthode System::Xml::XmlReader::get_SchemaInfo. Retourne les informations de schéma qui ont été assignées au nœud actuel à la suite d'une validation de schéma en C++."
type: docs
weight: 2200
url: /fr/cpp/system.xml/xmlreader/get_schemainfo/
---
## XmlReader::get_SchemaInfo method


Renvoie les informations de schéma qui ont été assignées au nœud actuel à la suite de la validation du schéma.

```cpp
virtual SharedPtr<Schema::IXmlSchemaInfo> System::Xml::XmlReader::get_SchemaInfo()
```


### ReturnValue

Un objet IXmlSchemaInfo contenant les informations de schéma pour le nœud actuel. Les informations [Schema](../../../system.xml.schema/) peuvent être définies sur les éléments, les attributs ou sur les nœuds texte avec une valeur non nulle de [XmlReader::get_ValueType](../get_valuetype/). Si le nœud actuel n'est pas l'un des types de nœuds ci‑dessus, ou si l'instance [XmlReader](../) ne rapporte pas d'informations de schéma, cette méthode retourne **nullptr**. Si cette méthode est appelée depuis un objet [XmlTextReader](../../xmltextreader/) ou [XmlValidatingReader](../../xmlvalidatingreader/), elle retourne toujours **nullptr**. Ces implémentations de [XmlReader](../) n'exposent pas les informations de schéma via la méthode get_SchemaInfo.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlSchemaInfo](../../../system.xml.schema/ixmlschemainfo/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
