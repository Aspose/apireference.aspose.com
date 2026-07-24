---
title: "System::IO::TextReader::ReadBlock-Methode"
linktitle: "ReadBlock"
second_title: "Aspose.Page für C++"
description: "System::IO::TextReader::ReadBlock-Methode. Liest die angegebene maximale Anzahl von Zeichen aus dem aktuellen Textleser und schreibt die Daten in einen Puffer, beginnend am angegebenen Index in C++."
type: docs
weight: 500
url: /de/cpp/system.io/textreader/readblock/
---
## TextReader::ReadBlock method


Liest die angegebene maximale Anzahl von Zeichen aus dem aktuellen TextReader und schreibt die Daten in einen Puffer, beginnend am angegebenen Index.

```cpp
virtual int System::IO::TextReader::ReadBlock(ArrayPtr<char_t> buffer, int index, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | ArrayPtr\<char_t\> | Ein Zeichenpuffer, in den die gelesenen Daten geschrieben werden sollen |
| Index | int | Ein 0-basierter Index in **buffer**, an dem das Schreiben beginnen soll |
| count | int | Die maximale Anzahl zu lesender Zeichen |

### ReturnValue

Die tatsächliche Anzahl gelesener Zeichen

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
