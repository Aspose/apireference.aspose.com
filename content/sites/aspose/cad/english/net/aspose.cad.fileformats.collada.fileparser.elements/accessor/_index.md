---
title: Class Accessor
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Collada.FileParser.Elements.Accessor class. The accessor. The accessor element declares an access pattern to one of the array elements FLOAT_ARRAY INT_ARRAY NAME_ARRAY BOOL_ARRAY TOKEN_ARRAY and IDREF_ARRAY. The accessor element describes access to arrays that are organized in either an interleaved or noninterleaved manner depending on the offset and stride attributes
type: docs
weight: 7070
url: /net/aspose.cad.fileformats.collada.fileparser.elements/accessor/
---
## Accessor class

The accessor. The accessor element declares an access pattern to one of the array elements: FLOAT_ARRAY, INT_ARRAY, NAME_ARRAY, BOOL_ARRAY, TOKEN_ARRAY, and IDREF_ARRAY. The accessor element describes access to arrays that are organized in either an interleaved or non-interleaved manner, depending on the offset and stride attributes.

```csharp
public class Accessor : ColladaElement
```

## Constructors

| Name | Description |
| --- | --- |
| [Accessor](accessor/)() | Initializes a new instance of the `Accessor` class. |

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.cad.fileformats.collada.fileparser.elements/accessor/count/) { get; set; } | Gets or sets the count. The count attribute indicates the number of times the array is accessed. Required attribute. |
| [Offset](../../aspose.cad.fileformats.collada.fileparser.elements/accessor/offset/) { get; set; } | Gets or sets the offset. The offset attribute indicates the index of the first value to be read from the array. The default value is 0. Optional attribute. |
| [Parameter](../../aspose.cad.fileformats.collada.fileparser.elements/accessor/parameter/) { get; set; } | Gets or sets the parameter. The accessor element may have any number of parameter elements. |
| [Source](../../aspose.cad.fileformats.collada.fileparser.elements/accessor/source/) { get; set; } | Gets or sets the source. The source attribute indicates the location of the array to access using a URL expression. Required attribute. |
| [Stride](../../aspose.cad.fileformats.collada.fileparser.elements/accessor/stride/) { get; set; } | Gets or sets the stride. The stride attribute indicates number of values to be considered a unit during each access to the array. The default value is 1, indicating that a single value is accessed. Optional attribute. |

### See Also

* class [ColladaElement](../colladaelement/)
* namespace [Aspose.CAD.FileFormats.Collada.FileParser.Elements](../../aspose.cad.fileformats.collada.fileparser.elements/)
* assembly [Aspose.CAD](../../)


