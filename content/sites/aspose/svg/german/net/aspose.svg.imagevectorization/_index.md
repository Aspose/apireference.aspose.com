---
title: Aspose.Svg.ImageVectorization
second_title: Aspose.SVG für .NET-API-Referenz
description: Die Aspose.Svg.ImageVectorizationNamespace enthält Klassen zum Vektorisieren von Rasterbildern und Konvertieren in SVGDokumente. Bei diesem Prozess werden Bitmaps auf geometrische Formen aus Pfadelementen reduziert und als SVG gespeichert. Der Namespace enthält Klassen zum Erstellen von Pfadsegmenten Vereinfachen und Glätten von Spurpunkten und Konfigurieren von Vektorisierungsoptionen.
type: docs
weight: 170
url: /de/net/aspose.svg.imagevectorization/
---
Die **Aspose.Svg.ImageVectorization**Namespace enthält Klassen zum Vektorisieren von Rasterbildern und Konvertieren in SVG-Dokumente. Bei diesem Prozess werden Bitmaps auf geometrische Formen aus Pfadelementen reduziert und als SVG gespeichert. Der Namespace enthält Klassen zum Erstellen von Pfadsegmenten, Vereinfachen und Glätten von Spurpunkten, und Konfigurieren von Vektorisierungsoptionen.

## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [BezierPathBuilder](./bezierpathbuilder/) | Die[`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) Die Klasse ist für das Erstellen von Pfadsegmenten verantwortlich[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) aus der Liste der Verfolgungspunkte. Dieser Pfadersteller basiert auf der Verwendung der Methode der kleinsten Quadrate, um Bezier-Kontrollpunkte für die Verfolgung von Punkten zu finden. |
| [ImageTraceSimplifier](./imagetracesimplifier/) | Die ImageTraceSimplifier-Klasse ist dafür verantwortlich, die Anzahl der Punkte in einer Kurve zu reduzieren, die durch eine Reihe von Verfolgungspunkten angenähert wird. |
| [ImageTraceSmoother](./imagetracesmoother/) | Die ImageTraceSimplifier-Klasse ist für das Glätten der Anzahl von Punkten in einer Kurve verantwortlich, die durch eine Reihe von Verfolgungspunkten angenähert wird. Diese Klasse implementiert den Ansatz des nächsten Nachbarn. |
| [ImageVectorizer](./imagevectorizer/) | Diese ImageVectorizer-Klasse vektorisiert Rasterbilder wie PNG, JPG, GIF, BMP usw. und gibt SVGDocument zurück. Unter Vektorisierung verstehen wir den Prozess der Reduzierung von Bitmaps auf geometrische Formen, die aus Pfadelementen bestehen und als SVG gespeichert werden. |
| [ImageVectorizerConfiguration](./imagevectorizerconfiguration/) | Die[`ImageVectorizerConfiguration`](../aspose.svg.imagevectorization/imagevectorizerconfiguration/) -Klasse definiert eine Konfiguration von Bildvektorisierungsmethoden und -optionen. Die Konfiguration wird verwendet, um einen ImageVectorizer zu initialisieren, und stellt die Konfigurationsoptionen für zum Vektorisieren von Bildern bereit. |
| [SplinePathBuilder](./splinepathbuilder/) | Die[`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) Die Klasse ist für das Erstellen von Pfadsegmenten verantwortlich[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) aus der Liste der Verfolgungspunkte. Dieser Pfadersteller basiert auf der Anwendung eines Catmull-Roma-Splines auf eine Reihe geglätteter und reduzierter Pfadpunkte.. |
| [StencilConfiguration](./stencilconfiguration/) | Die[`StencilConfiguration`](../aspose.svg.imagevectorization/stencilconfiguration/) Klasse definiert eine Konfiguration von Schabloneneffektoptionen. |
## Schnittstellen

| Schnittstelle | Beschreibung |
| --- | --- |
| [IImageTraceSimplifier](./iimagetracesimplifier/) | Die Schnittstelle IImageTraceSimplifier ist für die Reduzierung der Punkte im Trace verantwortlich. |
| [IImageTraceSmoother](./iimagetracesmoother/) | Die IImageTraceSmoother-Schnittstelle ist für die Glättung der Ablaufverfolgung verantwortlich. |
| [IPathBuilder](./ipathbuilder/) | Die IPathBuilder-Schnittstelle ist für das Erstellen von Pfadsegmenten verantwortlich[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) aus Liste der Trace-Punkte. |
## Aufzählung

| Aufzählung | Beschreibung |
| --- | --- |
| [StencilType](./stenciltype/) | Die[`StencilType`](../aspose.svg.imagevectorization/stenciltype/) enum definiert Schablonentypen. |


