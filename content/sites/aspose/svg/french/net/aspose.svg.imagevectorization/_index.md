---
title: Aspose.Svg.ImageVectorization
second_title: Référence de l'API Aspose.SVG pour .NET
description: Le Aspose.Svg.ImageVectorizationlespace de noms contient des classes pour vectoriser les images raster et les convertir en documents SVG. Ce processus implique de réduire les bitmaps en formes géométriques composées déléments de chemin et de les stocker au format SVG. Lespace de noms comprend des classes pour construire des segments de chemin simplifier et lisser les points de trace et la configuration des options de vectorisation.
type: docs
weight: 170
url: /fr/net/aspose.svg.imagevectorization/
---
Le **Aspose.Svg.ImageVectorization**l'espace de noms contient des classes pour vectoriser les images raster et les convertir en documents SVG. Ce processus implique de réduire les bitmaps en formes géométriques composées d'éléments de chemin et de les stocker au format SVG. L'espace de noms comprend des classes pour construire des segments de chemin, simplifier et lisser les points de trace, et la configuration des options de vectorisation.

## Des classes

| Classer | La description |
| --- | --- |
| [BezierPathBuilder](./bezierpathbuilder/) | Le[`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) la classe est responsable de la construction des segments de chemin[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) à partir de la liste des points de trace. Ce constructeur de chemin est basé sur l'utilisation de la méthode des moindres carrés pour trouver les points de contrôle de Bézier pour la trace des points. |
| [ImageTraceSimplifier](./imagetracesimplifier/) | La classe ImageTraceSimplifier est responsable de la réduction du nombre de points dans une courbe approximée par une série de points de trace. |
| [ImageTraceSmoother](./imagetracesmoother/) | La classe ImageTraceSimplifier est responsable du lissage du nombre de points dans une courbe approximée par une série de points de trace. Cette classe implémente l'approche du plus proche voisin. |
| [ImageVectorizer](./imagevectorizer/) | Cette classe ImageVectorizer vectorise les images raster comme PNG, JPG, GIF, BMP et etc... et retourne SVGDocument. Par vectorisation, nous entendons le processus de réduction des bitmaps en formes géométriques constituées d'éléments de chemin et stockées au format SVG. |
| [ImageVectorizerConfiguration](./imagevectorizerconfiguration/) | Le[`ImageVectorizerConfiguration`](../aspose.svg.imagevectorization/imagevectorizerconfiguration/) définit une configuration de méthodes et d'options de vectorisation d'image. La configuration est utilisée pour initialiser un ImageVectorizer et fournit les options de configuration pour vectoriser des images. |
| [SplinePathBuilder](./splinepathbuilder/) | Le[`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) la classe est responsable de la construction des segments de chemin[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) à partir de la liste des points de trace. Ce constructeur de chemin est basé sur l'application d'une spline Catmull-Roma à un ensemble de points de chemin lissés et réduits.. |
| [StencilConfiguration](./stencilconfiguration/) | Le[`StencilConfiguration`](../aspose.svg.imagevectorization/stencilconfiguration/) la classe définit une configuration d'options d'effet de gabarit. |
## Interfaces

| Interface | La description |
| --- | --- |
| [IImageTraceSimplifier](./iimagetracesimplifier/) | L'interface IImageTraceSimplifier est responsable de la réduction des points dans la trace. |
| [IImageTraceSmoother](./iimagetracesmoother/) | L'interface IImageTraceSmoother est responsable du lissage de la trace. |
| [IPathBuilder](./ipathbuilder/) | L'interface IPathBuilder est responsable de la construction des segments de chemin[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) de la liste des points de trace. |
## Énumération

| Énumération | La description |
| --- | --- |
| [StencilType](./stenciltype/) | Le[`StencilType`](../aspose.svg.imagevectorization/stenciltype/) enum définit les types de gabarit. |


