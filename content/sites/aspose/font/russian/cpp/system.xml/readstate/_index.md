---
title: "enum System::Xml::ReadState"
linktitle: "ReadState"
second_title: "Aspose.Font для C++"
description: "enum System::Xml::ReadState. Указывает состояние считывателя в C++."
type: docs
weight: 5300
url: /ru/cpp/system.xml/readstate/
---
## ReadState enum


Указывает состояние считывателя.

```cpp
enum class ReadState
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Initial | 0 | Метод [XmlReader::Read](../xmlreader/read/) не был вызван. |
| Interactive | 1 | Метод [XmlReader::Read](../xmlreader/read/) был вызван. Дополнительные методы могут быть вызваны у считывателя. |
| Error | 2 | Произошла ошибка, препятствующая продолжению операции чтения. |
| EndOfFile | 3 | Конец файла успешно достигнут. |
| Closed | 4 | Метод [XmlReader::Close](../xmlreader/close/) был вызван. |

## См. также

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
