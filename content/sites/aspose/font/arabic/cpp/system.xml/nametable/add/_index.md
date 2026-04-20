---
title: "System::Xml::NameTable::Add طريقة"
linktitle: "Add"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::NameTable::Add طريقة. تقوم بتحويل السلسلة المحددة إلى ذرة وتضيفها إلى NameTable في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


تحول السلسلة المحددة إلى ذرة وتضيفها إلى [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | const ArrayPtr\<char16_t\>\& | مصفوفة الأحرف التي تحتوي على السلسلة المراد إضافتها. |
| start | int32_t | الفهرس الصفري في المصفوفة الذي يحدد أول حرف من السلسلة. |
| len | int32_t | عدد الأحرف في السلسلة. |

### ReturnValue

السلسلة الذرية أو السلسلة الموجودة إذا كانت موجودة بالفعل في [NameTable](../). إذا كان **len** صفرًا، يتم إرجاع [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## NameTable::Add(const String\&) method


تحول السلسلة المحددة إلى ذرة وتضيفها إلى [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | const String\& | السلسلة المراد إضافتها. |

### ReturnValue

السلسلة الذرية أو السلسلة الموجودة إذا كانت موجودة بالفعل في [NameTable](../).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
