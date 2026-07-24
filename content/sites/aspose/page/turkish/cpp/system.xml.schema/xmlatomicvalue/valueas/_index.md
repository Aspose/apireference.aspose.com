---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs method"
linktitle: "ValueAs"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs method. Doğrulanmış XML öğesi veya özniteliğinin'' değerini, C++'da ad alanı öneklerini çözmek için belirtilen IXmlNamespaceResolver nesnesi kullanılarak belirtilen türe döndürür."
type: docs
weight: 1300
url: /tr/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


Doğrulanmış XML öğesi veya özniteliğinin değerini, ad alanı öneklerini çözmek için belirtilen [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesi kullanılarak belirtilen türe döndürür.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tür | const TypeInfo\& | Doğrulanmış XML öğesi veya özniteliğinin değerini döndürmek için kullanılacak tür. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Ad alanı öneklerini çözmek için kullanılan [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesi. |

### ReturnValue

Doğrulanmış XML öğesi veya özniteliğinin, istenen türdeki değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
