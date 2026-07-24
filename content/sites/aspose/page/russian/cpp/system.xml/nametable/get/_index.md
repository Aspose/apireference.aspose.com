---
title: "System::Xml::NameTable::Get method"
linktitle: "Get"
second_title: "Aspose.Page для C++"
description: "System::Xml::NameTable::Get method. Возвращает атомизированную строку, содержащую те же символы, что и указанный диапазон символов в данном массиве в C++."
type: docs
weight: 300
url: /ru/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Возвращает атомизированную строку, содержащую те же символы, что и указанный диапазон символов в данном массиве.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| ключ | const ArrayPtr\<char16_t\>\& | Массив символов, содержащий имя для поиска. |
| start | int32_t | Нулевой индекс в массиве, указывающий первый символ имени. |
| len | int32_t | Количество символов в имени. |

### ReturnValue

Атомизированная строка или **nullptr**, если строка ещё не была атомизирована. Если **len** равно нулю, возвращается [String::Empty](../../../system/string/empty/).

## См. также

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const String\&) method


Возвращает атомизированную строку с указанным значением.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| value | const String\& | Имя для поиска. |

### ReturnValue

Объект атомизированной строки или **nullptr**, если строка ещё не была атомизирована.

## См. также

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
