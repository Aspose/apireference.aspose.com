---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateElement method"
linktitle: "ValidateElement"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateElement method. Valide l'élément dans le contexte actuel en C++."
type: docs
weight: 1700
url: /fr/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Valide l'élément dans le contexte actuel.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | const String\& | Le nom local de l'élément à valider. |
| namespaceUri | const String\& | L'URI d'espace de noms de l'élément à valider. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Un objet [XmlSchemaInfo](../../xmlschemainfo/) dont les propriétés sont définies après une validation réussie du nom de l'élément. Ce paramètre peut être **nullptr**. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


Valide l'élément dans le contexte actuel avec les valeurs d'attribut **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation** et **xsi:NoNamespaceSchemaLocation** spécifiées.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | const String\& | Le nom local de l'élément à valider. |
| namespaceUri | const String\& | L'URI d'espace de noms de l'élément à valider. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Un objet [XmlSchemaInfo](../../xmlschemainfo/) dont les propriétés sont définies après une validation réussie du nom de l'élément. Ce paramètre peut être **nullptr**. |
| xsiType | const String\& | La valeur de l'attribut **xsi:Type** de l'élément. Ce paramètre peut être **nullptr**. |
| xsiNil | const String\& | La valeur de l'attribut **xsi:Nil** de l'élément. Ce paramètre peut être **nullptr**. |
| xsiSchemaLocation | const String\& | La valeur d'attribut **xsi:SchemaLocation** de l'élément. Ce paramètre peut être **nullptr**. |
| xsiNoNamespaceSchemaLocation | const String\& | La valeur d'attribut **xsi:NoNamespaceSchemaLocation** de l'élément. Ce paramètre peut être **nullptr**. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
