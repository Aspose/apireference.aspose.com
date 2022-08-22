---
title: Aspose.ThreeD.Render
second_title: Referencia de API de Aspose.3D para .NET
description: Todas las clases relacionadas con la representación se definen en este espacio de nombres
type: docs
weight: 70
url: /es/net/aspose.threed.render/
---
Todas las clases relacionadas con la representación se definen en este espacio de nombres

## Clases

| Clase | Descripción |
| --- | --- |
| [DescriptorSetUpdater](./descriptorsetupdater) | Esta clase permite actualizar el[`IDescriptorSet`](../aspose.threed.render/idescriptorset) en una operación en cadena. |
| [DriverException](./driverexception) | La excepción generada por los controladores de renderizado internos. |
| [EntityRenderer](./entityrenderer) | Subclase esto para implementar el renderizado para diferentes tipos de entidades. |
| [EntityRendererKey](./entityrendererkey) | La clave de la entidad registrada renderer |
| [GLSLSource](./glslsource) | El código fuente de los shaders en GLSL |
| [InitializationException](./initializationexception) | Excepciones en la inicialización de canalización de procesamiento |
| [PostProcessing](./postprocessing) | Los efectos de posprocesamiento |
| [PushConstant](./pushconstant) | Una utilidad para proporcionar datos a shader a través de push constante. |
| [Renderer](./renderer) | El contexto sobre renderer. |
| [RendererVariableManager](./renderervariablemanager) | Esta clase gestiona las variables utilizadas en el renderizado |
| [RenderFactory](./renderfactory) | RenderFactory crea todos los recursos representados en la canalización de representación. |
| [RenderParameters](./renderparameters) | Describe los parámetros del render target |
| [RenderResource](./renderresource) | La clase abstracta de todos los recursos de renderizado Todos los recursos de renderizado se eliminarán cuando se libere el renderizador. Clases como[`Mesh`](../aspose.threed.entities/mesh)/[`Texture`](../aspose.threed.shading/texture) tendrá un RenderResource correspondiente |
| [RenderState](./renderstate) | Estado de representación para construir la canalización Los cambios realizados en el estado de representación no afectarán las instancias de canalización creadas. |
| [ShaderException](./shaderexception) | Excepciones relacionadas con sombreadores |
| [ShaderProgram](./shaderprogram) | El programa de sombreado |
| [ShaderSet](./shaderset) | Programas de shaders para cada tipo de material |
| [ShaderSource](./shadersource) | El código fuente de shader |
| [ShaderVariable](./shadervariable) | Variable de sombreado |
| [SPIRVSource](./spirvsource) | El shader compilado en formato SPIR-V. |
| [StencilState](./stencilstate) | Estados del stencil por cara. |
| [TextureData](./texturedata) | Esta clase contiene los datos sin procesar y la definición de formato de una textura. |
| [Viewport](./viewport) | A[`IRenderTarget`](../aspose.threed.render/irendertarget) contiene al menos una ventana gráfica para renderizar la escena. |
| [WindowHandle](./windowhandle) | Identificador de ventana encapsulado para diferentes plataformas. |
## Interfaces

| Interfaz | Descripción |
| --- | --- |
| [IBuffer](./ibuffer) | La interfaz base de todos los búferes administrados que se utilizan en el renderizado |
| [ICommandList](./icommandlist) | Codifica una secuencia de comandos que se enviarán a la GPU para renderizar. |
| [IDescriptorSet](./idescriptorset) | Los conjuntos de descriptores describen diferentes recursos que se pueden usar para enlazar con la canalización de procesamiento, como búferes, texturas |
| [IIndexBuffer](./iindexbuffer) | El búfer de índice describe la geometría utilizada en la canalización de representación. |
| [IPipeline](./ipipeline) | La secuencia precocinada de operaciones para dibujar en el lado GPU. |
| [IRenderQueue](./irenderqueue) | El procesador de entidades usa esta cola para administrar las tareas de procesamiento. |
| [IRenderTarget](./irendertarget) | La interfaz base de render target |
| [IRenderTexture](./irendertexture) | La interfaz de render textura |
| [IRenderWindow](./irenderwindow) | IRenderWindow representa la ventana nativa creada por el sistema operativo que admite la representación. |
| [ITexture1D](./itexture1d) | textura 1D |
| [ITexture2D](./itexture2d) | textura 2D |
| [ITextureCubemap](./itexturecubemap) | Textura de mapa de cubos |
| [ITextureUnit](./itextureunit) | [`ITextureUnit`](../aspose.threed.render/itextureunit) representa una textura en la memoria compartida entre GPU y CPU y puede ser muestreada por el shader, donde el[`Texture`](../aspose.threed.shading/texture) solo representa una referencia a un archivo externo. Se pueden encontrar más detalles https://en.wikipedia.org/wiki/Texture_mapping_unit |
| [IVertexBuffer](./ivertexbuffer) | El búfer de vértices contiene los datos del vértice del polígono que se enviarán a la canalización de representación |
## Enumeración

| Enumeración | Descripción |
| --- | --- |
| [BlendFactor](./blendfactor) | Factor de fusión especificar aritmética de píxeles. |
| [CompareFunction](./comparefunction) | La función de comparación utilizada en pruebas de profundidad/plantilla. |
| [CubeFace](./cubeface) | Cada cara de la textura del mapa del cubo |
| [CullFaceMode](./cullfacemode) | Que cara sacrificar |
| [DrawOperation](./drawoperation) | Los tipos primitivos a renderizar |
| [EntityRendererFeatures](./entityrendererfeatures) | Las funciones adicionales que proporcionará el renderizador de entidades |
| [FrontFace](./frontface) | Definir polígonos frontales y posteriores |
| [IndexDataType](./indexdatatype) | El tipo de datos de los elementos en[`IIndexBuffer`](../aspose.threed.render/iindexbuffer) |
| [PixelFormat](./pixelformat) | El formato de píxel utilizado en la unidad de textura. |
| [PolygonMode](./polygonmode) | El modo de rasterización de polígonos |
| [PresetShaders](./presetshaders) | Esto define los sombreadores internos predeterminados utilizados por el renderizador. |
| [RenderQueueGroupId](./renderqueuegroupid) | El ID de grupo de render queue |
| [RenderStage](./renderstage) | La etapa de renderizado |
| [ShaderStage](./shaderstage) | Etapa de sombreado |
| [StencilAction](./stencilaction) | Las acciones de prueba de la plantilla |
| [TextureType](./texturetype) | El tipo de la[`ITextureUnit`](../aspose.threed.render/itextureunit) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
