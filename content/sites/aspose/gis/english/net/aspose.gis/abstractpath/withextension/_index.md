---
title: AbstractPath.WithExtension
second_title: Aspose.GIS for .NET API Reference
description: AbstractPath method. Returns a new AbstractPath with the file extension changed to the specified value.
type: docs
weight: 130
url: /net/aspose.gis/abstractpath/withextension/
---
## AbstractPath.WithExtension method

Returns a new [`AbstractPath`](../) with the file extension changed to the specified value.

```csharp
public virtual AbstractPath WithExtension(string newExtension)
```

| Parameter | Type | Description |
| --- | --- | --- |
| newExtension | String | A new extension. |

### Return Value

A new [`AbstractPath`](../), that points to a file in the same directory, but with a new extension.

### Remarks

Usually, an inheritor should not override this method. The default implementation substitutes the extension and calls [`WithLocation`](../withlocation/).

### See Also

* class [AbstractPath](../)
* namespace [Aspose.Gis](../../abstractpath/)
* assembly [Aspose.GIS](../../../)


