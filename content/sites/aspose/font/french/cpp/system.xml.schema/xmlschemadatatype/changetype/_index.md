---
title: "System::Xml::Schema::XmlSchemaDatatype::ChangeType méthode"
linktitle: "ModifierType"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ChangeType méthode. Convertit la valeur spécifiée, dont le type est l'une des représentations valides du type de schéma XML représenté par le XmlSchemaDatatype, en le type d'exécution spécifié en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml.schema/xmlschemadatatype/changetype/
---
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&) method


Convertit la valeur spécifiée, dont le type est l'une des représentations valides du type de schéma XML représenté par le [XmlSchemaDatatype](../), en le type d'exécution spécifié.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | SharedPtr\<Object\> | La valeur d'entrée à convertir au type spécifié. |
| typeCible | const TypeInfo\& | Le type cible vers lequel convertir la valeur d'entrée. |

### ReturnValue

La valeur d'entrée convertie.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Convertit la valeur spécifiée, dont le type est l'une des représentations valides du type de schéma XML représenté par le [XmlSchemaDatatype](../), en le type d'exécution spécifié à l'aide du [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) si le [XmlSchemaDatatype](../) représente le type **xs:QName** ou un type dérivé de celui‑ci.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | SharedPtr\<Object\> | La valeur d'entrée à convertir au type spécifié. |
| typeCible | const TypeInfo\& | Le type cible vers lequel convertir la valeur d'entrée. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Un [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilisé pour résoudre les préfixes d'espace de noms. Cela n'est utile que si le [XmlSchemaDatatype](../) représente le type **xs:QName** ou un type dérivé de celui‑ci. |

### ReturnValue

La valeur d'entrée convertie.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
