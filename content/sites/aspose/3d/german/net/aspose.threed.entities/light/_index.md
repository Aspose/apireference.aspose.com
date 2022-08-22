---
title: Light
second_title: Aspose.3D für .NET-API-Referenz
description: Das Licht erhellt die Szene.
type: docs
weight: 400
url: /de/net/aspose.threed.entities/light/
---
## Light class

Das Licht erhellt die Szene.

Die Formel zur Berechnung der Gesamtlichtdämpfung lautet: `A = Konstante Dämpfung + (Dist * Lineare Dämpfung) + ((Dist^2) * Quadratische Dämpfung)`

```csharp
public class Light : Frustum
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Light](light#constructor)() | Initialisiert eine neue Instanz von[`Light`](../light) Klasse. |
| [Light](light#constructor_1)(string) | Initialisiert eine neue Instanz von[`Light`](../light) Klasse. |
| [Light](light#constructor_2)(string, LightType) | Initialisiert eine neue Instanz von[`Light`](../light) Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | Ruft das Seitenverhältnis von frustum ab oder legt es fest |
| [CastLight](../../aspose.threed.entities/light/castlight) { get; set; } | Ruft ab oder legt fest, ob die aktuelle Lichtinstanz andere Objekte beleuchten kann. |
| [CastShadows](../../aspose.threed.entities/light/castshadows) { get; set; } | Ruft ab oder legt fest, ob das Licht Schatten auf andere Objekte werfen kann. |
| [Color](../../aspose.threed.entities/light/color) { get; set; } | Ruft die Farbe des Lichts ab oder legt sie fest |
| [ConstantAttenuation](../../aspose.threed.entities/light/constantattenuation) { get; set; } | Ruft die konstante Dämpfung ab oder legt sie fest, um die Gesamtdämpfung des Lichts zu berechnen |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Ruft die Richtung ab, in die die Kamera blickt, oder legt sie fest. Änderungen an dieser Eigenschaft wirken sich auch auf die aus[`LookAt`](../frustum/lookat) und[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ruft ab oder legt fest, ob diese Entität während des Exports ausgeschlossen werden soll. |
| [Falloff](../../aspose.threed.entities/light/falloff) { get; set; } | Ruft den Falloff-Kegelwinkel (in Grad) ab oder legt ihn fest. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Ruft den Abstand der fernen Ebene des Kegelstumpfs ab oder legt ihn fest. |
| [HotSpot](../../aspose.threed.entities/light/hotspot) { get; set; } | Ruft den Hot-Spot-Kegelwinkel (in Grad) ab oder legt ihn fest. |
| [Intensity](../../aspose.threed.entities/light/intensity) { get; set; } | Liest oder setzt die Intensität des Lichts, Standardwert ist 100 |
| [LightType](../../aspose.threed.entities/light/lighttype) { get; set; } | Holt oder setzt den Lichttyp |
| [LinearAttenuation](../../aspose.threed.entities/light/linearattenuation) { get; set; } | Ruft die lineare Dämpfung ab oder legt sie fest, um die Gesamtdämpfung des Lichts zu berechnen |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Ruft die interessante Position ab, auf die die Kamera blickt, oder legt sie fest. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ruft den Namen ab oder legt ihn fest. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Ruft den Nahebenenabstand des Kegelstumpfs ab oder legt ihn fest. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Ruft die Höhe ab oder legt sie fest, wenn der Kegelstumpf in der orthografischen Projektion steht. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ruft den ersten übergeordneten Knoten ab oder legt ihn fest. Wenn der erste übergeordnete Knoten festgelegt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ruft alle übergeordneten Knoten ab, eine Entität kann an mehrere übergeordnete Knoten angehängt werden, um Geometrie zu instanziieren |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ruft die Sammlung aller Eigenschaften ab. |
| [QuadraticAttenuation](../../aspose.threed.entities/light/quadraticattenuation) { get; set; } | Ruft die quadratische Dämpfung ab oder legt sie fest, um die Gesamtdämpfung des Lichts zu berechnen |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Ruft die Ausrichtung des Kegelstumpfs ab oder legt sie fest. mode Diese Eigenschaft funktioniert nur, wenn die[`Target`](../frustum/target) ist null. Wenn der Wert istFixedTarget , wird die Richtung immer von der Eigenschaft berechnet[`LookAt`](../frustum/lookat) Ansonsten die[`LookAt`](../frustum/lookat)wird immer von der berechnet[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ruft die Szene ab, zu der dieses Objekt gehört |
| [ShadowColor](../../aspose.threed.entities/light/shadowcolor) { get; set; } | Ruft die Farbe des Schattens ab oder legt sie fest. |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Ruft das Ziel ab, auf das die Kamera blickt, oder legt es fest. Wenn der Benutzer diese Eigenschaft unterstützt, sollte sie vor ihr liegen[`LookAt`](../frustum/lookat) Eigentum. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | Ruft die Aufwärtsrichtung der Kamera ab oder legt sie fest |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Findet die Eigenschaft. Es kann eine dynamische Eigenschaft sein (erstellt von CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Ruft den Begrenzungsrahmen des aktuellen Objekts in seinem Objektraum-Koordinatensystem ab. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Ruft den Schlüssel des Entity-Renderers ab, der im Renderer registriert ist |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Holen Sie sich den Wert der angegebenen Eigenschaft |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Entfernt eine dynamische Eigenschaft. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Entfernt die angegebene Eigenschaft identifiziert durch name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Legt den Wert der angegebenen Eigenschaft fest |

### Siehe auch

* class [Frustum](../frustum)
* namensraum [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
