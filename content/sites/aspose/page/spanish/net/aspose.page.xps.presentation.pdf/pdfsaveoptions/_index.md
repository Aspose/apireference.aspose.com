---
title: Class PdfSaveOptions
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.Presentation.Pdf.PdfSaveOptions clase. Clase para opciones de guardado de XPS como PDF.
type: docs
weight: 440
url: /es/net/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class

Clase para opciones de guardado de XPS como PDF.

```csharp
public class PdfSaveOptions : SaveOptions
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/)() | Crea nueva instancia de opciones. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Especifica carpetas adicionales donde el convertidor debe encontrar fuentes para el documento de entrada. La carpeta predeterminada es la carpeta de fuentes estándar donde el sistema operativo encuentra fuentes para necesidades internas. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Especifica si la información de depuración se debe imprimir en el flujo de salida estándar o no. |
| [EncryptionDetails](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/encryptiondetails/) { get; set; } | Obtiene o establece detalles de cifrado. Si no se establece, no se realizará ningún cifrado. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Devuelve una lista de errores de conversión suprimidos Si!:SuppressErrors es cierto. |
| [ImageCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/imagecompression/) { get; set; } | Especifica el tipo de compresión que se utilizará para todas las imágenes del documento. El valor predeterminado esAuto . |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | La categoría Calidad especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor será la calidad de la imagen. El valor 0 da como resultado la imagen de calidad más baja, mientras que 100 da como resultado la más alta. |
| [OutlineTreeExpansionLevel](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeexpansionlevel/) { get; set; } | Especifica hasta qué nivel debe expandirse el esquema del documento cuando se abre el archivo PDF en un visor. 1: solo se muestran los elementos del esquema del primer nivel, 2: solo se muestran los elementos del esquema del primer y segundo nivel, y etc. El valor predeterminado es 1. |
| [OutlineTreeHeight](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeheight/) { get; set; } | Especifica la altura del árbol de esquema del documento para guardar. 0: el árbol de esquema no se convertirá, 1: solo se convertirán los elementos de esquema de primer nivel, y así sucesivamente. El valor predeterminado es 10. |
| [PageNumbers](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/pagenumbers/) { get; set; } | Obtiene/establece la matriz de números de páginas para convertir. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Especifica si los errores se deben suprimir o no. Si se agregan errores verdaderos suprimidos a[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Si es falso, el primer error terminará el programa. |
| [TextCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/textcompression/) { get; set; } | Especifica el tipo de compresión que se usará para todos los flujos de contenido excepto imágenes. El valor predeterminado esFlate . |

### Ver también

* class [SaveOptions](../../aspose.page/saveoptions/)
* espacio de nombres [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* asamblea [Aspose.Page](../../)


