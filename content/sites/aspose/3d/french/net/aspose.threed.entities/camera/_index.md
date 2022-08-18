---
title: Camera
second_title: Référence de l'API Aspose.3D pour .NET
description: La caméra décrit le point de vue du spectateur regardant la scène.
type: docs
weight: 250
url: /fr/net/aspose.threed.entities/camera/
---
## Camera class

La caméra décrit le point de vue du spectateur regardant la scène.

```csharp
public class Camera : Frustum
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Camera](camera#constructor)() | Initialise une nouvelle instance du[`Camera`](../camera) classe. |
| [Camera](camera#constructor_1)(ProjectionType) | Initialise une nouvelle instance du[`Camera`](../camera) classe. |
| [Camera](camera#constructor_2)(string) | Initialise une nouvelle instance du[`Camera`](../camera) classe. |
| [Camera](camera#constructor_3)(string, ProjectionType) | Initialise une nouvelle instance du[`Camera`](../camera) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [ApertureMode](../../aspose.threed.entities/camera/aperturemode) { get; set; } | Obtient ou définit le mode d'ouverture de l'appareil photo |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | Obtient ou définit le rapport d'aspect du frustum |
| [AspectRatio](../../aspose.threed.entities/camera/aspectratio) { get; set; } | Obtient ou définit le rapport d'aspect du plan de vue. |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Obtient ou définit la direction dans laquelle la caméra regarde. Les modifications apportées à cette propriété affecteront également la[`LookAt`](../frustum/lookat) et[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtient ou définit s'il faut exclure cette entité lors de l'exportation. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Obtient ou définit la distance du plan lointain du frustum. |
| [FieldOfView](../../aspose.threed.entities/camera/fieldofview) { get; set; } | Obtient ou définit le champ de vision de la caméra en degrés, cette propriété est utilisée uniquement lorsque ApertureMode estHorizontal ouVertical |
| [FieldOfViewX](../../aspose.threed.entities/camera/fieldofviewx) { get; set; } | Obtient ou définit le champ de vision horizontal de la caméra en degrés, cette propriété est utilisée uniquement lorsque ApertureMode estHorizAndVert |
| [FieldOfViewY](../../aspose.threed.entities/camera/fieldofviewy) { get; set; } | Obtient ou définit le champ de vision vertical de la caméra en degrés, cette propriété est utilisée uniquement lorsque ApertureMode estHorizAndVert |
| [Height](../../aspose.threed.entities/camera/height) { get; set; } | Obtient ou définit la hauteur du plan de vue mesurée en pouces |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Obtient ou définit la position intéressée que la caméra regarde. |
| [Magnification](../../aspose.threed.entities/camera/magnification) { get; set; } | Obtient ou définit le grossissement utilisé dans la caméra orthographique |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtient ou définit le nom. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Obtient ou définit la distance du plan proche du tronc. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Obtient ou définit la hauteur lorsque frustum dans la projection orthographique. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtient ou définit le premier nœud parent, si défini le premier nœud parent, cette entité sera détachée des autres nœuds parents. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtient tous les nœuds parents, une entité peut être attachée à plusieurs nœuds parents pour l'instanciation de la géométrie |
| [ProjectionType](../../aspose.threed.entities/camera/projectiontype) { get; set; } | Obtient ou définit le type de projection de la caméra. Par défaut, la projection en perspective est utilisée. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtient la collection de toutes les propriétés. |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Obtient ou définit le mode d'orientation du frustum Cette propriété ne fonctionne que lorsque le[`Target`](../frustum/target) est nul. Si la valeur estFixedTarget , la direction est toujours calculée par la propriété[`LookAt`](../frustum/lookat) Sinon le[`LookAt`](../frustum/lookat)est toujours calculé par le[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtient la scène à laquelle cet objet appartient |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Obtient ou définit la cible que la caméra regarde. Si l'utilisateur prend en charge cette propriété, elle doit être antérieure à[`LookAt`](../frustum/lookat) propriété. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | Obtient ou définit la direction vers le haut de la caméra |
| [Width](../../aspose.threed.entities/camera/width) { get; set; } | Obtient ou définit la largeur du plan de vue mesurée en pouces |

## Méthodes

| Nom | La description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trouve la propriété. Il peut s'agir d'une propriété dynamique (créée par CreateDynamicProperty/SetProperty) ou d'une propriété native (identifiée par son nom) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtient la boîte englobante de l'entité actuelle dans son système de coordonnées de l'espace objet. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Obtient la clé du rendu d'entité enregistré dans le rendu |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtenir la valeur de la propriété spécifiée |
| [MoveForward](../../aspose.threed.entities/camera/moveforward)(double) | Déplacez la caméra vers sa direction ou sa cible. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Supprime une propriété dynamique. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Supprimer la propriété spécifiée identifiée par name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Définit la valeur de la propriété spécifiée |

### Voir également

* class [Frustum](../frustum)
* espace de noms [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
