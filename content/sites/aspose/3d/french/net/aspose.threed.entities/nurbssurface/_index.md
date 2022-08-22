---
title: NurbsSurface
second_title: Référence de l'API Aspose.3D pour .NET
description: NurbsSurface./nurbssurface est une surface représentée parNURBS spline de base rationnelle non uniformehttps//en.wikipedia.org/wiki/Nonuniform_rational_Bspline ANurbsSurface./nurbssurface est défini par deuxNurbsDirection./nurbsdirectionU./nurbssurface/u etV./nurbssurface/v . La composante w du point de contrôle est utilisée comme poids du point de contrôle quel que soit le type de directionTwoDimensional ouThreeDimensional
type: docs
weight: 480
url: /fr/net/aspose.threed.entities/nurbssurface/
---
## NurbsSurface class

[`NurbsSurface`](../nurbssurface) est une surface représentée par[NURBS (spline de base rationnelle non uniforme)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), A[`NurbsSurface`](../nurbssurface) est défini par deux[`NurbsDirection`](../nurbsdirection)[`U`](./u) et[`V`](./v) . La composante w du point de contrôle est utilisée comme poids du point de contrôle quel que soit le type de directionTwoDimensional ouThreeDimensional

```csharp
public class NurbsSurface : Geometry, IMeshConvertible
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [NurbsSurface](nurbssurface#constructor)() | Initialise une nouvelle instance du[`NurbsSurface`](../nurbssurface) classe. |
| [NurbsSurface](nurbssurface#constructor_1)(string) | Initialise une nouvelle instance du[`NurbsSurface`](../nurbssurface) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Obtient ou définit si cette géométrie peut projeter une ombre |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Obtient tous les points de contrôle |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Obtient tous les déformateurs associés à cette géométrie. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtient ou définit s'il faut exclure cette entité lors de l'exportation. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtient ou définit le nom. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtient ou définit le premier nœud parent, si défini le premier nœud parent, cette entité sera détachée des autres nœuds parents. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtient tous les nœuds parents, une entité peut être attachée à plusieurs nœuds parents pour l'instanciation de la géométrie |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtient la collection de toutes les propriétés. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Obtient ou définit si cette géométrie peut recevoir une ombre. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtient la scène à laquelle cet objet appartient |
| [U](../../aspose.threed.entities/nurbssurface/u) { get; } | Obtient la direction U de la surface NURBS |
| [V](../../aspose.threed.entities/nurbssurface/v) { get; } | Obtient la direction V de la surface NURBS |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Obtient tous les éléments de sommet |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Obtient ou définit si la géométrie est visible |

## Méthodes

| Nom | La description |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Ajoute un élément de sommet existant à la géométrie actuelle |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | Crée un élément de sommet avec le type spécifié et l'ajoute à la géométrie. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | Crée un élément de sommet avec le type spécifié et l'ajoute à la géométrie. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | Crée un[`VertexElementUV`](../vertexelementuv) avec un type de mappage de texture donné. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Crée un[`VertexElementUV`](../vertexelementuv) avec un type de mappage de texture donné. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trouve la propriété. Il peut s'agir d'une propriété dynamique (créée par CreateDynamicProperty/SetProperty) ou d'une propriété native (identifiée par son nom) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtient la boîte englobante de l'entité actuelle dans son système de coordonnées de l'espace objet. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Obtient un élément de sommet avec le type spécifié |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Obtient la clé du rendu d'entité enregistré dans le rendu |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtenir la valeur de la propriété spécifiée |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | Obtient un[`VertexElementUV`](../vertexelementuv) instance avec le mappage de texture donné type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Supprime une propriété dynamique. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Supprimer la propriété spécifiée identifiée par name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Définit la valeur de la propriété spécifiée |
| [ToMesh](../../aspose.threed.entities/nurbssurface/tomesh)() | Convertir la surface NURBS en mesh |

### Voir également

* class [Geometry](../geometry)
* interface [IMeshConvertible](../imeshconvertible)
* espace de noms [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
