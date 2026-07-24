---
title: "System::IO::BinaryReader::BinaryReader конструктор"
linktitle: "BinaryReader"
second_title: "Aspose.Page для C++"
description: "System::IO::BinaryReader::BinaryReader конструктор. Создает экземпляр класса BinaryReader, который читает данные из указанного потока, используя кодировку UTF-8 в C++."
type: docs
weight: 100
url: /ru/cpp/system.io/binaryreader/binaryreader/
---
## BinaryReader::BinaryReader(const SharedPtr\<Stream\>\&) constructor


Создает экземпляр класса [BinaryReader](../), который читает данные из указанного потока, используя кодировку UTF-8.

```cpp
System::IO::BinaryReader::BinaryReader(const SharedPtr<Stream> &input)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const SharedPtr\<Stream\>\& | Входной поток |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::BinaryReader(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


Создает экземпляр класса [BinaryReader](../), который читает данные из указанного потока, используя указанную кодировку.

```cpp
System::IO::BinaryReader::BinaryReader(const SharedPtr<Stream> &input, const SharedPtr<Text::Encoding> &encoding)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const SharedPtr\<Stream\>\& | Входной поток |
| кодировка | const SharedPtr\<Text::Encoding\>\& | Кодировка для использования |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::BinaryReader(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) constructor


Создает экземпляр класса [BinaryReader](../), который читает данные из указанного потока, используя указанную кодировку.

```cpp
System::IO::BinaryReader::BinaryReader(const SharedPtr<Stream> &input, const SharedPtr<Text::Encoding> &encoding, bool leaveOpen)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const SharedPtr\<Stream\>\& | Входной поток |
| кодировка | const SharedPtr\<Text::Encoding\>\& | Кодировка для использования |
| leaveOpen | bool | Указывает, должен ли поток **input** оставаться открытым (true) после того, как текущий объект был освобожден, или нет (false). |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
