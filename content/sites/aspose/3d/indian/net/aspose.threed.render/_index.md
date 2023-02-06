---
title: Aspose.ThreeD.Render
second_title: .NET API संदर्भ के लिए Aspose.3D
description: सभ रेंडरंग संबंधत वर्ग इस नेमस्पेस में परभषत हैं
type: docs
weight: 70
url: /hi/net/aspose.threed.render/
---
सभी रेंडरिंग संबंधित वर्ग इस नेमस्पेस में परिभाषित हैं

## कक्षाओं

| कक्षा | विवरण |
| --- | --- |
| [DescriptorSetUpdater](./descriptorsetupdater/) | यह वर्ग अद्यतन करने की अनुमति देता है[`IDescriptorSet`](../aspose.threed.render/idescriptorset/) एक चेन ऑपरेशन में. |
| [DriverException](./driverexception/) | आंतरिक रेंडरिंग ड्राइवरों द्वारा उठाया गया अपवाद। |
| [EntityRenderer](./entityrenderer/) | विभिन्न प्रकार की संस्थाओं के लिए रेंडरिंग लागू करने के लिए इसे उपवर्गित करें। |
| [EntityRendererKey](./entityrendererkey/) | पंजीकृत इकाई रेंडरर की कुंजी |
| [GLSLSource](./glslsource/) | GLSL में शेडर्स का स्रोत कोड |
| [InitializationException](./initializationexception/) | रेंडर पाइपलाइन आरंभीकरण में अपवाद |
| [PostProcessing](./postprocessing/) | प्रसंस्करण के बाद के प्रभाव |
| [PushConstant](./pushconstant/) | पुश कांस्टेंट के माध्यम से शेडर को डेटा प्रदान करने के लिए एक उपयोगिता। |
| [Renderer](./renderer/) | रेंडरर के बारे में संदर्भ. |
| [RendererVariableManager](./renderervariablemanager/) | यह क्लास रेंडरिंग में इस्तेमाल किए गए वेरिएबल्स को मैनेज करती है |
| [RenderFactory](./renderfactory/) | RenderFactory सभी संसाधन बनाता है जो पाइपलाइन रेंडरिंग में प्रतिनिधित्व करते हैं। |
| [RenderParameters](./renderparameters/) | रेंडर टारगेट के पैरामीटर का वर्णन करें |
| [RenderResource](./renderresource/) | सभी रेंडर संसाधनों का सार वर्ग रेंडरर जारी होने पर सभी रेंडर संसाधनों का निपटारा किया जाएगा। जैसे वर्ग[`Mesh`](../aspose.threed.entities/mesh/)/[`Texture`](../aspose.threed.shading/texture/) एक संगत RenderResource होगा |
| [RenderState](./renderstate/) | पाइपलाइन के निर्माण के लिए रेंडर स्टेट रेंडर स्टेट पर किए गए बदलाव बनाए गए पाइपलाइन इंस्टेंसेस को प्रभावित नहीं करेंगे। |
| [ShaderException](./shaderexception/) | शेडर संबंधित अपवाद |
| [ShaderProgram](./shaderprogram/) | शेडर प्रोग्राम |
| [ShaderSet](./shaderset/) | प्रत्येक प्रकार की सामग्री के लिए शेडर प्रोग्राम |
| [ShaderSource](./shadersource/) | शेडर का स्रोत कोड |
| [ShaderVariable](./shadervariable/) | शेडर चर |
| [SPIRVSource](./spirvsource/) | एसपीआईआर-वी प्रारूप में संकलित शेडर। |
| [StencilState](./stencilstate/) | स्टैंसिल स्टेट्स प्रति फेस. |
| [TextureData](./texturedata/) | इस वर्ग में कच्चे डेटा और बनावट की प्रारूप परिभाषा शामिल है। |
| [Viewport](./viewport/) | ए[`IRenderTarget`](../aspose.threed.render/irendertarget/) दृश्य प्रस्तुत करने के लिए कम से कम एक व्यूपोर्ट शामिल है। |
| [WindowHandle](./windowhandle/) | विभिन्न प्लेटफार्मों के लिए एनकैप्सुलेटेड विंडो हैंडल। |
## संरचनाएं

| संरचना | विवरण |
| --- | --- |
| [CubeFaceData&lt;T&gt;](./cubefacedata-1/) | घन नक्शा बनावट के प्रत्येक चेहरे के लिए डेटा। |
## इंटरफेस

| इंटरफेस | विवरण |
| --- | --- |
| [IBuffer](./ibuffer/) | रेंडरिंग में उपयोग किए गए सभी प्रबंधित बफ़र्स का आधार इंटरफ़ेस |
| [ICommandList](./icommandlist/) | कमांड के अनुक्रम को एनकोड करता है जिसे प्रस्तुत करने के लिए GPU को भेजा जाएगा। |
| [IDescriptorSet](./idescriptorset/) | डिस्क्रिप्टर सेट विभिन्न संसाधनों का वर्णन करता है जिनका उपयोग बफर, टेक्सचर जैसे रेंडर पाइपलाइन को बाइंड करने के लिए किया जा सकता है |
| [IIndexBuffer](./iindexbuffer/) | इंडेक्स बफ़र रेंडरिंग पाइपलाइन में प्रयुक्त ज्यामिति का वर्णन करता है। |
| [IPipeline](./ipipeline/) | GPU पक्ष में आरेखित करने के लिए संचालन का पूर्व-बेक्ड अनुक्रम. |
| [IRenderQueue](./irenderqueue/) | इकाई रेंडरर रेंडर कार्यों को प्रबंधित करने के लिए इस कतार का उपयोग करता है। |
| [IRenderTarget](./irendertarget/) | रेंडर टारगेट का बेस इंटरफेस |
| [IRenderTexture](./irendertexture/) | रेंडर टेक्सचर का इंटरफ़ेस |
| [IRenderWindow](./irenderwindow/) | IRenderWindow ऑपरेटिंग सिस्टम द्वारा बनाई गई मूल विंडो का प्रतिनिधित्व करता है जो रेंडरिंग का समर्थन करता है। |
| [ITexture1D](./itexture1d/) | 1डी बनावट |
| [ITexture2D](./itexture2d/) | 2डी बनावट |
| [ITextureCubemap](./itexturecubemap/) | घन नक्शा बनावट |
| [ITextureUnit](./itextureunit/) | [`ITextureUnit`](../aspose.threed.render/itextureunit/) स्मृति में एक बनावट का प्रतिनिधित्व करता है जो GPU और CPU के बीच साझा किया जाता है और इसे शेडर, द्वारा नमूना किया जा सकता है जहां[`Texture`](../aspose.threed.shading/texture/) केवल एक बाहरी फ़ाइल के संदर्भ का प्रतिनिधित्व करता है। |
| [IVertexBuffer](./ivertexbuffer/) | वर्टेक्स बफ़र पॉलीगॉन वर्टेक्स डेटा रखता है जिसे रेंडरिंग पाइपलाइन पर भेजा जाएगा |
## गणना

| गणना | विवरण |
| --- | --- |
| [BlendFactor](./blendfactor/) | मिश्रण कारक पिक्सेल अंकगणित निर्दिष्ट करें। |
| [CompareFunction](./comparefunction/) | गहराई/स्टैंसिल परीक्षण में प्रयुक्त तुलना फ़ंक्शन। |
| [CubeFace](./cubeface/) | घन मानचित्र बनावट का प्रत्येक चेहरा |
| [CullFaceMode](./cullfacemode/) | किस चेहरे को काटना है |
| [DrawOperation](./drawoperation/) | प्रस्तुत करने के लिए आदिम प्रकार |
| [EntityRendererFeatures](./entityrendererfeatures/) | अतिरिक्त सुविधाएं जो इकाई रेंडरर प्रदान करेगा |
| [FrontFace](./frontface/) | सामने और पीछे के बहुभुजों को परिभाषित करें |
| [IndexDataType](./indexdatatype/) | तत्वों का डेटा प्रकार[`IIndexBuffer`](../aspose.threed.render/iindexbuffer/) |
| [PixelFormat](./pixelformat/) | बनावट इकाई में प्रयुक्त पिक्सेल का प्रारूप। |
| [PolygonMode](./polygonmode/) | बहुभुज रेखांकन मोड |
| [PresetShaders](./presetshaders/) | यह रेंडरर द्वारा उपयोग किए जाने वाले प्रीसेट आंतरिक शेड्स को परिभाषित करता है। |
| [RenderQueueGroupId](./renderqueuegroupid/) | कतार प्रस्तुत करने की समूह आईडी |
| [RenderStage](./renderstage/) | रेंडर स्टेज |
| [ShaderStage](./shaderstage/) | शेडर स्टेज |
| [StencilAction](./stencilaction/) | स्टैंसिल परीक्षण क्रिया |
| [TextureType](./texturetype/) | का प्रकार[`ITextureUnit`](../aspose.threed.render/itextureunit/) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
