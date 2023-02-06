---
title: Cylinder
second_title: .NET API संदर्भ के लिए Aspose.3D
description: पैरमटरयुक्त सलेंडर इसक उपयग शंकु क प्रतनधत्व करने के लए भ कय ज सकत है जब त्रज्य शर्ष / त्रज्य तल में से एक शून्य है
type: docs
weight: 310
url: /hi/net/aspose.threed.entities/cylinder/
---
## Cylinder class

पैरामीटरयुक्त सिलेंडर। इसका उपयोग शंकु का प्रतिनिधित्व करने के लिए भी किया जा सकता है जब त्रिज्या शीर्ष / त्रिज्या तल में से एक शून्य है।

```csharp
public class Cylinder : Primitive
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Cylinder](cylinder/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`Cylinder` वर्ग. |
| [Cylinder](cylinder/#constructor_1)(double, double) | का एक नया उदाहरण प्रारंभ करता है`Cylinder` वर्ग. |
| [Cylinder](cylinder/#constructor_2)(double, double, double) | का एक नया उदाहरण प्रारंभ करता है`Cylinder` वर्ग. |
| [Cylinder](cylinder/#constructor_3)(double, double, double, int, int, bool) | का एक नया उदाहरण प्रारंभ करता है`Cylinder` वर्ग. |
| [Cylinder](cylinder/#constructor_4)(string, double, double, double, int, int, bool, double, double) | का एक नया उदाहरण प्रारंभ करता है`Cylinder` वर्ग. |

## गुण

| नाम | विवरण |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows/) { get; set; } | हो जाता है या सेट करता है कि क्या यह ज्यामिति छाया डाल सकती है |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | हो जाता है या सेट करता है कि निर्यात के दौरान इस इकाई को बाहर करना है या नहीं। |
| [GenerateFanCylinder](../../aspose.threed.entities/cylinder/generatefancylinder/) { get; set; } | जब थीटालेंथ 2*PI से कम हो तो फैन-स्टाइल सिलेंडर जेनरेट करना है या नहीं, अन्यथा मॉडल कट नहीं होगा। |
| [Height](../../aspose.threed.entities/cylinder/height/) { get; set; } | सिलेंडर की ऊंचाई प्राप्त या सेट करता है। |
| [HeightSegments](../../aspose.threed.entities/cylinder/heightsegments/) { get; set; } | ऊंचाई खंड प्राप्त या सेट करता है। |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | नाम प्राप्त या सेट करता है। |
| [OffsetBottom](../../aspose.threed.entities/cylinder/offsetbottom/) { get; set; } | नीचे की तरफ वर्टिकल ट्रांसफॉर्मेशन ऑफ़सेट हो जाता है या सेट हो जाता है। |
| [OffsetTop](../../aspose.threed.entities/cylinder/offsettop/) { get; set; } | शीर्ष पक्ष के वर्टिकल ट्रांसफ़ॉर्मेशन ऑफ़सेट को प्राप्त या सेट करता है। |
| [OpenEnded](../../aspose.threed.entities/cylinder/openended/) { get; set; } | एक मान प्राप्त करता है या सेट करता है जो दर्शाता है कि यह`Cylinder` ओपन एंडेड। डिफ़ॉल्ट मान गलत है। |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | पहले पैरेंट नोड को प्राप्त या सेट करता है, यदि पहला पैरेंट नोड सेट किया जाता है, तो यह इकाई अन्य पैरेंट नोड्स से अलग हो जाएगी। |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | सभी पैरेंट नोड्स प्राप्त करता है, ज्यामिति इंस्टेंसिंग के लिए एक इकाई को कई पैरेंट नोड्स से जोड़ा जा सकता है |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | सभी संपत्तियों का संग्रह प्राप्त करता है। |
| [RadialSegments](../../aspose.threed.entities/cylinder/radialsegments/) { get; set; } | रेडियल सेगमेंट प्राप्त या सेट करता है। |
| [RadiusBottom](../../aspose.threed.entities/cylinder/radiusbottom/) { get; set; } | सिलेंडर के निचले ढक्कन की त्रिज्या प्राप्त या सेट करता है। |
| [RadiusTop](../../aspose.threed.entities/cylinder/radiustop/) { get; set; } | सिलेंडर के टॉप कैप की त्रिज्या प्राप्त या सेट करता है। |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows/) { get; set; } | हो जाता है या सेट करता है कि क्या यह ज्यामिति छाया प्राप्त कर सकती है। |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | दृश्य प्राप्त करता है कि यह वस्तु से संबंधित है |
| [ShearBottom](../../aspose.threed.entities/cylinder/shearbottom/) { get; set; } | नीचे की ओर के कतरनी परिवर्तन को प्राप्त या सेट करता है, वेक्टर (x- अक्ष, z- अक्ष) कतरनी मान को संग्रहीत करता है जिसे रेडियन में मापा जाता है, डिफ़ॉल्ट मान (0, 0) है |
| [ShearTop](../../aspose.threed.entities/cylinder/sheartop/) { get; set; } | शीर्ष पक्ष के कतरनी परिवर्तन के सेट या सेट, वेक्टर रेडियन में मापा गया (x- अक्ष, z- अक्ष) कतरनी मान संग्रहीत करता है, डिफ़ॉल्ट मान (0, 0) है |
| [ThetaLength](../../aspose.threed.entities/cylinder/thetalength/) { get; set; } | थीटा की लंबाई प्राप्त या सेट करता है। डिफ़ॉल्ट मान 2π. है |
| [ThetaStart](../../aspose.threed.entities/cylinder/thetastart/) { get; set; } | थीटा स्टार्ट प्राप्त या सेट करता है। डिफ़ॉल्ट मान 0. है |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | संपत्ति ढूँढता है। यह एक गतिशील संपत्ति हो सकती है (CreateDynamicProperty/SetProperty द्वारा बनाई गई) या मूल संपत्ति (इसके नाम से पहचानी गई) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | अपने ऑब्जेक्ट स्पेस कोऑर्डिनेट सिस्टम में वर्तमान इकाई का बाउंडिंग बॉक्स प्राप्त करता है। |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | रेंडरर में पंजीकृत इकाई रेंडरर की कुंजी प्राप्त करता है |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | निर्दिष्ट संपत्ति का मान प्राप्त करें |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | एक गतिशील संपत्ति को हटाता है। |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | नाम द्वारा पहचानी गई निर्दिष्ट संपत्ति को हटाएं |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | निर्दिष्ट संपत्ति का मान सेट करता है |
| override [ToMesh](../../aspose.threed.entities/cylinder/tomesh/)() | वर्तमान वस्तु को मेश में बदलें |

### यह सभी देखें

* class [Primitive](../primitive/)
* नाम स्थान [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* सभा [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
