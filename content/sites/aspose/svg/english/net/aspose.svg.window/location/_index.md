---
title: Location Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Window.Location class. Location objects provide a representation of the address of the active document of their Documents browsing context and allow the current entry of the browsing contexts session history to be changed by adding or replacing entries in the history object
type: docs
weight: 3840
url: /net/aspose.svg.window/location/
---
## Location class

Location objects provide a representation of the address of the active document of their Document's browsing context, and allow the current entry of the browsing context's session history to be changed, by adding or replacing entries in the history object.

```csharp
public sealed class Location : Url
```

## Properties

| Name | Description |
| --- | --- |
| [Hash](../../aspose.svg/url/hash/) { get; set; } | Gets or sets a string representation for the specified URL hash segment. |
| [Host](../../aspose.svg/url/host/) { get; set; } | Gets or sets a string representation for the specified URL host. |
| [Hostname](../../aspose.svg/url/hostname/) { get; set; } | Gets or sets a string representation for the specified URL hostname. |
| [Href](../../aspose.svg/url/href/) { get; set; } | Gets or sets a serialized representation for the specified URL instance. |
| [Origin](../../aspose.svg/url/origin/) { get; } | Gets a string representation for the specified URL origin. |
| [Password](../../aspose.svg/url/password/) { get; set; } | Gets or sets a string representation for the specified URL password. |
| [Pathname](../../aspose.svg/url/pathname/) { get; set; } | Gets or sets a string representation for the specified URL path. |
| [Port](../../aspose.svg/url/port/) { get; set; } | Gets or sets a string representation for the specified URL port. |
| [Protocol](../../aspose.svg/url/protocol/) { get; set; } | Gets or sets a string representation for the specified URL schema. |
| [Search](../../aspose.svg/url/search/) { get; set; } | Gets or sets a string representation for the specified URL search segment. |
| [SearchParams](../../aspose.svg/url/searchparams/) { get; } | Gets an associated [`IUrlSearchParams`](../../aspose.svg/iurlsearchparams/) object. |
| [Username](../../aspose.svg/url/username/) { get; set; } | Gets or sets a string representation for the specified URL username. |

## Methods

| Name | Description |
| --- | --- |
| [Assign](../../aspose.svg.window/location/assign/)(string) | Navigates to the given page. |
| override [Equals](../../aspose.svg/url/equals/)(object) | Determines whether the specified Object, is equal to this instance. |
| override [GetHashCode](../../aspose.svg/url/gethashcode/)() | Returns a hash code for this instance. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |
| [Reload](../../aspose.svg.window/location/reload/)() | Reloads the current page. |
| [Replace](../../aspose.svg.window/location/replace/)(string) | Removes the current page from the session history and navigates to the given page. |
| [ToJson](../../aspose.svg/url/tojson/)() | Returns a String that represents this instance. |
| override [ToString](../../aspose.svg/url/tostring/)() | Returns a String that represents this instance. |

### See Also

* class [Url](../../aspose.svg/url/)
* namespace [Aspose.Svg.Window](../../aspose.svg.window/)
* assembly [Aspose.SVG](../../)
