---
title: "System::IO::StreamReader::Peek метод"
linktitle: "Peek"
second_title: "Aspose.Page для C++"
description: "System::IO::StreamReader::Peek метод. Читает один символ из потока, не изменяя курсор чтения потока в C++."
type: docs
weight: 800
url: /ru/cpp/system.io/streamreader/peek/
---
## StreamReader::Peek method


Читает один символ из потока, не изменяя позицию чтения потока.

```cpp
virtual int System::IO::StreamReader::Peek() override
```


### ReturnValue

Считывает символ, закодированный в UTF-16; если считанный символ представлен двумя кодовыми точками в UTF-16, возвращается только старший суррогат; если символ не считан, возвращается -1.

## См. также

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
