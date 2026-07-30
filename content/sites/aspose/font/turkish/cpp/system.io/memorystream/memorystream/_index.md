---
title: "System::IO::MemoryStream::MemoryStream yapıcı"
linktitle: "MemoryStream"
second_title: "Aspose.Font için C++"
description: "System::IO::MemoryStream::MemoryStream yapıcı. C++'ta başlangıç kapasitesi 0 olan yeni bir MemoryStream sınıfı örneği oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


Başlangıç kapasitesi 0 olan yeni bir [MemoryStream](../) sınıfı örneği oluşturur.

```cpp
System::IO::MemoryStream::MemoryStream()
```

## Ayrıca Bakınız

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


Belirtilen bellek tamponuna bağlanan bir bellek akışını temsil eden yeni bir [MemoryStream](../) sınıfı örneği oluşturur. Bir parametre akışın yazılabilir olup olmadığını belirtir.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| içerik | const ArrayPtr\<uint8_t\>\& | Oluşturulan nesnenin temsil ettiği akışın temel alacağı bir bellek tamponu olarak kullanılacak bayt dizisi |
| yazılabilir | bool | Akışın yazılabilir olup olacağını belirtir |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


Belirtilen indeksten başlayan ve belirtilen öğe sayısını içeren, belirtilen bellek tamponunun bir segmentine bağlanan bir bellek akışını temsil eden yeni bir [MemoryStream](../) sınıfı örneği oluşturur. Parametreler akışın yazılabilir olup olmadığını ve GetBytes() yönteminin çağrılıp çağrılamayacağını belirtir.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| içerik | const ArrayPtr\<uint8_t\>\& | Oluşturulan nesnenin temsil ettiği akışın temel alacağı bir bellek tamponu olarak kullanılacak bir segmenti olan bayt dizisi |
| indeks | int | Segmentin başladığı **content** içindeki öğenin 0 tabanlı indeksi |
| count | int | Segmentte dahil edilen **content** öğelerinin sayısı |
| yazılabilir | bool | Akışın yazılabilir olup olacağını belirtir |
| publiclyVisible | bool | Altta yatan bellek tamponunun GetByte() yöntemi çağıranına sunulup sunulmayacağını belirtir |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


Belirtilen boyuttaki bir bellek tamponuna dayalı bir akışı temsil eden yeni bir [MemoryStream](../) sınıfı örneği oluşturur.

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| capacity_ | int | Oluşturulan nesnenin temsil ettiği akışla ilişkili bellek tamponunun bayt cinsinden boyutu |

## Ayrıca Bakınız

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
