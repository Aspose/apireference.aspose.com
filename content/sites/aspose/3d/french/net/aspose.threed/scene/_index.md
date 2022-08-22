---
title: Scene
second_title: Référence de l'API Aspose.3D pour .NET
description: Une scène est un objet de niveau supérieur qui contient les nœuds les géométries les matériaux les textures lanimation les poses les sousscènes etc. La scène peut avoir des sousscènes agit comme un support de plusieurs documents dans des fichiers comme collada/blender /fbx La hiérarchie des nœuds est accessible viaRootNode./scene/rootnodeLibrary./scene/library est utilisé pour conserver une référence dobjets non attachés pendant la sérialisation comme les métadonnées ou les objets personnalisés afin quil puisse être utilisé comme bibliothèque.
type: docs
weight: 2250
url: /fr/net/aspose.threed/scene/
---
## Scene class

Une scène est un objet de niveau supérieur qui contient les nœuds, les géométries, les matériaux, les textures, l'animation, les poses, les sous-scènes, etc. La scène peut avoir des sous-scènes, agit comme un support de plusieurs documents dans des fichiers comme collada/blender /fbx La hiérarchie des nœuds est accessible via[`RootNode`](./rootnode)[`Library`](./library) est utilisé pour conserver une référence d'objets non attachés pendant la sérialisation (comme les métadonnées ou les objets personnalisés) afin qu'il puisse être utilisé comme bibliothèque.

```csharp
public class Scene : SceneObject
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Scene](scene#constructor)() | Initialise une nouvelle instance du[`Scene`](../scene) classe. |
| [Scene](scene#constructor_1)(Entity) | Initialise une nouvelle instance du[`Scene`](../scene) classe avec une entité attachée à un nouveau nœud. |
| [Scene](scene#constructor_2)(Scene, string) | Initialise une nouvelle instance du[`Scene`](../scene)classe comme sous-scène. |

## Propriétés

| Nom | La description |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips) { get; } | Obtient tout[`AnimationClip`](../../aspose.threed.animation/animationclip) défini dans la scène. |
| [AssetInfo](../../aspose.threed/scene/assetinfo) { get; set; } | Obtient ou définit les informations d'actif de niveau supérieur |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip) { get; set; } | Obtient ou définit l'actif[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [Library](../../aspose.threed/scene/library) { get; } | Les objets qui ne sont pas directement utilisés dans la hiérarchie des scènes peuvent être définis dans la bibliothèque. Ceci est utile lorsque vous utilisez des sous-scènes et placez des composants réutilisables sous les sous-scènes. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtient ou définit le nom. |
| [Poses](../../aspose.threed/scene/poses) { get; } | Obtient tout[`Pose`](../pose) utilisé dans cette scène. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtient la collection de toutes les propriétés. |
| [RootNode](../../aspose.threed/scene/rootnode) { get; } | Obtient le nœud racine de la scène. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtient la scène à laquelle cet objet appartient |
| [SubScenes](../../aspose.threed/scene/subscenes) { get; } | Récupère toutes les sous-scènes |

## Méthodes

| Nom | La description |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile)(string) | Ouvre la scène à partir du chemin donné |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_3)(string, CancellationToken) | Ouvre la scène à partir du chemin donné |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_1)(string, FileFormat, CancellationToken) | Ouvre la scène à partir du chemin donné en utilisant le format de fichier spécifié. |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_2)(string, LoadOptions, CancellationToken) | Ouvre la scène à partir du chemin donné en utilisant le format de fichier spécifié. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_2)(Stream, CancellationToken) | Ouvre la scène à partir du flux donné |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream)(Stream, FileFormat, CancellationToken) | Ouvre la scène à partir d'un flux donné en utilisant le format de fichier spécifié. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_1)(Stream, LoadOptions, CancellationToken) | Ouvre la scène à partir d'un flux donné à l'aide de la configuration IO spécifiée. |
| [Clear](../../aspose.threed/scene/clear)() | Efface le contenu de la scène et restaure les paramètres par défaut. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip)(string) | Une fonction abrégée pour créer et enregistrer le[`AnimationClip`](../../aspose.threed.animation/animationclip) Le premier[`AnimationClip`](../../aspose.threed.animation/animationclip) sera affecté au[`CurrentAnimationClip`](./currentanimationclip) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trouve la propriété. Il peut s'agir d'une propriété dynamique (créée par CreateDynamicProperty/SetProperty) ou d'une propriété native (identifiée par son nom) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip)(string) | Obtient un nom[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtenir la valeur de la propriété spécifiée |
| [Open](../../aspose.threed/scene/open#open)(Stream) | Ouvre la scène à partir du flux donné |
| [Open](../../aspose.threed/scene/open#open_4)(string) | Ouvre la scène à partir du chemin donné |
| [Open](../../aspose.threed/scene/open#open_3)(Stream, CancellationToken) | Ouvre la scène à partir du flux donné |
| [Open](../../aspose.threed/scene/open#open_8)(string, CancellationToken) | Ouvre la scène à partir du chemin donné |
| [Open](../../aspose.threed/scene/open#open_6)(string, LoadOptions) | Ouvre la scène à partir du chemin donné en utilisant le format de fichier spécifié. |
| [Open](../../aspose.threed/scene/open#open_1)(Stream, FileFormat, CancellationToken) | Ouvre la scène à partir d'un flux donné en utilisant le format de fichier spécifié. |
| [Open](../../aspose.threed/scene/open#open_2)(Stream, LoadOptions, CancellationToken) | Ouvre la scène à partir d'un flux donné à l'aide de la configuration IO spécifiée. |
| [Open](../../aspose.threed/scene/open#open_5)(string, FileFormat, CancellationToken) | Ouvre la scène à partir du chemin donné en utilisant le format de fichier spécifié. |
| [Open](../../aspose.threed/scene/open#open_7)(string, LoadOptions, CancellationToken) | Ouvre la scène à partir du chemin donné en utilisant le format de fichier spécifié. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Supprime une propriété dynamique. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Supprimer la propriété spécifiée identifiée par name |
| [Render](../../aspose.threed/scene/render#render)(Camera, Bitmap) | Rendre la scène en bitmap du point de vue de la caméra donnée. |
| [Render](../../aspose.threed/scene/render#render_2)(Camera, string) | Rendre la scène dans un fichier externe du point de vue de la caméra donnée. La taille de sortie par défaut est 1024x768 et le format de sortie est png |
| [Render](../../aspose.threed/scene/render#render_1)(Camera, Bitmap, ImageRenderOptions) | Rendre la scène en bitmap du point de vue de la caméra donnée. |
| [Render](../../aspose.threed/scene/render#render_3)(Camera, string, Size, ImageFormat) | Rendre la scène dans un fichier externe du point de vue de la caméra donnée. |
| [Render](../../aspose.threed/scene/render#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | Rendre la scène dans un fichier externe du point de vue de la caméra donnée. |
| [Save](../../aspose.threed/scene/save#save_4)(string) | Enregistre la scène dans le chemin spécifié en utilisant le format de fichier spécifié. |
| [Save](../../aspose.threed/scene/save#save)(Stream, FileFormat) | Enregistre la scène à diffuser en utilisant le format de fichier spécifié. |
| [Save](../../aspose.threed/scene/save#save_2)(Stream, SaveOptions) | Enregistre la scène à diffuser en utilisant le format de fichier spécifié. |
| [Save](../../aspose.threed/scene/save#save_5)(string, FileFormat) | Enregistre la scène dans le chemin spécifié en utilisant le format de fichier spécifié. |
| [Save](../../aspose.threed/scene/save#save_7)(string, SaveOptions) | Enregistre la scène dans le chemin spécifié en utilisant le format de fichier spécifié. |
| [Save](../../aspose.threed/scene/save#save_1)(Stream, FileFormat, CancellationToken) | Enregistre la scène à diffuser en utilisant le format de fichier spécifié. |
| [Save](../../aspose.threed/scene/save#save_3)(Stream, SaveOptions, CancellationToken) | Enregistre la scène à diffuser en utilisant le format de fichier spécifié. |
| [Save](../../aspose.threed/scene/save#save_6)(string, FileFormat, CancellationToken) | Enregistre la scène dans le chemin spécifié en utilisant le format de fichier spécifié. |
| [Save](../../aspose.threed/scene/save#save_8)(string, SaveOptions, CancellationToken) | Enregistre la scène dans le chemin spécifié en utilisant le format de fichier spécifié. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Définit la valeur de la propriété spécifiée |

### Voir également

* class [SceneObject](../sceneobject)
* espace de noms [Aspose.ThreeD](../../aspose.threed)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
