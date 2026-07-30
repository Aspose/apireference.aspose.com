---
title: "System::IO::TextReader::Read Methode"
linktitle: "Read"
second_title: "Aspose.Font für C++"
description: "System::IO::TextReader::Read Methode. Liest ein einzelnes Zeichen aus dem Stream in C++."
type: docs
weight: 400
url: /de/cpp/system.io/textreader/read/
---
## TextReader::Read() method


Liest ein einzelnes Zeichen aus dem Stream.

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

Zeichen, das mit UTF‑16 kodiert ist, lesen; wenn das gelesene Zeichen durch zwei Codepunkte in UTF‑16 kodiert wird, wird nur das hohe Surrogat zurückgegeben.

## Siehe auch

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


Liest die angegebene Anzahl von Zeichen aus dem Stream und schreibt sie in das angegebene Zeichenarray, beginnend an der angegebenen Position.

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | Das UTF-16-Zeichenarray, in das die aus dem Stream gelesenen Zeichen geschrieben werden sollen |
| Index | int | Ein 0‑basierter Index in **buffer**, an dem das Schreiben beginnen soll |
| count | int | Die Anzahl der Zeichen, die aus dem Strom gelesen werden sollen |

### ReturnValue

Die Anzahl der aus dem Stream gelesenen Zeichen

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
