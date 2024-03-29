---
title: RevolvedAreaSolid
second_title: .NET API संदर्भ के लिए Aspose.3D
description: यह वर्ग एक अक्ष के बरे में एक प्रफ़इल द्वर प्रदन कए गए क्रस सेक्शन क घुमकर एक ठस मडल क प्रतनधत्व करत है
type: docs
weight: 620
url: /hi/net/aspose.threed.entities/revolvedareasolid/
---
## RevolvedAreaSolid class

यह वर्ग एक अक्ष के बारे में एक प्रोफ़ाइल द्वारा प्रदान किए गए क्रॉस सेक्शन को घुमाकर एक ठोस मॉडल का प्रतिनिधित्व करता है।

```csharp
public class RevolvedAreaSolid : Entity, IMeshConvertible
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [RevolvedAreaSolid](revolvedareasolid/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |

## गुण

| नाम | विवरण |
| --- | --- |
| [AngleEnd](../../aspose.threed.entities/revolvedareasolid/angleend/) { get; set; } | रेडियन में मापी गई परिक्रामी प्रक्रिया के अंत कोण को प्राप्त या सेट करता है, डिफ़ॉल्ट मान pi. है |
| [AngleStart](../../aspose.threed.entities/revolvedareasolid/anglestart/) { get; set; } | घूमने वाली प्रक्रिया के शुरुआती कोण को प्राप्त या सेट करता है, रेडियन में मापा जाता है, डिफ़ॉल्ट मान 0. है |
| [Axis](../../aspose.threed.entities/revolvedareasolid/axis/) { get; set; } | अक्ष दिशा प्राप्त या सेट करता है, डिफ़ॉल्ट मान (0, 1, 0) है। |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | हो जाता है या सेट करता है कि निर्यात के दौरान इस इकाई को बाहर करना है या नहीं। |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | नाम प्राप्त या सेट करता है। |
| [Origin](../../aspose.threed.entities/revolvedareasolid/origin/) { get; set; } | घूमने वाले के मूल बिंदु को प्राप्त या सेट करता है, डिफ़ॉल्ट मान है (0, 0, 0). |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | पहले पैरेंट नोड को प्राप्त या सेट करता है, यदि पहला पैरेंट नोड सेट किया जाता है, तो यह इकाई अन्य पैरेंट नोड्स से अलग हो जाएगी। |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | सभी पैरेंट नोड्स प्राप्त करता है, ज्यामिति इंस्टेंसिंग के लिए एक इकाई को कई पैरेंट नोड्स से जोड़ा जा सकता है |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | सभी संपत्तियों का संग्रह प्राप्त करता है। |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | दृश्य प्राप्त करता है कि यह वस्तु से संबंधित है |
| [Shape](../../aspose.threed.entities/revolvedareasolid/shape/) { get; set; } | घूमने के लिए उपयोग की जाने वाली आधार प्रोफ़ाइल प्राप्त या सेट करता है। |

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
| [ToMesh](../../aspose.threed.entities/revolvedareasolid/tomesh/)() | कनवर्ट करें`RevolvedAreaSolid` एक जाल में। |

### यह सभी देखें

* class [Entity](../../aspose.threed/entity/)
* interface [IMeshConvertible](../imeshconvertible/)
* नाम स्थान [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* सभा [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
