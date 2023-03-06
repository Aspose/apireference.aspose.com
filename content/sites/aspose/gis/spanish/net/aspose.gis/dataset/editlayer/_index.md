---
title: Dataset.EditLayer
second_title: Referencia de API de Aspose.GIS para .NET
description: Dataset método. Abre la capa con el nombre especificado para editar.
type: docs
weight: 90
url: /es/net/aspose.gis/dataset/editlayer/
---
## Dataset.EditLayer method

Abre la capa con el nombre especificado para editar.

```csharp
public abstract VectorLayer EditLayer(string name, DriverOptions options = null, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| name | String | Nombre de la capa a editar. |
| options | DriverOptions | Opciones abiertas. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema de referencia espacial para nuevas geometrías. |

### Valor_devuelto

La capa se abrió para editar.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentException | La capa con el nombre especificado no existe; El objeto de opciones tiene un tipo incorrecto para este conjunto de datos. |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este conjunto de datos. |
| ArgumentNullException | El nombre es`null`. |
| [GisException](../../gisexception/) | Error al leer la entidad de la capa. |
| IOException | Se produjo un error de E/S. |

### Ver también

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* espacio de nombres [Aspose.Gis](../../dataset/)
* asamblea [Aspose.GIS](../../../)


