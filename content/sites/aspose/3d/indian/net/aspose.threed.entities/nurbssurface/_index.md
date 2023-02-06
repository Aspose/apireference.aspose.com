---
title: NurbsSurface
second_title: .NET API संदर्भ के लिए Aspose.3D
description: NurbsSurface./nurbssurface/ द्वर प्रदर्शत सतह हैNURBS गैरसमन तर्कसंगत आधर तख़्तhttps//en.wikipedia.org/wiki/Nonuniform_rational_Bspline एNurbsSurface./nurbssurface/ द द्वर परभषत कय गय हैNurbsDirection./nurbsdirection/U./nurbssurface/u/ औरV./nurbssurface/v/ . नयंत्रण बंदु में w घटक क उपयग नयंत्रण बंदु के वजन के रूप में कय जत है चहे दश क प्रकर कई भ हTwoDimensional यThreeDimensional
type: docs
weight: 480
url: /hi/net/aspose.threed.entities/nurbssurface/
---
## NurbsSurface class

`NurbsSurface` द्वारा प्रदर्शित सतह है[NURBS (गैर-समान तर्कसंगत आधार तख़्ता)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) ए`NurbsSurface` दो द्वारा परिभाषित किया गया है[`NurbsDirection`](../nurbsdirection/)[`U`](./u/) और[`V`](./v/) . नियंत्रण बिंदु में w घटक का उपयोग नियंत्रण बिंदु के वजन के रूप में किया जाता है, चाहे दिशा का प्रकार कोई भी होTwoDimensional याThreeDimensional

```csharp
public class NurbsSurface : Geometry, IMeshConvertible
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [NurbsSurface](nurbssurface/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`NurbsSurface` वर्ग. |
| [NurbsSurface](nurbssurface/#constructor_1)(string) | का एक नया उदाहरण प्रारंभ करता है`NurbsSurface` वर्ग. |

## गुण

| नाम | विवरण |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | हो जाता है या सेट करता है कि क्या यह ज्यामिति छाया डाल सकती है |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | सभी नियंत्रण बिंदु प्राप्त करता है |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | इस ज्यामिति से जुड़े सभी विकृतियों को प्राप्त करता है। |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | हो जाता है या सेट करता है कि निर्यात के दौरान इस इकाई को बाहर करना है या नहीं। |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | नाम प्राप्त या सेट करता है। |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | पहले पैरेंट नोड को प्राप्त या सेट करता है, यदि पहला पैरेंट नोड सेट किया जाता है, तो यह इकाई अन्य पैरेंट नोड्स से अलग हो जाएगी। |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | सभी पैरेंट नोड्स प्राप्त करता है, ज्यामिति इंस्टेंसिंग के लिए एक इकाई को कई पैरेंट नोड्स से जोड़ा जा सकता है |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | सभी संपत्तियों का संग्रह प्राप्त करता है। |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | हो जाता है या सेट करता है कि क्या यह ज्यामिति छाया प्राप्त कर सकती है। |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | दृश्य प्राप्त करता है कि यह वस्तु से संबंधित है |
| [U](../../aspose.threed.entities/nurbssurface/u/) { get; } | NURBS सतह की U दिशा प्राप्त करता है |
| [V](../../aspose.threed.entities/nurbssurface/v/) { get; } | NURBS सतह की V दिशा प्राप्त करता है |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements/) { get; } | सभी शीर्ष तत्व प्राप्त करता है |
| [Visible](../../aspose.threed.entities/geometry/visible/) { get; set; } | यदि ज्यामिति दृश्यमान है तो हो जाता है या सेट हो जाता है |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement/)(VertexElement) | मौजूदा ज्यामिति में मौजूदा वर्टेक्स तत्व जोड़ता है |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType) | निर्दिष्ट प्रकार के साथ शीर्ष तत्व बनाता है और इसे ज्यामिति में जोड़ता है। |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType, MappingMode, ReferenceMode) | निर्दिष्ट प्रकार के साथ शीर्ष तत्व बनाता है और इसे ज्यामिति में जोड़ता है। |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping) | एक बनाता है[`VertexElementUV`](../vertexelementuv/) दिए गए टेक्सचर मैपिंग प्रकार के साथ. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping, MappingMode, ReferenceMode) | एक बनाता है[`VertexElementUV`](../vertexelementuv/) दिए गए टेक्सचर मैपिंग प्रकार के साथ. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | संपत्ति ढूँढता है। यह एक गतिशील संपत्ति हो सकती है (CreateDynamicProperty/SetProperty द्वारा बनाई गई) या मूल संपत्ति (इसके नाम से पहचानी गई) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | अपने ऑब्जेक्ट स्पेस कोऑर्डिनेट सिस्टम में वर्तमान इकाई का बाउंडिंग बॉक्स प्राप्त करता है। |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | निर्दिष्ट प्रकार के साथ शीर्ष तत्व प्राप्त करता है |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | रेंडरर में पंजीकृत इकाई रेंडरर की कुंजी प्राप्त करता है |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | निर्दिष्ट संपत्ति का मान प्राप्त करें |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | हो जाता है[`VertexElementUV`](../vertexelementuv/) दिए गए बनावट मानचित्रण प्रकार के साथ उदाहरण |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | एक गतिशील संपत्ति को हटाता है। |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | नाम द्वारा पहचानी गई निर्दिष्ट संपत्ति को हटाएं |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | निर्दिष्ट संपत्ति का मान सेट करता है |
| [ToMesh](../../aspose.threed.entities/nurbssurface/tomesh/)() | NURBS सतह को मेश में बदलें |

### यह सभी देखें

* class [Geometry](../geometry/)
* interface [IMeshConvertible](../imeshconvertible/)
* नाम स्थान [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* सभा [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
