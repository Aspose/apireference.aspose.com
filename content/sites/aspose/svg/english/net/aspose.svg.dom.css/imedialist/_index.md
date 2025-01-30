---
title: IMediaList Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Dom.Css.IMediaList interface. The MediaList interface provides the abstraction of an ordered collection of media without defining or constraining how this collection is implemented. An empty list is the same as a list that contains the medium all
type: docs
weight: 4200
url: /net/aspose.svg.dom.css/imedialist/
---
## IMediaList interface

The MediaList interface provides the abstraction of an ordered collection of media, without defining or constraining how this collection is implemented. An empty list is the same as a list that contains the medium "all".

```csharp
public interface IMediaList : IEnumerable<string>
```

## Properties

| Name | Description |
| --- | --- |
| [Item](../../aspose.svg.dom.css/imedialist/item/) { get; } | Returns the indexth in the list. If index is greater than or equal to the number of media in the list, this returns null. The media index. |
| [Length](../../aspose.svg.dom.css/imedialist/length/) { get; } | The number of media in the list. The range of valid media is 0 to length-1 inclusive. |
| [MediaText](../../aspose.svg.dom.css/imedialist/mediatext/) { get; } | The parsable textual representation of the media list. This is a comma-separated list of media. |

## Methods

| Name | Description |
| --- | --- |
| [AppendMedium](../../aspose.svg.dom.css/imedialist/appendmedium/)(string) | Adds the medium newMedium to the end of the list. If the newMedium is already used, it is first removed. |
| [DeleteMedium](../../aspose.svg.dom.css/imedialist/deletemedium/)(string) | Deletes the medium indicated by oldMedium from the list. |

### See Also

* namespace [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* assembly [Aspose.SVG](../../)
