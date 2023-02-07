---
title: TriMesh
second_title: .NET API संदर्भ के लिए Aspose.3D
description: एक ट्रइमेश में अपरष्कृत डेट हत है जसक उपयग GPU द्वर सधे कय ज सकत है यह वर्ग एक जल बनने में मदद करने के लए एक उपयगत है जसमें केवल प्रतवर्टेक्स डेट हत है
type: docs
weight: 730
url: /hi/net/aspose.threed.entities/trimesh/
---
## TriMesh class

एक ट्राइमेश में अपरिष्कृत डेटा होता है जिसका उपयोग GPU द्वारा सीधे किया जा सकता है। यह वर्ग एक जाल बनाने में मदद करने के लिए एक उपयोगिता है जिसमें केवल प्रति-वर्टेक्स डेटा होता है।

```csharp
public class TriMesh : Entity, IEnumerable<Vertex>
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [TriMesh](trimesh/)(string, VertexDeclaration) | का एक उदाहरण प्रारंभ करें`TriMesh` |

## गुण

| नाम | विवरण |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity/) { get; } | पूर्व-आवंटित शीर्षों की क्षमता. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | हो जाता है या सेट करता है कि निर्यात के दौरान इस इकाई को बाहर करना है या नहीं। |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount/) { get; } | इसमें सूचकांकों की संख्या`TriMesh` |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | नाम प्राप्त या सेट करता है। |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | पहले पैरेंट नोड को प्राप्त या सेट करता है, यदि पहला पैरेंट नोड सेट किया जाता है, तो यह इकाई अन्य पैरेंट नोड्स से अलग हो जाएगी। |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | सभी पैरेंट नोड्स प्राप्त करता है, ज्यामिति इंस्टेंसिंग के लिए एक इकाई को कई पैरेंट नोड्स से जोड़ा जा सकता है |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | सभी संपत्तियों का संग्रह प्राप्त करता है। |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | दृश्य प्राप्त करता है कि यह वस्तु से संबंधित है |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount/) { get; } | मर्ज न किए गए शीर्षों की संख्या जो इससे होकर गुजरे हैं[`BeginVertex`](./beginvertex/) और[`EndVertex`](./endvertex/) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration/) { get; } | का वर्टेक्स लेआउट`TriMesh` . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount/) { get; } | इसमें शीर्षों की संख्या`TriMesh` |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes/) { get; } | बाइट्स में सभी कोने का कुल आकार |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [CopyFrom](../../aspose.threed.entities/trimesh/copyfrom/)(TriMesh, VertexDeclaration) | कॉपी करें`TriMesh`नए वर्टेक्स लेआउट के साथ इनपुट से |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh/#frommesh)(Mesh, bool) | दिए गए मेश ऑब्जेक्ट से एक ट्राइमेश बनाएं, वर्टेक्स डिक्लेरेशन इनपुट मेश की संरचना पर आधारित है। |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh/#frommesh_1)(VertexDeclaration, Mesh) | दिए गए शीर्ष लेआउट के साथ दिए गए मेश ऑब्जेक्ट से एक TriMesh बनाएं। |
| static [FromRawData](../../aspose.threed.entities/trimesh/fromrawdata/)(VertexDeclaration, byte[], int[], bool) | कच्चे डेटा से TriMesh बनाएं |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex/)() | वर्टेक्स जोड़ना शुरू करें |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex/)() | वर्टेक्स जोड़ना समाप्त करें |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | संपत्ति ढूँढता है। यह एक गतिशील संपत्ति हो सकती है (CreateDynamicProperty/SetProperty द्वारा बनाई गई) या मूल संपत्ति (इसके नाम से पहचानी गई) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | अपने ऑब्जेक्ट स्पेस कोऑर्डिनेट सिस्टम में वर्तमान इकाई का बाउंडिंग बॉक्स प्राप्त करता है। |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | रेंडरर में पंजीकृत इकाई रेंडरर की कुंजी प्राप्त करता है |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator/)() | गणना करने के लिए एन्यूमरेटर प्राप्त करें[`Vertex`](../../aspose.threed.utilities/vertex/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | निर्दिष्ट संपत्ति का मान प्राप्त करें |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/#indicestoarray)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/#indicestoarray_1)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes/)(byte[]) | बाइट्स से वर्टिकल लोड करें, बाइट्स की लंबाई वर्टेक्स आकार का पूर्णांक मल्टीपल होना चाहिए। |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble/)(int, VertexField) | दोहरा क्षेत्र पढ़ें |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat/)(int, VertexField) | फ्लोट फ़ील्ड पढ़ें |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2/)(int, VertexField) | वेक्टर2 फ़ील्ड पढ़ें |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3/)(int, VertexField) | वेक्टर3 फ़ील्ड पढ़ें |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4/)(int, VertexField) | वेक्टर4 फ़ील्ड पढ़ें |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2/)(int, VertexField) | वेक्टर2 फ़ील्ड पढ़ें |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3/)(int, VertexField) | वेक्टर3 फ़ील्ड पढ़ें |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4/)(int, VertexField) | वेक्टर4 फ़ील्ड पढ़ें |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | एक गतिशील संपत्ति को हटाता है। |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | नाम द्वारा पहचानी गई निर्दिष्ट संपत्ति को हटाएं |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | निर्दिष्ट संपत्ति का मान सेट करता है |
| override [ToString](../../aspose.threed.entities/trimesh/tostring/)() | का स्ट्रिंग प्रतिनिधित्व प्राप्त करता है`TriMesh` |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray/)() | वर्टिकल डेटा को बाइट array में बदलें |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto/)(Stream) | सूचकांक डेटा को स्ट्रीम के 16 बिट पूर्णांक के रूप में लिखें |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto/)(Stream) | सूचकांक डेटा को स्ट्रीम के 32 बिट पूर्णांक के रूप में लिखें |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto/)(Stream) | वर्टिकल डेटा को निर्दिष्ट स्ट्रीम में लिखें |

### यह सभी देखें

* class [Entity](../../aspose.threed/entity/)
* class [Vertex](../../aspose.threed.utilities/vertex/)
* नाम स्थान [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* सभा [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
