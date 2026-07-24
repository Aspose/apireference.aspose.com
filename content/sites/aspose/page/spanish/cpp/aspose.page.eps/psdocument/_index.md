---
title: "Aspose::Page::EPS::PsDocument clase"
linktitle: "PsDocument"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::EPS::PsDocument clase. Esta clase encapsula documentos PS/EPS en C++."
type: docs
weight: 700
url: /es/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


Esta clase encapsula documentos PS/EPS.

```cpp
class PsDocument : public Aspose::Page::Document
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Añade recorte al estado gráfico actual. |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Añade recorte al estado gráfico actual y luego escribe el operador \"newpath\". Es necesario hacerlo para evitar la confluencia de esta ruta de recorte y algunas rutas posteriores, como los glifos delineados con el operador \"charpath\". |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | Añade un rectángulo de recorte al estado gráfico actual. |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Añade recorte a partir del contorno del texto dado en la fuente especificada. |
| [ClosePage](./closepage/)() | Completa la página actual. |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | Convierte la fuente Type 1 a **TrueType**. El nombre de la fuente TTF convertida será el mismo que la fuente Type 1 de entrada con la extensión \".ttf\". El archivo TTF se guardará en el directorio de salida asignado. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | Convierte la fuente Type 3 a **TrueType**. El nombre de la fuente TTF convertida será el mismo que el archivo de fuente Type 3 de entrada con la extensión \".ttf\". El archivo TTF se guardará en el directorio de salida asignado. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | Convierte la fuente Type 3 a flujo **TrueType**. |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | Recorta el [PsDocument](./) dado como archivo [EPS](../). Guarda el archivo [EPS](../) inicial con el %BoundingBox existente actualizado o se creará uno nuevo. |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | Recorta el [PsDocument](./) dado como archivo [EPS](../). Guarda el archivo [EPS](../) inicial con el %BoundingBox existente actualizado o se creará uno nuevo. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Dibuja una ruta arbitraria. |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | Dibuja un arco. |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Dibuja una imagen enmascarada. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | Dibuja una imagen. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | Dibuja una imagen transformada con fondo. |
| [DrawLine](./drawline/)(double, double, double, double) | Dibuja un segmento de línea. |
| [DrawOval](./drawoval/)(double, double, double, double) | Dibuja un óvalo. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Dibuja un polígono. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Dibuja un polígono. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Dibuja una polilínea. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Dibuja una polilínea. |
| [DrawRect](./drawrect/)(double, double, double, double) | Dibuja un rectángulo. |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | Dibuja un rectángulo redondeado. |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | Dibuja una imagen transparente transformada. Si la imagen no tiene canal Alfa, se dibujará como una imagen opaca. |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | Lee el archivo [EPS](../) y extrae el cuadro delimitador de la imagen [EPS](../) del comentario %BoundingBox o los límites del tamaño de página predeterminado (0, 0, 595, 842) si no existe. |
| [ExtractEpsSize](./extractepssize/)() | Lee el archivo [EPS](../) y extrae el tamaño de la imagen [EPS](../) del comentario %BoundingBox o el tamaño de página predeterminado (595, 842) si no existe. |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | Extrae texto de un archivo PS. El texto solo puede extraerse si está escrito con la fuente Type 42 (**TrueType**) o con una fuente Type 0 que contenga fuentes Type 42 en su Mapa Vectorial. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Rellena una ruta arbitraria. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos. |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | Rellena un arco. |
| [FillOval](./filloval/)(double, double, double, double) | Rellena un óvalo. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Rellena un polígono. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Rellena un polígono. |
| [FillRect](./fillrect/)(double, double, double, double) | Rellena un rectángulo. |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | Rellena un rectángulo redondeado. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Añade una cadena de texto rellenando el interior de los glifos. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Añade una cadena de texto rellenando el interior de los glifos. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Añade una cadena de texto rellenando el interior de los glifos. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Añade una cadena de texto rellenando el interior de los glifos. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Añade una cadena de texto rellenando el interior de los glifos. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Añade una cadena de texto rellenando el interior de los glifos. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Añade una cadena de texto rellenando el interior de los glifos. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Añade una cadena de texto rellenando el interior de los glifos. |
| [get_InputStream](./get_inputstream/)() | Inicializa [PsDocument](./) con un flujo y opciones de carga. |
| [get_NumberOfPages](./get_numberofpages/)() const | Devuelve el número de páginas del documento PDF resultante. |
| [GetPaint](./getpaint/)() | Obtiene la pintura del estado gráfico actual. |
| [GetStroke](./getstroke/)() | Establece el trazo en el estado gráfico actual. |
| [GetXmpMetadata](./getxmpmetadata/)() | Lee el archivo PS/EPS y extrae XmpMetdata si ya existe o agrega uno nuevo si no existe. |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Fusiona archivos PS/EPS a un dispositivo. |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Fusiona archivos PS/EPS a un dispositivo. |
| [OpenPage](./openpage/)(float, float) | Crea una nueva página y la convierte en la actual. |
| [OpenPage](./openpage/)(System::String) | Crea una nueva página con el tamaño del documento y la convierte en la actual. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Agrega una cadena de texto dibujando los contornos de los glifos. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Agrega una cadena de texto dibujando los contornos de los glifos. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Agrega una cadena de texto dibujando los contornos de los glifos. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Agrega una cadena de texto dibujando los contornos de los glifos. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Agrega una cadena de texto dibujando los contornos de los glifos. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Agrega una cadena de texto dibujando los contornos de los glifos. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Agrega una cadena de texto dibujando los contornos de los glifos. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Agrega una cadena de texto dibujando los contornos de los glifos. |
| [PsDocument](./psdocument/)() | Inicializa un [PsDocument](./) vacío. Este constructor se usa solo para operaciones adicionales que no están relacionadas con archivos PostScript, por ejemplo, convertir fuentes. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Inicializa un [PsDocument](./) vacío con una página inicializada. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Inicializa un [PsDocument](./) vacío con una página inicializada. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Inicializa un [PsDocument](./) vacío. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Inicializa un [PsDocument](./) vacío. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Inicializa un [PsDocument](./) vacío cuando se conoce de antemano el número de páginas del documento [Postscript](../../aspose.page.eps.postscript/). |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Inicializa un [PsDocument](./) vacío cuando se conoce de antemano el número de páginas del documento [Postscript](../../aspose.page.eps.postscript/). |
| [PsDocument](./psdocument/)(System::String) | Inicializa un [PsDocument](./) con un archivo PS/EPS de entrada. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | Inicializa un [PsDocument](./) con un flujo de archivo PS/EPS. |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | Redimensiona el [PsDocument](./) dado como archivo [EPS](../). Este método se usa solo después de extraer el tamaño del [EPS](../). Guarda el archivo [EPS](../) inicial D:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hEl directorio de salida donde se guardará el archivo de imagen.e con %BoundingBox existente actualizado o se creará uno nuevo. La matriz de transformación del [Page](../../aspose.page/) también se establecerá. |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | Redimensiona el [PsDocument](./) dado como archivo [EPS](../). Este método se usa solo después de extraer el tamaño del [EPS](../). Guarda el archivo [EPS](../) inicial con %BoundingBox existente actualizado o se creará uno nuevo. La matriz de transformación del [Page](../../aspose.page/) también se establecerá. |
| [Rotate](./rotate/)(float) | Agrega una rotación en sentido antihorario alrededor del origen al estado gráfico actual (rotar la matriz actual). |
| [Rotate](./rotate/)(int32_t) | Agrega una rotación en sentido antihorario alrededor del origen al estado gráfico actual (rotar la matriz actual). |
| [Save](./save/)(System::String) | Guarda el [PsDocument](./) dado como archivo [EPS](../). Este método se usa solo después de actualizar los metadatos [XMP](../../aspose.page.eps.xmp/). Guarda el archivo [EPS](../) inicial con los metadatos existentes actualizados o crea uno nuevo al llamar al método GetMetadata. En el último caso se añaden todo el código PostScript necesario y los comentarios [EPS](../). |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Guarda el [PsDocument](./) dado en el flujo. Este método se usa solo después de actualizar los metadatos [XMP](../../aspose.page.eps.xmp/). Guarda el archivo [EPS](../) inicial con los metadatos existentes actualizados o crea uno nuevo al llamar al método GetMetadata. En el último caso se añaden todo el código PostScript necesario y los comentarios [EPS](../). |
| [Save](./save/)() | Guarda el [PsDocument](./) dado como archivo PS o [EPS](../). Este método se usa solo cuando el [PsDocument](./) fue creado desde cero. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Guarda el archivo PS/EPS en un archivo de imagen. El directorio de salida y el nombre del archivo serán los mismos que del archivo PS de entrada. La extensión del archivo corresponderá al formato de imagen especificado en el parámetro \"options\". Si el documento se inicializó con un flujo que no es FileStream, el archivo de imagen se guardará en la carpeta actual con la plantilla de nombre de archivo predeterminada. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | Guarda el archivo PS/EPS en un archivo de imagen en el directorio especificado con el nombre de archivo especificado. La extensión del archivo corresponderá al formato de imagen indicado en el parámetro \"options\". |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Guarda el archivo PS/EPS en matrices de bytes de imágenes. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | Guarda el archivo PS/EPS en un archivo PDF. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | Guarda el archivo PS/EPS en un flujo PDF. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Guarda la imagen PNG/JPEG/TIFF/BMP/GIF/EMF desde el flujo de entrada al flujo de salida [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Guarda la imagen PNG/JPEG/TIFF/BMP/GIF/EMF desde un archivo al archivo [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Guarda el objeto Bitmap en un archivo [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Guarda el objeto Bitmap en el flujo de salida [EPS](../). |
| [Scale](./scale/)(float, float) | Agrega una escala al estado gráfico actual (escalar la matriz actual). |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | Inicializa [PsDocument](./) con un flujo y opciones de carga. |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Establece los parámetros del dispositivo de página (ver el operador \"setpagedevice\" en la especificación PostScript). Entre ellos pueden estar el tamaño de página, el color, etc. |
| [SetPageSize](./setpagesize/)(float, float) | Establece el tamaño de página. Para crear páginas con diferentes tamaños en un mismo documento, use el método [SetPageDevice](./setpagedevice/) justo después de este método. |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | Establece la pintura en el estado gráfico actual. |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | Establece el trazo en el estado gráfico actual. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Establece la transformación actual a esta. |
| [Shear](./shear/)(float, float) | Rota el estado gráfico actual en sentido antihorario alrededor de un punto. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Agrega una transformación al estado gráfico actual (concatena esta matriz con la actual). |
| [Translate](./translate/)(float, float) | Agrega una traslación al estado gráfico actual (traslada la matriz actual). |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | Escribe la restauración del estado gráfico actual (Vea la especificación de PostScript sobre el operador "grestore"). |
| [WriteGraphicsSave](./writegraphicssave/)() | Escribe el guardado del estado gráfico actual (Vea la especificación de PostScript sobre el operador "gsave"). |
## Ver también

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
