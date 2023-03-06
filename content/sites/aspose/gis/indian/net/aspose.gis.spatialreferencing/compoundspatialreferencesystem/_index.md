---
title: Class CompoundSpatialReferenceSystem
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.SpatialReferencing.CompoundSpatialReferenceSystem कक्ष. यगक एसआरएस द अंतर्नहत एसआरएस क जड़त है जनमें से कई भ मश्रत नहं ह सकत है
type: docs
weight: 2060
url: /hi/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

यौगिक एसआरएस दो अंतर्निहित एसआरएस को जोड़ता है, जिनमें से कोई भी मिश्रित नहीं हो सकता है।

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## गुण

| नाम | विवरण |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound/) { get; } | इसे वापस करें। |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | इस एसआरएस को परिवर्तित करता है[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic/) { get; } | इस एसआरएस का भौगोलिक प्रतिनिधित्व लौटाएं। यदि यह यौगिक SRS वास्तव में एक भौगोलिक SRS का प्रतिनिधित्व करता है, तो परिणाम होगा तीन आयामी भौगोलिक SRS (देशांतर, अक्षांश, ऊंचाई आयामों के साथ)। अन्यथा एक अपवाद दिया जाएगा. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | इस एसआरएस को परिवर्तित करता है[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected/) { get; } | इस एसआरएस का अनुमानित प्रतिनिधित्व लौटाएं। यदि यह यौगिक SRS वास्तव में अनुमानित SRS का प्रतिनिधित्व करता है, तो परिणाम होगा तीन आयामी अनुमानित SRS (X, Y, ऊंचाई आयामों के साथ)। अन्यथा एक अपवाद दिया जाएगा. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | इस एसआरएस को परिवर्तित करता है[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . उपयोग करें[`Type`](../spatialreferencesystem/type/) यह पता लगाने के लिए कि रूपांतरण संभव है या नहीं। |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount/) { get; } | आयामों की संख्या। कंपाउंड SRS के लिए यह अंतर्निहित SRS. के आयामों की संख्या का योग है |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | यदि यह वस्तु पहचानकर्ता ईपीएसजी पहचानकर्ता है - इसका कोड लौटाएं। अन्यथा - वापसी -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum/) { get; } | इस SRS का भौगोलिक डेटा लौटाएं. यदि दोनों[`Head`](./head/) और[`Tail`](./tail/) भौगोलिक डेटा है - हेड का भौगोलिक डेटा लौटाएं. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum/) { get; } | यौगिक SRS का भौगोलिक डेटा है यदि अंतर्निहित SRS में से कोई भी भौगोलिक डेटा है। |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian/) { get; } | यौगिक SRS में प्रधान मध्याह्न रेखा होती है यदि अंतर्निहित SRS में से कोई भी प्रधान मध्याह्न रेखा हो। |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head/) { get; } | पहला अंतर्निहित SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | इस पहचान योग्य वस्तु का पहचानकर्ता। |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound/) { get; } | रिटर्न`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | लौटाता है कि क्या यह SRS सिंगल है (दो SRS का मिलन नहीं). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | समान[`Validate`](../spatialreferencesystem/validate/) , लेकिन त्रुटि संदेश वापस न करें. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | इस वस्तु का नाम। |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian/) { get; } | इस SRS. की प्रमुख मध्याह्न रेखा लौटाएं यदि दोनों[`Head`](./head/) और[`Tail`](./tail/) प्राइम मेरिडियन है - हेड के प्राइम मेरिडियन को वापस करें। |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail/) { get; } | दूसरा अंतर्निहित SRS. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type/) { get; } | इस यौगिक SRS का प्रकार। हो सकता हैGeographicif यह कंपाउंड एसआरएस भौगोलिक और लंबवत एसआरएस का संयोजन है, याProjected if यह यौगिक SRS अनुमानित और लंबवत SRS. का संयोजन है |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | इससे परिवर्तन बनाता है`स्थानिक संदर्भ प्रणाली` दूसरे करने के लिए`स्थानिक संदर्भ प्रणाली` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | WKT स्ट्रिंग के रूप में इस SRS का प्रतिनिधित्व लौटाता है। परिणाम WKT स्ट्रिंग OGC 01-009 विनिर्देश से मेल खाएगा, जिसे आमतौर पर "WKT1" नाम दिया जाता है। |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis/)(int) | प्राप्त करें[`Axis`](../axis/) जो आयाम का वर्णन करता है। |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit/)(int) | प्राप्त करें[`Unit`](../unit/)आयाम का। |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | पता लगाता है कि क्या यह एसआरएस अन्य एसआरएस के बराबर है। . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | एक स्ट्रिंग रिटर्न जो मौजूदा वस्तु का प्रतिनिधित्व करता है। |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | इससे परिवर्तन बनाता है`स्थानिक संदर्भ प्रणाली` दूसरे करने के लिए`स्थानिक संदर्भ प्रणाली` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate/)(out string) | निर्धारित करें कि क्या यह SRS मान्य है। देखना[`Validate`](../spatialreferencesystem/validate/) वैधता विवरण के लिए. |

### यह सभी देखें

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* सभा [Aspose.GIS](../../)


