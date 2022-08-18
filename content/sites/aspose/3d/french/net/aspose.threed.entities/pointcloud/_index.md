---
title: PointCloud
second_title: Référence de l'API Aspose.3D pour .NET
description: Le nuage de points ne contient aucune information de topologie mais uniquement les points de contrôle et les éléments de sommet.
type: docs
weight: 540
url: /fr/net/aspose.threed.entities/pointcloud/
---
## PointCloud class

Le nuage de points ne contient aucune information de topologie mais uniquement les points de contrôle et les éléments de sommet.

```csharp
public class PointCloud : Geometry
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [PointCloud](pointcloud#constructor)() | Constructeur de[`PointCloud`](../pointcloud) |
| [PointCloud](pointcloud#constructor_1)(string) | Constructeur de[`PointCloud`](../pointcloud) |

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
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Obtient tous les éléments de sommet |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Obtient ou définit si la géométrie est visible |

## Méthodes

| Nom | La description |
| --- | --- |
| static [FromGeometry](../../aspose.threed.entities/pointcloud/fromgeometry#fromgeometry)(Geometry) | Créer une nouvelle instance PointCloud à partir d'un objet géométrique |
| static [FromGeometry](../../aspose.threed.entities/pointcloud/fromgeometry#fromgeometry_1)(Geometry, int) | Créer une nouvelle instance de nuage de points à partir d'un objet géométrique. La densité est le nombre de points par triangle unitaire (le triangle unitaire est le triangle avec une surface maximale à partir du maillage) |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Ajoute un élément de sommet existant à la géométrie actuelle |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | Crée un élément de sommet avec le type spécifié et l'ajoute à la géométrie. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | Crée un élément de sommet avec le type spécifié et l'ajoute à la géométrie. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | Crée un[`VertexElementUV`](../vertexelementuv) avec un type de mappage de texture donné. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Crée un[`VertexElementUV`](../vertexelementuv) avec un type de mappage de texture donné. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trouve la propriété. Il peut s'agir d'une propriété dynamique (créée par CreateDynamicProperty/SetProperty) ou d'une propriété native (identifiée par son nom) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtient la boîte englobante de l'entité actuelle dans son système de coordonnées de l'espace objet. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Obtient un élément de sommet avec le type spécifié |
| override [GetEntityRendererKey](../../aspose.threed.entities/pointcloud/getentityrendererkey)() | Obtient la clé du rendu d'entité enregistré dans le rendu |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtenir la valeur de la propriété spécifiée |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | Obtient un[`VertexElementUV`](../vertexelementuv) instance avec le mappage de texture donné type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Supprime une propriété dynamique. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Supprimer la propriété spécifiée identifiée par name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Définit la valeur de la propriété spécifiée |

### Voir également

* class [Geometry](../geometry)
* espace de noms [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
