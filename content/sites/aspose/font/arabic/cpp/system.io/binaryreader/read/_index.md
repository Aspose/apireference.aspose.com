---
title: "طريقة System::IO::BinaryReader::Read"
linktitle: "Read"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::BinaryReader::Read. تقرأ حرفًا واحدًا من تدفق الإدخال في C++."
type: docs
weight: 700
url: /ar/cpp/system.io/binaryreader/read/
---
## BinaryReader::Read() method


يقرأ حرفًا واحدًا من تدفق الإدخال.

```cpp
virtual int System::IO::BinaryReader::Read()
```


### ReturnValue

قراءة حرف مشفر بترميز UTF-16؛ إذا كان الحرف المقروء ممثلاً بنقطتي شفرة في ترميز UTF-16 فسيتم إرجاع الجزء العالي فقط.

## انظر أيضًا

* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryReader::Read(ArrayPtr\<char_t\>, int, int) method


يقرأ عدد الأحرف المحدد من تدفق الإدخال، يحولها إلى ترميز UTF-16 ويكتب الأحرف الناتجة بترميز UTF-16 إلى مصفوفة الأحرف المحددة بدءًا من الموضع المحدد.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | مصفوفة الأحرف UTF-16 لكتابة الأحرف المقروءة من تدفق الإدخال إليها |
| الفهرس | int | فهرس يبدأ من الصفر في **buffer** لبدء الكتابة عنده |
| count | int | عدد الأحرف التي يجب قراءتها من التدفق |

### ReturnValue

عدد الأحرف المقروءة من تدفق الإدخال

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryReader::Read(ArrayPtr\<uint8_t\>, int, int) method


يقرأ عدد البايتات المحدد من تدفق الإدخال ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<uint8_t> buffer, int index, int count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | ArrayPtr\<uint8_t\> | مصفوفة البايتات لكتابة البايتات المقروءة إليها |
| الفهرس | int | موضع يبدأ من الصفر في **buffer** لبدء الكتابة عنده |
| count | int | عدد البايتات للقراءة |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
