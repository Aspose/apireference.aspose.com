---
title: "System::Xml::NameTable::Get method"
linktitle: "احصل"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::NameTable::Get method. يُرجِع السلسلة المذرة التي تحتوي على نفس الأحرف كما في النطاق المحدد من الأحرف في المصفوفة المعطاة في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


يعيد السلسلة المذابة التي تحتوي على نفس الأحرف كما في النطاق المحدد من الأحرف في المصفوفة المعطاة.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المفتاح | const ArrayPtr\<char16_t\>\& | مصفوفة الأحرف التي تحتوي على الاسم المراد العثور عليه. |
| بدء | int32_t | الفهرس الذي يبدأ من الصفر في المصفوفة يحدد الحرف الأول من الاسم. |
| len | int32_t | عدد الأحرف في الاسم. |

### ReturnValue

السلسلة المذرة أو **nullptr** إذا لم يتم ذرة السلسلة مسبقًا. إذا كان **len** صفرًا، يتم إرجاع [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const String\&) method


يُرجع السلسلة المُجزيئة بالقيمة المحددة.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | الاسم المراد العثور عليه. |

### ReturnValue

كائن السلسلة المذرة أو **nullptr** إذا لم يتم ذرة السلسلة مسبقًا.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
