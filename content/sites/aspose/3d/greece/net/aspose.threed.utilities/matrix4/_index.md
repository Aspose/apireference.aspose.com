---
title: Matrix4
second_title: Aspose.3D για Αναφορά API .NET
description: Υλοποίηση μήτρας 4x4.
type: docs
weight: 2560
url: /el/net/aspose.threed.utilities/matrix4/
---
## Matrix4 structure

Υλοποίηση μήτρας 4x4.

```csharp
public struct Matrix4
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Matrix4](matrix4/#constructor_3)(double[]) | Αρχικοποιεί μια νέα παρουσία του`Matrix4` struct. |
| [Matrix4](matrix4/#constructor)(FMatrix4) | Κατασκευή`Matrix4` από ένα[`FMatrix4`](../fmatrix4/) instance |
| [Matrix4](matrix4/#constructor_1)(Vector4, Vector4, Vector4, Vector4) | Κατασκευάζει μήτρα από 4 σειρές. |
| [Matrix4](matrix4/#constructor_2)(double, double, double, double, double, double, double, double, double, double, double, double, double, double, double, double) | Αρχικοποιεί μια νέα παρουσία του`Matrix4` struct. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| static [Identity](../../aspose.threed.utilities/matrix4/identity/) { get; } | Λαμβάνει τον πίνακα ταυτότητας. |
| [Determinant](../../aspose.threed.utilities/matrix4/determinant/) { get; } | Παίρνει την ορίζουσα του πίνακα. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [Rotate](../../aspose.threed.utilities/matrix4/rotate/#rotate)(Quaternion) | Δημιουργήστε έναν πίνακα περιστροφής από ένα τεταρτημόριο |
| static [Rotate](../../aspose.threed.utilities/matrix4/rotate/#rotate_1)(double, Vector3) | Δημιουργήστε έναν πίνακα περιστροφής κατά γωνία περιστροφής και άξονα |
| static [RotateFromEuler](../../aspose.threed.utilities/matrix4/rotatefromeuler/#rotatefromeuler)(Vector3) | Δημιουργία πίνακα περιστροφής από Euler angle |
| static [RotateFromEuler](../../aspose.threed.utilities/matrix4/rotatefromeuler/#rotatefromeuler_1)(double, double, double) | Δημιουργία πίνακα περιστροφής από Euler angle |
| static [Scale](../../aspose.threed.utilities/matrix4/scale/#scale_1)(double) | Δημιουργεί έναν πίνακα που κλιμακώνεται κατά μήκος του άξονα x, του άξονα y και του άξονα z. |
| static [Scale](../../aspose.threed.utilities/matrix4/scale/#scale)(Vector3) | Δημιουργεί έναν πίνακα που κλιμακώνεται κατά μήκος του άξονα x, του άξονα y και του άξονα z. |
| static [Scale](../../aspose.threed.utilities/matrix4/scale/#scale_2)(double, double, double) | Δημιουργεί έναν πίνακα που κλιμακώνεται κατά μήκος του άξονα x, του άξονα y και του άξονα z. |
| static [Translate](../../aspose.threed.utilities/matrix4/translate/#translate)(Vector3) | Δημιουργεί έναν πίνακα που μεταφράζεται κατά μήκος του άξονα x, του άξονα y και του άξονα z |
| static [Translate](../../aspose.threed.utilities/matrix4/translate/#translate_1)(double, double, double) | Δημιουργεί έναν πίνακα που μεταφράζεται κατά μήκος του άξονα x, του άξονα y και του άξονα z |
| [Concatenate](../../aspose.threed.utilities/matrix4/concatenate/)(Matrix4) | Συνενώνει τους δύο πίνακες |
| [Decompose](../../aspose.threed.utilities/matrix4/decompose/)(out Vector3, out Vector3, out Quaternion) |  |
| [Inverse](../../aspose.threed.utilities/matrix4/inverse/)() | Αντιστρέφει αυτήν την περίπτωση. |
| [Normalize](../../aspose.threed.utilities/matrix4/normalize/)() | Κανονικοποιεί αυτό το στιγμιότυπο. |
| [SetTRS](../../aspose.threed.utilities/matrix4/settrs/)(Vector3, Vector3, Vector3) | Αρχικοποιεί τον πίνακα με μετάφραση/περιστροφή/κλίμακα |
| [ToArray](../../aspose.threed.utilities/matrix4/toarray/)() | Μετατρέπει τον πίνακα σε πίνακα. |
| override [ToString](../../aspose.threed.utilities/matrix4/tostring/)() | Επιστρέφει αStringπου αντιπροσωπεύει το ρεύμα`Matrix4` . |
| [Transpose](../../aspose.threed.utilities/matrix4/transpose/)() | Μεταφέρει αυτό το στιγμιότυπο. |
| [operator *](../../aspose.threed.utilities/matrix4/op_multiply/#op_multiply) | Πολλαπλασιάστε τους δύο πίνακες (4 operators) |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| [m00](../../aspose.threed.utilities/matrix4/m00/) | Το m00. |
| [m01](../../aspose.threed.utilities/matrix4/m01/) | Το m01. |
| [m02](../../aspose.threed.utilities/matrix4/m02/) | Το m02. |
| [m03](../../aspose.threed.utilities/matrix4/m03/) | Το m03. |
| [m10](../../aspose.threed.utilities/matrix4/m10/) | Το m10. |
| [m11](../../aspose.threed.utilities/matrix4/m11/) | Το m11. |
| [m12](../../aspose.threed.utilities/matrix4/m12/) | Το m12. |
| [m13](../../aspose.threed.utilities/matrix4/m13/) | Το m13. |
| [m20](../../aspose.threed.utilities/matrix4/m20/) | Το m20. |
| [m21](../../aspose.threed.utilities/matrix4/m21/) | Το m21. |
| [m22](../../aspose.threed.utilities/matrix4/m22/) | Το m22. |
| [m23](../../aspose.threed.utilities/matrix4/m23/) | Το m23. |
| [m30](../../aspose.threed.utilities/matrix4/m30/) | Το m30. |
| [m31](../../aspose.threed.utilities/matrix4/m31/) | Το m31. |
| [m32](../../aspose.threed.utilities/matrix4/m32/) | Το m32. |
| [m33](../../aspose.threed.utilities/matrix4/m33/) | Το m33. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.ThreeD.Utilities](../../aspose.threed.utilities/)
* συνέλευση [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
