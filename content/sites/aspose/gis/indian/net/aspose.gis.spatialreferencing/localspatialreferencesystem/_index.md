---
title: Class LocalSpatialReferenceSystem
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.SpatialReferencing.LocalSpatialReferenceSystem कक्ष. स्थनय SRS कस वस्तु से संबंधत नर्देशंक करत है पृथ्व से नहं
type: docs
weight: 2180
url: /hi/net/aspose.gis.spatialreferencing/localspatialreferencesystem/
---
## LocalSpatialReferenceSystem class

स्थानीय SRS किसी वस्तु से संबंधित निर्देशांक करता है, पृथ्वी से नहीं।

```csharp
public class LocalSpatialReferenceSystem : SpatialReferenceSystem
```

## गुण

| नाम | विवरण |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | इस एसआरएस को परिवर्तित करता है[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . उपयोग करें[`IsCompound`](../spatialreferencesystem/iscompound/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | इस एसआरएस को परिवर्तित करता है[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | इस एसआरएस को परिवर्तित करता है[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| override [AsLocal](../../aspose.gis.spatialreferencing/localspatialreferencesystem/aslocal/) { get; } | इसे वापस करें। |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | इस एसआरएस को परिवर्तित करता है[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | इस एसआरएस को परिवर्तित करता है[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/localspatialreferencesystem/dimensionscount/) { get; } | इस SRS. में आयामों की संख्या |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | यदि यह वस्तु पहचानकर्ता ईपीएसजी पहचानकर्ता है - इसका कोड लौटाएं। अन्यथा - वापसी -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/geographicdatum/) { get; } | फेंकता हैInvalidOperationException क्योंकि स्थानीय SRS का भौगोलिक डेटा नहीं है. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasgeographicdatum/) { get; } | रिटर्न`false` क्योंकि स्थानीय SRS का भौगोलिक डेटा नहीं है. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasprimemeridian/) { get; } | रिटर्न`false` , क्योंकि स्थानीय SRS में प्रमुख मध्याह्न रेखा नहीं है. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | इस पहचान योग्य वस्तु का पहचानकर्ता। |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | लौटाता है कि क्या यह SRS यौगिक है (दो SRS का एक संघ)। यौगिक SRS में SRS के निम्नलिखित संयोजनों को मान्य माना जाता है: भौगोलिक SRS + वर्टिकल SRS, इस मामले में मिश्रित SRS का प्रकार होगाGeographic . अनुमानित एसआरएस + वर्टिकल एसआरएस, इस मामले में कंपाउंड एसआरएस का प्रकार होगाProjected . यदि SRS का संयोजन भिन्न है, तो मिश्रित SRS का प्रकार होगाUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | लौटाता है कि क्या यह SRS सिंगल है (दो SRS का मिलन नहीं). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | समान[`Validate`](../spatialreferencesystem/validate/) , लेकिन त्रुटि संदेश वापस न करें. |
| [LocalDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/localdatum/) { get; } | डेटाम, जो माप विधि का वर्णन करता है। |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | इस वस्तु का नाम। |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/primemeridian/) { get; } | फेंकता हैInvalidOperationException , क्योंकि स्थानीय SRS में प्रमुख मध्याह्न रेखा नहीं है. |
| override [Type](../../aspose.gis.spatialreferencing/localspatialreferencesystem/type/) { get; } | वापसीLocal . |
| [Unit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/unit/) { get; } | इस SRS. की इकाई |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | इससे परिवर्तन बनाता है`स्थानिक संदर्भ प्रणाली` दूसरे करने के लिए`स्थानिक संदर्भ प्रणाली` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | WKT स्ट्रिंग के रूप में इस SRS का प्रतिनिधित्व लौटाता है। परिणाम WKT स्ट्रिंग OGC 01-009 विनिर्देश से मेल खाएगा, जिसे आमतौर पर "WKT1" नाम दिया जाता है। |
| override [GetAxis](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getaxis/)(int) | प्राप्त करें[`Axis`](../axis/) जो आयाम का वर्णन करता है। |
| override [GetUnit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getunit/)(int) | प्राप्त करें[`Unit`](./unit/)आयाम का। |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/localspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | पता लगाता है कि क्या यह एसआरएस अन्य एसआरएस के बराबर है। . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | एक स्ट्रिंग रिटर्न जो मौजूदा वस्तु का प्रतिनिधित्व करता है। |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | इससे परिवर्तन बनाता है`स्थानिक संदर्भ प्रणाली` दूसरे करने के लिए`स्थानिक संदर्भ प्रणाली` . |
| override [Validate](../../aspose.gis.spatialreferencing/localspatialreferencesystem/validate/)(out string) | निर्धारित करें कि क्या यह SRS मान्य है। देखना[`Validate`](../spatialreferencesystem/validate/) वैधता विवरण के लिए. |

### यह सभी देखें

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* सभा [Aspose.GIS](../../)


