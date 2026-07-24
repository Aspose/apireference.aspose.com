---
title: "طريقة System::IO::TextReader::Read"
linktitle: "قراءة"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::TextReader::Read. تقرأ حرفًا واحدًا من التدفق في C++."
type: docs
weight: 400
url: /ar/cpp/system.io/textreader/read/
---
## TextReader::Read() method


يقرأ حرفًا واحدًا من التدفق.

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

قراءة حرف مشفر بترميز UTF-16؛ إذا كان الحرف المقروء ممثلاً بنقطتي شفرة في ترميز UTF-16 فسيتم إرجاع الجزء العالي فقط.

## انظر أيضًا

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


يقرأ العدد المحدد من الأحرف من التدفق ويكتبها في مصفوفة الأحرف المحددة بدءًا من الموضع المحدد.

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
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
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
