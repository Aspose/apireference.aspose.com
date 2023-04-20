---
title: Class XpsDevice.XpsGraphicContext
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.Rendering.Xps.XpsDeviceXpsGraphicContext сорт. Содержит текущие параметры управления графикой для XpsDevice. Эти параметры определяют глобальную структуру в которой выполняются графические операторы.
type: docs
weight: 3060
url: /ru/net/aspose.svg.rendering.xps/xpsdevice.xpsgraphiccontext/
---
## XpsDevice.XpsGraphicContext class

Содержит текущие параметры управления графикой для XpsDevice. Эти параметры определяют глобальную структуру, в которой выполняются графические операторы.

```csharp
public class XpsGraphicContext : GraphicContext
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [XpsGraphicContext](xpsgraphiccontext/)() | Конструктор по умолчанию. |

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | Устанавливает или получает межсимвольный интервал. |
| virtual [FillBrush](../../aspose.svg.rendering/graphiccontext/fillbrush/) { get; set; } | Устанавливает или получает объект кисти, который используется для заполнения внутренней части контуров. |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | Задает или получает объект шрифта истинного типа, который используется для рендеринга текста. |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | Задает или получает размер шрифта текста. |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | Устанавливает или получает стиль шрифта текста. |
| virtual [LineCap](../../aspose.svg.rendering/graphiccontext/linecap/) { get; set; } | Устанавливает или получает код, определяющий форму конечных точек для любого открытого пути, который обведен. |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | Устанавливает или получает смещение фазы текущего шаблона пунктирной линии. |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | Задает или получает описание шаблона пунктира, который будет использоваться при обводке контуров. |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | Наборы стилей штриховых линий штрихового контура. |
| virtual [LineJoin](../../aspose.svg.rendering/graphiccontext/linejoin/) { get; set; } | Устанавливает или получает код, определяющий форму стыков между соединенными сегментами заштрихованного пути. |
| virtual [LineWidth](../../aspose.svg.rendering/graphiccontext/linewidth/) { get; set; } | Устанавливает или получает толщину обводимых контуров. |
| virtual [MiterLimit](../../aspose.svg.rendering/graphiccontext/miterlimit/) { get; set; } | Устанавливает или получает максимальную длину соединения линий под углом для обведенных путей. Этот параметр ограничивает длину «выступов», возникающих при соединении сегментов под острыми углами. |
| virtual [StrokeBrush](../../aspose.svg.rendering/graphiccontext/strokebrush/) { get; set; } | Устанавливает или получает объект-кисть, который используется для обведенных контуров. |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | Получает[`TextInfo`](../../aspose.svg.rendering/textinfo/) объект, который содержит информацию о отображаемом тексте. |
| virtual [TransformationMatrix](../../aspose.svg.rendering/graphiccontext/transformationmatrix/) { get; set; } | Устанавливает или получает матрицу преобразования. |

## Методы

| Имя | Описание |
| --- | --- |
| override [Clone](../../aspose.svg.rendering.xps/xpsgraphiccontext/clone/)() | Создает новый экземпляр класса XpsGraphicContext с теми же значениями свойств, что и существующий экземпляр. |
| virtual [Transform](../../aspose.svg.rendering/graphiccontext/transform/)(Matrix) | Изменить текущую матрицу преобразования, умножив указанную матрицу. |

### Смотрите также

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [XpsDevice](../xpsdevice/)
* пространство имен [Aspose.Svg.Rendering.Xps](../../aspose.svg.rendering.xps/)
* сборка [Aspose.SVG](../../)


