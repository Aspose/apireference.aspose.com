---
title: "System::Net::Security::SslStream::Read yöntemi"
linktitle: "Read"
second_title: "Aspose.Font için C++"
description: "System::Net::Security::SslStream::Read yöntemi. Belirtilen sayıda baytı akıştan okuyarak C++'ta belirtilen bayt dizisine yazar."
type: docs
weight: 3200
url: /tr/cpp/system.net.security/sslstream/read/
---
## SslStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Security::SslStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Okunan baytların yazılacağı bayt dizisi |
| offset | int32_t | **buffer** içinde yazmaya başlanacak 0 tabanlı konum |
| count | int32_t | Okunacak bayt sayısı |

### ReturnValue

Okunan bayt sayısı

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Security::SslStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Okunan baytların yazılacağı bayt dizisi |
| offset | int32_t | **buffer** içinde yazmaya başlanacak 0 tabanlı konum |
| count | int32_t | Okunacak bayt sayısı |

### ReturnValue

Okunan bayt sayısı

## Ayrıca Bakınız

* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
