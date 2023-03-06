---
title: Class SpatialReferenceSystem
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystem कक्ष. स्थनक संदर्भ प्रणल मनचत्र पृथ्व पर स्थनं के लए समन्वय करत है एसआरएस के वभन्न प्रकर हैं देखेंType . क्य अधक है यद एसआरएस क प्रकर हैGeographic य Projected SRS यगक य एकल ह सकत है देखेंIsCompound .
type: docs
weight: 2250
url: /hi/net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

स्थानिक संदर्भ प्रणाली मानचित्र पृथ्वी पर स्थानों के लिए समन्वय करता है। एसआरएस के विभिन्न प्रकार हैं, देखें[`Type`](./type/) . क्या अधिक है, यदि एसआरएस का प्रकार हैGeographic या Projected SRS यौगिक या एकल हो सकता है, देखें[`IsCompound`](./iscompound/) .

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## गुण

| नाम | विवरण |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | इस एसआरएस को परिवर्तित करता है[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . उपयोग करें[`IsCompound`](./iscompound/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | इस एसआरएस को परिवर्तित करता है[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . उपयोग करें[`Type`](./type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | इस एसआरएस को परिवर्तित करता है[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . उपयोग करें[`Type`](./type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | इस एसआरएस को परिवर्तित करता है[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . उपयोग करें[`Type`](./type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | इस एसआरएस को परिवर्तित करता है[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . उपयोग करें[`Type`](./type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | इस एसआरएस को परिवर्तित करता है[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . उपयोग करें[`Type`](./type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount/) { get; } | इस SRS. में आयामों की संख्या लौटाता है |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | यदि यह वस्तु पहचानकर्ता ईपीएसजी पहचानकर्ता है - इसका कोड लौटाएं। अन्यथा - वापसी -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | इस SRS. का भौगोलिक डेटा लौटाता है |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum/) { get; } | निर्धारित करता है कि इस SRS में भौगोलिक डेटा है या नहीं। यह प्रत्येक भौगोलिक, अनुमानित और भूकेंद्रित SRS के लिए सही है। |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian/) { get; } | लौटाता है कि क्या इस SRS में प्रमुख मध्याह्न रेखा है। यह प्रत्येक भौगोलिक, अनुमानित और भू-केंद्रित SRS के लिए सही है। |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | इस पहचान योग्य वस्तु का पहचानकर्ता। |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | लौटाता है कि क्या यह SRS यौगिक है (दो SRS का एक संघ)। यौगिक SRS में SRS के निम्नलिखित संयोजनों को मान्य माना जाता है: भौगोलिक SRS + वर्टिकल SRS, इस मामले में मिश्रित SRS का प्रकार होगाGeographic . अनुमानित एसआरएस + वर्टिकल एसआरएस, इस मामले में कंपाउंड एसआरएस का प्रकार होगाProjected . यदि SRS का संयोजन भिन्न है, तो मिश्रित SRS का प्रकार होगाUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | लौटाता है कि क्या यह SRS सिंगल है (दो SRS का मिलन नहीं). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | समान[`Validate`](./validate/) , लेकिन त्रुटि संदेश वापस न करें. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | इस वस्तु का नाम। |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | इस SRS. की प्रमुख याम्योत्तर लौटाता है |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type/) { get; } | इस SRS का प्रकार प्राप्त करता है, देखें[`SpatialReferenceSystemType`](../spatialreferencesystemtype/) . |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89/) { get; } | ETRS 89 (EPSG:4258) स्थानिक संदर्भ प्रणाली। |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea/) { get; } | ETRS 89 / ETRS लैम्बर्ट अज़ीमुथल समान क्षेत्र (EPSG:3035) स्थानिक संदर्भ प्रणाली। |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic/) { get; } | ETRS 89 / लैम्बर्ट कॉनफॉर्मल शांकव (EPSG:3034) स्थानिक संदर्भ प्रणाली। |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83/) { get; } | NAD 83 (EPSG:4269) स्थानिक संदर्भ प्रणाली। |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36/) { get; } | OSGB 36 (EPSG:4277) स्थानिक संदर्भ प्रणाली। |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid/) { get; } | OSGB 36 / ब्रिटिश नेशनल ग्रिड (EPSG:27700) स्थानिक संदर्भ प्रणाली। |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator/) { get; } | वेब मर्केटर (EPSG:3857) स्थानिक संदर्भ प्रणाली। |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72/) { get; } | WGS 72 (EPSG:4322) स्थानिक संदर्भ प्रणाली। |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84/) { get; } | WGS 84 (EPSG:4326) स्थानिक संदर्भ प्रणाली। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg/)(int) | निर्दिष्ट ईपीएसजी कोड के आधार पर एक स्थानिक संदर्भ प्रणाली बनाएं। |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/)(string) | एक नया बनाता है`स्थानिक संदर्भ प्रणाली` WKT (जाने-पहचाने टेक्स्ट) स्ट्रिंग पर आधारित. |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | इससे परिवर्तन बनाता है`स्थानिक संदर्भ प्रणाली` दूसरे करने के लिए`स्थानिक संदर्भ प्रणाली` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | WKT स्ट्रिंग के रूप में इस SRS का प्रतिनिधित्व लौटाता है। परिणाम WKT स्ट्रिंग OGC 01-009 विनिर्देश से मेल खाएगा, जिसे आमतौर पर "WKT1" नाम दिया जाता है। |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | प्राप्त करें[`Axis`](../axis/) जो आयाम का वर्णन करता है। |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | प्राप्त करें[`Unit`](../unit/)आयाम का। |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | पता लगाता है कि क्या यह एसआरएस अन्य एसआरएस के बराबर है। . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | एक स्ट्रिंग रिटर्न जो मौजूदा वस्तु का प्रतिनिधित्व करता है। |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | इससे परिवर्तन बनाता है`स्थानिक संदर्भ प्रणाली` दूसरे करने के लिए`स्थानिक संदर्भ प्रणाली` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | निर्धारित करें कि क्या यह एसआरएस वैध है। |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | कंपाउंड SRS. बनाएं |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric/)(GeocentricSpatialReferenceSystemParameters, Identifier) | कस्टम पैरामीटर से जियोसेंट्रिक एसआरएस बनाएं. |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic/)(GeographicSpatialReferenceSystemParameters, Identifier) | कस्टम पैरामीटर से भौगोलिक SRS बनाएं. |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | स्थानीय एसआरएस बनाएं. |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/)(ProjectedSpatialReferenceSystemParameters, Identifier) | कस्टम पैरामीटर से अनुमानित SRS बनाएं. |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/)(string, VerticalDatum, Unit, Axis, Identifier) | लंबवत SRS बनाएं. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem, SpatialReferenceSystem) | निर्धारित करता है कि क्या दो SRS समतुल्य हैं। समतुल्य SRS के समान निर्देशांक पृथ्वी पर समान स्थान से मेल खाते हैं। समतुल्य SRS के कुछ पैरामीटर भिन्न हो सकते हैं, उदाहरण के लिए[`Name`](../identifiableobject/name/) . |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg/)(int, out SpatialReferenceSystem) | निर्दिष्ट ईपीएसजी कोड के आधार पर एक स्थानिक संदर्भ प्रणाली बनाएं। |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt/)(string, out SpatialReferenceSystem) | एक नया बनाता है`स्थानिक संदर्भ प्रणाली` WKT (जाने-पहचाने टेक्स्ट) स्ट्रिंग पर आधारित. |

### यह सभी देखें

* class [IdentifiableObject](../identifiableobject/)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* सभा [Aspose.GIS](../../)


