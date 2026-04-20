---
title: "طريقة System::Xml::XmlNamespaceManager::LookupNamespace"
linktitle: "LookupNamespace"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlNamespaceManager::LookupNamespace method. تُرجع معرف مساحة الاسم (URI) للبادئة المحددة في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


يعيد URI مساحة الاسم للبادئة المحددة.

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| prefix | const String\& | البادئة التي تريد حل معرف مساحة الاسم لها. لمطابقة مساحة الاسم الافتراضية، مرّر [String::Empty](../../../system/string/empty/). |

### ReturnValue

معرف مساحة الاسم للـ **prefix** أو **nullptr** إذا لم تكن هناك مساحة اسم مُعينة. السلسلة المرتجعة مُذرة. لمزيد من المعلومات حول السلاسل المُذرة، راجع فئة [XmlNameTable](../../xmlnametable/) class.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
