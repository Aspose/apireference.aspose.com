---
title: Aspose.ThreeD.Entities
second_title: .NET API संदर्भ के लिए Aspose.3D
description: सभ ज्यमत और इकइयं इस नमस्थन में परभषत हैं
type: docs
weight: 40
url: /hi/net/aspose.threed.entities/
---
सभी ज्यामिति और इकाइयां इस नामस्थान में परिभाषित हैं

## कक्षाओं

| कक्षा | विवरण |
| --- | --- |
| [Box](./box/) | बॉक्स. |
| [Camera](./camera/) | कैमरा दृश्य को देख रहे दर्शक की आंखों के बिंदु का वर्णन करता है। |
| [Circle](./circle/) | ए[`Circle`](../aspose.threed.entities/circle/) वक्र में वृत्त के आकार के किनारे बिंदुओं का एक समूह होता है। |
| [CompositeCurve](./compositecurve/) | ए[`CompositeCurve`](../aspose.threed.entities/compositecurve/) कई वक्र खंडों से मिलकर बना है। |
| [Curve](./curve/) | सभी वक्र कार्यान्वयनों का आधार वर्ग। |
| [Cylinder](./cylinder/) | पैरामीटरयुक्त सिलेंडर। इसका उपयोग शंकु का प्रतिनिधित्व करने के लिए भी किया जा सकता है जब त्रिज्या शीर्ष / त्रिज्या तल में से एक शून्य है। |
| [Dish](./dish/) | पैरामीटरयुक्त डिश। |
| [Ellipse](./ellipse/) | एक[`Ellipse`](../aspose.threed.entities/ellipse/)बिंदु के एक सेट को परिभाषित करता है जो दीर्घवृत्त का आकार बनाता है। |
| [Frustum](./frustum/) | का आधार वर्ग[`Camera`](../aspose.threed.entities/camera/) और[`Light`](../aspose.threed.entities/light/) |
| [Geometry](./geometry/) | सभी रेंडर करने योग्य ज्यामितीय वस्तुओं का आधार वर्ग (जैसे[`Mesh`](../aspose.threed.entities/mesh/) ,[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) ,[`Patch`](../aspose.threed.entities/patch/) और आदि. |
| [Light](./light/) | प्रकाश दृश्य को रोशन करता है। |
| [Line](./line/) | एक पॉलीलाइन एक पथ है जिसे बिंदुओं के एक समूह द्वारा परिभाषित किया गया है[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints/) , और द्वारा जुड़ा हुआ है[`Segments`](../aspose.threed.entities/line/segments/) , जिसका अर्थ है कि यह कनेक्टेड लाइन सेगमेंट का एक सेट भी हो सकता है। लाइन आमतौर पर एक रैखिक वस्तु है, जिसका अर्थ है कि वक्र का प्रतिनिधित्व करने के लिए इसका उपयोग वक्र का प्रतिनिधित्व करने के लिए नहीं किया जा सकता है, इसका उपयोग करता है[`NurbsCurve`](../aspose.threed.entities/nurbscurve/) . |
| [LinearExtrusion](./linearextrusion/) | रैखिक एक्सट्रूज़न इनपुट के रूप में 2D आकार लेता है और आकार को तीसरे आयाम में बढ़ाता है। |
| [Mesh](./mesh/) | एक जाली कई n-पक्षीय बहुभुजों से बनी होती है। |
| [NurbsCurve](./nurbscurve/) | [NURBS वक्र](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) NURBS (गैर-समान तर्कसंगत आधार पट्टी) द्वारा दर्शाया गया एक वक्र है, एक NURBS वक्र इसके द्वारा परिभाषित किया गया है[`Order`](../aspose.threed.entities/nurbscurve/order/) , भारित का एक सेट[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints/) और ए[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors/) नियंत्रण बिंदु में w घटक का उपयोग नियंत्रण बिंदु के वजन के रूप में किया जाता है, चाहे वह कुछ भी होTwoDimensional याThreeDimensional |
| [NurbsDirection](./nurbsdirection/) | एक 3डी[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) दो दिशा है,[`U`](../aspose.threed.entities/nurbssurface/u/) और[`V`](../aspose.threed.entities/nurbssurface/v/) , द[`NurbsDirection`](../aspose.threed.entities/nurbsdirection/) प्रत्येक दिशा के लिए डेटा को परिभाषित करता है। एक दिशा वास्तव में एक NURBS वक्र है, जिसका अर्थ है कि यह इसके द्वारा भी परिभाषित किया गया है[`Order`](../aspose.threed.entities/nurbsdirection/order/) , ए[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors/) , और भारित नियंत्रण बिंदुओं का एक सेट (में परिभाषित[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) . |
| [NurbsSurface](./nurbssurface/) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface/) द्वारा प्रदर्शित सतह है[NURBS (गैर-समान तर्कसंगत आधार तख़्ता)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) ए[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) दो द्वारा परिभाषित किया गया है[`NurbsDirection`](../aspose.threed.entities/nurbsdirection/)[`U`](../aspose.threed.entities/nurbssurface/u/) और[`V`](../aspose.threed.entities/nurbssurface/v/) . नियंत्रण बिंदु में w घटक का उपयोग नियंत्रण बिंदु के वजन के रूप में किया जाता है, चाहे दिशा का प्रकार कोई भी होTwoDimensional याThreeDimensional |
| [Patch](./patch/) | ए[`Patch`](../aspose.threed.entities/patch/) एक पैरामीट्रिक मॉडलिंग सतह है, के समान[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) , इसे दो द्वारा भी परिभाषित किया गया है[`PatchDirection`](../aspose.threed.entities/patchdirection/) , द[`U`](../aspose.threed.entities/patch/u/) और[`V`](../aspose.threed.entities/patch/v/) . लेकिन के बीच अंतर[`Patch`](../aspose.threed.entities/patch/) और[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) है कि[`PatchDirection`](../aspose.threed.entities/patchdirection/) वक्र इनमें से एक हो सकता हैBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline औरLinear |
| [PatchDirection](./patchdirection/) | पैच की U और V दिशा. |
| [Plane](./plane/) | पैरामीटरयुक्त विमान। |
| [PointCloud](./pointcloud/) | पॉइंट क्लाउड में कोई टोपोलॉजी जानकारी नहीं है, लेकिन केवल नियंत्रण बिंदु और वर्टेक्स तत्व हैं। |
| [PolygonBuilder](./polygonbuilder/) | बहुभुज बनाने के लिए एक सहायक वर्ग[`Mesh`](../aspose.threed.entities/mesh/) |
| [PolygonModifier](./polygonmodifier/) | बहुभुजों को संशोधित करने की उपयोगिता |
| [Primitive](./primitive/) | सभी प्रिमिटिव के लिए बेस क्लास |
| [Pyramid](./pyramid/) | पैरामीटरयुक्त पिरामिड। |
| [RectangularTorus](./rectangulartorus/) | पैरामीटरयुक्त आयताकार टोरस. |
| [RevolvedAreaSolid](./revolvedareasolid/) | यह वर्ग एक अक्ष के बारे में एक प्रोफ़ाइल द्वारा प्रदान किए गए क्रॉस सेक्शन को घुमाकर एक ठोस मॉडल का प्रतिनिधित्व करता है। |
| [Shape](./shape/) | आकार नियंत्रण बिंदुओं के एक सेट पर विरूपण का वर्णन करता है, जो माया में क्लस्टर डिफॉर्मर के समान है। उदाहरण के लिए, हम निर्मित ज्यामिति में एक आकृति जोड़ सकते हैं। और आकार और ज्यामिति में समान सांस्थितिक जानकारी है लेकिन नियंत्रण बिंदुओं की स्थिति अलग है। अलग-अलग मात्रा में प्रभाव के साथ, ज्यामिति विरूपण प्रभाव करती है। |
| [Skeleton](./skeleton/) | द[`Skeleton`](../aspose.threed.entities/skeleton/)कंकाल संरचना के परिवर्तन में हेरफेर करने के लिए डिजाइनर की मदद करने के लिए मुख्य रूप से सीएडी सॉफ्टवेयर द्वारा उपयोग किया जाता है, यह आमतौर पर सीएडी सॉफ्टवेयर के बाहर बेकार है।[`Skeleton`](../aspose.threed.entities/skeleton/) रूट के रूप में नोड सेटिंग द्वारा[`Type`](../aspose.threed.entities/skeleton/type/) कोSkeleton , और सभी बच्चे इस पर सेट हैंBone |
| [Sphere](./sphere/) | पैरामीटरयुक्त क्षेत्र। |
| [SweptAreaSolid](./sweptareasolid/) | ए[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid/) एक डाइरेक्ट्री के साथ एक प्रोफ़ाइल को स्वीप करके एक ज्यामिति का निर्माण करता है. |
| [Torus](./torus/) | पैरामिट्रीकृत टोरस. |
| [TransformedCurve](./transformedcurve/) | ए[`TransformedCurve`](../aspose.threed.entities/transformedcurve/) ट्रांसफ़ॉर्मेशन मैट्रिक्स का इस्तेमाल करके कर्व को प्लेसमेंट देता है. यह a के अंदर ट्रांसफ़ॉर्मेशन करने की अनुमति देता है[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve/) या[`CompositeCurve`](../aspose.threed.entities/compositecurve/) . |
| [TriMesh](./trimesh/) | एक ट्राइमेश में अपरिष्कृत डेटा होता है जिसका उपयोग GPU द्वारा सीधे किया जा सकता है। यह वर्ग एक जाल बनाने में मदद करने के लिए एक उपयोगिता है जिसमें केवल प्रति-वर्टेक्स डेटा होता है। |
| [TriMesh&lt;T&gt;](./trimesh-1/) | का सामान्य संस्करण[`TriMesh`](../aspose.threed.entities/trimesh/) उपयोगकर्ता के स्थैतिक-परिभाषित शीर्ष प्रकार के लिए |
| [TrimmedCurve](./trimmedcurve/) | एक बंधा हुआ वक्र जिसने आधार वक्र को दोनों सिरों पर ट्रिम किया। |
| [VertexElement](./vertexelement/) | शीर्ष तत्वों का आधार वर्ग। एक शीर्ष तत्व प्रकार की पहचान VertexElementType द्वारा की जाती है। एक VertexElement वर्णन करता है कि वर्टेक्स तत्व को एक ज्यामिति सतह पर कैसे मैप किया जाता है और मैपिंग जानकारी को मेमोरी में कैसे व्यवस्थित किया जाता है। वर्टेक्स एलिमेंट में नॉर्मल, यूवी या अन्य प्रकार की जानकारी होती है। |
| [VertexElementBinormal](./vertexelementbinormal/) | निर्दिष्ट घटकों के लिए असामान्य वैक्टर को परिभाषित करता है। |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate/) | कंक्रीट को परिभाषित करने के लिए एक सहायक वर्ग[`VertexElement`](../aspose.threed.entities/vertexelement/) कार्यान्वयन. |
| [VertexElementEdgeCrease](./vertexelementedgecrease/) | निर्दिष्ट घटकों के लिए किनारे की क्रीज को परिभाषित करता है |
| [VertexElementHole](./vertexelementhole/) | परिभाषित करता है कि निर्दिष्ट बहुभुज छेद है |
| [VertexElementIntsTemplate](./vertexelementintstemplate/) | कंक्रीट को परिभाषित करने के लिए एक सहायक वर्ग[`VertexElement`](../aspose.threed.entities/vertexelement/) कार्यान्वयन. |
| [VertexElementMaterial](./vertexelementmaterial/) | निर्दिष्ट घटकों के लिए सामग्री सूचकांक को परिभाषित करता है। एक नोड में कई सामग्री हो सकती है, द[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial/) विभिन्न सामग्रियों में ज्यामिति के विभिन्न भाग को प्रस्तुत करने के लिए उपयोग किया जाता है। |
| [VertexElementNormal](./vertexelementnormal/) | निर्दिष्ट घटकों के लिए सामान्य वैक्टर को परिभाषित करता है। |
| [VertexElementPolygonGroup](./vertexelementpolygongroup/) | निर्दिष्ट घटकों के लिए बहुभुज समूह को संबंधित बहुभुजों को एक साथ समूहित करने के लिए परिभाषित करता है। |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup/) | एक चौरसाई समूह एक बहुभुज जाल में बहुभुजों का एक समूह है जो एक चिकनी सतह बनाने के लिए प्रकट होना चाहिए। |
| [VertexElementSpecular](./vertexelementspecular/) | निर्दिष्ट घटकों के लिए विशेष रंग परिभाषित करता है। |
| [VertexElementTangent](./vertexelementtangent/) | निर्दिष्ट घटकों के लिए स्पर्शरेखा वैक्टर को परिभाषित करता है। |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1/) | कंक्रीट को परिभाषित करने के लिए एक सहायक वर्ग[`VertexElement`](../aspose.threed.entities/vertexelement/) कार्यान्वयन. |
| [VertexElementUserData](./vertexelementuserdata/) | निर्दिष्ट घटकों के लिए कस्टम उपयोगकर्ता डेटा परिभाषित करता है। आमतौर पर यह विशेष उद्देश्य के लिए एप्लिकेशन-विशिष्ट डेटा होता है। |
| [VertexElementUV](./vertexelementuv/) | निर्दिष्ट घटकों के लिए यूवी निर्देशांक परिभाषित करता है। एक ज्यामिति में एकाधिक हो सकते हैं[`VertexElementUV`](../aspose.threed.entities/vertexelementuv/) तत्व, और हर एक अलग है[`TextureMapping`](../aspose.threed.entities/texturemapping/) s. |
| [VertexElementVector4](./vertexelementvector4/) | कंक्रीट को परिभाषित करने के लिए एक सहायक वर्ग[`VertexElement`](../aspose.threed.entities/vertexelement/) कार्यान्वयन. |
| [VertexElementVertexColor](./vertexelementvertexcolor/) | निर्दिष्ट घटकों के लिए शीर्ष रंग परिभाषित करता है |
| [VertexElementVertexCrease](./vertexelementvertexcrease/) | निर्दिष्ट घटकों के लिए वर्टेक्स क्रीज को परिभाषित करता है |
| [VertexElementVisibility](./vertexelementvisibility/) | परिभाषित करता है कि क्या निर्दिष्ट घटक दृश्यमान हैं |
| [VertexElementWeight](./vertexelementweight/) | निर्दिष्ट घटकों के लिए मिश्रण वजन को परिभाषित करता है। |
## संरचनाएं

| संरचना | विवरण |
| --- | --- |
| [EndPoint](./endpoint/) | वक्र को ट्रिम करने के लिए अंतिम बिंदु, एक पैरामीटर मान या कार्टेशियन बिंदु हो सकता है। |
## इंटरफेस

| इंटरफेस | विवरण |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement/) | इंडेक्स डेटा के साथ VertexElement. |
| [IMeshConvertible](./imeshconvertible/) | इस इंटरफ़ेस को लागू करने वाली संस्थाओं को परिवर्तित किया जा सकता है[`Mesh`](../aspose.threed.entities/mesh/) |
| [IOrientable](./iorientable/) | ओरिएंटेबल संस्थाएं इस इंटरफ़ेस को लागू करेंगी। |
## गणना

| गणना | विवरण |
| --- | --- |
| [ApertureMode](./aperturemode/) | कैमरा एपर्चर मोड। एपर्चर मोड यह निर्धारित करता है कि कौन से मान कैमरा एपर्चर को संचालित करते हैं। यदि एपर्चर मोड हॉरिज़एंडवर्ट, हॉरिज़ॉन्टल या वर्टिकल है, तो फ़ील्ड ऑफ़ व्यू का उपयोग किया जाता है। यदि एपर्चर मोड फोकल लम्बाई है, तो फोकल लम्बाई का उपयोग किया जाता है। |
| [CurveDimension](./curvedimension/) | वक्रों का आयाम। |
| [LightType](./lighttype/) | प्रकाश प्रकार। |
| [MappingMode](./mappingmode/) | तय करता है कि एलिमेंट को सतह पर कैसे मैप किया जाता है. द[`MappingMode`](../aspose.threed.entities/mappingmode/) कैसे परिभाषित किया[`VertexElement`](../aspose.threed.entities/vertexelement/) ज्यामिति की सतह पर मैप किया जाता है. |
| [NurbsType](./nurbstype/) | NURBS प्रकार. |
| [PatchDirectionType](./patchdirectiontype/) | पैच दिशा के प्रकार. |
| [ProjectionType](./projectiontype/) | कैमरे के प्रक्षेपण प्रकार। |
| [ReferenceMode](./referencemode/) | [`ReferenceMode`](../aspose.threed.entities/referencemode/) परिभाषित करता है कि मानचित्रण जानकारी कैसे संग्रहीत और संदर्भित की जाती है. |
| [RotationMode](./rotationmode/) | छिन्नक का घूर्णन मोड |
| [SkeletonType](./skeletontype/) | [`Skeleton`](../aspose.threed.entities/skeleton/) एस प्रकार. |
| [SplitMeshPolicy](./splitmeshpolicy/) | सब-मेश के बीच शीर्ष/नियंत्रण बिंदु डेटा साझा करें या प्रत्येक सब-मेश का अपना संकुचित डेटा होता है। |
| [TextureMapping](./texturemapping/) | के लिए टेक्सचर मैपिंग प्रकार[`VertexElementUV`](../aspose.threed.entities/vertexelementuv/) वर्णन करता है कि किस प्रकार की बनावट मानचित्रण का उपयोग किया जाता है। |
| [VertexElementType](./vertexelementtype/) | शीर्ष तत्व का प्रकार, परिभाषित किया गया है कि मॉडलिंग में इसका उपयोग कैसे किया जाएगा। |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
