---
title: "Метод System::IO::File::WriteAllLines"
linktitle: "WriteAllLines"
second_title: "Aspose.Font для C++"
description: "Метод System::IO::File::WriteAllLines. Создаёт новый текстовый файл или перезаписывает существующий и записывает все строки из указанного массива строк в него, каждая строка на новой линии, используя указанную кодировку в C++."
type: docs
weight: 3600
url: /ru/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


Создаёт новый текстовый файл или перезаписывает существующий и записывает в него все строки из указанного массива строк, каждую строку на новой линии, используя указанную кодировку.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Файл для создания или перезаписи |
| содержимое | const ArrayPtr\<String\>\& | Массив строк |
| encoding | const EncodingPtr\& | Кодировка символов, которую следует использовать |

## См. также

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


Создаёт новый текстовый файл или перезаписывает существующий и записывает в него все строки из указанной перечисляемой коллекции строк, каждую строку на новой линии, используя указанную кодировку.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Файл для создания или перезаписи |
| содержимое | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Перечисляемая коллекция строк |
| encoding | const EncodingPtr\& | Кодировка символов, которую следует использовать |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
