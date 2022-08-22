---
title: Matrix4
second_title: Référence de l'API Aspose.3D pour .NET
description: Implémentation de la matrice 4x4.
type: docs
weight: 2560
url: /fr/net/aspose.threed.utilities/matrix4/
---
## Matrix4 structure

Implémentation de la matrice 4x4.

```csharp
public struct Matrix4
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Matrix4](matrix4#constructor_3)(double[]) | Initialise une nouvelle instance du[`Matrix4`](../matrix4) structure. |
| [Matrix4](matrix4#constructor)(FMatrix4) | Construire[`Matrix4`](../matrix4) d'un[`FMatrix4`](../fmatrix4) instance |
| [Matrix4](matrix4#constructor_1)(Vector4, Vector4, Vector4, Vector4) | Construit une matrice à partir de 4 lignes. |
| [Matrix4](matrix4#constructor_2)(double, double, double, double, double, double, double, double, double, double, double, double, double, double, double, double) | Initialise une nouvelle instance du[`Matrix4`](../matrix4) structure. |

## Propriétés

| Nom | La description |
| --- | --- |
| static [Identity](../../aspose.threed.utilities/matrix4/identity) { get; } | Obtient la matrice d'identité. |
| [Determinant](../../aspose.threed.utilities/matrix4/determinant) { get; } | Obtient le déterminant de la matrice. |

## Méthodes

| Nom | La description |
| --- | --- |
| static [Rotate](../../aspose.threed.utilities/matrix4/rotate#rotate)(Quaternion) | Créer une matrice de rotation à partir d'un quaternion |
| static [Rotate](../../aspose.threed.utilities/matrix4/rotate#rotate_1)(double, Vector3) | Créer une matrice de rotation par angle de rotation et axe |
| static [RotateFromEuler](../../aspose.threed.utilities/matrix4/rotatefromeuler#rotatefromeuler)(Vector3) | Créer une matrice de rotation à partir de l'angle d'Euler |
| static [RotateFromEuler](../../aspose.threed.utilities/matrix4/rotatefromeuler#rotatefromeuler_1)(double, double, double) | Créer une matrice de rotation à partir de l'angle d'Euler |
| static [Scale](../../aspose.threed.utilities/matrix4/scale#scale_1)(double) | Crée une matrice mise à l'échelle le long de l'axe des x, de l'axe des y et de l'axe des z. |
| static [Scale](../../aspose.threed.utilities/matrix4/scale#scale)(Vector3) | Crée une matrice mise à l'échelle le long de l'axe des x, de l'axe des y et de l'axe des z. |
| static [Scale](../../aspose.threed.utilities/matrix4/scale#scale_2)(double, double, double) | Crée une matrice mise à l'échelle le long de l'axe des x, de l'axe des y et de l'axe des z. |
| static [Translate](../../aspose.threed.utilities/matrix4/translate#translate)(Vector3) | Crée une matrice qui se translate le long de l'axe des x, de l'axe des y et de l'axe des z |
| static [Translate](../../aspose.threed.utilities/matrix4/translate#translate_1)(double, double, double) | Crée une matrice qui se translate le long de l'axe des x, de l'axe des y et de l'axe des z |
| [Concatenate](../../aspose.threed.utilities/matrix4/concatenate)(Matrix4) | Concatène les deux matrices |
| [Decompose](../../aspose.threed.utilities/matrix4/decompose)(out Vector3, out Vector3, out Quaternion) |  |
| [Inverse](../../aspose.threed.utilities/matrix4/inverse)() | Inverse cette instance. |
| [Normalize](../../aspose.threed.utilities/matrix4/normalize)() | Normalise cette instance. |
| [SetTRS](../../aspose.threed.utilities/matrix4/settrs)(Vector3, Vector3, Vector3) | Initialise la matrice avec translation/rotation/scale |
| [ToArray](../../aspose.threed.utilities/matrix4/toarray)() | Convertit la matrice en tableau. |
| override [ToString](../../aspose.threed.utilities/matrix4/tostring)() | Renvoie unStringqui représente le courant[`Matrix4`](../matrix4) . |
| [Transpose](../../aspose.threed.utilities/matrix4/transpose)() | Transpose cette instance. |
| [operator *](../../aspose.threed.utilities/matrix4/op_multiply#op_multiply) | Multiplier les deux matrices (4 operators) |

## Des champs

| Nom | La description |
| --- | --- |
| [m00](../../aspose.threed.utilities/matrix4/m00) | Le m00. |
| [m01](../../aspose.threed.utilities/matrix4/m01) | Le m01. |
| [m02](../../aspose.threed.utilities/matrix4/m02) | Le m02. |
| [m03](../../aspose.threed.utilities/matrix4/m03) | Le m03. |
| [m10](../../aspose.threed.utilities/matrix4/m10) | Le m10. |
| [m11](../../aspose.threed.utilities/matrix4/m11) | Le m11. |
| [m12](../../aspose.threed.utilities/matrix4/m12) | Le m12. |
| [m13](../../aspose.threed.utilities/matrix4/m13) | Le m13. |
| [m20](../../aspose.threed.utilities/matrix4/m20) | Le m20. |
| [m21](../../aspose.threed.utilities/matrix4/m21) | Le m21. |
| [m22](../../aspose.threed.utilities/matrix4/m22) | Le m22. |
| [m23](../../aspose.threed.utilities/matrix4/m23) | Le m23. |
| [m30](../../aspose.threed.utilities/matrix4/m30) | Le m30. |
| [m31](../../aspose.threed.utilities/matrix4/m31) | Le m31. |
| [m32](../../aspose.threed.utilities/matrix4/m32) | Le m32. |
| [m33](../../aspose.threed.utilities/matrix4/m33) | Le m33. |

### Voir également

* espace de noms [Aspose.ThreeD.Utilities](../../aspose.threed.utilities)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
