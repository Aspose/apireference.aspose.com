---
title: Class AsposeOcr
second_title: Referencia de API de Aspose.OCR para .NET
description: Aspose.OCR.AsposeOcr clase. API principal para la biblioteca Aspose OCR
type: docs
weight: 20
url: /es/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

API principal para la biblioteca Aspose OCR

```csharp
public class AsposeOcr
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [AsposeOcr](asposeocr/#constructor)() | Inicializa una nueva instancia del`AsposeOcr` clase. Constructor vacío. |
| [AsposeOcr](asposeocr/#constructor_1)(string) | Inicializa una nueva instancia del`AsposeOcr` class. Establecer los caracteres permitidos con la propiedad del alfabeto. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | Calcula el ángulo de inclinación de una imagen. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | Calcula el ángulo de inclinación de una imagen. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | Calcula el ángulo de inclinación de una imagen de URI. |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | Comprobar si dos imágenes contienen el mismo texto. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | Corrige texto (reemplaza palabras mal escritas). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | Detecta áreas de texto en la imagen.  No se aplica la corrección automática de la inclinación de la imagen. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | Detecta áreas de texto en la imagen.  No se aplica la corrección automática de la inclinación de la imagen. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | Compruebe si el texto de la imagen coincide con la expresión regular proporcionada. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | Compruebe si la imagen contiene el fragmento de texto proporcionado. |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | Compara los textos de las dos imágenes y devuelve un número que representa cuán similares son (0 a 1). |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | Use el preprocesamiento de imágenes para mejorar la precisión de OCR. Cree una lista de filtros que se aplicarán a la imagen de entrada en el orden que especifique. ejemplo para crear filtros: PreprocessingFilter filtros = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f) ), PreprocessingFilter.Dilate() }; No los necesita todos. Establece solo lo que necesitas. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | Use el preprocesamiento de imágenes para mejorar la precisión de OCR. Cree una lista de filtros que se aplicarán a la imagen de entrada en el orden que especifique. ejemplo para crear filtros: PreprocessingFilter filtros = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f) ), PreprocessingFilter.Dilate() }; No los necesita todos. Establece solo lo que necesitas. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | Reconoce matrícula de coche. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | Reconoce matrícula de coche. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | Reconocer texto de una imagen DJVU de varias páginas.  Reconoce el archivo DJVU con la capacidad de especificar[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Solo admite DJVU. No admite otros tipos de imágenes. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | Reconocer texto de una imagen DJVU de varias páginas.  Reconoce el archivo DJVU con la capacidad de especificar[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Solo admite DJVU. No admite otros tipos de imágenes. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | Reconoce el texto en la tarjeta de identificación. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | Reconoce el texto en la tarjeta de identificación. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | Reconoce texto en imagen. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | Reconoce texto en imagen. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | Reconoce texto en imagen.  Reconoce la imagen con la capacidad de especificar[`RecognitionSettings`](../recognitionsettings/) . Compatible con GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | Reconoce texto en imagen. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | Reconoce texto en imagen. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | Reconoce texto en imagen. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | Reconoce texto en la imagen con buena calidad. No utiliza corrección de sesgo ni detección de áreas. Funciona en modo rápido. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | Reconoce texto en la imagen con buena calidad. No utiliza corrección de sesgo ni detección de áreas. Funciona en modo rápido. |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | Reconoce el texto en la imagen proporcionada en tipo base64. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | Reconoce el texto en la imagen proporcionada por el enlace URI. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | Reconoce texto en imagen de factura. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | Reconoce texto en imagen de factura. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | Reconoce la imagen que contiene una sola línea de texto.  No se aplica la corrección automática de la inclinación de la imagen. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | Reconoce la imagen que contiene una sola línea de texto.  No se aplica la corrección automática de la inclinación de la imagen. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | Reconoce varias imágenes de la lista con la configuración predeterminada.  No se admiten archivos ni carpetas. La cantidad máxima de imágenes procesadas es 20. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | Reconoce varias imágenes empaquetadas en un archivo ZIP o desde una carpeta con la configuración predeterminada.  Los archivos y carpetas anidados no son compatibles. La cantidad máxima de imágenes procesadas es 20. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Reconoce varias imágenes de la lista.  No se admiten archivos ni carpetas. La cantidad máxima de imágenes procesadas es 20. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | Reconoce varias imágenes empaquetadas en un archivo ZIP o desde una carpeta.  Los archivos y carpetas anidados no son compatibles. La cantidad máxima de imágenes procesadas es 20. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | Reconoce texto en pasaportes. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | Reconoce texto en pasaportes. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Reconocer texto de pdf escaneado (extraer imágenes).  Reconoce el archivo pdf con la capacidad de especificar[`RecognitionSettings`](../recognitionsettings/) . Solo admite PDF escaneados. No es compatible con PDF que admite búsquedas. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | Reconocer texto de pdf escaneado (extraer imágenes).  Reconoce el archivo pdf con la capacidad de especificar[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Solo admite PDF escaneados. No es compatible con PDF que admite búsquedas. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | Reconoce texto en imagen. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | Reconoce texto en imagen. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | Reconocer texto de una imagen TIFF de varias páginas.  Reconoce el archivo TIFF con la capacidad de especificar[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Solo admite TIFF (TIF). No admite otros tipos de imágenes. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | Reconocer texto de una imagen TIFF de varias páginas.  Reconoce el archivo TIFF con la capacidad de especificar[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Solo admite TIFF (TIF). No admite otros tipos de imágenes. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Permite obtener un documento de varias páginas de la lista de objetos RecognitionResult |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Permite obtener un documento de varias páginas de la lista de objetos RecognitionResult |

## Eventos

| Nombre | Descripción |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | Un evento para seguir el progreso del reconocimiento de imágenes de varias páginas. |

### Ver también

* espacio de nombres [Aspose.OCR](../../aspose.ocr/)
* asamblea [Aspose.OCR](../../)


