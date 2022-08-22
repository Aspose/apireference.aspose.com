---
title: TriMeshT
second_title: Aspose.3D für .NET-API-Referenz
description: Generische Version vonTriMesh./trimesh für den statisch definierten Scheitelpunkt des Benutzers type
type: docs
weight: 740
url: /de/net/aspose.threed.entities/trimesh-1/
---
## TriMesh&lt;T&gt; class

Generische Version von[`TriMesh`](../trimesh) für den statisch definierten Scheitelpunkt des Benutzers type

```csharp
public class TriMesh<T> : TriMesh
    where T : struct
```

| Parameter | Beschreibung |
| --- | --- |
| T |  |

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [TriMesh](trimesh)(string) | Initialisiert eine Instanz von[`TriMesh`](../trimesh) |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity) { get; } | Die Kapazität der vorab zugewiesenen Scheitelpunkte. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ruft ab oder legt fest, ob diese Entität während des Exports ausgeschlossen werden soll. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount) { get; } | Die Anzahl der Indizes in diesem[`TriMesh`](../trimesh) |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ruft den Namen ab oder legt ihn fest. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ruft den ersten übergeordneten Knoten ab oder legt ihn fest. Wenn der erste übergeordnete Knoten festgelegt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ruft alle übergeordneten Knoten ab, eine Entität kann an mehrere übergeordnete Knoten angehängt werden, um Geometrie zu instanziieren |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ruft die Sammlung aller Eigenschaften ab. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ruft die Szene ab, zu der dieses Objekt gehört |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount) { get; } | Die Anzahl der nicht zusammengeführten Scheitelpunkte, die vorbeigegangen sind[`BeginVertex`](../trimesh/beginvertex) und[`EndVertex`](../trimesh/endvertex) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration) { get; } | Das Vertex-Layout der[`TriMesh`](../trimesh) . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount) { get; } | Die Anzahl der Scheitelpunkte in diesem[`TriMesh`](../trimesh) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes) { get; } | Die Gesamtgröße aller Scheitelpunkte in Bytes |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [FromMesh](../../aspose.threed.entities/trimesh`1/frommesh)(Mesh) | Erstellen Sie ein TriMesh aus einem gegebenen Netzobjekt mit automatisch generiertem Vertex-Layout. |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex)() | Beginnen Sie mit dem Hinzufügen von Scheitelpunkt |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex)() | Ende des Hinzufügens von Scheitelpunkt |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Findet die Eigenschaft. Es kann eine dynamische Eigenschaft sein (erstellt von CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Ruft den Begrenzungsrahmen des aktuellen Objekts in seinem Objektraum-Koordinatensystem ab. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Ruft den Schlüssel des Entity-Renderers ab, der im Renderer registriert ist |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator)() | Abrufen des Enumerators zum Aufzählen[`Vertex`](../../aspose.threed.utilities/vertex) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Holen Sie sich den Wert der angegebenen Eigenschaft |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes)(byte[]) | Vertices aus Bytes laden, die Länge der Bytes muss ein ganzzahliges Vielfaches der Vertexgröße sein. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble)(int, VertexField) | Lesen Sie das doppelte Feld |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat)(int, VertexField) | Float-Feld lesen |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2)(int, VertexField) | Lesen Sie das Vektor2-Feld |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3)(int, VertexField) | Lesen Sie das Vektor3-Feld |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4)(int, VertexField) | Lesen Sie das Feld vector4 |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2)(int, VertexField) | Lesen Sie das Vektor2-Feld |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3)(int, VertexField) | Lesen Sie das Vektor3-Feld |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4)(int, VertexField) | Lesen Sie das Feld vector4 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Entfernt eine dynamische Eigenschaft. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Entfernt die angegebene Eigenschaft identifiziert durch name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Legt den Wert der angegebenen Eigenschaft fest |
| override [ToString](../../aspose.threed.entities/trimesh/tostring)() | Ruft die Zeichenfolgendarstellung von ab[`TriMesh`](../trimesh) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray)() | Vertices-Daten in Byte-Array konvertieren |
| [VerticesToTypedArray](../../aspose.threed.entities/trimesh`1/verticestotypedarray)() | Konvertiert die Scheitelpunktdaten in typisiertes Array |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto)(Stream) | Schreiben Sie die Indexdaten als 16-Bit-Integer in den Stream |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto)(Stream) | Schreiben Sie die Indexdaten als 32-Bit-Integer in den Stream |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto)(Stream) | Scheitelpunktdaten in den angegebenen Stream schreiben |

### Siehe auch

* class [TriMesh](../trimesh)
* namensraum [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
