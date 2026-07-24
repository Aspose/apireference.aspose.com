---
title: "System::Xml::XPath::XPathItem::ValueAs طريقة"
linktitle: "ValueAs"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathItem::ValueAs. تُرجع قيمة العنصر كالنوع المحدد في C++."
type: docs
weight: 1100
url: /ar/cpp/system.xml.xpath/xpathitem/valueas/
---
## XPathItem::ValueAs(const TypeInfo\&) method


يرجع قيمة العنصر بالنوع المحدد.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| returnType | const TypeInfo\& | النوع لإرجاع قيمة العنصر به. |

### ReturnValue

قيمة العنصر بالنوع المطلوب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathItem::ValueAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


عندما يتم تجاوزها في فئة مشتقة، تُرجع قيمة العنصر كالنوع المحدد باستخدام كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات النطاق.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| returnType | const TypeInfo\& | النوع لإرجاع قيمة العنصر به. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المستخدم لحل بادئات النطاق. |

### ReturnValue

قيمة العنصر بالنوع المطلوب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
