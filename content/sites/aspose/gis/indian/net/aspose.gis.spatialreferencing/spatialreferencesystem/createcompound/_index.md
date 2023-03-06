---
title: SpatialReferenceSystem.CreateCompound
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: SpatialReferenceSystem तरक. कंपउंड SRS. बनएं
type: docs
weight: 340
url: /hi/net/aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/
---
## SpatialReferenceSystem.CreateCompound method

कंपाउंड SRS. बनाएं

```csharp
public static CompoundSpatialReferenceSystem CreateCompound(string name, 
    SpatialReferenceSystem head, SpatialReferenceSystem tail, Identifier identifier = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| name | String | नए एसआरएस का नाम। |
| head | SpatialReferenceSystem | नए एसआरएस के प्रमुख एसआरएस। |
| tail | SpatialReferenceSystem | नए SRS का टेल SRS। |
| identifier | Identifier | पहचानकर्ता, जो एसआरएस से जुड़ा होगा। एक पहचानकर्ता संलग्न करने से अन्य SRS पैरामीटर संशोधित नहीं होंगे. पहचानकर्ता और SRS पैरामीटर की निरंतरता सुनिश्चित करना आप पर निर्भर है. |

### प्रतिलाभ की मात्रा

न्यू कंपाउंड एसआरएस।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | सिवाय कोई तर्क*identifier* है`null` . |
| InvalidOperationException | *head* या*tail* कंपाउंड एसआरएस खुद हैं। |

### यह सभी देखें

* class [CompoundSpatialReferenceSystem](../../compoundspatialreferencesystem/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* सभा [Aspose.GIS](../../../)


