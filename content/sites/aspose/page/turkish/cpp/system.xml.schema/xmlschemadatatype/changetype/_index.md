---
title: "System::Xml::Schema::XmlSchemaDatatype::ChangeType yöntemi"
linktitle: "ChangeType"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ChangeType yöntemi. XmlSchemaDatatype tarafından temsil edilen XML şema türünün geçerli temsillerinden biri olan belirtilen değeri, C++ içinde belirtilen çalışma zamanı türüne dönüştürür."
type: docs
weight: 100
url: /tr/cpp/system.xml.schema/xmlschemadatatype/changetype/
---
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&) method


Belirtilen değeri, [XmlSchemaDatatype](../) tarafından temsil edilen XML şema türünün geçerli temsillerinden biri olan, belirtilen çalışma zamanı türüne dönüştürür.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | SharedPtr\<Object\> | Belirtilen türe dönüştürülecek girdi değeri. |
| targetType | const TypeInfo\& | Girdi değerinin dönüştürüleceği hedef tür. |

### ReturnValue

Dönüştürülmüş girdi değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Belirtilen değeri, [XmlSchemaDatatype](../) tarafından temsil edilen XML şema türünün geçerli temsillerinden biri olan, **xs:QName** türünü veya ondan türetilmiş bir türü temsil ediyorsa, [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) kullanarak belirtilen çalışma zamanı türüne dönüştürür.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | SharedPtr\<Object\> | Belirtilen türe dönüştürülecek girdi değeri. |
| targetType | const TypeInfo\& | Girdi değerinin dönüştürüleceği hedef tür. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ad alanı öneklerini çözmek için kullanılan bir nesnedir. Bu, yalnızca [XmlSchemaDatatype](../) **xs:QName** türünü veya ondan türetilmiş bir türü temsil ediyorsa işe yarar. |

### ReturnValue

Dönüştürülmüş girdi değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
