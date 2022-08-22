---
title: Light
second_title: Référence de l'API Aspose.3D pour .NET
description: La lumière éclaire la scène.
type: docs
weight: 400
url: /fr/net/aspose.threed.entities/light/
---
## Light class

La lumière éclaire la scène.

La formule pour calculer l'atténuation totale de la lumière est : `A = ConstantAttenuation + (Dist * LinearAttenuation) + ((Dist^2) * QuadraticAttenuation)`

```csharp
public class Light : Frustum
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Light](light#constructor)() | Initialise une nouvelle instance du[`Light`](../light) classe. |
| [Light](light#constructor_1)(string) | Initialise une nouvelle instance du[`Light`](../light) classe. |
| [Light](light#constructor_2)(string, LightType) | Initialise une nouvelle instance du[`Light`](../light) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | Obtient ou définit le rapport d'aspect du frustum |
| [CastLight](../../aspose.threed.entities/light/castlight) { get; set; } | Obtient ou définit si l'instance de lumière actuelle peut éclairer d'autres objets. |
| [CastShadows](../../aspose.threed.entities/light/castshadows) { get; set; } | Obtient ou définit si la lumière peut projeter des ombres sur d'autres objets. |
| [Color](../../aspose.threed.entities/light/color) { get; set; } | Obtient ou définit la couleur de la lumière |
| [ConstantAttenuation](../../aspose.threed.entities/light/constantattenuation) { get; set; } | Obtient ou définit l'atténuation constante pour calculer l'atténuation totale de la lumière |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Obtient ou définit la direction dans laquelle la caméra regarde. Les modifications apportées à cette propriété affecteront également la[`LookAt`](../frustum/lookat) et[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtient ou définit s'il faut exclure cette entité lors de l'exportation. |
| [Falloff](../../aspose.threed.entities/light/falloff) { get; set; } | Obtient ou définit l'angle du cône d'atténuation (en degrés). |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Obtient ou définit la distance du plan lointain du frustum. |
| [HotSpot](../../aspose.threed.entities/light/hotspot) { get; set; } | Obtient ou définit l'angle du cône du point chaud (en degrés). |
| [Intensity](../../aspose.threed.entities/light/intensity) { get; set; } | Obtient ou définit l'intensité de la lumière, la valeur par défaut est 100 |
| [LightType](../../aspose.threed.entities/light/lighttype) { get; set; } | Obtient ou définit le type de lumière |
| [LinearAttenuation](../../aspose.threed.entities/light/linearattenuation) { get; set; } | Obtient ou définit l'atténuation linéaire pour calculer l'atténuation totale de la lumière |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Obtient ou définit la position intéressée que la caméra regarde. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtient ou définit le nom. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Obtient ou définit la distance du plan proche du tronc. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Obtient ou définit la hauteur lorsque frustum dans la projection orthographique. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtient ou définit le premier nœud parent, si défini le premier nœud parent, cette entité sera détachée des autres nœuds parents. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtient tous les nœuds parents, une entité peut être attachée à plusieurs nœuds parents pour l'instanciation de la géométrie |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtient la collection de toutes les propriétés. |
| [QuadraticAttenuation](../../aspose.threed.entities/light/quadraticattenuation) { get; set; } | Obtient ou définit l'atténuation quadratique pour calculer l'atténuation totale de la lumière |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Obtient ou définit le mode d'orientation du frustum Cette propriété ne fonctionne que lorsque le[`Target`](../frustum/target) est nul. Si la valeur estFixedTarget , la direction est toujours calculée par la propriété[`LookAt`](../frustum/lookat) Sinon le[`LookAt`](../frustum/lookat)est toujours calculé par le[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtient la scène à laquelle cet objet appartient |
| [ShadowColor](../../aspose.threed.entities/light/shadowcolor) { get; set; } | Obtient ou définit la couleur de l'ombre. |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Obtient ou définit la cible que la caméra regarde. Si l'utilisateur prend en charge cette propriété, elle doit être antérieure à[`LookAt`](../frustum/lookat) propriété. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | Obtient ou définit la direction vers le haut de la caméra |

## Méthodes

| Nom | La description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trouve la propriété. Il peut s'agir d'une propriété dynamique (créée par CreateDynamicProperty/SetProperty) ou d'une propriété native (identifiée par son nom) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtient la boîte englobante de l'entité actuelle dans son système de coordonnées de l'espace objet. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Obtient la clé du rendu d'entité enregistré dans le rendu |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtenir la valeur de la propriété spécifiée |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Supprime une propriété dynamique. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Supprimer la propriété spécifiée identifiée par name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Définit la valeur de la propriété spécifiée |

### Voir également

* class [Frustum](../frustum)
* espace de noms [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
