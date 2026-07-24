---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute méthode"
linktitle: "ValidateAttribute"
second_title: "Aspose.Page pour C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute méthode. Valide le nom de l'attribut, l'URI de l'espace de noms et la valeur dans le contexte de l'élément actuel en C++."
type: docs
weight: 1600
url: /fr/cpp/system.xml.schema/xmlschemavalidator/validateattribute/
---
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Valide le nom de l'attribut, l'URI de l'espace de noms et la valeur dans le contexte de l'élément actuel.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, const String &attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | const String\& | Le nom local de l'attribut à valider. |
| namespaceUri | const String\& | L'URI d'espace de noms de l'attribut à valider. |
| attributeValue | const String\& | La valeur de l'attribut à valider. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Un objet [XmlSchemaInfo](../../xmlschemainfo/) dont les propriétés sont définies lors d'une validation réussie de l'attribut. Ce paramètre peut être **nullptr**. |

### ReturnValue

La valeur de l'attribut validé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) method


Valide le nom de l'attribut, l'URI de l'espace de noms et la valeur dans le contexte de l'élément actuel.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, XmlValueGetter attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | const String\& | Le nom local de l'attribut à valider. |
| namespaceUri | const String\& | L'URI d'espace de noms de l'attribut à valider. |
| attributeValue | XmlValueGetter | Un rappel [XmlValueGetter](../../xmlvaluegetter/) utilisé pour transmettre la valeur de l'attribut sous un type compatible avec le type du langage de définition de schéma XML [Schema](../../) (XSD) de l'attribut. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Un objet [XmlSchemaInfo](../../xmlschemainfo/) dont les propriétés sont définies lors d'une validation réussie de l'attribut. Ce paramètre peut être **nullptr**. |

### ReturnValue

La valeur de l'attribut validé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
