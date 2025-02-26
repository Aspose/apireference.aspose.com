---
title: IDatabaseDataSource.ReadAsync
second_title: Aspose.GIS for .NET API Reference
description: IDatabaseDataSource method. Method for reading geospatial data
type: docs
weight: 10
url: /net/aspose.gis.formats.database/idatabasedatasource/readasync/
---
## ReadAsync(DbConnection, IDictionary&lt;string, object&gt;) {#readasync}

Method for reading geospatial data.

```csharp
public Task<VectorLayer> ReadAsync(DbConnection connection, 
    IDictionary<string, object> sqlParametrs = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| connection | DbConnection | Connection object. |
| sqlParametrs | IDictionary`2 | Set of SQL parameters |

### Return Value

Returns a single instance of InMemoryLayer wrapped in ReadVectorWrapper to perform additional geometry transformations on demand.

## Remarks

The connection must be configured and in open status.

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* interface [IDatabaseDataSource](../)
* namespace [Aspose.Gis.Formats.Database](../../idatabasedatasource/)
* assembly [Aspose.GIS](../../../)

---

## ReadAsync(DbConnection, DbTransaction, IDictionary&lt;string, object&gt;) {#readasync_1}

Method for reading geospatial data within a transaction..

```csharp
public Task<VectorLayer> ReadAsync(DbConnection connection, DbTransaction transaction, 
    IDictionary<string, object> sqlParametrs = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| connection | DbConnection | Connection object. |
| transaction | DbTransaction | Current transaction. |
| sqlParametrs | IDictionary`2 | Set of SQL parameters |

### Return Value

Returns a single instance of InMemoryLayer wrapped in ReadVectorWrapper to perform additional geometry transformations on demand.

## Remarks

The connection must be configured and in open status.

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* interface [IDatabaseDataSource](../)
* namespace [Aspose.Gis.Formats.Database](../../idatabasedatasource/)
* assembly [Aspose.GIS](../../../)


