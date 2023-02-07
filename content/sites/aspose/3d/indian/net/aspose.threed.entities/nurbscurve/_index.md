---
title: NurbsCurve
second_title: .NET API संदर्भ के लिए Aspose.3D
description: NURBS वक्रhttps//en.wikipedia.org/wiki/Nonuniform_rational_Bspline NURBS गैरसमन तर्कसंगत आधर पट्ट द्वर दर्शय गय एक वक्र है एक NURBS वक्र इसके द्वर परभषत कय गय हैOrder./nurbscurve/order/  भरत क एक सेटControlPoints./geometry/controlpoints/ और एKnotVectors./nurbscurve/knotvectors/ नयंत्रण बंदु में w घटक क उपयग नयंत्रण बंदु के वजन के रूप में कय जत है चहे वह कुछ भ हTwoDimensional यThreeDimensional
type: docs
weight: 460
url: /hi/net/aspose.threed.entities/nurbscurve/
---
## NurbsCurve class

[NURBS वक्र](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) NURBS (गैर-समान तर्कसंगत आधार पट्टी) द्वारा दर्शाया गया एक वक्र है, एक NURBS वक्र इसके द्वारा परिभाषित किया गया है[`Order`](./order/) , भारित का एक सेट[`ControlPoints`](../geometry/controlpoints/) और ए[`KnotVectors`](./knotvectors/) नियंत्रण बिंदु में w घटक का उपयोग नियंत्रण बिंदु के वजन के रूप में किया जाता है, चाहे वह कुछ भी होTwoDimensional याThreeDimensional

```csharp
public class NurbsCurve : Curve
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [NurbsCurve](nurbscurve/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`NurbsCurve` वर्ग. |
| [NurbsCurve](nurbscurve/#constructor_1)(string) | का एक नया उदाहरण प्रारंभ करता है`NurbsCurve` वर्ग. |

## गुण

| नाम | विवरण |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color/) { get; set; } | रेखा का रंग प्राप्त या सेट करता है, डिफ़ॉल्ट मान सफेद है (1, 1, 1) |
| [ControlPoints](../../aspose.threed.entities/nurbscurve/controlpoints/) { get; } | सभी नियंत्रण बिंदु प्राप्त करता है |
| [CurveType](../../aspose.threed.entities/nurbscurve/curvetype/) { get; set; } | वक्र के प्रकार को प्राप्त या सेट करता है। |
| [Dimension](../../aspose.threed.entities/nurbscurve/dimension/) { get; set; } | वक्र के आयाम को प्राप्त या सेट करता है। |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | हो जाता है या सेट करता है कि निर्यात के दौरान इस इकाई को बाहर करना है या नहीं। |
| [KnotVectors](../../aspose.threed.entities/nurbscurve/knotvectors/) { get; } | गाँठ वेक्टर प्राप्त करता है, यह पैरामीटर मानों का एक क्रम है जो यह निर्धारित करता है कि नियंत्रण बिंदु NURBS वक्र को कहाँ और कैसे प्रभावित करते हैं। |
| [Multiplicity](../../aspose.threed.entities/nurbscurve/multiplicity/) { get; } | बहुलता प्राप्त करता है। |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | नाम प्राप्त या सेट करता है। |
| [Order](../../aspose.threed.entities/nurbscurve/order/) { get; set; } | NURBS वक्र के क्रम को प्राप्त या सेट करता है, यह पास के नियंत्रण बिंदुओं की संख्या को परिभाषित करता है जो वक्र पर किसी दिए गए बिंदु को प्रभावित करते हैं। |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | पहले पैरेंट नोड को प्राप्त या सेट करता है, यदि पहला पैरेंट नोड सेट किया जाता है, तो यह इकाई अन्य पैरेंट नोड्स से अलग हो जाएगी। |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | सभी पैरेंट नोड्स प्राप्त करता है, ज्यामिति इंस्टेंसिंग के लिए एक इकाई को कई पैरेंट नोड्स से जोड़ा जा सकता है |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | सभी संपत्तियों का संग्रह प्राप्त करता है। |
| [Rational](../../aspose.threed.entities/nurbscurve/rational/) { get; set; } | हो जाता है या सेट करता है कि क्या यह तर्कसंगत है, यह मान इंगित करता है कि क्या यह`NurbsCurve` परिमेय तख़्ता या गैर-तर्कसंगत तख़्ता है। गैर-तर्कसंगत बी-तख़्ता तर्कसंगत बी-तख़्ता का एक विशेष मामला है। |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | दृश्य प्राप्त करता है कि यह वस्तु से संबंधित है |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Evaluate](../../aspose.threed.entities/nurbscurve/evaluate/)(int) | NURBS वक्र का मूल्यांकन करें |
| [EvaluateAt](../../aspose.threed.entities/nurbscurve/evaluateat/)(double) | निर्दिष्ट स्थिति पर वक्र के बिंदु का मूल्यांकन करें |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | संपत्ति ढूँढता है। यह एक गतिशील संपत्ति हो सकती है (CreateDynamicProperty/SetProperty द्वारा बनाई गई) या मूल संपत्ति (इसके नाम से पहचानी गई) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | अपने ऑब्जेक्ट स्पेस कोऑर्डिनेट सिस्टम में वर्तमान इकाई का बाउंडिंग बॉक्स प्राप्त करता है। |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey/)() | रेंडरर में पंजीकृत इकाई रेंडरर की कुंजी प्राप्त करता है |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | निर्दिष्ट संपत्ति का मान प्राप्त करें |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | एक गतिशील संपत्ति को हटाता है। |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | नाम द्वारा पहचानी गई निर्दिष्ट संपत्ति को हटाएं |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | निर्दिष्ट संपत्ति का मान सेट करता है |

### यह सभी देखें

* class [Curve](../curve/)
* नाम स्थान [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* सभा [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
