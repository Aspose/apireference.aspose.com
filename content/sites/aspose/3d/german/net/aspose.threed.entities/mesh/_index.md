---
title: Mesh
second_title: Aspose.3D für .NET-API-Referenz
description: Ein Netz besteht aus vielen nseitigen Polygonen.
type: docs
weight: 450
url: /de/net/aspose.threed.entities/mesh/
---
## Mesh class

Ein Netz besteht aus vielen n-seitigen Polygonen.

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Mesh](mesh#constructor)() | Initialisiert eine neue Instanz von[`Mesh`](../mesh) Klasse. |
| [Mesh](mesh#constructor_1)(Bitmap) | Konstruieren Sie ein Netz unter Verwendung einer angegebenen Höhenkarte. Wenn das Pixelformat der Höhenkarte mehrere Komponenten enthält, wird die erste (normalerweise die rote) Komponente als Höhenwert (z) verwendet. Die x- und y-Komponenten des Kontrollpunkts sind normalisierte Pixelkoordinaten . |
| [Mesh](mesh#constructor_4)(string) | Initialisiert eine neue Instanz von[`Mesh`](../mesh) Klasse. |
| [Mesh](mesh#constructor_2)(Bitmap, Matrix4) | Konstruieren Sie ein Netz unter Verwendung einer angegebenen Höhenkarte. Wenn das Pixelformat der Höhenkarte mehrere Komponenten enthält, wird die erste (normalerweise die rote) Komponente als Höhenwert (z) verwendet. Die x- und y-Komponenten des Kontrollpunkts sind normalisierte Pixelkoordinaten . |
| [Mesh](mesh#constructor_3)(Bitmap, bool, Matrix4) | Konstruieren Sie ein Netz unter Verwendung einer angegebenen Höhenkarte. Wenn das Pixelformat der Höhenkarte mehrere Komponenten enthält, wird die erste (normalerweise die rote) Komponente als Höhenwert (z) verwendet. Die x- und y-Komponenten des Kontrollpunkts sind normalisierte Pixelkoordinaten . |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Ruft ab oder legt fest, ob diese Geometrie Schatten werfen kann |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Ruft alle Kontrollpunkte ab |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Ruft alle Verformungen ab, die dieser Geometrie zugeordnet sind. |
| [Edges](../../aspose.threed.entities/mesh/edges) { get; } | Ruft Kanten des Netzes ab. Edge ist im Mesh optional, kann also leer sein. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ruft ab oder legt fest, ob diese Entität während des Exports ausgeschlossen werden soll. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ruft den Namen ab oder legt ihn fest. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ruft den ersten übergeordneten Knoten ab oder legt ihn fest. Wenn der erste übergeordnete Knoten festgelegt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ruft alle übergeordneten Knoten ab, eine Entität kann an mehrere übergeordnete Knoten angehängt werden, um Geometrie zu instanziieren |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount) { get; } | Ruft die Anzahl der Polygone ab |
| [Polygons](../../aspose.threed.entities/mesh/polygons) { get; } | Ruft die Polygondefinition des Netzes ab |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ruft die Sammlung aller Eigenschaften ab. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Ruft ab oder legt fest, ob diese Geometrie Schatten empfangen kann. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ruft die Szene ab, zu der dieses Objekt gehört |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Ruft alle Vertex-Elemente ab |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Ruft ab oder legt fest, ob die Geometrie sichtbar ist |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Fügt der aktuellen Geometrie ein vorhandenes Stützpunktelement hinzu |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | Erstellt ein Scheitelpunktelement mit dem angegebenen Typ und fügt es der Geometrie hinzu. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | Erstellt ein Scheitelpunktelement mit dem angegebenen Typ und fügt es der Geometrie hinzu. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | Erstellt ein[`VertexElementUV`](../vertexelementuv) mit gegebenem Textur-Mapping-Typ. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Erstellt ein[`VertexElementUV`](../vertexelementuv) mit gegebenem Textur-Mapping-Typ. |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_2)(int[]) | Erzeugt ein neues Polygon, in dem alle Scheitelpunkte definiert sind*indices* . Um ein Polygon Eckpunkt für Eckpunkt zu erstellen, verwenden Sie bitte[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon)(int, int, int) | Erstellen Sie ein Polygon mit 3 Scheitelpunkten (Dreieck) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_3)(int[], int, int) | Erzeugt ein neues Polygon, in dem alle Scheitelpunkte definiert sind*indices* . Um ein Polygon Eckpunkt für Eckpunkt zu erstellen, verwenden Sie bitte[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_1)(int, int, int, int) | Erstellen Sie ein Polygon mit 4 Scheitelpunkten (Quad) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Findet die Eigenschaft. Es kann eine dynamische Eigenschaft sein (erstellt von CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Ruft den Begrenzungsrahmen des aktuellen Objekts in seinem Objektraum-Koordinatensystem ab. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Ruft ein Scheitelpunktelement mit dem angegebenen Typ ab |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Ruft den Schlüssel des Entity-Renderers ab, der im Renderer registriert ist |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator)() | Ruft den Enumerator für jedes innere Polygon ab. |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize)(int) | Ruft die Scheitelpunktzahl des angegebenen Polygons ab. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Holen Sie sich den Wert der angegebenen Eigenschaft |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | erhält a[`VertexElementUV`](../vertexelementuv) Instanz mit gegebenem Textur-Mapping type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Entfernt eine dynamische Eigenschaft. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Entfernt die angegebene Eigenschaft identifiziert durch name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Legt den Wert der angegebenen Eigenschaft fest |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh)() | Ruft die Mesh-Instanz von der aktuellen Entität ab. |

### Beispiele

So fügen Sie ein Polygon im Netz hinzu: Reise durch alle Polygone im Mesh:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    // Umgang mit Polygon
}
```

### Siehe auch

* class [Geometry](../geometry)
* interface [IMeshConvertible](../imeshconvertible)
* namensraum [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
