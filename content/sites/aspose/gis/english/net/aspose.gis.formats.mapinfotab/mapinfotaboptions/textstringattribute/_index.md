---
title: MapInfoTabOptions.TextStringAttribute
second_title: Aspose.GIS for .NET API Reference
description: MapInfoTabOptions property. Specifies name of the attribute that represents text of Text graphical object
type: docs
weight: 40
url: /net/aspose.gis.formats.mapinfotab/mapinfotaboptions/textstringattribute/
---
## MapInfoTabOptions.TextStringAttribute property

Specifies name of the attribute that represents text of 'Text' graphical object.

```csharp
public string TextStringAttribute { get; set; }
```

## Remarks

MapInfo Tab Format specifies a graphical object of type 'Text'. 'Text' graphical object represents a label on a map. We export 'Text' graphical objects as a [`Feature`](../../../aspose.gis/feature/) with [`Polygon`](../../../aspose.gis.geometries/polygon/) geometry that bounds the label. Text of the label is exported as [`FeatureAttribute`](../../../aspose.gis/featureattribute/). This property specifies the name of the attribute that is used to export text of the label. Default value is `"textstring"`.

### See Also

* class [MapInfoTabOptions](../)
* namespace [Aspose.Gis.Formats.MapInfoTab](../../mapinfotaboptions/)
* assembly [Aspose.GIS](../../../)


