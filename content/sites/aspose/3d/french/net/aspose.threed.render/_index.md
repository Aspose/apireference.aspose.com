---
title: Aspose.ThreeD.Render
second_title: Référence de l'API Aspose.3D pour .NET
description: Toutes les classes liées au rendu sont définies dans cet espace de noms
type: docs
weight: 70
url: /fr/net/aspose.threed.render/
---
Toutes les classes liées au rendu sont définies dans cet espace de noms

## Des classes

| Classer | La description |
| --- | --- |
| [DescriptorSetUpdater](./descriptorsetupdater) | Cette classe permet de mettre à jour le[`IDescriptorSet`](../aspose.threed.render/idescriptorset) dans une opération en chaîne. |
| [DriverException](./driverexception) | L'exception déclenchée par les pilotes de rendu internes. |
| [EntityRenderer](./entityrenderer) | Sous-classe ceci pour implémenter le rendu pour différents types d'entités. |
| [EntityRendererKey](./entityrendererkey) | La clé de l'entité enregistrée renderer |
| [GLSLSource](./glslsource) | Le code source des shaders dans GLSL |
| [InitializationException](./initializationexception) | Exceptions dans l'initialisation du pipeline de rendu |
| [PostProcessing](./postprocessing) | Les effets de post-traitement |
| [PushConstant](./pushconstant) | Un utilitaire pour fournir des données au shader via la constante push. |
| [Renderer](./renderer) | Le contexte du moteur de rendu. |
| [RendererVariableManager](./renderervariablemanager) | Cette classe gère les variables utilisées dans le rendu |
| [RenderFactory](./renderfactory) | RenderFactory crée toutes les ressources représentées dans le pipeline de rendu. |
| [RenderParameters](./renderparameters) | Décrire les paramètres de la cible de rendu |
| [RenderResource](./renderresource) | La classe abstraite de toutes les ressources de rendu Toutes les ressources de rendu seront supprimées lorsque le moteur de rendu sera publié. Des classes comme[`Mesh`](../aspose.threed.entities/mesh)/[`Texture`](../aspose.threed.shading/texture) aura un RenderResource correspondant |
| [RenderState](./renderstate) | État de rendu pour la construction du pipeline Les modifications apportées à l'état de rendu n'affecteront pas les instances de pipeline créées. |
| [ShaderException](./shaderexception) | Exceptions liées au shader |
| [ShaderProgram](./shaderprogram) | Le programme shader |
| [ShaderSet](./shaderset) | programmes Shader pour chaque type de matériaux |
| [ShaderSource](./shadersource) | Le code source de shader |
| [ShaderVariable](./shadervariable) | Variable de nuanceur |
| [SPIRVSource](./spirvsource) | Le shader compilé au format SPIR-V. |
| [StencilState](./stencilstate) | États de pochoir par face. |
| [TextureData](./texturedata) | Cette classe contient les données brutes et la définition du format d'une texture. |
| [Viewport](./viewport) | A[`IRenderTarget`](../aspose.threed.render/irendertarget) contient au moins une fenêtre pour le rendu de la scène. |
| [WindowHandle](./windowhandle) | Poignée de fenêtre encapsulée pour différentes plates-formes. |
## Interfaces

| Interface | La description |
| --- | --- |
| [IBuffer](./ibuffer) | L'interface de base de tous les tampons gérés utilisés dans le rendu |
| [ICommandList](./icommandlist) | Encode une séquence de commandes qui sera envoyée au GPU pour le rendu. |
| [IDescriptorSet](./idescriptorset) | Les ensembles de descripteurs décrivent différentes ressources qui peuvent être utilisées pour se lier au pipeline de rendu comme les tampons, les textures |
| [IIndexBuffer](./iindexbuffer) | Le tampon d'index décrit la géométrie utilisée dans le pipeline de rendu. |
| [IPipeline](./ipipeline) | La séquence prédéfinie d'opérations à dessiner côté GPU. |
| [IRenderQueue](./irenderqueue) | Le moteur de rendu d'entité utilise cette file d'attente pour gérer les tâches de rendu. |
| [IRenderTarget](./irendertarget) | L'interface de base de la cible de rendu |
| [IRenderTexture](./irendertexture) | L'interface de rendu texture |
| [IRenderWindow](./irenderwindow) | IRenderWindow représente la fenêtre native créée par le système d'exploitation qui prend en charge le rendu. |
| [ITexture1D](./itexture1d) | Texture 1D |
| [ITexture2D](./itexture2d) | Texture 2D |
| [ITextureCubemap](./itexturecubemap) | Texture de carte cubique |
| [ITextureUnit](./itextureunit) | [`ITextureUnit`](../aspose.threed.render/itextureunit) représente une texture dans la mémoire partagée entre le GPU et le CPU et peut être échantillonnée par le shader, où le[`Texture`](../aspose.threed.shading/texture) représente uniquement une référence à un fichier externe. Plus de détails peuvent être trouvés https://en.wikipedia.org/wiki/Texture_mapping_unit |
| [IVertexBuffer](./ivertexbuffer) | Le tampon de vertex contient les données de vertex de polygone qui seront envoyées au pipeline de rendu |
## Énumération

| Énumération | La description |
| --- | --- |
| [BlendFactor](./blendfactor) | Le facteur de fusion spécifie l'arithmétique des pixels. |
| [CompareFunction](./comparefunction) | La fonction de comparaison utilisée dans les tests de profondeur/stencil. |
| [CubeFace](./cubeface) | Chaque face de la texture de la carte du cube |
| [CullFaceMode](./cullfacemode) | Quel visage pour cull |
| [DrawOperation](./drawoperation) | Les types primitifs à rendre |
| [EntityRendererFeatures](./entityrendererfeatures) | Les fonctionnalités supplémentaires que le rendu d'entité fournira |
| [FrontFace](./frontface) | Définir les polygones avant et arrière |
| [IndexDataType](./indexdatatype) | Le type de données des éléments dans[`IIndexBuffer`](../aspose.threed.render/iindexbuffer) |
| [PixelFormat](./pixelformat) | Le format de pixel utilisé dans l'unité de texture. |
| [PolygonMode](./polygonmode) | Le mode de pixellisation des polygones |
| [PresetShaders](./presetshaders) | Ceci définit les shaders internes prédéfinis utilisés par le moteur de rendu. |
| [RenderQueueGroupId](./renderqueuegroupid) | L'identifiant de groupe de la file d'attente de rendu |
| [RenderStage](./renderstage) | L'étape de rendu |
| [ShaderStage](./shaderstage) | Étape de shader |
| [StencilAction](./stencilaction) | Les actions de test de pochoir |
| [TextureType](./texturetype) | Le type de[`ITextureUnit`](../aspose.threed.render/itextureunit) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
