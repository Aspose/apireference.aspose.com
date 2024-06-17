---
title: MultipartContent Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Net.MultipartContent class. Represents a multipart/ content
type: docs
weight: 4590
url: /net/aspose.svg.net/multipartcontent/
---
## MultipartContent class

Represents a multipart/* content.

```csharp
public class MultipartContent : Content, IEnumerable<Content>
```

## Constructors

| Name | Description |
| --- | --- |
| [MultipartContent](multipartcontent/#constructor)() | Create a new instance of the `MultipartContent` class. |
| [MultipartContent](multipartcontent/#constructor_1)(string) | Create a new instance of the `MultipartContent` class with subtype. |
| [MultipartContent](multipartcontent/#constructor_2)(string, string) | Create a new instance of the `MultipartContent` class with subtype and boundary. |

## Properties

| Name | Description |
| --- | --- |
| [Headers](../../aspose.svg.net/content/headers/) { get; } | Gets the HTTP content headers. |

## Methods

| Name | Description |
| --- | --- |
| virtual [Add](../../aspose.svg.net/multipartcontent/add/)(Content) | Add a new content to the `MultipartContent` |
| [Dispose](../../aspose.svg.net/content/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| [GetEnumerator](../../aspose.svg.net/multipartcontent/getenumerator/)() | Returns an enumerator that iterates through a collection. |
| [ReadAsByteArray](../../aspose.svg.net/content/readasbytearray/)() | Serialize the HTTP content and return a byte array that represents the content. |
| [ReadAsStream](../../aspose.svg.net/content/readasstream/)() | Serialize the HTTP content and return a stream that represents the content. |
| [ReadAsString](../../aspose.svg.net/content/readasstring/)() | Serialize the HTTP content and return a string that represents the content. |

### See Also

* class [Content](../content/)
* namespace [Aspose.Svg.Net](../../aspose.svg.net/)
* assembly [Aspose.SVG](../../)
