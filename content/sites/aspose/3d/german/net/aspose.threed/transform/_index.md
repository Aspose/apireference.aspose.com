---
title: Transform
second_title: Aspose.3D für .NET-API-Referenz
description: Eine Transformation enthält Informationen die den Zugriff auf die Verschiebungs-/Skalierungs-/Rotations- oder Transformationsmatrix des Objekts zu minimalen Kosten ermöglichen Dies wird von der lokalen Transformation verwendet.
type: docs
weight: 2400
url: /de/net/aspose.threed/transform/
---
## Transform class

Eine Transformation enthält Informationen, die den Zugriff auf die Verschiebungs-/Skalierungs-/Rotations- oder Transformationsmatrix des Objekts zu minimalen Kosten ermöglichen Dies wird von der lokalen Transformation verwendet.

```csharp
public class Transform : A3DObject
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [EulerAngles](../../aspose.threed/transform/eulerangles) { get; set; } | Ruft die in Euler-Winkeln dargestellte Drehung ab oder legt sie fest, gemessen in Grad |
| [GeometricRotation](../../aspose.threed/transform/geometricrotation) { get; set; } | Holt oder setzt die geometrische Euler-Rotation (gemessen in Grad). Die geometrische Transformation wirkt sich nur auf die angehängten Elemente aus und lässt die untergeordneten Knoten unberührt. Sie wird als lokale Transformation zusammengeführt, wenn Sie die geometrische Transformation in Dateitypen exportieren, die dies nicht unterstützen. |
| [GeometricScaling](../../aspose.threed/transform/geometricscaling) { get; set; } | Holt oder setzt die geometrische Skalierung. Die geometrische Transformation wirkt sich nur auf die angehängten Elemente aus und lässt die untergeordneten Knoten unberührt. Sie wird als lokale Transformation zusammengeführt, wenn Sie die geometrische Transformation in Dateitypen exportieren, die dies nicht unterstützen. |
| [GeometricTranslation](../../aspose.threed/transform/geometrictranslation) { get; set; } | Ruft die geometrische Übersetzung ab oder legt sie fest. Die geometrische Transformation wirkt sich nur auf die angehängten Elemente aus und lässt die untergeordneten Knoten unberührt. Sie wird als lokale Transformation zusammengeführt, wenn Sie die geometrische Transformation in Dateitypen exportieren, die dies nicht unterstützen. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ruft den Namen ab oder legt ihn fest. |
| [PostRotation](../../aspose.threed/transform/postrotation) { get; set; } | Ruft die in Grad dargestellte Nachdrehung ab oder legt sie fest |
| [PreRotation](../../aspose.threed/transform/prerotation) { get; set; } | Ruft die in Grad dargestellte Vordrehung ab oder setzt sie |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ruft die Sammlung aller Eigenschaften ab. |
| [Rotation](../../aspose.threed/transform/rotation) { get; set; } | Ruft die in Quaternion dargestellte Drehung ab oder legt sie fest. |
| [Scale](../../aspose.threed/transform/scale) { get; set; } | Holt oder setzt die Skala |
| [TransformMatrix](../../aspose.threed/transform/transformmatrix) { get; set; } | Ruft die Transformationsmatrix ab oder legt sie fest. |
| [Translation](../../aspose.threed/transform/translation) { get; set; } | Holt oder setzt die Übersetzung |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Findet die Eigenschaft. Es kann eine dynamische Eigenschaft sein (erstellt von CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Holen Sie sich den Wert der angegebenen Eigenschaft |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Entfernt eine dynamische Eigenschaft. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Entfernt die angegebene Eigenschaft identifiziert durch name |
| [SetEulerAngles](../../aspose.threed/transform/seteulerangles)(double, double, double) | Legt die Euler-Winkel in Grad der aktuellen Transformation fest. |
| [SetGeometricRotation](../../aspose.threed/transform/setgeometricrotation)(double, double, double) | Legt die geometrische Euler-Rotation (gemessen in Grad) fest. Die geometrische Transformation wirkt sich nur auf die angehängten Elemente aus und lässt die untergeordneten Knoten unberührt. Sie wird als lokale Transformation zusammengeführt, wenn Sie die geometrische Transformation in Dateitypen exportieren, die dies nicht unterstützen. |
| [SetGeometricScaling](../../aspose.threed/transform/setgeometricscaling)(double, double, double) | Legt die geometrische Skalierung fest. Die geometrische Transformation wirkt sich nur auf die angehängten Elemente aus und lässt die untergeordneten Knoten unberührt. Sie wird als lokale Transformation zusammengeführt, wenn Sie die geometrische Transformation in Dateitypen exportieren, die dies nicht unterstützen. |
| [SetGeometricTranslation](../../aspose.threed/transform/setgeometrictranslation)(double, double, double) | Legt die geometrische Übersetzung fest. Die geometrische Transformation wirkt sich nur auf die angehängten Elemente aus und lässt die untergeordneten Knoten unberührt. Sie wird als lokale Transformation zusammengeführt, wenn Sie die geometrische Transformation in Dateitypen exportieren, die dies nicht unterstützen. |
| [SetPostRotation](../../aspose.threed/transform/setpostrotation)(double, double, double) | Legt die in Grad dargestellte Nachdrehung fest |
| [SetPreRotation](../../aspose.threed/transform/setprerotation)(double, double, double) | Legt die in Grad dargestellte Vordrehung fest |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Legt den Wert der angegebenen Eigenschaft fest |
| [SetRotation](../../aspose.threed/transform/setrotation)(double, double, double, double) | Legt die Drehung (als Quaternion-Komponenten) der aktuellen Transformation fest. |
| [SetScale](../../aspose.threed/transform/setscale)(double, double, double) | Legt die Skalierung der aktuellen Transformation fest. |
| [SetTranslation](../../aspose.threed/transform/settranslation)(double, double, double) | Legt die Übersetzung der aktuellen Transformation fest. |

### Siehe auch

* class [A3DObject](../a3dobject)
* namensraum [Aspose.ThreeD](../../aspose.threed)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
