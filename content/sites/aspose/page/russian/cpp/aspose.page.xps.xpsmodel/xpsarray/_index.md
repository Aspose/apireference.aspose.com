---
title: "Aspose::Page::XPS::XpsModel::XpsArray class"
linktitle: "XpsArray"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsModel::XpsArray class. Класс, инкапсулирующий общие возможности объектов массивов модели XPS в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.page.xps.xpsmodel/xpsarray/
---
## XpsArray class


Класс, инкапсулирующий общие возможности объектов массивов модели [XPS](../../aspose.page.xps/).

```cpp
template<typename T>class XpsArray : public Aspose::Page::XPS::XpsModel::XpsObject
```


| Параметр | Описание |
| --- | --- |
| T | Тип элементов массива. |
## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(T) | Добавляет новый объект в массив. |
| [get_Count](./get_count/)() | Возвращает количество элементов. |
| [idx_get](./idx_get/)(int32_t) | Обеспечивает доступ к элементу массива по индексу *i*. |
| [Insert](./insert/)(int32_t, T) | Вставляет новый объект в массив в указанную позицию. |
| [Remove](./remove/)(T) | Удаляет объект из массива. |
| [RemoveAt](./removeat/)(int32_t) | Удаляет объект из массива в указанной позиции. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Устанавливает n‑й аргумент шаблона как слабый указатель (вместо shared). Позволяет переключать указатели в контейнерах в режим weak. |

## См. также

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
