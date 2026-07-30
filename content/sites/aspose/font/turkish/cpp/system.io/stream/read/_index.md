---
title: "System::IO::Stream::Read yöntemi"
linktitle: "Read"
second_title: "Aspose.Font için C++"
description: "System::IO::Stream::Read yöntemi. Akıştan belirtilen sayıda baytı okur ve bunları C++'ta belirtilen bayt dizisine yazar."
type: docs
weight: 1800
url: /tr/cpp/system.io/stream/read/
---
## Stream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
virtual int32_t System::IO::Stream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
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
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
virtual int32_t System::IO::Stream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Okunan baytları yazmak için bayt dizi görünümü |
| offset | int32_t | **buffer** içinde yazmaya başlanacak 0 tabanlı konum |
| count | int32_t | Okunacak bayt sayısı |

### ReturnValue

Okunan bayt sayısı

## Ayrıca Bakınız

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Read(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
template<std::size_t> int32_t System::IO::Stream::Read(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parametre | Açıklama |
| --- | --- |
| N | Yığın dizisinin boyutu |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const System::Details::StackArray\<uint8_t, N\>\& | Okunan baytların yazılacağı bayt yığın dizisi |
| offset | int32_t | **buffer** içinde yazmaya başlanacak 0 tabanlı konum |
| count | int32_t | Okunacak bayt sayısı |

### ReturnValue

Okunan bayt sayısı

## Ayrıca Bakınız

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
