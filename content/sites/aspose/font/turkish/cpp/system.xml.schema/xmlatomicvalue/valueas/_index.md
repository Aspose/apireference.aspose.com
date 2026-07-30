---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs metodu"
linktitle: "ValueAs"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs metodu. Doğrulanmış XML öğesinin veya özniteliğinin değerini, C++'ta ad alanı öneklerini çözmek için belirtilen IXmlNamespaceResolver nesnesi kullanılarak belirtilen türe dönüştürür."
type: docs
weight: 1300
url: /tr/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


Doğrulanmış XML öğesinin veya özniteliğinin değerini, ad alanı öneklerini çözmek için belirtilen [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesi kullanılarak belirtilen türe dönüştürür.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tür | const TypeInfo\& | Doğrulanmış XML öğesinin veya özniteliğinin değerinin döndürüleceği tür. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Ad alanı öneklerini çözmek için kullanılan [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesi. |

### ReturnValue

İstenen türe göre doğrulanmış XML öğesinin veya özniteliğinin değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
