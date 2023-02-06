---
title: Shape
second_title: .NET API संदर्भ के लिए Aspose.3D
description: आकर नयंत्रण बंदुओं के एक सेट पर वरूपण क वर्णन करत है ज मय में क्लस्टर डफर्मर के समन है उदहरण के लए हम नर्मत ज्यमत में एक आकृत जड़ सकते हैं और आकर और ज्यमत में समन संस्थतक जनकर है लेकन नयंत्रण बंदुओं क स्थत अलग है अलगअलग मत्र में प्रभव के सथ ज्यमत वरूपण प्रभव करत है
type: docs
weight: 640
url: /hi/net/aspose.threed.entities/shape/
---
## Shape class

आकार नियंत्रण बिंदुओं के एक सेट पर विरूपण का वर्णन करता है, जो माया में क्लस्टर डिफॉर्मर के समान है। उदाहरण के लिए, हम निर्मित ज्यामिति में एक आकृति जोड़ सकते हैं। और आकार और ज्यामिति में समान सांस्थितिक जानकारी है लेकिन नियंत्रण बिंदुओं की स्थिति अलग है। अलग-अलग मात्रा में प्रभाव के साथ, ज्यामिति विरूपण प्रभाव करती है।

```csharp
public class Shape : Geometry
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Shape](shape/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`Shape` वर्ग. |
| [Shape](shape/#constructor_1)(string) | का एक नया उदाहरण प्रारंभ करता है`Shape` वर्ग. |

## गुण

| नाम | विवरण |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | हो जाता है या सेट करता है कि क्या यह ज्यामिति छाया डाल सकती है |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | सभी नियंत्रण बिंदु प्राप्त करता है |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | इस ज्यामिति से जुड़े सभी विकृतियों को प्राप्त करता है। |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | हो जाता है या सेट करता है कि निर्यात के दौरान इस इकाई को बाहर करना है या नहीं। |
| [Indices](../../aspose.threed.entities/shape/indices/) { get; } | सूचकांक प्राप्त करता है। |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | नाम प्राप्त या सेट करता है। |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | पहले पैरेंट नोड को प्राप्त या सेट करता है, यदि पहला पैरेंट नोड सेट किया जाता है, तो यह इकाई अन्य पैरेंट नोड्स से अलग हो जाएगी। |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | सभी पैरेंट नोड्स प्राप्त करता है, ज्यामिति इंस्टेंसिंग के लिए एक इकाई को कई पैरेंट नोड्स से जोड़ा जा सकता है |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | सभी संपत्तियों का संग्रह प्राप्त करता है। |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | हो जाता है या सेट करता है कि क्या यह ज्यामिति छाया प्राप्त कर सकती है। |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | दृश्य प्राप्त करता है कि यह वस्तु से संबंधित है |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements/) { get; } | सभी शीर्ष तत्व प्राप्त करता है |
| [Visible](../../aspose.threed.entities/geometry/visible/) { get; set; } | यदि ज्यामिति दृश्यमान है तो हो जाता है या सेट हो जाता है |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [FromControlPoints](../../aspose.threed.entities/shape/fromcontrolpoints/)(params Vector3[]) | डिफ़ॉल्ट सूचकांकों के साथ निर्दिष्ट नियंत्रण बिंदुओं के साथ एक आकार बनाएं। |
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

### यह सभी देखें

* class [Geometry](../geometry/)
* नाम स्थान [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* सभा [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
