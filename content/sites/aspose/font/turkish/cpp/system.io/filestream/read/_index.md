---
title: "System::IO::FileStream::Read method"
linktitle: "Read"
second_title: "Aspose.Font için C++"
description: "System::IO::FileStream::Read yöntemi. Akıştan belirtilen sayıda baytı okur ve C++'ta belirtilen bayt dizisine yazar."
type: docs
weight: 1300
url: /tr/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Okunan baytların yazılacağı bayt dizisi. |
| offset | int32_t | **buffer** içinde 0 tabanlı bir konum, yazmaya başlanacak yer. |
| count | int32_t | Okunacak bayt sayısı. |

### ReturnValue

Okunan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Okunan baytların yazılacağı bayt dizisi görünümü. |
| offset | int32_t | **buffer** içinde 0 tabanlı bir konum, yazmaya başlanacak yer. |
| count | int32_t | Okunacak bayt sayısı. |

### ReturnValue

Okunan bayt sayısı.

## Ayrıca Bakınız

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
