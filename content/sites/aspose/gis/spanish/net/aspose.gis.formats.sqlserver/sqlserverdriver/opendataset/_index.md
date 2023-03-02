---
title: SqlServerDriver.OpenDataset
second_title: Referencia de API de Aspose.GIS para .NET
description: SqlServerDriver método. Abre el conjunto de datos.
type: docs
weight: 10
url: /es/net/aspose.gis.formats.sqlserver/sqlserverdriver/opendataset/
---
## SqlServerDriver.OpenDataset method

Abre el conjunto de datos.

```csharp
public override Dataset OpenDataset(IDbConnection connection)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| connection | IDbConnection | Conexión abierta a la base de datos. |

### Valor_devuelto

una instancia de[`Dataset`](../../../aspose.gis/dataset/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | la conexión es`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Error al leer el conjunto de datos. |
| IOException | Se produjo un error de E/S. |

### Ver también

* class [Dataset](../../../aspose.gis/dataset/)
* class [SqlServerDriver](../)
* espacio de nombres [Aspose.Gis.Formats.SqlServer](../../sqlserverdriver/)
* asamblea [Aspose.GIS](../../../)


