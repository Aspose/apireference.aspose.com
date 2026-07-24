---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs طريقة"
linktitle: "ValueAs"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs طريقة. يعيد قيمة العنصر أو السمة XML المصادق عليهما كنوع محدد باستخدام كائن IXmlNamespaceResolver المحدد لحل بادئات النطاق في C++."
type: docs
weight: 1300
url: /ar/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


يعيد قيمة العنصر أو السمة XML المصادق عليهما كنوع محدد باستخدام كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات النطاق.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| نوع | const TypeInfo\& | النوع الذي سيُعاد به قيمة العنصر أو السمة XML المصادق عليهما. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المستخدم لحل بادئات النطاق. |

### ReturnValue

قيمة العنصر أو السمة XML المُتحقق منها بالنوع المطلوب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
