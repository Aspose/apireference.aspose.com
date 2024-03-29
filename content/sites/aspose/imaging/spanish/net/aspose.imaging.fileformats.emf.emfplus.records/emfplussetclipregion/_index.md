---
title: EmfPlusSetClipRegion
second_title: Aspose.Imaging para la referencia de la API de .NET
description: El registro EmfPlusSetClipRegion combina la región de recorte actual con otra región gráfica. La nueva región de recorte actual se establece como el resultado de realizar la operación CombineMode en la región de recorte actual anterior y el objeto EmfPlusRegion especificado.
type: docs
weight: 6310
url: /es/net/aspose.imaging.fileformats.emf.emfplus.records/emfplussetclipregion/
---
## EmfPlusSetClipRegion class

El registro EmfPlusSetClipRegion combina la región de recorte actual con otra región gráfica. La nueva región de recorte actual se establece como el resultado de realizar la operación CombineMode en la región de recorte actual anterior y el objeto EmfPlusRegion especificado.

```csharp
public sealed class EmfPlusSetClipRegion : EmfPlusClippingRecordType
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [EmfPlusSetClipRegion](emfplussetclipregion)(EmfPlusRecord) | Inicializa una nueva instancia del[`EmfPlusSetClipRegion`](../emfplussetclipregion) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Cm](../../aspose.imaging.fileformats.emf.emfplus.records/emfplussetclipregion/cm) { get; set; } | Obtiene o establece el CM (4 bits): especifica la operación lógica para combinar dos regiones. Consulte la enumeración CombineMode (sección 2.1.1.4) para conocer los significados de los valores. |
| virtual [DataSize](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/datasize) { get; set; } | Obtiene o establece un entero sin signo de 32 bits que DEBE definir el número alineado de 32 bits de bytes de datos en el campo RecordData que sigue. Este número no incluye el encabezado del registro de 12 bytes. |
| virtual [Flags](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/flags) { get; set; } | Obtiene o establece un entero sin signo de 16 bits que contiene información para algunos registros sobre cómo se realizará la operación y sobre la estructura del registro. |
| [ObjectId](../../aspose.imaging.fileformats.emf.emfplus.records/emfplussetclipregion/objectid) { get; set; } | Obtiene o establece el índice de un objeto EmfPlusRegion (sección 2.2.1.8) en la tabla de objetos EMF+ . El valor DEBE ser de cero a 63, inclusive. |
| virtual [Size](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/size) { get; set; } | Obtiene o establece un entero sin signo de 32 bits que especifica el número alineado de 32 bits de bytes en todo el registro, incluido el encabezado del registro de 12 bytes y los datos específicos del registro. |
| [Type](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/type) { get; } | Obtiene un entero de 16 bits sin signo que identifica el tipo de registro. |

### Ver también

* class [EmfPlusClippingRecordType](../emfplusclippingrecordtype)
* espacio de nombres [Aspose.Imaging.FileFormats.Emf.EmfPlus.Records](../../aspose.imaging.fileformats.emf.emfplus.records)
* asamblea [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
