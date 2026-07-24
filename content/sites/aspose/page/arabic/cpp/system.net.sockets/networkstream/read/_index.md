---
title: "طريقة System::Net::Sockets::NetworkStream::Read"
linktitle: "قراءة"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Net::Sockets::NetworkStream::Read. يقرأ العدد المحدد من البايتات من الدفق ويكتبها إلى مصفوفة البايتات المحددة في C++."
type: docs
weight: 1900
url: /ar/cpp/system.net.sockets/networkstream/read/
---
## NetworkStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<uint8_t\>\& | مصفوفة البايت حيث سيتم كتابة البايتات المقروءة. |
| الإزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم قراءتها. |

### ReturnValue

عدد البايتات المقروءة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const System::Details::ArrayView\<uint8_t\>\& | عرض مصفوفة البايتات لكتابة البايتات المقروءة إليه |
| الإزاحة | int32_t | موضع يبدأ من الصفر في **buffer** للبدء بالكتابة |
| size | int32_t | عدد البايتات التي يجب قراءتها |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
