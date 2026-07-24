---
title: "System::IO::StringReader::Read طريقة"
linktitle: "قراءة"
second_title: "Aspose.Page لـ C++"
description: "System::IO::StringReader::Read طريقة. يقرأ حرفًا واحدًا من الدفق في C++."
type: docs
weight: 500
url: /ar/cpp/system.io/stringreader/read/
---
## StringReader::Read() method


يقرأ حرفًا واحدًا من التدفق.

```cpp
virtual int System::IO::StringReader::Read() override
```


### ReturnValue

حرف مقروء أو -1 إذا لم يتم قراءة أي حرف

## انظر أيضًا

* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StringReader::Read(ArrayPtr\<char_t\>, int, int) method


يقرأ العدد المحدد من الأحرف من الدفق إلى مصفوفة الأحرف المحددة بدءًا من الموضع المحدد.

```cpp
virtual int System::IO::StringReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | ArrayPtr\<char_t\> | مصفوفة الأحرف لكتابة الأحرف المقروءة من الدفق إليها |
| الفهرس | int | فهرس يبدأ من الصفر في **buffer** لتبدأ الكتابة |
| count | int | عدد الأحرف التي يجب قراءتها من التدفق |

### ReturnValue

عدد الأحرف المقروءة من التدفق

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
