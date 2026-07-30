---
title: "System::Net::Sockets::NetworkStream::Read metodu"
linktitle: "Read"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::NetworkStream::Read metodu. Akıştan belirtilen sayıda baytı okur ve bunları C++'da belirtilen bayt dizisine yazar."
type: docs
weight: 1900
url: /tr/cpp/system.net.sockets/networkstream/read/
---
## NetworkStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Okunan baytların yazılacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Okunacak bayt sayısı. |

### ReturnValue

Okunan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## NetworkStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Okunan baytları yazmak için bayt dizi görünümü |
| offset | int32_t | **buffer** içinde yazmaya başlanacak 0 tabanlı konum |
| size | int32_t | Okunacak bayt sayısı |

### ReturnValue

Okunan bayt sayısı

## Ayrıca Bakınız

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
