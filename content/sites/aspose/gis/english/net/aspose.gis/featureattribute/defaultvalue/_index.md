---
title: FeatureAttribute.DefaultValue
second_title: Aspose.GIS for .NET API Reference
description: FeatureAttribute property. Gets or sets a value for the attribute that indicates missing data.
type: docs
weight: 50
url: /net/aspose.gis/featureattribute/defaultvalue/
---
## FeatureAttribute.DefaultValue property

Gets or sets a value for the attribute, that indicates missing data.

```csharp
public object DefaultValue { get; set; }
```

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The attribute is locked. |
| InvalidOperationException | The attribute does not allow `null` values. |

### Remarks

This is the value representing a missing piece of information, when an attribute does not allow the `null` value. For attributes that do allow `null` values ([`CanBeNull`](../canbenull/) == `true`), `DefaultValue` is `null` unless explicitly changed.

### See Also

* class [FeatureAttribute](../)
* namespace [Aspose.Gis](../../featureattribute/)
* assembly [Aspose.GIS](../../../)


