---
title: "Метод System::Build"
linktitle: "Build"
second_title: "Aspose.Font для C++"
description: "Метод System::Build. Создаёт объект с прямым владением в C++."
type: docs
weight: 15100
url: /ru/cpp/system/build/
---
## System::Build method


Создаёт объект с прямым владением.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| Параметр | Описание |
| --- | --- |
| T | Тип объекта для создания |
| Аргументы | Типы аргументов для построения объекта |

| Параметр | Тип | Описание |
| --- | --- | --- |
| args | Args\&&... | Аргументы для передачи конструктору объекта |

### ReturnValue

ObjectBuilder, настроенный для прямого построения объекта
## Примечания



[Object](../object/) construction must be finished with [Get()](../get/) call 

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
