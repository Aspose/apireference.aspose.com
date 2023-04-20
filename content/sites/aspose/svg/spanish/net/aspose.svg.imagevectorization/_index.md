---
title: Aspose.Svg.ImageVectorization
second_title: Referencia de API de Aspose.SVG para .NET
description: El Aspose.Svg.ImagenVectorizaciónEl espacio de nombres contiene clases para vectorizar imágenes rasterizadas y convertirlas en documentos SVG. Este proceso implica reducir mapas de bits a formas geométricas compuestas de elementos de ruta y almacenarlos como SVG. El espacio de nombres incluye clases para crear segmentos de ruta simplificar y suavizar puntos de seguimiento y configurando opciones de vectorización.
type: docs
weight: 170
url: /es/net/aspose.svg.imagevectorization/
---
El **Aspose.Svg.ImagenVectorización**El espacio de nombres contiene clases para vectorizar imágenes rasterizadas y convertirlas en documentos SVG. Este proceso implica reducir mapas de bits a formas geométricas compuestas de elementos de ruta y almacenarlos como SVG. El espacio de nombres incluye clases para crear segmentos de ruta, simplificar y suavizar puntos de seguimiento, y configurando opciones de vectorización.

## Clases

| Clase | Descripción |
| --- | --- |
| [BezierPathBuilder](./bezierpathbuilder/) | El[`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) la clase es responsable de construir segmentos de ruta[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) de la lista de puntos de seguimiento. Este generador de ruta se basa en el uso del método de mínimos cuadrados para encontrar puntos de control Bezier para el seguimiento de puntos. |
| [ImageTraceSimplifier](./imagetracesimplifier/) | La clase ImageTraceSimplifier se encarga de reducir el número de puntos en una curva que se aproxima por una serie de puntos de traza. |
| [ImageTraceSmoother](./imagetracesmoother/) | La clase ImageTraceSimplifier es responsable de suavizar el número de puntos en una curva que se aproxima mediante una serie de puntos de seguimiento. Esta clase implementa el enfoque del vecino más cercano. |
| [ImageVectorizer](./imagevectorizer/) | Esta clase ImageVectorizer vectoriza imágenes rasterizadas como PNG, JPG, GIF, BMP, etc... y devuelve SVGDocument. Por vectorización nos referimos al proceso de reducir mapas de bits a formas geométricas formadas a partir de elementos de ruta y almacenados como SVG. |
| [ImageVectorizerConfiguration](./imagevectorizerconfiguration/) | El[`ImageVectorizerConfiguration`](../aspose.svg.imagevectorization/imagevectorizerconfiguration/) class define una configuración de métodos y opciones de vectorización de imágenes. La configuración se utiliza para inicializar un ImageVectorizer y proporciona las opciones de configuración para vectorizar imágenes. |
| [SplinePathBuilder](./splinepathbuilder/) | El[`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) la clase es responsable de construir segmentos de ruta[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) de la lista de puntos de seguimiento. Este generador de ruta se basa en la aplicación de una spline Catmull-Roma a un conjunto de puntos de ruta suavizados y reducidos.. |
| [StencilConfiguration](./stencilconfiguration/) | El[`StencilConfiguration`](../aspose.svg.imagevectorization/stencilconfiguration/) class define una configuración de opciones de efecto de plantilla. |
## Interfaces

| Interfaz | Descripción |
| --- | --- |
| [IImageTraceSimplifier](./iimagetracesimplifier/) | La interfaz IImageTraceSimplifier es responsable de la reducción de puntos en la traza. |
| [IImageTraceSmoother](./iimagetracesmoother/) | La interfaz IImageTraceSmoother es responsable de suavizar el seguimiento. |
| [IPathBuilder](./ipathbuilder/) | La interfaz IPathBuilder es responsable de construir segmentos de ruta[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) de la lista de los puntos de seguimiento. |
## Enumeración

| Enumeración | Descripción |
| --- | --- |
| [StencilType](./stenciltype/) | El[`StencilType`](../aspose.svg.imagevectorization/stenciltype/) enum define los tipos de plantillas. |


