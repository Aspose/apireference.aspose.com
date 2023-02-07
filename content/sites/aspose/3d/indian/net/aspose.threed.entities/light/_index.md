---
title: Light
second_title: .NET API संदर्भ के लिए Aspose.3D
description: प्रकश दृश्य क रशन करत है
type: docs
weight: 400
url: /hi/net/aspose.threed.entities/light/
---
## Light class

प्रकाश दृश्य को रोशन करता है।

प्रकाश के कुल क्षीणन की गणना करने का सूत्र है: `ए = कॉन्स्टेंट एटेन्यूएशन + (डिस्ट * लीनियर एटेन्यूएशन) + ((डिस्ट ^ 2) * क्वाड्रैटिक एटेन्यूएशन)`

```csharp
public class Light : Frustum
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Light](light/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`Light` वर्ग. |
| [Light](light/#constructor_1)(string) | का एक नया उदाहरण प्रारंभ करता है`Light` वर्ग. |
| [Light](light/#constructor_2)(string, LightType) | का एक नया उदाहरण प्रारंभ करता है`Light` वर्ग. |

## गुण

| नाम | विवरण |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect/) { get; set; } | frustum का पक्षानुपात प्राप्त या सेट करता है |
| [CastLight](../../aspose.threed.entities/light/castlight/) { get; set; } | हो जाता है या सेट हो जाता है यदि वर्तमान प्रकाश उदाहरण अन्य वस्तुओं को रोशन कर सकता है। |
| [CastShadows](../../aspose.threed.entities/light/castshadows/) { get; set; } | हो जाता है या सेट हो जाता है यदि प्रकाश अन्य वस्तुओं पर छाया डाल सकता है। |
| [Color](../../aspose.threed.entities/light/color/) { get; set; } | प्रकाश का रंग प्राप्त या सेट करता है |
| [ConstantAttenuation](../../aspose.threed.entities/light/constantattenuation/) { get; set; } | प्रकाश के कुल क्षीणन की गणना करने के लिए निरंतर क्षीणन प्राप्त या सेट करता है |
| [Direction](../../aspose.threed.entities/frustum/direction/) { get; set; } | उस दिशा को प्राप्त या सेट करता है जिसे कैमरा देख रहा है। इस संपत्ति में परिवर्तन भी प्रभावित करेगा[`LookAt`](../frustum/lookat/) और[`Target`](../frustum/target/) . |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | हो जाता है या सेट करता है कि निर्यात के दौरान इस इकाई को बाहर करना है या नहीं। |
| [Falloff](../../aspose.threed.entities/light/falloff/) { get; set; } | फ़ॉलऑफ़ कोन कोण प्राप्त करता है या सेट करता है (डिग्री में). |
| [FarPlane](../../aspose.threed.entities/frustum/farplane/) { get; set; } | छिन्नक के दूर तल की दूरी प्राप्त या सेट करता है। |
| [HotSpot](../../aspose.threed.entities/light/hotspot/) { get; set; } | हॉट स्पॉट कोन कोण (डिग्री में) प्राप्त या सेट करता है। |
| [Intensity](../../aspose.threed.entities/light/intensity/) { get; set; } | प्रकाश की तीव्रता प्राप्त या सेट करता है, डिफ़ॉल्ट मान 100 है |
| [LightType](../../aspose.threed.entities/light/lighttype/) { get; set; } | प्रकाश के प्रकार को प्राप्त या सेट करता है |
| [LinearAttenuation](../../aspose.threed.entities/light/linearattenuation/) { get; set; } | प्रकाश के कुल क्षीणन की गणना करने के लिए रैखिक क्षीणन प्राप्त करता है या सेट करता है |
| [LookAt](../../aspose.threed.entities/frustum/lookat/) { get; set; } | कैमरे द्वारा देखी जा रही रुचि की स्थिति को प्राप्त या सेट करता है। |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | नाम प्राप्त या सेट करता है। |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane/) { get; set; } | छिन्नक के निकट समतल दूरी को प्राप्त या सेट करता है। |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight/) { get; set; } | ऑर्थोग्राफिक प्रोजेक्शन में फ्रस्टम होने पर ऊंचाई प्राप्त या सेट करता है। |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | पहले पैरेंट नोड को प्राप्त या सेट करता है, यदि पहला पैरेंट नोड सेट किया जाता है, तो यह इकाई अन्य पैरेंट नोड्स से अलग हो जाएगी। |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | सभी पैरेंट नोड्स प्राप्त करता है, ज्यामिति इंस्टेंसिंग के लिए एक इकाई को कई पैरेंट नोड्स से जोड़ा जा सकता है |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | सभी संपत्तियों का संग्रह प्राप्त करता है। |
| [QuadraticAttenuation](../../aspose.threed.entities/light/quadraticattenuation/) { get; set; } | प्रकाश के कुल क्षीणन की गणना करने के लिए द्विघात क्षीणन प्राप्त या सेट करता है |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode/) { get; set; } | छिन्नक के ओरिएंटेशन मोड को प्राप्त या सेट करता है यह गुण तभी काम करता है जब[`Target`](../frustum/target/) शून्य है। यदि मान हैFixedTarget , दिशा की गणना हमेशा गुण द्वारा की जाती है[`LookAt`](../frustum/lookat/) अन्यथा[`LookAt`](../frustum/lookat/)द्वारा हमेशा गणना की जाती है[`Direction`](../frustum/direction/) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | दृश्य प्राप्त करता है कि यह वस्तु से संबंधित है |
| [ShadowColor](../../aspose.threed.entities/light/shadowcolor/) { get; set; } | छाया का रंग प्राप्त या सेट करता है। |
| [Target](../../aspose.threed.entities/frustum/target/) { get; set; } | उस लक्ष्य को प्राप्त या सेट करता है जिसे कैमरा देख रहा है। यदि उपयोगकर्ता इस संपत्ति का समर्थन करता है, तो यह पहले होना चाहिए[`LookAt`](../frustum/lookat/) संपत्ति. |
| [Up](../../aspose.threed.entities/frustum/up/) { get; set; } | कैमरे की दिशा प्राप्त करता है या सेट करता है |

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

### यह सभी देखें

* class [Frustum](../frustum/)
* नाम स्थान [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* सभा [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
