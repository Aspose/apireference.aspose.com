---
title: Class XmpPacketWrapper
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.Xmp.XmpPacketWrapper class. Contains serialized xmp package including header and trailer
type: docs
weight: 37160
url: /net/aspose.cad.xmp/xmppacketwrapper/
---
## XmpPacketWrapper class

Contains serialized xmp package including header and trailer.

```csharp
public class XmpPacketWrapper
```

## Constructors

| Name | Description |
| --- | --- |
| [XmpPacketWrapper](xmppacketwrapper/#constructor)() | Initializes a new instance of the `XmpPacketWrapper` class. |
| [XmpPacketWrapper](xmppacketwrapper/#constructor_1)(XmpHeaderPi, XmpTrailerPi, XmpMeta) | Initializes a new instance of the `XmpPacketWrapper` class. |

## Properties

| Name | Description |
| --- | --- |
| [HeaderPi](../../aspose.cad.xmp/xmppacketwrapper/headerpi/) { get; } | Gets the header processing instruction. |
| [Meta](../../aspose.cad.xmp/xmppacketwrapper/meta/) { get; set; } | Gets the XMP meta. Optional. |
| [Packages](../../aspose.cad.xmp/xmppacketwrapper/packages/) { get; } | Gets array of [`XmpPackage`](../xmppackage/) inside XMP. |
| [PackagesCount](../../aspose.cad.xmp/xmppacketwrapper/packagescount/) { get; } | Gets amount of packages inside XMP structure. |
| [TrailerPi](../../aspose.cad.xmp/xmppacketwrapper/trailerpi/) { get; } | Gets the trailer processing instruction. |

## Methods

| Name | Description |
| --- | --- |
| [AddPackage](../../aspose.cad.xmp/xmppacketwrapper/addpackage/)(XmpPackage) | Adds the package. |
| [ClearPackages](../../aspose.cad.xmp/xmppacketwrapper/clearpackages/)() | Removes all [`XmpPackage`](../xmppackage/) inside XMP. |
| [ContainsPackage](../../aspose.cad.xmp/xmppacketwrapper/containspackage/)(string) | Determines whethere package is exist in xmp wrapper. |
| [GetPackage](../../aspose.cad.xmp/xmppacketwrapper/getpackage/)(string) | Gets package by namespace URI. |
| [RemovePackage](../../aspose.cad.xmp/xmppacketwrapper/removepackage/)(XmpPackage) | Removes the XMP package. |

## Remarks

A wrapper consisting of a pair of XML processing instructions (PIs) may be placed around the rdf:RDF element.

### See Also

* namespace [Aspose.CAD.Xmp](../../aspose.cad.xmp/)
* assembly [Aspose.CAD](../../)


