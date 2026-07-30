---
title: "System::IO::BufferedStream::Read طريقة"
linktitle: "Read"
second_title: "Aspose.Font لـ C++"
description: "System::IO::BufferedStream::Read طريقة. يقرأ العدد المحدد من البايتات من التدفق الأساسي ويكتبها إلى المصفوفة البايتية المحددة في C++."
type: docs
weight: 900
url: /ar/cpp/system.io/bufferedstream/read/
---
## BufferedStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق الأساسي ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | مصفوفة البايتات لكتابة البايتات المقروءة إليها |
| إزاحة | int32_t | موضع يبدأ من الصفر في **buffer** لبدء الكتابة عنده |
| count | int32_t | عدد البايتات للقراءة |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BufferedStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق الأساسي ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | مصفوفة البايتات لكتابة البايتات المقروءة إليها |
| إزاحة | int32_t | موضع يبدأ من الصفر في **buffer** لبدء الكتابة عنده |
| count | int32_t | عدد البايتات للقراءة |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
