---
title: "System::IO::File::WriteAllLines метод"
linktitle: "WriteAllLines"
second_title: "Aspose.Page для C++"
description: "System::IO::File::WriteAllLines метод. Создаёт новый текстовый файл или перезаписывает существующий и записывает все строки из указанного массива строк в него, каждая строка на новой строке, используя указанную кодировку в C++."
type: docs
weight: 3600
url: /ru/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


Создаёт новый текстовый файл или перезаписывает существующий и записывает в него все строки из указанного массива строк, каждая строка на новой линии, используя указанную кодировку.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Файл для создания или перезаписи |
| содержимое | const ArrayPtr\<String\>\& | Массив строк |
| кодировка | const EncodingPtr\& | Кодировка символов, которую следует использовать |

## См. также

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


Создаёт новый текстовый файл или перезаписывает существующий и записывает в него все строки из указанной перечисляемой коллекции строк, каждая строка на новой линии, используя указанную кодировку.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Файл для создания или перезаписи |
| содержимое | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Перечисляемая коллекция строк |
| кодировка | const EncodingPtr\& | Кодировка символов, которую следует использовать |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
