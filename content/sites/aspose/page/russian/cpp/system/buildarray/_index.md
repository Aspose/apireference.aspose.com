---
title: "System::BuildArray method"
linktitle: "BuildArray"
second_title: "Aspose.Page для C++"
description: "System::BuildArray метод. Создайте массив в C++."
type: docs
weight: 15100
url: /ru/cpp/system/buildarray/
---
## System::BuildArray method


Создайте массив.

```cpp
template<typename T> Details::ObjectBuilder<Details::ArrayStorage<T>> System::BuildArray()
```


| Параметр | Описание |
| --- | --- |
| T | Тип элементов массива для создания |

### ReturnValue

ObjectBuilder, настроенный для построения массива
## Примечания



Создаёт [ArrayPtr<T>](../arrayptr/) и возвращает построитель для него
[Object](../object/) construction must be finished with [Get()](../get/) call 

## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
