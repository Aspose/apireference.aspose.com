---
title: "System::Xml::Schema::XmlSchemaDatatype::ParseValue yöntemi"
linktitle: "ParseValue"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ParseValue yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, C++ içinde belirtilen dizeyi yerleşik veya kullanıcı tanımlı basit bir türe karşı doğrular."
type: docs
weight: 700
url: /tr/cpp/system.xml.schema/xmlschemadatatype/parsevalue/
---
## XmlSchemaDatatype::ParseValue method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen **string** değerini yerleşik veya kullanıcı tanımlı bir basit tip ile doğrular.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ParseValue(String s, SharedPtr<XmlNameTable> nameTable, SharedPtr<IXmlNamespaceResolver> nsmgr)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| s | String | **string**'i basit türe karşı doğrulamak için. |
| nameTable | SharedPtr\<XmlNameTable\> | Bu [XmlSchemaDatatype](../) nesnesi **xs:NCName** türünü temsil ediyorsa, **string**'i ayrıştırırken atomizasyon için kullanılacak [XmlNameTable](../../../system.xml/xmlnametable/). |
| nsmgr | SharedPtr\<IXmlNamespaceResolver\> | Bu [XmlSchemaDatatype](../) nesnesi **xs:QName** türünü temsil ediyorsa, **string**'i ayrıştırırken kullanılacak [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesi. |

### ReturnValue

Bu, [XmlSchemaDatatype::get_ValueType](../get_valuetype/) çağrısı tarafından döndürülen türe güvenli bir şekilde dönüştürülebilen bir [Object](../../../system/object/) nesnesidir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
