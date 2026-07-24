---
title: "System::IO::MemoryStream::MemoryStream konstruktor"
linktitle: "MemoryStream"
second_title: "Aspose.Page för C++"
description: "System::IO::MemoryStream::MemoryStream konstruktor. Skapar en ny instans av MemoryStream-klassen med initial kapacitet lika med 0 i C++."
type: docs
weight: 100
url: /sv/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


Skapar en ny instans av klassen [MemoryStream](../) med initial kapacitet lika med 0.

```cpp
System::IO::MemoryStream::MemoryStream()
```

## Se även

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


Skapar en ny instans av klassen [MemoryStream](../) som representerar en minnesström som är ansluten till den angivna minnesbufferten. En parameter anger om strömmen är skrivbar.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | En byte-array som ska användas som minnesbuffer som den ström som representeras av det objekt som skapas kommer att baseras på |
| skrivbar | bool | Anger om strömmen ska vara skrivbar |

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


Skapar en ny instans av klassen [MemoryStream](../) som representerar en minnesström som är ansluten till ett segment av den angivna minnesbufferten som börjar vid det angivna indexet och inkluderar det angivna antalet element. Parametrar anger om strömmen är skrivbar och om metoden GetBytes() kan anropas.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | En byte-array vars segment ska användas som minnesbuffer som den ström som representeras av det objekt som skapas kommer att baseras på |
| index | int | Ett 0-baserat index för elementet i **content** där segmentet börjar |
| count | int | Antalet element i **content** som ingår i segmentet |
| skrivbar | bool | Anger om strömmen ska vara skrivbar |
| publiclyVisible | bool | Anger om den underliggande minnesbufferten ska göras tillgänglig för anroparen av metoden GetByte() |

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


Skapar en ny instans av klassen [MemoryStream](../) som representerar en ström baserad på en minnesbuffer av den angivna storleken.

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| capacity_ | int | Storleken i byte för en minnesbuffert som är associerad med strömmen som representeras av objektet som skapas |

## Se även

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
