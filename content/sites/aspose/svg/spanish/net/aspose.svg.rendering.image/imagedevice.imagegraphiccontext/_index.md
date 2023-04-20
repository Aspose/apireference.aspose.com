---
title: Class ImageDevice.ImageGraphicContext
second_title: Referencia de API de Aspose.SVG para .NET
description: Aspose.Svg.Rendering.Image.ImageDeviceImageGraphicContext clase. Contiene los parámetros de control de gráficos actuales para elImageDevice. Estos parámetros definen el marco global dentro del cual se ejecutan los operadores gráficos.
type: docs
weight: 2840
url: /es/net/aspose.svg.rendering.image/imagedevice.imagegraphiccontext/
---
## ImageDevice.ImageGraphicContext class

Contiene los parámetros de control de gráficos actuales para el[`ImageDevice`](../imagedevice/). Estos parámetros definen el marco global dentro del cual se ejecutan los operadores gráficos.

```csharp
public class ImageGraphicContext : GraphicContext
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [ImageGraphicContext](imagegraphiccontext/)() | Constructor predeterminado |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | Establece u obtiene el espacio entre caracteres. |
| virtual [FillBrush](../../aspose.svg.rendering/graphiccontext/fillbrush/) { get; set; } | Establece u obtiene el objeto de pincel que se usa para rellenar el interior de los caminos. |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | Establece u obtiene el objeto de fuente de tipo verdadero que se utiliza para representar texto. |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | Establece u obtiene el tamaño de fuente del texto. |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | Establece u obtiene el estilo de fuente del texto. |
| virtual [LineCap](../../aspose.svg.rendering/graphiccontext/linecap/) { get; set; } | Establece u obtiene el código que especifica la forma de los puntos finales para cualquier ruta abierta que se trazo. |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | Establece u obtiene el desplazamiento de fase del patrón de trazos de línea actual. |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | Establece u obtiene la descripción del patrón de guiones que se usará cuando se trazan trazos. |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | Conjuntos de obtiene el estilo de las líneas discontinuas de un trazo trazado. |
| virtual [LineJoin](../../aspose.svg.rendering/graphiccontext/linejoin/) { get; set; } | Establece u obtiene el código que especifica la forma de las uniones entre los segmentos conectados de un trazado trazado. |
| virtual [LineWidth](../../aspose.svg.rendering/graphiccontext/linewidth/) { get; set; } | Establece u obtiene el grosor de los trazos a trazar. |
| virtual [MiterLimit](../../aspose.svg.rendering/graphiccontext/miterlimit/) { get; set; } | Establece u obtiene la longitud máxima de las uniones de líneas a inglete para trayectos trazados. Este parámetro limita la longitud de los "picos" producidos cuando los segmentos de línea se unen en ángulos agudos. |
| virtual [StrokeBrush](../../aspose.svg.rendering/graphiccontext/strokebrush/) { get; set; } | Establece u obtiene el objeto de pincel que se utiliza para trazos trazados. |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | Obtiene un[`TextInfo`](../../aspose.svg.rendering/textinfo/) objeto que contiene información sobre el texto renderizado. |
| override [TransformationMatrix](../../aspose.svg.rendering.image/imagegraphiccontext/transformationmatrix/) { get; set; } | Establece u obtiene la matriz de transformación. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| override [Clone](../../aspose.svg.rendering.image/imagegraphiccontext/clone/)() | Crea una nueva instancia de una clase GdiGraphicContext con los mismos valores de propiedad que una instancia existente. |
| override [Transform](../../aspose.svg.rendering.image/imagegraphiccontext/transform/)(Matrix) | Modifica la matriz de transformación actual multiplicando la matriz especificada. |

### Ver también

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [ImageDevice](../imagedevice/)
* espacio de nombres [Aspose.Svg.Rendering.Image](../../aspose.svg.rendering.image/)
* asamblea [Aspose.SVG](../../)


