---
title: "Метод System::IO::TextReader::Read"
linktitle: "Read"
second_title: "Aspose.Font для C++"
description: "Метод System::IO::TextReader::Read. Считывает один символ из потока в C++."
type: docs
weight: 400
url: /ru/cpp/system.io/textreader/read/
---
## TextReader::Read() method


Считывает один символ из потока.

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

Считать символ, закодированный в UTF-16; если считанный символ представлен двумя кодовыми точками в кодировке UTF-16, то возвращается только старший суррогат.

## См. также

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


Считывает указанное количество символов из потока и записывает их в указанный массив символов, начиная с указанной позиции.

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | Массив символов UTF-16, в который записываются символы, считанные из потока |
| индекс | int | Нулевой индекс в **buffer**, с которого начинать запись |
| count | int | Количество символов для чтения из потока |

### ReturnValue

Количество символов, считанных из потока

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
