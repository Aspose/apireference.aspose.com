---
title: "System::IO::TextReader::Read metodo"
linktitle: "Read"
second_title: "Aspose.Font per C++"
description: "System::IO::TextReader::Read metodo. Legge un singolo carattere dallo stream in C++."
type: docs
weight: 400
url: /it/cpp/system.io/textreader/read/
---
## TextReader::Read() method


Legge un singolo carattere dal flusso.

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

Leggi il carattere codificato con la codifica UTF-16; se il carattere letto è rappresentato da due codepoint nella codifica UTF-16, allora viene restituito solo il surragate alto.

## Vedi anche

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


Legge il numero specificato di caratteri dal flusso e li scrive nell'array di caratteri specificato a partire dalla posizione specificata.

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | L'array di caratteri UTF-16 in cui scrivere i caratteri letti dallo stream |
| indice | int | Un indice basato su 0 in **buffer** a partire dal quale iniziare a scrivere |
| count | int | Il numero di caratteri da leggere dal flusso |

### ReturnValue

Il numero di caratteri letti dallo stream

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
