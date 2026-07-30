---
title: "System::Net::Http::Headers::ObjectCollection class"
linktitle: "ObjectCollection"
second_title: "Aspose.Font для C++"
description: "System::Net::Http::Headers::ObjectCollection class. Представляет коллекцию объектов в C++."
type: docs
weight: 1600
url: /ru/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


Представляет коллекцию объектов.

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| Параметр | Описание |
| --- | --- |
| T | Тип объекта. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента. |
## Методы

| Метод | Описание |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | Информация RTTI. |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | Создаёт новый экземпляр. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Установите n‑й аргумент шаблона как слабый указатель (а не shared). Позволяет переключать указатели в контейнерах в режим weak. |

## См. также

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
