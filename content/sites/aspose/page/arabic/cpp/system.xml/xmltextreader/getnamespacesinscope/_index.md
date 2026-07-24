---
title: "System::Xml::XmlTextReader::GetNamespacesInScope طريقة"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlTextReader::GetNamespacesInScope طريقة. تُرجع مجموعة تحتوي على جميع مساحات الاسم الحالية في النطاق في C++."
type: docs
weight: 3400
url: /ar/cpp/system.xml/xmltextreader/getnamespacesinscope/
---
## XmlTextReader::GetNamespacesInScope method


يرجع مجموعة تحتوي على جميع النطاقات الحالية في النطاق.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlTextReader::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| scope | XmlNamespaceScope | قيمة [XmlNamespaceScope](../../xmlnamespacescope/) تحدد نوع عقد مساحة الاسم التي يجب إرجاعها. |

### ReturnValue

كائن IDictionary يحتوي على جميع مساحات الاسم الحالية في النطاق. إذا لم يكن القارئ متموضعًا على عنصر، يتم إرجاع قاموس فارغ (بدون مساحات اسم).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
