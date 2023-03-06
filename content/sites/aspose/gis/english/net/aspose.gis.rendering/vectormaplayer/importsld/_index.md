---
title: VectorMapLayer.ImportSld
second_title: Aspose.GIS for .NET API Reference
description: VectorMapLayer method. Imports style from Styled Layer Descriptor file located at the specified path.
type: docs
weight: 60
url: /net/aspose.gis.rendering/vectormaplayer/importsld/
---
## ImportSld(string, SldImportOptions) {#importsld_1}

Imports style from Styled Layer Descriptor file located at the specified path.

```csharp
public void ImportSld(string path, SldImportOptions options = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the Styled Layer Descriptor file. |
| options | SldImportOptions | Import options. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| XmlException | An error occurred while parsing the XML. |
| FormatException | No SLD style was found in the XML. |

### Remarks

This method overwrites value of the [`Symbolizer`](../symbolizer/) property.

### See Also

* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* namespace [Aspose.Gis.Rendering](../../vectormaplayer/)
* assembly [Aspose.GIS](../../../)

---

## ImportSld(AbstractPath, SldImportOptions) {#importsld}

Imports style from Styled Layer Descriptor file located at the specified path.

```csharp
public void ImportSld(AbstractPath path, SldImportOptions options = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the Styled Layer Descriptor file. |
| options | SldImportOptions | Import options. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| XmlException | An error occurred while parsing the XML. |
| FormatException | No SLD style was found in the XML. |

### Remarks

This method overwrites value of the [`Symbolizer`](../symbolizer/) property.

### See Also

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* namespace [Aspose.Gis.Rendering](../../vectormaplayer/)
* assembly [Aspose.GIS](../../../)


