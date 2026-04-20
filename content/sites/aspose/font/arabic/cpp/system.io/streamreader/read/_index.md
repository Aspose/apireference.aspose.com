---
title: "System::IO::StreamReader::Read طريقة"
linktitle: "Read"
second_title: "Aspose.Font لـ C++"
description: "System::IO::StreamReader::Read طريقة. يقرأ حرفًا واحدًا من التيار في C++."
type: docs
weight: 900
url: /ar/cpp/system.io/streamreader/read/
---
## StreamReader::Read() method


يقرأ حرفًا واحدًا من الدفق.

```cpp
virtual int System::IO::StreamReader::Read() override
```


### ReturnValue

قراءة حرف مشفر بترميز UTF-16؛ إذا كان الحرف المقروء ممثلاً بنقطتي شفرة في ترميز UTF-16 فسيتم إرجاع الجزء العالي فقط.

## انظر أيضًا

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::Read(ArrayPtr\<char_t\>, int, int) method


يقرأ العدد المحدد من الأحرف من التيار، يحولها إلى ترميز UTF-16 ويكتب الأحرف الناتجة بترميز UTF-16 إلى مصفوفة الأحرف المحددة بدءًا من الموضع المحدد.

```cpp
virtual int System::IO::StreamReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
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
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
