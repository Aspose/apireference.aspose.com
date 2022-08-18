---
title: Mesh
second_title: Référence de l'API Aspose.3D pour .NET
description: Un maillage est constitué de nombreux polygones à n côtés.
type: docs
weight: 450
url: /fr/net/aspose.threed.entities/mesh/
---
## Mesh class

Un maillage est constitué de nombreux polygones à n côtés.

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Mesh](mesh#constructor)() | Initialise une nouvelle instance du[`Mesh`](../mesh) classe. |
| [Mesh](mesh#constructor_1)(Bitmap) | Construire un maillage en utilisant la carte de hauteur spécifiée, si le format de pixel de la carte de hauteur contient plusieurs composants, le premier composant (généralement le rouge) sera utilisé comme valeur de hauteur (z) Les composants x et y du point de contrôle sont des coordonnées de pixel normalisées . |
| [Mesh](mesh#constructor_4)(string) | Initialise une nouvelle instance du[`Mesh`](../mesh) classe. |
| [Mesh](mesh#constructor_2)(Bitmap, Matrix4) | Construire un maillage en utilisant la carte de hauteur spécifiée, si le format de pixel de la carte de hauteur contient plusieurs composants, le premier composant (généralement le rouge) sera utilisé comme valeur de hauteur (z) Les composants x et y du point de contrôle sont des coordonnées de pixel normalisées . |
| [Mesh](mesh#constructor_3)(Bitmap, bool, Matrix4) | Construire un maillage en utilisant la carte de hauteur spécifiée, si le format de pixel de la carte de hauteur contient plusieurs composants, le premier composant (généralement le rouge) sera utilisé comme valeur de hauteur (z) Les composants x et y du point de contrôle sont des coordonnées de pixel normalisées . |

## Propriétés

| Nom | La description |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Obtient ou définit si cette géométrie peut projeter une ombre |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Obtient tous les points de contrôle |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Obtient tous les déformateurs associés à cette géométrie. |
| [Edges](../../aspose.threed.entities/mesh/edges) { get; } | Obtient les bords du maillage. Edge est facultatif dans le maillage, il peut donc être vide. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtient ou définit s'il faut exclure cette entité lors de l'exportation. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtient ou définit le nom. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtient ou définit le premier nœud parent, si défini le premier nœud parent, cette entité sera détachée des autres nœuds parents. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtient tous les nœuds parents, une entité peut être attachée à plusieurs nœuds parents pour l'instanciation de la géométrie |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount) { get; } | Obtient le nombre de polygones |
| [Polygons](../../aspose.threed.entities/mesh/polygons) { get; } | Récupère la définition des polygones du maillage |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtient la collection de toutes les propriétés. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Obtient ou définit si cette géométrie peut recevoir une ombre. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtient la scène à laquelle cet objet appartient |
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
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_2)(int[]) | Crée un nouveau polygone avec tous les sommets définis dans*indices* . Pour créer un polygone sommet par sommet, veuillez utiliser[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon)(int, int, int) | Créer un polygone à 3 sommets (triangle) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_3)(int[], int, int) | Crée un nouveau polygone avec tous les sommets définis dans*indices* . Pour créer un polygone sommet par sommet, veuillez utiliser[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_1)(int, int, int, int) | Créer un polygone à 4 vertices (quadruple) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trouve la propriété. Il peut s'agir d'une propriété dynamique (créée par CreateDynamicProperty/SetProperty) ou d'une propriété native (identifiée par son nom) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtient la boîte englobante de l'entité actuelle dans son système de coordonnées de l'espace objet. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Obtient un élément de sommet avec le type spécifié |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Obtient la clé du rendu d'entité enregistré dans le rendu |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator)() | Obtient l'énumérateur pour chaque polygone intérieur. |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize)(int) | Obtient le nombre de sommets du polygone spécifié. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtenir la valeur de la propriété spécifiée |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | Obtient un[`VertexElementUV`](../vertexelementuv) instance avec le mappage de texture donné type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Supprime une propriété dynamique. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Supprimer la propriété spécifiée identifiée par name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Définit la valeur de la propriété spécifiée |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh)() | Obtient l'instance Mesh de l'entité actuelle. |

### Exemples

Pour ajouter un polygone au maillage : Parcourir tous les polygones du maillage :

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    // traite du polygone
}
```

### Voir également

* class [Geometry](../geometry)
* interface [IMeshConvertible](../imeshconvertible)
* espace de noms [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
