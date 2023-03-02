---
title: Class ProjectedSpatialReferenceSystem
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystem कक्ष. अनुमनत एसआरएस भगलक एसआरएस के लए एक प्रक्षेपण क परणम है एक अनुमनत एसआरएस द आयम य तन आयम ह सकत है यद अनुमनत एसआरएस तन आयम है त यह वस्तव में द आयम अनुमनत एसआरएस और एक आयम ऊर्ध्वधर क एक मश्रत एसआरएस है SRS.
type: docs
weight: 2220
url: /hi/net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/
---
## ProjectedSpatialReferenceSystem class

अनुमानित एसआरएस भौगोलिक एसआरएस के लिए एक प्रक्षेपण का परिणाम है। एक अनुमानित एसआरएस दो आयामी या तीन आयामी हो सकता है। यदि अनुमानित एसआरएस तीन आयामी है, तो यह वास्तव में दो आयामी अनुमानित एसआरएस और एक आयामी ऊर्ध्वाधर का एक मिश्रित एसआरएस है SRS.

```csharp
public abstract class ProjectedSpatialReferenceSystem : SpatialReferenceSystem
```

## गुण

| नाम | विवरण |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/angularunit/) { get; } | यूनिट, जिसका उपयोग इस एसआरएस में कोणीय मूल्यों के लिए और कोणीय पैरामीटर के लिए किया जाता है[`Projection`](./projection/) . की कोणीय इकाई से मेल खाता है[`Base`](./base/) . |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | इस एसआरएस को परिवर्तित करता है[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . उपयोग करें[`IsCompound`](../spatialreferencesystem/iscompound/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | इस एसआरएस को परिवर्तित करता है[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | इस एसआरएस को परिवर्तित करता है[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | इस एसआरएस को परिवर्तित करता है[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| [AsProjected](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/asprojected/) { get; } | इसे वापस करें। |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | इस एसआरएस को परिवर्तित करता है[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/axisesorder/) { get; } | इस SRS में अक्षों का क्रम. यदि यह SRS मान्य नहीं है और गलत अक्ष दिशाएँ हैं,Invalid वापस आ गया है। |
| abstract [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/base/) { get; } | भौगोलिक एसआरएस जिससे[`Projection`](./projection/) इस SRS. को प्राप्त करने के लिए आवेदन किया गया था |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/dimensionscount/) { get; } | रिटर्न आयाम इस एसआरएस में गिने जाते हैं। अनुमानित एसआरएस के लिए यह हो सकता है: दो - यदि यह एकल अनुमानित एसआरएस है। |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | यदि यह वस्तु पहचानकर्ता ईपीएसजी पहचानकर्ता है - इसका कोड लौटाएं। अन्यथा - वापसी -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | इस SRS. का भौगोलिक डेटा लौटाता है |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasgeographicdatum/) { get; } | सही रिटर्न देता है, क्योंकि अनुमानित SRS में हमेशा प्राइम मेरिडियन होता है। |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasprimemeridian/) { get; } | सही रिटर्न देता है, क्योंकि अनुमानित SRS में हमेशा प्राइम मेरिडियन होता है। |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | इस पहचान योग्य वस्तु का पहचानकर्ता। |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | लौटाता है कि क्या यह SRS यौगिक है (दो SRS का एक संघ)। यौगिक SRS में SRS के निम्नलिखित संयोजनों को मान्य माना जाता है: भौगोलिक SRS + वर्टिकल SRS, इस मामले में मिश्रित SRS का प्रकार होगाGeographic . अनुमानित एसआरएस + वर्टिकल एसआरएस, इस मामले में कंपाउंड एसआरएस का प्रकार होगाProjected . यदि SRS का संयोजन भिन्न है, तो मिश्रित SRS का प्रकार होगाUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | लौटाता है कि क्या यह SRS सिंगल है (दो SRS का मिलन नहीं). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | समान[`Validate`](../spatialreferencesystem/validate/) , लेकिन त्रुटि संदेश वापस न करें. |
| abstract [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/linearunit/) { get; } | यूनिट, जिसका उपयोग इस एसआरएस में रैखिक आयामों के लिए और रैखिक पैरामीटर के लिए किया जाता है[`Projection`](./projection/) . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | इस वस्तु का नाम। |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | इस SRS. की प्रमुख याम्योत्तर लौटाता है |
| abstract [Projection](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/projection/) { get; } | प्रोजेक्शन, जिसे लागू किया गया था[`Base`](./base/) इस SRS. को प्राप्त करने के लिए |
| [Type](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/type/) { get; } | रिटर्नProjected . |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | इससे परिवर्तन बनाता है`स्थानिक संदर्भ प्रणाली` दूसरे करने के लिए`स्थानिक संदर्भ प्रणाली` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | WKT स्ट्रिंग के रूप में इस SRS का प्रतिनिधित्व लौटाता है। परिणाम WKT स्ट्रिंग OGC 01-009 विनिर्देश से मेल खाएगा, जिसे आमतौर पर "WKT1" नाम दिया जाता है। |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | प्राप्त करें[`Axis`](../axis/) जो आयाम का वर्णन करता है। |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | प्राप्त करें[`Unit`](../unit/)आयाम का। |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | पता लगाता है कि क्या यह एसआरएस अन्य एसआरएस के बराबर है। . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | एक स्ट्रिंग रिटर्न जो मौजूदा वस्तु का प्रतिनिधित्व करता है। |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | इससे परिवर्तन बनाता है`स्थानिक संदर्भ प्रणाली` दूसरे करने के लिए`स्थानिक संदर्भ प्रणाली` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | निर्धारित करें कि क्या यह एसआरएस वैध है। |

### यह सभी देखें

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* सभा [Aspose.GIS](../../)


