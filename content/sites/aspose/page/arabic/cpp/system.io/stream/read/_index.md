---
title: "طريقة System::IO::Stream::Read"
linktitle: "قراءة"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::Stream::Read. تقرأ عدد البايتات المحدد من الدفق وتكتبها إلى مصفوفة البايتات المحددة في C++."
type: docs
weight: 1800
url: /ar/cpp/system.io/stream/read/
---
## Stream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
virtual int32_t System::IO::Stream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
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
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
virtual int32_t System::IO::Stream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const System::Details::ArrayView\<uint8_t\>\& | عرض مصفوفة البايتات لكتابة البايتات المقروءة إليه |
| الإزاحة | int32_t | موضع يبدأ من الصفر في **buffer** للبدء بالكتابة |
| count | int32_t | عدد البايتات التي يجب قراءتها |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
template<std::size_t> int32_t System::IO::Stream::Read(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parameter | الوصف |
| --- | --- |
| N | حجم مصفوفة المكدس |

| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const System::Details::StackArray\<uint8_t, N\>\& | مصفوفة بايتات المكدس لكتابة البايتات المقروءة إليها |
| الإزاحة | int32_t | موضع يبدأ من الصفر في **buffer** للبدء بالكتابة |
| count | int32_t | عدد البايتات التي يجب قراءتها |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
