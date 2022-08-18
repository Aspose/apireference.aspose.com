---
title: Geometry
second_title: Aspose.3D für .NET-API-Referenz
description: Die Basisklasse aller darstellbaren geometrischen Objekte wieMesh./mesh NurbsSurface./nurbssurface Patch./patch usw..
type: docs
weight: 360
url: /de/net/aspose.threed.entities/geometry/
---
## Geometry class

Die Basisklasse aller darstellbaren geometrischen Objekte (wie[`Mesh`](../mesh) ,[`NurbsSurface`](../nurbssurface) ,[`Patch`](../patch) usw.).

Die[`Geometry`](../geometry) Basisklasse unterstützt:  **Kontrollpunktverwaltung** , Kontrollpunkte definieren die grundlegende räumliche 3D-Struktur der Geometrie, verschiedene geometrische Typen haben unterschiedliche Möglichkeiten, konkrete 3D-Modelle zu definieren. **Vertex-Element-Definition** , vertex elements wendet zusätzliche Informationen wie Normalen/UV-Koordinaten/Vertexfarben auf die Geometrie an, siehe[`VertexElement`](../vertexelement) für mehr Details. **Objekt verformt** ,[`Deformer`](../../aspose.threed.deformers/deformer) kann an die Form der animierten Geometrie gebunden werden.

```csharp
public class Geometry : Entity
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Geometry](geometry)(string) | Initialisiert eine neue Instanz von[`Geometry`](../geometry) Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Ruft ab oder legt fest, ob diese Geometrie Schatten werfen kann |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Ruft alle Kontrollpunkte ab |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Ruft alle Verformungen ab, die dieser Geometrie zugeordnet sind. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ruft ab oder legt fest, ob diese Entität während des Exports ausgeschlossen werden soll. |
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
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Fügt der aktuellen Geometrie ein vorhandenes Stützpunktelement hinzu |
| [CreateElement](../../aspose.threed.entities/geometry/createelement#createelement)(VertexElementType) | Erstellt ein Scheitelpunktelement mit dem angegebenen Typ und fügt es der Geometrie hinzu. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement#createelement_1)(VertexElementType, MappingMode, ReferenceMode) | Erstellt ein Scheitelpunktelement mit dem angegebenen Typ und fügt es der Geometrie hinzu. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv#createelementuv)(TextureMapping) | Erstellt ein[`VertexElementUV`](../vertexelementuv) mit gegebenem Textur-Mapping-Typ. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv#createelementuv_1)(TextureMapping, MappingMode, ReferenceMode) | Erstellt ein[`VertexElementUV`](../vertexelementuv) mit gegebenem Textur-Mapping-Typ. |
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

* class [Entity](../../aspose.threed/entity)
* namensraum [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
