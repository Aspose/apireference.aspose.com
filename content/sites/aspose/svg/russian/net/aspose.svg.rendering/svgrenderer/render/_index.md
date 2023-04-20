---
title: SvgRenderer.Render
second_title: Справочник по Aspose.SVG для .NET API
description: SvgRenderer метод. Определяет метод для рендеринга несколькихSVGDocument в конкретныеIDevice .
type: docs
weight: 20
url: /ru/net/aspose.svg.rendering/svgrenderer/render/
---
## Render(IDevice, TimeSpan, params SVGDocument[]) {#render_6}

Определяет метод для рендеринга нескольких[`SVGDocument`](../../../aspose.svg/svgdocument/) в конкретные[`IDevice`](../../idevice/) .

```csharp
public override void Render(IDevice device, TimeSpan timeout, params SVGDocument[] documents)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| device | IDevice | Выходное устройство. |
| timeout | TimeSpan | АTimeSpan который представляет количество миллисекунд ожидания, илиTimeSpan что представляет собой -1 миллисекунду ожидания на неопределенный срок. |
| documents | SVGDocument[] | Документы для оформления. |

### Смотрите также

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* пространство имен [Aspose.Svg.Rendering](../../svgrenderer/)
* сборка [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params SVGDocument[]) {#render_5}

Определяет метод рендеринга нескольких[`SVGDocument`](../../../aspose.svg/svgdocument/) в конкретный[`IDevice`](../../idevice/) , используя токен отмены для запроса отмены операции.

```csharp
public override void Render(IDevice device, CancellationToken cancellationToken, 
    params SVGDocument[] documents)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| device | IDevice | Выходное устройство. |
| cancellationToken | CancellationToken | Маркер отмены для наблюдения во время ожидания завершения задачи. |
| documents | SVGDocument[] | Документы для оформления. |

### Смотрите также

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* пространство имен [Aspose.Svg.Rendering](../../svgrenderer/)
* сборка [Aspose.SVG](../../../)


