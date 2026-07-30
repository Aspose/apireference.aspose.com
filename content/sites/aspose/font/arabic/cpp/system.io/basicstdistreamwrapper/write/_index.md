---
title: "طريقة System::IO::BasicSTDIStreamWrapper::Write"
linktitle: "Write"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::BasicSTDIStreamWrapper::Write. إذا كان وضع التغليف ثنائيًا، يكتب إلى التدفق النطاق الفرعي المحدد من البايتات من المصفوفة البايتية المحددة، وإلا يحول النطاق الفرعي المحدد من البايتات من المصفوفة البايتية المحددة إلى نوع char_type ثم يكتب النتيجة إلى التدفق. غير مدعوم! في C++."
type: docs
weight: 700
url: /ar/cpp/system.io/basicstdistreamwrapper/write/
---
## BasicSTDIStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


إذا كان وضع التغليف ثنائيًا، يكتب إلى التدفق النطاق الفرعي المحدد من البايتات من المصفوفة البايتية المحددة، وإلا يحول النطاق الفرعي المحدد من البايتات من المصفوفة البايتية المحددة إلى نوع [char_type](../char_type/) ثم يكتب النتيجة إلى التدفق. غير مدعوم!

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | المصفوفة التي تحتوي على البايتات للكتابة. |
| إزاحة | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** حيث يبدأ النطاق الفرعي للكتابة. |
| count | int32_t | عدد العناصر في النطاق الفرعي للكتابة. |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDIStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق.

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | عرض المصفوفة الذي يحتوي على البايتات للكتابة |
| إزاحة | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** حيث يبدأ النطاق الفرعي للكتابة |
| count | int32_t | عدد العناصر في النطاق الفرعي للكتابة |

## انظر أيضًا

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
