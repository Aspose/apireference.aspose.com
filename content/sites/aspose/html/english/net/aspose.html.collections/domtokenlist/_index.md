---
title: DOMTokenList Class
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Collections.DOMTokenList class. The DOMTokenList class represents a set of space-separated tokens. It is indexed beginning with 0 as with JavaScript Array objects. DOMTokenList is always case-sensitive
type: docs
weight: 180
url: /net/aspose.html.collections/domtokenlist/
---
## DOMTokenList class

The DOMTokenList class represents a set of space-separated tokens. It is indexed beginning with 0 as with JavaScript Array objects. DOMTokenList is always case-sensitive.

```csharp
public class DOMTokenList : DOMObject, IEnumerable<string>
```

## Properties

| Name | Description |
| --- | --- |
| [Item](../../aspose.html.collections/domtokenlist/item/) { get; } | Returns the item in the list by its index, or null if index is greater than or equal to the list's length. |
| [Length](../../aspose.html.collections/domtokenlist/length/) { get; } | Returns an ulong which represents the number of tokens stored in this list. |
| [Value](../../aspose.html.collections/domtokenlist/value/) { get; set; } | Gets or sets the value of a corresponding attribute. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.html.collections/domtokenlist/add/)(*params string[]*) | Adds the specified token(s) to the list. |
| [Contains](../../aspose.html.collections/domtokenlist/contains/)(*string*) | Returns true if the list contains the given token, otherwise false. |
| [GetEnumerator](../../aspose.html.collections/domtokenlist/getenumerator/)() | Returns an enumerator that iterates through the collection. |
| virtual [GetPlatformType](../../aspose.html.dom/domobject/getplatformtype/)() | This method is used to retrieve the ECMAScript object Type. |
| [Remove](../../aspose.html.collections/domtokenlist/remove/)(*params string[]*) | Removes the specified token(s) from the list. |
| [Replace](../../aspose.html.collections/domtokenlist/replace/)(*string, string*) | Replaces an existing token with a new token. Does nothing if the first token doesn't exist. |
| [Supports](../../aspose.html.collections/domtokenlist/supports/)(*string*) | Returns true if a given token is in the associated attribute's supported tokens. |
| [Toggle](../../aspose.html.collections/domtokenlist/toggle/#toggle)(*string*) | Removes the token from the list if it exists, or adds the token to the list if it doesn't. |
| [Toggle](../../aspose.html.collections/domtokenlist/toggle/#toggle_1)(*string, bool*) | Removes the token from the list if it exists, or adds the token to the list if it doesn't. |

### See Also

* class [DOMObject](../../aspose.html.dom/domobject/)
* namespace [Aspose.Html.Collections](../../aspose.html.collections/)
* assembly [Aspose.HTML](../../)
