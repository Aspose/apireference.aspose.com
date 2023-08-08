---
title: VectorMapLayer.ImportSldFromString
second_title: Aspose.GIS for .NET API Reference
description: VectorMapLayer method. Imports style from the specified Styled Layer Descriptor string
type: docs
weight: 70
url: /net/aspose.gis.rendering/vectormaplayer/importsldfromstring/
---
## VectorMapLayer.ImportSldFromString method

Imports style from the specified Styled Layer Descriptor string.

```csharp
public void ImportSldFromString(string sld, SldImportOptions options = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sld | String | Styled Layer Descriptor. |
| options | SldImportOptions | Import options. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| XmlException | An error occurred while parsing the XML. |
| FormatException | No SLD style was found in the XML. |

## Remarks

This method overwrites value of the [`Symbolizer`](../symbolizer/) property.

### See Also

* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* namespace [Aspose.Gis.Rendering](../../vectormaplayer/)
* assembly [Aspose.GIS](../../../)


