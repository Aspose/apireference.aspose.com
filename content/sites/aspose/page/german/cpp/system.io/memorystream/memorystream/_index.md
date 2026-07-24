---
title: "System::IO::MemoryStream::MemoryStream Konstruktor"
linktitle: "MemoryStream"
second_title: "Aspose.Page für C++"
description: "System::IO::MemoryStream::MemoryStream Konstruktor. Erstellt eine neue Instanz der Klasse MemoryStream mit einer Anfangskapazität von 0 in C++."
type: docs
weight: 100
url: /de/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


Erstellt eine neue Instanz der Klasse [MemoryStream](../) mit einer Anfangskapazität von 0.

```cpp
System::IO::MemoryStream::MemoryStream()
```

## Siehe auch

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


Erstellt eine neue Instanz der Klasse [MemoryStream](../), die einen Memory‑Stream darstellt, der mit dem angegebenen Speicherpuffer verbunden ist. Ein Parameter gibt an, ob der Stream schreibbar ist.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | Ein Byte‑Array, das als Speicherpuffer verwendet wird, auf dem der vom zu erstellenden Objekt dargestellte Stream basiert |
| schreibbar | bool | Gibt an, ob der Stream schreibbar sein soll |

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


Erstellt eine neue Instanz der Klasse [MemoryStream](../), die einen Memory‑Stream darstellt, der mit einem Segment des angegebenen Speicherpuffers verbunden ist, beginnend beim angegebenen Index und einschließlich der angegebenen Anzahl von Elementen. Parameter geben an, ob der Stream schreibbar ist und ob die Methode GetBytes() aufgerufen werden kann.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | Ein Byte‑Array, dessen Segment als Speicherpuffer verwendet wird, auf dem der vom zu erstellenden Objekt dargestellte Stream basiert |
| Index | int | Ein 0‑basierter Index des Elements in **content**, an dem das Segment beginnt |
| count | int | Die Anzahl der Elemente von **content**, die im Segment enthalten sind |
| schreibbar | bool | Gibt an, ob der Stream schreibbar sein soll |
| publiclyVisible | bool | Gibt an, ob der zugrunde liegende Speicherpuffer dem Aufrufer der Methode GetByte() zur Verfügung gestellt werden soll |

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


Erstellt eine neue Instanz der Klasse [MemoryStream](../), die einen Stream darstellt, der auf einem Speicherpuffer der angegebenen Größe basiert.

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| capacity_ | int | Die Größe in Bytes eines Speicherpuffers, der mit dem durch das zu erstellende Objekt dargestellten Stream verknüpft ist. |

## Siehe auch

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
