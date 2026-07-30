---
title: "System::IO::BinaryReader::Read Methode"
linktitle: "Read"
second_title: "Aspose.Font für C++"
description: "System::IO::BinaryReader::Read Methode. Liest ein einzelnes Zeichen aus dem Eingabestrom in C++."
type: docs
weight: 700
url: /de/cpp/system.io/binaryreader/read/
---
## BinaryReader::Read() method


Liest ein einzelnes Zeichen aus dem Eingabestream.

```cpp
virtual int System::IO::BinaryReader::Read()
```


### ReturnValue

Zeichen, das mit UTF‑16 kodiert ist, lesen; wenn das gelesene Zeichen durch zwei Codepunkte in UTF‑16 kodiert wird, wird nur das hohe Surrogat zurückgegeben.

## Siehe auch

* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryReader::Read(ArrayPtr\<char_t\>, int, int) method


Liest die angegebene Anzahl von Zeichen aus dem Eingabestream, konvertiert sie in UTF-16-Kodierung und schreibt die resultierenden UTF-16-Zeichen in das angegebene Zeichen-Array, beginnend an der angegebenen Position.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | Das UTF‑16‑Zeichenarray, in das die aus dem Eingabestrom gelesenen Zeichen geschrieben werden sollen |
| Index | int | Ein 0‑basierter Index in **buffer**, an dem das Schreiben beginnen soll |
| count | int | Die Anzahl der Zeichen, die aus dem Strom gelesen werden sollen |

### ReturnValue

Die Anzahl der aus dem Eingabestrom gelesenen Zeichen

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryReader::Read(ArrayPtr\<uint8_t\>, int, int) method


Liest die angegebene Anzahl von Bytes aus dem Eingabestream und schreibt sie in das angegebene Byte-Array.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<uint8_t> buffer, int index, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | ArrayPtr\<uint8_t\> | Das Byte-Array, in das die gelesenen Bytes geschrieben werden sollen |
| Index | int | Eine 0-basierte Position in **buffer**, an der das Schreiben beginnen soll |
| count | int | Die Anzahl der zu lesenden Bytes |

### ReturnValue

Die Anzahl der gelesenen Bytes

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
