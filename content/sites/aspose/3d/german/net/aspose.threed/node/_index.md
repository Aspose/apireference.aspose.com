---
title: Node
second_title: Aspose.3D für .NET-API-Referenz
description: Repräsentiert ein Element im Szenendiagramm. Ein Szenendiagramm ist ein Baum von Knotenobjekten. Die Baumverwaltungsdienste sind in dieser Klasse eigenständig. Beachten Sie dass das Aspose.3D SDK die Gültigkeit des konstruierten Szenendiagramms nicht testet. Es liegt in der Verantwortung des Aufrufers sicherzustellen dass er keine zyklischen Graphen in einer Knotenhierarchie erzeugt. Neben der Baumverwaltung definiert diese Klasse alle Eigenschaften die erforderlich sind um die Position des Objekts in der Szene zu beschreiben. Zu diesen Informationen gehören die grundlegenden Translations Rotations und Skalierungseigenschaften sowie die erweiterten Optionen für Drehpunkte Begrenzungen und IKVerbindungsattribute wie Steifigkeit und Dämpfung. Wenn es zum ersten Mal erstellt wird ist das NodeObjekt leer d ein Objekt ohne grafische Darstellung das nur die Positionsinformationen enthält. In diesem Zustand kann es verwendet werden um Eltern in der Knotenbaumstruktur darzustellen aber nicht viel mehr. Die normale Verwendung dieser Art von Objekten besteht darin ihnen eine Entität hinzuzufügen die den Knoten spezialisiert siehe Entität. Die Entität ist ein Objekt an sich und mit dem Knoten verbunden. Dies bedeutet auch dass dieselbe Entität von mehreren Knoten gemeinsam genutzt werden kann. Kamera Licht Mesh usw. sind alles Entitäten und alle von der Basisklasse Entity abgeleitet.
type: docs
weight: 1470
url: /de/net/aspose.threed/node/
---
## Node class

Repräsentiert ein Element im Szenendiagramm. Ein Szenendiagramm ist ein Baum von Knotenobjekten. Die Baumverwaltungsdienste sind in dieser Klasse eigenständig. Beachten Sie, dass das Aspose.3D SDK die Gültigkeit des konstruierten Szenendiagramms nicht testet. Es liegt in der Verantwortung des Aufrufers sicherzustellen, dass er keine zyklischen Graphen in einer Knotenhierarchie erzeugt. Neben der Baumverwaltung definiert diese Klasse alle Eigenschaften, die erforderlich sind, um die Position des Objekts in der Szene zu beschreiben. Zu diesen Informationen gehören die grundlegenden Translations-, Rotations- und Skalierungseigenschaften sowie die erweiterten Optionen für Drehpunkte, Begrenzungen und IK-Verbindungsattribute wie Steifigkeit und Dämpfung. Wenn es zum ersten Mal erstellt wird, ist das Node-Objekt „leer“ (d ein Objekt ohne grafische Darstellung, das nur die Positionsinformationen enthält). In diesem Zustand kann es verwendet werden, um Eltern in der Knotenbaumstruktur darzustellen, aber nicht viel mehr. Die normale Verwendung dieser Art von Objekten besteht darin, ihnen eine Entität hinzuzufügen, die den Knoten spezialisiert (siehe "Entität"). Die Entität ist ein Objekt an sich und mit dem Knoten verbunden. Dies bedeutet auch, dass dieselbe Entität von mehreren Knoten gemeinsam genutzt werden kann. Kamera, Licht, Mesh usw. sind alles Entitäten und alle von der Basisklasse Entity abgeleitet.

```csharp
public class Node : SceneObject
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Node](node#constructor)() | Initialisiert eine neue Instanz von[`Node`](../node) Klasse. |
| [Node](node#constructor_1)(string) | Initialisiert eine neue Instanz von[`Node`](../node) Klasse. |
| [Node](node#constructor_2)(string, Entity) | Initialisiert eine neue Instanz von[`Node`](../node) Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo) { get; set; } | Asset-Info pro Knoten |
| [ChildNodes](../../aspose.threed/node/childnodes) { get; } | Ruft die untergeordneten Knoten ab. |
| [Entities](../../aspose.threed/node/entities) { get; } | Ruft alle Knotenentitäten ab. |
| [Entity](../../aspose.threed/node/entity) { get; set; } | Ruft die erste an diesen Knoten angehängte Entität ab oder legt sie fest. Falls festgelegt, werden andere Entitäten gelöscht. |
| [Excluded](../../aspose.threed/node/excluded) { get; set; } | Ruft ab oder legt fest, ob dieser Knoten und alle untergeordneten Knoten/Entitäten während des Exports ausgeschlossen werden sollen. |
| [GlobalTransform](../../aspose.threed/node/globaltransform) { get; } | Ruft die globale Transformation ab. |
| [Material](../../aspose.threed/node/material) { get; set; } | Ruft das erste diesem Knoten zugeordnete Material ab oder legt es fest, wenn es gesetzt wird, werden andere Materialien gelöscht |
| [Materials](../../aspose.threed/node/materials) { get; } | Ruft die diesem Knoten zugeordneten Materialien ab. |
| [MetaDatas](../../aspose.threed/node/metadatas) { get; } | Ruft die in diesem Knoten definierten Metadaten ab. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ruft den Namen ab oder legt ihn fest. |
| [ParentNode](../../aspose.threed/node/parentnode) { get; set; } | Ruft den übergeordneten Knoten ab oder legt ihn fest. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ruft die Sammlung aller Eigenschaften ab. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ruft die Szene ab, zu der dieses Objekt gehört |
| [Transform](../../aspose.threed/node/transform) { get; } | Ruft die lokale Transformation ab. |
| [Visible](../../aspose.threed/node/visible) { get; set; } | Ruft ab oder legt fest, um den Knoten anzuzeigen |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Accept](../../aspose.threed/node/accept)(NodeVisitor) | Durchläuft alle untergeordneten Knoten (einschließlich des aktuellen Knotens) und ruft den Besucher mit dem Knoten auf. Der Besucher kann den Walk-Through unterbrechen, indem er false zurückgibt |
| [AddChildNode](../../aspose.threed/node/addchildnode)(Node) | Diesem Knoten einen untergeordneten Knoten hinzufügen |
| [AddEntity](../../aspose.threed/node/addentity)(Entity) | Fügen Sie dem Knoten eine Entität hinzu. |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode)() | Erstellt einen untergeordneten Knoten |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_1)(Entity) | Erstellen Sie einen neuen untergeordneten Knoten mit der angegebenen Entität angehängt |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_2)(string) | Erstellen Sie einen neuen untergeordneten Knoten mit dem angegebenen Knotennamen |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_3)(string, Entity) | Erstellen Sie einen neuen untergeordneten Knoten mit dem angegebenen Knotennamen |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_4)(string, Entity, Material) | Erstellen Sie einen neuen untergeordneten Knoten mit dem angegebenen Knotennamen und hängen Sie die angegebene Entität und ein Material an |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform)(bool) | Bewerten Sie die globale Transformation, schließen Sie die geometrische Transformation ein oder nicht. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Findet die Eigenschaft. Es kann eine dynamische Eigenschaft sein (erstellt von CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen) |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox)() | Berechne den Begrenzungsrahmen des Knotens |
| [GetChild](../../aspose.threed/node/getchild#getchild)(int) | Ruft den untergeordneten Knoten am angegebenen Index ab. |
| [GetChild](../../aspose.threed/node/getchild#getchild_1)(string) | Ruft den untergeordneten Knoten mit dem angegebenen Namen ab |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Holen Sie sich den Wert der angegebenen Eigenschaft |
| [Merge](../../aspose.threed/node/merge)(Node) | Trennen Sie alles unter dem Knoten und hängen Sie es an den aktuellen Knoten an. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Entfernt eine dynamische Eigenschaft. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Entfernt die angegebene Eigenschaft identifiziert durch name |
| [SelectObjects](../../aspose.threed/node/selectobjects)(string) | Wählen Sie mehrere Objekte unter dem aktuellen Knoten mit XPath-ähnlicher Abfragesyntax aus. |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject)(string) | Einzelnes Objekt unter aktuellem Knoten mit XPath-ähnlicher Abfragesyntax auswählen. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Legt den Wert der angegebenen Eigenschaft fest |
| override [ToString](../../aspose.threed/node/tostring)() | Ruft die Zeichenfolgendarstellung dieses Knotens ab. |

### Siehe auch

* class [SceneObject](../sceneobject)
* namensraum [Aspose.ThreeD](../../aspose.threed)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
