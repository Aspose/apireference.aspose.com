---
title: Mesh
second_title: .NET API संदर्भ के लिए Aspose.3D
description: एक जल कई nपक्षय बहुभुजं से बन हत है
type: docs
weight: 450
url: /hi/net/aspose.threed.entities/mesh/
---
## Mesh class

एक जाली कई n-पक्षीय बहुभुजों से बनी होती है।

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Mesh](mesh/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`Mesh` वर्ग. |
| [Mesh](mesh/#constructor_1)(Bitmap) | निर्दिष्ट ऊंचाई मानचित्र का उपयोग करके जाल का निर्माण करें, यदि ऊंचाई मानचित्र के पिक्सेल प्रारूप में एकाधिक घटक होते हैं, तो पहले (आमतौर पर लाल) घटक का उपयोग ऊंचाई मान के रूप में किया जाएगा (z) नियंत्रण बिंदु के x और y घटक सामान्यीकृत पिक्सेल समन्वय होते हैं . |
| [Mesh](mesh/#constructor_4)(string) | का एक नया उदाहरण प्रारंभ करता है`Mesh` वर्ग. |
| [Mesh](mesh/#constructor_2)(Bitmap, Matrix4) | निर्दिष्ट ऊंचाई मानचित्र का उपयोग करके जाल का निर्माण करें, यदि ऊंचाई मानचित्र के पिक्सेल प्रारूप में एकाधिक घटक होते हैं, तो पहले (आमतौर पर लाल) घटक का उपयोग ऊंचाई मान के रूप में किया जाएगा (z) नियंत्रण बिंदु के x और y घटक सामान्यीकृत पिक्सेल समन्वय होते हैं . |
| [Mesh](mesh/#constructor_3)(Bitmap, bool, Matrix4) | निर्दिष्ट ऊंचाई मानचित्र का उपयोग करके जाल का निर्माण करें, यदि ऊंचाई मानचित्र के पिक्सेल प्रारूप में एकाधिक घटक होते हैं, तो पहले (आमतौर पर लाल) घटक का उपयोग ऊंचाई मान के रूप में किया जाएगा (z) नियंत्रण बिंदु के x और y घटक सामान्यीकृत पिक्सेल समन्वय होते हैं . |

## गुण

| नाम | विवरण |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | हो जाता है या सेट करता है कि क्या यह ज्यामिति छाया डाल सकती है |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | सभी नियंत्रण बिंदु प्राप्त करता है |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | इस ज्यामिति से जुड़े सभी विकृतियों को प्राप्त करता है। |
| [Edges](../../aspose.threed.entities/mesh/edges/) { get; } | मेश के किनारों को प्राप्त करता है। जाल में किनारा वैकल्पिक है, इसलिए यह खाली हो सकता है। |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | हो जाता है या सेट करता है कि निर्यात के दौरान इस इकाई को बाहर करना है या नहीं। |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | नाम प्राप्त या सेट करता है। |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | पहले पैरेंट नोड को प्राप्त या सेट करता है, यदि पहला पैरेंट नोड सेट किया जाता है, तो यह इकाई अन्य पैरेंट नोड्स से अलग हो जाएगी। |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | सभी पैरेंट नोड्स प्राप्त करता है, ज्यामिति इंस्टेंसिंग के लिए एक इकाई को कई पैरेंट नोड्स से जोड़ा जा सकता है |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount/) { get; } | बहुभुजों की संख्या प्राप्त करता है |
| [Polygons](../../aspose.threed.entities/mesh/polygons/) { get; } | मेष की बहुभुज परिभाषा प्राप्त करता है |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | सभी संपत्तियों का संग्रह प्राप्त करता है। |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | हो जाता है या सेट करता है कि क्या यह ज्यामिति छाया प्राप्त कर सकती है। |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | दृश्य प्राप्त करता है कि यह वस्तु से संबंधित है |
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
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_2)(int[]) | में परिभाषित सभी शीर्षों के साथ एक नया बहुभुज बनाता है*indices* . वर्टेक्स द्वारा पॉलीगॉन वर्टेक्स बनाने के लिए, कृपया उपयोग करें[`PolygonBuilder`](../polygonbuilder/) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon)(int, int, int) | 3 कोने (त्रिकोण) के साथ एक बहुभुज बनाएँ |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_3)(int[], int, int) | में परिभाषित सभी शीर्षों के साथ एक नया बहुभुज बनाता है*indices* . वर्टेक्स द्वारा पॉलीगॉन वर्टेक्स बनाने के लिए, कृपया उपयोग करें[`PolygonBuilder`](../polygonbuilder/) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_1)(int, int, int, int) | 4 कोने (क्वाड) के साथ एक बहुभुज बनाएं |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | संपत्ति ढूँढता है। यह एक गतिशील संपत्ति हो सकती है (CreateDynamicProperty/SetProperty द्वारा बनाई गई) या मूल संपत्ति (इसके नाम से पहचानी गई) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | अपने ऑब्जेक्ट स्पेस कोऑर्डिनेट सिस्टम में वर्तमान इकाई का बाउंडिंग बॉक्स प्राप्त करता है। |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | निर्दिष्ट प्रकार के साथ शीर्ष तत्व प्राप्त करता है |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | रेंडरर में पंजीकृत इकाई रेंडरर की कुंजी प्राप्त करता है |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator/)() | प्रत्येक आंतरिक बहुभुज के लिए गणनाकर्ता प्राप्त करता है। |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize/)(int) | निर्दिष्ट बहुभुज की शीर्ष संख्या प्राप्त करता है। |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | निर्दिष्ट संपत्ति का मान प्राप्त करें |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | हो जाता है[`VertexElementUV`](../vertexelementuv/) दिए गए बनावट मानचित्रण प्रकार के साथ उदाहरण |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | एक गतिशील संपत्ति को हटाता है। |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | नाम द्वारा पहचानी गई निर्दिष्ट संपत्ति को हटाएं |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | निर्दिष्ट संपत्ति का मान सेट करता है |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh/)() | वर्तमान इकाई से मेष उदाहरण प्राप्त करता है। |

### उदाहरण

जाल में बहुभुज जोड़ने के लिए: जाल में सभी बहुभुजों के माध्यम से यात्रा करें:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    // बहुभुज से निपटें
}
```

### यह सभी देखें

* class [Geometry](../geometry/)
* interface [IMeshConvertible](../imeshconvertible/)
* नाम स्थान [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* सभा [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
