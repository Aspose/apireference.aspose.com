---
title: "метод System::BuildObject"
linktitle: "BuildObject"
second_title: "Aspose.Page для C++"
description: "метод System::BuildObject. Создайте объект с совместным владением в C++."
type: docs
weight: 15200
url: /ru/cpp/system/buildobject/
---
## System::BuildObject method


Создайте объект с совместным владением.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| Параметр | Описание |
| --- | --- |
| T | Тип объекта для создания |
| Аргументы | Типы аргументов для создания объекта |

| Параметр | Тип | Описание |
| --- | --- | --- |
| args | Args\&&... | Аргументы для передачи конструктору объекта |

### ReturnValue

ObjectBuilder, настроенный для создания разделяемого указателя
## Примечания



Создаёт [SharedPtr<T>](../sharedptr/) и возвращает построитель для него
[Object](../object/) construction must be finished with [Get()](../get/) call 

## См. также

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
