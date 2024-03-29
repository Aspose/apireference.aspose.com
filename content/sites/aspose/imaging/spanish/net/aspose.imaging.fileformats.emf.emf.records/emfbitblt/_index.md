---
title: EmfBitBlt
second_title: Aspose.Imaging para la referencia de la API de .NET
description: El registro EMR_BITBLT especifica una transferencia en bloque de píxeles desde un mapa de bits de origen a un rectángulo de destino  opcionalmente en combinación con un patrón de pincel según una operación de trama especificada.
type: docs
weight: 3250
url: /es/net/aspose.imaging.fileformats.emf.emf.records/emfbitblt/
---
## EmfBitBlt class

El registro EMR_BITBLT especifica una transferencia en bloque de píxeles desde un mapa de bits de origen a un rectángulo de destino , opcionalmente en combinación con un patrón de pincel, según una operación de trama especificada.

```csharp
public sealed class EmfBitBlt : EmfBitmapRecordType
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [EmfBitBlt](emfbitblt)(EmfRecord) | Inicializa una nueva instancia del[`EmfBitBlt`](../emfbitblt) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [BitBltRasterOperation](../../aspose.imaging.fileformats.emf.emf.records/emfbitblt/bitbltrasteroperation) { get; set; } | Obtiene o establece un entero sin signo de 32 bits que especifica el código de operación ráster . Este código define cómo se combinarán los datos de color del rectángulo de origen con los datos de color del rectángulo de destino y, opcionalmente, un patrón de pincel, para lograr el color final. |
| [BkSrcArgb32Color](../../aspose.imaging.fileformats.emf.emf.records/emfbitblt/bksrcargb32color) { get; set; } | Obtiene o establece un objeto WMF ColorRef ([MS-WMF] sección 2.2.2.8 que especifica el color de fondo del mapa de bits de origen. |
| [Bounds](../../aspose.imaging.fileformats.emf.emf.records/emfbitblt/bounds) { get; set; } | Obtiene o establece un objeto WMF RectL ([MS-WMF] sección 2.2.2.19) que define el rectángulo delimitador de destino en unidades de dispositivo. |
| [CxDest](../../aspose.imaging.fileformats.emf.emf.records/emfbitblt/cxdest) { get; set; } | Obtiene o establece un entero de 32 bits con signo que especifica el ancho lógico de los rectángulos de origen y de destino. |
| [CyDest](../../aspose.imaging.fileformats.emf.emf.records/emfbitblt/cydest) { get; set; } | Obtiene o establece un entero de 32 bits con signo que especifica la altura lógica de los rectángulos de origen y de destino. |
| [Size](../../aspose.imaging.fileformats.emf.emf.records/emfrecord/size) { get; set; } | Obtiene o establece el tamaño del registro |
| [SourceBitmap](../../aspose.imaging.fileformats.emf.emf.records/emfbitblt/sourcebitmap) { get; set; } | Obtiene o establece un búfer que contiene el mapa de bits de origen, que no es necesario que sea contiguo a la parte fija del registro EMR_BITBLT. En consecuencia, los campos en este búfer que están etiquetados como "UndefinedSpace" son opcionales y DEBEN ignorarse. |
| [Type](../../aspose.imaging.fileformats.emf.emf.records/emfrecord/type) { get; set; } | Obtiene o establece el tipo. |
| [UsageSrc](../../aspose.imaging.fileformats.emf.emf.records/emfbitblt/usagesrc) { get; set; } | Obtiene o establece un entero sin signo de 32 bits que especifica cómo interpretar los valores en la tabla de colores en el encabezado del mapa de bits de origen. Este valor DEBE estar en la enumeración DIBColors (sección 2.1.9). |
| [XDest](../../aspose.imaging.fileformats.emf.emf.records/emfbitblt/xdest) { get; set; } | Obtiene o establece un entero de 32 bits con signo que especifica la coordenada x lógica de la esquina superior izquierda del rectángulo de destino. |
| [XformSrc](../../aspose.imaging.fileformats.emf.emf.records/emfbitblt/xformsrc) { get; set; } | Obtiene o establece un objeto XForm (sección 2.2.28) que especifica una transformación de espacio mundial a espacio de página para aplicar al mapa de bits de origen. |
| [XSrc](../../aspose.imaging.fileformats.emf.emf.records/emfbitblt/xsrc) { get; set; } | Obtiene o establece un entero de 32 bits con signo que especifica la coordenada x lógica de la esquina superior izquierda del rectángulo de origen. |
| [YDest](../../aspose.imaging.fileformats.emf.emf.records/emfbitblt/ydest) { get; set; } | Obtiene o establece un entero de 32 bits con signo que especifica la coordenada y lógica de la esquina superior izquierda del rectángulo de destino. |
| [YSrc](../../aspose.imaging.fileformats.emf.emf.records/emfbitblt/ysrc) { get; set; } | Obtiene o establece un entero de 32 bits con signo que especifica la coordenada y lógica de la esquina superior izquierda del rectángulo de origen. |

### Ver también

* class [EmfBitmapRecordType](../emfbitmaprecordtype)
* espacio de nombres [Aspose.Imaging.FileFormats.Emf.Emf.Records](../../aspose.imaging.fileformats.emf.emf.records)
* asamblea [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
