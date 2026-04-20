---
title: "طريقة System::Net::Security::SslStream::Read"
linktitle: "Read"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Security::SslStream::Read. يقرأ العدد المحدد من البايتات من الدفق ويكتبها إلى مصفوفة البايتات المحددة في C++."
type: docs
weight: 3200
url: /ar/cpp/system.net.security/sslstream/read/
---
## SslStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
int32_t System::Net::Security::SslStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | مصفوفة البايتات لكتابة البايتات المقروءة إليها |
| إزاحة | int32_t | موضع يبدأ من الصفر في **buffer** لبدء الكتابة عنده |
| count | int32_t | عدد البايتات للقراءة |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة.

```cpp
int32_t System::Net::Security::SslStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | مصفوفة البايتات لكتابة البايتات المقروءة إليها |
| إزاحة | int32_t | موضع يبدأ من الصفر في **buffer** لبدء الكتابة عنده |
| count | int32_t | عدد البايتات للقراءة |

### ReturnValue

عدد البايتات المقروءة

## انظر أيضًا

* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
