---
title: "System::Xml::XPath::XPathNavigator::ValueAs طريقة"
linktitle: "ValueAs"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XPath::XPathNavigator::ValueAs طريقة. تُرجع قيمة العقدة الحالية كـ Type المحدد، باستخدام كائن IXmlNamespaceResolver المحدد لحل بادئات المجال في C++."
type: docs
weight: 8100
url: /ar/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


تُرجع قيمة العقدة الحالية كـ Type المحدد، باستخدام كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات المجال.

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| returnType | const TypeInfo\& | النوع لإرجاع قيمة العقدة الحالية كـ. |
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
* Library [Aspose.Font for C++](../../../)
