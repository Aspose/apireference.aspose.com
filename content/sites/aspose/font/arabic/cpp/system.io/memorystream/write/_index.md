---
title: "System::IO::MemoryStream::Write طريقة"
linktitle: "Write"
second_title: "Aspose.Font لـ C++"
description: "System::IO::MemoryStream::Write طريقة. تُكتب النطاق الفرعي المحدد من البايتات من المصفوفة المحددة إلى الدفق في C++."
type: docs
weight: 1900
url: /ar/cpp/system.io/memorystream/write/
---
## MemoryStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق.

```cpp
void System::IO::MemoryStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | المصفوفة التي تحتوي على البايتات للكتابة |
| إزاحة | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** الذي يبدأ منه النطاق الفرعي للكتابة |
| count | int32_t | عدد العناصر في النطاق الفرعي للكتابة |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق.

```cpp
void System::IO::MemoryStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | عرض المصفوفة الذي يحتوي على البايتات للكتابة |
| إزاحة | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** الذي يبدأ منه النطاق الفرعي للكتابة |
| count | int32_t | عدد العناصر في النطاق الفرعي للكتابة |

## انظر أيضًا

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
