---
title: Class GeographicDatum
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.SpatialReferencing.GeographicDatum कक्ष. भगलक आधर पृथ्व पर वशेष स्थन के देशंतर और अक्षंश से संबंधत है
type: docs
weight: 2120
url: /hi/net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

भौगोलिक आधार पृथ्वी पर विशेष स्थान के देशांतर और अक्षांश से संबंधित है।

```csharp
public class GeographicDatum : IdentifiableObject
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | नया उदाहरण बनाता है। |

## गुण

| नाम | विवरण |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | ETRS 89 दिनांक. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | एनएडी 83 डेटम. |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | OSGB 1936 दिनांक. |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | WGS 72 डेटम. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | WGS 84 डेटम. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | दीर्घवृत्त, पृथ्वी का अनुमान लगाने के लिए इस डेटा में उपयोग किया गया। |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | यदि यह वस्तु पहचानकर्ता ईपीएसजी पहचानकर्ता है - इसका कोड लौटाएं। अन्यथा - वापसी -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | इस पहचान योग्य वस्तु का पहचानकर्ता। |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | इस वस्तु का नाम। |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | BursaWolfParamters जिनका उपयोग इस डेटा में निर्देशांक को WGS84 डेटम में निर्देशांक में बदलने के लिए किया जा सकता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | निर्धारित करता है कि क्या दो डेटा समतुल्य हैं। समतुल्य डेटाम के समान निर्देशांक पृथ्वी पर समान स्थान से मेल खाते हैं। समतुल्य डेटाम के कुछ पैरामीटर भिन्न हो सकते हैं, उदाहरण के लिए[`Name`](../identifiableobject/name/) . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | एक स्ट्रिंग रिटर्न जो मौजूदा वस्तु का प्रतिनिधित्व करता है। |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | निर्धारित करता है कि क्या दो डेटा समतुल्य हैं। समतुल्य डेटाम के समान निर्देशांक पृथ्वी पर समान स्थान से मेल खाते हैं। समतुल्य डेटाम के कुछ पैरामीटर भिन्न हो सकते हैं, उदाहरण के लिए[`Name`](../identifiableobject/name/) . |

### यह सभी देखें

* class [IdentifiableObject](../identifiableobject/)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* सभा [Aspose.GIS](../../)


