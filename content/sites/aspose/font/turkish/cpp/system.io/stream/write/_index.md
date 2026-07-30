---
title: "System::IO::Stream::Write yöntemi"
linktitle: "Write"
second_title: "Aspose.Font için C++"
description: "System::IO::Stream::Write yöntemi. Belirtilen bayt dizisinden belirtilen bayt alt aralığını C++'ta akışa yazar."
type: docs
weight: 2600
url: /tr/cpp/system.io/stream/write/
---
## Stream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar.

```cpp
virtual void System::IO::Stream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Yazılacak baytları içeren dizi |
| offset | int32_t | **buffer** içinde yazma alt aralığının başladığı öğenin 0 tabanlı indeksi |
| count | int32_t | Yazılacak alt aralıktaki öğe sayısı |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar.

```cpp
virtual void System::IO::Stream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Yazılacak baytları içeren dizi görünümü |
| offset | int32_t | **buffer** içinde yazma alt aralığının başladığı öğenin 0 tabanlı indeksi |
| count | int32_t | Yazılacak alt aralıktaki öğe sayısı |

## Ayrıca Bakınız

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Write(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar.

```cpp
template<std::size_t> void System::IO::Stream::Write(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parametre | Açıklama |
| --- | --- |
| N | Yığın dizisinin boyutu |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const System::Details::StackArray\<uint8_t, N\>\& | Yazılacak baytları içeren yığın dizisi |
| offset | int32_t | **buffer** içinde yazma alt aralığının başladığı öğenin 0 tabanlı indeksi |
| count | int32_t | Yazılacak alt aralıktaki öğe sayısı |

## Ayrıca Bakınız

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
