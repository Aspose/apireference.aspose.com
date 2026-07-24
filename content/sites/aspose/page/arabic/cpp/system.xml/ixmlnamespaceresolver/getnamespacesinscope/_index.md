---
title: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope method"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope method. تُرجِع مجموعة من تعيينات البادئة-المساحة الاسمية المعرفة والمتاحة حاليًا في النطاق في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/ixmlnamespaceresolver/getnamespacesinscope/
---
## IXmlNamespaceResolver::GetNamespacesInScope method


يعيد مجموعة من تعيينات البادئة-المساحة الاسمية المعرفة والمتاحة حاليًا.

```cpp
virtual SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::IXmlNamespaceResolver::GetNamespacesInScope(XmlNamespaceScope scope)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| scope | XmlNamespaceScope | قيمة [XmlNamespaceScope](../../xmlnamespacescope/) تحدد نوع عقد مساحة الاسم التي يجب إرجاعها. |

### ReturnValue

مجموعة IDictionary التي تحتوي على مساحات الأسماء الحالية المتاحة في النطاق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [IXmlNamespaceResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
