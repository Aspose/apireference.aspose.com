---
title: XpsDocument.CreatePathFigure
second_title: Справочник по Aspose.Page для .NET API
description: XpsDocument метод. Создает новую фигуру пути.
type: docs
weight: 280
url: /ru/net/aspose.page.xps/xpsdocument/createpathfigure/
---
## CreatePathFigure(PointF, bool) {#createpathfigure}

Создает новую фигуру пути.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, bool isClosed = false)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | PointF | Начальная точка для первого сегмента фигуры пути. |
| isClosed | Boolean | Указывает, закрыт ли путь. Если установлено значение true, обводка рисуется "замкнутой", то есть последняя точка в последнем сегменте фигуры пути соединяется с точкой, указанной в атрибуте StartPoint, в противном случае обводка рисуется "открытой" и последней точка не связана с начальной точкой. Применимо только в том случае, если фигура пути is используется в элементе {Path}, определяющем штрих. |

### Возвращаемое значение

Новая фигура пути.

### Смотрите также

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsDocument](../)
* пространство имен [Aspose.Page.XPS](../../xpsdocument/)
* сборка [Aspose.Page](../../../)

---

## CreatePathFigure(PointF, List&lt;XpsPathSegment&gt;, bool) {#createpathfigure_1}

Создает новую фигуру пути.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, List<XpsPathSegment> segments, 
    bool isClosed = false)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | PointF | Начальная точка для первого сегмента фигуры пути. |
| segments | List`1 | Список сегментов пути. |
| isClosed | Boolean | Указывает, закрыт ли путь. Если установлено значение true, обводка рисуется "замкнутой", то есть последняя точка в последнем сегменте фигуры пути соединяется с точкой, указанной в атрибуте StartPoint, в противном случае обводка рисуется "открытой" и последней точка не связана с начальной точкой. Применимо только в том случае, если фигура пути is используется в элементе {Path}, определяющем штрих. |

### Возвращаемое значение

Новая фигура пути.

### Смотрите также

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* class [XpsDocument](../)
* пространство имен [Aspose.Page.XPS](../../xpsdocument/)
* сборка [Aspose.Page](../../../)


