---
title: "Метод System::IO::StreamReader::Read"
linktitle: "Read"
second_title: "Aspose.Page для C++"
description: "Метод System::IO::StreamReader::Read. Считывает один символ из потока в C++."
type: docs
weight: 900
url: /ru/cpp/system.io/streamreader/read/
---
## StreamReader::Read() method


Читает один символ из потока.

```cpp
virtual int System::IO::StreamReader::Read() override
```


### ReturnValue

Считывает символ, закодированный в UTF-16; если считанный символ представлен двумя кодовыми точками в UTF-16, возвращается только старший суррогат.

## См. также

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::Read(ArrayPtr\<char_t\>, int, int) method


Считывает указанное количество символов из потока, преобразует их в кодировку UTF-16 и записывает полученные UTF-16 символы в указанный массив символов, начиная с указанной позиции.

```cpp
virtual int System::IO::StreamReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
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
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
