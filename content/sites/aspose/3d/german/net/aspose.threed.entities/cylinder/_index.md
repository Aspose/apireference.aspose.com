---
title: Cylinder
second_title: Aspose.3D für .NET-API-Referenz
description: Parametrisierter Zylinder. Kann auch verwendet werden um den Kegel darzustellen wenn einer von radiusTop/radiusBottom null ist.
type: docs
weight: 310
url: /de/net/aspose.threed.entities/cylinder/
---
## Cylinder class

Parametrisierter Zylinder. Kann auch verwendet werden, um den Kegel darzustellen, wenn einer von radiusTop/radiusBottom null ist.

```csharp
public class Cylinder : Primitive
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Cylinder](cylinder#constructor)() | Initialisiert eine neue Instanz von[`Cylinder`](../cylinder) Klasse. |
| [Cylinder](cylinder#constructor_1)(double, double) | Initialisiert eine neue Instanz von[`Cylinder`](../cylinder) Klasse. |
| [Cylinder](cylinder#constructor_2)(double, double, double) | Initialisiert eine neue Instanz von[`Cylinder`](../cylinder) Klasse. |
| [Cylinder](cylinder#constructor_3)(double, double, double, int, int, bool) | Initialisiert eine neue Instanz von[`Cylinder`](../cylinder) Klasse. |
| [Cylinder](cylinder#constructor_4)(string, double, double, double, int, int, bool, double, double) | Initialisiert eine neue Instanz von[`Cylinder`](../cylinder) Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows) { get; set; } | Ruft ab oder legt fest, ob diese Geometrie Schatten werfen kann |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ruft ab oder legt fest, ob diese Entität während des Exports ausgeschlossen werden soll. |
| [GenerateFanCylinder](../../aspose.threed.entities/cylinder/generatefancylinder) { get; set; } | Ruft ab oder legt fest, ob der Fächerzylinder generiert werden soll, wenn ThetaLength kleiner als 2*PI ist, andernfalls wird das Modell nicht geschnitten. |
| [Height](../../aspose.threed.entities/cylinder/height) { get; set; } | Ruft die Höhe des Zylinders ab oder legt sie fest. |
| [HeightSegments](../../aspose.threed.entities/cylinder/heightsegments) { get; set; } | Ruft die Höhensegmente ab oder legt sie fest. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ruft den Namen ab oder legt ihn fest. |
| [OffsetBottom](../../aspose.threed.entities/cylinder/offsetbottom) { get; set; } | Ruft den Vertices-Transformationsversatz der unteren Seite ab oder legt ihn fest. |
| [OffsetTop](../../aspose.threed.entities/cylinder/offsettop) { get; set; } | Ruft den Vertices-Transformationsversatz der Oberseite ab oder legt ihn fest. |
| [OpenEnded](../../aspose.threed.entities/cylinder/openended) { get; set; } | Ruft einen Wert ab oder legt einen Wert fest, der angibt, ob dies der Fall ist[`Cylinder`](../cylinder) offenes Ende. Der Standardwert ist falsch. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ruft den ersten übergeordneten Knoten ab oder legt ihn fest. Wenn der erste übergeordnete Knoten festgelegt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ruft alle übergeordneten Knoten ab, eine Entität kann an mehrere übergeordnete Knoten angehängt werden, um Geometrie zu instanziieren |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ruft die Sammlung aller Eigenschaften ab. |
| [RadialSegments](../../aspose.threed.entities/cylinder/radialsegments) { get; set; } | Ruft die radialen Segmente ab oder legt sie fest. |
| [RadiusBottom](../../aspose.threed.entities/cylinder/radiusbottom) { get; set; } | Ruft den Radius der unteren Kappe des Zylinders ab oder legt ihn fest. |
| [RadiusTop](../../aspose.threed.entities/cylinder/radiustop) { get; set; } | Ruft den Radius der oberen Kappe des Zylinders ab oder legt ihn fest. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows) { get; set; } | Ruft ab oder legt fest, ob diese Geometrie Schatten empfangen kann. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ruft die Szene ab, zu der dieses Objekt gehört |
| [ShearBottom](../../aspose.threed.entities/cylinder/shearbottom) { get; set; } | Holt oder setzt die Schertransformation der Unterseite, Vektor speichert den (x-Achse, z-Achse) Scherwert, der im Bogenmaß gemessen wird, Standardwert ist (0, 0) |
| [ShearTop](../../aspose.threed.entities/cylinder/sheartop) { get; set; } | Liest oder setzt die Schertransformation der Oberseite, Vektor speichert den (x-Achse, z-Achse) Scherwert, der im Bogenmaß gemessen wird, Standardwert ist (0, 0) |
| [ThetaLength](../../aspose.threed.entities/cylinder/thetalength) { get; set; } | Ruft die Länge des Theta ab oder legt sie fest. Der Standardwert ist 2π. |
| [ThetaStart](../../aspose.threed.entities/cylinder/thetastart) { get; set; } | Ruft den Theta-Start ab oder setzt ihn. Der Standardwert ist 0. |

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
| override [ToMesh](../../aspose.threed.entities/cylinder/tomesh)() | Aktuelles Objekt in mesh umwandeln |

### Siehe auch

* class [Primitive](../primitive)
* namensraum [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
