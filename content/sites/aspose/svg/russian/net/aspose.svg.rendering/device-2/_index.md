---
title: Class DeviceTGraphicContextTRenderingOptions
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.Rendering.Device2TGraphicContextTRenderingOptions сорт. Представляет базовый класс для реализации конкретных устройств рендеринга.
type: docs
weight: 2740
url: /ru/net/aspose.svg.rendering/device-2/
---
## Device&lt;TGraphicContext,TRenderingOptions&gt; class

Представляет базовый класс для реализации конкретных устройств рендеринга.

```csharp
public abstract class Device<TGraphicContext, TRenderingOptions> : Device, IDevice
    where TGraphicContext : GraphicContext, new()
    where TRenderingOptions : RenderingOptions
```

| Параметр | Описание |
| --- | --- |
| TGraphicContext | Графический контекст, содержащий текущие параметры управления графикой |
| TRenderingOptions | Параметры рендеринга |

## Характеристики

| Имя | Описание |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device-2/graphiccontext/) { get; } | Получает графический контекст |
| [Options](../../aspose.svg.rendering/device-2/options/) { get; } | Получает параметры рендеринга. |

## Методы

| Имя | Описание |
| --- | --- |
| abstract [AddRect](../../aspose.svg.rendering/device-2/addrect/)(RectangleF) | Добавляет прямоугольник к текущему пути в качестве полного подпути. |
| virtual [BeginDocument](../../aspose.svg.rendering/device-2/begindocument/)(Document) | Начинает визуализацию документа. |
| abstract [BeginElement](../../aspose.svg.rendering/device-2/beginelement/)(Element, RectangleF) | Начинает визуализацию узла. |
| virtual [BeginPage](../../aspose.svg.rendering/device-2/beginpage/)(SizeF) | Начинает рендеринг новой страницы. |
| abstract [Clip](../../aspose.svg.rendering/device-2/clip/)(FillMode) | Изменяет текущий путь отсечения, пересекая его с текущим путем, используя правило FillMode для определения области для заполнения. Этот метод завершает текущий путь. |
| abstract [ClosePath](../../aspose.svg.rendering/device-2/closepath/)() | Закрывает текущий подконтур, добавляя отрезок прямой линии от текущей точки до начальной точки подконтура. Если текущий подпуть уже закрыт, "ClosePath" ничего не делает. Этот оператор завершает текущий подпуть. При добавлении другого сегмента к текущему пути начинается новый подпуть, , даже если новый сегмент начинается в конечной точке, достигнутой методом ClosePath. |
| abstract [CubicBezierTo](../../aspose.svg.rendering/device-2/cubicbezierto/)(PointF, PointF, PointF) | Добавляет кубическую кривую Безье к текущему пути. Кривая продолжается от текущей точки до точки pt2, , используя pt1 и pt2 в качестве контрольных точек Безье. Новая текущая точка - pt3. |
| [Dispose](../../aspose.svg.rendering/device-2/dispose/)() | Выполняет определяемые приложением задачи, связанные с освобождением, высвобождением или сбросом неуправляемых ресурсов. |
| abstract [DrawImage](../../aspose.svg.rendering/device-2/drawimage/)(byte[], ImageType, RectangleF) | Рисует указанное изображение. |
| virtual [EndDocument](../../aspose.svg.rendering/device-2/enddocument/)() | Завершает визуализацию документа. |
| abstract [EndElement](../../aspose.svg.rendering/device-2/endelement/)(Element) | Завершает визуализацию узла. |
| virtual [EndPage](../../aspose.svg.rendering/device-2/endpage/)() | Завершает визуализацию текущей страницы. |
| abstract [Fill](../../aspose.svg.rendering/device-2/fill/)(FillMode) | Заполняет всю область, ограниченную текущим путем. Если путь состоит из нескольких несвязанных подпутей, он заполняет внутренности всех подпутей, рассматриваемых вместе. Этот метод завершает текущий путь. |
| abstract [FillText](../../aspose.svg.rendering/device-2/filltext/)(string, PointF) | Заполняет указанную текстовую строку в указанном месте. |
| virtual [Flush](../../aspose.svg.rendering/device-2/flush/)() | Сбрасывает все данные в выходной поток. |
| abstract [LineTo](../../aspose.svg.rendering/device-2/lineto/)(PointF) | Добавляет отрезок прямой от текущей точки до точки (pt). Новая текущая точка - pt. |
| abstract [MoveTo](../../aspose.svg.rendering/device-2/moveto/)(PointF) | Начинает новый подпуть, перемещая текущую точку в координаты параметра pt, опуская любой соединительный отрезок. Если предыдущий метод построения пути в текущем пути также был "MoveTo", новый "MoveTo" переопределяет его; в пути не осталось следов предыдущей операции "MoveTo". |
| virtual [RestoreGraphicContext](../../aspose.svg.rendering/device-2/restoregraphiccontext/)() | Восстанавливает весь графический контекст до его прежнего значения, извлекая его из стека. |
| virtual [SaveGraphicContext](../../aspose.svg.rendering/device-2/savegraphiccontext/)() | Помещает копию всего графического контекста в стек. |
| abstract [Stroke](../../aspose.svg.rendering/device-2/stroke/)() | Проводит линию по текущему пути. Заштрихованная линия следует за каждым прямым или изогнутым сегментом пути, центрируется на сегменте со сторонами, параллельными ему. Каждый из подпутей пути обрабатывается отдельно. Этот метод завершает текущий путь. |
| abstract [StrokeAndFill](../../aspose.svg.rendering/device-2/strokeandfill/)(FillMode) | Штрихует и заполняет текущий путь. Этот метод завершает текущий путь. |
| abstract [StrokeText](../../aspose.svg.rendering/device-2/stroketext/)(string, PointF) | Перемещает указанную текстовую строку в указанном месте. |

## Другие члены

| Имя | Описание |
| --- | --- |
| class [DeviceConfiguration&lt;TGraphicContext,TRenderingOptions&gt;](device-2.deviceconfiguration-2/) | Представляет объект конфигурации для устройств. |
| enum [PageWritingStrategy&lt;TGraphicContext,TRenderingOptions&gt;](device-2.pagewritingstrategy-2/) | Определяет типы стратегий записи страниц в выходной поток\потоки. |

### Смотрите также

* class [Device](../device/)
* interface [IDevice](../idevice/)
* class [GraphicContext](../graphiccontext/)
* class [RenderingOptions](../renderingoptions/)
* пространство имен [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* сборка [Aspose.SVG](../../)


