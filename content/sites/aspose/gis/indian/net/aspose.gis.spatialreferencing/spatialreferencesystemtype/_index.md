---
title: Enum SpatialReferenceSystemType
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystemType एनुम. स्थनक संदर्भ प्रणल के प्रकर क प्रतनधत्व करत है
type: docs
weight: 2270
url: /hi/net/aspose.gis.spatialreferencing/spatialreferencesystemtype/
---
## SpatialReferenceSystemType enumeration

स्थानिक संदर्भ प्रणाली के प्रकार का प्रतिनिधित्व करता है।

```csharp
public enum SpatialReferenceSystemType
```

### मान

| नाम | कीमत | विवरण |
| --- | --- | --- |
| Unknown | `0` | डिफ़ॉल्ट मान. से लौटाया जा सकता है[`Type`](../spatialreferencesystem/type/) अगर यह एक मिश्रित SRS है जिसमें अंतर्निहित SRS का अवैध संयोजन है। देखना[`IsCompound`](../spatialreferencesystem/iscompound/) . |
| Geographic | `1` | भौगोलिक SRS कोणीय देशांतर और कोणीय अक्षांश पर आधारित है। भौगोलिक SRS को परिवर्तित किया जा सकता है[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) के माध्यम से[`AsGeographic`](../spatialreferencesystem/asgeographic/) विधि. |
| Geocentric | `2` | भूकेंद्रित SRS तीन आयामी कार्तीय SRS है जिसका उद्गम पृथ्वी के केंद्र में है। भूकेंद्रीय SRS को इसमें बदला जा सकता है[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) के माध्यम से[`AsGeocentric`](../spatialreferencesystem/asgeocentric/) विधि. |
| Projected | `3` | अनुमानित एसआरएस रैखिक एक्स और रैखिक वाई पर आधारित है। यह एक पर एक प्रक्षेपण के आवेदन का परिणाम हैGeographic SRS. अनुमानित SRS में परिवर्तित किया जा सकता है[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) के माध्यम से[`AsProjected`](../spatialreferencesystem/asprojected/) विधि. |
| Vertical | `4` | लंबवत एसआरएस रैखिक ऊंचाई समन्वय का वर्णन करता है। लंबवत एसआरएस को परिवर्तित किया जा सकता है[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) के माध्यम से[`AsVertical`](../spatialreferencesystem/asvertical/) विधि. |
| Local | `5` | स्थानीय SRS निर्देशांक को किसी वस्तु से संबंधित करता है, अन्य उन्हें पृथ्वी से। स्थानीय SRS को परिवर्तित किया जा सकता है[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) के माध्यम से[`AsLocal`](../spatialreferencesystem/aslocal/) विधि. |

### यह सभी देखें

* नाम स्थान [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* सभा [Aspose.GIS](../../)


