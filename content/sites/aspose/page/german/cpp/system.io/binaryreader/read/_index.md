---
title: "System::IO::BinaryReader::Read Methode"
linktitle: "Lesen"
second_title: "Aspose.Page für C++"
description: "System::IO::BinaryReader::Read Methode. Liest ein einzelnes Zeichen aus dem Eingabestream in C++."
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

Zeichen mit UTF‑16‑Kodierung lesen; wenn das gelesene Zeichen durch zwei Codepunkte in UTF‑16‑Kodierung dargestellt wird, wird nur das hohe Surrogat zurückgegeben.

## Siehe auch

* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<char_t\>, int, int) method


Liest die angegebene Anzahl von Zeichen aus dem Eingabestream, konvertiert sie in UTF‑16‑Kodierung und schreibt die resultierenden UTF‑16‑Zeichen in das angegebene Zeichen‑Array, beginnend an der angegebenen Position.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | ArrayPtr\<char_t\> | Das UTF‑16‑Zeichenarray, in das die aus dem Eingabestream gelesenen Zeichen geschrieben werden sollen |
| Index | int | Ein nullbasierter Index in **buffer**, an dem mit dem Schreiben begonnen werden soll |
| count | int | Die Anzahl der Zeichen, die aus dem Stream gelesen werden sollen |

### ReturnValue

Die Anzahl der aus dem Eingabestream gelesenen Zeichen

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<uint8_t\>, int, int) method


Liest die angegebene Anzahl von Bytes aus dem Eingabestream und schreibt sie in das angegebene Byte‑Array.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<uint8_t> buffer, int index, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | ArrayPtr\<uint8_t\> | Das Byte-Array, in das die gelesenen Bytes geschrieben werden sollen |
| Index | int | Eine nullbasierte Position in **buffer**, an der das Schreiben beginnt |
| count | int | Die Anzahl der zu lesenden Bytes |

### ReturnValue

Die Anzahl der gelesenen Bytes

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
