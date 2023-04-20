---
title: Aspose.Svg.ImageVectorization
second_title: Aspose.SVG för .NET API Referens
description: Den Aspose.Svg.ImageVectorizationnamnutrymmet innehåller klasser för vektorisering av rasterbilder och omvandling av dem till SVGdokument. Denna process innebär att bitmappar reduceras till geometriska former som består av banelement och lagras som SVG. Namnutrymmet innehåller klasser för att bygga vägsegment förenkla och jämna ut spårpunkter och konfigurera vektoriseringsalternativ.
type: docs
weight: 170
url: /sv/net/aspose.svg.imagevectorization/
---
Den **Aspose.Svg.ImageVectorization**namnutrymmet innehåller klasser för vektorisering av rasterbilder och omvandling av dem till SVG-dokument. Denna process innebär att bitmappar reduceras till geometriska former som består av banelement och lagras som SVG. Namnutrymmet innehåller klasser för att bygga vägsegment, förenkla och jämna ut spårpunkter, och konfigurera vektoriseringsalternativ.

## Klasser

| Klass | Beskrivning |
| --- | --- |
| [BezierPathBuilder](./bezierpathbuilder/) | Den[`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) klass ansvarar för att bygga vägsegment[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) från listan över spårpunkter. Denna vägbyggare är baserad på att använda minsta kvadratmetoden för att hitta Bezier-kontrollpunkter för spårning av punkter. |
| [ImageTraceSimplifier](./imagetracesimplifier/) | Klassen ImageTraceSimplifier är ansvarig för att minska antalet punkter i en kurva som approximeras av en serie av spårpunkterna. |
| [ImageTraceSmoother](./imagetracesmoother/) | Klassen ImageTraceSimplifier är ansvarig för att jämna ut antalet punkter i en kurva som approximeras av en serie av spårningspunkterna. Denna klass implementerar närmaste granne. |
| [ImageVectorizer](./imagevectorizer/) | Denna ImageVectorizer-klass vektoriserar rasterbilder som PNG, JPG, GIF, BMP och etc... och returnerar SVGDocument. Under vektorisering menar vi processen att reducera bitmappar till geometriska former som består av banelement och lagras som SVG. |
| [ImageVectorizerConfiguration](./imagevectorizerconfiguration/) | Den[`ImageVectorizerConfiguration`](../aspose.svg.imagevectorization/imagevectorizerconfiguration/) klass definierar en konfiguration av bildvektoriseringsmetoder och -alternativ. Konfigurationen används för att initiera en ImageVectorizer och tillhandahåller konfigurationsalternativ för vektoriseringsbilder. |
| [SplinePathBuilder](./splinepathbuilder/) | Den[`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) klass ansvarar för att bygga vägsegment[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) från listan över spårpunkter. Denna banbyggare är baserad på att applicera en Catmull-Roma spline på en uppsättning utjämnade och reducerade banpunkter.. |
| [StencilConfiguration](./stencilconfiguration/) | Den[`StencilConfiguration`](../aspose.svg.imagevectorization/stencilconfiguration/) klass definierar en konfiguration av stencileffektalternativ. |
## Gränssnitt

| Gränssnitt | Beskrivning |
| --- | --- |
| [IImageTraceSimplifier](./iimagetracesimplifier/) | IImageTraceSimplifier-gränssnittet ansvarar för minskning av punkter i spåret. |
| [IImageTraceSmoother](./iimagetracesmoother/) | IImageTraceSmoothers gränssnitt ansvarar för att utjämna spårningen. |
| [IPathBuilder](./ipathbuilder/) | IPathBuilder-gränssnittet är ansvarigt för att bygga sökvägssegment[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) från listan över spårpunkter. |
## Uppräkning

| Uppräkning | Beskrivning |
| --- | --- |
| [StencilType](./stenciltype/) | Den[`StencilType`](../aspose.svg.imagevectorization/stenciltype/) enum definierar stenciltyper. |


