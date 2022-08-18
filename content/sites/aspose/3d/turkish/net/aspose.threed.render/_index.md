---
title: Aspose.ThreeD.Render
second_title: Aspose.3D for .NET API Referansı
description: Oluşturmayla ilgili tüm sınıflar bu ad alanında tanımlanır
type: docs
weight: 70
url: /tr/net/aspose.threed.render/
---
Oluşturmayla ilgili tüm sınıflar bu ad alanında tanımlanır

## sınıflar

| Sınıf | Tanım |
| --- | --- |
| [DescriptorSetUpdater](./descriptorsetupdater) | Bu sınıf,[`IDescriptorSet`](../aspose.threed.render/idescriptorset) zincirleme operasyonda. |
| [DriverException](./driverexception) | Dahili işleme sürücüleri tarafından oluşturulan istisna. |
| [EntityRenderer](./entityrenderer) | Farklı türde varlıklar için işleme uygulamak için bunu alt sınıflandırın. |
| [EntityRendererKey](./entityrendererkey) | Kayıtlı varlık oluşturucunun anahtarı |
| [GLSLSource](./glslsource) | GLSL içindeki gölgelendiricilerin kaynak kodu |
| [InitializationException](./initializationexception) | Oluşturma ardışık düzeni başlatmasındaki özel durumlar |
| [PostProcessing](./postprocessing) | İşlem sonrası efektler |
| [PushConstant](./pushconstant) | Push sabiti aracılığıyla gölgelendiriciye veri sağlayan bir yardımcı program. |
| [Renderer](./renderer) | Oluşturucuyla ilgili bağlam. |
| [RendererVariableManager](./renderervariablemanager) | Bu sınıf, işlemede kullanılan değişkenleri yönetir |
| [RenderFactory](./renderfactory) | RenderFactory, işleme hattında temsil edilen tüm kaynakları oluşturur. |
| [RenderParameters](./renderparameters) | Render target parametresini tanımlayın |
| [RenderResource](./renderresource) | Tüm işleme kaynaklarının soyut sınıfı Oluşturucu serbest bırakıldığında tüm oluşturma kaynakları atılacaktır. Şuna benzer sınıflar[`Mesh`](../aspose.threed.entities/mesh)/[`Texture`](../aspose.threed.shading/texture) karşılık gelen bir RenderResource olacak |
| [RenderState](./renderstate) | İşlem hattını oluşturmak için işleme durumu İşleme durumunda yapılan değişiklikler, oluşturulan işlem hattı örneklerini etkilemez. |
| [ShaderException](./shaderexception) | Gölgelendiriciyle ilgili istisnalar |
| [ShaderProgram](./shaderprogram) | Gölgelendirici programı |
| [ShaderSet](./shaderset) | Her malzeme türü için gölgelendirici programları |
| [ShaderSource](./shadersource) | shader kaynak kodu |
| [ShaderVariable](./shadervariable) | Gölgelendirici değişkeni |
| [SPIRVSource](./spirvsource) | SPIR-V biçiminde derlenmiş gölgelendirici. |
| [StencilState](./stencilstate) | Yüz başına şablon durumu. |
| [TextureData](./texturedata) | Bu sınıf, bir dokunun ham verilerini ve biçim tanımını içerir. |
| [Viewport](./viewport) | A[`IRenderTarget`](../aspose.threed.render/irendertarget) sahneyi oluşturmak için en az bir görünüm penceresi içerir. |
| [WindowHandle](./windowhandle) | Farklı platformlar için kapsüllenmiş pencere tanıtıcısı. |
## Arayüzler

| Arayüz | Tanım |
| --- | --- |
| [IBuffer](./ibuffer) | Oluşturmada kullanılan tüm yönetilen arabelleklerin temel arabirimi |
| [ICommandList](./icommandlist) | Oluşturulmak üzere GPU'ya gönderilecek bir dizi komutu kodlar. |
| [IDescriptorSet](./idescriptorset) | Tanımlayıcı kümeleri, arabellekler, textures gibi işleme ardışık düzenine bağlanmak için kullanılabilecek farklı kaynakları açıklar. |
| [IIndexBuffer](./iindexbuffer) | Dizin arabelleği, işlem hattının oluşturulmasında kullanılan geometriyi açıklar. |
| [IPipeline](./ipipeline) | GPU tarafında çizmek için önceden hazırlanmış işlem dizisi. |
| [IRenderQueue](./irenderqueue) | Varlık oluşturucu, oluşturma görevlerini yönetmek için bu kuyruğu kullanır. |
| [IRenderTarget](./irendertarget) | Render target 'nin temel arayüzü |
| [IRenderTexture](./irendertexture) | Render texture arayüzü |
| [IRenderWindow](./irenderwindow) | IRenderWindow, işlemeyi destekleyen işletim sistemi tarafından oluşturulan yerel pencereyi temsil eder. |
| [ITexture1D](./itexture1d) | 1B doku |
| [ITexture2D](./itexture2d) | 2B doku |
| [ITextureCubemap](./itexturecubemap) | Küp harita dokusu |
| [ITextureUnit](./itextureunit) | [`ITextureUnit`](../aspose.threed.render/itextureunit) GPU ve CPU arasında paylaşılan bellekteki bir dokuyu temsil eder ve gölgelendirici tarafından örneklenebilir, burada[`Texture`](../aspose.threed.shading/texture) yalnızca harici bir dosyaya referansı temsil eder. Daha fazla ayrıntı bulunabilir https://en.wikipedia.org/wiki/Texture_mapping_unit |
| [IVertexBuffer](./ivertexbuffer) | Köşe arabelleği, işleme hattına gönderilecek çokgen köşe verilerini tutar |
## numaralandırma

| numaralandırma | Tanım |
| --- | --- |
| [BlendFactor](./blendfactor) | Karışım faktörü piksel aritmetiğini belirtir. |
| [CompareFunction](./comparefunction) | Derinlik/kalıp testinde kullanılan karşılaştırma işlevi. |
| [CubeFace](./cubeface) | Küp harita dokusunun her yüzü |
| [CullFaceMode](./cullfacemode) | cull ile ne yüz yüze |
| [DrawOperation](./drawoperation) | Oluşturulacak ilkel türler |
| [EntityRendererFeatures](./entityrendererfeatures) | Varlık oluşturucunun sağlayacağı ekstra özellikler |
| [FrontFace](./frontface) | Öne ve arkaya bakan çokgenleri tanımlayın |
| [IndexDataType](./indexdatatype) | İçindeki öğelerin veri türü[`IIndexBuffer`](../aspose.threed.render/iindexbuffer) |
| [PixelFormat](./pixelformat) | Doku biriminde kullanılan piksel biçimi. |
| [PolygonMode](./polygonmode) | Çokgen rasterleştirme modu |
| [PresetShaders](./presetshaders) | Bu, oluşturucu tarafından kullanılan önceden ayarlanmış dahili gölgelendiricileri tanımlar. |
| [RenderQueueGroupId](./renderqueuegroupid) | Oluşturma kuyruğunun grup kimliği |
| [RenderStage](./renderstage) | Oluşturma aşaması |
| [ShaderStage](./shaderstage) | Gölgelendirici aşaması |
| [StencilAction](./stencilaction) | Şablon testi eylemleri |
| [TextureType](./texturetype) | Türü[`ITextureUnit`](../aspose.threed.render/itextureunit) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
