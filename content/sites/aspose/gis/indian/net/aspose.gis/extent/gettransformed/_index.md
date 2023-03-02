---
title: Extent.GetTransformed
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Extent तरक. नर्दष्ट में नई सम देत हैSpatialReferenceSystem जसमें यह सम शमल है
type: docs
weight: 150
url: /hi/net/aspose.gis/extent/gettransformed/
---
## Extent.GetTransformed method

निर्दिष्ट में नई सीमा देता है[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) जिसमें यह सीमा शामिल है।

```csharp
public Extent GetTransformed(SpatialReferenceSystem targetSrs)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) परिणत करने के लिए। |

### प्रतिलाभ की मात्रा

निर्दिष्ट SRS. तक इस सीमा तक रूपांतरण का परिणाम

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null` . |
| NotSupportedException | प्रदान किए गए SRS में रूपांतरण समर्थित नहीं है। |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | परिवर्तन विफल रहा। |
| InvalidOperationException | [`SpatialReferenceSystem`](../spatialreferencesystem/) इस हद तक है`null` . |

### यह सभी देखें

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Extent](../)
* नाम स्थान [Aspose.Gis](../../extent/)
* सभा [Aspose.GIS](../../../)


