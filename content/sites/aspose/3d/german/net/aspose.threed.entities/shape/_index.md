---
title: Shape
second_title: Aspose.3D für .NET-API-Referenz
description: Die Form beschreibt die Verformung an einer Reihe von Kontrollpunkten ähnlich dem ClusterVerformer in Maya. Beispielsweise können wir einer erstellten Geometrie eine Form hinzufügen. Und die Form und die Geometrie haben die gleichen topologischen Informationen aber unterschiedliche Positionen der Kontrollpunkte. Bei unterschiedlich starker Beeinflussung führt die Geometrie zu einer Deformationswirkung.
type: docs
weight: 640
url: /de/net/aspose.threed.entities/shape/
---
## Shape class

Die Form beschreibt die Verformung an einer Reihe von Kontrollpunkten, ähnlich dem Cluster-Verformer in Maya. Beispielsweise können wir einer erstellten Geometrie eine Form hinzufügen. Und die Form und die Geometrie haben die gleichen topologischen Informationen, aber unterschiedliche Positionen der Kontrollpunkte. Bei unterschiedlich starker Beeinflussung führt die Geometrie zu einer Deformationswirkung.

```csharp
public class Shape : Geometry
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Shape](shape#constructor)() | Initialisiert eine neue Instanz von[`Shape`](../shape) Klasse. |
| [Shape](shape#constructor_1)(string) | Initialisiert eine neue Instanz von[`Shape`](../shape) Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Ruft ab oder legt fest, ob diese Geometrie Schatten werfen kann |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Ruft alle Kontrollpunkte ab |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Ruft alle Verformungen ab, die dieser Geometrie zugeordnet sind. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ruft ab oder legt fest, ob diese Entität während des Exports ausgeschlossen werden soll. |
| [Indices](../../aspose.threed.entities/shape/indices) { get; } | Ruft die Indizes ab. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ruft den Namen ab oder legt ihn fest. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ruft den ersten übergeordneten Knoten ab oder legt ihn fest. Wenn der erste übergeordnete Knoten festgelegt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ruft alle übergeordneten Knoten ab, eine Entität kann an mehrere übergeordnete Knoten angehängt werden, um Geometrie zu instanziieren |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ruft die Sammlung aller Eigenschaften ab. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Ruft ab oder legt fest, ob diese Geometrie Schatten empfangen kann. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ruft die Szene ab, zu der dieses Objekt gehört |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Ruft alle Vertex-Elemente ab |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Ruft ab oder legt fest, ob die Geometrie sichtbar ist |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [FromControlPoints](../../aspose.threed.entities/shape/fromcontrolpoints)(params Vector3[]) | Erstellen Sie eine Form mit angegebenen Kontrollpunkten mit Standardindizes. |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Fügt der aktuellen Geometrie ein vorhandenes Stützpunktelement hinzu |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | Erstellt ein Scheitelpunktelement mit dem angegebenen Typ und fügt es der Geometrie hinzu. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | Erstellt ein Scheitelpunktelement mit dem angegebenen Typ und fügt es der Geometrie hinzu. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | Erstellt ein[`VertexElementUV`](../vertexelementuv) mit gegebenem Textur-Mapping-Typ. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Erstellt ein[`VertexElementUV`](../vertexelementuv) mit gegebenem Textur-Mapping-Typ. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Findet die Eigenschaft. Es kann eine dynamische Eigenschaft sein (erstellt von CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Ruft den Begrenzungsrahmen des aktuellen Objekts in seinem Objektraum-Koordinatensystem ab. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Ruft ein Scheitelpunktelement mit dem angegebenen Typ ab |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Ruft den Schlüssel des Entity-Renderers ab, der im Renderer registriert ist |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Holen Sie sich den Wert der angegebenen Eigenschaft |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | erhält a[`VertexElementUV`](../vertexelementuv) Instanz mit gegebenem Textur-Mapping type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Entfernt eine dynamische Eigenschaft. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Entfernt die angegebene Eigenschaft identifiziert durch name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Legt den Wert der angegebenen Eigenschaft fest |

### Siehe auch

* class [Geometry](../geometry)
* namensraum [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
