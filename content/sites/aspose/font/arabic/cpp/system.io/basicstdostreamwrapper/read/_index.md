---
title: "System::IO::BasicSTDOStreamWrapper::Read method"
linktitle: "Read"
second_title: "Aspose.Font لـ C++"
description: "System::IO::BasicSTDOStreamWrapper::Read method. إذا كان وضع التغليف ثنائيًا، يقرأ العدد المحدد من البايتات من التدفق، وإلا يقرأ العدد المحدد من الأحرف ويحولها إلى النوع uint8_t. يكتب نتيجة القراءة إلى المصفوفة البايتية المحددة. غير مدعوم! في C++."
type: docs
weight: 400
url: /ar/cpp/system.io/basicstdostreamwrapper/read/
---
## BasicSTDOStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


إذا كان وضع التغليف ثنائيًا، يقرأ العدد المحدد من البايتات من الدفق، وإلا يقرأ العدد المحدد من الأحرف ويحولها إلى نوع uint8_t. يكتب نتيجة القراءة إلى مصفوفة البايتات المحددة. غير مدعوم!

```cpp
virtual int32_t System::IO::BasicSTDOStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | مصفوفة البايتات لكتابة البايتات المقروءة إليها |
| إزاحة | int32_t | موضع يبدأ من الصفر في **buffer** لبدء الكتابة عنده |
| count | int32_t | عدد البايتات للقراءة |

### ReturnValue

عدد البايتات أو الأحرف المقروءة

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDOStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
virtual int32_t System::IO::BasicSTDOStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | عرض المصفوفة البايتية لكتابة البايتات المقروءة إليه |
| إزاحة | int32_t | موضع يبدأ من الصفر في **buffer** لبدء الكتابة عنده |
| count | int32_t | عدد البايتات للقراءة |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
