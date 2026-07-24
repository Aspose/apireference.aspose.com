---
title: "طريقة System::Xml::XmlNameTable::Get"
linktitle: "احصل"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlNameTable::Get. عند تجاوزها في فئة مشتقة، تحصل على السلسلة المجزأة التي تحتوي على نفس الأحرف كما في النطاق المحدد من الأحرف في المصفوفة المعطاة في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


عند تجاوزها في فئة مشتقة، تحصل على السلسلة المذرة التي تحتوي على نفس الأحرف كما في النطاق المحدد من الأحرف في المصفوفة المعطاة.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| مصفوفة | const ArrayPtr\<char16_t\>\& | مصفوفة الأحرف التي تحتوي على الاسم المراد البحث عنه. |
| الإزاحة | int32_t | الفهرس الذي يبدأ من الصفر في المصفوفة يحدد الحرف الأول من الاسم. |
| الطول | int32_t | عدد الأحرف في الاسم. |

### ReturnValue

السلسلة المجزأة أو **nullptr** إذا لم يتم تجزئة السلسلة مسبقًا. إذا كان **length** صفرًا، يتم إرجاع [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Get(const String\&) method


عند تجاوزها في فئة مشتقة، تحصل على السلسلة المذرة التي تحتوي على نفس القيمة كالتي في السلسلة المحددة.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| مصفوفة | const String\& | الاسم للبحث عنه. |

### ReturnValue

السلسلة المُذرة أو **nullptr** إذا لم يتم إذرة السلسلة مسبقًا.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
