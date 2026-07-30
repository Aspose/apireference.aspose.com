---
title: "System::Xml::Schema::XmlSchemaDatatype::ParseValue méthode"
linktitle: "AnalyserValeur"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ParseValue method. Lorsqu'elle est remplacée dans une classe dérivée, elle valide la chaîne spécifiée contre un type simple intégré ou défini par l'utilisateur en C++."
type: docs
weight: 700
url: /fr/cpp/system.xml.schema/xmlschemadatatype/parsevalue/
---
## XmlSchemaDatatype::ParseValue method


Lorsqu'elle est remplacée dans une classe dérivée, valide le **string** spécifié contre un type simple intégré ou défini par l'utilisateur.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ParseValue(String s, SharedPtr<XmlNameTable> nameTable, SharedPtr<IXmlNamespaceResolver> nsmgr)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | String | La **string** à valider contre le type simple. |
| nameTable | SharedPtr\<XmlNameTable\> | Le [XmlNameTable](../../../system.xml/xmlnametable/) à utiliser pour l'atomisation lors de l'analyse de la **string** si cet objet [XmlSchemaDatatype](../) représente le type **xs:NCName**. |
| nsmgr | SharedPtr\<IXmlNamespaceResolver\> | L'objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) à utiliser lors de l'analyse de la **string** si cet objet [XmlSchemaDatatype](../) représente le type **xs:QName**. |

### ReturnValue

Un [Object](../../../system/object/) qui peut être converti en toute sécurité au type renvoyé par l'appel [XmlSchemaDatatype::get_ValueType](../get_valuetype/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
