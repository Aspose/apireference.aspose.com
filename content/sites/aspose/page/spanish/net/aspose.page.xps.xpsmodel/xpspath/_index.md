---
title: Class XpsPath
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsModel.XpsPath clase. Clase que encapsula características del elemento Path. Este elemento es el único medio para agregar gráficos vectoriales e imágenes a una página fija. Define un único gráfico vectorial que se representará en una página.
type: docs
weight: 3260
url: /es/net/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class

Clase que encapsula características del elemento Path. Este elemento es el único medio para agregar gráficos vectoriales e imágenes a una página fija. Define un único gráfico vectorial que se representará en una página.

```csharp
public sealed class XpsPath : XpsContentElement
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Devuelve/establece la instancia de la geometría de ruta que limita la región renderizada del elemento. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Devuelve el número de elementos secundarios. |
| [Data](../../aspose.page.xps.xpsmodel/xpspath/data/) { get; set; } | Devuelve/establece la geometría del camino. |
| [Fill](../../aspose.page.xps.xpsmodel/xpspath/fill/) { get; set; } | Devuelve/establece el pincel utilizado para pintar la geometría especificada por la propiedad Datos de la ruta. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Devuelve/establece el objeto de destino del hipervínculo. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Proporciona acceso a los elementos secundarios por índice*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Devuelve/establece el valor que define la transparencia uniforme del elemento. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Devuelve/establece el pincel especificando una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacidad, pero que permite diferentes valores alfa para diferentes áreas del elemento. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Devuelve/establece la matriz de transformación afín estableciendo un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos secundarios (si los hay). |
| [Stroke](../../aspose.page.xps.xpsmodel/xpspath/stroke/) { get; set; } | Devuelve/establece el pincel utilizado para dibujar el trazo. |
| [StrokeDashArray](../../aspose.page.xps.xpsmodel/xpspath/strokedasharray/) { get; set; } | Devuelve/establece la matriz que especifica la longitud de los guiones y espacios del trazo del contorno. |
| [StrokeDashCap](../../aspose.page.xps.xpsmodel/xpspath/strokedashcap/) { get; set; } | Devuelve/establece el valor que especifica cómo se dibujan los extremos de cada guión. |
| [StrokeDashOffset](../../aspose.page.xps.xpsmodel/xpspath/strokedashoffset/) { get; set; } | Devuelve/establece el punto de inicio para repetir el patrón de matriz de guiones. Si se omite este valor, la matriz de guiones se alinea con el origen del trazo. |
| [StrokeEndLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokeendlinecap/) { get; set; } | Devuelve/establece el valor que define la forma del final del último guión de un trazo. |
| [StrokeLineJoin](../../aspose.page.xps.xpsmodel/xpspath/strokelinejoin/) { get; set; } | Devuelve/establece el valor que define la forma del comienzo del primer guión de un trazo. |
| [StrokeMiterLimit](../../aspose.page.xps.xpsmodel/xpspath/strokemiterlimit/) { get; set; } | Devuelve/establece la relación entre la longitud máxima del inglete y la mitad del grosor del trazo. Este valor es significativo solo si el`CarreraLíneaUnirse` atributo especifica`Inglete` . |
| [StrokeStartLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokestartlinecap/) { get; set; } | Devuelve/establece el valor que define la forma del comienzo del primer guión de un trazo. |
| [StrokeThickness](../../aspose.page.xps.xpsmodel/xpspath/strokethickness/) { get; set; } | Devuelve/establece el grosor de un trazo, en unidades de el espacio de coordenadas efectivo (incluye la transformación de renderizado de la ruta). El trazo se dibuja sobre el límite de la geometría especificada por la propiedad Datos del elemento Ruta. La mitad de StrokeThickness se extiende fuera de la geometría especificada por la propiedad Data y la otra mitad se extiende dentro de la geometría. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpspath/clone/)() | Clona esta ruta. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Implementación deIEnumerable interfaz. |

### Ver también

* class [XpsContentElement](../xpscontentelement/)
* espacio de nombres [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* asamblea [Aspose.Page](../../)


