---
title: Camera
second_title: Aspose.3D für .NET-API-Referenz
description: Die Kamera beschreibt den Blickpunkt des Betrachters der die Szene betrachtet.
type: docs
weight: 250
url: /de/net/aspose.threed.entities/camera/
---
## Camera class

Die Kamera beschreibt den Blickpunkt des Betrachters, der die Szene betrachtet.

```csharp
public class Camera : Frustum
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Camera](camera#constructor)() | Initialisiert eine neue Instanz von[`Camera`](../camera) Klasse. |
| [Camera](camera#constructor_1)(ProjectionType) | Initialisiert eine neue Instanz von[`Camera`](../camera) Klasse. |
| [Camera](camera#constructor_2)(string) | Initialisiert eine neue Instanz von[`Camera`](../camera) Klasse. |
| [Camera](camera#constructor_3)(string, ProjectionType) | Initialisiert eine neue Instanz von[`Camera`](../camera) Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [ApertureMode](../../aspose.threed.entities/camera/aperturemode) { get; set; } | Ruft den Blendenmodus der Kamera ab oder legt ihn fest |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | Ruft das Seitenverhältnis von frustum ab oder legt es fest |
| [AspectRatio](../../aspose.threed.entities/camera/aspectratio) { get; set; } | Ruft das Seitenverhältnis der Ansichtsebene ab oder legt es fest. |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Ruft die Richtung ab, in die die Kamera blickt, oder legt sie fest. Änderungen an dieser Eigenschaft wirken sich auch auf die aus[`LookAt`](../frustum/lookat) und[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ruft ab oder legt fest, ob diese Entität während des Exports ausgeschlossen werden soll. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Ruft den Abstand der fernen Ebene des Kegelstumpfs ab oder legt ihn fest. |
| [FieldOfView](../../aspose.threed.entities/camera/fieldofview) { get; set; } | Ermittelt oder setzt das Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode istHorizontal oderVertical |
| [FieldOfViewX](../../aspose.threed.entities/camera/fieldofviewx) { get; set; } | Holt oder setzt das horizontale Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode istHorizAndVert |
| [FieldOfViewY](../../aspose.threed.entities/camera/fieldofviewy) { get; set; } | Holt oder setzt das vertikale Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode istHorizAndVert |
| [Height](../../aspose.threed.entities/camera/height) { get; set; } | Ruft die Höhe der Ansichtsebene ab oder legt sie fest, gemessen in Zoll |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Ruft die interessante Position ab, auf die die Kamera blickt, oder legt sie fest. |
| [Magnification](../../aspose.threed.entities/camera/magnification) { get; set; } | Ruft die in der orthografischen Kamera verwendete Vergrößerung ab oder legt sie fest |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ruft den Namen ab oder legt ihn fest. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Ruft den Nahebenenabstand des Kegelstumpfs ab oder legt ihn fest. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Ruft die Höhe ab oder legt sie fest, wenn der Kegelstumpf in der orthografischen Projektion steht. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ruft den ersten übergeordneten Knoten ab oder legt ihn fest. Wenn der erste übergeordnete Knoten festgelegt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ruft alle übergeordneten Knoten ab, eine Entität kann an mehrere übergeordnete Knoten angehängt werden, um Geometrie zu instanziieren |
| [ProjectionType](../../aspose.threed.entities/camera/projectiontype) { get; set; } | Ruft den Projektionstyp der Kamera ab oder legt ihn fest. Standardmäßig wird die perspektivische Projektion verwendet. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ruft die Sammlung aller Eigenschaften ab. |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Ruft die Ausrichtung des Kegelstumpfs ab oder legt sie fest. mode Diese Eigenschaft funktioniert nur, wenn die[`Target`](../frustum/target) ist null. Wenn der Wert istFixedTarget , wird die Richtung immer von der Eigenschaft berechnet[`LookAt`](../frustum/lookat) Ansonsten die[`LookAt`](../frustum/lookat)wird immer von der berechnet[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ruft die Szene ab, zu der dieses Objekt gehört |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Ruft das Ziel ab, auf das die Kamera blickt, oder legt es fest. Wenn der Benutzer diese Eigenschaft unterstützt, sollte sie vor ihr liegen[`LookAt`](../frustum/lookat) Eigentum. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | Ruft die Aufwärtsrichtung der Kamera ab oder legt sie fest |
| [Width](../../aspose.threed.entities/camera/width) { get; set; } | Ruft die Breite der Ansichtsebene ab oder legt sie fest, gemessen in Zoll |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Findet die Eigenschaft. Es kann eine dynamische Eigenschaft sein (erstellt von CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Ruft den Begrenzungsrahmen des aktuellen Objekts in seinem Objektraum-Koordinatensystem ab. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Ruft den Schlüssel des Entity-Renderers ab, der im Renderer registriert ist |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Holen Sie sich den Wert der angegebenen Eigenschaft |
| [MoveForward](../../aspose.threed.entities/camera/moveforward)(double) | Kamera vorwärts in Richtung oder Ziel bewegen. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Entfernt eine dynamische Eigenschaft. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Entfernt die angegebene Eigenschaft identifiziert durch name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Legt den Wert der angegebenen Eigenschaft fest |

### Siehe auch

* class [Frustum](../frustum)
* namensraum [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
