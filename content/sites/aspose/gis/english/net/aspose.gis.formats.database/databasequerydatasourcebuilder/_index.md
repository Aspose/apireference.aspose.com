---
title: Class DatabaseQueryDataSourceBuilder
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Formats.Database.DatabaseQueryDataSourceBuilder class. Provides the ability to configure a query to database to to extract geospatial information
type: docs
weight: 1750
url: /net/aspose.gis.formats.database/databasequerydatasourcebuilder/
---
## DatabaseQueryDataSourceBuilder class

Provides the ability to configure a query to database to to extract geospatial information.

```csharp
public class DatabaseQueryDataSourceBuilder
```

## Methods

| Name | Description |
| --- | --- |
| [AddAttribute](../../aspose.gis.formats.database/databasequerydatasourcebuilder/addattribute/#addattribute)(string, AttributeDataType) | Configures the name of the field that will contain information for the feature attribute. |
| [AddAttribute](../../aspose.gis.formats.database/databasequerydatasourcebuilder/addattribute/#addattribute_1)(string, AttributeDataType, DbType) | Configures the name of the field that will contain information for the feature attribute. |
| [AsTrackableForChanges](../../aspose.gis.formats.database/databasequerydatasourcebuilder/astrackableforchanges/)(string, string, bool, string) | Configure the resulting layer to track changes and create a data source to synchronize the changes made. |
| [Build](../../aspose.gis.formats.database/databasequerydatasourcebuilder/build/)() | The method retrieves an implementation of the [`IDatabaseDataSource`](../idatabasedatasource/) |
| [GeometryField](../../aspose.gis.formats.database/databasequerydatasourcebuilder/geometryfield/)(string) | Configures the name of the field from which the geometry will be extracted. |
| [SridField](../../aspose.gis.formats.database/databasequerydatasourcebuilder/sridfield/)(string) | Configuring the name of the query field that will contain the spatial reference system identifier (srid). |
| [UseExternalSrsFromQuery](../../aspose.gis.formats.database/databasequerydatasourcebuilder/useexternalsrsfromquery/)(string) | Allows you to configure the data source to use third-party spatial reference system data, bypassing the pre-installed data in the Aspose.GIS library. |

### See Also

* namespace [Aspose.Gis.Formats.Database](../../aspose.gis.formats.database/)
* assembly [Aspose.GIS](../../)


