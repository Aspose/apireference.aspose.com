---
title: Dataset.OpenLayerAt
second_title: Referencia de API de Aspose.GIS para .NET
description: Dataset método. Abre la capa en el índice especificado para lectura.
type: docs
weight: 120
url: /es/net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

Abre la capa en el índice especificado para lectura.

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| index | Int32 | Índice de la capa a abrir. |
| options | DriverOptions | Opciones abiertas. |

### Valor_devuelto

La capa se abrió para lectura.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este conjunto de datos. |
| ArgumentOutOfRangeException | El índice está fuera de rango |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este conjunto de datos. |
| [GisException](../../gisexception/) | Error al leer la entidad de la capa. |
| IOException | Se produjo un error de E/S. |

### Ver también

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* espacio de nombres [Aspose.Gis](../../dataset/)
* asamblea [Aspose.GIS](../../../)


