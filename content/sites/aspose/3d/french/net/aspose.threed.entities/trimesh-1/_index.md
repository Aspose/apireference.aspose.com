---
title: TriMeshT
second_title: Référence de l'API Aspose.3D pour .NET
description: Version générique deTriMesh./trimesh pour le type de sommet défini statiquement de lutilisateur
type: docs
weight: 740
url: /fr/net/aspose.threed.entities/trimesh-1/
---
## TriMesh&lt;T&gt; class

Version générique de[`TriMesh`](../trimesh) pour le type de sommet défini statiquement de l'utilisateur

```csharp
public class TriMesh<T> : TriMesh
    where T : struct
```

| Paramètre | La description |
| --- | --- |
| T |  |

## Constructeurs

| Nom | La description |
| --- | --- |
| [TriMesh](trimesh)(string) | Initialiser une instance de[`TriMesh`](../trimesh) |

## Propriétés

| Nom | La description |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity) { get; } | La capacité des sommets pré-alloués. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtient ou définit s'il faut exclure cette entité lors de l'exportation. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount) { get; } | Le nombre d'indices dans ce[`TriMesh`](../trimesh) |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtient ou définit le nom. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtient ou définit le premier nœud parent, si défini le premier nœud parent, cette entité sera détachée des autres nœuds parents. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtient tous les nœuds parents, une entité peut être attachée à plusieurs nœuds parents pour l'instanciation de la géométrie |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtient la collection de toutes les propriétés. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtient la scène à laquelle cet objet appartient |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount) { get; } | Le nombre de sommets non fusionnés qui sont passés par[`BeginVertex`](../trimesh/beginvertex) et[`EndVertex`](../trimesh/endvertex) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration) { get; } | La disposition des sommets du[`TriMesh`](../trimesh) . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount) { get; } | Le nombre de sommets dans ce[`TriMesh`](../trimesh) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes) { get; } | La taille totale de tous les sommets en octets |

## Méthodes

| Nom | La description |
| --- | --- |
| static [FromMesh](../../aspose.threed.entities/trimesh`1/frommesh)(Mesh) | Créer un TriMesh à partir d'un objet maillé donné avec une disposition de vertex générée automatiquement. |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex)() | Commencer à ajouter le vertex |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex)() | Fin de l'ajout du sommet |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trouve la propriété. Il peut s'agir d'une propriété dynamique (créée par CreateDynamicProperty/SetProperty) ou d'une propriété native (identifiée par son nom) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtient la boîte englobante de l'entité actuelle dans son système de coordonnées de l'espace objet. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Obtient la clé du rendu d'entité enregistré dans le rendu |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator)() | Obtenir l'énumérateur à énumérer[`Vertex`](../../aspose.threed.utilities/vertex) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtenir la valeur de la propriété spécifiée |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes)(byte[]) | Charger les sommets à partir d'octets, la longueur des octets doit être un multiple entier de la taille du sommet. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble)(int, VertexField) | Lire le champ double |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat)(int, VertexField) | Lire le champ flottant |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2)(int, VertexField) | Lire le champ vector2 |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3)(int, VertexField) | Lire le champ vector3 |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4)(int, VertexField) | Lire le champ vector4 |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2)(int, VertexField) | Lire le champ vector2 |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3)(int, VertexField) | Lire le champ vector3 |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4)(int, VertexField) | Lire le champ vector4 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Supprime une propriété dynamique. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Supprimer la propriété spécifiée identifiée par name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Définit la valeur de la propriété spécifiée |
| override [ToString](../../aspose.threed.entities/trimesh/tostring)() | Obtient la représentation sous forme de chaîne de[`TriMesh`](../trimesh) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray)() | Convertir les données des sommets en tableau d'octets |
| [VerticesToTypedArray](../../aspose.threed.entities/trimesh`1/verticestotypedarray)() | Convertir les données des sommets en tableau typé |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto)(Stream) | Écrire les données d'index sous forme d'entier 16 bits dans le flux |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto)(Stream) | Écrire les données d'index sous forme d'entier 32 bits dans le flux |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto)(Stream) | Écrire les données des sommets dans le flux spécifié |

### Voir également

* class [TriMesh](../trimesh)
* espace de noms [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
