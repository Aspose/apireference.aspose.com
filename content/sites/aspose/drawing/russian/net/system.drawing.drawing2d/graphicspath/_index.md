---
title: GraphicsPath
second_title: Справочник по API Aspose.Drawing для .NET
description: Представляет набор соединенных линий и кривых.
type: docs
weight: 260
url: /ru/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

Представляет набор соединенных линий и кривых.

```csharp
public class GraphicsPath : IDisposable
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [GraphicsPath](graphicspath#constructor)() | Инициализирует новый экземпляр класса GraphicsPath со значением FillMode, равным Alternate. |
| [GraphicsPath](graphicspath#constructor_1)(FillMode) | Инициализирует новый экземпляр[`GraphicsPath`](../graphicspath)класс с указанным FillMode перечисление. |
| [GraphicsPath](graphicspath#constructor_2)(PointF[], byte[]) | Инициализирует новый экземпляр[`GraphicsPath`](../graphicspath) класс с указанным[`PathPointType`](../pathpointtype) а такжеPointF массивы. |
| [GraphicsPath](graphicspath#constructor_4)(Point[], byte[]) | Инициализирует новый экземпляр[`GraphicsPath`](../graphicspath) класс с указанным[`PathPointType`](../pathpointtype) а такжеPoint массивы. |
| [GraphicsPath](graphicspath#constructor_3)(PointF[], byte[], FillMode) | Инициализирует новый экземпляр[`GraphicsPath`](../graphicspath) класс с указаннымPathPointType а такжеPointF массивы и с указаннымFillMode элемент перечисления.. |
| [GraphicsPath](graphicspath#constructor_5)(Point[], byte[], FillMode) | Инициализирует новый экземпляр[`GraphicsPath`](../graphicspath) класс с указаннымPathPointType а такжеPoint массивы и с указаннымFillMode элемент перечисления.. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode) { get; set; } | Получает или задает перечисление FillMode, определяющее способ заполнения внутренней части фигур в этом GraphicsPath. |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata) { get; } | ПолучаетPathData который инкапсулирует массивы точек и типов для этогоGraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints) { get; } | Получает точки пути. |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes) { get; } | Получает типы соответствующих точек вPathPoints массив. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount) { get; } | Получает количество элементов вPathPoints илиPathTypes массив. |

## Методы

| Имя | Описание |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc_1)(RectangleF, float, float) | Добавляет эллиптическую дугу к текущей фигуре. |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc)(float, float, float, float, float, float) | Добавляет эллиптическую дугу к текущей фигуре. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier_1)(PointF, PointF, PointF, PointF) | Добавляет кубическую кривую Безье к текущей фигуре. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier)(float, float, float, float, float, float, float, float) | Добавляет кубическую кривую Безье к текущей фигуре. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers)(PointF[]) | Добавляет последовательность соединенных кубических кривых Безье к текущей фигуре. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers_1)(Point[]) | Добавляет последовательность соединенных кубических кривых Безье к текущей фигуре. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve)(PointF[]) | Добавляет замкнутую кривую к этому пути. Кардинальная кривая сплайна используется, потому что кривая проходит через каждую из точек в массиве. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve_1)(PointF[], float) | Добавляет к этому пути замкнутую кривую. Используется кардинальная кривая сплайна, поскольку кривая проходит через каждую точку массива. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve)(PointF[]) | Добавляет сплайновую кривую к текущей фигуре. Кардинальная кривая сплайна используется, потому что кривая проходит через каждую из точек в массиве. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_3)(Point[]) | Добавляет сплайновую кривую к текущей фигуре. Кардинальная кривая сплайна используется, потому что кривая проходит через каждую из точек в массиве. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_2)(PointF[], float) | Добавляет сплайновую кривую к текущей фигуре. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_1)(PointF[], int, int, float) | Добавляет сплайновую кривую к текущей фигуре. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse_1)(RectangleF) | Добавляет эллипс к текущему пути. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse)(float, float, float, float) | Добавляет эллипс к текущему пути. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline_1)(PointF, PointF) | Добавляет сегмент линии к этому GraphicsPath. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline)(float, float, float, float) | Добавляет сегмент линии к этому GraphicsPath. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines)(PointF[]) | Добавляет ряд соединенных сегментов линии в конец этогоGraphicsPath . |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines_1)(Point[]) | Добавляет ряд соединенных сегментов линии в конец этогоGraphicsPath . |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath)(GraphicsPath, bool) | Добавляет указанный GraphicsPath к этому пути. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie_1)(Rectangle, float, float) | Добавляет к этому пути контур круговой диаграммы. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie)(float, float, float, float, float, float) | Добавляет к этому пути контур круговой диаграммы. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon)(PointF[]) | Добавляет многоугольник к этому пути. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon_1)(Point[]) | Добавляет многоугольник к этому пути. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle)(Rectangle) | Добавляет прямоугольник к этому пути. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle_1)(RectangleF) | Добавляет прямоугольник к этому пути. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles)(RectangleF[]) | Добавляет ряд прямоугольников к этому пути. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles_1)(Rectangle[]) | Добавляет ряд прямоугольников к этому пути. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring)(string, FontFamily, int, float, Point, StringFormat) | Добавляет текстовую строку к этому пути. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | Добавляет текстовую строку к этому пути. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | Добавляет текстовую строку к этому пути. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | Добавляет текстовую строку к этому пути. |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone)() | Сделать копию текущего объекта пути. |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures)() | Закрывает все открытые фигуры на этом пути и начинает новую фигуру. Он закрывает каждую открытую фигуру, соединяя линию от конечной точки к начальной. |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure)() | Закрывает текущую фигуру и начинает новую фигуру. Если текущая фигура содержит последовательность соединенных линий и кривых, метод замыкает цикл, соединяя линию от конечной точки к начальной точке. |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose)() | Освобождает все ресурсы, используемые этим GraphicsPath. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten)() | Преобразует каждую кривую на этом пути в последовательность соединенных сегментов линии. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds)() | Возвращает прямоугольник, который ограничивает этоGraphicsPath . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_1)(Matrix) | Возвращает прямоугольник, который ограничивает этоGraphicsPath когда этот путь is преобразован указаннымMatrix . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_2)(Matrix, Pen) | Возвращает прямоугольник, который ограничивает этоGraphicsPath когда текущий путь is преобразован указаннымMatrix и нарисовано с указаннымPen . |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint)() | Получает последнюю точку в массиве PathPoints этого[`GraphicsPath`](../graphicspath) . |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible)(PointF, Pen) | Указывает, содержится ли указанная точка внутри (под) контура этогоGraphicsPath при рисовании с указаннымPen . |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible)(PointF) | Указывает, содержится ли указанная точка в этомGraphicsPath . |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset)() | Очищает[`PathPoints`](./pathpoints) а также[`PathTypes`](./pathtypes)arrays и устанавливает[`FillMode`](../fillmode) кAlternate . |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse)() | Меняет порядок точек в[`PathPoints`](./pathpoints) массив этого[`GraphicsPath`](../graphicspath) . |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers)() | Устанавливает маркер на этом[`GraphicsPath`](../graphicspath) . |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure)() | Начинает новую фигуру, не закрывая текущую фигуру. Все последующие точки, добавляемые к пути, добавляются к этой новой фигуре. |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform)(Matrix) | Применяет матрицу преобразования к этому GraphicsPath. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp)(PointF[], RectangleF) | Применяет преобразование деформации, заданное прямоугольником и параллелограммом, к этому[`GraphicsPath`](../graphicspath) . |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_1)(PointF[], RectangleF, Matrix) | Применяет преобразование деформации, заданное прямоугольником и параллелограммом, к этому[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | Применяет преобразование деформации, заданное прямоугольником и параллелограммом, к этому[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | Применяет преобразование деформации, заданное прямоугольником и параллелограммом, к этому[`GraphicsPath`](../graphicspath). |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen)(Pen) | Добавляет дополнительный контур пути. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen_1)(Pen, Matrix, float) | Заменяет этоGraphicsPath с кривыми, которые охватывают область, которая заполняется, когда этот путь рисуется указанным пером. |

### Смотрите также

* пространство имен [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
