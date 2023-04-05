---
title: Class PsSaveOptions
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.EPS.Device.PsSaveOptions clase. Esta clase contiene las opciones necesarias para gestionar el proceso de conversión de documentos a archivos PostScript PS o PostScript encapsulado EPS.
type: docs
weight: 80
url: /es/net/aspose.page.eps.device/pssaveoptions/
---
## PsSaveOptions class

Esta clase contiene las opciones necesarias para gestionar el proceso de conversión de documentos a archivos PostScript (PS) o PostScript encapsulado (EPS).

```csharp
public class PsSaveOptions : SaveOptions
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [PsSaveOptions](pssaveoptions/#constructor)() | Inicializa una nueva instancia del`PsSaveOptions` clase con valores predeterminados para banderas!:SuppressErrors (verdadero) y!:Debug (falso). |
| [PsSaveOptions](pssaveoptions/#constructor_1)(bool) | Inicializa una nueva instancia del`PsSaveOptions` clase con valores predeterminados para la bandera!:Debug (falso). |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Especifica carpetas adicionales donde el convertidor debe encontrar fuentes para el documento de entrada. La carpeta predeterminada es la carpeta de fuentes estándar donde el sistema operativo encuentra fuentes para necesidades internas. |
| [BackgroundColor](../../aspose.page.eps.device/pssaveoptions/backgroundcolor/) { get; set; } | El color de fondo. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Especifica si la información de depuración se debe imprimir en el flujo de salida estándar o no. |
| [EmbedFonts](../../aspose.page.eps.device/pssaveoptions/embedfonts/) { get; set; } | Indica si se deben incrustar las fuentes usadas en el documento PS. |
| [EmbedFontsAs](../../aspose.page.eps.device/pssaveoptions/embedfontsas/) { get; set; } | Un tipo de fuente en el que incrustar fuentes en el documento PS. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Devuelve una lista de errores de conversión suprimidos Si!:SuppressErrors es cierto. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | La categoría Calidad especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor será la calidad de la imagen. El valor 0 da como resultado la imagen de calidad más baja, mientras que 100 da como resultado la más alta. |
| [Margins](../../aspose.page.eps.device/pssaveoptions/margins/) { get; set; } | Los márgenes de la página. |
| [PageSize](../../aspose.page.eps.device/pssaveoptions/pagesize/) { get; set; } | El tamaño de la página. |
| [SaveFormat](../../aspose.page.eps.device/pssaveoptions/saveformat/) { get; set; } | El formato guardado del archivo resultante. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Especifica si los errores se deben suprimir o no. Si se agregan errores verdaderos suprimidos a[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Si es falso, el primer error terminará el programa. |
| [Transparent](../../aspose.page.eps.device/pssaveoptions/transparent/) { get; set; } | Indica si el fondo es transparente. |

### Ver también

* class [SaveOptions](../../aspose.page/saveoptions/)
* espacio de nombres [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* asamblea [Aspose.Page](../../)


