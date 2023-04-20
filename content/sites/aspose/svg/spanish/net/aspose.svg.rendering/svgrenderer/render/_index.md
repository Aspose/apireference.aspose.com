---
title: SvgRenderer.Render
second_title: Referencia de API de Aspose.SVG para .NET
description: SvgRenderer método. Define el método para renderizar múltiplesSVGDocument s en específicoIDevice .
type: docs
weight: 20
url: /es/net/aspose.svg.rendering/svgrenderer/render/
---
## Render(IDevice, TimeSpan, params SVGDocument[]) {#render_6}

Define el método para renderizar múltiples[`SVGDocument`](../../../aspose.svg/svgdocument/) s en específico[`IDevice`](../../idevice/) .

```csharp
public override void Render(IDevice device, TimeSpan timeout, params SVGDocument[] documents)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| device | IDevice | El dispositivo de salida. |
| timeout | TimeSpan | ATimeSpan que representa el número de milisegundos a esperar, o unTimeSpan eso representa -1 milisegundo para esperar indefinidamente. |
| documents | SVGDocument[] | Los documentos a rendir. |

### Ver también

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* espacio de nombres [Aspose.Svg.Rendering](../../svgrenderer/)
* asamblea [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params SVGDocument[]) {#render_5}

Define un método para renderizar múltiples[`SVGDocument`](../../../aspose.svg/svgdocument/) s en un específico[`IDevice`](../../idevice/) , utilizando un token de cancelación para solicitar la cancelación de la operación.

```csharp
public override void Render(IDevice device, CancellationToken cancellationToken, 
    params SVGDocument[] documents)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| device | IDevice | El dispositivo de salida. |
| cancellationToken | CancellationToken | Un token de cancelación para observar mientras se espera que se complete la tarea. |
| documents | SVGDocument[] | Los documentos a rendir. |

### Ver también

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* espacio de nombres [Aspose.Svg.Rendering](../../svgrenderer/)
* asamblea [Aspose.SVG](../../../)


