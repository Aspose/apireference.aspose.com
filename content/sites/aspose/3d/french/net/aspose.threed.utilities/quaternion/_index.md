---
title: Quaternion
second_title: Référence de l'API Aspose.3D pour .NET
description: Quaternion est généralement utilisé pour effectuer des rotations en infographie.
type: docs
weight: 2590
url: /fr/net/aspose.threed.utilities/quaternion/
---
## Quaternion structure

Quaternion est généralement utilisé pour effectuer des rotations en infographie.

```csharp
public struct Quaternion
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Quaternion](quaternion)(double, double, double, double) | Initialise une nouvelle instance du[`Quaternion`](../quaternion) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Length](../../aspose.threed.utilities/quaternion/length) { get; } | Obtient la longueur du quaternion |

## Méthodes

| Nom | La description |
| --- | --- |
| static [FromAngleAxis](../../aspose.threed.utilities/quaternion/fromangleaxis)(double, Vector3) | Crée un quaternion autour d'un axe donné et tourne dans le sens des aiguilles d'une montre |
| static [FromEulerAngle](../../aspose.threed.utilities/quaternion/fromeulerangle#fromeulerangle)(Vector3) | Crée un quaternion à partir d'un angle d'Euler donné |
| static [FromEulerAngle](../../aspose.threed.utilities/quaternion/fromeulerangle#fromeulerangle_1)(double, double, double) | Crée un quaternion à partir d'un angle d'Euler donné |
| static [FromRotation](../../aspose.threed.utilities/quaternion/fromrotation)(Vector3, Vector3) | Crée un quaternion qui tourne de l'origine à la direction de destination |
| static [Interpolate](../../aspose.threed.utilities/quaternion/interpolate)(float, Quaternion, Quaternion) | Remplit ce quaternion avec la valeur interpolée entre les arguments de quaternion donnés pour à entre de et à. |
| [Concat](../../aspose.threed.utilities/quaternion/concat)(Quaternion) | Concaténer deux quaternions |
| [Conjugate](../../aspose.threed.utilities/quaternion/conjugate)() | Renvoie un quaternion conjugué du quaternion actuel |
| [Dot](../../aspose.threed.utilities/quaternion/dot)(Quaternion) | Produit points |
| override [Equals](../../aspose.threed.utilities/quaternion/equals)(object) | Vérifie si deux quaternions égalent |
| [EulerAngles](../../aspose.threed.utilities/quaternion/eulerangles)() | Convertit le quaternion en rotation représentée par les angles d'Euler Tous les composants sont en radian |
| override [GetHashCode](../../aspose.threed.utilities/quaternion/gethashcode)() | Obtient le code de hachage de Quaternion |
| [Inverse](../../aspose.threed.utilities/quaternion/inverse)() | Renvoie un quaternion inverse du quaternion actuel |
| [Normalize](../../aspose.threed.utilities/quaternion/normalize)() | Normaliser le quaternion |
| [ToAngleAxis](../../aspose.threed.utilities/quaternion/toangleaxis)(out double, out Vector3) |  |
| [ToMatrix](../../aspose.threed.utilities/quaternion/tomatrix)() | Convertir la rotation présentée par le quaternion pour transformer la matrice. |
| override [ToString](../../aspose.threed.utilities/quaternion/tostring)() | Obtient la représentation du quaternion dans string |
| [operator +](../../aspose.threed.utilities/quaternion/op_addition) | Surcharge d'opérateur pour + |
| [operator /](../../aspose.threed.utilities/quaternion/op_division) | Surcharge d'opérateur pour / |
| [operator ==](../../aspose.threed.utilities/quaternion/op_equality) | Opérateur égal pour quaternion |
| [operator !=](../../aspose.threed.utilities/quaternion/op_inequality) | Opérateur non égal pour quaternion |
| [operator *](../../aspose.threed.utilities/quaternion/op_multiply#op_multiply_1) | Surcharge de l'opérateur pour * (5 operators) |

## Des champs

| Nom | La description |
| --- | --- |
| static readonly [Identity](../../aspose.threed.utilities/quaternion/identity) | Le quaternion d'identité. |
| [w](../../aspose.threed.utilities/quaternion/w) | Le composant w. |
| [x](../../aspose.threed.utilities/quaternion/x) | La composante x. |
| [y](../../aspose.threed.utilities/quaternion/y) | La composante y. |
| [z](../../aspose.threed.utilities/quaternion/z) | La composante z. |

### Voir également

* espace de noms [Aspose.ThreeD.Utilities](../../aspose.threed.utilities)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
