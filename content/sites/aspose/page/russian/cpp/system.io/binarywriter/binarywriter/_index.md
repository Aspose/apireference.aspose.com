---
title: "Конструктор System::IO::BinaryWriter::BinaryWriter"
linktitle: "BinaryWriter"
second_title: "Aspose.Page для C++"
description: "Конструктор System::IO::BinaryWriter::BinaryWriter. Создаёт экземпляр класса BinaryWriter, который записывает данные в указанный поток, используя заданную кодировку, в C++."
type: docs
weight: 100
url: /ru/cpp/system.io/binarywriter/binarywriter/
---
## BinaryWriter::BinaryWriter constructor


Создаёт экземпляр класса [BinaryWriter](../), который записывает данные в указанный поток, используя заданную кодировку.

```cpp
System::IO::BinaryWriter::BinaryWriter(const StreamPtr &stream, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked(), bool leaveopen=false)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const StreamPtr\& | Выходной поток |
| кодировка | const EncodingPtr\& | Кодировка для использования |
| leaveopen | bool | Указывает, следует ли оставлять поток **stream** открытым (true) после того, как текущий объект был освобождён, или нет (false) |

## См. также

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
