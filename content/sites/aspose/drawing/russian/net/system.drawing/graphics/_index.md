---
title: Graphics
second_title: Справочник по API Aspose.Drawing для .NET
description: Инкапсулирует поверхность рисования.
type: docs
weight: 530
url: /ru/net/system.drawing/graphics/
---
## Graphics class

Инкапсулирует поверхность рисования.

```csharp
public class Graphics : IDisposable
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Clip](../../system.drawing/graphics/clip) { get; set; } | Получает или задаетRegion который ограничивает область рисования этогоGraphics . |
| [ClipBounds](../../system.drawing/graphics/clipbounds) { get; } | Получает[`RectangleF`](../rectanglef) структура, которая ограничивает область отсечения этого[`Graphics`](../graphics) . |
| [CompositingMode](../../system.drawing/graphics/compositingmode) { get; set; } | Получает или задает значение, указывающее, как составные изображения рисуются в этомGraphics . |
| [CompositingQuality](../../system.drawing/graphics/compositingquality) { get; set; } | Получает или задает качество рендеринга составных изображений, нарисованных на этомGraphics . |
| [DpiX](../../system.drawing/graphics/dpix) { get; } | Получает горизонтальное разрешение этогоGraphics . |
| [DpiY](../../system.drawing/graphics/dpiy) { get; } | Получает вертикальное разрешение этогоGraphics . |
| [InterpolationMode](../../system.drawing/graphics/interpolationmode) { get; set; } | Получает или задает режим интерполяции, связанный с этой графикой. |
| [IsClipEmpty](../../system.drawing/graphics/isclipempty) { get; } | Получает значение, указывающее, является ли область отсечения этогоGraphics пуст. |
| [IsVisibleClipEmpty](../../system.drawing/graphics/isvisibleclipempty) { get; } | Получает значение, указывающее, является ли видимая область отсечения этогоGraphics пуст. |
| [PageScale](../../system.drawing/graphics/pagescale) { get; set; } | Получает или задает масштаб между мировыми единицами и единицами страницы для этогоGraphics . |
| [PageUnit](../../system.drawing/graphics/pageunit) { get; set; } | Получает или задает единицу измерения, используемую для координат страницы в этомGraphics . |
| [PixelOffsetMode](../../system.drawing/graphics/pixeloffsetmode) { get; set; } | Получает или задает значение, указывающее, как смещаются пиксели во время рендеринга этогоGraphics . |
| [RenderingOrigin](../../system.drawing/graphics/renderingorigin) { get; set; } | Получает или задает источник рендеринга этогоGraphics для дизеринга и штриховки. |
| [SmoothingMode](../../system.drawing/graphics/smoothingmode) { get; set; } | Получает или задает качество рендеринга для этой графики. |
| [TextContrast](../../system.drawing/graphics/textcontrast) { get; set; } | Получает или задает значение гамма-коррекции для рендеринга текста. |
| [TextRenderingHint](../../system.drawing/graphics/textrenderinghint) { get; set; } | Получает или задает режим рендеринга для текста, связанного с этимGraphics . |
| [Transform](../../system.drawing/graphics/transform) { get; set; } | Получает или задает копию геометрического преобразования мира для этогоGraphics . |
| [VisibleClipBounds](../../system.drawing/graphics/visibleclipbounds) { get; } | Получает ограничивающий прямоугольник видимой области отсечения этогоGraphics . |

## Методы

| Имя | Описание |
| --- | --- |
| static [FromHwnd](../../system.drawing/graphics/fromhwnd)(IntPtr) | Создает новыйGraphics от указанного дескриптора к окну. |
| static [FromImage](../../system.drawing/graphics/fromimage)(Image) | Создает новую графику из указанного изображения. |
| [AddMetafileComment](../../system.drawing/graphics/addmetafilecomment)(byte[]) | Добавляет комментарий к текущемуMetafile . |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer)() | Сохраняет графический контейнер с текущим состоянием этогоGraphics и открывает и использует новый графический контейнер. |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer_1)(Rectangle, Rectangle, GraphicsUnit) | Сохраняет графический контейнер с текущим состоянием этогоGraphics и открывает и использует новый графический контейнер с указанным преобразованием масштаба. |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer_2)(RectangleF, RectangleF, GraphicsUnit) | Сохраняет графический контейнер с текущим состоянием этогоGraphics и открывает и использует новый графический контейнер с указанным преобразованием масштаба. |
| [Clear](../../system.drawing/graphics/clear)(Color) | Очищает всю поверхность рисования и заполняет ее указанным цветом фона. |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen_1)(Point, Point, Size) | Выполняет побитовую передачу цветовых данных, соответствующих прямоугольнику пикселей, с экрана на поверхность рисованияGraphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen_2)(Point, Point, Size, CopyPixelOperation) | Выполняет побитовую передачу цветовых данных, соответствующих прямоугольнику пикселей, с экрана на поверхность рисованияGraphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen)(int, int, int, int, Size, CopyPixelOperation) | Выполняет побитовую передачу данных о цвете, соответствующих прямоугольнику пикселей, с экрана на поверхность рисованияGraphics . |
| [Dispose](../../system.drawing/graphics/dispose)() | Освобождает все ресурсы, используемые этой графикой. |
| [DrawArc](../../system.drawing/graphics/drawarc#drawarc_1)(Pen, RectangleF, float, float) | Рисует дугу, представляющую часть эллипса, заданного структурой RectangleF. |
| [DrawArc](../../system.drawing/graphics/drawarc#drawarc)(Pen, float, float, float, float, float, float) | Рисует дугу, представляющую часть эллипса, заданную парой координат, шириной и высотой. |
| [DrawBezier](../../system.drawing/graphics/drawbezier#drawbezier_1)(Pen, PointF, PointF, PointF, PointF) | Рисует сплайн Безье, определяемый четырьмя структурами PointF. |
| [DrawBezier](../../system.drawing/graphics/drawbezier#drawbezier)(Pen, float, float, float, float, float, float, float, float) | Рисует сплайн Безье, определяемый четырьмя упорядоченными парами координат, представляющими точки. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers#drawbeziers)(Pen, PointF[]) | Рисует серию сплайнов Безье из массиваPoint структуры. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers#drawbeziers_1)(Pen, Point[]) | Рисует серию сплайнов Безье из массиваPointF структуры. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve)(Pen, PointF[]) | Рисует замкнутый кардинальный сплайн, определяемый массивомPointF структуры. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_2)(Pen, Point[]) | Рисует замкнутый кардинальный сплайн, определяемый массивомPoint структуры. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_1)(Pen, PointF[], float, FillMode) | Рисует замкнутый кардинальный сплайн, определяемый массивом структур PointF, используя указанное натяжение. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_3)(Pen, Point[], float, FillMode) | Рисует замкнутый кардинальный сплайн, определяемый массивомPoint конструкции с заданным натяжением. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve)(Pen, PointF[]) | Рисует кардинальный сплайн через заданный массивPointF структуры. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_4)(Pen, Point[]) | Рисует кардинальный сплайн через заданный массивPoint структуры. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_3)(Pen, PointF[], float) | Рисует кардинальный сплайн через заданный массивPointF конструкции с заданным натяжением. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_6)(Pen, Point[], float) | Рисует кардинальный сплайн через заданный массивPoint конструкции с заданным натяжением. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_1)(Pen, PointF[], int, int) | Рисует кардинальный сплайн через заданный массивPointF конструкции с заданным натяжением. Рисунок начинается со смещения от начала массива. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_2)(Pen, PointF[], int, int, float) | Рисует кардинальный сплайн через заданный массивPointF конструкции с заданным натяжением. Рисунок начинается со смещения от начала массива. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_5)(Pen, Point[], int, int, float) | Рисует кардинальный сплайн через заданный массивPoint конструкции с заданным натяжением. Рисунок начинается со смещения от начала массива. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse#drawellipse_1)(Pen, RectangleF) | Рисует эллипс, определяемый ограничивающим прямоугольником RectangleF. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse#drawellipse)(Pen, float, float, float, float) | Рисует эллипс, определяемый ограничивающим прямоугольником, заданным парой координат, высотой и шириной. |
| [DrawIcon](../../system.drawing/graphics/drawicon#drawicon_1)(Icon, Rectangle) | Рисует изображение, представленное указаннымIcon на территории, указаннойRectangle структура. |
| [DrawIcon](../../system.drawing/graphics/drawicon#drawicon)(Icon, int, int) | Рисует изображение, представленное указаннымIcon по указанным координатам. |
| [DrawIconUnstretched](../../system.drawing/graphics/drawiconunstretched)(Icon, Rectangle) | Рисует изображение, представленное указаннымIcon без масштабирования изображения. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_6)(Image, Point) | Рисует указанное изображение, используя исходный физический размер, в указанном месте. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_7)(Image, PointF) | Рисует указанныйImage , используя исходный физический размер, в указанном месте. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_8)(Image, PointF[]) | Рисует указанныйImage в указанном месте и с указанной формой и размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_11)(Image, Point[]) | Рисует указанныйЕ:Image в указанном месте и с указанной формой и размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_14)(Image, Rectangle) | Рисует указанное изображение в указанном месте и с указанным размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_20)(Image, RectangleF) | Рисует указанное изображение в указанном месте и с указанным размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_3)(Image, float, float) | Рисует указанныйImage , используя исходный физический размер, в указанном месте. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage)(Image, int, int) | Рисует указанное изображение, используя исходный физический размер, в месте, указанном парой координат. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_9)(Image, PointF[], RectangleF, GraphicsUnit) | Рисует указанную часть указанного изображения в указанном месте и с указанным размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_12)(Image, Point[], Rectangle, GraphicsUnit) | Рисует указанную часть указанногоImage в указанном месте и с указанным размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_19)(Image, Rectangle, Rectangle, GraphicsUnit) | Рисует указанную часть указанного изображения в указанном месте и с указанным размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_21)(Image, RectangleF, RectangleF, GraphicsUnit) | Рисует указанную часть указанного изображения в указанном месте и с указанным размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_4)(Image, float, float, float, float) | Рисует указанныйImage , используя исходный физический размер, в указанном месте и с указанным размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_5)(Image, float, float, RectangleF, GraphicsUnit) | Рисует часть изображения в указанном месте. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_1)(Image, int, int, int, int) | Рисует указанное изображение в указанном месте и с указанным размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_2)(Image, int, int, Rectangle, GraphicsUnit) | Рисует часть изображения в указанном месте. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_10)(Image, PointF[], RectangleF, GraphicsUnit, ImageAttributes) | Рисует указанную часть указанного изображения в указанном месте и с указанным размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_13)(Image, Point[], Rectangle, GraphicsUnit, ImageAttributes) | Рисует указанную часть указанногоImage в указанном месте и с указанным размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_17)(Image, Rectangle, float, float, float, float, GraphicsUnit) | Рисует указанную часть указанногоImage в указанном месте и с указанным размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_15)(Image, Rectangle, int, int, int, int, GraphicsUnit) | Рисует указанную часть указанногоImage в указанном месте и с указанным размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_18)(Image, Rectangle, float, float, float, float, GraphicsUnit, ImageAttributes) | Рисует указанную часть указанногоImage в указанном месте и с указанным размером. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_16)(Image, Rectangle, int, int, int, int, GraphicsUnit, ImageAttributes) | Рисует указанную часть указанного изображения в указанном месте и с указанным размером. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_2)(Image, Point) | Рисует указанное изображение, используя исходный физический размер в указанном месте. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_3)(Image, Rectangle) | Рисует указанное изображение, используя исходный физический размер в указанном месте. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled)(Image, int, int) | Рисует указанное изображение, используя его исходный физический размер в месте, указанном парой координат. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_1)(Image, int, int, int, int) | Рисует указанное изображение, используя его исходный физический размер в месте, указанном парой координат. |
| [DrawImageUnscaledAndClipped](../../system.drawing/graphics/drawimageunscaledandclipped)(Image, Rectangle) | Рисует заданное изображение без масштабирования и при необходимости обрезает его, чтобы оно поместилось в указанный прямоугольник. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_2)(Pen, Point, Point) | Рисует линию, соединяющую дваPoint структуры. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_3)(Pen, PointF, PointF) | Рисует линию, соединяющую две структуры PointF. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_1)(Pen, float, float, float, float) | Рисует линию, соединяющую две точки, заданные парами координат. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline)(Pen, int, int, int, int) | Рисует линию, соединяющую две точки, заданные парами координат. |
| [DrawLines](../../system.drawing/graphics/drawlines#drawlines)(Pen, PointF[]) | Рисует серию отрезков, соединяющих массивPointF структуры. |
| [DrawLines](../../system.drawing/graphics/drawlines#drawlines_1)(Pen, Point[]) | Рисует серию отрезков, соединяющих массивPoint структуры. |
| [DrawPath](../../system.drawing/graphics/drawpath)(Pen, GraphicsPath) | Рисует GraphicsPath. |
| [DrawPie](../../system.drawing/graphics/drawpie#drawpie_1)(Pen, RectangleF, float, float) | Рисует круговую форму, определяемую эллипсом, заданным структурой RectangleF, и двумя радиальными линиями. |
| [DrawPie](../../system.drawing/graphics/drawpie#drawpie)(Pen, float, float, float, float, float, float) | Рисует круговую форму, определяемую эллипсом, заданным парой координат, шириной, высотой и двумя радиальными линиями. |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon#drawpolygon)(Pen, PointF[]) | Рисует многоугольник, определяемый массивом структур PointF. |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon#drawpolygon_1)(Pen, Point[]) | Рисует многоугольник, определяемый массивомPoint структуры. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle_2)(Pen, Rectangle) | Рисует прямоугольник, заданный структурой Rectangle. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle_1)(Pen, float, float, float, float) | Рисует прямоугольник, заданный парой координат, шириной и высотой. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle)(Pen, int, int, int, int) | Рисует прямоугольник, заданный парой координат, шириной и высотой. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles#drawrectangles)(Pen, RectangleF[]) | Рисует серию прямоугольников, указанныхRectangleF структуры. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles#drawrectangles_1)(Pen, Rectangle[]) | Рисует серию прямоугольников, указанныхRectangle структуры. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_2)(string, Font, Brush, PointF) | Рисует указанную текстовую строку в указанном месте с указаннымBrush иFont объекты. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_4)(string, Font, Brush, RectangleF) | Рисует указанную текстовую строку в указанном прямоугольнике с указаннымBrush иFont объекты, использующие атрибуты форматирования указанныхStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring)(string, Font, Brush, float, float) | Рисует указанную текстовую строку в указанном месте с указаннымBrush а такжеFont объекты. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_3)(string, Font, Brush, PointF, StringFormat) | Рисует указанную текстовую строку в указанном месте с указаннымBrush и Font объекты, использующие атрибуты форматирования указанныхStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_5)(string, Font, Brush, RectangleF, StringFormat) | Рисует указанную текстовую строку в указанном прямоугольнике с указаннымBrush иFont объекты, использующие атрибуты форматирования указанныхStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_1)(string, Font, Brush, float, float, StringFormat) | Рисует указанную текстовую строку в указанном месте с указаннымBrush и Font объекты, использующие атрибуты форматирования указанныхStringFormat . |
| [EndContainer](../../system.drawing/graphics/endcontainer)(GraphicsContainer) | Закрывает текущий графический контейнер и восстанавливает состояние этогоGraphics в состояние, сохраненное вызовомBeginContainer метод. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile)(Metafile, Point, EnumerateMetafileProc) | Отправляет записи в указанном[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_6)(Metafile, PointF, EnumerateMetafileProc) | Отправляет записи в указанном[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_12)(Metafile, PointF[], EnumerateMetafileProc) | Отправляет записи в указанном[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_18)(Metafile, Point[], EnumerateMetafileProc) | Отправляет записи в указанном[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_24)(Metafile, Rectangle, EnumerateMetafileProc) | Отправляет записи указанного[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_30)(Metafile, RectangleF, EnumerateMetafileProc) | Отправляет записи указанного[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_1)(Metafile, Point, EnumerateMetafileProc, IntPtr) | Отправляет записи в указанном[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_7)(Metafile, PointF, EnumerateMetafileProc, IntPtr) | Отправляет записи в указанном[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_13)(Metafile, PointF[], EnumerateMetafileProc, IntPtr) | Отправляет записи в указанном[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_19)(Metafile, Point[], EnumerateMetafileProc, IntPtr) | Отправляет записи в указанном[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_25)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) | Отправляет записи указанного[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_31)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) | Отправляет записи указанного[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_2)(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) | Отправляет записи в указанном[`Metafile`](../../system.drawing.imaging/metafile) по одному, в метод обратного вызова для отображения в указанной точке с использованием указанных атрибутов изображения. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_3)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) | Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_8)(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) | Отправляет записи в указанном[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова method для отображения в указанной точке с использованием указанных атрибутов изображения. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_9)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_14)(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) | Отправляет записи в указанном[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме с использованием указанных атрибутов изображения. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_15)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) | Отправляет записи в выбранном прямоугольнике из S[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_20)(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) | Отправляет записи в указанном[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме с использованием указанных атрибутов изображения. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_21)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) | Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_26)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) | Отправляет записи указанного[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике с использованием указанных атрибутов изображения. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_27)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) | Отправляет записи выбранного прямоугольника из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_32)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) | Отправляет записи указанного[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике с использованием указанных атрибутов изображения. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_33)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | Отправляет записи выбранного прямоугольника из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_4)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_10)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_16)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_22)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_28)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Отправляет записи выбранного прямоугольника из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_34)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Отправляет записи выбранного прямоугольника из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_5)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../system.drawing.imaging/metafile) по одному, в метод обратного вызова для отображения в указанной точке с использованием указанных атрибутов изображения. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_11)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../system.drawing.imaging/metafile) по одному, в метод обратного вызова для отображения в указанной точке с использованием указанных атрибутов изображения. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_17)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме с использованием указанных атрибутов изображения. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_23)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме с использованием указанных атрибутов изображения. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_29)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Отправляет записи выбранного прямоугольника из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике с использованием указанных атрибутов изображения. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_35)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Отправляет записи выбранного прямоугольника из[`Metafile`](../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике с использованием указанных атрибутов изображения. |
| [ExcludeClip](../../system.drawing/graphics/excludeclip#excludeclip)(Rectangle) | Обновляет область клипа этогоGraphics чтобы исключить область, указаннуюRectangle |
| [ExcludeClip](../../system.drawing/graphics/excludeclip#excludeclip_1)(Region) | Обновляет область клипа этогоGraphics чтобы исключить область, указаннуюRegion . |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve)(Brush, PointF[]) | Заполняет внутреннюю часть замкнутой кардинальной сплайновой кривой, определяемой массивомPointF структуры. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_3)(Brush, Point[]) | Заполняет внутреннюю часть замкнутой кардинальной сплайновой кривой, определяемой массивомPoint структуры. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_1)(Brush, PointF[], FillMode) | Заполняет внутреннюю часть замкнутой кардинальной сплайновой кривой, определяемой массивомPointF структуры, использующие указанный режим заливки. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_4)(Brush, Point[], FillMode) | Заполняет внутреннюю часть замкнутой кардинальной сплайновой кривой, определяемой массивомPoint структуры, использующие указанный режим заливки. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_2)(Brush, PointF[], FillMode, float) | Заполняет внутреннюю часть замкнутой кардинальной сплайновой кривой, заданной массивом структур PointF , используя указанный режим заполнения и натяжение. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_5)(Brush, Point[], FillMode, float) | Заполняет внутреннюю часть замкнутой кардинальной сплайновой кривой, определяемой массивомPoint структуры, использующие указанный режим заливки. |
| [FillEllipse](../../system.drawing/graphics/fillellipse#fillellipse_1)(Brush, RectangleF) | Заполняет внутреннюю часть эллипса, определяемого ограничивающим прямоугольником, заданным структурой RectangleF. |
| [FillEllipse](../../system.drawing/graphics/fillellipse#fillellipse)(Brush, float, float, float, float) | Заполняет внутреннюю часть эллипса, определяемого ограничивающим прямоугольником, заданным парой координат, шириной и высотой. |
| [FillPath](../../system.drawing/graphics/fillpath)(Brush, GraphicsPath) | Заполняет внутреннюю часть GraphicsPath. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie_2)(Brush, Rectangle, float, float) | Заполняет внутреннюю часть сектора круговой диаграммы, определяемого эллипсом, заданным структурой Rectangle и двумя радиальными линиями. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie_1)(Brush, float, float, float, float, float, float) | Заполняет внутреннюю часть сектора круговой диаграммы, определяемого эллипсом, заданным парой координат, шириной, высотой и двумя радиальными линиями. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie)(Brush, int, int, int, int, int, int) | Заполняет внутреннюю часть сектора круговой диаграммы, определяемого эллипсом, заданным парой координат, шириной, высотой и двумя радиальными линиями. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon)(Brush, PointF[]) | Заполняет внутреннюю часть многоугольника, определяемого массивом точек, заданным параметромPointF структуры. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_2)(Brush, Point[]) | Заполняет внутреннюю часть многоугольника, определяемого массивом точек, заданным параметромPoint структуры. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_1)(Brush, PointF[], FillMode) | Заполняет внутреннюю часть многоугольника, определенного массивом точек, заданных структурами PointF, используя указанный режим заполнения. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_3)(Brush, Point[], FillMode) | Заполняет внутреннюю часть многоугольника, определяемого массивом точек, заданным параметромPoint структуры, использующие указанный режим заливки. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle#fillrectangle_1)(Brush, RectangleF) | Заполняет внутреннюю часть прямоугольника, заданного структурой RectangleF. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle#fillrectangle)(Brush, float, float, float, float) | Заполняет внутреннюю часть прямоугольника, заданного парой координат, шириной и высотой. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles#fillrectangles)(Brush, RectangleF[]) | Заполняет внутреннюю часть ряда прямоугольников, заданных параметромRectangleF структуры. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles#fillrectangles_1)(Brush, Rectangle[]) | Заполняет внутреннюю часть ряда прямоугольников, заданных параметромRectangle структуры. |
| [FillRegion](../../system.drawing/graphics/fillregion)(Brush, Region) | Заполняет внутреннюю часть региона. |
| [Flush](../../system.drawing/graphics/flush#flush)() | Принудительно выполняет все ожидающие графические операции и возвращает немедленно, не дожидаясь завершения операций. |
| [Flush](../../system.drawing/graphics/flush#flush_1)(FlushIntention) | Принудительное выполнение всех ожидающих графических операций с ожиданием или неожиданием метода, как указано, для возврата до завершения операций. |
| [GetHdc](../../system.drawing/graphics/gethdc)() | Получает дескриптор контекста устройства, связанного с этимGraphics . |
| [GetNearestColor](../../system.drawing/graphics/getnearestcolor)(Color) | Получает ближайший цвет к указанномуColor структура. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip)(Rectangle) | Обновляет область клипа этогоGraphics до пересечения текущей области отсечения и указанногоRectangle структура. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip_1)(RectangleF) | Обновляет область клипа этогоGraphics до пересечения текущей области отсечения и указанногоRectangleF структура. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip_2)(Region) | Обновляет область клипа этогоGraphics до пересечения текущей области отсечения и указанногоRegion . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_4)(Point) | Указывает, является ли указанныйPoint структура содержится в видимой области клипа этогоGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_5)(PointF) | Указывает, является ли указанныйPointF структура содержится в видимой области клипа этогоGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_6)(Rectangle) | Указывает, является ли прямоугольник, заданныйRectangle структура содержится в видимой области клипа этогоGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_7)(RectangleF) | Указывает, является ли прямоугольник, заданныйRectangleF структура содержится в видимой области клипа этогоGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_2)(float, float) | Указывает, содержится ли точка, заданная парой координат, в пределах видимой области отсечения этогоGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible)(int, int) | Указывает, содержится ли точка, заданная парой координат, в пределах видимой области отсечения этогоGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_3)(float, float, float, float) | Указывает, содержится ли прямоугольник, заданный парой координат, шириной и высотой, в пределах видимой области отсечения этогоGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_1)(int, int, int, int) | Указывает, содержится ли прямоугольник, заданный парой координат, шириной и высотой, в пределах видимой области отсечения этогоGraphics . |
| [MeasureCharacterRanges](../../system.drawing/graphics/measurecharacterranges)(string, Font, RectangleF, StringFormat) | Получает массивRegion объекты, каждый из которых ограничивает диапазон позиций символов в указанной строке. |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring)(string, Font) | Измеряет указанную строку при рисовании с указаннымFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_1)(string, Font, int) | Измеряет указанную строку при рисовании с указаннымFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_4)(string, Font, SizeF) | Измеряет указанную строку при рисовании с указаннымFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_2)(string, Font, int, StringFormat) | Измеряет указанную строку при рисовании с указаннымFont и formatted с указаннымStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_3)(string, Font, PointF, StringFormat) | Измеряет указанную строку при рисовании с указаннымFont и formatted с указаннымStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_5)(string, Font, SizeF, StringFormat) | Измеряет указанную строку при рисовании с указаннымFont и formatted с указаннымStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_6)(string, Font, SizeF, StringFormat, out int, out int) | Измеряет указанную строку при рисовании с указаннымFont и formatted с указаннымStringFormat . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform#multiplytransform)(Matrix) | Умножает мировое преобразование этогоGraphics и указалMatrix . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Умножает мировое преобразование этогоGraphics и указанный Matrix в указанном порядке. |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc#releasehdc)() | Освобождает дескриптор контекста устройства, полученный предыдущим вызовом to GetHdc метод этогоGraphics . |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc#releasehdc_1)(IntPtr) | Освобождает дескриптор контекста устройства, полученный предыдущим вызовомGetHdc method этогоGraphics . |
| [ResetClip](../../system.drawing/graphics/resetclip)() | Сбрасывает область клипа этогоGraphics в бесконечную область. |
| [ResetTransform](../../system.drawing/graphics/resettransform)() | Сбрасывает матрицу трансформации мира этогоGraphics к единичной матрице. |
| [Restore](../../system.drawing/graphics/restore)(GraphicsState) | Восстанавливает состояние этого[`Graphics`](../graphics) государству, представленному[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate) . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform#rotatetransform)(float) | Применяет указанный поворот к матрице преобразования этогоGraphics . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Применяет указанный поворот к матрице преобразования этогоGraphics в указанном порядке. |
| [Save](../../system.drawing/graphics/save)() | Сохраняет текущее состояние этого[`Graphics`](../graphics) и идентифицирует сохраненное состояние с[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate) . |
| [ScaleTransform](../../system.drawing/graphics/scaletransform#scaletransform)(float, float) | Применяет указанную операцию масштабирования к матрице преобразования этогоGraphics добавив it перед матрицей преобразования объекта. |
| [ScaleTransform](../../system.drawing/graphics/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Применяет указанную операцию масштабирования к матрице преобразования этогоGraphics в указанном порядке. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_2)(Graphics) | Устанавливает область отсечения этого[`Graphics`](../graphics) к свойству Clip указанного[`Graphics`](../graphics) |
| [SetClip](../../system.drawing/graphics/setclip#setclip)(GraphicsPath) | Устанавливает область отсечения этого[`Graphics`](../graphics) к указанному[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_4)(Rectangle) | Устанавливает область отсечения этого[`Graphics`](../graphics) к результату указанной операции, объединяющей текущую область отсечения и прямоугольник, указанный[`Rectangle`](../rectangle) структура. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_6)(RectangleF) | Устанавливает область отсечения этого[`Graphics`](../graphics) к результату указанной операции, объединяющей текущую область отсечения и прямоугольник, указанный[`RectangleF`](../rectanglef) структура. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_3)(Graphics, CombineMode) | Устанавливает область отсечения этого[`Graphics`](../graphics) к результату указанной операции объединения текущей области клипа и свойства Clip указанного[`Graphics`](../graphics) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_1)(GraphicsPath, CombineMode) | Устанавливает область отсечения этого[`Graphics`](../graphics) к результату указанной операции, объединяющей текущий регион клипа и указанный[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_5)(Rectangle, CombineMode) | Устанавливает область отсечения этого[`Graphics`](../graphics) к результату указанной операции, объединяющей текущую область отсечения и прямоугольник, указанный[`Rectangle`](../rectangle) структура. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_7)(RectangleF, CombineMode) | Устанавливает область отсечения этого[`Graphics`](../graphics) к результату указанной операции, объединяющей текущую область отсечения и прямоугольник, указанный[`RectangleF`](../rectanglef) структура. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_8)(Region, CombineMode) | Устанавливает область отсечения этогоGraphicsк результату указанной операции, объединяющей текущую область клипа и указанныйRegion . |
| [TransformPoints](../../system.drawing/graphics/transformpoints#transformpoints)(CoordinateSpace, CoordinateSpace, PointF[]) | Преобразует массив точек из одного координатного пространства в другое, используя текущие преобразования мира и страницы этогоGraphics . |
| [TransformPoints](../../system.drawing/graphics/transformpoints#transformpoints_1)(CoordinateSpace, CoordinateSpace, Point[]) | Преобразует массив точек из одного координатного пространства в другое, используя текущие преобразования мира и страницы этогоGraphics . |
| [TranslateClip](../../system.drawing/graphics/translateclip#translateclip_1)(float, float) | Переводит область отсечения этогоGraphics на указанные суммы в горизонтальном и вертикальном направлениях. |
| [TranslateClip](../../system.drawing/graphics/translateclip#translateclip)(int, int) | Переводит область отсечения этогоGraphics на указанные суммы в горизонтальном и вертикальном направлениях. |
| [TranslateTransform](../../system.drawing/graphics/translatetransform#translatetransform)(float, float) | Изменяет начало системы координат, добавляя указанный translation к матрице преобразования этогоGraphics . |
| [TranslateTransform](../../system.drawing/graphics/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Изменяет начало системы координат, применяя указанный перевод к матрице преобразования этойGraphics в указанном порядке. |

## Другие члены

| Имя | Описание |
| --- | --- |
| delegate [DrawImageAbort](graphics.drawimageabort) | Предоставляет метод обратного вызова для принятия решения о том, когда[`DrawImage`](./drawimage) метод должен преждевременно отменить выполнение и прекратить отрисовку изображения. |
| delegate [EnumerateMetafileProc](graphics.enumeratemetafileproc) | Предоставляет метод обратного вызова для[`EnumerateMetafile`](./enumeratemetafile) метод. |

### Смотрите также

* пространство имен [System.Drawing](../../system.drawing)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
