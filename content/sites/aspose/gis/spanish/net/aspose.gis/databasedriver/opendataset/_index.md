---
title: DatabaseDriver.OpenDataset
second_title: Referencia de API de Aspose.GIS para .NET
description: DatabaseDriver método. Abre el conjunto de datos.
type: docs
weight: 10
url: /es/net/aspose.gis/databasedriver/opendataset/
---
## DatabaseDriver.OpenDataset method

Abre el conjunto de datos.

```csharp
public abstract Dataset OpenDataset(IDbConnection connection)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| connection | IDbConnection | Conexión abierta a la base de datos. |

### Valor_devuelto

una instancia de[`Dataset`](../../dataset/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | la conexión es`null`. |
| [GisException](../../gisexception/) | Error al leer el conjunto de datos. |
| IOException | Se produjo un error de E/S. |

### Ver también

* class [Dataset](../../dataset/)
* class [DatabaseDriver](../)
* espacio de nombres [Aspose.Gis](../../databasedriver/)
* asamblea [Aspose.GIS](../../../)


