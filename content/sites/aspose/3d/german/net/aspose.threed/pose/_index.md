---
title: Pose
second_title: Aspose.3D für .NET-API-Referenz
description: Die Pose wird verwendet um die Transformationsmatrix zu speichern wenn die Geometrie geskinnt wird. Die Pose ist ein Satz vonBonePose./bonepose  jederBonePose./bonepose speichert die konkreten Transformationsinformationen des Knochenknotens.
type: docs
weight: 1490
url: /de/net/aspose.threed/pose/
---
## Pose class

Die Pose wird verwendet, um die Transformationsmatrix zu speichern, wenn die Geometrie geskinnt wird. Die Pose ist ein Satz von[`BonePose`](../bonepose) , jeder[`BonePose`](../bonepose) speichert die konkreten Transformationsinformationen des Knochenknotens.

```csharp
public class Pose : A3DObject
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Pose](pose#constructor)() | Initialisiert eine neue Instanz von[`Pose`](../pose) Klasse. |
| [Pose](pose#constructor_1)(string) | Initialisiert eine neue Instanz von[`Pose`](../pose) Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [BonePoses](../../aspose.threed/pose/boneposes) { get; } | bekommt alles[`BonePose`](../bonepose) . |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ruft den Namen ab oder legt ihn fest. |
| [PoseType](../../aspose.threed/pose/posetype) { get; set; } | Ruft den Posentyp ab oder legt ihn fest. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ruft die Sammlung aller Eigenschaften ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [AddBonePose](../../aspose.threed/pose/addbonepose#addbonepose)(Node, Matrix4) | Speichert die Posentransformationsmatrix für den angegebenen Bone-Knoten. Globale Transformationsmatrix ist impliziert. |
| [AddBonePose](../../aspose.threed/pose/addbonepose#addbonepose_1)(Node, Matrix4, bool) | Speichert die Posentransformationsmatrix für den angegebenen Bone-Knoten. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Findet die Eigenschaft. Es kann eine dynamische Eigenschaft sein (erstellt von CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Holen Sie sich den Wert der angegebenen Eigenschaft |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Entfernt eine dynamische Eigenschaft. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Entfernt die angegebene Eigenschaft identifiziert durch name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Legt den Wert der angegebenen Eigenschaft fest |

### Siehe auch

* class [A3DObject](../a3dobject)
* namensraum [Aspose.ThreeD](../../aspose.threed)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
