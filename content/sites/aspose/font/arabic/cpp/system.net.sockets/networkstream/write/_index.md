---
title: "طريقة System::Net::Sockets::NetworkStream::Write"
linktitle: "Write"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Sockets::NetworkStream::Write. تكتب النطاق الفرعي المحدد من البايتات من المصفوفة البايتية المحددة إلى التدفق في C++."
type: docs
weight: 2500
url: /ar/cpp/system.net.sockets/networkstream/write/
---
## NetworkStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق.

```cpp
void System::Net::Sockets::NetworkStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | المصفوفة التي تحتوي على البايتات للكتابة. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد العناصر في النطاق الفرعي للكتابة. |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## NetworkStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق.

```cpp
void System::Net::Sockets::NetworkStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | عرض المصفوفة الذي يحتوي على البايتات للكتابة |
| إزاحة | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** حيث يبدأ النطاق الفرعي للكتابة |
| size | int32_t | عدد العناصر في النطاق الفرعي للكتابة |

## انظر أيضًا

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
