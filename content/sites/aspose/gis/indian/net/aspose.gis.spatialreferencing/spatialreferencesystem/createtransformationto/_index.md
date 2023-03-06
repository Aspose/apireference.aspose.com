---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: SpatialReferenceSystem तरक. इससे परवर्तन बनत हैस्थनक संदर्भ प्रणल दूसरे करने के लएस्थनक संदर्भ प्रणल .
type: docs
weight: 180
url: /hi/net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

इससे परिवर्तन बनाता है`स्थानिक संदर्भ प्रणाली` दूसरे करने के लिए`स्थानिक संदर्भ प्रणाली` .

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | एक और`स्थानिक संदर्भ प्रणाली`. |

### प्रतिलाभ की मात्रा

इससे परिवर्तन`स्थानिक संदर्भ प्रणाली` दूसरे करने के लिए`स्थानिक संदर्भ प्रणाली`.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| NotSupportedException | इसके बीच परिवर्तन`स्थानिक संदर्भ प्रणाली` और तर्क समर्थित नहीं है। ऐसा हो सकता है, क्योंकि अनुमानों में से एक समर्थित नहीं है, या सिस्टम में से एक है[`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/) या [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/) . |
| [TransformationException](../../transformationexception/) | अंदर गलत पैरामीटर के कारण रूपांतरण बनाने में विफल रहा है`स्थानिक संदर्भ प्रणाली` . |

### यह सभी देखें

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* सभा [Aspose.GIS](../../../)


