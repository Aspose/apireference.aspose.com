---
title: "Clase Aspose::Page::EPS::Device::PdfDevice"
linktitle: "PdfDevice"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::EPS::Device::PdfDevice. Esta clase encapsula la renderización del documento a PDF en C++."
type: docs
weight: 300
url: /es/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


Esta clase encapsula la renderización del documento a PDF.

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## Métodos

| Método | Descripción |
| --- | --- |
| static [AUTHOR](./author/)() | Valor de la propiedad "Author". |
| static [BACKGROUND](./background/)() | Clave de la propiedad "Background". |
| static [BACKGROUND_COLOR](./background_color/)() | Clave de la propiedad "Background color". |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Recorta usando la forma dada. Despacha a writeClip(Rectangle), writeClip(RectangleF) o writeClip(Shape). |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | Recorta rectángulo. Llama a clip(Rectangle2D). |
| [ClosePage](./closepage/)() override | Realiza la preparación necesaria del dispositivo después de que la página haya sido renderizada. |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | Clave de la propiedad "Compress". |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | Crea una copia de este dispositivo. |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | Dispone del contexto gráfico. Si al crear restoreOnDispose era verdadero, se llamará a writeGraphicsRestore(). |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Dibuja una ruta. |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | Dibuja una imagen con la transformación y el fondo asignados. |
| [DrawString](./drawstring/)(System::String, double, double) override | Dibuja una cadena en el punto dado. |
| static [EMBED_FONTS](./embed_fonts/)() | Clave de la propiedad "Embed font in document". |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | Clave de la propiedad "What font type is used for embedding". |
| static [EMIT_ERRORS](./emit_errors/)() | Valor de la propiedad "Emit errors". |
| static [EMIT_WARNINGS](./emit_warnings/)() | Valor de la propiedad "Emit warnings". |
| [EndDocument](./enddocument/)() override | Realiza la preparación necesaria del dispositivo después de que el documento haya sido renderizado. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Rellena una ruta. |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | Clave de la propiedad "Fit content to page". |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | Número de página actual. |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | Dibuja un marco y una pancarta alrededor de una cadena. El método calcula y devuelve el punto al que debe colocarse el cursor de texto antes de dibujar la cadena. |
| [get_OutputStream](./get_outputstream/)() override | Especifica o devuelve un flujo de salida. |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | Obtiene la transformación actual. |
| [InitClip](./initclip/)() override | Inicializa el recorte del dispositivo. |
| [InitPageNumbers](./initpagenumbers/)() override | Inicializa el número de páginas a generar. |
| static [KEYWORDS](./keywords/)() | "Keywords" valor de la propiedad. |
| [OpenPage](./openpage/)(System::String) override | Realiza la preparación necesaria del dispositivo antes del renderizado de la página. |
| [OpenPage](./openpage/)(float, float) override | Realiza la preparación necesaria del dispositivo antes del renderizado de cada página. |
| static [ORIENTATION](./orientation/)() | "Orientation" clave de la propiedad. |
| static [PAGE_MARGINS](./page_margins/)() | "Page margins" clave de la propiedad. |
| static [PAGE_SIZE_](./page_size_/)() | "Page size" clave de la propiedad. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | Inicializa una nueva instancia de [PdfDevice](./) con el flujo de salida. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | Inicializa una nueva instancia de [PdfDevice](./) con el flujo de salida y el tamaño especificado de una página. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | Constructor de clonación. Inicializa una nueva instancia de [PdfDevice](./) con un dispositivo existente. |
| [ReNew](./renew/)() override | Restablece el dispositivo al estado inicial para todo el documento. Se utiliza para restablecer el flujo de salida. |
| [ReNewForMerge](./renewformerge/)(bool) override | Restablece el dispositivo al estado inicial para todo el documento mientras se fusionan varios documentos. Se utiliza para restablecer el flujo de salida. |
| [Reset](./reset/)() override | Si se establecerán los parámetros del dispositivo de página, este método permite devolver el flujo de escritura al comienzo de la página. |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | Rota la transformación actual alrededor del eje Z. Llama a writeTransform(Transform). Rotar con un ángulo theta positivo gira los puntos del eje x positivo hacia el eje y positivo. |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | Escala la matriz de transformación actual. Llama a writeTransform(Transform). |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | Especifica la fuente actual. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | Especifica o devuelve un flujo de salida. |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Devuelve o especifica la pintura actual. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | Devuelve o especifica el trazo actual. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Especifica el recorte del dispositivo. |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Especifica la transformación actual. Dado que la mayoría de los formatos de salida no implementan esta funcionalidad, se calcula la transformación inversa de currentTransform y se multiplica por la transformación a establecer. El resultado se envía luego mediante una llamada a writeTransform(Transform). |
| [Shear](./shear/)(double, double) override | Sesga la matriz de transformación actual. Llama a writeTransform(Transform). |
| [StartDocument](./startdocument/)() override | Realiza la preparación necesaria del dispositivo antes de iniciar el renderizado del documento. |
| static [SUBJECT](./subject/)() | "Subject" valor de la propiedad. |
| static [TITLE](./title/)() | "Title" valor de la propiedad. |
| [ToString](./tostring/)() const override | Devuelve el nombre del tipo de dispositivo. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Transforma la matriz de transformación actual. Llama a writeTransform(Transform) |
| [Translate](./translate/)(double, double) override | Traslada la matriz de transformación actual. Llama a writeTransform(Transform). |
| static [TRANSPARENT](./transparent/)() | "Transparent" clave de propiedad. |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | Actualiza los parámetros de página desde otro dispositivo multipágina. |
| static [WRITE_IMAGES_AS](./write_images_as/)() | "Format of images" clave de propiedad. |
| [WriteBackground](./writebackground/)() override | Escribe el fondo actual. |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | Escribe la tapa del trazo. |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | Escribe un comentario. |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | Escribe el guión del trazo. |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | Escribe el catálogo, docinfo, preferencias y (como usamos salida de una sola página) el árbol de páginas. |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | Escribe la unión del trazo. |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | Escribe la última pintura escrita. Es útil en casos en los que, después de escribir la pintura, se realizó una restauración de gráficos ("Q"). |
| [WriteMiterLimit](./writemiterlimit/)(float) override | Escribe el límite de inglete del trazo. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | Escribe la pintura como el color dado. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | Escribe la pintura como el degradado dado. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | Escribe la pintura como la textura dada. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Escribe la pintura. |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | Escribe la cadena con la fuente especificada. |
| [WriteTrailer](./writetrailer/)() | Escribe el tráiler del documento PDF. |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Escribe la matriz de transformación dada al archivo. |
| [WriteWarning](./writewarning/)(System::String) override | Escribe una advertencia, por defecto a System.err. |
| [WriteWidth](./writewidth/)(float) override | Escribe el ancho del trazo. |
## Campos

| Campo | Descripción |
| --- | --- |
| static [VERSION](./version/) | "Version" clave de propiedad. |
| static [VERSION5](./version5/) | "Version of Adobe Acrobat Reader" valor de propiedad. |

## Deprecated
La clase PdfDevice está obsoleta a partir de la versión 24.3. Por favor, use el método SaveAsPdf en la clase PsDocument en su lugar. En la versión 24.6 esta clase será completamente oculta

## Ver también

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
