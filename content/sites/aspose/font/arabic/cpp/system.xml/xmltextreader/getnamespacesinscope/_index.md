---
title: "طريقة System::Xml::XmlTextReader::GetNamespacesInScope"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlTextReader::GetNamespacesInScope. تُرجع مجموعة تحتوي على جميع الأسماء المكانية الحالية في النطاق في C++."
type: docs
weight: 3400
url: /ar/cpp/system.xml/xmltextreader/getnamespacesinscope/
---
## XmlTextReader::GetNamespacesInScope method


يرجع مجموعة تحتوي على جميع المساحات الاسمية الحالية في النطاق.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlTextReader::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| scope | XmlNamespaceScope | قيمة [XmlNamespaceScope](../../xmlnamespacescope/) التي تحدد نوع عقد الفضاء الاسمي التي يجب إرجاعها. |

### ReturnValue

كائن IDictionary يحتوي على جميع الأسماء المكانية الحالية في النطاق. إذا لم يكن القارئ موضعه على عنصر، يتم إرجاع قاموس فارغ (بدون أسماء مكانية).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
