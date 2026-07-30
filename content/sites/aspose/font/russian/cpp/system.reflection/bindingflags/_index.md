---
title: "System::Reflection::BindingFlags enum"
linktitle: "BindingFlags"
second_title: "Aspose.Font для C++"
description: "System::Reflection::BindingFlags enum. Определяет режимы поиска членов и типов и привязки в C++."
type: docs
weight: 1100
url: /ru/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


Определяет режимы поиска членов и типов и их связывание.

```cpp
enum class BindingFlags
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Default | 0 | Нет специальных параметров. |
| IgnoreCase | 1 | Игнорировать регистр имени при поиске элемента. |
| DeclaredOnly | 2 | Искать только члены, объявленные в типе, и не искать в базовых типах. |
| Instance | 4 | Искать среди экземплярных членов. |
| Static | 8 | Искать среди статических членов. |
| Public | 16 | Искать среди публичных членов. |
| NonPublic | 32 | Искать среди непубличных членов. |
| FlattenHierarchy | 64 | Искать среди публичных и защищённых статических членов базового типа. |
| InvokeMethod | 256 | Вызывает метод. |
| CreateInstance | 512 | Создаёт экземпляр отражённого типа. |
| GetField | 1024 | Получает значение поля. |
| SetField | 2048 | Устанавливает значение поля. |
| GetProperty | 4096 | Получает значение свойства. |
| SetProperty | 8192 | Устанавливает значение свойства. |
| PutDispProperty | 16384 | Устанавливает COM-свойство. |
| PutRefDispProperty | 32768 | Устанавливает COM-свойство-ссылку. |
| ExactBinding | 65536 | Привязка типа должна быть точной, без каких‑либо изменений типа. |
| SuppressChangeType | 131072 | Не поддерживается. |
| OptionalParamBinding | 262144 | Выбирает перегрузку на основе количества аргументов. |
| IgnoreReturn | 16777216 | Игнорирует возвращаемое значение COM-interop. |

## См. также

* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
