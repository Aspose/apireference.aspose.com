---
title: "طريقة System::Xml::Schema::XmlAtomicValue::ValueAs"
linktitle: "ValueAs"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::Schema::XmlAtomicValue::ValueAs. تُرجع قيمة العنصر أو السمة XML التي تم التحقق منها كنوع محدد باستخدام كائن IXmlNamespaceResolver المحدد لحل بادئات النطاق في C++."
type: docs
weight: 1300
url: /ar/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


تُرجع قيمة العنصر أو السمة XML التي تم التحقق منها كنوع محدد باستخدام كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات النطاق.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نوع | const TypeInfo\& | النوع الذي تُرجع به قيمة العنصر أو السمة XML التي تم التحقق منها. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المستخدم لحل بادئات النطاق. |

### ReturnValue

قيمة العنصر أو السمة XML التي تم التحقق منها كالنّوع المطلوب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
