---
title: Line
second_title: Справочник по Aspose.Cells для .NET API
description: Инкапсулирует объект представляющий формат строки.
type: docs
weight: 2200
url: /ru/net/aspose.cells.drawing/line/
---
## Line class

Инкапсулирует объект, представляющий формат строки.

```csharp
public class Line
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [BeginArrowLength](../../aspose.cells.drawing/line/beginarrowlength) { get; set; } | Определяет длину стрелки для начала строки. |
| [BeginArrowWidth](../../aspose.cells.drawing/line/beginarrowwidth) { get; set; } | Определяет ширину стрелки для начала строки. |
| [BeginType](../../aspose.cells.drawing/line/begintype) { get; set; } | Указывает стрелку для начала строки. |
| [CapType](../../aspose.cells.drawing/line/captype) { get; set; } | Указывает конечные заглавные буквы. |
| [Color](../../aspose.cells.drawing/line/color) { get; set; } | ПредставляетColor линии. |
| [CompoundType](../../aspose.cells.drawing/line/compoundtype) { get; set; } | Указывает тип составной линии |
| [DashType](../../aspose.cells.drawing/line/dashtype) { get; set; } | Определяет тип пунктирной линии |
| [EndArrowLength](../../aspose.cells.drawing/line/endarrowlength) { get; set; } | Определяет длину стрелки для конца строки. |
| [EndArrowWidth](../../aspose.cells.drawing/line/endarrowwidth) { get; set; } | Определяет ширину стрелки для конца строки. |
| [EndType](../../aspose.cells.drawing/line/endtype) { get; set; } | Указывает конец строки со стрелкой. |
| [FormattingType](../../aspose.cells.drawing/line/formattingtype) { get; set; } | Получает или задает тип формата. |
| [GradientFill](../../aspose.cells.drawing/line/gradientfill) { get; } | Представляет градиентную заливку. |
| [IsAuto](../../aspose.cells.drawing/line/isauto) { get; set; } | Указывает, назначается ли этот стиль линии автоматически. |
| [IsAutomaticColor](../../aspose.cells.drawing/line/isautomaticcolor) { get; } | Указывает, назначается ли цвет линии автоматически. |
| [IsVisible](../../aspose.cells.drawing/line/isvisible) { get; set; } | Указывает, видна ли линия. |
| [JoinType](../../aspose.cells.drawing/line/jointype) { get; set; } | Определяет соединительные заглавные буквы. |
| [Style](../../aspose.cells.drawing/line/style) { get; set; } | Представляет стиль линии. |
| [ThemeColor](../../aspose.cells.drawing/line/themecolor) { get; set; } | Получает и устанавливает цвет темы. |
| [Transparency](../../aspose.cells.drawing/line/transparency) { get; set; } | Возвращает или задает степень прозрачности линии в виде значения от 0,0 (непрозрачная) до 1,0 (прозрачная). |
| [Weight](../../aspose.cells.drawing/line/weight) { get; set; } | Получает или задает[`WeightType`](../weighttype) линии. |
| [WeightPt](../../aspose.cells.drawing/line/weightpt) { get; set; } | Получает или задает вес линии в пунктах. |
| [WeightPx](../../aspose.cells.drawing/line/weightpx) { get; set; } | Получает или задает вес линии в пикселях. |

### Примеры

```csharp

[C#]

Workbook workbook = new Workbook();
Worksheet sheet = workbook.Worksheets[0];

Cells cells = sheet.Cells;
cells[0,1].PutValue("Income");
cells[1,0].PutValue("Company A");
cells[2,0].PutValue("Company B");
cells[3,0].PutValue("Company C");
cells[1,1].PutValue(10000);
cells[2,1].PutValue(20000);
cells[3,1].PutValue(30000);

int chartIndex = sheet.Charts.Add(ChartType.Line, 9, 9, 21, 15);
Chart chart = sheet.Charts[chartIndex];
// Применение стиля пунктирной линии к линиям NSeries
chart.NSeries[0].Border.Style = LineType.Dot;
chart.NSeries[0].Border.Color = Color.Red;
// Применение стиля треугольного маркера к маркерам данных NSeries
chart.NSeries[0].Marker.MarkerStyle = ChartMarkerType.Triangle;
//Установка веса всех строк в NSeries на средний
chart.NSeries[0].Border.Weight = WeightType.MediumLine;

[Visual Basic]

Dim workbook as Workbook = new Workbook()
Dim sheet as Worksheet = workbook.Worksheets(0)

Dim cells as Cells = sheet.Cells
cells(0,1).PutValue("Income")
cells(1,0).PutValue("Company A")
cells(2,0).PutValue("Company B")
cells(3,0).PutValue("Company C")
cells(1,1).PutValue(10000)
cells(2,1).PutValue(20000)
cells(3,1).PutValue(30000)
		
Dim chartIndex as Integer = sheet.Charts.Add(ChartType.Column, 9, 9, 21, 15)    ///
Dim chart as Chart = sheet.Charts(chartIndex)
'Применение стиля пунктирной линии к линиям NSeries
chart.NSeries(0).Border.Style = LineType.Dot
chart.NSeries(0).Border.Color = Color.Red
'Применение стиля треугольного маркера к маркерам данных NSeries
chart.NSeries(0).Marker.MarkerStyle = ChartMarkerType.Triangle
'Установка веса всех линий в NSeries на средний
chart.NSeries(0).Border.Weight = WeightType.MediumLine
```

### Смотрите также

* пространство имен [Aspose.Cells.Drawing](../../aspose.cells.drawing)
* сборка [Aspose.Cells](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
