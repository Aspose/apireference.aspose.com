---
title: SvgRenderer.Render
second_title: Aspose.SVG für .NET-API-Referenz
description: SvgRenderer methode. Definiert Methode zum Rendern mehrererSVGDocument s in spezifischIDevice .
type: docs
weight: 20
url: /de/net/aspose.svg.rendering/svgrenderer/render/
---
## Render(IDevice, TimeSpan, params SVGDocument[]) {#render_6}

Definiert Methode zum Rendern mehrerer[`SVGDocument`](../../../aspose.svg/svgdocument/) s in spezifisch[`IDevice`](../../idevice/) .

```csharp
public override void Render(IDevice device, TimeSpan timeout, params SVGDocument[] documents)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| device | IDevice | Das Ausgabegerät. |
| timeout | TimeSpan | ATimeSpan die die Anzahl der zu wartenden Millisekunden darstellt, oder aTimeSpan das entspricht -1 Millisekunde, um auf unbestimmte Zeit zu warten. |
| documents | SVGDocument[] | Die zu rendernden Dokumente. |

### Siehe auch

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* namensraum [Aspose.Svg.Rendering](../../svgrenderer/)
* Montage [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params SVGDocument[]) {#render_5}

Definiert eine Methode zum Rendern mehrerer[`SVGDocument`](../../../aspose.svg/svgdocument/) s in eine bestimmte[`IDevice`](../../idevice/) , mit einem Abbruchtoken, um den Abbruch des Vorgangs anzufordern.

```csharp
public override void Render(IDevice device, CancellationToken cancellationToken, 
    params SVGDocument[] documents)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| device | IDevice | Das Ausgabegerät. |
| cancellationToken | CancellationToken | Ein zu beobachtendes Abbruchtoken, während auf den Abschluss der Aufgabe gewartet wird. |
| documents | SVGDocument[] | Die zu rendernden Dokumente. |

### Siehe auch

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* namensraum [Aspose.Svg.Rendering](../../svgrenderer/)
* Montage [Aspose.SVG](../../../)


