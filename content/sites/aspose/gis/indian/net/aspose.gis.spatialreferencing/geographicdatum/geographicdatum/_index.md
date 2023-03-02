---
title: GeographicDatum.GeographicDatum
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: GeographicDatum नर्मत. नय उदहरण बनत है
type: docs
weight: 10
url: /hi/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

नया उदाहरण बनाता है।

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| name | String | इस डेटम का नाम। |
| ellipsoid | Ellipsoid | इस डेटाम का दीर्घवृत्ताभ। शून्य नहीं हो सकता। |
| toWgs84Parameters | BursaWolfParameters | पैरामीटर्स, जो बर्सा वुल्फ फॉर्मूला को दिए जा सकते हैं, इस डेटम में निर्देशांक को WGS84 डेटम में निर्देशांक में बदलने के लिए। शून्य, ToWgs84 पर सेट किया जाएगा[`IsNull`](../../bursawolfparameters/isnull/) पैरामीटर. |
| identifier | Identifier | इस डेटाम की पहचानकर्ता। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | ellipsoid शून्य है। |

### यह सभी देखें

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* सभा [Aspose.GIS](../../../)


