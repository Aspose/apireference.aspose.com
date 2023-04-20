---
title: SvgRenderer.Render
second_title: Riferimento API Aspose.SVG per .NET
description: SvgRenderer metodo. Definisce il metodo per il rendering multiploSVGDocument s in specificoIDevice .
type: docs
weight: 20
url: /it/net/aspose.svg.rendering/svgrenderer/render/
---
## Render(IDevice, TimeSpan, params SVGDocument[]) {#render_6}

Definisce il metodo per il rendering multiplo[`SVGDocument`](../../../aspose.svg/svgdocument/) s in specifico[`IDevice`](../../idevice/) .

```csharp
public override void Render(IDevice device, TimeSpan timeout, params SVGDocument[] documents)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| device | IDevice | Il dispositivo di uscita. |
| timeout | TimeSpan | UNTimeSpan che rappresenta il numero di millisecondi di attesa, oppure aTimeSpan che rappresenta -1 millisecondo per attendere indefinitamente. |
| documents | SVGDocument[] | I documenti da rendere. |

### Guarda anche

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* spazio dei nomi [Aspose.Svg.Rendering](../../svgrenderer/)
* assemblea [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params SVGDocument[]) {#render_5}

Definisce un metodo per il rendering multiplo[`SVGDocument`](../../../aspose.svg/svgdocument/) s in uno specifico[`IDevice`](../../idevice/) , utilizzando un token di annullamento per richiedere l'annullamento dell'operazione.

```csharp
public override void Render(IDevice device, CancellationToken cancellationToken, 
    params SVGDocument[] documents)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| device | IDevice | Il dispositivo di uscita. |
| cancellationToken | CancellationToken | Un token di annullamento da osservare durante l'attesa del completamento dell'attività. |
| documents | SVGDocument[] | I documenti da rendere. |

### Guarda anche

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* spazio dei nomi [Aspose.Svg.Rendering](../../svgrenderer/)
* assemblea [Aspose.SVG](../../../)


