---
title: PdfDevice
second_title: Справочник по Aspose.SVG для .NET API
description: Представляет рендеринг в документ pdf.
type: docs
weight: 2890
url: /ru/net/aspose.svg.rendering.pdf/pdfdevice/
---
## PdfDevice class

Представляет рендеринг в документ pdf.

```csharp
public class PdfDevice : Device<PdfGraphicContext, PdfRenderingOptions>
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [PdfDevice](pdfdevice#constructor)(ICreateStreamProvider) | Инициализирует новый экземпляр класса[`PdfDevice`](../pdfdevice). |
| [PdfDevice](pdfdevice#constructor_4)(Stream) | Инициализирует новый экземпляр класса[`PdfDevice`](../pdfdevice). |
| [PdfDevice](pdfdevice#constructor_5)(string) | Инициализирует новый экземпляр класса[`PdfDevice`](../pdfdevice). |
| [PdfDevice](pdfdevice#constructor_1)(PdfRenderingOptions, ICreateStreamProvider) | Инициализирует новый экземпляр класса[`PdfDevice`](../pdfdevice)с помощью параметров рендеринга и поставщика потоков. |
| [PdfDevice](pdfdevice#constructor_2)(PdfRenderingOptions, Stream) | Инициализирует новый экземпляр класса[`PdfDevice`](../pdfdevice)с помощью параметров рендеринга и выходного потока. |
| [PdfDevice](pdfdevice#constructor_3)(PdfRenderingOptions, string) | Инициализирует новый экземпляр класса[`PdfDevice`](../pdfdevice)параметрами рендеринга и именем выходного файла. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device`2/graphiccontext) { get; } |  |
| [Options](../../aspose.svg.rendering/device`2/options) { get; } |  |

## Методы

| Имя | Описание |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.pdf/pdfdevice/addrect)(RectangleF) | Добавляет прямоугольник к текущему пути как полный подпуть. |
| override [BeginDocument](../../aspose.svg.rendering.pdf/pdfdevice/begindocument)(Document) | Начинает визуализацию документа. |
| override [BeginElement](../../aspose.svg.rendering.pdf/pdfdevice/beginelement)(Element, RectangleF) | Начинает визуализацию элемента. |
| override [BeginPage](../../aspose.svg.rendering.pdf/pdfdevice/beginpage)(SizeF) | Начинает рендеринг новой страницы. |
| override [Clip](../../aspose.svg.rendering.pdf/pdfdevice/clip)(FillMode) | Изменяет текущий путь отсечения, пересекая его с текущим путем, используя правило FillMode для определения области для заполнения. Этот метод завершает текущий путь. |
| override [ClosePath](../../aspose.svg.rendering.pdf/pdfdevice/closepath)() | Закрывает текущий подконтур, добавляя отрезок прямой от текущей точки до начальной точки подконтура. Если текущий подпуть уже закрыт, "ClosePath" ничего не делает. Этот оператор завершает текущий подпуть. При добавлении другого сегмента к текущему пути начинается новый подпуть, , даже если новый сегмент начинается в конечной точке, достигнутой методом ClosePath. |
| override [CubicBezierTo](../../aspose.svg.rendering.pdf/pdfdevice/cubicbezierto)(PointF, PointF, PointF) | Добавляет кубическую кривую Безье к текущему пути. Кривая продолжается от текущей точки до точки pt2, , используя pt1 и pt2 в качестве контрольных точек Безье. Новая текущая точка - pt3. |
| [Dispose](../../aspose.svg.rendering/device`2/dispose)() |  |
| override [DrawImage](../../aspose.svg.rendering.pdf/pdfdevice/drawimage)(byte[], ImageType, RectangleF) | Рисует заданное изображение. |
| override [EndDocument](../../aspose.svg.rendering.pdf/pdfdevice/enddocument)() | Завершает визуализацию документа. |
| override [EndElement](../../aspose.svg.rendering.pdf/pdfdevice/endelement)(Element) | Завершает визуализацию элемента. |
| override [EndPage](../../aspose.svg.rendering.pdf/pdfdevice/endpage)() | Завершает отображение текущей страницы. |
| override [Fill](../../aspose.svg.rendering.pdf/pdfdevice/fill)(FillMode) | Заполняет всю область, ограниченную текущим путем. Если путь состоит из нескольких несвязанных подпутей, он заполняет внутренности всех подпутей, рассматриваемых вместе. Этот метод завершает текущий путь. |
| override [FillText](../../aspose.svg.rendering.pdf/pdfdevice/filltext)(string, PointF) | Заполняет указанную текстовую строку в указанном месте. |
| override [Flush](../../aspose.svg.rendering.pdf/pdfdevice/flush)() | Сбрасывает все данные в выходной поток. |
| override [LineTo](../../aspose.svg.rendering.pdf/pdfdevice/lineto)(PointF) | Добавляет отрезок прямой из текущей точки в точку (pt). Новая текущая точка - pt. |
| override [MoveTo](../../aspose.svg.rendering.pdf/pdfdevice/moveto)(PointF) | Начинает новый подконтур, перемещая текущую точку в координаты параметра pt, опуская любой соединительный отрезок. Если предыдущий метод построения пути в текущем пути также был "MoveTo", новый "MoveTo" переопределяет его; в пути не осталось следов предыдущей операции "MoveTo". |
| override [RestoreGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/restoregraphiccontext)() | Восстанавливает весь графический контекст до его прежнего значения, выталкивая его из стека. |
| override [SaveGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/savegraphiccontext)() | Помещает в стек копию всего графического контекста. |
| override [Stroke](../../aspose.svg.rendering.pdf/pdfdevice/stroke)() | Проводит линию по текущему пути. Заштрихованная линия следует за каждым прямым или изогнутым сегментом пути, центрируется на сегменте со сторонами, параллельными ему. Каждый из подпутей пути обрабатывается отдельно. Этот метод завершает текущий путь. |
| override [StrokeAndFill](../../aspose.svg.rendering.pdf/pdfdevice/strokeandfill)(FillMode) | Штрихи и заливка текущего пути. Этот метод завершает текущий путь. |
| override [StrokeText](../../aspose.svg.rendering.pdf/pdfdevice/stroketext)(string, PointF) | Перемещает указанную текстовую строку в указанном месте. |

## Другие члены

| Имя | Описание |
| --- | --- |
| class [PdfGraphicContext](pdfdevice.pdfgraphiccontext) | Содержит текущие параметры управления графикой для PdfDevice. Эти параметры определяют глобальную структуру, в которой выполняются графические операторы. |

### Смотрите также

* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2)
* class [PdfGraphicContext](../pdfdevice.pdfgraphiccontext)
* class [PdfRenderingOptions](../pdfrenderingoptions)
* пространство имен [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf)
* сборка [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
