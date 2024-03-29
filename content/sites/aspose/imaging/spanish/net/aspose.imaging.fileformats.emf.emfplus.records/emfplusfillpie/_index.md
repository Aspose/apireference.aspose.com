---
title: EmfPlusFillPie
second_title: Aspose.Imaging para la referencia de la API de .NET
description: El registro EmfPlusFillPie especifica llenar una sección del interior de una elipse
type: docs
weight: 6090
url: /es/net/aspose.imaging.fileformats.emf.emfplus.records/emfplusfillpie/
---
## EmfPlusFillPie class

El registro EmfPlusFillPie especifica llenar una sección del interior de una elipse

```csharp
public sealed class EmfPlusFillPie : EmfPlusDrawingRecordType
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [EmfPlusFillPie](emfplusfillpie)(EmfPlusRecord) | Inicializa una nueva instancia del[`EmfPlusFillPie`](../emfplusfillpie) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [BrushId](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusfillpie/brushid) { get; set; } | Obtiene o establece el identificador del pincel Un entero de 32 bits sin signo que define el pincel, cuyo contenido está determinado por el bit S en el campo Indicadores. |
| [Compressed](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusfillpie/compressed) { get; set; } | Obtiene o establece un valor que indica si PointData está comprimido. Si se establece, RectData contiene un objeto EmfPlusRect (sección 2.2.2.38). Si está claro, RectData contiene un objeto EmfPlusRectF (sección 2.2.2.39). |
| virtual [DataSize](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/datasize) { get; set; } | Obtiene o establece un entero sin signo de 32 bits que DEBE definir el número alineado de 32 bits de bytes de datos en el campo RecordData que sigue. Este número no incluye el encabezado del registro de 12 bytes. |
| virtual [Flags](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/flags) { get; set; } | Obtiene o establece un entero sin signo de 16 bits que contiene información para algunos registros sobre cómo se realizará la operación y sobre la estructura del registro. |
| [IsColor](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusfillpie/iscolor) { get; set; } | Obtiene o establece un valor que indica si esta instancia es color. Si se establece, BrushId especifica un color como un objeto EmfPlusARGB (sección 2.2.2.1). Si está claro, BrushId contiene el índice de un objeto EmfPlusBrush (sección 2.2.1.1) en la tabla de objetos EMF+. |
| [RectData](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusfillpie/rectdata) { get; set; } | Obtiene o establece el rectángulo datas Un objeto EmfPlusRect o EmfPlusRectF que define el cuadro delimitador de la elipse que contiene la porción circular. Este rectángulo define la posición, el tamaño, y la forma del pastel. El tipo de objeto en este campo se especifica mediante el valor del campo Flags. |
| virtual [Size](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/size) { get; set; } | Obtiene o establece un entero sin signo de 32 bits que especifica el número alineado de 32 bits de bytes en todo el registro, incluido el encabezado del registro de 12 bytes y los datos específicos del registro. |
| [StartAngle](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusfillpie/startangle) { get; set; } | Obtiene o establece el ángulo inicial Un valor de punto flotante no negativo de 32 bits que especifica el ángulo entre el eje x y el punto inicial de la cuña circular. Cualquier valor es aceptable, pero DEBE interpretarse módulo 360, con el resultado que se usa en el rango 0.0 inclusive a 360.0 exclusivo. |
| [SweepAngle](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusfillpie/sweepangle) { get; set; } | Obtiene o establece el ángulo de barrido Un valor de coma flotante de 32 bits que especifica la extensión del arco que define la cuña circular que se va a dibujar, como un ángulo en grados medido desde el punto inicial definido por el valor StartAngle. Cualquier valor es aceptable, pero DEBE fijarse a -360,0 a 360,0 inclusive. Un valor positivo indica que el barrido se define en el sentido de las agujas del reloj, y un valor negativo indica que el barrido se define en el sentido contrario a las agujas del reloj. |
| [Type](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/type) { get; } | Obtiene un entero de 16 bits sin signo que identifica el tipo de registro. |

### Ver también

* class [EmfPlusDrawingRecordType](../emfplusdrawingrecordtype)
* espacio de nombres [Aspose.Imaging.FileFormats.Emf.EmfPlus.Records](../../aspose.imaging.fileformats.emf.emfplus.records)
* asamblea [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
