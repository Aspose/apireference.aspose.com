---
title: "طريقة System::IO::StreamReader::Read"
linktitle: "قراءة"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::StreamReader::Read. تقرأ حرفًا واحدًا من الدفق في C++."
type: docs
weight: 900
url: /ar/cpp/system.io/streamreader/read/
---
## StreamReader::Read() method


يقرأ حرفًا واحدًا من التدفق.

```cpp
virtual int System::IO::StreamReader::Read() override
```


### ReturnValue

قراءة حرف مشفر بترميز UTF-16؛ إذا كان الحرف المقروء ممثلاً بنقطتي شفرة في ترميز UTF-16 فسيتم إرجاع الجزء العالي فقط.

## انظر أيضًا

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::Read(ArrayPtr\<char_t\>, int, int) method


يقرأ العدد المحدد من الأحرف من التدفق، يحولها إلى ترميز UTF-16 ويكتب الأحرف الناتجة بترميز UTF-16 إلى مصفوفة الأحرف المحددة بدءًا من الموضع المحدد.

```cpp
virtual int System::IO::StreamReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | ArrayPtr\<char_t\> | مصفوفة الأحرف UTF-16 لكتابة الأحرف المقروءة من التدفق إليها |
| الفهرس | int | فهرس يبدأ من الصفر في **buffer** لتبدأ الكتابة |
| count | int | عدد الأحرف التي يجب قراءتها من التدفق |

### ReturnValue

عدد الأحرف المقروءة من التدفق

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
