---
title: "طريقة System::Xml::XmlNamespaceManager::LookupNamespace"
linktitle: "LookupNamespace"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlNamespaceManager::LookupNamespace. تُرجع URI مساحة الاسم للبادئة المحددة في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


يعيد URI مساحة الاسم للبادئة المحددة.

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| prefix | const String\& | البادئة التي تريد حل URI مساحة الاسم الخاصة بها. لمطابقة مساحة الاسم الافتراضية، مرّر [String::Empty](../../../system/string/empty/). |

### ReturnValue

URI مساحة الاسم لـ **prefix** أو **nullptr** إذا لم تكن هناك مساحة اسم مُربطة. السلسلة المُرجعة مُذرة. لمزيد من المعلومات حول السلاسل المُذرة، راجع فئة [XmlNameTable](../../xmlnametable/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
