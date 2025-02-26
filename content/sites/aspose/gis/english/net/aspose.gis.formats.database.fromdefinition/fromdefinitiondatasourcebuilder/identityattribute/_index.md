---
title: FromDefinitionDataSourceBuilder.IdentityAttribute
second_title: Aspose.GIS for .NET API Reference
description: FromDefinitionDataSourceBuilder method. Mandatory setting that allows tracking changes
type: docs
weight: 40
url: /net/aspose.gis.formats.database.fromdefinition/fromdefinitiondatasourcebuilder/identityattribute/
---
## FromDefinitionDataSourceBuilder.IdentityAttribute method

Mandatory setting that allows tracking changes.

```csharp
public FromDefinitionDataSourceBuilder IdentityAttribute(string name, bool overwriteSameKey = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | An attribute of a feature that will be treated as uniquely identifying the feature. |
| overwriteSameKey | Boolean | If this flag is set to true, then newly added features with a unique identifier the same that is already present in the layer, the current one will be overwritten, and the data will be read as updated if differences are found. Otherwise, an exception will be thrown. |

### Return Value

[`FromDefinitionDataSourceBuilder`](../)

### See Also

* class [FromDefinitionDataSourceBuilder](../)
* namespace [Aspose.Gis.Formats.Database.FromDefinition](../../fromdefinitiondatasourcebuilder/)
* assembly [Aspose.GIS](../../../)


