---
title: "طريقة System::Net::Sockets::NetworkStream::Read"
linktitle: "Read"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Sockets::NetworkStream::Read. تقرأ عدد البايتات المحدد من التدفق وتكتبها إلى المصفوفة البايتية المحددة في C++."
type: docs
weight: 1900
url: /ar/cpp/system.net.sockets/networkstream/read/
---
## NetworkStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | مصفوفة البايت التي ستُكتب فيها البايتات المقروءة. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم قراءتها. |

### ReturnValue

عدد البايتات المقروءة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## NetworkStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | عرض المصفوفة البايتية لكتابة البايتات المقروءة إليه |
| إزاحة | int32_t | موضع يبدأ من الصفر في **buffer** لبدء الكتابة عنده |
| size | int32_t | عدد البايتات للقراءة |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
