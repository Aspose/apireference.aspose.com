---
title: ComponentTransferType Enum
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.ComponentTransferType enum. Specifies the type of component transfer function to be applied in the FeComponentTransfer filter primitive of an SVG
type: docs
weight: 140
url: /net/aspose.svg.builder/componenttransfertype/
---
## ComponentTransferType enumeration

Specifies the type of component transfer function to be applied in the FeComponentTransfer filter primitive of an SVG.

```csharp
public enum ComponentTransferType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Identity | `0` | Represents no change in the input graphic. This is the default type. |
| Table | `1` | Uses a lookup table to define the function within the filter. |
| Discrete | `2` | Uses a set of discrete values to define the function in the filter. |
| Linear | `3` | Defines a linear transformation of the component within the filter. |
| Gamma | `4` | Defines a gamma correction transformation in the filter. |

## Remarks

The FeComponentTransfer filter primitive allows for individual manipulation of color components (RGB and alpha) of graphics elements using different types of transfer functions. Each type defines a distinct method of computation for color component transformation within the filter.

### See Also

* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
