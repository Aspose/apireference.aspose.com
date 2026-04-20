---
title: "System::IO::StringReader::Read طريقة"
linktitle: "Read"
second_title: "Aspose.Font لـ C++"
description: "System::IO::StringReader::Read طريقة. يقرأ حرفًا واحدًا من الدفق في C++."
type: docs
weight: 500
url: /ar/cpp/system.io/stringreader/read/
---
## StringReader::Read() method


يقرأ حرفًا واحدًا من الدفق.

```cpp
virtual int System::IO::StringReader::Read() override
```


### ReturnValue

حرف مقروء أو -1 إذا لم يتم قراءة أي حرف

## انظر أيضًا

* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StringReader::Read(ArrayPtr\<char_t\>, int, int) method


يقرأ العدد المحدد من الأحرف من الدفق إلى مصفوفة الأحرف المحددة بدءًا من الموضع المحدد.

```cpp
virtual int System::IO::StringReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | مصفوفة الأحرف لكتابة الأحرف المقروءة من الدفق إليها |
| الفهرس | int | فهرس يبدأ من الصفر في **buffer** لبدء الكتابة عنده |
| count | int | عدد الأحرف التي يجب قراءتها من التدفق |

### ReturnValue

عدد الأحرف المقروءة من الدفق

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
