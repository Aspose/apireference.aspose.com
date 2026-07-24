---
title: "System::IO::MemoryStream::MemoryStream constructor"
linktitle: "MemoryStream"
second_title: "Aspose.Page voor C++"
description: "System::IO::MemoryStream::MemoryStream constructor. Maakt een nieuw exemplaar van de MemoryStream-klasse met een initiële capaciteit gelijk aan 0 in C++."
type: docs
weight: 100
url: /nl/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


Construeert een nieuw exemplaar van de [MemoryStream](../) klasse met een initiële capaciteit gelijk aan 0.

```cpp
System::IO::MemoryStream::MemoryStream()
```

## Zie ook

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


Construeert een nieuw exemplaar van de [MemoryStream](../) klasse die een geheugenstroom vertegenwoordigt die is verbonden met de opgegeven geheugenbuffer. Een parameter geeft aan of de stroom schrijfbaar is.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | Een byte‑array die wordt gebruikt als geheugenbuffer waarop de stroom die door het te creëren object wordt vertegenwoordigd, gebaseerd zal zijn. |
| schrijfbaar | bool | Geeft aan of de stroom schrijfbaar moet zijn |

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


Construeert een nieuw exemplaar van de [MemoryStream](../) klasse die een geheugenstroom vertegenwoordigt die is verbonden met een segment van de opgegeven geheugenbuffer, beginnend bij de opgegeven index en inclusief het opgegeven aantal elementen. Parameters geven aan of de stroom schrijfbaar is en of de methode GetBytes() kan worden aangeroepen.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | Een byte‑array waarvan een segment wordt gebruikt als geheugenbuffer waarop de stroom die door het te creëren object wordt vertegenwoordigd, gebaseerd zal zijn. |
| index | int | Een 0‑gebaseerde index van het element in **content** waarop het segment begint |
| count | int | Het aantal elementen van **content** dat in het segment is opgenomen |
| schrijfbaar | bool | Geeft aan of de stroom schrijfbaar moet zijn |
| publiclyVisible | bool | Geeft aan of de onderliggende geheugenbuffer beschikbaar moet worden gesteld aan de aanroeper van de methode GetByte() |

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


Construeert een nieuw exemplaar van de [MemoryStream](../) klasse die een stroom vertegenwoordigt die gebaseerd is op een geheugenbuffer van de opgegeven grootte.

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| capacity_ | int | De grootte in bytes van een geheugenbuffer die is gekoppeld aan de stroom die door het te creëren object wordt vertegenwoordigd |

## Zie ook

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
