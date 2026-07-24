---
title: "Метод System::InitObject"
linktitle: "InitObject"
second_title: "Aspose.Page для C++"
description: "Метод System::InitObject. Запускает инициализацию объекта с разделяемым владением в C++."
type: docs
weight: 21800
url: /ru/cpp/system/initobject/
---
## System::InitObject method


Запускает инициализацию объекта с разделяемым владением.

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| Параметр | Описание |
| --- | --- |
| T | Тип объекта для инициализации |

| Параметр | Тип | Описание |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../object/) для инициализации |

### ReturnValue

ObjectBuilder, настроенный для создания разделяемого указателя
## Примечания



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## См. также

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
