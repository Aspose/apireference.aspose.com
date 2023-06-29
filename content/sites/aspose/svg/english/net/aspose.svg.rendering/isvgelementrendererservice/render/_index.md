---
title: ISVGElementRendererService.Render
second_title: Aspose.SVG for .NET API Reference
description: ISVGElementRendererService method. Renders the specified SVG elements onto the device context using the provided viewport
type: docs
weight: 10
url: /net/aspose.svg.rendering/isvgelementrendererservice/render/
---
## Render(ISVGDeviceContext, CancellationToken, Viewport, params SVGElement[]) {#render}

Renders the specified SVG elements onto the device context using the provided viewport.

```csharp
public void Render(ISVGDeviceContext deviceContext, CancellationToken cancellationToken, 
    Viewport viewport, params SVGElement[] elements)
```

| Parameter | Type | Description |
| --- | --- | --- |
| deviceContext | ISVGDeviceContext | The device context to render onto. See [`ISVGDeviceContext`](../../isvgdevicecontext/). |
| cancellationToken | CancellationToken | The cancellation token to observe for cancellation requests. |
| viewport | Viewport | The viewport for rendering the elements. See [`Viewport`](../../../aspose.svg.drawing/viewport/). |
| elements | SVGElement[] | The SVG elements to render. See [`SVGElement`](../../../aspose.svg/svgelement/). |

### See Also

* interface [ISVGDeviceContext](../../isvgdevicecontext/)
* class [Viewport](../../../aspose.svg.drawing/viewport/)
* class [SVGElement](../../../aspose.svg/svgelement/)
* interface [ISVGElementRendererService](../)
* namespace [Aspose.Svg.Rendering](../../../aspose.svg.rendering/)
* assembly [Aspose.SVG](../../../)

---

## Render(ISVGDeviceContext, CancellationToken, ISVGPropertyResolvingContext, params SVGElement[]) {#render_1}

Renders the specified SVG elements onto the device context using the provided property resolving context.

```csharp
public void Render(ISVGDeviceContext deviceContext, CancellationToken cancellationToken, 
    ISVGPropertyResolvingContext propertyResolvingContext, params SVGElement[] elements)
```

| Parameter | Type | Description |
| --- | --- | --- |
| deviceContext | ISVGDeviceContext | The device context to render onto. See [`ISVGDeviceContext`](../../isvgdevicecontext/). |
| cancellationToken | CancellationToken | The cancellation token to observe for cancellation requests. |
| propertyResolvingContext | ISVGPropertyResolvingContext | The property resolving context for rendering the elements. See [`ISVGPropertyResolvingContext`](../../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/). |
| elements | SVGElement[] | The SVG elements to render. See [`SVGElement`](../../../aspose.svg/svgelement/). |

### See Also

* interface [ISVGDeviceContext](../../isvgdevicecontext/)
* interface [ISVGPropertyResolvingContext](../../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/)
* class [SVGElement](../../../aspose.svg/svgelement/)
* interface [ISVGElementRendererService](../)
* namespace [Aspose.Svg.Rendering](../../../aspose.svg.rendering/)
* assembly [Aspose.SVG](../../../)
