---
title: ImageDevice
second_title: Referencia de API de Aspose.SVG para .NET
description: Representa la representación en formatos de trama jpeg png bmp gif tiff.
type: docs
weight: 2790
url: /es/net/aspose.svg.rendering.image/imagedevice/
---
## ImageDevice class

Representa la representación en formatos de trama: jpeg, png, bmp, gif, tiff.

```csharp
public class ImageDevice : Device<ImageGraphicContext, ImageRenderingOptions>
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [ImageDevice](imagedevice#constructor)(ICreateStreamProvider) | Inicializa una nueva instancia del[`ImageDevice`](../imagedevice) clase. |
| [ImageDevice](imagedevice#constructor_4)(Stream) | Inicializa una nueva instancia del[`ImageDevice`](../imagedevice) clase. |
| [ImageDevice](imagedevice#constructor_5)(string) | Inicializa una nueva instancia del[`ImageDevice`](../imagedevice) clase. |
| [ImageDevice](imagedevice#constructor_1)(ImageRenderingOptions, ICreateStreamProvider) | Inicializa una nueva instancia del[`ImageDevice`](../imagedevice) clase por opciones de representación y proveedor de flujo. |
| [ImageDevice](imagedevice#constructor_2)(ImageRenderingOptions, Stream) | Inicializa una nueva instancia del[`ImageDevice`](../imagedevice) clase por opciones de representación y flujo de salida. |
| [ImageDevice](imagedevice#constructor_3)(ImageRenderingOptions, string) | Inicializa una nueva instancia del[`ImageDevice`](../imagedevice) clase por opciones de representación y nombre de archivo de salida. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device`2/graphiccontext) { get; } |  |
| virtual [Graphics](../../aspose.svg.rendering.image/imagedevice/graphics) { get; } | Obtiene la instancia de Graphics. |
| [Options](../../aspose.svg.rendering/device`2/options) { get; } |  |

## Métodos

| Nombre | Descripción |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.image/imagedevice/addrect)(RectangleF) | Agrega un rectángulo a la ruta actual como una subruta completa. |
| override [BeginDocument](../../aspose.svg.rendering.image/imagedevice/begindocument)(Document) | Comienza a renderizar el documento. |
| override [BeginElement](../../aspose.svg.rendering.image/imagedevice/beginelement)(Element, RectangleF) | Comienza el renderizado del elemento. |
| override [BeginPage](../../aspose.svg.rendering.image/imagedevice/beginpage)(SizeF) | Comienza a renderizar la nueva página. |
| override [Clip](../../aspose.svg.rendering.image/imagedevice/clip)(FillMode) | Modifica la ruta de recorte actual al intersectarla con la ruta actual, utilizando la regla FillMode para determinar la región a rellenar. Este método finaliza la ruta actual. |
| override [ClosePath](../../aspose.svg.rendering.image/imagedevice/closepath)() | Cierra el subtrayecto actual agregando un segmento de línea recta desde el punto actual hasta el punto inicial del subtrayecto. Si la subruta actual ya está cerrada, "ClosePath" no hace nada. Este operador finaliza la subruta actual. Al agregar otro segmento a la ruta actual, comienza una nueva subruta, incluso si el nuevo segmento comienza en el punto final alcanzado por el método "ClosePath". |
| override [CubicBezierTo](../../aspose.svg.rendering.image/imagedevice/cubicbezierto)(PointF, PointF, PointF) | Agrega una curva de Bézier cúbica a la ruta actual. La curva se extiende desde el punto actual hasta el punto pt2, utilizando pt1 y pt2 como puntos de control Bézier. El nuevo punto actual es pt3. |
| [Dispose](../../aspose.svg.rendering/device`2/dispose)() |  |
| override [DrawImage](../../aspose.svg.rendering.image/imagedevice/drawimage)(byte[], ImageType, RectangleF) | Dibuja la imagen especificada. |
| override [EndDocument](../../aspose.svg.rendering.image/imagedevice/enddocument)() | Finaliza el renderizado del documento. |
| override [EndElement](../../aspose.svg.rendering.image/imagedevice/endelement)(Element) | Finaliza el renderizado del elemento. |
| override [EndPage](../../aspose.svg.rendering.image/imagedevice/endpage)() | Finaliza el renderizado de la página actual. |
| override [Fill](../../aspose.svg.rendering.image/imagedevice/fill)(FillMode) | Rellena toda la región encerrada por la ruta actual. Si el camino consta de varios subcaminos desconectados, llena el interior de todos los subcaminos, considerados juntos. Este método finaliza la ruta actual. |
| override [FillText](../../aspose.svg.rendering.image/imagedevice/filltext)(string, PointF) | Rellena la cadena de texto especificada en la ubicación especificada. |
| override [Flush](../../aspose.svg.rendering.image/imagedevice/flush)() | Vacía todos los datos al flujo de salida. |
| override [LineTo](../../aspose.svg.rendering.image/imagedevice/lineto)(PointF) | Agrega un segmento de línea recta desde el punto actual hasta el punto (pt). El nuevo punto actual es pt. |
| override [MoveTo](../../aspose.svg.rendering.image/imagedevice/moveto)(PointF) | Comienza un nuevo subtrayecto moviendo el punto actual a las coordenadas del parámetro pt, omitiendo cualquier segmento de línea de conexión. Si el método de construcción de ruta anterior en la ruta actual también era "Mover a", el nuevo "Mover a" lo anula; no queda ningún vestigio de la operación anterior "Mover a" en la ruta. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.image/imagedevice/restoregraphiccontext)() | Restaura todo el contexto de gráficos a su valor anterior extrayéndolo de la pila. |
| override [SaveGraphicContext](../../aspose.svg.rendering.image/imagedevice/savegraphiccontext)() | Inserta una copia de todo el contexto gráfico en la pila. |
| override [Stroke](../../aspose.svg.rendering.image/imagedevice/stroke)() | Traza una línea a lo largo de la ruta actual. La línea trazada sigue cada segmento recto o curvo del camino, centrado en el segmento con lados paralelos a él. Cada uno de los subtrayectos de la ruta se trata por separado. Este método finaliza la ruta actual. |
| override [StrokeAndFill](../../aspose.svg.rendering.image/imagedevice/strokeandfill)(FillMode) | Trazos y relleno de la ruta actual. Este método finaliza la ruta actual. |
| override [StrokeText](../../aspose.svg.rendering.image/imagedevice/stroketext)(string, PointF) | Traza la cadena de texto especificada en la ubicación especificada. |

## Otros miembros

| Nombre | Descripción |
| --- | --- |
| class [ImageGraphicContext](imagedevice.imagegraphiccontext) | Contiene los parámetros de control de gráficos actuales para el[`ImageDevice`](../imagedevice) . Estos parámetros definen el marco global dentro del cual se ejecutan los operadores gráficos. |

### Ver también

* class [ImageGraphicContext](../imagedevice.imagegraphiccontext)
* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2)
* class [ImageRenderingOptions](../imagerenderingoptions)
* espacio de nombres [Aspose.Svg.Rendering.Image](../../aspose.svg.rendering.image)
* asamblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
