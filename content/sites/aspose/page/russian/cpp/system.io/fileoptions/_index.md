---
title: "System::IO::FileOptions перечисление"
linktitle: "FileOptions"
second_title: "Aspose.Page для C++"
description: "System::IO::FileOptions перечисление. Представляет расширенные параметры для создания объекта FileStream в C++."
type: docs
weight: 3200
url: /ru/cpp/system.io/fileoptions/
---
## FileOptions enum


Представляет расширенные параметры для создания объекта [FileStream](../filestream/).

```cpp
enum class FileOptions
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| None | 0 | Нет дополнительных параметров. |
| Encrypted | 16384 | Файл зашифрован. НЕ РЕАЛИЗОВАНО. |
| DeleteOnClose | 67108864 | Файл должен автоматически удаляться, когда он больше не используется. |
| SequentialScan | 134217728 | Файл должен быть доступен последовательно. |
| RandomAccess | 268435456 | Файл доступен случайным образом. |
| Asynchronous | 1073741824 | Файл может использоваться для асинхронных операций ввода-вывода. |
| WriteThrough | n/a | Все записи должны напрямую записываться на диск, обходя любой промежуточный кэш. |

## См. также

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
