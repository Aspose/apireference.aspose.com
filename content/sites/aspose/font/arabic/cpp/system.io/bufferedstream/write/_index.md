---
title: "System::IO::BufferedStream::Write طريقة"
linktitle: "Write"
second_title: "Aspose.Font لـ C++"
description: "System::IO::BufferedStream::Write طريقة. يكتب النطاق الفرعي المحدد من البايتات من المصفوفة البايتية المحددة إلى التدفق الأساسي في C++."
type: docs
weight: 1400
url: /ar/cpp/system.io/bufferedstream/write/
---
## BufferedStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق الأساسي.

```cpp
virtual void System::IO::BufferedStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | المصفوفة التي تحتوي على البايتات للكتابة |
| إزاحة | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** حيث يبدأ النطاق الفرعي للكتابة |
| count | int32_t | عدد العناصر في النطاق الفرعي للكتابة |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BufferedStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق الأساسي.

```cpp
virtual void System::IO::BufferedStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | المصفوفة التي تحتوي على البايتات للكتابة |
| إزاحة | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** حيث يبدأ النطاق الفرعي للكتابة |
| count | int32_t | عدد العناصر في النطاق الفرعي للكتابة |

## انظر أيضًا

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
