---
title: "System::IO::BinaryReader::Read metodo"
linktitle: "Read"
second_title: "Aspose.Font per C++"
description: "System::IO::BinaryReader::Read metodo. Legge un singolo carattere dal flusso di input in C++."
type: docs
weight: 700
url: /it/cpp/system.io/binaryreader/read/
---
## BinaryReader::Read() method


Legge un singolo carattere dallo stream di input.

```cpp
virtual int System::IO::BinaryReader::Read()
```


### ReturnValue

Leggi il carattere codificato con la codifica UTF-16; se il carattere letto è rappresentato da due codepoint nella codifica UTF-16, allora viene restituito solo il surragate alto.

## Vedi anche

* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryReader::Read(ArrayPtr\<char_t\>, int, int) method


Legge il numero specificato di caratteri dallo stream di input, li converte nella codifica UTF-16 e scrive i caratteri UTF-16 risultanti nell'array di caratteri specificato a partire dalla posizione specificata.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | L'array di caratteri UTF-16 in cui scrivere i caratteri letti dal flusso di input |
| indice | int | Un indice basato su 0 in **buffer** a partire dal quale iniziare a scrivere |
| count | int | Il numero di caratteri da leggere dal flusso |

### ReturnValue

Il numero di caratteri letti dal flusso di input

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryReader::Read(ArrayPtr\<uint8_t\>, int, int) method


Legge il numero specificato di byte dallo stream di input e li scrive nell'array di byte specificato.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<uint8_t> buffer, int index, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | ArrayPtr\<uint8_t\> | L'array di byte in cui scrivere i byte letti |
| indice | int | Una posizione a base zero in **buffer** da cui iniziare a scrivere |
| count | int | Il numero di byte da leggere |

### ReturnValue

Il numero di byte letti

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
