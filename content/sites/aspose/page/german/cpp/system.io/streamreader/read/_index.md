---
title: "System::IO::StreamReader::Read-Methode"
linktitle: "Lesen"
second_title: "Aspose.Page für C++"
description: "System::IO::StreamReader::Read-Methode. Liest ein einzelnes Zeichen aus dem Stream in C++."
type: docs
weight: 900
url: /de/cpp/system.io/streamreader/read/
---
## StreamReader::Read() method


Liest ein einzelnes Zeichen aus dem Stream.

```cpp
virtual int System::IO::StreamReader::Read() override
```


### ReturnValue

Zeichen mit UTF‑16‑Kodierung lesen; wenn das gelesene Zeichen durch zwei Codepunkte in UTF‑16‑Kodierung dargestellt wird, wird nur das hohe Surrogat zurückgegeben.

## Siehe auch

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::Read(ArrayPtr\<char_t\>, int, int) method


Liest die angegebene Anzahl von Zeichen aus dem Stream, konvertiert sie in UTF‑16‑Kodierung und schreibt die resultierenden UTF‑16‑Zeichen in das angegebene Zeichenarray, beginnend an der angegebenen Position.

```cpp
virtual int System::IO::StreamReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | ArrayPtr\<char_t\> | Das UTF-16-Zeichenarray, in das die aus dem Stream gelesenen Zeichen geschrieben werden sollen |
| Index | int | Ein nullbasierter Index in **buffer**, an dem mit dem Schreiben begonnen werden soll |
| count | int | Die Anzahl der Zeichen, die aus dem Stream gelesen werden sollen |

### ReturnValue

Die Anzahl der aus dem Stream gelesenen Zeichen

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
