---
title: "Метод System::Build"
linktitle: "Build"
second_title: "Aspose.Page для C++"
description: "Метод System::Build. Создаёт объект с прямым владением в C++."
type: docs
weight: 15000
url: /ru/cpp/system/build/
---
## System::Build method


Создать объект с прямым владением.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| Параметр | Описание |
| --- | --- |
| T | Тип объекта для создания |
| Аргументы | Типы аргументов для создания объекта |

| Параметр | Тип | Описание |
| --- | --- | --- |
| args | Args\&&... | Аргументы для передачи конструктору объекта |

### ReturnValue

ObjectBuilder, настроенный для прямого создания объекта
## Примечания



[Object](../object/) construction must be finished with [Get()](../get/) call 

## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
