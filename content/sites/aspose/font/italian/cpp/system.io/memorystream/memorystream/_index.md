---
title: "System::IO::MemoryStream::MemoryStream costruttore"
linktitle: "MemoryStream"
second_title: "Aspose.Font per C++"
description: "System::IO::MemoryStream::MemoryStream costruttore. Costruisce una nuova istanza della classe MemoryStream con capacità iniziale pari a 0 in C++."
type: docs
weight: 100
url: /it/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


Costruisce una nuova istanza della classe [MemoryStream](../) con capacità iniziale pari a 0.

```cpp
System::IO::MemoryStream::MemoryStream()
```

## Vedi anche

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


Costruisce una nuova istanza della classe [MemoryStream](../) che rappresenta uno stream di memoria collegato al buffer di memoria specificato. Un parametro specifica se lo stream è scrivibile.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| contenuto | const ArrayPtr\<uint8_t\>\& | Un array di byte da utilizzare come buffer di memoria su cui sarà basato lo stream rappresentato dall'oggetto in fase di creazione |
| scrivibile | bool | Specifica se lo stream deve essere scrivibile |

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


Costruisce una nuova istanza della classe [MemoryStream](../) che rappresenta uno stream di memoria collegato a un segmento del buffer di memoria specificato, a partire dall'indice specificato e includendo il numero specificato di elementi. I parametri specificano se lo stream è scrivibile e se il metodo GetBytes() può essere chiamato.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| contenuto | const ArrayPtr\<uint8_t\>\& | Un array di byte, di cui un segmento sarà utilizzato come buffer di memoria su cui sarà basato lo stream rappresentato dall'oggetto in fase di creazione |
| indice | int | Un indice basato su 0 dell'elemento in **content** al quale inizia il segmento |
| count | int | Il numero di elementi di **content** inclusi nel segmento |
| scrivibile | bool | Specifica se lo stream deve essere scrivibile |
| publiclyVisible | bool | Specifica se il buffer di memoria sottostante deve essere reso disponibile al chiamante del metodo GetByte() |

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


Costruisce una nuova istanza della classe [MemoryStream](../) che rappresenta uno stream basato su un buffer di memoria della dimensione specificata.

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| capacity_ | int | La dimensione in byte di un buffer di memoria associato allo stream rappresentato dall'oggetto in fase di creazione |

## Vedi anche

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
