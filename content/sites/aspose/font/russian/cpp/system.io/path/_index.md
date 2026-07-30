---
title: "Класс System::IO::Path"
linktitle: "Путь"
second_title: "Aspose.Font для C++"
description: "Класс System::IO::Path. Предоставляет методы для работы с путями. Это статический тип без сервисов экземпляра. Вам никогда не следует создавать его экземпляры никакими способами в C++."
type: docs
weight: 1900
url: /ru/cpp/system.io/path/
---
## Path class


Предоставляет методы для работы с путями. Это статический тип без экземплярных сервисов. Вы никогда не должны создавать его экземпляры никакими способами.

```cpp
class Path
```

## Методы

| Метод | Описание |
| --- | --- |
| static [ChangeExtension](./changeextension/)(const String\&, const String\&) | Изменяет расширение в указанном пути к файлу. |
| static [CheckPath](./checkpath/)(const String\&, const String\&, bool) | Определяет, является ли указанный путь действительным, проверяя наличие недопустимых символов. Исключение генерируется, если путь содержит недопустимые символы. |
| static [Combine](./combine/)(const ArrayPtr\<String\>\&) | Объединяет указанные сегменты пути в один путь, при необходимости вставляя символы разделителя каталогов между сегментами. |
| static [Combine](./combine/)(const String\&, const String\&) | Объединяет два указанных сегмента пути в один путь, при необходимости вставляя символ разделителя каталогов между сегментами. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&) | Объединяет три указанных сегмента пути в один путь, при необходимости вставляя символы разделителя каталогов между сегментами. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&, const String\&) | Объединяет четыре указанных сегмента пути в один путь, при необходимости вставляя символы разделителя каталогов между сегментами. |
| static [GetDirectoryName](./getdirectoryname/)(const String\&) | Возвращает имя каталога, на который указывает указанный путь. |
| static [GetExtension](./getextension/)(const String\&) | Возвращает расширение файла, на который указывает указанный путь. |
| static [GetFileName](./getfilename/)(const String\&) | Возвращает имя файла, на который указывает указанный путь. |
| static [GetFileNameWithoutExtension](./getfilenamewithoutextension/)(const String\&) | Возвращает имя файла без расширения, на который указывает указанный путь. |
| static [GetFullPath](./getfullpath/)(const String\&) | Преобразует указанный путь в абсолютный путь. |
| static [GetInvalidFileNameChars](./getinvalidfilenamechars/)() | Возвращает массив, содержащий символы, недопустимые в именах файлов. |
| static [GetInvalidPathChars](./getinvalidpathchars/)() | Возвращает массив, содержащий символы, недопустимые в именах путей. |
| static [GetPathRoot](./getpathroot/)(const String\&) | Возвращает корневой каталог указанного пути. |
| static [GetRandomFileName](./getrandomfilename/)() | Возвращает случайно сгенерированное имя файла. |
| static [GetTempFileName_](./gettempfilename_/)() | Создаёт новый файл с уникальным именем и возвращает полный путь к нему. |
| static [GetTempFileNameSafe](./gettempfilenamesafe/)() | Создаёт новый файл с уникальным именем и возвращает полный путь к нему. Является синонимом метода [GetTempFileName_()](./gettempfilename_/) |
| static [GetTempPath](./gettemppath/)() | Возвращает путь к временной директории текущего пользователя. |
| static [HasExtension](./hasextension/)(const String\&) | Определяет, указывает ли указанный путь на файл с расширением. |
| static [IsPathRooted](./ispathrooted/)(const String\&) | Определяет, содержит ли указанный путь корень. |
| static [NormalizePath](./normalizepath/)(const String\&) | Нормализует указанный путь. |
| static [ToBoost](./toboost/)(const String\&) | Возвращает экземпляр класса boost::filesystem::path, представляющий указанный путь. |
| static [ToString](./tostring/)(const boost::filesystem::path\&) | Возвращает строковое представление указанного объекта пути Boost. |
## Поля

| Поле | Описание |
| --- | --- |
| static [AltDirectorySeparatorChar](./altdirectoryseparatorchar/) | Альтернативный символ, используемый для разделения уровней каталогов в пути. |
| static [DirectorySeparatorChar](./directoryseparatorchar/) | Символ, используемый для разделения уровней каталогов в пути. |
| static [PathSeparator](./pathseparator/) | Разделительный символ, используемый для разделения строк путей в переменных окружения. |
| static [VolumeSeparatorChar](./volumeseparatorchar/) | Символ разделителя тома. |
## Примечания



```cpp
#include "system/io/path.h"
#include <iostream>

int main()
{
  using namespace System::IO;

  // Генерирует случайное имя файла.
  auto filename = Path::GetRandomFileName();

  // Выводит информацию о имени файла.
  std::cout <<
    "Filename: " << Path::GetFileName(filename) << std::endl <<
    "Filename w/o an extension: " << Path::GetFileNameWithoutExtension(filename) << std::endl <<
    "Extension: " << Path::GetExtension(filename) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Filename: qhuzkyqv.y6p
Filename w/o an extension: qhuzkyqv
Extension: .y6p
*/
```

## См. также

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
