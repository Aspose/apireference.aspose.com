---
title: "System::Xml::XPath::XPathItem::ValueAs طريقة"
linktitle: "ValueAs"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XPath::XPathItem::ValueAs طريقة. تُرجع قيمة العنصر كـ النوع المحدد في C++."
type: docs
weight: 1100
url: /ar/cpp/system.xml.xpath/xpathitem/valueas/
---
## XPathItem::ValueAs(const TypeInfo\&) method


يعيد قيمة العنصر بالنوع المحدد.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| returnType | const TypeInfo\& | النوع لإرجاع قيمة العنصر كـ. |

### ReturnValue

قيمة العنصر كـ النوع المطلوب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathItem::ValueAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


عند تجاوزها في فئة مشتقة، تُرجع قيمة العنصر كـ النوع المحدد باستخدام كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات النطاق.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| returnType | const TypeInfo\& | النوع لإرجاع قيمة العنصر كـ. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المستخدم لحل بادئات النطاق. |

### ReturnValue

قيمة العنصر كـ النوع المطلوب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
