---
title: "System::IO::TextReader::Read metodo"
linktitle: "Read"
second_title: "Aspose.Page per C++"
description: "System::IO::TextReader::Read method. Legge un singolo carattere dallo stream in C++."
type: docs
weight: 400
url: /it/cpp/system.io/textreader/read/
---
## TextReader::Read() method


Legge un singolo carattere dallo stream.

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

Leggi il carattere codificato con la codifica UTF-16; se il carattere letto è rappresentato da due codepoint nella codifica UTF-16, viene restituito solo il surrogato alto.

## Vedi anche

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


Legge il numero specificato di caratteri dallo stream e li scrive nell'array di caratteri specificato a partire dalla posizione specificata.

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
* Library [Aspose.Page for C++](../../../)
