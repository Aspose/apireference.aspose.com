---
title: "System::Xml::XPath::XPathNavigator::ValueAs method"
linktitle: "ValueAs"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XPath::XPathNavigator::ValueAs method. يُرجِع قيمة العقدة الحالية كـ Type المحدد، باستخدام كائن IXmlNamespaceResolver المحدد لحل بادئات الفضاء الاسمي في C++."
type: docs
weight: 8100
url: /ar/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


يُرجِع قيمة العقدة الحالية كـ Type المحدد، باستخدام الكائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات الفضاء الاسمي.

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| returnType | const TypeInfo\& | الـ Type الذي يُرجَع به قيمة العقدة الحالية. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المستخدم لحل بادئات النطاق. |

### ReturnValue

قيمة العقدة الحالية كـ Type المطلوب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
