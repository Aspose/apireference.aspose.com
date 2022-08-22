---
title: Aspose.ThreeD.Render
second_title: Riferimento API Aspose.3D per .NET
description: Tutte le classi relative al rendering sono definite in questo spazio dei nomi
type: docs
weight: 70
url: /it/net/aspose.threed.render/
---
Tutte le classi relative al rendering sono definite in questo spazio dei nomi

## Classi

| Classe | Descrizione |
| --- | --- |
| [DescriptorSetUpdater](./descriptorsetupdater) | Questa classe permette di aggiornare il[`IDescriptorSet`](../aspose.threed.render/idescriptorset) in un'operazione a catena. |
| [DriverException](./driverexception) | L'eccezione sollevata dai driver di rendering interni. |
| [EntityRenderer](./entityrenderer) | Sottoclasse this per implementare il rendering per diversi tipi di entità. |
| [EntityRendererKey](./entityrendererkey) | La chiave del renderer di entità registrata |
| [GLSLSource](./glslsource) | Il codice sorgente degli shader in GLSL |
| [InitializationException](./initializationexception) | Eccezioni nell'inizializzazione della pipeline di rendering |
| [PostProcessing](./postprocessing) | Gli effetti di post-elaborazione |
| [PushConstant](./pushconstant) | Un'utilità per fornire dati allo shader tramite la costante push. |
| [Renderer](./renderer) | Il contesto sul renderer. |
| [RendererVariableManager](./renderervariablemanager) | Questa classe gestisce le variabili usate nel rendering |
| [RenderFactory](./renderfactory) | RenderFactory crea tutte le risorse rappresentate nella pipeline di rendering. |
| [RenderParameters](./renderparameters) | Descrivi i parametri della destinazione di rendering |
| [RenderResource](./renderresource) | La classe astratta di tutte le risorse di rendering Tutte le risorse di rendering verranno eliminate al rilascio del renderer. Classi come[`Mesh`](../aspose.threed.entities/mesh)/[`Texture`](../aspose.threed.shading/texture) avrà un RenderResource corrispondente |
| [RenderState](./renderstate) | Stato di rendering per la creazione della pipeline Le modifiche apportate allo stato di rendering non influiranno sulle istanze della pipeline create. |
| [ShaderException](./shaderexception) | Eccezioni relative allo shader |
| [ShaderProgram](./shaderprogram) | Il programma shader |
| [ShaderSet](./shaderset) | Programmi Shader per ogni tipo di materiale |
| [ShaderSource](./shadersource) | Il codice sorgente di shader |
| [ShaderVariable](./shadervariable) | Variabile shader |
| [SPIRVSource](./spirvsource) | Lo shader compilato in formato SPIR-V. |
| [StencilState](./stencilstate) | Stati stencil per faccia. |
| [TextureData](./texturedata) | Questa classe contiene i dati grezzi e la definizione del formato di una texture. |
| [Viewport](./viewport) | A[`IRenderTarget`](../aspose.threed.render/irendertarget) contiene almeno una finestra per il rendering della scena. |
| [WindowHandle](./windowhandle) | Maniglia per finestra incapsulata per diverse piattaforme. |
## Interfacce

| Interfaccia | Descrizione |
| --- | --- |
| [IBuffer](./ibuffer) | L'interfaccia di base di tutti i buffer gestiti utilizzati nel rendering |
| [ICommandList](./icommandlist) | Codifica una sequenza di comandi che verranno inviati alla GPU per il rendering. |
| [IDescriptorSet](./idescriptorset) | I set di descrittori descrivono diverse risorse che possono essere utilizzate per associare alla pipeline di rendering come buffer, textures |
| [IIndexBuffer](./iindexbuffer) | Il buffer di indice descrive la geometria utilizzata nella pipeline di rendering. |
| [IPipeline](./ipipeline) | La sequenza precostituita di operazioni da disegnare sul lato GPU. |
| [IRenderQueue](./irenderqueue) | Il renderer di entità utilizza questa coda per gestire le attività di rendering. |
| [IRenderTarget](./irendertarget) | L'interfaccia di base di rendering target |
| [IRenderTexture](./irendertexture) | L'interfaccia di rendering texture |
| [IRenderWindow](./irenderwindow) | IRenderWindow rappresenta la finestra nativa creata dal sistema operativo che supporta il rendering. |
| [ITexture1D](./itexture1d) | Texture 1D |
| [ITexture2D](./itexture2d) | Texture 2D |
| [ITextureCubemap](./itexturecubemap) | Texture mappa cubo |
| [ITextureUnit](./itextureunit) | [`ITextureUnit`](../aspose.threed.render/itextureunit) rappresenta una texture nella memoria condivisa tra GPU e CPU e può essere campionata dallo shader, dove il[`Texture`](../aspose.threed.shading/texture) rappresenta solo un riferimento a un file esterno. Maggiori dettagli possono essere trovati https://en.wikipedia.org/wiki/Texture_mapping_unit |
| [IVertexBuffer](./ivertexbuffer) | Il buffer dei vertici contiene i dati dei vertici del poligono che verranno inviati alla pipeline di rendering |
## Enumerazione

| Enumerazione | Descrizione |
| --- | --- |
| [BlendFactor](./blendfactor) | Il fattore di fusione specifica l'aritmetica dei pixel. |
| [CompareFunction](./comparefunction) | La funzione di confronto utilizzata nei test di profondità/stencil. |
| [CubeFace](./cubeface) | Ogni faccia della trama della mappa del cubo |
| [CullFaceMode](./cullfacemode) | Che faccia da abbattere |
| [DrawOperation](./drawoperation) | I tipi primitivi da renderizzare |
| [EntityRendererFeatures](./entityrendererfeatures) | Le funzionalità extra che il renderer di entità fornirà |
| [FrontFace](./frontface) | Definisci poligoni frontali e posteriori |
| [IndexDataType](./indexdatatype) | Il tipo di dati degli elementi in[`IIndexBuffer`](../aspose.threed.render/iindexbuffer) |
| [PixelFormat](./pixelformat) | Il formato del pixel utilizzato nell'unità texture. |
| [PolygonMode](./polygonmode) | La modalità di rasterizzazione del poligono |
| [PresetShaders](./presetshaders) | Definisce gli shader interni preimpostati utilizzati dal renderer. |
| [RenderQueueGroupId](./renderqueuegroupid) | L'ID gruppo della coda di rendering |
| [RenderStage](./renderstage) | La fase di rendering |
| [ShaderStage](./shaderstage) | Fase shader |
| [StencilAction](./stencilaction) | Le azioni di prova dello stencil |
| [TextureType](./texturetype) | Il tipo di[`ITextureUnit`](../aspose.threed.render/itextureunit) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
