---
title: AbstractPath.Combine
second_title: Aspose.GIS for .NET API Reference
description: AbstractPath method. Combines this AbstractPath with specified path components
type: docs
weight: 50
url: /net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

Combines this [`AbstractPath`](../) with specified path components.

```csharp
public virtual AbstractPath Combine(string location)
```

| Parameter | Type | Description |
| --- | --- | --- |
| location | String | A path component to append to this [`AbstractPath`](../). |

### Return Value

A new [`AbstractPath`](../) pointing to a [`Location`](../location/) that is a combination of locations of this [`AbstractPath`](../) and the argument.

## Remarks

Usually this method should not be overridden by an inheritor. The default implementation concatenates this [`Location`](../location/) with the argument and calls the [`WithLocation`](../withlocation/) method with the concatenated string as an argument. The combination result is defined in the following way: If the argument starts with the [`Separator`](../separator/), the combination result equals to the argument;Otherwise, if [`Location`](../location/) ends with the [`Separator`](../separator/), the combination result equals to ` + `;Otherwise, the result is equal to ` + + `

### See Also

* class [AbstractPath](../)
* namespace [Aspose.Gis](../../abstractpath/)
* assembly [Aspose.GIS](../../../)


