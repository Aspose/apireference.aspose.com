---
title: Node
second_title: Référence de l'API Aspose.3D pour .NET
description: Représente un élément dans le graphe scénique. Un graphe scénique est un arbre dobjets Node. Les services de gestion darbres sont autonomes dans cette classe. Notez que le SDK Aspose.3D ne teste pas la validité du graphe de scène construit. Il est de la responsabilité de lappelant de sassurer quil ne génère pas de graphes cycliques dans une hiérarchie de nœuds. Outre la gestion de larbre cette classe définit toutes les propriétés nécessaires pour décrire la position de lobjet dans la scène. Ces informations incluent les propriétés de base de la translation de la rotation et de la mise à léchelle et les options plus avancées pour les pivots les limites et les attributs des articulations IK tels que la rigidité et lamortissement. Lors de sa première création lobjet Node est vide cest-à-dire un objet sans aucune représentation graphique qui ne contient que les informations de position. Dans cet état il peut être utilisé pour représenter les parents dans larborescence des nœuds mais pas beaucoup plus. Lutilisation normale de ce type dobjets est de leur adjoindre une entité qui va spécialiser le nœud voir la section Entité. Lentité est un objet en soi et est connectée au nœud. Cela signifie également que la même entité peut être partagée entre plusieurs nœuds. Camera Light Mesh etc... sont toutes des entités et elles dérivent toutes de la classe de base Entity.
type: docs
weight: 1470
url: /fr/net/aspose.threed/node/
---
## Node class

Représente un élément dans le graphe scénique. Un graphe scénique est un arbre d'objets Node. Les services de gestion d'arbres sont autonomes dans cette classe. Notez que le SDK Aspose.3D ne teste pas la validité du graphe de scène construit. Il est de la responsabilité de l'appelant de s'assurer qu'il ne génère pas de graphes cycliques dans une hiérarchie de nœuds. Outre la gestion de l'arbre, cette classe définit toutes les propriétés nécessaires pour décrire la position de l'objet dans la scène. Ces informations incluent les propriétés de base de la translation, de la rotation et de la mise à l'échelle et les options plus avancées pour les pivots, les limites et les attributs des articulations IK tels que la rigidité et l'amortissement. Lors de sa première création, l'objet Node est "vide" (c'est-à-dire un objet sans aucune représentation graphique qui ne contient que les informations de position). Dans cet état, il peut être utilisé pour représenter les parents dans l'arborescence des nœuds, mais pas beaucoup plus. L'utilisation normale de ce type d'objets est de leur adjoindre une entité qui va spécialiser le nœud (voir la section "Entité"). L'entité est un objet en soi et est connectée au nœud. Cela signifie également que la même entité peut être partagée entre plusieurs nœuds. Camera, Light, Mesh, etc... sont toutes des entités et elles dérivent toutes de la classe de base Entity.

```csharp
public class Node : SceneObject
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Node](node#constructor)() | Initialise une nouvelle instance du[`Node`](../node) classe. |
| [Node](node#constructor_1)(string) | Initialise une nouvelle instance du[`Node`](../node) classe. |
| [Node](node#constructor_2)(string, Entity) | Initialise une nouvelle instance du[`Node`](../node) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo) { get; set; } | Infos sur l'actif par nœud |
| [ChildNodes](../../aspose.threed/node/childnodes) { get; } | Obtient les nœuds enfants. |
| [Entities](../../aspose.threed/node/entities) { get; } | Obtient toutes les entités de nœud. |
| [Entity](../../aspose.threed/node/entity) { get; set; } | Obtient ou définit la première entité attachée à ce nœud, si défini, effacera les autres entités. |
| [Excluded](../../aspose.threed/node/excluded) { get; set; } | Obtient ou définit s'il faut exclure ce nœud et tous les nœuds/entités enfants lors de l'exportation. |
| [GlobalTransform](../../aspose.threed/node/globaltransform) { get; } | Obtient la transformation globale. |
| [Material](../../aspose.threed/node/material) { get; set; } | Obtient ou définit le premier matériau associé à ce nœud, s'il est défini, effacera les autres matériaux |
| [Materials](../../aspose.threed/node/materials) { get; } | Obtient les matériaux associés à ce nœud. |
| [MetaDatas](../../aspose.threed/node/metadatas) { get; } | Obtient les métadonnées définies dans ce nœud. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtient ou définit le nom. |
| [ParentNode](../../aspose.threed/node/parentnode) { get; set; } | Obtient ou définit le nœud parent. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtient la collection de toutes les propriétés. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtient la scène à laquelle cet objet appartient |
| [Transform](../../aspose.threed/node/transform) { get; } | Obtient la transformation locale. |
| [Visible](../../aspose.threed/node/visible) { get; set; } | Obtient ou définit pour afficher le nœud |

## Méthodes

| Nom | La description |
| --- | --- |
| [Accept](../../aspose.threed/node/accept)(NodeVisitor) | Parcourt tous les nœuds descendants (y compris le nœud actuel) et appelle le visiteur avec le nœud. Le visiteur peut interrompre la visite en renvoyant false |
| [AddChildNode](../../aspose.threed/node/addchildnode)(Node) | Ajouter un nœud enfant à ce nœud |
| [AddEntity](../../aspose.threed/node/addentity)(Entity) | Ajouter une entité au nœud. |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode)() | Crée un nœud enfant |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_1)(Entity) | Créer un nouveau nœud enfant avec une entité donnée attachée |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_2)(string) | Créer un nouveau nœud enfant avec le nom de nœud donné |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_3)(string, Entity) | Créer un nouveau nœud enfant avec le nom de nœud donné |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_4)(string, Entity, Material) | Créez un nouveau nœud enfant avec un nom de nœud donné et attachez l'entité spécifiée et un matériau |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform)(bool) | Evaluer la transformation globale, inclure ou non la transformation géométrique. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trouve la propriété. Il peut s'agir d'une propriété dynamique (créée par CreateDynamicProperty/SetProperty) ou d'une propriété native (identifiée par son nom) |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox)() | Calculer la boîte englobante du nœud |
| [GetChild](../../aspose.threed/node/getchild#getchild)(int) | Obtient le nœud enfant à l'index spécifié. |
| [GetChild](../../aspose.threed/node/getchild#getchild_1)(string) | Obtient le nœud enfant avec le nom spécifié |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtenir la valeur de la propriété spécifiée |
| [Merge](../../aspose.threed/node/merge)(Node) | Détachez tout sous le nœud et attachez-les au nœud actuel. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Supprime une propriété dynamique. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Supprimer la propriété spécifiée identifiée par name |
| [SelectObjects](../../aspose.threed/node/selectobjects)(string) | Sélectionnez plusieurs objets sous le nœud actuel à l'aide d'une syntaxe de requête de type XPath. |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject)(string) | Sélectionnez un seul objet sous le nœud actuel à l'aide d'une syntaxe de requête de type XPath. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Définit la valeur de la propriété spécifiée |
| override [ToString](../../aspose.threed/node/tostring)() | Obtient la représentation sous forme de chaîne de ce nœud. |

### Voir également

* class [SceneObject](../sceneobject)
* espace de noms [Aspose.ThreeD](../../aspose.threed)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
