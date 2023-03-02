---
title: SpatialReferenceSystem.CreateVertical
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: SpatialReferenceSystem तरक. लंबवत SRS बनएं.
type: docs
weight: 390
url: /hi/net/aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/
---
## SpatialReferenceSystem.CreateVertical method

लंबवत SRS बनाएं.

```csharp
public static VerticalSpatialReferenceSystem CreateVertical(string name, 
    VerticalDatum verticalDatum, Unit verticalUnit = null, Axis verticalAxis = null, 
    Identifier identifier = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| name | String | एसआरएस का नाम। अगर`null` . |
| verticalDatum | VerticalDatum | एसआरएस में इस्तेमाल किया जाने वाला डेटाम। |
| verticalUnit | Unit | यूनिट एसआरएस में इस्तेमाल की जाएगी। अगर`null` ,[`Meter`](../../unit/meter/) इस्तेमाल किया जाएगा. |
| verticalAxis | Axis | एक्सिस "ऊपर" या "नीचे" दिशा के साथ, एसआरएस में इस्तेमाल किया जाएगा। अगर`null` , अप दिशा के साथ अक्ष का उपयोग किया जाएगा. |
| identifier | Identifier | पहचानकर्ता, जो एसआरएस से जुड़ा होगा। एक पहचानकर्ता संलग्न करने से अन्य SRS पैरामीटर संशोधित नहीं होंगे. पहचानकर्ता और SRS पैरामीटर की निरंतरता सुनिश्चित करना आप पर निर्भर है. |

### प्रतिलाभ की मात्रा

नया वर्टिकल एसआरएस।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| InvalidOperationException | *verticalAxis* दिशा ऊपर या नीचे नहीं है। |
| ArgumentNullException | कुछ आवश्यक पैरामीटर शून्य हैं। |

### यह सभी देखें

* class [VerticalSpatialReferenceSystem](../../verticalspatialreferencesystem/)
* class [VerticalDatum](../../verticaldatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* सभा [Aspose.GIS](../../../)


