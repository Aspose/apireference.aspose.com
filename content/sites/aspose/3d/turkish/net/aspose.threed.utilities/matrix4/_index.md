---
title: Matrix4
second_title: Aspose.3D for .NET API Referansı
description: 4x4 matris uygulaması.
type: docs
weight: 2560
url: /tr/net/aspose.threed.utilities/matrix4/
---
## Matrix4 structure

4x4 matris uygulaması.

```csharp
public struct Matrix4
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Matrix4](matrix4#constructor_3)(double[]) | Yeni bir örneğini başlatır[`Matrix4`](../matrix4) yapı. |
| [Matrix4](matrix4#constructor)(FMatrix4) | Oluştur[`Matrix4`](../matrix4) bir[`FMatrix4`](../fmatrix4) instance |
| [Matrix4](matrix4#constructor_1)(Vector4, Vector4, Vector4, Vector4) | 4 satırdan matris oluşturur. |
| [Matrix4](matrix4#constructor_2)(double, double, double, double, double, double, double, double, double, double, double, double, double, double, double, double) | Yeni bir örneğini başlatır[`Matrix4`](../matrix4) yapı. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| static [Identity](../../aspose.threed.utilities/matrix4/identity) { get; } | Kimlik matrisini alır. |
| [Determinant](../../aspose.threed.utilities/matrix4/determinant) { get; } | Matrisin determinantını alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [Rotate](../../aspose.threed.utilities/matrix4/rotate#rotate)(Quaternion) | Bir quaternion 'den bir döndürme matrisi oluşturun |
| static [Rotate](../../aspose.threed.utilities/matrix4/rotate#rotate_1)(double, Vector3) | Döndürme açısı ve axis ile bir döndürme matrisi oluşturun |
| static [RotateFromEuler](../../aspose.threed.utilities/matrix4/rotatefromeuler#rotatefromeuler)(Vector3) | Euler açısından bir döndürme matrisi oluşturun |
| static [RotateFromEuler](../../aspose.threed.utilities/matrix4/rotatefromeuler#rotatefromeuler_1)(double, double, double) | Euler açısından bir döndürme matrisi oluşturun |
| static [Scale](../../aspose.threed.utilities/matrix4/scale#scale_1)(double) | x ekseni, y ekseni ve z ekseni boyunca ölçeklenen bir matris oluşturur. |
| static [Scale](../../aspose.threed.utilities/matrix4/scale#scale)(Vector3) | x ekseni, y ekseni ve z ekseni boyunca ölçeklenen bir matris oluşturur. |
| static [Scale](../../aspose.threed.utilities/matrix4/scale#scale_2)(double, double, double) | x ekseni, y ekseni ve z ekseni boyunca ölçeklenen bir matris oluşturur. |
| static [Translate](../../aspose.threed.utilities/matrix4/translate#translate)(Vector3) | x ekseni, y ekseni ve z ekseni boyunca öteleyen bir matris oluşturur |
| static [Translate](../../aspose.threed.utilities/matrix4/translate#translate_1)(double, double, double) | x ekseni, y ekseni ve z ekseni boyunca öteleyen bir matris oluşturur |
| [Concatenate](../../aspose.threed.utilities/matrix4/concatenate)(Matrix4) | İki matrisi birleştirir |
| [Decompose](../../aspose.threed.utilities/matrix4/decompose)(out Vector3, out Vector3, out Quaternion) |  |
| [Inverse](../../aspose.threed.utilities/matrix4/inverse)() | Bu örneği tersine çevirir. |
| [Normalize](../../aspose.threed.utilities/matrix4/normalize)() | Bu örneği normalleştirir. |
| [SetTRS](../../aspose.threed.utilities/matrix4/settrs)(Vector3, Vector3, Vector3) | Matrisi çeviri/döndürme/ölçek ile başlatır |
| [ToArray](../../aspose.threed.utilities/matrix4/toarray)() | Matrisi diziye dönüştürür. |
| override [ToString](../../aspose.threed.utilities/matrix4/tostring)() | Bir döndürürStringakımı temsil eden[`Matrix4`](../matrix4) . |
| [Transpose](../../aspose.threed.utilities/matrix4/transpose)() | Bu örneği transpoze eder. |
| [operator *](../../aspose.threed.utilities/matrix4/op_multiply#op_multiply) | İki matrisi çarpın (4 operators) |

## Alanlar

| İsim | Tanım |
| --- | --- |
| [m00](../../aspose.threed.utilities/matrix4/m00) | m00. |
| [m01](../../aspose.threed.utilities/matrix4/m01) | m01. |
| [m02](../../aspose.threed.utilities/matrix4/m02) | m02. |
| [m03](../../aspose.threed.utilities/matrix4/m03) | m03. |
| [m10](../../aspose.threed.utilities/matrix4/m10) | m10. |
| [m11](../../aspose.threed.utilities/matrix4/m11) | m11. |
| [m12](../../aspose.threed.utilities/matrix4/m12) | m12. |
| [m13](../../aspose.threed.utilities/matrix4/m13) | m13. |
| [m20](../../aspose.threed.utilities/matrix4/m20) | m20. |
| [m21](../../aspose.threed.utilities/matrix4/m21) | m21. |
| [m22](../../aspose.threed.utilities/matrix4/m22) | m22. |
| [m23](../../aspose.threed.utilities/matrix4/m23) | m23. |
| [m30](../../aspose.threed.utilities/matrix4/m30) | m30. |
| [m31](../../aspose.threed.utilities/matrix4/m31) | m31. |
| [m32](../../aspose.threed.utilities/matrix4/m32) | m32. |
| [m33](../../aspose.threed.utilities/matrix4/m33) | m33. |

### Ayrıca bakınız

* ad alanı [Aspose.ThreeD.Utilities](../../aspose.threed.utilities)
* toplantı [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
