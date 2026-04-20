---
title: "طريقة System::Xml::XmlTextReader::LookupNamespace"
linktitle: "LookupNamespace"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlTextReader::LookupNamespace. تحل محل بادئة مساحة الاسم في نطاق العنصر الحالي في C++."
type: docs
weight: 3700
url: /ar/cpp/system.xml/xmltextreader/lookupnamespace/
---
## XmlTextReader::LookupNamespace method


يحلّ صفة مساحة الاسم في نطاق العنصر الحالي.

```cpp
String System::Xml::XmlTextReader::LookupNamespace(const String &prefix) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| البادئة | const String\& | البادئة التي تريد حل URI مساحة الأسماء لها. لمطابقة مساحة الأسماء الافتراضية، مرر سلسلة فارغة. لا يلزم أن تكون هذه السلسلة مُذرة. |

### ReturnValue

URI مساحة الأسماء التي تُطابق البادئة أو **nullptr** إذا لم يتم العثور على بادئة مطابقة.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
