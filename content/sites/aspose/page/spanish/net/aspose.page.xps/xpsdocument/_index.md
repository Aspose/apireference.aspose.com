---
title: Class XpsDocument
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsDocument clase. Clase que encapsula la entidad principal del documento XPS que proporciona métodos de manipulación para cualquier elemento XPS.
type: docs
weight: 470
url: /es/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

Clase que encapsula la entidad principal del documento XPS que proporciona métodos de manipulación para cualquier elemento XPS.

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [XpsDocument](xpsdocument/#constructor)() | Crea un documento XPS vacío con el tamaño de página predeterminado. |
| [XpsDocument](xpsdocument/#constructor_2)(string) | Abre un documento XPS existente ubicado en el*path* . |
| [XpsDocument](xpsdocument/#constructor_1)(Stream, LoadOptions) | Carga un documento existente almacenado en el*stream* como documento XPS. |
| [XpsDocument](xpsdocument/#constructor_3)(string, LoadOptions) | Abre un documento existente ubicado en el*path* como documento XPS. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument/) { get; } | Obtiene el número de documento activo. |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage/) { get; } | Obtiene el número de página activa dentro del documento activo. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount/) { get; } | Devuelve el número de documentos dentro del paquete XPS. |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket/) { get; set; } | Devuelve/establece el ticket de impresión del trabajo del documento |
| [Page](../../aspose.page.xps/xpsdocument/page/) { get; } | Devuelve un[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage/) instancia para página activa. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount/) { get; } | Devuelve el número de páginas del documento activo. |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount/) { get; } | Devuelve el número total de páginas en todos los documentos dentro del documento XPS. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add/)(T) | Agrega un elemento de contenido (lienzo, ruta o glifos) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas/)() | Agrega un nuevo lienzo a la página activa. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument)(bool) | Agrega un documento vacío con el tamaño de página predeterminado. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument_1)(float, float, bool) | Agrega un documento vacío con las dimensiones de la primera página *width* y*height* . |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | Agrega nuevos glifos a la página activa. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | Agrega nuevos glifos a la página activa. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry/)(string, int, XpsHyperlinkTarget) | Agrega una entrada de esquema al documento. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_1)(bool) | Agrega una página vacía al documento con el tamaño de página predeterminado. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage)(XpsPage, bool) | Agrega una página al documento. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_2)(float, float, bool) | Agrega una página vacía al documento con especificado*width* y*height* . |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath/)(XpsPathGeometry) | Agrega una nueva ruta a la página activa. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | Crea un nuevo segmento de arco elíptico. |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas/)() | Crea un nuevo lienzo. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_5)(Color) | Crea un nuevo color. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_6)(string, params float[]) | Crea un nuevo color en el espacio de color basado en ICC. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor)(XpsIccProfile, params float[]) | Crea un nuevo color en el espacio de color basado en ICC. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_3)(float, float, float) | Crea un nuevo color en el espacio de color scRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_1)(int, int, int) | Crea un nuevo color en el espacio de color sRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_4)(float, float, float, float) | Crea un nuevo color en el espacio de color scRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_2)(int, int, int, int) | Crea un nuevo color en el espacio de color sRGB. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont)(Stream) | Crea un nuevo recurso de fuente TrueType fuera de flujo. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont_1)(string, FontStyle) | Crea un nuevo recurso de fuente TrueType. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | Crea nuevos glifos. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | Crea nuevos glifos. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop_1)(Color, float) | Crea una nueva parada de gradiente. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop)(XpsColor, float) | Crea una nueva parada de gradiente. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile)(Stream) | Crea un nuevo recurso de perfil ICC a partir de*stream* . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile_1)(string) | Crea un nuevo recurso de perfil ICC a partir del archivo de perfil ICC ubicado en *iccProfilePath* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage)(Stream) | Crea un nuevo recurso de imagen a partir de*stream* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage_1)(string) | Crea un nuevo recurso de imagen a partir del archivo de imagen ubicado en el*imagePath* . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | Crea un nuevo pincel de imagen. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | Crea un nuevo pincel de imagen. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | Crea un nuevo pincel de degradado lineal. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | Crea un nuevo pincel de degradado lineal. |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix/)(float, float, float, float, float, float) | Crea una nueva matriz de transformación afín. |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath/)(XpsPathGeometry) | Crea una nueva ruta. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure)(PointF, bool) | Crea una nueva figura de camino. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | Crea una nueva figura de camino. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry)() | Crea una nueva geometría de camino. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | Crea una nueva geometría de ruta con una lista especificada de figuras de ruta. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_2)(string) | Crea una nueva geometría de ruta especificada con forma abreviada. |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment/)(PointF[], bool) | Crea un nuevo conjunto de curvas Bézier cúbicas. |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment/)(PointF[], bool) | Crea un nuevo dibujo poligonal que contiene un número arbitrario de vértices individuales. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/)(PointF[], bool) | Crea un nuevo conjunto de curvas Bézier cuadráticas desde el punto anterior en la figura de la ruta a través de un conjunto de vértices, usando puntos de control especificados. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | Crea un nuevo pincel de degradado radial. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | Crea un nuevo pincel de degradado radial. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | Crea un nuevo pincel de color sólido. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | Crea un nuevo pincel de color sólido. |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | Crea un nuevo pincel visual. |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose/)() | Elimina la instancia. |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket/)(int) | Devuelve el ticket de impresión del documento indexado por*documentIndex* . |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket/)(int, int) | Devuelve el ticket de impresión de la página indexada por*pageIndex* en el documento indexado por*documentIndex* . |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert/)(int, T) | Inserta un elemento (Canvas, Path o Glyphs) en la página activa en*index* posición. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas/)(int) | Inserta un nuevo lienzo en la página activa en*index* posición. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument)(int, bool) | Inserta un documento vacío con el tamaño de página predeterminado en*index* posición. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument_1)(int, float, float, bool) | Inserta un documento vacío con las dimensiones de la primera página *width* y*height* en*index* posición. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | Inserta nuevos glifos en la página activa en*index* posición. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | Inserta nuevos glifos en la página activa en*index* posición. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_1)(int, bool) | Inserta una página vacía en el documento con el tamaño de página predeterminado en*index* posición. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage)(int, XpsPage, bool) | Inserta una página en el documento en*index* posición. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_2)(int, float, float, bool) | Inserta una página vacía en el documento con especificado*width* y*height* en*index* posición. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath/)(int, XpsPathGeometry) | Inserta una nueva ruta a la página activa en*index* posición. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge_1)(string[], Stream) | Fusión de varios archivos XPS en un documento XPS. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge)(string[], Device, SaveOptions) | Fusión de documentos XPS a PDF usando el[`Device`](../../aspose.page/device/) instancia. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove/)(T) | Elimina un elemento de la página activa. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat/)(int) | Elimina un elemento en*index* posición desde la página activa. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat/)(int) | Elimina un documento en*index* posición. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage/)(XpsPage) | Elimina una página del documento. |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat/)(int) | Elimina una página del documento en*index* posición. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_1)(Stream) | Guarda el documento XPS en la transmisión. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_2)(string) | Guarda el documento XPS en el archivo XPS ubicado en la*path* . |
| override [Save](../../aspose.page.xps/xpsdocument/save/#save)(Device, SaveOptions) | Guarda el documento usando el[`Device`](../../aspose.page/device/) instancia. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument/)(int) | Selecciona un documento activo para editar. |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage/)(int) | Selecciona una página de documento activa para editar. |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket/)(int, DocumentPrintTicket) | Vincula el*printTicket* al documento indexado por*documentIndex* . |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket/)(int, int, PagePrintTicket) | Vincula el*printTicket* a la página indexada por*pageIndex* en el documento indexado por*documentIndex* . |

### Ver también

* class [Document](../../aspose.page/document/)
* espacio de nombres [Aspose.Page.XPS](../../aspose.page.xps/)
* asamblea [Aspose.Page](../../)


