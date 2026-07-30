---
title: "System::IO::BasicSTDOStreamWrapper::Write method"
linktitle: "Write"
second_title: "Aspose.Font لـ C++"
description: "System::IO::BasicSTDOStreamWrapper::Write method. إذا كان وضع التغليف ثنائيًا، يكتب إلى التدفق النطاق الفرعي المحدد من البايتات من المصفوفة البايتية المحددة، وإلا يحول النطاق الفرعي المحدد من البايتات من المصفوفة البايتية المحددة إلى نوع char_type ثم يكتب النتيجة إلى التدفق في C++."
type: docs
weight: 700
url: /ar/cpp/system.io/basicstdostreamwrapper/write/
---
## BasicSTDOStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


إذا كان وضع التغليف ثنائيًا، يكتب إلى التدفق النطاق الفرعي المحدد من البايتات من المصفوفة البايتية المحددة، وإلا يحول النطاق الفرعي المحدد من البايتات من المصفوفة البايتية المحددة إلى نوع [char_type](../char_type/) ثم يكتب النتيجة إلى التدفق.

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | المصفوفة التي تحتوي على البايتات للكتابة |
| إزاحة | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** الذي يبدأ منه النطاق الفرعي للكتابة |
| count | int32_t | عدد العناصر في النطاق الفرعي للكتابة |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDOStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق.

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | عرض المصفوفة الذي يحتوي على البايتات للكتابة |
| إزاحة | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** حيث يبدأ النطاق الفرعي للكتابة |
| count | int32_t | عدد العناصر في النطاق الفرعي للكتابة |

## انظر أيضًا

* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
