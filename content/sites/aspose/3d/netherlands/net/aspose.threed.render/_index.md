---
title: Aspose.ThreeD.Render
second_title: Aspose.3D voor .NET API-referentie
description: Alle aan rendering gerelateerde klassen zijn gedefinieerd in deze naamruimte
type: docs
weight: 70
url: /nl/net/aspose.threed.render/
---
Alle aan rendering gerelateerde klassen zijn gedefinieerd in deze naamruimte

## Klassen

| Klas | Beschrijving |
| --- | --- |
| [DescriptorSetUpdater](./descriptorsetupdater/) | Deze klasse maakt het mogelijk om de[`IDescriptorSet`](../aspose.threed.render/idescriptorset/) in een kettingoperatie. |
| [DriverException](./driverexception/) | De uitzondering veroorzaakt door interne weergavestuurprogramma's. |
| [EntityRenderer](./entityrenderer/) | Subklasse dit om weergave voor verschillende soorten entiteiten te implementeren. |
| [EntityRendererKey](./entityrendererkey/) | De sleutel van renderer geregistreerde entiteit |
| [GLSLSource](./glslsource/) | De broncode van shaders in GLSL |
| [InitializationException](./initializationexception/) | Uitzonderingen bij initialisatie van renderpijplijn |
| [PostProcessing](./postprocessing/) | De nabewerkingseffecten |
| [PushConstant](./pushconstant/) | Een hulpprogramma om gegevens aan shader te leveren via push constant. |
| [Renderer](./renderer/) | De context over renderer. |
| [RendererVariableManager](./renderervariablemanager/) | Deze klasse beheert variabelen die worden gebruikt bij het renderen |
| [RenderFactory](./renderfactory/) | RenderFactory maakt alle bronnen aan die vertegenwoordigd zijn in de renderingpijplijn. |
| [RenderParameters](./renderparameters/) | Beschrijf de parameters van de render target |
| [RenderResource](./renderresource/) | De abstracte klasse van alle renderresources Alle renderresources worden verwijderd wanneer de renderer wordt vrijgegeven. Klassen zoals[`Mesh`](../aspose.threed.entities/mesh/)/[`Texture`](../aspose.threed.shading/texture/) zal een corresponderende RenderResource hebben |
| [RenderState](./renderstate/) | Renderstatus voor het bouwen van de pijplijn De wijzigingen in de renderstatus hebben geen invloed op de gemaakte pijplijninstanties. |
| [ShaderException](./shaderexception/) | Shader-gerelateerde uitzonderingen |
| [ShaderProgram](./shaderprogram/) | Het shader-programma |
| [ShaderSet](./shaderset/) | Shader-programma's voor elk soort materiaal |
| [ShaderSource](./shadersource/) | De broncode van shader |
| [ShaderVariable](./shadervariable/) | Shader-variabele |
| [SPIRVSource](./spirvsource/) | De gecompileerde arcering in SPIR-V-formaat. |
| [StencilState](./stencilstate/) | Stencilstatussen per vlak. |
| [TextureData](./texturedata/) | Deze klasse bevat de onbewerkte gegevens en formaatdefinitie van een textuur. |
| [Viewport](./viewport/) | EEN[`IRenderTarget`](../aspose.threed.render/irendertarget/) bevat ten minste één viewport voor het weergeven van de scène. |
| [WindowHandle](./windowhandle/) | Ingekapselde raamgreep voor verschillende platformen. |
## Structuren

| Structuur | Beschrijving |
| --- | --- |
| [CubeFaceData&lt;T&gt;](./cubefacedata-1/) | Gegevens voor elk vlak van de kubuskaarttextuur. |
## Interfaces

| Koppel | Beschrijving |
| --- | --- |
| [IBuffer](./ibuffer/) | De basisinterface van alle beheerde buffers die worden gebruikt bij het renderen |
| [ICommandList](./icommandlist/) | Codeert een reeks opdrachten die naar GPU worden verzonden om te renderen. |
| [IDescriptorSet](./idescriptorset/) | De descriptorsets beschrijven verschillende bronnen die kunnen worden gebruikt om te binden aan de renderpijplijn, zoals buffers, texturen |
| [IIndexBuffer](./iindexbuffer/) | De indexbuffer beschrijft de geometrie die wordt gebruikt bij het renderen van pijplijnen. |
| [IPipeline](./ipipeline/) | De voorgebakken reeks bewerkingen om in GPU-zijde te tekenen. |
| [IRenderQueue](./irenderqueue/) | Entiteitsrenderer gebruikt deze wachtrij om rendertaken te beheren. |
| [IRenderTarget](./irendertarget/) | De basisinterface van render target |
| [IRenderTexture](./irendertexture/) | De interface van render texture |
| [IRenderWindow](./irenderwindow/) | IRenderWindow vertegenwoordigt het native venster dat is gemaakt door het besturingssysteem dat rendering ondersteunt. |
| [ITexture1D](./itexture1d/) | 1D-textuur |
| [ITexture2D](./itexture2d/) | 2D-textuur |
| [ITextureCubemap](./itexturecubemap/) | Cube map texture |
| [ITextureUnit](./itextureunit/) | [`ITextureUnit`](../aspose.threed.render/itextureunit/) vertegenwoordigt een textuur in het geheugen die wordt gedeeld tussen GPU en CPU en kan worden gesampled door de shader, waar de[`Texture`](../aspose.threed.shading/texture/) vertegenwoordigt alleen een verwijzing naar een extern bestand. Meer details zijn te vinden https://en.wikipedia.org/wiki/Texture_mapping_unit |
| [IVertexBuffer](./ivertexbuffer/) | De vertex-buffer bevat de polygoon vertex-gegevens die worden verzonden naar rendering pipeline |
## Opsomming

| Opsomming | Beschrijving |
| --- | --- |
| [BlendFactor](./blendfactor/) | Mengfactor specificeer pixelberekeningen. |
| [CompareFunction](./comparefunction/) | De vergelijkingsfunctie die wordt gebruikt bij diepte-/stenciltesten. |
| [CubeFace](./cubeface/) | Elk vlak van de kubuskaarttextuur |
| [CullFaceMode](./cullfacemode/) | Welk gezicht moet worden geruimd |
| [DrawOperation](./drawoperation/) | De primitieve typen om te renderen |
| [EntityRendererFeatures](./entityrendererfeatures/) | De extra functies die de entiteitsweergave zal bieden |
| [FrontFace](./frontface/) | Definieer naar voren en naar achteren gerichte polygonen |
| [IndexDataType](./indexdatatype/) | Het gegevenstype van de elementen in[`IIndexBuffer`](../aspose.threed.render/iindexbuffer/) |
| [PixelFormat](./pixelformat/) | Het pixelformaat gebruikt in textuureenheid. |
| [PolygonMode](./polygonmode/) | De veelhoekrastermodus |
| [PresetShaders](./presetshaders/) | Dit definieert de vooraf ingestelde interne shaders die door de renderer worden gebruikt. |
| [RenderQueueGroupId](./renderqueuegroupid/) | De groeps-ID van renderwachtrij |
| [RenderStage](./renderstage/) | Het renderstadium |
| [ShaderStage](./shaderstage/) | Shader-podium |
| [StencilAction](./stencilaction/) | De stenciltestacties |
| [TextureType](./texturetype/) | Het type van de[`ITextureUnit`](../aspose.threed.render/itextureunit/) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
