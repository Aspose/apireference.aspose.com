---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get méthode"
linktitle: "idx_get"
second_title: "Aspose.Page pour C++"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get méthode. Retourne le XmlSchema associé à l'URI d'espace de noms fourni en C++."
type: docs
weight: 800
url: /fr/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


Retourne le [XmlSchema](../../xmlschema/) associé à l'URI d'espace de noms fourni.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| ns | const String\& | L'URI d'espace de noms associé au schéma que vous souhaitez retourner. Ce sera généralement le **targetNamespace** du schéma. |

### ReturnValue

Le [XmlSchema](../../xmlschema/) associé à l'URI d'espace de noms ; **nullptr** s'il n'existe aucun schéma chargé associé à l'espace de noms fourni ou si l'espace de noms est associé à un schéma XDR.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
