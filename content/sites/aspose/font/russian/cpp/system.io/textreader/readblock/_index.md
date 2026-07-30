---
title: "System::IO::TextReader::ReadBlock method"
linktitle: "ReadBlock"
second_title: "Aspose.Font для C++"
description: "System::IO::TextReader::ReadBlock метод. Считывает указанное максимальное количество символов из текущего текстового считывателя и записывает данные в буфер, начиная с указанного индекса в C++."
type: docs
weight: 500
url: /ru/cpp/system.io/textreader/readblock/
---
## TextReader::ReadBlock method


Считывает указанное максимальное количество символов из текущего текстового считывателя и записывает данные в буфер, начиная с указанного индекса.

```cpp
virtual int System::IO::TextReader::ReadBlock(ArrayPtr<char_t> buffer, int index, int count)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | Буфер символов, в который записываются прочитанные данные |
| индекс | int | Нулевой индекс в **buffer**, с которого начинать запись |
| count | int | Максимальное количество символов для чтения |

### ReturnValue

Фактическое количество прочитанных символов

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
