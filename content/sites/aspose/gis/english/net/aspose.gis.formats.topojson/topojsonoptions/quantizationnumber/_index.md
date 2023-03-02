---
title: TopoJsonOptions.QuantizationNumber
second_title: Aspose.GIS for .NET API Reference
description: TopoJsonOptions property. Specifies quantization number to use to quantize coordinates and deltaencode arcs in output TopoJSON.
type: docs
weight: 50
url: /net/aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/
---
## TopoJsonOptions.QuantizationNumber property

Specifies quantization number to use to quantize coordinates and delta-encode arcs in output TopoJSON.

```csharp
public int? QuantizationNumber { get; set; }
```

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | Argument is less than two. |

### Remarks

This is writing option - it does not affect reading. This option is mutually exclusive with [`Transform`](../transform/) - only one of this two options can be not `null`. If this is not `null` - output TopoJSON coordinates are quantized and arcs are delta-encoded with the specified quantization number. Quantization number determines the maximum number of expressible values per dimension in the resulting quantized coordinates; typically a power of ten is chosen. Defaults to `null`.

### See Also

* class [TopoJsonOptions](../)
* namespace [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* assembly [Aspose.GIS](../../../)


