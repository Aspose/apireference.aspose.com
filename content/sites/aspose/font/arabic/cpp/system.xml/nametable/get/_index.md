---
title: "System::Xml::NameTable::Get طريقة"
linktitle: "احصل على"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::NameTable::Get طريقة. تُرجع السلسلة الذرية التي تحتوي على نفس الأحرف كما في النطاق المحدد من الأحرف في المصفوفة المعطاة في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


تُرجع السلسلة المجزأة التي تحتوي على نفس الأحرف كما في النطاق المحدد من الأحرف في المصفوفة المعطاة.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | const ArrayPtr\<char16_t\>\& | مصفوفة الأحرف التي تحتوي على الاسم المراد العثور عليه. |
| start | int32_t | الفهرس الصفري في المصفوفة الذي يحدد الحرف الأول من الاسم. |
| len | int32_t | عدد الأحرف في الاسم. |

### ReturnValue

السلسلة الذرية أو **nullptr** إذا لم يتم تحويل السلسلة إلى ذرة مسبقًا. إذا كان **len** صفرًا، يتم إرجاع [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## NameTable::Get(const String\&) method


تُرجع السلسلة المجزأة بالقيمة المحددة.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | الاسم المراد العثور عليه. |

### ReturnValue

كائن السلسلة الذرية أو **nullptr** إذا لم يتم تحويل السلسلة إلى ذرة مسبقًا.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
