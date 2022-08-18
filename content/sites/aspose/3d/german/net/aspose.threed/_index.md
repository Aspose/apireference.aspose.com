---
title: Aspose.ThreeD
second_title: Aspose.3D für .NET-API-Referenz
description: Der Basis-Namespace von Aspose.3D
type: docs
weight: 10
url: /de/net/aspose.threed/
---
Der Basis-Namespace von Aspose.3D

## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [A3DObject](./a3dobject) | Die Basisklasse aller Aspose.ThreeD-Objekte, alle Unterklassen unterstützen dynamische Eigenschaften. |
| [AssetInfo](./assetinfo) | Informationen zum Asset. Asset-Informationen können angehängt werden a[`Scene`](../aspose.threed/scene) . Kind[`Scene`](../aspose.threed/scene) kann sein eigenes haben[`AssetInfo`](../aspose.threed/assetinfo) um die Definition des übergeordneten Elements zu überschreiben. |
| [BonePose](./bonepose) | Die[`BonePose`](../aspose.threed/bonepose) enthält die Transformationsmatrix für einen Knochen node |
| [CustomObject](./customobject) | Metadaten oder benutzerdefinierte Objekte, die in 3D-Dateien verwendet werden, werden von dieser Klasse verwaltet. Alle benutzerdefinierten Eigenschaften werden als dynamische Eigenschaften gespeichert. |
| [Entity](./entity) | Die Basisklasse aller Entitäten. Entität stellt ein konkretes Objekt dar, das unter einem Knoten wie angehängt wird[`Light`](../aspose.threed.entities/light)/[`Geometry`](../aspose.threed.entities/geometry) . |
| [ExportException](./exportexception) | Ausnahmen, wenn Aspose.3D die Szene nicht in file exportieren konnte |
| [FileFormat](./fileformat) | Definition des Dateiformats |
| [FileFormatType](./fileformattype) | Dateiformattyp |
| [GlobalTransform](./globaltransform) | Globale Transformation ist ähnlich wie[`Transform`](../aspose.threed/transform) aber es ist unveränderlich, während es die endgültig ausgewertete Transformation darstellt. Das rechte Koordinatensystem wird verwendet, während die globale Transformation ausgewertet wird |
| [ImageRenderOptions](./imagerenderoptions) | Optionen für[`Render`](../aspose.threed/scene/render) und[`Render`](../aspose.threed/scene/render) |
| [ImportException](./importexception) | Ausnahme, wenn Aspose.3D die angegebene Quelle nicht öffnen konnte |
| [License](./license) | Stellt Methoden zur Lizenzierung der Komponente bereit. |
| [Metered](./metered) | Bietet Methoden zum Festlegen von gemessenen Schlüsseln. |
| [Node](./node) | Repräsentiert ein Element im Szenendiagramm. Ein Szenendiagramm ist ein Baum von Knotenobjekten. Die Baumverwaltungsdienste sind in dieser Klasse eigenständig. Beachten Sie, dass das Aspose.3D SDK die Gültigkeit des konstruierten Szenendiagramms nicht testet. Es liegt in der Verantwortung des Aufrufers sicherzustellen, dass er keine zyklischen Graphen in einer Knotenhierarchie erzeugt. Neben der Baumverwaltung definiert diese Klasse alle Eigenschaften, die erforderlich sind, um die Position des Objekts in der Szene zu beschreiben. Zu diesen Informationen gehören die grundlegenden Translations-, Rotations- und Skalierungseigenschaften sowie die erweiterten Optionen für Drehpunkte, Begrenzungen und IK-Verbindungsattribute wie Steifigkeit und Dämpfung. Wenn es zum ersten Mal erstellt wird, ist das Node-Objekt „leer“ (d ein Objekt ohne grafische Darstellung, das nur die Positionsinformationen enthält). In diesem Zustand kann es verwendet werden, um Eltern in der Knotenbaumstruktur darzustellen, aber nicht viel mehr. Die normale Verwendung dieser Art von Objekten besteht darin, ihnen eine Entität hinzuzufügen, die den Knoten spezialisiert (siehe "Entität"). Die Entität ist ein Objekt an sich und mit dem Knoten verbunden. Dies bedeutet auch, dass dieselbe Entität von mehreren Knoten gemeinsam genutzt werden kann. Kamera, Licht, Mesh usw. sind alles Entitäten und alle von der Basisklasse Entity abgeleitet. |
| [NodeVisitor](./nodevisitor) | Ein Rückruf zum Durchlaufen der gesamten Knotenhierarchie. |
| [Pose](./pose) | Die Pose wird verwendet, um die Transformationsmatrix zu speichern, wenn die Geometrie geskinnt wird. Die Pose ist ein Satz von[`BonePose`](../aspose.threed/bonepose) , jeder[`BonePose`](../aspose.threed/bonepose) speichert die konkreten Transformationsinformationen des Knochenknotens. |
| [Property](./property) | Klasse zum Speichern benutzerdefinierter Eigenschaften. |
| [PropertyCollection](./propertycollection) | Die Sammlung von Eigenschaften |
| [Scene](./scene) | Eine Szene ist ein Objekt der obersten Ebene, das die Knoten, Geometrien, Materialien, Texturen, Animationen, Posen, Unterszenen usw. enthält. Eine Szene kann Unterszenen haben und dient als Unterstützung für mehrere Dokumente in Dateien wie Collada/Blender /fbx Auf die Knotenhierarchie kann zugegriffen werden[`RootNode`](../aspose.threed/scene/rootnode)[`Library`](../aspose.threed/scene/library) wird verwendet, um während der Serialisierung einen Verweis auf nicht angehängte Objekte (wie Metadaten oder benutzerdefinierte Objekte) zu behalten, damit es als Bibliothek verwendet werden kann. |
| [SceneObject](./sceneobject) | Die Stammklasse von Objekten, die in einer Szene gespeichert werden. |
| [Transform](./transform) | Eine Transformation enthält Informationen, die den Zugriff auf die Verschiebungs-/Skalierungs-/Rotations- oder Transformationsmatrix des Objekts zu minimalen Kosten ermöglichen Dies wird von der lokalen Transformation verwendet. |
| [TrialException](./trialexception) | Dies wird in Scene.Open/Scene.Save ausgelöst, wenn keine Lizenzen angewendet werden. Sie können diese Ausnahme deaktivieren, indem Sie SuppressTrialException auf true setzen. |
## Schnittstellen

| Schnittstelle | Beschreibung |
| --- | --- |
| [INamedObject](./inamedobject) | Objekt mit einem Namen |
## Aufzählung

| Aufzählung | Beschreibung |
| --- | --- |
| [Axis](./axis) | Die Koordinatenachse. |
| [CoordinatedSystem](./coordinatedsystem) | Das linkshändige oder rechtshändige Koordinatensystem. |
| [FileContentType](./filecontenttype) | Dateiinhaltstyp |
| [PoseType](./posetype) | Haltungstyp. |
| [PropertyFlags](./propertyflags) | Flaggen der Eigenschaft |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
