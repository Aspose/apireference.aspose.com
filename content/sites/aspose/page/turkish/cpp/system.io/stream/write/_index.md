---
title: "System::IO::Stream::Write yöntemi"
linktitle: "Write"
second_title: "Aspose.Page için C++"
description: "System::IO::Stream::Write yöntemi. Belirtilen bayt dizisinden belirtilen bayt alt aralığını akışa (C++'ta) yazar."
type: docs
weight: 2600
url: /tr/cpp/system.io/stream/write/
---
## Stream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar.

```cpp
virtual void System::IO::Stream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Yazılacak baytları içeren dizi |
| offset | int32_t | Yazma alt aralığının başladığı **buffer** içindeki öğenin 0 tabanlı indeksi |
| count | int32_t | Yazılacak alt aralıktaki öğe sayısı |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar.

```cpp
virtual void System::IO::Stream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | Yazılacak baytları içeren dizi görünümü |
| offset | int32_t | Yazma alt aralığının başladığı **buffer** içindeki öğenin 0 tabanlı indeksi |
| count | int32_t | Yazılacak alt aralıktaki öğe sayısı |

## Ayrıca Bakınız

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar.

```cpp
template<std::size_t> void System::IO::Stream::Write(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parameter | Açıklama |
| --- | --- |
| N | Yığın dizisinin boyutu |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | const System::Details::StackArray\<uint8_t, N\>\& | Yazılacak baytları içeren yığın dizisi |
| offset | int32_t | Yazma alt aralığının başladığı **buffer** içindeki öğenin 0 tabanlı indeksi |
| count | int32_t | Yazılacak alt aralıktaki öğe sayısı |

## Ayrıca Bakınız

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
