---
title: "System::IO::BufferedStream::Read yöntemi"
linktitle: "Read"
second_title: "Aspose.Font için C++"
description: "System::IO::BufferedStream::Read yöntemi. Temel akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine C++'ta yazar."
type: docs
weight: 900
url: /tr/cpp/system.io/bufferedstream/read/
---
## BufferedStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Temel akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BufferedStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Temel akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Okunan baytların yazılacağı bayt dizisi |
| offset | int32_t | **buffer** içinde yazmaya başlanacak 0 tabanlı konum |
| count | int32_t | Okunacak bayt sayısı |

### ReturnValue

Okunan bayt sayısı

## Ayrıca Bakınız

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
