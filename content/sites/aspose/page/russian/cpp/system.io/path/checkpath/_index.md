---
title: "System::IO::Path::CheckPath метод"
linktitle: "CheckPath"
second_title: "Aspose.Page для C++"
description: "System::IO::Path::CheckPath метод. Определяет, является ли указанный путь действительным, проверяя наличие недопустимых символов. Исключение выбрасывается, если путь содержит недопустимые символы в C++."
type: docs
weight: 200
url: /ru/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


Определяет, является ли указанный путь действительным, проверяя наличие недопустимых символов. Исключение выбрасывается, если путь содержит недопустимые символы.

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Путь для проверки |
| msg | const String\& | Сообщение, передаваемое конструктору объекта исключения |
| allow_empty | bool | Указывает, следует ли рассматривать пустую или нулевую строку как корректный путь (true) или нет (false); если этот параметр равен false и **path** пуст, выбрасывается ArgumentException; если этот параметр равен false и **path** равен null, выбрасывается ArgumentNullException |

## См. также

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
