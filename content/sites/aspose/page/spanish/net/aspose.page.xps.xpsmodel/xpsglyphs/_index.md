---
title: Class XpsGlyphs
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsModel.XpsGlyphs clase. Clase que encapsula características del elemento Glyphs. Este elemento representa una ejecución de texto con formato uniforme de una sola fuente. Proporciona la información necesaria para una representación precisa y admite funciones de búsqueda y selección en los consumidores de visualización.
type: docs
weight: 3100
url: /es/net/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class

Clase que encapsula características del elemento Glyphs. Este elemento representa una ejecución de texto con formato uniforme de una sola fuente. Proporciona la información necesaria para una representación precisa y admite funciones de búsqueda y selección en los consumidores de visualización.

```csharp
public sealed class XpsGlyphs : XpsContentElement
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [BidiLevel](../../aspose.page.xps.xpsmodel/xpsglyphs/bidilevel/) { get; set; } | Devuelve/establece el valor que especifica el nivel de anidamiento bidireccional del algoritmo Unicode. Los valores pares implican un diseño de izquierda a derecha, los valores impares implican un diseño de derecha a izquierda. El diseño de derecha a izquierda coloca el origen de ejecución en el lado derecho del primer glifo, con anchos de avance positivos (que representan avances hacia la izquierda) colocando glifos posteriores a la izquierda del glifo anterior. |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Devuelve/establece la instancia de la geometría de ruta que limita la región renderizada del elemento. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Devuelve el número de elementos secundarios. |
| [Fill](../../aspose.page.xps.xpsmodel/xpsglyphs/fill/) { get; set; } | Devuelve/establece el pincel utilizado para rellenar la forma de los glifos renderizados. |
| [Font](../../aspose.page.xps.xpsmodel/xpsglyphs/font/) { get; } | Devuelve el recurso de fuente para la fuente TrueType utilizada para componer texto de elementos. |
| [FontRenderingEmSize](../../aspose.page.xps.xpsmodel/xpsglyphs/fontrenderingemsize/) { get; set; } | Devuelve/establece el tamaño de fuente en unidades de superficie de dibujo, expresado como float en unidades del espacio de coordenadas efectivo. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Devuelve/establece el objeto de destino del hipervínculo. |
| [IsSideways](../../aspose.page.xps.xpsmodel/xpsglyphs/issideways/) { get; set; } | Devuelve/establece el valor que indica que un glifo está girado de lado, con el origen definido como el centro superior del glifo sin girar. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Proporciona acceso a los elementos secundarios por índice*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Devuelve/establece el valor que define la transparencia uniforme del elemento. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Devuelve/establece el pincel especificando una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacidad, pero que permite diferentes valores alfa para diferentes áreas del elemento. |
| [OriginX](../../aspose.page.xps.xpsmodel/xpsglyphs/originx/) { get; set; } | Devuelve/establece la coordenada x del primer glifo del tramo, en unidades del espacio de coordenadas efectivo. |
| [OriginY](../../aspose.page.xps.xpsmodel/xpsglyphs/originy/) { get; set; } | Devuelve/establece la coordenada y del primer glifo del tramo, en unidades del espacio de coordenadas efectivo. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Devuelve/establece la matriz de transformación afín estableciendo un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos secundarios (si los hay). |
| [StyleSimulations](../../aspose.page.xps.xpsmodel/xpsglyphs/stylesimulations/) { get; set; } | Devuelve/establece el valor especificando una simulación de estilo. |
| [UnicodeString](../../aspose.page.xps.xpsmodel/xpsglyphs/unicodestring/) { get; set; } | Devuelve/establece la cadena de texto representada por el elemento Glyphs. El texto se especifica como puntos de código Unicode. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsglyphs/clone/)() | Clonar estos glifos. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Implementación deIEnumerable interfaz. |

### Ver también

* class [XpsContentElement](../xpscontentelement/)
* espacio de nombres [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* asamblea [Aspose.Page](../../)


