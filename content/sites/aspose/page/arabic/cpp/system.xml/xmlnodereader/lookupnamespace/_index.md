---
title: "System::Xml::XmlNodeReader::LookupNamespace طريقة"
linktitle: "LookupNamespace"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlNodeReader::LookupNamespace طريقة. يحلّ اختصار مساحة الاسم في نطاق العنصر الحالي في C++."
type: docs
weight: 2500
url: /ar/cpp/system.xml/xmlnodereader/lookupnamespace/
---
## XmlNodeReader::LookupNamespace method


يحلّ بادئة مساحة الاسم في نطاق العنصر الحالي.

```cpp
String System::Xml::XmlNodeReader::LookupNamespace(const String &prefix) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| البادئة | const String\& | الاختصار الذي تريد حل URI مساحة الاسم له. لمطابقة مساحة الاسم الافتراضية، مرّر سلسلة فارغة. لا يلزم أن تكون هذه السلسلة مُذابة. |

### ReturnValue

URI مساحة الاسم الذي يطابق الاختصار أو **nullptr** إذا لم يُعثر على اختصار مطابق.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
