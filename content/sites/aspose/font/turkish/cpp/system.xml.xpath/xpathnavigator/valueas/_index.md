---
title: "System::Xml::XPath::XPathNavigator::ValueAs yöntemi"
linktitle: "ValueAs"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathNavigator::ValueAs yöntemi. C++'ta ad alanı öneklerini çözmek için belirtilen IXmlNamespaceResolver nesnesini kullanarak, geçerli düğümün değerini belirtilen Tip olarak döndürür."
type: docs
weight: 8100
url: /tr/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


Geçerli düğümün değerini belirtilen Tip olarak döndürür, ad alanı öneklerini çözmek için belirtilen [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesini kullanarak.

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| returnType | const TypeInfo\& | Geçerli düğümün değerinin döndürüleceği Tip. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Ad alanı öneklerini çözmek için kullanılan [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesi. |

### ReturnValue

İstenen Tip olarak geçerli düğümün değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
