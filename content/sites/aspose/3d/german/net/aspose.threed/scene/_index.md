---
title: Scene
second_title: Aspose.3D für .NET-API-Referenz
description: Eine Szene ist ein Objekt der obersten Ebene das die Knoten Geometrien Materialien Texturen Animationen Posen Unterszenen usw. enthält. Eine Szene kann Unterszenen haben und dient als Unterstützung für mehrere Dokumente in Dateien wie Collada/Blender /fbx Auf die Knotenhierarchie kann zugegriffen werdenRootNode./scene/rootnodeLibrary./scene/library wird verwendet um während der Serialisierung einen Verweis auf nicht angehängte Objekte wie Metadaten oder benutzerdefinierte Objekte zu behalten damit es als Bibliothek verwendet werden kann.
type: docs
weight: 2250
url: /de/net/aspose.threed/scene/
---
## Scene class

Eine Szene ist ein Objekt der obersten Ebene, das die Knoten, Geometrien, Materialien, Texturen, Animationen, Posen, Unterszenen usw. enthält. Eine Szene kann Unterszenen haben und dient als Unterstützung für mehrere Dokumente in Dateien wie Collada/Blender /fbx Auf die Knotenhierarchie kann zugegriffen werden[`RootNode`](./rootnode)[`Library`](./library) wird verwendet, um während der Serialisierung einen Verweis auf nicht angehängte Objekte (wie Metadaten oder benutzerdefinierte Objekte) zu behalten, damit es als Bibliothek verwendet werden kann.

```csharp
public class Scene : SceneObject
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Scene](scene#constructor)() | Initialisiert eine neue Instanz von[`Scene`](../scene) Klasse. |
| [Scene](scene#constructor_1)(Entity) | Initialisiert eine neue Instanz von[`Scene`](../scene) Klasse mit einer Entität, die an einen neuen Knoten angehängt ist. |
| [Scene](scene#constructor_2)(Scene, string) | Initialisiert eine neue Instanz von[`Scene`](../scene)Klasse als Unterszene. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips) { get; } | bekommt alles[`AnimationClip`](../../aspose.threed.animation/animationclip) in der Szene definiert. |
| [AssetInfo](../../aspose.threed/scene/assetinfo) { get; set; } | Ruft die Asset-Informationen der obersten Ebene ab oder legt sie fest |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip) { get; set; } | Ruft das Aktiv ab oder setzt es[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [Library](../../aspose.threed/scene/library) { get; } | Objekte, die nicht direkt in der Szenenhierarchie verwendet werden, können in der Bibliothek definiert werden. Dies ist nützlich, wenn Sie Unterszenen verwenden und wiederverwendbare Komponenten unter Unterszenen platzieren. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ruft den Namen ab oder legt ihn fest. |
| [Poses](../../aspose.threed/scene/poses) { get; } | bekommt alles[`Pose`](../pose) in dieser Szene verwendet. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ruft die Sammlung aller Eigenschaften ab. |
| [RootNode](../../aspose.threed/scene/rootnode) { get; } | Ruft den Wurzelknoten der Szene ab. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ruft die Szene ab, zu der dieses Objekt gehört |
| [SubScenes](../../aspose.threed/scene/subscenes) { get; } | Ruft alle Unterszenen ab |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile)(string) | Öffnet die Szene vom angegebenen Pfad |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_3)(string, CancellationToken) | Öffnet die Szene vom angegebenen Pfad |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_1)(string, FileFormat, CancellationToken) | Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_2)(string, LoadOptions, CancellationToken) | Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_2)(Stream, CancellationToken) | Öffnet die Szene aus dem angegebenen Stream |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream)(Stream, FileFormat, CancellationToken) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_1)(Stream, LoadOptions, CancellationToken) | Öffnet die Szene aus dem angegebenen Stream mit der angegebenen IO-Konfiguration. |
| [Clear](../../aspose.threed/scene/clear)() | Löscht den Szeneninhalt und stellt die Standardeinstellungen wieder her. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip)(string) | Eine Kurzfunktion zum Erstellen und Registrieren der[`AnimationClip`](../../aspose.threed.animation/animationclip) Das erste[`AnimationClip`](../../aspose.threed.animation/animationclip) wird dem zugeordnet[`CurrentAnimationClip`](./currentanimationclip) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Findet die Eigenschaft. Es kann eine dynamische Eigenschaft sein (erstellt von CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip)(string) | Ruft einen benannten ab[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Holen Sie sich den Wert der angegebenen Eigenschaft |
| [Open](../../aspose.threed/scene/open#open)(Stream) | Öffnet die Szene aus dem angegebenen Stream |
| [Open](../../aspose.threed/scene/open#open_4)(string) | Öffnet die Szene vom angegebenen Pfad |
| [Open](../../aspose.threed/scene/open#open_3)(Stream, CancellationToken) | Öffnet die Szene aus dem angegebenen Stream |
| [Open](../../aspose.threed/scene/open#open_8)(string, CancellationToken) | Öffnet die Szene vom angegebenen Pfad |
| [Open](../../aspose.threed/scene/open#open_6)(string, LoadOptions) | Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [Open](../../aspose.threed/scene/open#open_1)(Stream, FileFormat, CancellationToken) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats. |
| [Open](../../aspose.threed/scene/open#open_2)(Stream, LoadOptions, CancellationToken) | Öffnet die Szene aus dem angegebenen Stream mit der angegebenen IO-Konfiguration. |
| [Open](../../aspose.threed/scene/open#open_5)(string, FileFormat, CancellationToken) | Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [Open](../../aspose.threed/scene/open#open_7)(string, LoadOptions, CancellationToken) | Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Entfernt eine dynamische Eigenschaft. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Entfernt die angegebene Eigenschaft identifiziert durch name |
| [Render](../../aspose.threed/scene/render#render)(Camera, Bitmap) | Rendert die Szene aus der gegebenen Kameraperspektive als Bitmap. |
| [Render](../../aspose.threed/scene/render#render_2)(Camera, string) | Rendert die Szene aus der gegebenen Kameraperspektive in eine externe Datei. Die Standardausgabegröße ist 1024x768 und das Ausgabeformat ist png |
| [Render](../../aspose.threed/scene/render#render_1)(Camera, Bitmap, ImageRenderOptions) | Rendert die Szene aus der gegebenen Kameraperspektive als Bitmap. |
| [Render](../../aspose.threed/scene/render#render_3)(Camera, string, Size, ImageFormat) | Rendert die Szene aus der gegebenen Kameraperspektive in eine externe Datei. |
| [Render](../../aspose.threed/scene/render#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | Rendert die Szene aus der gegebenen Kameraperspektive in eine externe Datei. |
| [Save](../../aspose.threed/scene/save#save_4)(string) | Speichert die Szene unter Verwendung des angegebenen Dateiformats im angegebenen Pfad. |
| [Save](../../aspose.threed/scene/save#save)(Stream, FileFormat) | Speichert die Szene zum Streamen im angegebenen Dateiformat. |
| [Save](../../aspose.threed/scene/save#save_2)(Stream, SaveOptions) | Speichert die Szene zum Streamen im angegebenen Dateiformat. |
| [Save](../../aspose.threed/scene/save#save_5)(string, FileFormat) | Speichert die Szene unter Verwendung des angegebenen Dateiformats im angegebenen Pfad. |
| [Save](../../aspose.threed/scene/save#save_7)(string, SaveOptions) | Speichert die Szene unter Verwendung des angegebenen Dateiformats im angegebenen Pfad. |
| [Save](../../aspose.threed/scene/save#save_1)(Stream, FileFormat, CancellationToken) | Speichert die Szene zum Streamen im angegebenen Dateiformat. |
| [Save](../../aspose.threed/scene/save#save_3)(Stream, SaveOptions, CancellationToken) | Speichert die Szene zum Streamen im angegebenen Dateiformat. |
| [Save](../../aspose.threed/scene/save#save_6)(string, FileFormat, CancellationToken) | Speichert die Szene unter Verwendung des angegebenen Dateiformats im angegebenen Pfad. |
| [Save](../../aspose.threed/scene/save#save_8)(string, SaveOptions, CancellationToken) | Speichert die Szene unter Verwendung des angegebenen Dateiformats im angegebenen Pfad. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Legt den Wert der angegebenen Eigenschaft fest |

### Siehe auch

* class [SceneObject](../sceneobject)
* namensraum [Aspose.ThreeD](../../aspose.threed)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
