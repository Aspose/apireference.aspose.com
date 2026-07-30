---
title: "System::IO::BasicSTDIStreamWrapper::Read yöntemi"
linktitle: "Read"
second_title: "Aspose.Font için C++"
description: "System::IO::BasicSTDIStreamWrapper::Read yöntemi. Sarma modu ikili ise, akıştan belirtilen sayıda baytı okur; aksi takdirde belirtilen sayıda karakteri okur ve uint8_t tipine dönüştürür. Okumanın sonucunu C++'ta belirtilen bayt dizisine yazar."
type: docs
weight: 400
url: /tr/cpp/system.io/basicstdistreamwrapper/read/
---
## BasicSTDIStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Eğer sarmalama modu ikili ise, akıştan belirtilen sayıda baytı okur, aksi takdirde belirtilen sayıda karakteri okur ve bunları uint8_t türüne dönüştürür. Okumanın sonucunu belirtilen bayt dizisine yazar.

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Okunan baytların yazılacağı bayt dizisi |
| offset | int32_t | **buffer** içinde yazmaya başlanacak 0 tabanlı konum |
| count | int32_t | Okunacak bayt sayısı |

### ReturnValue

Okunan bayt veya karakter sayısı

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDIStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Okunan baytları yazmak için bayt dizi görünümü |
| offset | int32_t | **buffer** içinde yazmaya başlanacak 0 tabanlı konum |
| count | int32_t | Okunacak bayt sayısı |

### ReturnValue

Okunan bayt sayısı

## Ayrıca Bakınız

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
