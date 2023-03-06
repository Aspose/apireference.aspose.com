---
title: Class Ellipsoid
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.SpatialReferencing.Ellipsoid कक्ष. दर्घवृत्तभ एक दर्घवृत्तभ क प्रतनधत्व करत है ज पृथ्व के सन्नकट है
type: docs
weight: 2070
url: /hi/net/aspose.gis.spatialreferencing/ellipsoid/
---
## Ellipsoid class

दीर्घवृत्ताभ एक दीर्घवृत्ताभ का प्रतिनिधित्व करता है, जो पृथ्वी के सन्निकट है।

```csharp
public class Ellipsoid : IdentifiableObject
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Ellipsoid](ellipsoid/)(string, double, double, Identifier) | नया दीर्घवृत्त बनाता है। |

## गुण

| नाम | विवरण |
| --- | --- |
| static [Airy](../../aspose.gis.spatialreferencing/ellipsoid/airy/) { get; } | हवादार दीर्घवृत्त। |
| static [Grs80](../../aspose.gis.spatialreferencing/ellipsoid/grs80/) { get; } | जीआरएस 1980 दीर्घवृत्त। |
| static [Wgs72](../../aspose.gis.spatialreferencing/ellipsoid/wgs72/) { get; } | WGS 72 दीर्घवृत्त। |
| static [Wgs84](../../aspose.gis.spatialreferencing/ellipsoid/wgs84/) { get; } | WGS 84 दीर्घवृत्त। |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | यदि यह वस्तु पहचानकर्ता ईपीएसजी पहचानकर्ता है - इसका कोड लौटाएं। अन्यथा - वापसी -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | इस पहचान योग्य वस्तु का पहचानकर्ता। |
| [InverseFlattening](../../aspose.gis.spatialreferencing/ellipsoid/inverseflattening/) { get; } | दीर्घवृत्ताभ का उलटा चपटा होना। 0 यदि यह एक गोला है। |
| [IsSphere](../../aspose.gis.spatialreferencing/ellipsoid/issphere/) { get; } | यह पता लगाता है कि क्या यह दीर्घवृत्त एक गोला है। |
| [IsValid](../../aspose.gis.spatialreferencing/ellipsoid/isvalid/) { get; } | यह पता लगाता है कि दीर्घवृत्ताभ वैध है या नहीं: इसकी अर्ध प्रमुख धुरी 0 से अधिक है और उलटा चपटा धनात्मक या 0 के बराबर है। |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | इस वस्तु का नाम। |
| [SemiMajorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semimajoraxis/) { get; } | दीर्घवृत्ताभ का अर्ध प्रमुख अक्ष। |
| [SemiMinorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semiminoraxis/) { get; } | दीर्घवृत्ताभ का अर्ध लघु अक्ष। अर्ध प्रमुख अक्ष के बराबर अगर यह एक गोला है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid) | निर्धारित करता है कि क्या दो दीर्घवृत्त समतुल्य हैं। |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | एक स्ट्रिंग रिटर्न जो मौजूदा वस्तु का प्रतिनिधित्व करता है। |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid, Ellipsoid) | निर्धारित करता है कि क्या दो दीर्घवृत्त समतुल्य हैं। |

### यह सभी देखें

* class [IdentifiableObject](../identifiableobject/)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* सभा [Aspose.GIS](../../)


