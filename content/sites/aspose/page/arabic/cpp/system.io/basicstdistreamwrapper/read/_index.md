---
title: "طريقة System::IO::BasicSTDIStreamWrapper::Read"
linktitle: "قراءة"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::BasicSTDIStreamWrapper::Read. إذا كان وضع التغليف ثنائيًا، يقرأ عدد البايتات المحدد من الدفق، وإلا يقرأ عدد الأحرف المحدد ويحوّله إلى نوع uint8_t. يكتب نتيجة القراءة إلى مصفوفة البايتات المحددة في C++."
type: docs
weight: 400
url: /ar/cpp/system.io/basicstdistreamwrapper/read/
---
## BasicSTDIStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


إذا كان وضع التغليف ثنائيًا، يقرأ عدد البايتات المحدد من الدفق، وإلا يقرأ عدد الأحرف المحدد ويحوّله إلى نوع uint8_t. يكتب نتيجة القراءة إلى مصفوفة البايتات المحددة.

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const System::Details::ArrayView\<uint8_t\>\& | عرض مصفوفة البايتات لكتابة البايتات المقروءة إليه |
| الإزاحة | int32_t | موضع يبدأ من الصفر في **buffer** للبدء بالكتابة |
| count | int32_t | عدد البايتات التي يجب قراءتها |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
