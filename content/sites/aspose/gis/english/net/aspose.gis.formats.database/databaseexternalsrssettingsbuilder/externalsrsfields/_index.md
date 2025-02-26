---
title: DatabaseExternalSrsSettingsBuilder.ExternalSrsFields
second_title: Aspose.GIS for .NET API Reference
description: DatabaseExternalSrsSettingsBuilder method. Specifies special field names from which to read information about additionally requested spatial reference systems
type: docs
weight: 20
url: /net/aspose.gis.formats.database/databaseexternalsrssettingsbuilder/externalsrsfields/
---
## DatabaseExternalSrsSettingsBuilder.ExternalSrsFields method

Specifies special field names from which to read information about additionally requested spatial reference systems.

```csharp
public DatabaseExternalSrsSettingsBuilder ExternalSrsFields(string authSridField, 
    string srTextField)
```

| Parameter | Type | Description |
| --- | --- | --- |
| authSridField | String | Field for reading spatial reference id, default: auth_srid. |
| srTextField | String | Field for reading the spatial coordinate system represented by WKT, default: srtext. |

### Return Value

[`DatabaseExternalSrsSettingsBuilder`](../)

## Remarks

No need to set if your fields have default names auth_srid and srtext.

### See Also

* class [DatabaseExternalSrsSettingsBuilder](../)
* namespace [Aspose.Gis.Formats.Database](../../databaseexternalsrssettingsbuilder/)
* assembly [Aspose.GIS](../../../)


