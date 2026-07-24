---
title: "System::Xml::XPath::XPathNavigator::ValueAs yöntemi"
linktitle: "ValueAs"
second_title: "Aspose.Page için C++"
description: "System::Xml::XPath::XPathNavigator::ValueAs yöntemi. C++'da ad alanı öneklerini çözmek için belirtilen IXmlNamespaceResolver nesnesini kullanarak, mevcut düğüm''ün değerini belirtilen Tip olarak döndürür."
type: docs
weight: 8100
url: /tr/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


Belirtilen [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesini kullanarak, mevcut düğümün değerini belirtilen Tip olarak döndürür.

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| returnType | const TypeInfo\& | Mevcut düğümün değerinin döndürüleceği Tip. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Ad alanı öneklerini çözmek için kullanılan [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesi. |

### ReturnValue

Talep edilen Tip olarak mevcut düğümün değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
