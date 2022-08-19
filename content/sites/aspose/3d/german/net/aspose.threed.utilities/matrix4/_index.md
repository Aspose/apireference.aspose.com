---
title: Matrix4
second_title: Aspose.3D für .NET-API-Referenz
description: 4x4MatrixImplementierung.
type: docs
weight: 2560
url: /de/net/aspose.threed.utilities/matrix4/
---
## Matrix4 structure

4x4-Matrix-Implementierung.

```csharp
public struct Matrix4
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Matrix4](matrix4#constructor_3)(double[]) | Initialisiert eine neue Instanz von[`Matrix4`](../matrix4) struct. |
| [Matrix4](matrix4#constructor)(FMatrix4) | Konstrukt[`Matrix4`](../matrix4) von einem[`FMatrix4`](../fmatrix4) instance |
| [Matrix4](matrix4#constructor_1)(Vector4, Vector4, Vector4, Vector4) | Konstruiert eine Matrix aus 4 Zeilen. |
| [Matrix4](matrix4#constructor_2)(double, double, double, double, double, double, double, double, double, double, double, double, double, double, double, double) | Initialisiert eine neue Instanz von[`Matrix4`](../matrix4) struct. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| static [Identity](../../aspose.threed.utilities/matrix4/identity) { get; } | Ruft die Identitätsmatrix ab. |
| [Determinant](../../aspose.threed.utilities/matrix4/determinant) { get; } | Ruft die Determinante der Matrix ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [Rotate](../../aspose.threed.utilities/matrix4/rotate#rotate)(Quaternion) | Erstellen Sie eine Rotationsmatrix aus einem Quaternion |
| static [Rotate](../../aspose.threed.utilities/matrix4/rotate#rotate_1)(double, Vector3) | Erstellen Sie eine Rotationsmatrix nach Rotationswinkel und Achse |
| static [RotateFromEuler](../../aspose.threed.utilities/matrix4/rotatefromeuler#rotatefromeuler)(Vector3) | Erstellen Sie eine Rotationsmatrix aus dem Euler-Winkel |
| static [RotateFromEuler](../../aspose.threed.utilities/matrix4/rotatefromeuler#rotatefromeuler_1)(double, double, double) | Erstellen Sie eine Rotationsmatrix aus dem Euler-Winkel |
| static [Scale](../../aspose.threed.utilities/matrix4/scale#scale_1)(double) | Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse skaliert. |
| static [Scale](../../aspose.threed.utilities/matrix4/scale#scale)(Vector3) | Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse skaliert. |
| static [Scale](../../aspose.threed.utilities/matrix4/scale#scale_2)(double, double, double) | Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse skaliert. |
| static [Translate](../../aspose.threed.utilities/matrix4/translate#translate)(Vector3) | Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse verschoben wird |
| static [Translate](../../aspose.threed.utilities/matrix4/translate#translate_1)(double, double, double) | Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse verschoben wird |
| [Concatenate](../../aspose.threed.utilities/matrix4/concatenate)(Matrix4) | Verkettet die beiden Matrizen |
| [Decompose](../../aspose.threed.utilities/matrix4/decompose)(out Vector3, out Vector3, out Quaternion) |  |
| [Inverse](../../aspose.threed.utilities/matrix4/inverse)() | Kehrt diese Instanz um. |
| [Normalize](../../aspose.threed.utilities/matrix4/normalize)() | Normalisiert diese Instanz. |
| [SetTRS](../../aspose.threed.utilities/matrix4/settrs)(Vector3, Vector3, Vector3) | Initialisiert die Matrix mit Translation/Rotation/Scale |
| [ToArray](../../aspose.threed.utilities/matrix4/toarray)() | Wandelt Matrix in Array um. |
| override [ToString](../../aspose.threed.utilities/matrix4/tostring)() | Gibt a zurückStringdas repräsentiert den Strom[`Matrix4`](../matrix4) . |
| [Transpose](../../aspose.threed.utilities/matrix4/transpose)() | Transponiert diese Instanz. |
| [operator *](../../aspose.threed.utilities/matrix4/op_multiply#op_multiply) | Multipliziere die beiden Matrizen (4 operators) |

## Felder

| Name | Beschreibung |
| --- | --- |
| [m00](../../aspose.threed.utilities/matrix4/m00) | Die m00. |
| [m01](../../aspose.threed.utilities/matrix4/m01) | Die m01. |
| [m02](../../aspose.threed.utilities/matrix4/m02) | Die m02. |
| [m03](../../aspose.threed.utilities/matrix4/m03) | Der m03. |
| [m10](../../aspose.threed.utilities/matrix4/m10) | Der m10. |
| [m11](../../aspose.threed.utilities/matrix4/m11) | Der m11. |
| [m12](../../aspose.threed.utilities/matrix4/m12) | Der m12. |
| [m13](../../aspose.threed.utilities/matrix4/m13) | Der m13. |
| [m20](../../aspose.threed.utilities/matrix4/m20) | Der m20. |
| [m21](../../aspose.threed.utilities/matrix4/m21) | Der m21. |
| [m22](../../aspose.threed.utilities/matrix4/m22) | Der m22. |
| [m23](../../aspose.threed.utilities/matrix4/m23) | Der m23. |
| [m30](../../aspose.threed.utilities/matrix4/m30) | Der m30. |
| [m31](../../aspose.threed.utilities/matrix4/m31) | Der m31. |
| [m32](../../aspose.threed.utilities/matrix4/m32) | Der m32. |
| [m33](../../aspose.threed.utilities/matrix4/m33) | Der m33. |

### Siehe auch

* namensraum [Aspose.ThreeD.Utilities](../../aspose.threed.utilities)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
