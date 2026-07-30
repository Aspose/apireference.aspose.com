---
title: "System::Xml::Schema::XmlSchemaDatatype::ChangeType yöntemi"
linktitle: "ChangeType"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ChangeType yöntemi. XmlSchemaDatatype tarafından temsil edilen XML şema tipinin geçerli temsillerinden biri olan belirtilen değeri, C++'ta belirtilen çalışma zamanı tipine dönüştürür."
type: docs
weight: 100
url: /tr/cpp/system.xml.schema/xmlschemadatatype/changetype/
---
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&) method


Belirtilen değeri, [XmlSchemaDatatype](../) tarafından temsil edilen XML şema tipinin geçerli temsillerinden biri olan tipten, belirtilen çalışma zamanı tipine dönüştürür.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | SharedPtr\<Object\> | Belirtilen tipe dönüştürülmek üzere giriş değeri. |
| targetType | const TypeInfo\& | Giriş değerini dönüştürmek için hedef tür. |

### ReturnValue

Dönüştürülmüş giriş değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Belirtilen değeri, türü [XmlSchemaDatatype](../) tarafından temsil edilen XML şema türünün geçerli temsillerinden biri olan, [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) kullanılarak belirtilen çalışma zamanı türüne dönüştürür; eğer [XmlSchemaDatatype](../) **xs:QName** türünü veya ondan türetilmiş bir türü temsil ediyorsa.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | SharedPtr\<Object\> | Belirtilen tipe dönüştürülmek üzere giriş değeri. |
| targetType | const TypeInfo\& | Giriş değerini dönüştürmek için hedef tür. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Namespace öneklerini çözmek için kullanılan bir [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/). Bu, yalnızca [XmlSchemaDatatype](../) **xs:QName** türünü veya ondan türetilmiş bir türü temsil ediyorsa işe yarar. |

### ReturnValue

Dönüştürülmüş giriş değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
