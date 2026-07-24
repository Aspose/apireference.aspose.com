---
title: "System::IO::FileStream::Read method"
linktitle: "Oku"
second_title: "Aspose.Page için C++"
description: "System::IO::FileStream::Read method. Akıştan belirtilen sayıda baytı okur ve bunları C++'ta belirtilen bayt dizisine yazar."
type: docs
weight: 1300
url: /tr/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Okunan baytların yazılacağı bayt dizisi. |
| offset | int32_t | **buffer** içinde yazmaya başlanacak 0 tabanlı bir konum. |
| count | int32_t | Okunacak bayt sayısı. |

### ReturnValue

Okunan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar.

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | Okunan baytların yazılacağı bayt dizisi görünümü. |
| offset | int32_t | **buffer** içinde yazmaya başlanacak 0 tabanlı bir konum. |
| count | int32_t | Okunacak bayt sayısı. |

### ReturnValue

Okunan bayt sayısı.

## Ayrıca Bakınız

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
