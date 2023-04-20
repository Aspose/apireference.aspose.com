---
title: SvgRenderer.Render
second_title: Référence de l'API Aspose.SVG pour .NET
description: SvgRenderer méthode. Définit la méthode de rendu de plusieursSVGDocument s en spécifiqueIDevice .
type: docs
weight: 20
url: /fr/net/aspose.svg.rendering/svgrenderer/render/
---
## Render(IDevice, TimeSpan, params SVGDocument[]) {#render_6}

Définit la méthode de rendu de plusieurs[`SVGDocument`](../../../aspose.svg/svgdocument/) s en spécifique[`IDevice`](../../idevice/) .

```csharp
public override void Render(IDevice device, TimeSpan timeout, params SVGDocument[] documents)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| device | IDevice | Le périphérique de sortie. |
| timeout | TimeSpan | UNTimeSpan qui représente le nombre de millisecondes à attendre, ou unTimeSpan cela représente -1 milliseconde à attendre indéfiniment. |
| documents | SVGDocument[] | Les documents à rendre. |

### Voir également

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* espace de noms [Aspose.Svg.Rendering](../../svgrenderer/)
* Assemblée [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params SVGDocument[]) {#render_5}

Définit une méthode pour rendre plusieurs[`SVGDocument`](../../../aspose.svg/svgdocument/) s dans un domaine spécifique[`IDevice`](../../idevice/) , en utilisant un jeton d'annulation pour demander l'annulation de l'opération.

```csharp
public override void Render(IDevice device, CancellationToken cancellationToken, 
    params SVGDocument[] documents)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| device | IDevice | Le périphérique de sortie. |
| cancellationToken | CancellationToken | Un jeton d'annulation à observer en attendant la fin de la tâche. |
| documents | SVGDocument[] | Les documents à rendre. |

### Voir également

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* espace de noms [Aspose.Svg.Rendering](../../svgrenderer/)
* Assemblée [Aspose.SVG](../../../)


