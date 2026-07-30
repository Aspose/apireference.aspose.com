---
title: "طريقة System::IO::TextReader::Read"
linktitle: "Read"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::TextReader::Read. تقرأ حرفًا واحدًا من الدفق في C++."
type: docs
weight: 400
url: /ar/cpp/system.io/textreader/read/
---
## TextReader::Read() method


يقرأ حرفًا واحدًا من الدفق.

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

قراءة حرف مشفر بترميز UTF-16؛ إذا كان الحرف المقروء ممثلاً بنقطتي شفرة في ترميز UTF-16 فسيتم إرجاع الجزء العالي فقط.

## انظر أيضًا

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


يقرأ عدد الأحرف المحدد من الدفق ويكتبها إلى مصفوفة الأحرف المحددة بدءًا من الموضع المحدد.

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | مصفوفة الأحرف UTF-16 لكتابة الأحرف المقروءة من الدفق إليها |
| الفهرس | int | فهرس يبدأ من الصفر في **buffer** لبدء الكتابة عنده |
| count | int | عدد الأحرف التي يجب قراءتها من التدفق |

### ReturnValue

عدد الأحرف المقروءة من الدفق

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
