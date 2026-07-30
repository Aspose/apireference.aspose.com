---
title: "System::InitObject метод"
linktitle: "InitObject"
second_title: "Aspose.Font для C++"
description: "System::InitObject метод. Запускает инициализацию объекта с совместным владением в C++."
type: docs
weight: 21900
url: /ru/cpp/system/initobject/
---
## System::InitObject method


Запускает инициализацию объекта с совместным владением.

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

ObjectBuilder, настроенный для создания shared pointer
## Примечания



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## См. также

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
