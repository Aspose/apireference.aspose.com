---
title: VectorLayer.CopyAttributes
second_title: Aspose.GIS for .NET API Reference
description: VectorLayer method. Copies attributes of other VectorLayer to this one
type: docs
weight: 110
url: /net/aspose.gis/vectorlayer/copyattributes/
---
## CopyAttributes(FeaturesSequence) {#copyattributes}

Copies attributes of other [`VectorLayer`](../) to this one.

```csharp
public void CopyAttributes(FeaturesSequence featuresSequence)
```

| Parameter | Type | Description |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | The features sequence to copy attributes from. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The input layer is `null`. |

### See Also

* class [FeaturesSequence](../../featuressequence/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## CopyAttributes(FeaturesSequence, IAttributesConverter) {#copyattributes_1}

Copies attributes of other [`VectorLayer`](../) to this one.

```csharp
public void CopyAttributes(FeaturesSequence featuresSequence, IAttributesConverter converter)
```

| Parameter | Type | Description |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | The features sequence to copy attributes from. |
| converter | IAttributesConverter | An instance of custom [`IAttributesConverter`](../../iattributesconverter/) that will process the attributes one by one. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The input layer is `null`. |

### See Also

* class [FeaturesSequence](../../featuressequence/)
* interface [IAttributesConverter](../../iattributesconverter/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)


