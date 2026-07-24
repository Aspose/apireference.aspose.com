---
title: "System::Xml::XmlValidatingReader::LookupNamespace طريقة"
linktitle: "LookupNamespace"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlValidatingReader::LookupNamespace طريقة. يحل بادئة مساحة الاسم ضمن نطاق العنصر الحالي'' في C++."
type: docs
weight: 3400
url: /ar/cpp/system.xml/xmlvalidatingreader/lookupnamespace/
---
## XmlValidatingReader::LookupNamespace method


يحلّ بادئة مساحة الاسم في نطاق العنصر الحالي.

```cpp
String System::Xml::XmlValidatingReader::LookupNamespace(const String &prefix) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| البادئة | const String\& | البادئة التي تريد حل معرف الموارد الموحد (URI) الخاص بمساحة الاسم الخاصة بها. لمطابقة مساحة الاسم الافتراضية، مرر سلسلة فارغة. |

### ReturnValue

URI مساحة الاسم الذي يطابق الاختصار أو **nullptr** إذا لم يُعثر على اختصار مطابق.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
