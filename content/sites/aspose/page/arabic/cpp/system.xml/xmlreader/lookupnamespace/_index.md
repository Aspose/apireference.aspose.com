---
title: "System::Xml::XmlReader::LookupNamespace method"
linktitle: "LookupNamespace"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlReader::LookupNamespace method. عند تجاوزها في فئة مشتقة، تحل بادئة مساحة اسم في نطاق العنصر الحالي في C++."
type: docs
weight: 3100
url: /ar/cpp/system.xml/xmlreader/lookupnamespace/
---
## XmlReader::LookupNamespace method


عند تجاوزها في فئة مشتقة، تحلّ بادئة مساحة الاسم في نطاق العنصر الحالي.

```cpp
virtual String System::Xml::XmlReader::LookupNamespace(const String &prefix)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| البادئة | const String\& | البادئة التي تريد حل URI مساحة اسمها. لمطابقة مساحة الاسم الافتراضية، مرّر سلسلة فارغة. |

### ReturnValue

URI مساحة الاسم الذي يطابق الاختصار أو **nullptr** إذا لم يُعثر على اختصار مطابق.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
