---
title: Transform
second_title: .NET API संदर्भ के लिए Aspose.3D
description: एक परवर्तन में ऐस जनकर हत है ज ऑब्जेक्ट के अनुवद/स्केल/रटेशन तक पहुंच क अनुमत देत है य मैट्रक्स क न्यूनतम लगत पर बदल देत है इसक उपयग स्थनय परवर्तन द्वर कय जत है
type: docs
weight: 2400
url: /hi/net/aspose.threed/transform/
---
## Transform class

एक परिवर्तन में ऐसी जानकारी होती है जो ऑब्जेक्ट के अनुवाद/स्केल/रोटेशन तक पहुंच की अनुमति देती है या मैट्रिक्स को न्यूनतम लागत पर बदल देती है इसका उपयोग स्थानीय परिवर्तन द्वारा किया जाता है।

```csharp
public class Transform : A3DObject
```

## गुण

| नाम | विवरण |
| --- | --- |
| [EulerAngles](../../aspose.threed/transform/eulerangles/) { get; set; } | डिग्री में मापे गए यूलर कोणों में दर्शाए गए रोटेशन को प्राप्त या सेट करता है |
| [GeometricRotation](../../aspose.threed/transform/geometricrotation/) { get; set; } | ज्यामितीय यूलर रोटेशन प्राप्त करता है या सेट करता है (डिग्री में मापा जाता है)। ज्यामितीय परिवर्तन केवल संलग्न संस्थाओं को प्रभावित करता है और चाइल्ड नोड्स को अप्रभावित छोड़ देता है। इसे स्थानीय परिवर्तन के रूप में विलय कर दिया जाएगा जब आप ज्यामितीय परिवर्तन को उन फ़ाइल प्रकारों में निर्यात करते हैं जो इसका समर्थन नहीं करते हैं। |
| [GeometricScaling](../../aspose.threed/transform/geometricscaling/) { get; set; } | ज्यामितीय स्केलिंग प्राप्त या सेट करता है। ज्यामितीय परिवर्तन केवल संलग्न संस्थाओं को प्रभावित करता है और चाइल्ड नोड्स को अप्रभावित छोड़ देता है। इसे स्थानीय परिवर्तन के रूप में विलय कर दिया जाएगा जब आप ज्यामितीय परिवर्तन को उन फ़ाइल प्रकारों में निर्यात करते हैं जो इसका समर्थन नहीं करते हैं। |
| [GeometricTranslation](../../aspose.threed/transform/geometrictranslation/) { get; set; } | ज्यामितीय अनुवाद प्राप्त या सेट करता है। ज्यामितीय परिवर्तन केवल संलग्न संस्थाओं को प्रभावित करता है और चाइल्ड नोड्स को अप्रभावित छोड़ देता है। इसे स्थानीय परिवर्तन के रूप में विलय कर दिया जाएगा जब आप ज्यामितीय परिवर्तन को उन फ़ाइल प्रकारों में निर्यात करते हैं जो इसका समर्थन नहीं करते हैं। |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | नाम प्राप्त या सेट करता है। |
| [PostRotation](../../aspose.threed/transform/postrotation/) { get; set; } | डिग्री में दर्शाए गए पोस्ट-रोटेशन को प्राप्त या सेट करता है |
| [PreRotation](../../aspose.threed/transform/prerotation/) { get; set; } | डिग्री में दर्शाए गए पूर्व-रोटेशन को प्राप्त या सेट करता है |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | सभी संपत्तियों का संग्रह प्राप्त करता है। |
| [Rotation](../../aspose.threed/transform/rotation/) { get; set; } | चतुष्कोण में दर्शाए गए रोटेशन को प्राप्त या सेट करता है। |
| [Scale](../../aspose.threed/transform/scale/) { get; set; } | स्केल प्राप्त या सेट करता है |
| [TransformMatrix](../../aspose.threed/transform/transformmatrix/) { get; set; } | रूपांतरण मैट्रिक्स प्राप्त या सेट करता है। |
| [Translation](../../aspose.threed/transform/translation/) { get; set; } | अनुवाद प्राप्त या सेट करता है |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | संपत्ति ढूँढता है। यह एक गतिशील संपत्ति हो सकती है (CreateDynamicProperty/SetProperty द्वारा बनाई गई) या मूल संपत्ति (इसके नाम से पहचानी गई) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | निर्दिष्ट संपत्ति का मान प्राप्त करें |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | एक गतिशील संपत्ति को हटाता है। |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | नाम द्वारा पहचानी गई निर्दिष्ट संपत्ति को हटाएं |
| [SetEulerAngles](../../aspose.threed/transform/seteulerangles/)(double, double, double) | यूलर कोणों को वर्तमान परिवर्तन की डिग्री में सेट करता है। |
| [SetGeometricRotation](../../aspose.threed/transform/setgeometricrotation/)(double, double, double) | ज्यामितीय यूलर रोटेशन सेट करता है (डिग्री में मापा जाता है)। ज्यामितीय परिवर्तन केवल संलग्न संस्थाओं को प्रभावित करता है और चाइल्ड नोड्स को अप्रभावित छोड़ देता है। इसे स्थानीय परिवर्तन के रूप में विलय कर दिया जाएगा जब आप ज्यामितीय परिवर्तन को उन फ़ाइल प्रकारों में निर्यात करते हैं जो इसका समर्थन नहीं करते हैं। |
| [SetGeometricScaling](../../aspose.threed/transform/setgeometricscaling/)(double, double, double) | ज्यामितीय स्केलिंग सेट करता है। ज्यामितीय परिवर्तन केवल संलग्न संस्थाओं को प्रभावित करता है और चाइल्ड नोड्स को अप्रभावित छोड़ देता है। इसे स्थानीय परिवर्तन के रूप में विलय कर दिया जाएगा जब आप ज्यामितीय परिवर्तन को उन फ़ाइल प्रकारों में निर्यात करते हैं जो इसका समर्थन नहीं करते हैं। |
| [SetGeometricTranslation](../../aspose.threed/transform/setgeometrictranslation/)(double, double, double) | ज्यामितीय अनुवाद सेट करता है। ज्यामितीय परिवर्तन केवल संलग्न संस्थाओं को प्रभावित करता है और चाइल्ड नोड्स को अप्रभावित छोड़ देता है। इसे स्थानीय परिवर्तन के रूप में विलय कर दिया जाएगा जब आप ज्यामितीय परिवर्तन को उन फ़ाइल प्रकारों में निर्यात करते हैं जो इसका समर्थन नहीं करते हैं। |
| [SetPostRotation](../../aspose.threed/transform/setpostrotation/)(double, double, double) | डिग्री में दर्शाए गए पोस्ट-रोटेशन को सेट करता है |
| [SetPreRotation](../../aspose.threed/transform/setprerotation/)(double, double, double) | डिग्री में दर्शाए गए पूर्व-रोटेशन को सेट करता है |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | निर्दिष्ट संपत्ति का मान सेट करता है |
| [SetRotation](../../aspose.threed/transform/setrotation/)(double, double, double, double) | वर्तमान परिवर्तन के रोटेशन (चतुष्कोणीय घटकों के रूप में) सेट करता है। |
| [SetScale](../../aspose.threed/transform/setscale/)(double, double, double) | वर्तमान परिवर्तन का पैमाना सेट करता है। |
| [SetTranslation](../../aspose.threed/transform/settranslation/)(double, double, double) | वर्तमान परिवर्तन का अनुवाद सेट करता है। |

### यह सभी देखें

* class [A3DObject](../a3dobject/)
* नाम स्थान [Aspose.ThreeD](../../aspose.threed/)
* सभा [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
