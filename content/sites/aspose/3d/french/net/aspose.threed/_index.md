---
title: Aspose.ThreeD
second_title: Référence de l'API Aspose.3D pour .NET
description: Lespace de noms de base de Aspose.3D
type: docs
weight: 10
url: /fr/net/aspose.threed/
---
L'espace de noms de base de Aspose.3D

## Des classes

| Classer | La description |
| --- | --- |
| [A3DObject](./a3dobject) | La classe de base de tous les objets Aspose.ThreeD, toutes les sous-classes prendront en charge les propriétés dynamiques. |
| [AssetInfo](./assetinfo) | Informations sur l'actif. Les informations sur l'actif peuvent être jointes à un[`Scene`](../aspose.threed/scene) . Enfant[`Scene`](../aspose.threed/scene) peut avoir le sien[`AssetInfo`](../aspose.threed/assetinfo) pour remplacer la définition du parent. |
| [BonePose](./bonepose) | Le[`BonePose`](../aspose.threed/bonepose) contient la matrice de transformation pour un os node |
| [CustomObject](./customobject) | Les métadonnées ou les objets personnalisés utilisés dans les fichiers 3D sont gérés par cette classe. Toutes les propriétés personnalisées sont enregistrées en tant que propriétés dynamiques. |
| [Entity](./entity) | La classe de base de toutes les entités. Entity représente un objet concret attaché sous un nœud comme[`Light`](../aspose.threed.entities/light)/[`Geometry`](../aspose.threed.entities/geometry) . |
| [ExportException](./exportexception) | Exceptions lorsque Aspose.3D n'a pas réussi à exporter la scène vers file |
| [FileFormat](./fileformat) | Définition du format de fichier |
| [FileFormatType](./fileformattype) | Type de format de fichier |
| [GlobalTransform](./globaltransform) | La transformation globale est similaire à[`Transform`](../aspose.threed/transform) mais il est immuable tant qu'il représente la transformation évaluée finale. Le système de coordonnées de droite est utilisé lors de l'évaluation de la transformation globale |
| [ImageRenderOptions](./imagerenderoptions) | Options pour[`Render`](../aspose.threed/scene/render) et[`Render`](../aspose.threed/scene/render) |
| [ImportException](./importexception) | Exception lorsque Aspose.3D n'a pas pu ouvrir la source spécifiée |
| [License](./license) | Fournit des méthodes pour autoriser le composant. |
| [Metered](./metered) | Fournit des méthodes pour définir la clé mesurée. |
| [Node](./node) | Représente un élément dans le graphe scénique. Un graphe scénique est un arbre d'objets Node. Les services de gestion d'arbres sont autonomes dans cette classe. Notez que le SDK Aspose.3D ne teste pas la validité du graphe de scène construit. Il est de la responsabilité de l'appelant de s'assurer qu'il ne génère pas de graphes cycliques dans une hiérarchie de nœuds. Outre la gestion de l'arbre, cette classe définit toutes les propriétés nécessaires pour décrire la position de l'objet dans la scène. Ces informations incluent les propriétés de base de la translation, de la rotation et de la mise à l'échelle et les options plus avancées pour les pivots, les limites et les attributs des articulations IK tels que la rigidité et l'amortissement. Lors de sa première création, l'objet Node est "vide" (c'est-à-dire un objet sans aucune représentation graphique qui ne contient que les informations de position). Dans cet état, il peut être utilisé pour représenter les parents dans l'arborescence des nœuds, mais pas beaucoup plus. L'utilisation normale de ce type d'objets est de leur adjoindre une entité qui va spécialiser le nœud (voir la section "Entité"). L'entité est un objet en soi et est connectée au nœud. Cela signifie également que la même entité peut être partagée entre plusieurs nœuds. Camera, Light, Mesh, etc... sont toutes des entités et elles dérivent toutes de la classe de base Entity. |
| [NodeVisitor](./nodevisitor) | Un rappel pour parcourir toute la hiérarchie des nœuds. |
| [Pose](./pose) | La pose est utilisée pour stocker la matrice de transformation lorsque la géométrie est skinnée. La pose est un ensemble de[`BonePose`](../aspose.threed/bonepose) , chaque[`BonePose`](../aspose.threed/bonepose) enregistre les informations de transformation concrète du nœud osseux. |
| [Property](./property) | Classe pour contenir les propriétés définies par l'utilisateur. |
| [PropertyCollection](./propertycollection) | La collection de propriétés |
| [Scene](./scene) | Une scène est un objet de niveau supérieur qui contient les nœuds, les géométries, les matériaux, les textures, l'animation, les poses, les sous-scènes, etc. La scène peut avoir des sous-scènes, agit comme un support de plusieurs documents dans des fichiers comme collada/blender /fbx La hiérarchie des nœuds est accessible via[`RootNode`](../aspose.threed/scene/rootnode)[`Library`](../aspose.threed/scene/library) est utilisé pour conserver une référence d'objets non attachés pendant la sérialisation (comme les métadonnées ou les objets personnalisés) afin qu'il puisse être utilisé comme bibliothèque. |
| [SceneObject](./sceneobject) | La classe racine des objets qui seront stockés dans une scène. |
| [Transform](./transform) | Une transformation contient des informations qui permettent d'accéder à la matrice de translation/échelle/rotation ou de transformation de l'objet à un coût minimum Ceci est utilisé par la transformation locale. |
| [TrialException](./trialexception) | Ceci est déclenché dans Scene.Open/Scene.Save lorsqu'aucune licence n'est appliquée. Vous pouvez désactiver cette exception en définissant SuppressTrialException sur true. |
## Interfaces

| Interface | La description |
| --- | --- |
| [INamedObject](./inamedobject) | Objet qui a un nom |
## Énumération

| Énumération | La description |
| --- | --- |
| [Axis](./axis) | L'axe des coordonnées. |
| [CoordinatedSystem](./coordinatedsystem) | Le système de coordonnées gaucher ou droitier. |
| [FileContentType](./filecontenttype) | Type de contenu de fichier |
| [PoseType](./posetype) | Type de pose. |
| [PropertyFlags](./propertyflags) | Drapeaux de la propriété |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
