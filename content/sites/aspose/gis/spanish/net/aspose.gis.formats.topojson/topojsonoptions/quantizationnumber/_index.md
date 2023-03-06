---
title: TopoJsonOptions.QuantizationNumber
second_title: Referencia de API de Aspose.GIS para .NET
description: TopoJsonOptions propiedad. Especifica el número de cuantificación que se usará para cuantificar las coordenadas y los arcos de codificación delta en la salida TopoJSON.
type: docs
weight: 50
url: /es/net/aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/
---
## TopoJsonOptions.QuantizationNumber property

Especifica el número de cuantificación que se usará para cuantificar las coordenadas y los arcos de codificación delta en la salida TopoJSON.

```csharp
public int? QuantizationNumber { get; set; }
```

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentOutOfRangeException | El argumento es menor que dos. |

### Observaciones

Esta es una opción de escritura, no afecta la lectura. Esta opción es mutuamente excluyente con[`Transform`](../transform/) - solo una de estas dos opciones puede ser no`null` . Si esto no es`null` - Las coordenadas TopoJSON de salida se cuantifican y los arcos se codifican en delta con el número de cuantificación especificado . El número de cuantificación determina el número máximo de valores expresables por dimensión en las coordenadas cuantificadas resultantes; normalmente se elige una potencia de diez. El valor predeterminado es`null` .

### Ver también

* class [TopoJsonOptions](../)
* espacio de nombres [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* asamblea [Aspose.GIS](../../../)


