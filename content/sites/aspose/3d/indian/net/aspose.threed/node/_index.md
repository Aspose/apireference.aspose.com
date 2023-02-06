---
title: Node
second_title: .NET API संदर्भ के लिए Aspose.3D
description: दृश्य ग्रफ में एक तत्व क प्रतनधत्व करत है एक दृश्य ग्रफ नड वस्तुओं क एक पेड़ है वृक्ष प्रबंधन सेवएं इस वर्ग में नहत हैं ध्यन दें क Aspose.3D SDK नर्मत दृश्य ग्रफ क वैधत क परक्षण नहं करत है यह सुनश्चत करन कल करने वले क जम्मेदर है क यह नड पदनुक्रम में चक्रय ग्रफ उत्पन्न नहं करत है ट्र प्रबंधन के अलव यह वर्ग दृश्य में वस्तु क स्थत क वर्णन करने के लए आवश्यक सभ गुणं क परभषत करत है इस जनकर में मूल अनुवद रटेशन और स्केलंग गुण शमल हैं और पवट्स लमट्स और IK जड़ं के लए अधक उन्नत वकल्प जैसे क कठरत और नम जब इसे पहल बर बनय जत है त नड ऑब्जेक्ट खल हत है यन यह है बन कस चत्रमय प्रतनधत्व के एक वस्तु जसमें केवल स्थत क जनकर हत है इस अवस्थ में इसक उपयग नड ट्र संरचन में मतपत क प्रतनधत्व करने के लए कय ज सकत है लेकन बहुत अधक नहं इस प्रकर क वस्तुओं क समन्य उपयग उन्हें एक इकई जड़न है ज नड क वशेषज्ञ हग इकई देखें इकई अपने आप में एक वस्तु है और नड से जुड़ है इसक मतलब यह भ है क एक ह इकई क कई नड्स के बच सझ कय ज सकत है कैमर लइट मेश आद... सभ नकय हैं और वे सभ बेस क्लस Entity. से व्युत्पन्न हैं
type: docs
weight: 1470
url: /hi/net/aspose.threed/node/
---
## Node class

दृश्य ग्राफ में एक तत्व का प्रतिनिधित्व करता है। एक दृश्य ग्राफ नोड वस्तुओं का एक पेड़ है। वृक्ष प्रबंधन सेवाएं इस वर्ग में निहित हैं। ध्यान दें कि Aspose.3D SDK निर्मित दृश्य ग्राफ की वैधता का परीक्षण नहीं करता है। यह सुनिश्चित करना कॉल करने वाले की जिम्मेदारी है कि यह नोड पदानुक्रम में चक्रीय ग्राफ उत्पन्न नहीं करता है। ट्री प्रबंधन के अलावा, यह वर्ग दृश्य में वस्तु की स्थिति का वर्णन करने के लिए आवश्यक सभी गुणों को परिभाषित करता है। इस जानकारी में मूल अनुवाद, रोटेशन और स्केलिंग गुण शामिल हैं और पिवोट्स, लिमिट्स और IK जोड़ों के लिए अधिक उन्नत विकल्प जैसे कि कठोरता और नमी। जब इसे पहली बार बनाया जाता है, तो नोड ऑब्जेक्ट "खाली" होता है (यानी: यह है) बिना किसी चित्रमय प्रतिनिधित्व के एक वस्तु जिसमें केवल स्थिति की जानकारी होती है)। इस अवस्था में, इसका उपयोग नोड ट्री संरचना में माता-पिता का प्रतिनिधित्व करने के लिए किया जा सकता है, लेकिन बहुत अधिक नहीं। इस प्रकार की वस्तुओं का सामान्य उपयोग उन्हें एक इकाई जोड़ना है जो नोड का विशेषज्ञ होगा ("इकाई" देखें)। इकाई अपने आप में एक वस्तु है और नोड से जुड़ी है। इसका मतलब यह भी है कि एक ही इकाई को कई नोड्स के बीच साझा किया जा सकता है। कैमरा, लाइट, मेश, आदि... सभी निकाय हैं और वे सभी बेस क्लास Entity. से व्युत्पन्न हैं

```csharp
public class Node : SceneObject
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Node](node/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`Node` वर्ग. |
| [Node](node/#constructor_1)(string) | का एक नया उदाहरण प्रारंभ करता है`Node` वर्ग. |
| [Node](node/#constructor_2)(string, Entity) | का एक नया उदाहरण प्रारंभ करता है`Node` वर्ग. |

## गुण

| नाम | विवरण |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo/) { get; set; } | प्रति-नोड संपत्ति की जानकारी |
| [ChildNodes](../../aspose.threed/node/childnodes/) { get; } | चिल्ड्रन नोड प्राप्त करता है। |
| [Entities](../../aspose.threed/node/entities/) { get; } | सभी नोड निकाय प्राप्त करता है. |
| [Entity](../../aspose.threed/node/entity/) { get; set; } | इस नोड से जुड़ी पहली इकाई को प्राप्त या सेट करता है, यदि सेट होता है, तो अन्य संस्थाओं को हटा देगा। |
| [Excluded](../../aspose.threed/node/excluded/) { get; set; } | निर्यात के दौरान इस नोड और सभी चाइल्ड नोड्स/इकाइयों को बाहर करने के लिए या सेट करता है या सेट करता है। |
| [GlobalTransform](../../aspose.threed/node/globaltransform/) { get; } | वैश्विक परिवर्तन प्राप्त करता है। |
| [Material](../../aspose.threed/node/material/) { get; set; } | इस नोड से जुड़ी पहली सामग्री को प्राप्त या सेट करता है, यदि सेट करता है, तो अन्य सामग्रियों को साफ़ कर देगा |
| [Materials](../../aspose.threed/node/materials/) { get; } | इस नोड से संबंधित सामग्री प्राप्त करता है। |
| [MetaDatas](../../aspose.threed/node/metadatas/) { get; } | इस नोड में परिभाषित मेटा डेटा प्राप्त करता है। |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | नाम प्राप्त या सेट करता है। |
| [ParentNode](../../aspose.threed/node/parentnode/) { get; set; } | मूल नोड प्राप्त या सेट करता है। |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | सभी संपत्तियों का संग्रह प्राप्त करता है। |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | दृश्य प्राप्त करता है कि यह वस्तु से संबंधित है |
| [Transform](../../aspose.threed/node/transform/) { get; } | स्थानीय परिवर्तन प्राप्त करता है। |
| [Visible](../../aspose.threed/node/visible/) { get; set; } | नोड दिखाने के लिए हो जाता है या सेट हो जाता है |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Accept](../../aspose.threed/node/accept/)(NodeVisitor) | सभी वंशज नोड्स (वर्तमान नोड सहित) के माध्यम से चलता है और विज़िटर को नोड के साथ कॉल करता है। विज़िटर गलत वापस करके वॉक-थ्रू तोड़ सकता है |
| [AddChildNode](../../aspose.threed/node/addchildnode/)(Node) | इस नोड में चाइल्ड नोड जोड़ें |
| [AddEntity](../../aspose.threed/node/addentity/)(Entity) | नोड में एक इकाई जोड़ें. |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode)() | चाइल्ड नोड बनाता है |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_1)(Entity) | संलग्न इकाई के साथ एक नया चाइल्ड नोड बनाएं |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_2)(string) | दिए गए नोड नाम के साथ एक नया चाइल्ड नोड बनाएं |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_3)(string, Entity) | दिए गए नोड नाम के साथ एक नया चाइल्ड नोड बनाएं |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_4)(string, Entity, Material) | दिए गए नोड नाम के साथ एक नया चाइल्ड नोड बनाएं, और निर्दिष्ट इकाई और एक सामग्री संलग्न करें |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform/)(bool) | वैश्विक परिवर्तन का मूल्यांकन करें, ज्यामितीय परिवर्तन शामिल करें या नहीं। |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | संपत्ति ढूँढता है। यह एक गतिशील संपत्ति हो सकती है (CreateDynamicProperty/SetProperty द्वारा बनाई गई) या मूल संपत्ति (इसके नाम से पहचानी गई) |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox/)() | नोड के बाउंडिंग बॉक्स की गणना करें |
| [GetChild](../../aspose.threed/node/getchild/#getchild)(int) | निर्दिष्ट इंडेक्स पर चाइल्ड नोड प्राप्त करता है। |
| [GetChild](../../aspose.threed/node/getchild/#getchild_1)(string) | निर्दिष्ट नाम के साथ चाइल्ड नोड प्राप्त करता है |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity/)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | निर्दिष्ट संपत्ति का मान प्राप्त करें |
| [Merge](../../aspose.threed/node/merge/)(Node) | नोड के अंतर्गत सब कुछ अलग करें और उन्हें वर्तमान नोड से जोड़ें। |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | एक गतिशील संपत्ति को हटाता है। |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | नाम द्वारा पहचानी गई निर्दिष्ट संपत्ति को हटाएं |
| [SelectObjects](../../aspose.threed/node/selectobjects/)(string) | XPath-जैसी क्वेरी सिंटैक्स का उपयोग करके वर्तमान नोड के अंतर्गत एकाधिक ऑब्जेक्ट चुनें. |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject/)(string) | XPath-जैसी क्वेरी सिंटैक्स का उपयोग करके वर्तमान नोड के अंतर्गत एकल ऑब्जेक्ट का चयन करें। |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | निर्दिष्ट संपत्ति का मान सेट करता है |
| override [ToString](../../aspose.threed/node/tostring/)() | इस नोड का स्ट्रिंग प्रतिनिधित्व प्राप्त करता है। |

### यह सभी देखें

* class [SceneObject](../sceneobject/)
* नाम स्थान [Aspose.ThreeD](../../aspose.threed/)
* सभा [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
