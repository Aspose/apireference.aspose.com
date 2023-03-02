---
title: Class Identifier
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.SpatialReferencing.Identifier कक्ष. एक पहचनकर्त क प्रतनधत्व करत है  कस वस्तु के बहर ववरण क संदर्भ यद आप WKT से SRS बनते हैंIdentifier प्रधकरण कवर्ड से मेल खत है.
type: docs
weight: 2160
url: /hi/net/aspose.gis.spatialreferencing/identifier/
---
## Identifier class

एक पहचानकर्ता का प्रतिनिधित्व करता है - किसी वस्तु के बाहरी विवरण का संदर्भ। यदि आप WKT से SRS बनाते हैं,`Identifier` "प्राधिकरण" कीवर्ड से मेल खाता है.

```csharp
public class Identifier : IEquatable<Identifier>
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Identifier](identifier/)(string, string) | नया उदाहरण बनाएं। |

## गुण

| नाम | विवरण |
| --- | --- |
| [AuthorityName](../../aspose.gis.spatialreferencing/identifier/authorityname/) { get; } | प्राधिकरण का एक नाम, जिसने एक दिया[`AuthorityUniqueIdentifier`](./authorityuniqueidentifier/) . |
| [AuthorityUniqueIdentifier](../../aspose.gis.spatialreferencing/identifier/authorityuniqueidentifier/) { get; } | एक के भीतर किसी वस्तु का प्रतिनिधित्व करने का एक अनूठा तरीका[`AuthorityName`](./authorityname/) . |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [Epsg](../../aspose.gis.spatialreferencing/identifier/epsg/)(int) | नया पहचानकर्ता बनाता है जो कोड के साथ ईपीएसजी पहचानकर्ता का प्रतिनिधित्व करता है*epsgCode* . |
| [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals)(Identifier) | इंगित करता है कि क्या वर्तमान वस्तु उसी प्रकार की दूसरी वस्तु के बराबर है। |
| override [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals_1)(object) | निर्धारित करता है कि निर्दिष्ट वस्तु वर्तमान वस्तु के बराबर है या नहीं। |
| [GetEpsgCode](../../aspose.gis.spatialreferencing/identifier/getepsgcode/)() | यदि यह वस्तु एक वैध ईपीएसजी पहचानकर्ता का प्रतिनिधित्व करती है (जैसे - प्राधिकरण का नाम "ईपीएसजी" है और प्राधिकरण अद्वितीय पहचानकर्ता पूर्णांक है) - इसे वापस करें। अन्यथा - वापसी -1. |
| override [GetHashCode](../../aspose.gis.spatialreferencing/identifier/gethashcode/)() | डिफ़ॉल्ट हैश फ़ंक्शन के रूप में कार्य करता है। |
| [operator ==](../../aspose.gis.spatialreferencing/identifier/op_equality/) | ऑपरेटर लागू करता है ==. |
| [operator !=](../../aspose.gis.spatialreferencing/identifier/op_inequality/) | ऑपरेटर को लागू करता है!=. |

### उदाहरण

WGS 84 स्थानिक संदर्भ प्रणाली में EPSG कोड 4326 है, इसलिए इसमें पहचानकर्ता हो सकता है: WGS 84 Ellipsoid का EPSG कोड 7030 है, और इसमें पहचानकर्ता हो सकता है:

```csharp
new  {  = "EPSG",  = 4326 };
```

```csharp
new  {  = "EPSG",  = 7030 };
```

### यह सभी देखें

* नाम स्थान [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* सभा [Aspose.GIS](../../)


