---
title: Aspose.ThreeD.Render
second_title: Aspose.3D لمرجع .NET API
description: يتم تحديد كافة الفئات ذات الصلة بالعرض في مساحة الاسم هذه
type: docs
weight: 70
url: /ar/net/aspose.threed.render/
---
يتم تحديد كافة الفئات ذات الصلة بالعرض في مساحة الاسم هذه

## الطبقات

| فصل | وصف |
| --- | --- |
| [DescriptorSetUpdater](./descriptorsetupdater) | تسمح هذه الفئة بتحديث ملف[`IDescriptorSet`](../aspose.threed.render/idescriptorset) في عملية سلسلة. |
| [DriverException](./driverexception) | الاستثناء الذي تم رفعه بواسطة برامج تشغيل العرض الداخلي. |
| [EntityRenderer](./entityrenderer) | فئة فرعية هذا لتنفيذ التقديم لنوع مختلف من الكيانات. |
| [EntityRendererKey](./entityrendererkey) | مفتاح عارض الكيان المسجل |
| [GLSLSource](./glslsource) | الكود المصدري للتظليل في GLSL |
| [InitializationException](./initializationexception) | استثناءات في تهيئة خط أنابيب العرض |
| [PostProcessing](./postprocessing) | تأثيرات ما بعد المعالجة |
| [PushConstant](./pushconstant) | أداة مساعدة لتوفير البيانات للتظليل من خلال دفع ثابت. |
| [Renderer](./renderer) | سياق العارض . |
| [RendererVariableManager](./renderervariablemanager) | تدير هذه الفئة المتغيرات المستخدمة في التقديم |
| [RenderFactory](./renderfactory) | ينشئ RenderFactory جميع الموارد التي يتم تمثيلها في خط أنابيب العرض. |
| [RenderParameters](./renderparameters) | صِف معلمات هدف التصيير |
| [RenderResource](./renderresource) | فئة الملخص لجميع موارد العرض سيتم التخلص من جميع موارد العرض عند إصدار العارض . فئات مثل[`Mesh`](../aspose.threed.entities/mesh)/[`Texture`](../aspose.threed.shading/texture) سيكون له RenderResource المقابل |
| [RenderState](./renderstate) | حالة العرض لبناء خط الأنابيب لن تؤثر التغييرات التي تم إجراؤها على حالة العرض على مثيلات خط الأنابيب التي تم إنشاؤها. |
| [ShaderException](./shaderexception) | الاستثناءات المتعلقة بشادر |
| [ShaderProgram](./shaderprogram) | برنامج الظل |
| [ShaderSet](./shaderset) | برامج Shader لكل نوع من المواد |
| [ShaderSource](./shadersource) | الكود المصدري لـ shader |
| [ShaderVariable](./shadervariable) | متغير شادر |
| [SPIRVSource](./spirvsource) | التظليل المترجم بتنسيق SPIR-V . |
| [StencilState](./stencilstate) | حالات الاستنسل لكل وجه. |
| [TextureData](./texturedata) | تحتوي هذه الفئة على البيانات الأولية وتعريف التنسيق للنسيج. |
| [Viewport](./viewport) | أ[`IRenderTarget`](../aspose.threed.render/irendertarget) يحتوي على منفذ عرض واحد على الأقل لعرض المشهد. |
| [WindowHandle](./windowhandle) | مقبض نافذة مغلف لمنصات مختلفة. |
## واجهات

| واجهه المستخدم | وصف |
| --- | --- |
| [IBuffer](./ibuffer) | الواجهة الأساسية لكافة المخازن المؤقتة المُدارة المستخدمة في التقديم |
| [ICommandList](./icommandlist) | يشفر سلسلة من الأوامر التي سيتم إرسالها إلى وحدة معالجة الرسومات لتقديمها. |
| [IDescriptorSet](./idescriptorset) | تصف مجموعات الواصف الموارد المختلفة التي يمكن استخدامها للربط بخط أنابيب العرض مثل المخازن المؤقتة ، textures |
| [IIndexBuffer](./iindexbuffer) | يصف المخزن المؤقت للفهرس الهندسة المستخدمة في خط أنابيب العرض. |
| [IPipeline](./ipipeline) | تسلسل العمليات المخبوز مسبقًا للرسم في جانب وحدة معالجة الرسومات . |
| [IRenderQueue](./irenderqueue) | عارض الكيان يستخدم قائمة الانتظار هذه لإدارة مهام العرض. |
| [IRenderTarget](./irendertarget) | الواجهة الأساسية للتصيير target |
| [IRenderTexture](./irendertexture) | واجهة تقديم نسيج |
| [IRenderWindow](./irenderwindow) | يمثل IRenderWindow النافذة الأصلية التي تم إنشاؤها بواسطة نظام التشغيل الذي يدعم التقديم. |
| [ITexture1D](./itexture1d) | نسيج 1D |
| [ITexture2D](./itexture2d) | نسيج ثنائي الأبعاد |
| [ITextureCubemap](./itexturecubemap) | نسيج خريطة المكعب |
| [ITextureUnit](./itextureunit) | [`ITextureUnit`](../aspose.threed.render/itextureunit) يمثل نسيجًا في الذاكرة يتم مشاركته بين وحدة معالجة الرسومات ووحدة المعالجة المركزية ويمكن أخذ عينات من التظليل ، حيث[`Texture`](../aspose.threed.shading/texture) يمثل فقط مرجعًا لملف خارجي . يمكن العثور على مزيد من التفاصيل https://en.wikipedia.org/wiki/Texture_mapping_unit |
| [IVertexBuffer](./ivertexbuffer) | يحتفظ المخزن المؤقت للرأس ببيانات رأس المضلع التي سيتم إرسالها إلى خط أنابيب العرض |
## تعداد

| تعداد | وصف |
| --- | --- |
| [BlendFactor](./blendfactor) | عامل المزج يحدد حساب البكسل . |
| [CompareFunction](./comparefunction) | وظيفة المقارنة المستخدمة في اختبار العمق / الاستنسل. |
| [CubeFace](./cubeface) | كل وجه من نسيج خريطة المكعب |
| [CullFaceMode](./cullfacemode) | ما وجه ل cull |
| [DrawOperation](./drawoperation) | الأنواع الأولية لتقديم |
| [EntityRendererFeatures](./entityrendererfeatures) | الميزات الإضافية التي سيوفرها عارض الكيان |
| [FrontFace](./frontface) | تحديد المضلعات الأمامية والخلفية |
| [IndexDataType](./indexdatatype) | نوع بيانات العناصر بتنسيق[`IIndexBuffer`](../aspose.threed.render/iindexbuffer) |
| [PixelFormat](./pixelformat) | تنسيق البكسل المستخدم في وحدة النسيج . |
| [PolygonMode](./polygonmode) | وضع تنقيط المضلع |
| [PresetShaders](./presetshaders) | يحدد هذا التظليل الداخلي المعين مسبقًا الذي يستخدمه العارض. |
| [RenderQueueGroupId](./renderqueuegroupid) | معرف المجموعة لقائمة انتظار العرض |
| [RenderStage](./renderstage) | مرحلة العرض |
| [ShaderStage](./shaderstage) | شادر المرحلة |
| [StencilAction](./stencilaction) | إجراءات اختبار الاستنسل |
| [TextureType](./texturetype) | نوع ملف[`ITextureUnit`](../aspose.threed.render/itextureunit) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
