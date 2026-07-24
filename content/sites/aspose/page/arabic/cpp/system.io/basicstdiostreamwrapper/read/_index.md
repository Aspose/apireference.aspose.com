---
title: "System::IO::BasicSTDIOStreamWrapper::Read طريقة"
linktitle: "قراءة"
second_title: "Aspose.Page لـ C++"
description: "System::IO::BasicSTDIOStreamWrapper::Read طريقة. إذا كان وضع التغليف ثنائيًا، يقرأ العدد المحدد من البايتات من الدفق، وإلا يقرأ العدد المحدد من الأحرف ويحوله إلى نوع uint8_t. يكتب نتيجة القراءة إلى المصفوفة البايتية المحددة في C++."
type: docs
weight: 400
url: /ar/cpp/system.io/basicstdiostreamwrapper/read/
---
## BasicSTDIOStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


إذا كان وضع التغليف ثنائيًا، يقرأ عدد البايتات المحدد من الدفق، وإلا يقرأ عدد الأحرف المحدد ويحوّله إلى نوع uint8_t. يكتب نتيجة القراءة إلى مصفوفة البايتات المحددة.

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<uint8_t\>\& | مصفوفة البايت لكتابة البايتات المقروءة إليها |
| الإزاحة | int32_t | موضع يبدأ من الصفر في **buffer** للبدء بالكتابة |
| count | int32_t | عدد البايتات التي يجب قراءتها |

### ReturnValue

عدد البايتات أو الأحرف المقروءة

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIOStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const System::Details::ArrayView\<uint8_t\>\& | عرض مصفوفة البايتات لكتابة البايتات المقروءة إليه |
| الإزاحة | int32_t | موضع يبدأ من الصفر في **buffer** للبدء بالكتابة |
| count | int32_t | عدد البايتات التي يجب قراءتها |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
