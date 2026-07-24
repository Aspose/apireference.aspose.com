---
title: "Aspose::Page::XPS::XpsDocument clase"
linktitle: "XpsDocument"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsDocument class. Clase que encapsula la entidad principal del documento XPS que proporciona métodos de manipulación para cualquier elemento XPS en C++."
type: docs
weight: 400
url: /es/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


Clase que encapsula la entidad principal del documento [XPS](../) que proporciona métodos de manipulación para cualquier elemento [XPS](../).

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(T) | Agrega un elemento de contenido (Canvas, Path o Glyphs). |
| [AddCanvas](./addcanvas/)() | Agrega un nuevo lienzo a la página activa. |
| [AddDocument](./adddocument/)(bool) | Agrega un documento vacío con el tamaño de página predeterminado. |
| [AddDocument](./adddocument/)(float, float, bool) | Agrega un documento vacío con las dimensiones de la primera página *width* y *height*. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Agrega nuevos glifos a la página activa. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Agrega nuevos glifos a la página activa. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | Agrega una entrada de contorno al documento. |
| [AddPage](./addpage/)(bool) | Agrega una página vacía al documento con el tamaño de página predeterminado. |
| [AddPage](./addpage/)(float, float, bool) | Agrega una página vacía al documento con el *width* y *height* especificados. |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | Agrega una página al documento. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Agrega una nueva ruta a la página activa. |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Crea un nuevo segmento de arco elíptico. |
| [CreateCanvas](./createcanvas/)() | Crea un nuevo canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Crea un nuevo color. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Crea un nuevo color en el espacio de color sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Crea un nuevo color en el espacio de color sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | Crea un nuevo color en el espacio de color scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | Crea un nuevo color en el espacio de color scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Crea un nuevo color en un espacio de color basado en ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Crea un nuevo color en un espacio de color basado en ICC. |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | Crea un nuevo recurso de fuente **TrueType**. |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | Crea un nuevo recurso de fuente **TrueType** a partir de un flujo. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Crea nuevos glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Crea nuevos glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Crea una nueva parada de degradado. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Crea una nueva parada de degradado. |
| [CreateIccProfile](./createiccprofile/)(System::String) | Crea un nuevo recurso de perfil ICC a partir del archivo de perfil ICC ubicado en *iccProfilePath*. |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | Crea un nuevo recurso de perfil ICC a partir de *stream*. |
| [CreateImage](./createimage/)(System::String) | Crea un nuevo recurso de imagen a partir del archivo de imagen ubicado en *imagePath*. |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | Crea un nuevo recurso de imagen a partir de *stream*. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crea una nueva brocha de imagen. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crea una nueva brocha de imagen. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Crea una nueva brocha de degradado lineal. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Crea una nueva brocha de degradado lineal. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Crea una nueva matriz de transformación afín. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Crea una nueva ruta. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Crea una nueva figura de ruta. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Crea una nueva figura de ruta. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Crea una nueva geometría de ruta especificada con forma abreviada. |
| [CreatePathGeometry](./createpathgeometry/)() | Crea una nueva geometría de ruta. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Crea una nueva geometría de ruta con una lista especificada de figuras de ruta. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crea un nuevo conjunto de curvas Bézier cúbicas. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crea un nuevo dibujo poligonal que contiene un número arbitrario de vértices individuales. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crea un nuevo conjunto de curvas Bézier cuadráticas desde el punto anterior en la figura de ruta a través de un conjunto de vértices, usando puntos de control especificados. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Crea una nueva brocha de degradado radial. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Crea una nueva brocha de degradado radial. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Crea una nueva brocha de color sólido. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Crea una nueva brocha de color sólido. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crea una nueva brocha visual. |
| [Dispose](./dispose/)() override | Descarta la instancia. |
| [get_ActiveDocument](./get_activedocument/)() | Obtiene el número del documento activo. |
| [get_ActivePage](./get_activepage/)() | Obtiene el número de página activo dentro del documento activo. |
| [get_DocumentCount](./get_documentcount/)() | Devuelve el número de documentos dentro del paquete [XPS](../). |
| [get_JobPrintTicket](./get_jobprintticket/)() | Devuelve/establece el ticket de impresión del trabajo del documento. |
| [get_Page](./get_page/)() | Devuelve una instancia de [XpsPage](../) para la página activa. |
| [get_PageCount](./get_pagecount/)() | Devuelve el número de páginas en el documento activo. |
| [get_TotalPageCount](./get_totalpagecount/)() | Devuelve el número total de páginas en todos los documentos dentro del documento [XPS](../). |
| [get_Utils](./get_utils/)() const | Obtiene el objeto que proporciona utilidades más allá de la API formal de manipulación de [XPS](../). |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | Devuelve el ticket de impresión del documento indexado por *documentIndex*. |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | Devuelve el ticket de impresión de la página indexada por *pageIndex* en el documento indexado por *documentIndex*. |
| [Insert](./insert/)(int32_t, T) | Inserta un elemento (Canvas, Path o Glyphs) en la página activa en la posición *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Inserta un nuevo Canvas en la página activa en la posición *index*. |
| [InsertDocument](./insertdocument/)(int32_t, bool) | Inserta un documento vacío con tamaño de página predeterminado en la posición *index*. |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | Inserta un documento vacío con las dimensiones de la primera página *width* y *height* en la posición *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Inserta nuevos glifos en la página activa en la posición *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Inserta nuevos glifos en la página activa en la posición *index*. |
| [InsertPage](./insertpage/)(int32_t, bool) | Inserta una página vacía en el documento con tamaño de página predeterminado en la posición *index*. |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | Inserta una página vacía en el documento con *width* y *height* especificados en la posición *index*. |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | Inserta una página en el documento en la posición *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Inserta un nuevo Path en la página activa en la posición *index*. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | Fusionando varios archivos [XPS](../) en un documento [XPS](../). |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | Fusionando varios archivos [XPS](../) en un documento [XPS](../). |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Fusionando documentos [XPS](../) a PDF usando la instancia de [Device](../). |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Fusionando documentos [XPS](../) a PDF usando la instancia de [Device](../). |
| [Remove](./remove/)(T) | Elimina un elemento de la página activa. |
| [RemoveAt](./removeat/)(int32_t) | Elimina un elemento en la posición *index* de la página activa. |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | Elimina un documento en la posición *index*. |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | Elimina una página del documento. |
| [RemovePageAt](./removepageat/)(int32_t) | Elimina una página del documento en la posición *index*. |
| [Save](./save/)(System::String) | Guarda el documento [XPS](../) en un archivo [XPS](../) ubicado en *path*. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Guarda el documento [XPS](../) en un flujo. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Guarda el documento en un archivo de imagen. El directorio de salida y el nombre de archivo serán los mismos que del archivo [XPS](../) de entrada. La extensión del archivo corresponderá al formato de imagen en el parámetro \"options\". Si el documento se inicializó con un flujo que no es FileStream, el archivo de imagen se guardará en la carpeta actual con la plantilla de nombre de archivo predeterminada. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | Guarda el documento en un archivo de imagen en el directorio especificado con el nombre de archivo especificado. La extensión del archivo corresponderá al formato de imagen en el parámetro \"options\". |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Guarda el documento en formato de imagen bitmap como matrices de bytes. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Guarda el documento en formato PDF. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Guarda el documento en formato PDF. |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Guarda el documento en formato PS. |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Guarda el documento en formato PS. |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | Selecciona un documento activo para editar. |
| [SelectActivePage](./selectactivepage/)(int32_t) | Selecciona una página de documento activa para editar. |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | Devuelve/establece el ticket de impresión del trabajo del documento. |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | Enlaza el *printTicket* al documento indexado por *documentIndex*. |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | Enlaza el *printTicket* a la página indexada por *pageIndex* en el documento indexado por *documentIndex*. |
| [XpsDocument](./xpsdocument/)() | Crea un documento [XPS](../) vacío con el tamaño de página predeterminado. |
| [XpsDocument](./xpsdocument/)(System::String) | Abre un documento [XPS](../) existente ubicado en *path*. |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | Abre un documento existente ubicado en *path* como documento [XPS](../). |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | Carga un documento existente almacenado en *stream* como documento [XPS](../). |
## Ver también

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
