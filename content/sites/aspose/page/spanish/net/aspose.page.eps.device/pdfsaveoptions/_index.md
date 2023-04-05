---
title: Class PdfSaveOptions
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.EPS.Device.PdfSaveOptions clase. Esta clase contiene flujos de entrada y salida y otras opciones necesarias para administrar el proceso de conversión.
type: docs
weight: 70
url: /es/net/aspose.page.eps.device/pdfsaveoptions/
---
## PdfSaveOptions class

Esta clase contiene flujos de entrada y salida y otras opciones necesarias para administrar el proceso de conversión.

```csharp
public class PdfSaveOptions : SaveOptions
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/#constructor)() | Inicializa una nueva instancia del`PdfSaveOptions` clase con valores predeterminados para banderas!:SuppressErrors (verdadero) y!:Debug (falso). |
| [PdfSaveOptions](pdfsaveoptions/#constructor_1)(bool) | Inicializa una nueva instancia del`PdfSaveOptions` clase con valores predeterminados para la bandera!:Debug (falso). |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Especifica carpetas adicionales donde el convertidor debe encontrar fuentes para el documento de entrada. La carpeta predeterminada es la carpeta de fuentes estándar donde el sistema operativo encuentra fuentes para necesidades internas. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Especifica si la información de depuración se debe imprimir en el flujo de salida estándar o no. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Devuelve una lista de errores de conversión suprimidos Si!:SuppressErrors es cierto. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | La categoría Calidad especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor será la calidad de la imagen. El valor 0 da como resultado la imagen de calidad más baja, mientras que 100 da como resultado la más alta. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Especifica si los errores se deben suprimir o no. Si se agregan errores verdaderos suprimidos a[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Si es falso, el primer error terminará el programa. |

### Ver también

* class [SaveOptions](../../aspose.page/saveoptions/)
* espacio de nombres [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* asamblea [Aspose.Page](../../)


