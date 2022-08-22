---
title: Transform
second_title: Référence de l'API Aspose.3D pour .NET
description: Une transformation contient des informations qui permettent daccéder à la matrice de translation/échelle/rotation ou de transformation de lobjet à un coût minimum Ceci est utilisé par la transformation locale.
type: docs
weight: 2400
url: /fr/net/aspose.threed/transform/
---
## Transform class

Une transformation contient des informations qui permettent d'accéder à la matrice de translation/échelle/rotation ou de transformation de l'objet à un coût minimum Ceci est utilisé par la transformation locale.

```csharp
public class Transform : A3DObject
```

## Propriétés

| Nom | La description |
| --- | --- |
| [EulerAngles](../../aspose.threed/transform/eulerangles) { get; set; } | Obtient ou définit la rotation représentée en angles d'Euler, mesurée en degrés |
| [GeometricRotation](../../aspose.threed/transform/geometricrotation) { get; set; } | Obtient ou définit la rotation géométrique d'Euler (mesurée en degrés). La transformation géométrique n'affecte que les entités attachées et laisse les nœuds enfants inchangés. Elle sera fusionnée en tant que transformation locale lorsque vous exportez la transformation géométrique vers des types de fichiers qui ne la prennent pas en charge. |
| [GeometricScaling](../../aspose.threed/transform/geometricscaling) { get; set; } | Obtient ou définit l'échelle géométrique. La transformation géométrique n'affecte que les entités attachées et laisse les nœuds enfants inchangés. Elle sera fusionnée en tant que transformation locale lorsque vous exportez la transformation géométrique vers des types de fichiers qui ne la prennent pas en charge. |
| [GeometricTranslation](../../aspose.threed/transform/geometrictranslation) { get; set; } | Obtient ou définit la translation géométrique. La transformation géométrique n'affecte que les entités attachées et laisse les nœuds enfants inchangés. Elle sera fusionnée en tant que transformation locale lorsque vous exportez la transformation géométrique vers des types de fichiers qui ne la prennent pas en charge. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtient ou définit le nom. |
| [PostRotation](../../aspose.threed/transform/postrotation) { get; set; } | Obtient ou définit la post-rotation représentée en degré |
| [PreRotation](../../aspose.threed/transform/prerotation) { get; set; } | Obtient ou définit la pré-rotation représentée en degré |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtient la collection de toutes les propriétés. |
| [Rotation](../../aspose.threed/transform/rotation) { get; set; } | Obtient ou définit la rotation représentée en quaternion. |
| [Scale](../../aspose.threed/transform/scale) { get; set; } | Obtient ou définit l'échelle |
| [TransformMatrix](../../aspose.threed/transform/transformmatrix) { get; set; } | Obtient ou définit la matrice de transformation. |
| [Translation](../../aspose.threed/transform/translation) { get; set; } | Obtient ou définit la translation |

## Méthodes

| Nom | La description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trouve la propriété. Il peut s'agir d'une propriété dynamique (créée par CreateDynamicProperty/SetProperty) ou d'une propriété native (identifiée par son nom) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtenir la valeur de la propriété spécifiée |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Supprime une propriété dynamique. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Supprimer la propriété spécifiée identifiée par name |
| [SetEulerAngles](../../aspose.threed/transform/seteulerangles)(double, double, double) | Définit les angles d'Euler en degrés de la transformation actuelle. |
| [SetGeometricRotation](../../aspose.threed/transform/setgeometricrotation)(double, double, double) | Définit la rotation géométrique d'Euler (mesurée en degré). La transformation géométrique n'affecte que les entités attachées et laisse les nœuds enfants inchangés. Elle sera fusionnée en tant que transformation locale lorsque vous exportez la transformation géométrique vers des types de fichiers qui ne la prennent pas en charge. |
| [SetGeometricScaling](../../aspose.threed/transform/setgeometricscaling)(double, double, double) | Définit l'échelle géométrique. La transformation géométrique n'affecte que les entités attachées et laisse les nœuds enfants inchangés. Elle sera fusionnée en tant que transformation locale lorsque vous exportez la transformation géométrique vers des types de fichiers qui ne la prennent pas en charge. |
| [SetGeometricTranslation](../../aspose.threed/transform/setgeometrictranslation)(double, double, double) | Définit la translation géométrique. La transformation géométrique n'affecte que les entités attachées et laisse les nœuds enfants inchangés. Elle sera fusionnée en tant que transformation locale lorsque vous exportez la transformation géométrique vers des types de fichiers qui ne la prennent pas en charge. |
| [SetPostRotation](../../aspose.threed/transform/setpostrotation)(double, double, double) | Définit la post-rotation représentée en degré |
| [SetPreRotation](../../aspose.threed/transform/setprerotation)(double, double, double) | Définit la pré-rotation représentée en degré |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Définit la valeur de la propriété spécifiée |
| [SetRotation](../../aspose.threed/transform/setrotation)(double, double, double, double) | Définit la rotation (en tant que composants de quaternion) de la transformation actuelle. |
| [SetScale](../../aspose.threed/transform/setscale)(double, double, double) | Définit l'échelle de la transformation actuelle. |
| [SetTranslation](../../aspose.threed/transform/settranslation)(double, double, double) | Définit la traduction de la transformation actuelle. |

### Voir également

* class [A3DObject](../a3dobject)
* espace de noms [Aspose.ThreeD](../../aspose.threed)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
