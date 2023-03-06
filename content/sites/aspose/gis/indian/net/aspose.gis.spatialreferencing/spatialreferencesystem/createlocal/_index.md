---
title: SpatialReferenceSystem.CreateLocal
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: SpatialReferenceSystem तरक. स्थनय एसआरएस बनएं.
type: docs
weight: 370
url: /hi/net/aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/
---
## SpatialReferenceSystem.CreateLocal method

स्थानीय एसआरएस बनाएं.

```csharp
public static LocalSpatialReferenceSystem CreateLocal(string name, LocalDatum datum, Unit unit, 
    ICollection<Axis> axises, Identifier identifier = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| name | String | एसआरएस का नाम। |
| datum | LocalDatum | एसआरएस में इस्तेमाल किया जाने वाला डेटाम। |
| unit | Unit | SRS में उपयोग की जाने वाली इकाई। |
| axises | ICollection`1 | SRS में उपयोग किए जाने वाले अक्ष। खाली नहीं होना चाहिए |
| identifier | Identifier | पहचानकर्ता, जो एसआरएस से जुड़ा होगा। एक पहचानकर्ता संलग्न करने से अन्य SRS पैरामीटर संशोधित नहीं होंगे. पहचानकर्ता और SRS पैरामीटर की निरंतरता सुनिश्चित करना आप पर निर्भर है. |

### प्रतिलाभ की मात्रा

नया स्थानीय एसआरएस।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| InvalidOperationException | *axises* खाली है। |
| ArgumentNullException | कोई तर्क, सिवाय*identifier* शून्य है। |

### यह सभी देखें

* class [LocalSpatialReferenceSystem](../../localspatialreferencesystem/)
* class [LocalDatum](../../localdatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* सभा [Aspose.GIS](../../../)


