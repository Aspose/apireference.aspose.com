---
title: "طريقة System::Xml::XmlReader::LookupNamespace"
linktitle: "LookupNamespace"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlReader::LookupNamespace. عند تجاوزها في فئة مشتقة، تحل بادئة مساحة اسم في نطاق العنصر الحالي في C++."
type: docs
weight: 3100
url: /ar/cpp/system.xml/xmlreader/lookupnamespace/
---
## XmlReader::LookupNamespace method


عند تجاوزها في فئة مشتقة، تحلّ إشارة بادئة مساحة الاسم في نطاق العنصر الحالي.

```cpp
virtual String System::Xml::XmlReader::LookupNamespace(const String &prefix)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| البادئة | const String\& | البادئة التي تريد حل URI مساحة اسمها. لمطابقة مساحة الاسم الافتراضية، مرّر سلسلة فارغة. |

### ReturnValue

URI مساحة الأسماء التي تُطابق البادئة أو **nullptr** إذا لم يتم العثور على بادئة مطابقة.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
