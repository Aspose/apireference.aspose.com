---
title: Class Projection
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.SpatialReferencing.Projection कक्ष. मपदंडं के सथ एक प्रक्षेपण वध क प्रतनधत्व करत है ज देशंतर अक्षंश क x y में बदल देत है
type: docs
weight: 2240
url: /hi/net/aspose.gis.spatialreferencing/projection/
---
## Projection class

मापदंडों के साथ एक प्रक्षेपण विधि का प्रतिनिधित्व करता है, जो (देशांतर, अक्षांश) को (x, y) में बदल देता है।

```csharp
public class Projection : IdentifiableObject
```

## गुण

| नाम | विवरण |
| --- | --- |
| [AngularParametersUnit](../../aspose.gis.spatialreferencing/projection/angularparametersunit/) { get; } | इकाई जिसका उपयोग कोणीय मापदंडों के लिए किया जाता है। |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | यदि यह वस्तु पहचानकर्ता ईपीएसजी पहचानकर्ता है - इसका कोड लौटाएं। अन्यथा - वापसी -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | इस पहचान योग्य वस्तु का पहचानकर्ता। |
| [LinearParametersUnit](../../aspose.gis.spatialreferencing/projection/linearparametersunit/) { get; } | इकाई जिसका उपयोग रैखिक मापदंडों के लिए किया जाता है। |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | इस वस्तु का नाम। |
| [ParametersNames](../../aspose.gis.spatialreferencing/projection/parametersnames/) { get; } | इस प्रोजेक्शन को दिए गए मापदंडों के नामों का एक गणनीय संग्रह प्राप्त करता है |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [GetParameterValue](../../aspose.gis.spatialreferencing/projection/getparametervalue/)(string, ParameterType) | इस प्रक्षेपण के निर्दिष्ट नाम के साथ पैरामीटर प्राप्त करता है। |
| [IsEquivalent](../../aspose.gis.spatialreferencing/projection/isequivalent/)(Projection) | निर्धारित करता है कि दो अनुमान समतुल्य हैं। समतुल्य प्रक्षेपण मानचित्र (देशांतर, अक्षांश) से (x, y) में उसी तरह। |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | एक स्ट्रिंग रिटर्न जो मौजूदा वस्तु का प्रतिनिधित्व करता है। |
| [TryGetParameterValue](../../aspose.gis.spatialreferencing/projection/trygetparametervalue/)(string, ParameterType) | इस प्रोजेक्शन के निर्दिष्ट नाम के साथ पैरामीटर प्राप्त करता है। यदि ऐसा कोई पैरामीटर नहीं है - रिटर्न`null` . |

### यह सभी देखें

* class [IdentifiableObject](../identifiableobject/)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* सभा [Aspose.GIS](../../)


