---
title: Class GeocentricSpatialReferenceSystem
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.SpatialReferencing.GeocentricSpatialReferenceSystem कक्ष. भूकेंद्रत SRS 3 आयम कर्तय SRS है जसक उद्गम पृथ्व के केंद्र में है
type: docs
weight: 2090
url: /hi/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---
## GeocentricSpatialReferenceSystem class

भूकेंद्रित SRS 3 आयामी कार्तीय SRS है जिसका उद्गम पृथ्वी के केंद्र में है।

```csharp
public class GeocentricSpatialReferenceSystem : SpatialReferenceSystem
```

## गुण

| नाम | विवरण |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | इस एसआरएस को परिवर्तित करता है[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . उपयोग करें[`IsCompound`](../spatialreferencesystem/iscompound/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| override [AsGeocentric](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/asgeocentric/) { get; } | इसे वापस करें। |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | इस एसआरएस को परिवर्तित करता है[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | इस एसआरएस को परिवर्तित करता है[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | इस एसआरएस को परिवर्तित करता है[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | इस एसआरएस को परिवर्तित करता है[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/axisesorder/) { get; } | इस SRS में अक्षों का क्रम. यदि यह SRS मान्य नहीं है और गलत अक्ष दिशाएँ हैं,Invalid वापस आ गया है। |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/dimensionscount/) { get; } | रिटर्न 3, क्योंकि भूकेंद्रित एसआरएस हमेशा तीन आयामी होता है। |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | यदि यह वस्तु पहचानकर्ता ईपीएसजी पहचानकर्ता है - इसका कोड लौटाएं। अन्यथा - वापसी -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/geographicdatum/) { get; } | इस SRS. का भौगोलिक डेटा लौटाएं |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasgeographicdatum/) { get; } | वापसी`true` , चूंकि भू-केन्द्रित SRS में हमेशा भौगोलिक डेटा होता है. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasprimemeridian/) { get; } | वापसी`true` , चूंकि भूकेन्द्रीय SRS में हमेशा प्रधान मध्याह्न रेखा होती है. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | इस पहचान योग्य वस्तु का पहचानकर्ता। |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | लौटाता है कि क्या यह SRS यौगिक है (दो SRS का एक संघ)। यौगिक SRS में SRS के निम्नलिखित संयोजनों को मान्य माना जाता है: भौगोलिक SRS + वर्टिकल SRS, इस मामले में मिश्रित SRS का प्रकार होगाGeographic . अनुमानित एसआरएस + वर्टिकल एसआरएस, इस मामले में कंपाउंड एसआरएस का प्रकार होगाProjected . यदि SRS का संयोजन भिन्न है, तो मिश्रित SRS का प्रकार होगाUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | लौटाता है कि क्या यह SRS सिंगल है (दो SRS का मिलन नहीं). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | समान[`Validate`](../spatialreferencesystem/validate/) , लेकिन त्रुटि संदेश वापस न करें. |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/linearunit/) { get; } | यूनिट, इस SRS. में प्रयुक्त |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | इस वस्तु का नाम। |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/primemeridian/) { get; } | इस SRS. की प्रमुख मध्याह्न रेखा लौटाएं |
| override [Type](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/type/) { get; } | वापसीGeocentric . |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | इससे परिवर्तन बनाता है`स्थानिक संदर्भ प्रणाली` दूसरे करने के लिए`स्थानिक संदर्भ प्रणाली` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | WKT स्ट्रिंग के रूप में इस SRS का प्रतिनिधित्व लौटाता है। परिणाम WKT स्ट्रिंग OGC 01-009 विनिर्देश से मेल खाएगा, जिसे आमतौर पर "WKT1" नाम दिया जाता है। |
| override [GetAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis/)(int) | प्राप्त करें[`Axis`](../axis/) जो आयाम का वर्णन करता है। |
| override [GetUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getunit/)(int) | प्राप्त करें[`Unit`](../unit/)आयाम का। |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | पता लगाता है कि क्या यह एसआरएस अन्य एसआरएस के बराबर है। . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | एक स्ट्रिंग रिटर्न जो मौजूदा वस्तु का प्रतिनिधित्व करता है। |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | इससे परिवर्तन बनाता है`स्थानिक संदर्भ प्रणाली` दूसरे करने के लिए`स्थानिक संदर्भ प्रणाली` . |
| override [Validate](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/validate/)(out string) | निर्धारित करें कि क्या यह SRS मान्य है। देखना[`Validate`](../spatialreferencesystem/validate/) वैधता विवरण के लिए. |

### यह सभी देखें

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* सभा [Aspose.GIS](../../)


