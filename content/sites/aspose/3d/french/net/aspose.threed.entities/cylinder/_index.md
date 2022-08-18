---
title: Cylinder
second_title: Référence de l'API Aspose.3D pour .NET
description: Cylindre paramétré. Il peut également être utilisé pour représenter le cône lorsque lun de radiusTop/radiusBottom est égal à zéro.
type: docs
weight: 310
url: /fr/net/aspose.threed.entities/cylinder/
---
## Cylinder class

Cylindre paramétré. Il peut également être utilisé pour représenter le cône lorsque l'un de radiusTop/radiusBottom est égal à zéro.

```csharp
public class Cylinder : Primitive
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Cylinder](cylinder#constructor)() | Initialise une nouvelle instance du[`Cylinder`](../cylinder) classe. |
| [Cylinder](cylinder#constructor_1)(double, double) | Initialise une nouvelle instance du[`Cylinder`](../cylinder) classe. |
| [Cylinder](cylinder#constructor_2)(double, double, double) | Initialise une nouvelle instance du[`Cylinder`](../cylinder) classe. |
| [Cylinder](cylinder#constructor_3)(double, double, double, int, int, bool) | Initialise une nouvelle instance du[`Cylinder`](../cylinder) classe. |
| [Cylinder](cylinder#constructor_4)(string, double, double, double, int, int, bool, double, double) | Initialise une nouvelle instance du[`Cylinder`](../cylinder) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows) { get; set; } | Obtient ou définit si cette géométrie peut projeter une ombre |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtient ou définit s'il faut exclure cette entité lors de l'exportation. |
| [GenerateFanCylinder](../../aspose.threed.entities/cylinder/generatefancylinder) { get; set; } | Obtient ou définit s'il faut générer le cylindre en éventail lorsque ThetaLength est inférieur à 2*PI, sinon le modèle ne sera pas coupé. |
| [Height](../../aspose.threed.entities/cylinder/height) { get; set; } | Obtient ou définit la hauteur du cylindre. |
| [HeightSegments](../../aspose.threed.entities/cylinder/heightsegments) { get; set; } | Obtient ou définit les segments de hauteur. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtient ou définit le nom. |
| [OffsetBottom](../../aspose.threed.entities/cylinder/offsetbottom) { get; set; } | Obtient ou définit le décalage de transformation des sommets du côté inférieur. |
| [OffsetTop](../../aspose.threed.entities/cylinder/offsettop) { get; set; } | Obtient ou définit le décalage de transformation des sommets du côté supérieur. |
| [OpenEnded](../../aspose.threed.entities/cylinder/openended) { get; set; } | Obtient ou définit une valeur indiquant si cette[`Cylinder`](../cylinder) ouvert. La valeur par défaut est false. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtient ou définit le premier nœud parent, si défini le premier nœud parent, cette entité sera détachée des autres nœuds parents. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtient tous les nœuds parents, une entité peut être attachée à plusieurs nœuds parents pour l'instanciation de la géométrie |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtient la collection de toutes les propriétés. |
| [RadialSegments](../../aspose.threed.entities/cylinder/radialsegments) { get; set; } | Obtient ou définit les segments radiaux. |
| [RadiusBottom](../../aspose.threed.entities/cylinder/radiusbottom) { get; set; } | Obtient ou définit le rayon du capuchon inférieur du cylindre. |
| [RadiusTop](../../aspose.threed.entities/cylinder/radiustop) { get; set; } | Obtient ou définit le rayon du capuchon supérieur du cylindre. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows) { get; set; } | Obtient ou définit si cette géométrie peut recevoir une ombre. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtient la scène à laquelle cet objet appartient |
| [ShearBottom](../../aspose.threed.entities/cylinder/shearbottom) { get; set; } | Obtient ou définit la transformée de cisaillement du côté inférieur, le vecteur stocke la valeur de cisaillement (axe x, axe z) mesurée en radian, la valeur par défaut est (0, 0) |
| [ShearTop](../../aspose.threed.entities/cylinder/sheartop) { get; set; } | Obtient ou définit la transformée de cisaillement du côté supérieur, le vecteur stocke la valeur de cisaillement (axe x, axe z) mesurée en radian, la valeur par défaut est (0, 0) |
| [ThetaLength](../../aspose.threed.entities/cylinder/thetalength) { get; set; } | Obtient ou définit la longueur du thêta. La valeur par défaut est 2π. |
| [ThetaStart](../../aspose.threed.entities/cylinder/thetastart) { get; set; } | Obtient ou définit le début thêta. La valeur par défaut est 0. |

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
| override [ToMesh](../../aspose.threed.entities/cylinder/tomesh)() | Convertir l'objet actuel en mesh |

### Voir également

* class [Primitive](../primitive)
* espace de noms [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
