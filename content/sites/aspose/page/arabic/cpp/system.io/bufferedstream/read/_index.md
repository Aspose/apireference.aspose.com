---
title: "System::IO::BufferedStream::Read طريقة"
linktitle: "قراءة"
second_title: "Aspose.Page لـ C++"
description: "System::IO::BufferedStream::Read طريقة. يقرأ العدد المحدد من البايتات من الدفق الأساسي ويكتبها إلى المصفوفة البايتية المحددة في C++."
type: docs
weight: 900
url: /ar/cpp/system.io/bufferedstream/read/
---
## BufferedStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق الأساسي ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<uint8_t\>\& | مصفوفة البايت لكتابة البايتات المقروءة إليها |
| الإزاحة | int32_t | موضع يبدأ من الصفر في **buffer** للبدء بالكتابة |
| count | int32_t | عدد البايتات التي يجب قراءتها |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BufferedStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق الأساسي ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const System::Details::ArrayView\<uint8_t\>\& | مصفوفة البايت لكتابة البايتات المقروءة إليها |
| الإزاحة | int32_t | موضع يبدأ من الصفر في **buffer** للبدء بالكتابة |
| count | int32_t | عدد البايتات التي يجب قراءتها |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
