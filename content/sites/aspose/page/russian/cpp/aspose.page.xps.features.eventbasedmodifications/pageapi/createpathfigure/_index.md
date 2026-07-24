---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure метод"
linktitle: "CreatePathFigure"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure метод. Создаёт новую фигуру пути в C++."
type: docs
weight: 1500
url: /ru/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/
---
## PageAPI::CreatePathFigure(System::Drawing::PointF, bool) method


Создает новую фигуру пути.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Начальная точка первого сегмента фигуры пути. |
| isClosed | bool | Указывает, закрыт ли путь. Если установить значение true, штрих рисуется "closed", то есть последняя точка последнего сегмента фигуры пути соединяется с точкой, указанной в атрибуте StartPoint, иначе штрих рисуется "open", и последняя точка не соединяется с начальной точкой. Применяется только если фигура пути используется в элементе Path, который задает штрих. |

### ReturnValue

Новая фигура пути.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


Создает новую фигуру пути.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Начальная точка первого сегмента фигуры пути. |
| сегменты | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | Список сегментов пути. |
| isClosed | bool | Указывает, закрыт ли путь. Если установить значение true, штрих рисуется "closed", то есть последняя точка последнего сегмента фигуры пути соединяется с точкой, указанной в атрибуте StartPoint, иначе штрих рисуется "open", и последняя точка не соединяется с начальной точкой. Применяется только если фигура пути используется в элементе Path, который задает штрих. |

### ReturnValue

Новая фигура пути.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
