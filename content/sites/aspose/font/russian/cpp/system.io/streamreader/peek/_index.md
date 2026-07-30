---
title: "System::IO::StreamReader::Peek метод"
linktitle: "Peek"
second_title: "Aspose.Font для C++"
description: "System::IO::StreamReader::Peek метод. Считывает один символ из потока, не изменяя курсор чтения потока в C++."
type: docs
weight: 800
url: /ru/cpp/system.io/streamreader/peek/
---
## StreamReader::Peek method


Считывает один символ из потока, не изменяя курсор чтения потока.

```cpp
virtual int System::IO::StreamReader::Peek() override
```


### ReturnValue

Считать символ, закодированный в UTF-16; если считанный символ представлен двумя кодовыми точками в кодировке UTF-16, то возвращается только старший суррогат; если символ не считан, возвращается -1.

## См. также

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
