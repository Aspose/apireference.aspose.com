---
title: "System::Xml::Schema::XmlSchemaDatatype::ChangeType metodo"
linktitle: "ChangeType"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ChangeType metodo. Converte il valore specificato, il cui tipo è una delle rappresentazioni valide del tipo di schema XML rappresentato da XmlSchemaDatatype, al tipo di runtime specificato in C++."
type: docs
weight: 100
url: /it/cpp/system.xml.schema/xmlschemadatatype/changetype/
---
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&) method


Converte il valore specificato, il cui tipo è una delle rappresentazioni valide del tipo di schema XML rappresentato da [XmlSchemaDatatype](../), al tipo di runtime specificato.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | SharedPtr\<Object\> | Il valore di input da convertire al tipo specificato. |
| targetType | const TypeInfo\& | Il tipo di destinazione a cui convertire il valore di input. |

### ReturnValue

Il valore di input convertito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Converte il valore specificato, il cui tipo è una delle rappresentazioni valide del tipo di schema XML rappresentato da [XmlSchemaDatatype](../), al tipo di runtime specificato utilizzando [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) se [XmlSchemaDatatype](../) rappresenta il tipo **xs:QName** o un tipo derivato da esso.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | SharedPtr\<Object\> | Il valore di input da convertire al tipo specificato. |
| targetType | const TypeInfo\& | Il tipo di destinazione a cui convertire il valore di input. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Un [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilizzato per risolvere i prefissi di namespace. È utile solo se [XmlSchemaDatatype](../) rappresenta il tipo **xs:QName** o un tipo derivato da esso. |

### ReturnValue

Il valore di input convertito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
