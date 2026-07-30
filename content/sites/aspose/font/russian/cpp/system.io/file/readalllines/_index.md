---
title: "Метод System::IO::File::ReadAllLines"
linktitle: "ReadAllLines"
second_title: "Aspose.Font для C++"
description: "Метод System::IO::File::ReadAllLines. Считывает содержимое указанного текстового файла построчно в массив строк, используя указанную кодировку символов в C++."
type: docs
weight: 2400
url: /ru/cpp/system.io/file/readalllines/
---
## File::ReadAllLines method


Считывает содержимое указанного текстового файла построчно в массив строк, используя указанную кодировку символов.

```cpp
static ArrayPtr<String> System::IO::File::ReadAllLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Путь к файлу, который нужно прочитать |
| encoding | const EncodingPtr\& | Кодировка символов, которую следует использовать |

### ReturnValue

Массив строк, каждый элемент которого представляет отдельную строку из указанного файла

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
