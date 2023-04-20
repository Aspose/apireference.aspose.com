---
title: Class PdfDevice.PdfGraphicContext
second_title: Referencia de API de Aspose.SVG para .NET
description: Aspose.Svg.Rendering.Pdf.PdfDevicePdfGraphicContext clase. Contiene los parámetros de control de gráficos actuales para PdfDevice. Estos parámetros definen el marco global dentro del cual se ejecutan los operadores de gráficos.
type: docs
weight: 2960
url: /es/net/aspose.svg.rendering.pdf/pdfdevice.pdfgraphiccontext/
---
## PdfDevice.PdfGraphicContext class

Contiene los parámetros de control de gráficos actuales para PdfDevice. Estos parámetros definen el marco global dentro del cual se ejecutan los operadores de gráficos.

```csharp
public class PdfGraphicContext : GraphicContext
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [PdfGraphicContext](pdfgraphiccontext/)() | Constructor predeterminado |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | Establece u obtiene el espacio entre caracteres. |
| override [FillBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/fillbrush/) { get; set; } | Establece u obtiene el objeto de pincel que se usa para rellenar el interior de los caminos. |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | Establece u obtiene el objeto de fuente de tipo verdadero que se utiliza para representar texto. |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | Establece u obtiene el tamaño de fuente del texto. |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | Establece u obtiene el estilo de fuente del texto. |
| override [LineCap](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linecap/) { get; set; } | Establece u obtiene el código que especifica la forma de los puntos finales para cualquier ruta abierta que se trazo. |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | Establece u obtiene el desplazamiento de fase del patrón de trazos de línea actual. |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | Establece u obtiene la descripción del patrón de guiones que se usará cuando se trazan trazos. |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | Conjuntos de obtiene el estilo de las líneas discontinuas de un trazo trazado. |
| override [LineJoin](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linejoin/) { get; set; } | Establece u obtiene el código que especifica la forma de las uniones entre los segmentos conectados de un trazado trazado. |
| override [LineWidth](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linewidth/) { get; set; } | Establece u obtiene el grosor de los trazos a trazar. |
| override [MiterLimit](../../aspose.svg.rendering.pdf/pdfgraphiccontext/miterlimit/) { get; set; } | Establece u obtiene la longitud máxima de las uniones de líneas a inglete para trayectos trazados. Este parámetro limita la longitud de los "picos" producidos cuando los segmentos de línea se unen en ángulos agudos. |
| override [StrokeBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/strokebrush/) { get; set; } | Establece u obtiene el objeto de pincel que se utiliza para trazos trazados. |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | Obtiene un[`TextInfo`](../../aspose.svg.rendering/textinfo/) objeto que contiene información sobre el texto renderizado. |
| override [TransformationMatrix](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transformationmatrix/) { get; set; } | Establece u obtiene la matriz de transformación. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| override [Clone](../../aspose.svg.rendering.pdf/pdfgraphiccontext/clone/)() | Crea una nueva instancia de una clase con los mismos valores de propiedad que una instancia existente. |
| override [Transform](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transform/)(Matrix) | Modifica la matriz de transformación actual multiplicando la matriz especificada. |

### Ver también

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [PdfDevice](../pdfdevice/)
* espacio de nombres [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* asamblea [Aspose.SVG](../../)


