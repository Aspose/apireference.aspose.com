---
title: Scene
second_title: .NET API संदर्भ के लिए Aspose.3D
description: एक दृश्य एक शर्षस्तरय वस्तु है जसमें नड्स ज्यमत समग्र बनवट एनमेशन पज़ उपदृश्य और आद शमल हैं दृश्य में उपदृश्य ह सकते हैं कलड/ब्लेंडर जैस फ़इलं में बहुदस्तवेज़ समर्थन के रूप में कर्य करत है /fbx नड पदनुक्रम के मध्यम से पहुँच ज सकत हैRootNode./scene/rootnode/Library./scene/library/ क्रमंकन जैसे मेट डेट य कस्टम ऑब्जेक्ट के दरन अनसक्त वस्तुओं क संदर्भ रखने के लए उपयग कय जत है इसलए इसे पुस्तकलय के रूप में उपयग कय ज सकत है
type: docs
weight: 2250
url: /hi/net/aspose.threed/scene/
---
## Scene class

एक दृश्य एक शीर्ष-स्तरीय वस्तु है जिसमें नोड्स, ज्यामिति, सामग्री, बनावट, एनीमेशन, पोज़, उप-दृश्य और आदि शामिल हैं। दृश्य में उप-दृश्य हो सकते हैं, कोलाडा/ब्लेंडर जैसी फ़ाइलों में बहु-दस्तावेज़ समर्थन के रूप में कार्य करता है /fbx नोड पदानुक्रम के माध्यम से पहुँचा जा सकता है[`RootNode`](./rootnode/)[`Library`](./library/) क्रमांकन (जैसे मेटा डेटा या कस्टम ऑब्जेक्ट) के दौरान अनासक्त वस्तुओं का संदर्भ रखने के लिए उपयोग किया जाता है, इसलिए इसे पुस्तकालय के रूप में उपयोग किया जा सकता है।

```csharp
public class Scene : SceneObject
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Scene](scene/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`Scene` वर्ग. |
| [Scene](scene/#constructor_1)(Entity) | का एक नया उदाहरण प्रारंभ करता है`Scene` एक नए नोड से जुड़ी इकाई के साथ वर्ग। |
| [Scene](scene/#constructor_2)(Scene, string) | का एक नया उदाहरण प्रारंभ करता है`Scene`उप-दृश्य के रूप में वर्ग। |

## गुण

| नाम | विवरण |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips/) { get; } | सब हो जाता है[`AnimationClip`](../../aspose.threed.animation/animationclip/) दृश्य में परिभाषित. |
| [AssetInfo](../../aspose.threed/scene/assetinfo/) { get; set; } | शीर्ष-स्तरीय संपत्ति जानकारी प्राप्त या सेट करता है |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip/) { get; set; } | सक्रिय हो जाता है या सेट करता है[`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [Library](../../aspose.threed/scene/library/) { get; } | दृश्य पदानुक्रम में प्रत्यक्ष रूप से उपयोग नहीं की जाने वाली वस्तुओं को लाइब्रेरी में परिभाषित किया जा सकता है। यह तब उपयोगी होता है जब आप उप-दृश्यों का उपयोग कर रहे हों और पुन: प्रयोज्य घटकों को उप-दृश्यों के अंतर्गत रखें। |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | नाम प्राप्त या सेट करता है। |
| [Poses](../../aspose.threed/scene/poses/) { get; } | सब हो जाता है[`Pose`](../pose/) इस सीन में इस्तेमाल किया गया है. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | सभी संपत्तियों का संग्रह प्राप्त करता है। |
| [RootNode](../../aspose.threed/scene/rootnode/) { get; } | सीन का रूट नोड प्राप्त करता है। |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | दृश्य प्राप्त करता है कि यह वस्तु से संबंधित है |
| [SubScenes](../../aspose.threed/scene/subscenes/) { get; } | सभी उप-दृश्यों को प्राप्त करता है |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile)(string) | दिए गए पथ से दृश्य खोलता है |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_3)(string, CancellationToken) | दिए गए पथ से दृश्य खोलता है |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_1)(string, FileFormat, CancellationToken) | निर्दिष्ट फ़ाइल प्रारूप का उपयोग करके दिए गए पथ से दृश्य खोलता है। |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_2)(string, LoadOptions, CancellationToken) | निर्दिष्ट फ़ाइल प्रारूप का उपयोग करके दिए गए पथ से दृश्य खोलता है। |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_2)(Stream, CancellationToken) | दिए गए स्ट्रीम से दृश्य खोलता है |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream)(Stream, FileFormat, CancellationToken) | निर्दिष्ट फ़ाइल प्रारूप का उपयोग करके दिए गए स्ट्रीम से दृश्य खोलता है। |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_1)(Stream, LoadOptions, CancellationToken) | निर्दिष्ट IO कॉन्फ़िगरेशन का उपयोग करके दिए गए स्ट्रीम से दृश्य खोलता है। |
| [Clear](../../aspose.threed/scene/clear/)() | दृश्य सामग्री को साफ़ करता है और डिफ़ॉल्ट सेटिंग्स को पुनर्स्थापित करता है। |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip/)(string) | बनाने और पंजीकृत करने के लिए एक आशुलिपि समारोह[`AnimationClip`](../../aspose.threed.animation/animationclip/) पहला[`AnimationClip`](../../aspose.threed.animation/animationclip/) को सौंपा जाएगा[`CurrentAnimationClip`](./currentanimationclip/) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | संपत्ति ढूँढता है। यह एक गतिशील संपत्ति हो सकती है (CreateDynamicProperty/SetProperty द्वारा बनाई गई) या मूल संपत्ति (इसके नाम से पहचानी गई) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip/)(string) | नाम हो जाता है[`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | निर्दिष्ट संपत्ति का मान प्राप्त करें |
| [Open](../../aspose.threed/scene/open/#open)(Stream) | दिए गए स्ट्रीम से दृश्य खोलता है |
| [Open](../../aspose.threed/scene/open/#open_4)(string) | दिए गए पथ से दृश्य खोलता है |
| [Open](../../aspose.threed/scene/open/#open_3)(Stream, CancellationToken) | दिए गए स्ट्रीम से दृश्य खोलता है |
| [Open](../../aspose.threed/scene/open/#open_8)(string, CancellationToken) | दिए गए पथ से दृश्य खोलता है |
| [Open](../../aspose.threed/scene/open/#open_6)(string, LoadOptions) | निर्दिष्ट फ़ाइल प्रारूप का उपयोग करके दिए गए पथ से दृश्य खोलता है। |
| [Open](../../aspose.threed/scene/open/#open_1)(Stream, FileFormat, CancellationToken) | निर्दिष्ट फ़ाइल प्रारूप का उपयोग करके दिए गए स्ट्रीम से दृश्य खोलता है। |
| [Open](../../aspose.threed/scene/open/#open_2)(Stream, LoadOptions, CancellationToken) | निर्दिष्ट IO कॉन्फ़िगरेशन का उपयोग करके दिए गए स्ट्रीम से दृश्य खोलता है। |
| [Open](../../aspose.threed/scene/open/#open_5)(string, FileFormat, CancellationToken) | निर्दिष्ट फ़ाइल प्रारूप का उपयोग करके दिए गए पथ से दृश्य खोलता है। |
| [Open](../../aspose.threed/scene/open/#open_7)(string, LoadOptions, CancellationToken) | निर्दिष्ट फ़ाइल प्रारूप का उपयोग करके दिए गए पथ से दृश्य खोलता है। |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | एक गतिशील संपत्ति को हटाता है। |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | नाम द्वारा पहचानी गई निर्दिष्ट संपत्ति को हटाएं |
| [Render](../../aspose.threed/scene/render/#render)(Camera, Bitmap) | दिए गए कैमरे के दृष्टिकोण से दृश्य को बिटमैप में प्रस्तुत करें। |
| [Render](../../aspose.threed/scene/render/#render_2)(Camera, string) | दिए गए कैमरे के दृष्टिकोण से दृश्य को बाहरी फ़ाइल में प्रस्तुत करें। डिफ़ॉल्ट आउटपुट आकार 1024x768 है और आउटपुट स्वरूप png है |
| [Render](../../aspose.threed/scene/render/#render_1)(Camera, Bitmap, ImageRenderOptions) | दिए गए कैमरे के दृष्टिकोण से दृश्य को बिटमैप में प्रस्तुत करें। |
| [Render](../../aspose.threed/scene/render/#render_3)(Camera, string, Size, ImageFormat) | दिए गए कैमरे के दृष्टिकोण से दृश्य को बाहरी फ़ाइल में प्रस्तुत करें। |
| [Render](../../aspose.threed/scene/render/#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | दिए गए कैमरे के दृष्टिकोण से दृश्य को बाहरी फ़ाइल में प्रस्तुत करें। |
| [Save](../../aspose.threed/scene/save/#save_4)(string) | निर्दिष्ट फ़ाइल स्वरूप का उपयोग करके दृश्य को निर्दिष्ट पथ पर सहेजता है। |
| [Save](../../aspose.threed/scene/save/#save)(Stream, FileFormat) | निर्दिष्ट फ़ाइल प्रारूप का उपयोग करके दृश्य को स्ट्रीम करने के लिए सहेजता है। |
| [Save](../../aspose.threed/scene/save/#save_2)(Stream, SaveOptions) | निर्दिष्ट फ़ाइल प्रारूप का उपयोग करके दृश्य को स्ट्रीम करने के लिए सहेजता है। |
| [Save](../../aspose.threed/scene/save/#save_5)(string, FileFormat) | निर्दिष्ट फ़ाइल स्वरूप का उपयोग करके दृश्य को निर्दिष्ट पथ पर सहेजता है। |
| [Save](../../aspose.threed/scene/save/#save_7)(string, SaveOptions) | निर्दिष्ट फ़ाइल स्वरूप का उपयोग करके दृश्य को निर्दिष्ट पथ पर सहेजता है। |
| [Save](../../aspose.threed/scene/save/#save_1)(Stream, FileFormat, CancellationToken) | निर्दिष्ट फ़ाइल प्रारूप का उपयोग करके दृश्य को स्ट्रीम करने के लिए सहेजता है। |
| [Save](../../aspose.threed/scene/save/#save_3)(Stream, SaveOptions, CancellationToken) | निर्दिष्ट फ़ाइल प्रारूप का उपयोग करके दृश्य को स्ट्रीम करने के लिए सहेजता है। |
| [Save](../../aspose.threed/scene/save/#save_6)(string, FileFormat, CancellationToken) | निर्दिष्ट फ़ाइल स्वरूप का उपयोग करके दृश्य को निर्दिष्ट पथ पर सहेजता है। |
| [Save](../../aspose.threed/scene/save/#save_8)(string, SaveOptions, CancellationToken) | निर्दिष्ट फ़ाइल स्वरूप का उपयोग करके दृश्य को निर्दिष्ट पथ पर सहेजता है। |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | निर्दिष्ट संपत्ति का मान सेट करता है |

### यह सभी देखें

* class [SceneObject](../sceneobject/)
* नाम स्थान [Aspose.ThreeD](../../aspose.threed/)
* सभा [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
