---
title: "System::Xml::NameTable::Add method"
linktitle: "Add"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::NameTable::Add method. يقوم بعملية تحويل السلسلة المحددة إلى ذرة ويضيفها إلى NameTable في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


يقوم بعملية تحويل السلسلة المحددة إلى ذرة ويضيفها إلى [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المفتاح | const ArrayPtr\<char16_t\>\& | مصفوفة الأحرف التي تحتوي على السلسلة المراد إضافتها. |
| بدء | int32_t | الفهرس الصفري في المصفوفة الذي يحدد أول حرف من السلسلة. |
| len | int32_t | عدد الأحرف في السلسلة. |

### ReturnValue

السلسلة المذرة أو السلسلة الموجودة إذا كانت موجودة بالفعل في [NameTable](../). إذا كان **len** صفرًا، يتم إرجاع [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Add(const String\&) method


يقوم بعملية تحويل السلسلة المحددة إلى ذرة ويضيفها إلى [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المفتاح | const String\& | السلسلة المراد إضافتها. |

### ReturnValue

السلسلة المذرة أو السلسلة الموجودة إذا كانت موجودة بالفعل في [NameTable](../).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
