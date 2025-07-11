---
title: IUrlSearchParams Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.IUrlSearchParams interface. Provides methods to work with URLs query string
type: docs
weight: 4140
url: /net/aspose.svg/iurlsearchparams/
---
## IUrlSearchParams interface

Provides methods to work with URLs query string.

```csharp
public interface IUrlSearchParams : IEnumerable<string[]>
```

## Methods

| Name | Description |
| --- | --- |
| [Append](../../aspose.svg/iurlsearchparams/append/)(*string, string*) | Appends a new name-value pair whose name is `name` and value is `value`. |
| [Delete](../../aspose.svg/iurlsearchparams/delete/)(*string*) | Removes all name-value pairs whose name is `name`. |
| [Get](../../aspose.svg/iurlsearchparams/get/)(*string*) | Returns value of the first name-value pair whose name is `name`. |
| [GetAll](../../aspose.svg/iurlsearchparams/getall/)(*string*) | Returns all values whose name is `name`. |
| [Has](../../aspose.svg/iurlsearchparams/has/)(*string*) | Checks if there is a name-value pair whose name is `name` in list. |
| [Set](../../aspose.svg/iurlsearchparams/set/)(*string, string*) | Sets value of the first found name-value pair to the specified value and removes the others. If no name-value pairs with the specified name are found, new one will be appended to the list. |
| [Sort](../../aspose.svg/iurlsearchparams/sort/)() | Sorts all name-value pairs, if any, by their names. |

### See Also

* namespace [Aspose.Svg](../../aspose.svg/)
* assembly [Aspose.SVG](../../)
