---
title: CShape
second_title: Aspose.3D für .NET-API-Referenz
description: IFCkompatibles Cförmiges Profil das durch Parameter definiert wird. Die Mittelposition des Profils befindet sich in der Mitte des Begrenzungsrahmens.
type: docs
weight: 1520
url: /de/net/aspose.threed.profiles/cshape/
---
## CShape class

IFC-kompatibles C-förmiges Profil, das durch Parameter definiert wird. Die Mittelposition des Profils befindet sich in der Mitte des Begrenzungsrahmens.

```csharp
public class CShape : ParameterizedProfile
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [CShape](cshape)() | Konstrukteur von[`CShape`](../cshape) |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Depth](../../aspose.threed.profiles/cshape/depth) { get; set; } | Ruft die Tiefe des Profils ab oder legt sie fest. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ruft ab oder legt fest, ob diese Entität während des Exports ausgeschlossen werden soll. |
| [Girth](../../aspose.threed.profiles/cshape/girth) { get; set; } | Ruft die Umfangslänge ab oder legt sie fest. |
| [InternalFilletRadius](../../aspose.threed.profiles/cshape/internalfilletradius) { get; set; } | Ruft den internen Verrundungsradius ab oder legt ihn fest. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ruft den Namen ab oder legt ihn fest. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ruft den ersten übergeordneten Knoten ab oder legt ihn fest. Wenn der erste übergeordnete Knoten festgelegt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ruft alle übergeordneten Knoten ab, eine Entität kann an mehrere übergeordnete Knoten angehängt werden, um Geometrie zu instanziieren |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ruft die Sammlung aller Eigenschaften ab. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ruft die Szene ab, zu der dieses Objekt gehört |
| [WallThickness](../../aspose.threed.profiles/cshape/wallthickness) { get; set; } | Ruft die Dicke der Wand ab oder legt sie fest. |
| [Width](../../aspose.threed.profiles/cshape/width) { get; set; } | Ruft die Breite des Profils ab oder legt sie fest. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Findet die Eigenschaft. Es kann eine dynamische Eigenschaft sein (erstellt von CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Ruft den Begrenzungsrahmen des aktuellen Objekts in seinem Objektraum-Koordinatensystem ab. |
| override [GetEntityRendererKey](../../aspose.threed.profiles/profile/getentityrendererkey)() | Ruft den Schlüssel des Entity-Renderers ab, der im Renderer registriert ist |
| override [GetExtent](../../aspose.threed.profiles/cshape/getextent)() | Ruft die Ausdehnung in x- und y-Dimension ab. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Holen Sie sich den Wert der angegebenen Eigenschaft |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Entfernt eine dynamische Eigenschaft. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Entfernt die angegebene Eigenschaft identifiziert durch name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Legt den Wert der angegebenen Eigenschaft fest |

### Siehe auch

* class [ParameterizedProfile](../parameterizedprofile)
* namensraum [Aspose.ThreeD.Profiles](../../aspose.threed.profiles)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
