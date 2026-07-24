---
title: "System::Net::Sockets::NetworkStream::Write طريقة"
linktitle: "Write"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Sockets::NetworkStream::Write طريقة. يكتب النطاق الفرعي المحدد من البايتات من المصفوفة المحددة إلى التدفق في C++."
type: docs
weight: 2500
url: /ar/cpp/system.net.sockets/networkstream/write/
---
## NetworkStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق.

```cpp
void System::Net::Sockets::NetworkStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<uint8_t\>\& | المصفوفة التي تحتوي على البايتات للكتابة. |
| الإزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد العناصر في النطاق الفرعي للكتابة. |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق.

```cpp
void System::Net::Sockets::NetworkStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const System::Details::ArrayView\<uint8_t\>\& | عرض المصفوفة الذي يحتوي على البايتات للكتابة |
| الإزاحة | int32_t | مؤشر يبدأ من الصفر للعنصر في **buffer** الذي يبدأ عنده النطاق الفرعي للكتابة |
| size | int32_t | عدد العناصر في النطاق الفرعي للكتابة |

## انظر أيضًا

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
