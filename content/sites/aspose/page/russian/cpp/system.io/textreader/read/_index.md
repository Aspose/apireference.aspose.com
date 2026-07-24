---
title: "Метод System::IO::TextReader::Read"
linktitle: "Read"
second_title: "Aspose.Page для C++"
description: "Метод System::IO::TextReader::Read. Считывает один символ из потока в C++."
type: docs
weight: 400
url: /ru/cpp/system.io/textreader/read/
---
## TextReader::Read() method


Читает один символ из потока.

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

Считывает символ, закодированный в UTF-16; если считанный символ представлен двумя кодовыми точками в UTF-16, возвращается только старший суррогат.

## См. также

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


Читает указанное количество символов из потока и записывает их в указанный массив символов, начиная с указанной позиции.

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | ArrayPtr\<char_t\> | Массив символов UTF-16, в который записываются считанные из потока символы |
| индекс | int | Нулевой индекс в **buffer**, с которого начинать запись |
| count | int | Количество символов для чтения из потока |

### ReturnValue

Количество символов, считанных из потока

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
