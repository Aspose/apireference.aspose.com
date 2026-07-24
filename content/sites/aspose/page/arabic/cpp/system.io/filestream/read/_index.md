---
title: "System::IO::FileStream::Read method"
linktitle: "قراءة"
second_title: "Aspose.Page لـ C++"
description: "System::IO::FileStream::Read method. يقرأ العدد المحدد من البايتات من التدفق ويكتبها إلى المصفوفة البايتية المحددة في C++."
type: docs
weight: 1300
url: /ar/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<uint8_t\>\& | مصفوفة البايتات التي ستُكتب فيها البايتات المقروءة. |
| الإزاحة | int32_t | موضع يبدأ من الصفر في **buffer** للبدء بالكتابة. |
| count | int32_t | عدد البايتات التي سيتم قراءتها. |

### ReturnValue

عدد البايتات المقروءة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const System::Details::ArrayView\<uint8_t\>\& | عرض المصفوفة البايتية لكتابة البايتات المقروءة إليه. |
| الإزاحة | int32_t | موضع يبدأ من الصفر في **buffer** للبدء بالكتابة. |
| count | int32_t | عدد البايتات التي سيتم قراءتها. |

### ReturnValue

عدد البايتات المقروءة.

## انظر أيضًا

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
