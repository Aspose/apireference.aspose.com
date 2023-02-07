---
title: Aspose.ThreeD.Render
second_title: Aspose.3D untuk .NET API Referensi
description: Semua class terkait rendering ditentukan di namespace ini
type: docs
weight: 70
url: /id/net/aspose.threed.render/
---
Semua class terkait rendering ditentukan di namespace ini

## Kelas

| Kelas | Keterangan |
| --- | --- |
| [DescriptorSetUpdater](./descriptorsetupdater/) | Kelas ini memungkinkan untuk memperbarui[`IDescriptorSet`](../aspose.threed.render/idescriptorset/) dalam operasi berantai. |
| [DriverException](./driverexception/) | Pengecualian yang diajukan oleh driver rendering internal. |
| [EntityRenderer](./entityrenderer/) | Buat subkelas ini untuk mengimplementasikan rendering untuk berbagai jenis entitas. |
| [EntityRendererKey](./entityrendererkey/) | Kunci perender entitas terdaftar |
| [GLSLSource](./glslsource/) | Kode sumber shader di GLSL |
| [InitializationException](./initializationexception/) | Pengecualian dalam inisialisasi pipa render |
| [PostProcessing](./postprocessing/) | Efek setelah pemrosesan |
| [PushConstant](./pushconstant/) | Utilitas untuk menyediakan data ke shader melalui konstanta push. |
| [Renderer](./renderer/) | Konteks tentang penyaji. |
| [RendererVariableManager](./renderervariablemanager/) | Kelas ini mengelola variabel yang digunakan dalam rendering |
| [RenderFactory](./renderfactory/) | RenderFactory membuat semua sumber daya yang direpresentasikan dalam pipa rendering. |
| [RenderParameters](./renderparameters/) | Jelaskan parameter target render |
| [RenderResource](./renderresource/) | Kelas abstrak dari semua sumber daya render Semua sumber daya render akan dibuang saat perender dilepaskan. Kelas seperti[`Mesh`](../aspose.threed.entities/mesh/)/[`Texture`](../aspose.threed.shading/texture/) akan memiliki RenderResource yang sesuai |
| [RenderState](./renderstate/) | Status render untuk membangun pipeline Perubahan yang dilakukan pada status render tidak akan memengaruhi instance pipeline yang dibuat. |
| [ShaderException](./shaderexception/) | Pengecualian terkait shader |
| [ShaderProgram](./shaderprogram/) | Program shader |
| [ShaderSet](./shaderset/) | Program shader untuk setiap jenis bahan |
| [ShaderSource](./shadersource/) | Kode sumber shader |
| [ShaderVariable](./shadervariable/) | Variabel shader |
| [SPIRVSource](./spirvsource/) | Shader terkompilasi dalam format SPIR-V. |
| [StencilState](./stencilstate/) | Status stensil per wajah. |
| [TextureData](./texturedata/) | Kelas ini berisi data mentah dan definisi format tekstur. |
| [Viewport](./viewport/) | A[`IRenderTarget`](../aspose.threed.render/irendertarget/) berisi setidaknya satu area pandang untuk menampilkan pemandangan. |
| [WindowHandle](./windowhandle/) | Pegangan jendela terenkapsulasi untuk berbagai platform. |
## Struktur

| Struktur | Keterangan |
| --- | --- |
| [CubeFaceData&lt;T&gt;](./cubefacedata-1/) | Data untuk setiap permukaan tekstur peta kubus. |
## Antarmuka

| Antarmuka | Keterangan |
| --- | --- |
| [IBuffer](./ibuffer/) | Antarmuka dasar semua buffer terkelola yang digunakan dalam rendering |
| [ICommandList](./icommandlist/) | Mengkodekan urutan perintah yang akan dikirim ke GPU untuk dirender. |
| [IDescriptorSet](./idescriptorset/) | Set deskriptor menjelaskan berbagai sumber daya yang dapat digunakan untuk mengikat pipa render seperti buffer, tekstur |
| [IIndexBuffer](./iindexbuffer/) | Index buffer mendeskripsikan geometri yang digunakan dalam rendering pipeline. |
| [IPipeline](./ipipeline/) | Urutan operasi yang telah dibuat sebelumnya untuk menggambar di sisi GPU. |
| [IRenderQueue](./irenderqueue/) | Perender entitas menggunakan antrean ini untuk mengelola tugas render. |
| [IRenderTarget](./irendertarget/) | Antarmuka dasar target render |
| [IRenderTexture](./irendertexture/) | Antarmuka tekstur render |
| [IRenderWindow](./irenderwindow/) | IRenderWindow mewakili jendela asli yang dibuat oleh sistem operasi yang mendukung rendering. |
| [ITexture1D](./itexture1d/) | tekstur 1D |
| [ITexture2D](./itexture2d/) | tekstur 2D |
| [ITextureCubemap](./itexturecubemap/) | Tekstur peta kubus |
| [ITextureUnit](./itextureunit/) | [`ITextureUnit`](../aspose.threed.render/itextureunit/) mewakili tekstur dalam memori yang dibagi antara GPU dan CPU dan dapat disampel oleh shader, di mana[`Texture`](../aspose.threed.shading/texture/) hanya mewakili referensi ke file eksternal. Detail lebih lanjut dapat ditemukan https://en.wikipedia.org/wiki/Texture_mapping_unit |
| [IVertexBuffer](./ivertexbuffer/) | Vertex buffer menampung data vertex poligon yang akan dikirim ke rendering pipeline |
## Pencacahan

| Pencacahan | Keterangan |
| --- | --- |
| [BlendFactor](./blendfactor/) | Blend factor menentukan aritmatika piksel. |
| [CompareFunction](./comparefunction/) | Fungsi perbandingan yang digunakan dalam pengujian kedalaman/stensil. |
| [CubeFace](./cubeface/) | Setiap permukaan tekstur peta kubus |
| [CullFaceMode](./cullfacemode/) | Wajah apa yang akan dimusnahkan |
| [DrawOperation](./drawoperation/) | Tipe primitif yang akan dirender |
| [EntityRendererFeatures](./entityrendererfeatures/) | Fitur tambahan yang akan disediakan oleh perender entitas |
| [FrontFace](./frontface/) | Menentukan poligon depan dan belakang |
| [IndexDataType](./indexdatatype/) | Tipe data elemen di[`IIndexBuffer`](../aspose.threed.render/iindexbuffer/) |
| [PixelFormat](./pixelformat/) | Format piksel yang digunakan dalam unit tekstur. |
| [PolygonMode](./polygonmode/) | Mode rasterisasi poligon |
| [PresetShaders](./presetshaders/) | Ini menentukan shader internal prasetel yang digunakan oleh perender. |
| [RenderQueueGroupId](./renderqueuegroupid/) | ID grup antrian render |
| [RenderStage](./renderstage/) | Tahap render |
| [ShaderStage](./shaderstage/) | Tahap shader |
| [StencilAction](./stencilaction/) | Tindakan pengujian stensil |
| [TextureType](./texturetype/) | Jenis dari[`ITextureUnit`](../aspose.threed.render/itextureunit/) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
