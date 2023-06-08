---
title: Class InputLocalOffset
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Collada.FileParser.Elements.InputLocalOffset class. The input local offset. The input_local_offset_type element is used to represent indexed inputs that can only reference resources declared in the same document
type: docs
weight: 7630
url: /net/aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/
---
## InputLocalOffset class

The input local offset. The input_local_offset_type element is used to represent indexed inputs that can only reference resources declared in the same document.

```csharp
public class InputLocalOffset : ColladaElement
```

## Constructors

| Name | Description |
| --- | --- |
| [InputLocalOffset](inputlocaloffset/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Offset](../../aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/offset/) { get; set; } | Gets or sets the offset. The offset attribute represents the offset into the list of indices. If two input elements share the same offset, they will be indexed the same. This works as a simple form of compression for the list of indices as well as defining the order the inputs should be used in. Required attribute. |
| [Semantic](../../aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/semantic/) { get; set; } | Gets or sets the semantic. The semantic attribute is the user-defined meaning of the input connection. Required attribute. |
| [SetSpecified](../../aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/setspecified/) { get; set; } | Gets or sets a value indicating whether set specified. |
| [SingleSet](../../aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/singleset/) { get; set; } | Gets or sets the single set. The set attribute indicates which inputs should be grouped together as a single set. This is helpful when multiple inputs share the same semantics. |
| [Source](../../aspose.cad.fileformats.collada.fileparser.elements/inputlocaloffset/source/) { get; set; } | Gets or sets the source. The source attribute indicates the location of the data source. Required attribute. |

### See Also

* class [ColladaElement](../colladaelement/)
* namespace [Aspose.CAD.FileFormats.Collada.FileParser.Elements](../../aspose.cad.fileformats.collada.fileparser.elements/)
* assembly [Aspose.CAD](../../)


