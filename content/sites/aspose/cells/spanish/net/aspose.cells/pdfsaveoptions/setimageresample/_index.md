---
title: SetImageResample
second_title: Referencia de API de Aspose.Cells para .NET
description: Establece los PPI píxeles por pulgada deseados de las imágenes de remuestreo y la calidad jpeg. Todas las imágenes se convertirán a JPEG con la configuración de calidad especificada y las imágenes que superen los PPI píxeles por pulgada especificados se volverán a muestrear.
type: docs
weight: 320
url: /es/net/aspose.cells/pdfsaveoptions/setimageresample/
---
## PdfSaveOptions.SetImageResample method

Establece los PPI (píxeles por pulgada) deseados de las imágenes de remuestreo y la calidad jpeg. Todas las imágenes se convertirán a JPEG con la configuración de calidad especificada, y las imágenes que superen los PPI (píxeles por pulgada) especificados se volverán a muestrear.

```csharp
public void SetImageResample(int desiredPPI, int jpegQuality)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| desiredPPI | Int32 | Píxeles por pulgada deseados. 220 de alta calidad. 150 calidad de pantalla. 96 calidad del correo electrónico. |
| jpegQuality | Int32 | 0 - 100% calidad JPEG. |

### Ejemplos

El siguiente código establece el PPI deseado en 96 y la calidad jpeg en 80 para las imágenes en el pdf de salida.

```csharp
//cargar el archivo fuente con imágenes.
Workbook wb = new Workbook("Book1.xlsx");

PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();

// establezca el PPI deseado en 96 y la calidad jpeg en 80.
pdfSaveOptions.SetImageResample(96, 80);

wb.Save("output.pdf", pdfSaveOptions);
```

### Ver también

* class [PdfSaveOptions](../../pdfsaveoptions)
* espacio de nombres [Aspose.Cells](../../pdfsaveoptions)
* asamblea [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
