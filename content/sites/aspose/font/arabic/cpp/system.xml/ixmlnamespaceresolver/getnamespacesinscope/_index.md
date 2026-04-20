---
title: "طريقة System::Xml::IXmlNamespaceResolver::GetNamespacesInScope"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::IXmlNamespaceResolver::GetNamespacesInScope. تُعيد مجموعة من تعيينات البادئة-مساحة الاسم المعرفة حاليًا ضمن النطاق في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/ixmlnamespaceresolver/getnamespacesinscope/
---
## IXmlNamespaceResolver::GetNamespacesInScope method


يرجع مجموعة من تعيينات بادئة-مساحة الاسم المعرفة التي هي حالياً في النطاق.

```cpp
virtual SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::IXmlNamespaceResolver::GetNamespacesInScope(XmlNamespaceScope scope)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| scope | XmlNamespaceScope | قيمة [XmlNamespaceScope](../../xmlnamespacescope/) التي تحدد نوع عقد الفضاء الاسمي التي يجب إرجاعها. |

### ReturnValue

مجموعة IDictionary التي تحتوي على مساحات الاسم الحالية ضمن النطاق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [IXmlNamespaceResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
