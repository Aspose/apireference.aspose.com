---
title: Szene
second_title: Aspose.3D für Java API-Referenz
description: 
type: docs
weight: 161
url: /de/java/com.aspose.threed/scene/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject)
```
public class Scene extends SceneObject
```
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Scene(Entity entity)](#Scene-com.aspose.threed.Entity-) | Initialisiert eine neue Instanz der Klasse [Scene](../../com.aspose.threed/scene) mit einer Entität, die an einem neuen Knoten angehängt ist. |
| [Scene(Scene parentScene, String name)](#Scene-com.aspose.threed.Scene-java.lang.String-) | Initialisiert eine neue Instanz der Klasse [Scene](../../com.aspose.threed/scene) als Unterszene. |
| [Scene()](#Scene--) | Initialisiert eine neue Instanz der Klasse [Scene](../../com.aspose.threed/scene). |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [VERSION](#VERSION) | Gibt die aktuelle Release-Version zurück |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clear()](#clear--) | Löscht den Inhalt der Szene und stellt die Standardeinstellungen wieder her. |
| [createAnimationClip(String name)](#createAnimationClip-java.lang.String-) | Eine Kurzschreibweise, um das [AnimationClip](../../com.aspose.threed/animationclip) zu erstellen und zu registrieren. Der erste [AnimationClip](../../com.aspose.threed/animationclip) wird dem [getCurrentAnimationClip](../../com.aspose.threed/scene\#getCurrentAnimationClip) zugewiesen. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [fromFile(String fileName)](#fromFile-java.lang.String-) | Öffnet die Szene aus dem angegebenen Pfad. |
| [fromFile(String fileName, Cancellation cancellationToken)](#fromFile-java.lang.String-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Pfad. |
| [fromFile(String fileName, FileFormat format)](#fromFile-java.lang.String-com.aspose.threed.FileFormat-) | Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [fromFile(String fileName, FileFormat format, Cancellation cancellationToken)](#fromFile-java.lang.String-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [fromFile(String fileName, LoadOptions options)](#fromFile-java.lang.String-com.aspose.threed.LoadOptions-) | Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [fromFile(String fileName, LoadOptions options, Cancellation cancellationToken)](#fromFile-java.lang.String-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [fromStream(Stream stream)](#fromStream-com.aspose.threed.Stream-) | Öffnet die Szene aus dem angegebenen Stream. |
| [fromStream(Stream stream, Cancellation cancellationToken)](#fromStream-com.aspose.threed.Stream-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Stream. |
| [fromStream(Stream stream, FileFormat format)](#fromStream-com.aspose.threed.Stream-com.aspose.threed.FileFormat-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats. |
| [fromStream(Stream stream, FileFormat format, Cancellation cancellationToken)](#fromStream-com.aspose.threed.Stream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats. |
| [fromStream(Stream stream, LoadOptions options)](#fromStream-com.aspose.threed.Stream-com.aspose.threed.LoadOptions-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration. |
| [fromStream(Stream stream, LoadOptions options, Cancellation cancellationToken)](#fromStream-com.aspose.threed.Stream-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration. |
| [fromStream(InputStream stream)](#fromStream-java.io.InputStream-) | Öffnet die Szene aus dem angegebenen Stream. |
| [fromStream(InputStream stream, Cancellation cancellationToken)](#fromStream-java.io.InputStream-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Stream. |
| [fromStream(InputStream stream, FileFormat format)](#fromStream-java.io.InputStream-com.aspose.threed.FileFormat-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats. |
| [fromStream(InputStream stream, FileFormat format, Cancellation cancellationToken)](#fromStream-java.io.InputStream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats. |
| [fromStream(InputStream stream, LoadOptions options)](#fromStream-java.io.InputStream-com.aspose.threed.LoadOptions-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration. |
| [fromStream(InputStream stream, LoadOptions options, Cancellation cancellationToken)](#fromStream-java.io.InputStream-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration. |
| [getAnimationClip(String name)](#getAnimationClip-java.lang.String-) | Gibt ein benanntes [AnimationClip](../../com.aspose.threed/animationclip) zurück. |
| [getAnimationClips()](#getAnimationClips--) | Gibt alle im Szene definierten [AnimationClip](../../com.aspose.threed/animationclip) zurück. |
| [getAssetInfo()](#getAssetInfo--) | Gibt die Asset-Informationen der obersten Ebene zurück. |
| [getClass()](#getClass--) |  |
| [getCurrentAnimationClip()](#getCurrentAnimationClip--) | Gibt das aktive [AnimationClip](../../com.aspose.threed/animationclip) zurück. |
| [getLibrary()](#getLibrary--) | Objekte, die nicht direkt in der Szenenhierarchie verwendet werden, können in der Bibliothek definiert werden. |
| [getName()](#getName--) | Liefert den Namen. |
| [getPoses()](#getPoses--) | Gibt alle in dieser Szene verwendeten [Pose](../../com.aspose.threed/pose) zurück. |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getRootNode()](#getRootNode--) | Gibt den Wurzelknoten der Szene zurück. |
| [getScene()](#getScene--) | Liefert die Szene, zu der dieses Objekt gehört |
| [getSubScenes()](#getSubScenes--) | Gibt alle Unterszenen zurück. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(Stream stream)](#open-com.aspose.threed.Stream-) | Öffnet die Szene aus dem angegebenen Stream. |
| [open(Stream stream, Cancellation cancellationToken)](#open-com.aspose.threed.Stream-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Stream. |
| [open(Stream stream, FileFormat format)](#open-com.aspose.threed.Stream-com.aspose.threed.FileFormat-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats. |
| [open(Stream stream, FileFormat format, Cancellation cancellationToken)](#open-com.aspose.threed.Stream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats. |
| [open(Stream stream, LoadOptions options)](#open-com.aspose.threed.Stream-com.aspose.threed.LoadOptions-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration. |
| [open(Stream stream, LoadOptions options, Cancellation cancellationToken)](#open-com.aspose.threed.Stream-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration. |
| [open(InputStream stream)](#open-java.io.InputStream-) | Öffnet die Szene aus dem angegebenen Stream. |
| [open(InputStream stream, Cancellation cancellationToken)](#open-java.io.InputStream-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Stream. |
| [open(InputStream stream, FileFormat format)](#open-java.io.InputStream-com.aspose.threed.FileFormat-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats. |
| [open(InputStream stream, FileFormat format, Cancellation cancellationToken)](#open-java.io.InputStream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats. |
| [open(InputStream stream, LoadOptions options)](#open-java.io.InputStream-com.aspose.threed.LoadOptions-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration. |
| [open(InputStream stream, LoadOptions options, Cancellation cancellationToken)](#open-java.io.InputStream-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration. |
| [open(String fileName)](#open-java.lang.String-) | Öffnet die Szene aus dem angegebenen Pfad. |
| [open(String fileName, Cancellation cancellationToken)](#open-java.lang.String-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Pfad. |
| [open(String fileName, FileFormat format)](#open-java.lang.String-com.aspose.threed.FileFormat-) | Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [open(String fileName, FileFormat format, Cancellation cancellationToken)](#open-java.lang.String-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [open(String fileName, LoadOptions options)](#open-java.lang.String-com.aspose.threed.LoadOptions-) | Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [open(String fileName, LoadOptions options, Cancellation cancellationToken)](#open-java.lang.String-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-) | Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [render(Camera camera, TextureData bitmap)](#render-com.aspose.threed.Camera-com.aspose.threed.TextureData-) | Rendert die Szene aus der Sicht der angegebenen Kamera in ein Bitmap. |
| [render(Camera camera, TextureData bitmap, ImageRenderOptions options)](#render-com.aspose.threed.Camera-com.aspose.threed.TextureData-com.aspose.threed.ImageRenderOptions-) | Rendert die Szene aus der Sicht der angegebenen Kamera in ein Bitmap. |
| [render(Camera camera, String fileName)](#render-com.aspose.threed.Camera-java.lang.String-) | Rendert die Szene aus der Sicht der angegebenen Kamera in eine externe Datei. |
| [render(Camera camera, String fileName, Vector2 size, String format)](#render-com.aspose.threed.Camera-java.lang.String-com.aspose.threed.Vector2-java.lang.String-) | Rendert die Szene aus der Sicht der angegebenen Kamera in eine externe Datei. |
| [render(Camera camera, String fileName, Vector2 size, String format, ImageRenderOptions options)](#render-com.aspose.threed.Camera-java.lang.String-com.aspose.threed.Vector2-java.lang.String-com.aspose.threed.ImageRenderOptions-) | Rendert die Szene aus der Sicht der angegebenen Kamera in eine externe Datei. |
| [save(Stream stream, FileFormat format)](#save-com.aspose.threed.Stream-com.aspose.threed.FileFormat-) | Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats. |
| [save(Stream stream, FileFormat format, Cancellation cancellationToken)](#save-com.aspose.threed.Stream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats. |
| [save(Stream stream, SaveOptions options)](#save-com.aspose.threed.Stream-com.aspose.threed.SaveOptions-) | Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats. |
| [save(Stream stream, SaveOptions options, Cancellation cancellationToken)](#save-com.aspose.threed.Stream-com.aspose.threed.SaveOptions-com.aspose.threed.Cancellation-) | Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats. |
| [save(OutputStream stream, FileFormat format)](#save-java.io.OutputStream-com.aspose.threed.FileFormat-) | Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats. |
| [save(OutputStream stream, FileFormat format, Cancellation cancellationToken)](#save-java.io.OutputStream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats. |
| [save(OutputStream stream, SaveOptions options)](#save-java.io.OutputStream-com.aspose.threed.SaveOptions-) | Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats. |
| [save(OutputStream stream, SaveOptions options, Cancellation cancellationToken)](#save-java.io.OutputStream-com.aspose.threed.SaveOptions-com.aspose.threed.Cancellation-) | Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats. |
| [save(String fileName)](#save-java.lang.String-) | Speichert die Szene im angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [save(String fileName, FileFormat format)](#save-java.lang.String-com.aspose.threed.FileFormat-) | Speichert die Szene im angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [save(String fileName, FileFormat format, Cancellation cancellationToken)](#save-java.lang.String-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Speichert die Szene im angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [save(String fileName, SaveOptions options)](#save-java.lang.String-com.aspose.threed.SaveOptions-) | Speichert die Szene im angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [save(String fileName, SaveOptions options, Cancellation cancellationToken)](#save-java.lang.String-com.aspose.threed.SaveOptions-com.aspose.threed.Cancellation-) | Speichert die Szene im angegebenen Pfad unter Verwendung des angegebenen Dateiformats. |
| [setAssetInfo(AssetInfo value)](#setAssetInfo-com.aspose.threed.AssetInfo-) | Legt die Informationen des obersten Assets fest |
| [setCurrentAnimationClip(AnimationClip value)](#setCurrentAnimationClip-com.aspose.threed.AnimationClip-) | Setzt den aktiven [AnimationClip](../../com.aspose.threed/animationclip) |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Scene(Entity entity) {#Scene-com.aspose.threed.Entity-}
```
public Scene(Entity entity)
```


Initialisiert eine neue Instanz der Klasse [Scene](../../com.aspose.threed/scene) mit einer Entität, die an einem neuen Knoten angehängt ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | entity | [Entity](../../com.aspose.threed/entity) | Die anfängliche Entität, die an die Szene angehängt wird **Beispiel:** Der folgende Code zeigt, wie man ein [getScene](../../com.aspose.threed/scene\#getScene) direkt aus einer [Entity](../../com.aspose.threed/entity) erstellt: |

```
var scene = new Scene(new Box());
``` |

### Scene(Scene parentScene, String name) {#Scene-com.aspose.threed.Scene-java.lang.String-}
```
public Scene(Scene parentScene, String name)
```


Initialisiert eine neue Instanz der Klasse [Scene](../../com.aspose.threed/scene) als Unterszene.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| parentScene | [Scene](../../com.aspose.threed/scene) | Die übergeordnete Szene. |
| Name | java.lang.String | Name der Szene. |

### Scene() {#Scene--}
```
public Scene()
```


Initialisiert eine neue Instanz der Klasse [Scene](../../com.aspose.threed/scene).

### VERSION {#VERSION}
```
public static final String VERSION
```


Gibt die aktuelle Release-Version zurück

### clear() {#clear--}
```
public void clear()
```


Löscht den Inhalt der Szene und stellt die Standardeinstellungen wieder her.

### createAnimationClip(String name) {#createAnimationClip-java.lang.String-}
```
public AnimationClip createAnimationClip(String name)
```


Eine Kurzschreibweise, um das [AnimationClip](../../com.aspose.threed/animationclip) zu erstellen und zu registrieren. Der erste [AnimationClip](../../com.aspose.threed/animationclip) wird dem [getCurrentAnimationClip](../../com.aspose.threed/scene\#getCurrentAnimationClip) zugewiesen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name des Animationsclips |

**Returns:**
[AnimationClip](../../com.aspose.threed/animationclip) - A new animation clip instance with given name
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### findProperty(String propertyName) {#findProperty-java.lang.String-}
```
public Property findProperty(String propertyName)
```


Findet die Eigenschaft. Sie kann eine dynamische Eigenschaft sein (erstellt durch CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| propertyName | java.lang.String | Eigenschaftsname. |

**Returns:**
[Property](../../com.aspose.threed/property) - The property.
### fromFile(String fileName) {#fromFile-java.lang.String-}
```
public static Scene fromFile(String fileName)
```


Öffnet die Szene aus dem angegebenen Pfad.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromFile(String fileName, Cancellation cancellationToken) {#fromFile-java.lang.String-com.aspose.threed.Cancellation-}
```
public static Scene fromFile(String fileName, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Pfad.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromFile(String fileName, FileFormat format) {#fromFile-java.lang.String-com.aspose.threed.FileFormat-}
```
public static Scene fromFile(String fileName, FileFormat format)
```


Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Dateiformat. |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromFile(String fileName, FileFormat format, Cancellation cancellationToken) {#fromFile-java.lang.String-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public static Scene fromFile(String fileName, FileFormat format, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Dateiformat. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromFile(String fileName, LoadOptions options) {#fromFile-java.lang.String-com.aspose.threed.LoadOptions-}
```
public static Scene fromFile(String fileName, LoadOptions options)
```


Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | Detailliertere Konfiguration zum Öffnen des Streams. |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromFile(String fileName, LoadOptions options, Cancellation cancellationToken) {#fromFile-java.lang.String-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-}
```
public static Scene fromFile(String fileName, LoadOptions options, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | Detailliertere Konfiguration zum Öffnen des Streams. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(Stream stream) {#fromStream-com.aspose.threed.Stream-}
```
public static Scene fromStream(Stream stream)
```


Öffnet die Szene aus dem angegebenen Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(Stream stream, Cancellation cancellationToken) {#fromStream-com.aspose.threed.Stream-com.aspose.threed.Cancellation-}
```
public static Scene fromStream(Stream stream, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(Stream stream, FileFormat format) {#fromStream-com.aspose.threed.Stream-com.aspose.threed.FileFormat-}
```
public static Scene fromStream(Stream stream, FileFormat format)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Dateiformat. |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(Stream stream, FileFormat format, Cancellation cancellationToken) {#fromStream-com.aspose.threed.Stream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public static Scene fromStream(Stream stream, FileFormat format, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Dateiformat. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(Stream stream, LoadOptions options) {#fromStream-com.aspose.threed.Stream-com.aspose.threed.LoadOptions-}
```
public static Scene fromStream(Stream stream, LoadOptions options)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | Detailliertere Konfiguration zum Öffnen des Streams. |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(Stream stream, LoadOptions options, Cancellation cancellationToken) {#fromStream-com.aspose.threed.Stream-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-}
```
public static Scene fromStream(Stream stream, LoadOptions options, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | Detailliertere Konfiguration zum Öffnen des Streams. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(InputStream stream) {#fromStream-java.io.InputStream-}
```
public static Scene fromStream(InputStream stream)
```


Öffnet die Szene aus dem angegebenen Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | Stream | java.io.InputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. **Beispiel:** Der folgende Code zeigt, wie man eine Szene aus einem Stream mit einer Abbruch-Token-Quelle erstellt |

```
var cts = new Cancellation();    
     try(InputStream input = new FileInputStream("input.fbx")) {    
         Scene scene = Scene.fromStream(input);    
      }
``` |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(InputStream stream, Cancellation cancellationToken) {#fromStream-java.io.InputStream-com.aspose.threed.Cancellation-}
```
public static Scene fromStream(InputStream stream, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
|  | cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe **Beispiel:** Der folgende Code zeigt, wie man eine Szene aus einem Stream mit einer Abbruch-Token-Quelle erstellt |

```
var cts = new Cancellation();    
     try(InputStream input = new FileInputStream("input.fbx")) {    
         Scene scene = Scene.fromStream(input, cts);    
      }
``` |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(InputStream stream, FileFormat format) {#fromStream-java.io.InputStream-com.aspose.threed.FileFormat-}
```
public static Scene fromStream(InputStream stream, FileFormat format)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
|  | format | [FileFormat](../../com.aspose.threed/fileformat) | Dateiformat. **Beispiel:** Der folgende Code zeigt, wie man eine Szene aus einem Stream erstellt |

```
try(InputStream input = new FileInputStream("input.fbx")) {    
          Scene scene = Scene.fromStream(input);    
      }
``` |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(InputStream stream, FileFormat format, Cancellation cancellationToken) {#fromStream-java.io.InputStream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public static Scene fromStream(InputStream stream, FileFormat format, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Dateiformat. |
|  | cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe **Beispiel:** Der folgende Code zeigt, wie man eine Szene aus einem Stream erstellt |

```
try(InputStream input = new FileInputStream("input.fbx")) {    
          Scene scene = Scene.fromStream(input);    
      }
``` |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(InputStream stream, LoadOptions options) {#fromStream-java.io.InputStream-com.aspose.threed.LoadOptions-}
```
public static Scene fromStream(InputStream stream, LoadOptions options)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
|  | options | [LoadOptions](../../com.aspose.threed/loadoptions) | Detailliertere Konfiguration zum Öffnen des Streams. **Beispiel:** Der folgende Code zeigt, wie man eine Szene aus einem Stream mit Ladeoptionen erstellt |

```
var opts = new FbxLoadOptions();    
     opts.getLookupPaths().add("textures");    
     try(InputStream input = new FileInputStream("input.fbx")) {    
         Scene scene = Scene.fromStream(input, opts);    
      }
``` |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(InputStream stream, LoadOptions options, Cancellation cancellationToken) {#fromStream-java.io.InputStream-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-}
```
public static Scene fromStream(InputStream stream, LoadOptions options, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | Detailliertere Konfiguration zum Öffnen des Streams. |
|  | cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe **Beispiel:** Der folgende Code zeigt, wie man eine Szene aus einem Stream mit Ladeoptionen erstellt |

```
var opts = new FbxLoadOptions();    
     opts.getLookupPaths().add("textures");    
     try(InputStream input = new FileInputStream("input.fbx")) {    
         Scene scene = Scene.fromStream(input, opts);    
      }
``` |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### getAnimationClip(String name) {#getAnimationClip-java.lang.String-}
```
public AnimationClip getAnimationClip(String name)
```


Gibt ein benanntes [AnimationClip](../../com.aspose.threed/animationclip) zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | java.lang.String | Der Name des [AnimationClip](../../com.aspose.threed/animationclip) zum Nachschlagen |

**Returns:**
[AnimationClip](../../com.aspose.threed/animationclip) - Returned AnimationClip
### getAnimationClips() {#getAnimationClips--}
```
public List<AnimationClip> getAnimationClips()
```


Gibt alle im Szene definierten [AnimationClip](../../com.aspose.threed/animationclip) zurück.

**Returns:**
java.util.List<com.aspose.threed.AnimationClip> - alle im Szene definierten [AnimationClip](../../com.aspose.threed/animationclip).
### getAssetInfo() {#getAssetInfo--}
```
public AssetInfo getAssetInfo()
```


Gibt die Asset-Informationen der obersten Ebene zurück.

**Returns:**
[AssetInfo](../../com.aspose.threed/assetinfo) - the top-level asset information **Example:** The following code shows how to read the application information from a FBX file:

```
Scene scene = Scene.fromFile("test.fbx");
     System.out.printf("The FBX file is created by %s %s",
         scene.getAssetInfo().getApplicationName(),
         scene.getAssetInfo().getApplicationVersion());
```
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCurrentAnimationClip() {#getCurrentAnimationClip--}
```
public AnimationClip getCurrentAnimationClip()
```


Gibt das aktive [AnimationClip](../../com.aspose.threed/animationclip) zurück.

**Returns:**
[AnimationClip](../../com.aspose.threed/animationclip) - the active [AnimationClip](../../com.aspose.threed/animationclip)
### getLibrary() {#getLibrary--}
```
public List<A3DObject> getLibrary()
```


Objekte, die nicht direkt in der Szenenhierarchie verwendet werden, können in der Bibliothek definiert werden. Dies ist nützlich, wenn Sie Unterszenen verwenden und wiederverwendbare Komponenten unter Unterszenen ablegen.

**Returns:**
java.util.List<com.aspose.threed.A3DObject> - Objekte, die nicht direkt in der Szenenhierarchie verwendet werden, können in der Bibliothek definiert werden. Dies ist nützlich, wenn Sie Unterszenen verwenden und wiederverwendbare Komponenten unter Unterszenen ablegen.
### getName() {#getName--}
```
public String getName()
```


Liefert den Namen.

**Returns:**
java.lang.String - der Name.
### getPoses() {#getPoses--}
```
public Collection<Pose> getPoses()
```


Gibt alle in dieser Szene verwendeten [Pose](../../com.aspose.threed/pose) zurück.

**Returns:**
java.util.Collection<com.aspose.threed.Pose> - alle in dieser Szene verwendeten [Pose](../../com.aspose.threed/pose).
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Liefert die Sammlung aller Eigenschaften.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection) - the collection of all properties.
### getProperty(String property) {#getProperty-java.lang.String-}
```
public Object getProperty(String property)
```


Liefere den Wert der angegebenen Eigenschaft

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Eigenschaftsname |

**Returns:**
java.lang.Object - Der Wert der gefundenen Eigenschaft
### getRootNode() {#getRootNode--}
```
public Node getRootNode()
```


Gibt den Wurzelknoten der Szene zurück.

**Returns:**
[Node](../../com.aspose.threed/node) - the root node of the scene. **Example:** The following code shows how to create a node with Box entity attached to the root node.

```
Scene scene = new Scene();
     scene.getRootNode().createChildNode(new Box());
     scene.save("box.stl");
```
### getScene() {#getScene--}
```
public Scene getScene()
```


Liefert die Szene, zu der dieses Objekt gehört

**Returns:**
[Scene](../../com.aspose.threed/scene) - the scene that this object belongs to
### getSubScenes() {#getSubScenes--}
```
public List<Scene> getSubScenes()
```


Gibt alle Unterszenen zurück.

**Returns:**
java.util.List<com.aspose.threed.Scene> - alle Unterszenen
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### open(Stream stream) {#open-com.aspose.threed.Stream-}
```
public void open(Stream stream)
```


Öffnet die Szene aus dem angegebenen Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |

### open(Stream stream, Cancellation cancellationToken) {#open-com.aspose.threed.Stream-com.aspose.threed.Cancellation-}
```
public void open(Stream stream, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe |

### open(Stream stream, FileFormat format) {#open-com.aspose.threed.Stream-com.aspose.threed.FileFormat-}
```
public void open(Stream stream, FileFormat format)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Dateiformat. |

### open(Stream stream, FileFormat format, Cancellation cancellationToken) {#open-com.aspose.threed.Stream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public void open(Stream stream, FileFormat format, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Dateiformat. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe |

### open(Stream stream, LoadOptions options) {#open-com.aspose.threed.Stream-com.aspose.threed.LoadOptions-}
```
public void open(Stream stream, LoadOptions options)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | Detailliertere Konfiguration zum Öffnen des Streams. |

### open(Stream stream, LoadOptions options, Cancellation cancellationToken) {#open-com.aspose.threed.Stream-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-}
```
public void open(Stream stream, LoadOptions options, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | Detailliertere Konfiguration zum Öffnen des Streams. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe |

### open(InputStream stream) {#open-java.io.InputStream-}
```
public void open(InputStream stream)
```


Öffnet die Szene aus dem angegebenen Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | Stream | java.io.InputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. **Beispiel:** Der folgende Code zeigt, wie man eine Szene aus einem Stream öffnet |

```
var scene = new Scene();    
     try(var fs = new FileInputStream("input.fbx")) {    
         scene.open(fs);    
     }
``` |

### open(InputStream stream, Cancellation cancellationToken) {#open-java.io.InputStream-com.aspose.threed.Cancellation-}
```
public void open(InputStream stream, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
|  | cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruchtoken für die Ladeaufgabe **Beispiel:** Der folgende Code zeigt, wie man eine Szene aus einem Stream mit einem Abbruchtoken öffnet |

```
var scene = new Scene();    
     Cancellation cts = new Cancellation();    
     try(var fs = new FileInputStream("input.fbx")) {    
         scene.open(fs, cts);    
     }
``` |

### open(InputStream stream, FileFormat format) {#open-java.io.InputStream-com.aspose.threed.FileFormat-}
```
public void open(InputStream stream, FileFormat format)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
|  | format | [FileFormat](../../com.aspose.threed/fileformat) | Dateiformat. **Beispiel:** Der folgende Code zeigt, wie man eine Szene aus einem Stream öffnet |

```
Scene scene = new Scene();    
     try(var fs = new FileInputStream("input.fbx")) {    
         scene.open(fs, FileFormat.GLTF2);    
     }
``` |

### open(InputStream stream, FileFormat format, Cancellation cancellationToken) {#open-java.io.InputStream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public void open(InputStream stream, FileFormat format, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Dateiformat. |
|  | cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruchtoken für die Ladeaufgabe **Beispiel:** Der folgende Code zeigt, wie man eine Szene aus einem Stream öffnet |

```
Scene scene = new Scene();    
     try(var fs = new FileInputStream("input.fbx")) {    
         scene.open(fs, FileFormat.GLTF2);    
     }
``` |

### open(InputStream stream, LoadOptions options) {#open-java.io.InputStream-com.aspose.threed.LoadOptions-}
```
public void open(InputStream stream, LoadOptions options)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
|  | options | [LoadOptions](../../com.aspose.threed/loadoptions) | Detailliertere Konfiguration zum Öffnen des Streams. **Beispiel:** Der folgende Code zeigt, wie man eine Szene aus einem Stream mit zusätzlichen Ladeoptionen öffnet |

```
Scene scene = new Scene();    
     try(var fs = new FileInputStream("input.fbx")) {    
         var opt = new FbxLoadOptions();    
         opt.getLookupPaths().add("textures");    
         scene.open(fs, opt);    
     }
``` |

### open(InputStream stream, LoadOptions options, Cancellation cancellationToken) {#open-java.io.InputStream-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-}
```
public void open(InputStream stream, LoadOptions options, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Stream unter Verwendung der angegebenen IO-Konfiguration.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | Detailliertere Konfiguration zum Öffnen des Streams. |
|  | cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruchtoken für die Ladeaufgabe **Beispiel:** Der folgende Code zeigt, wie man eine Szene aus einem Stream mit zusätzlichen Ladeoptionen öffnet |

```
Scene scene = new Scene();    
     try(var fs = new FileInputStream("input.fbx")) {    
         var opt = new FbxLoadOptions();    
         opt.getLookupPaths().add("textures");    
         scene.open(fs, opt);    
     }
``` |

### open(String fileName) {#open-java.lang.String-}
```
public void open(String fileName)
```


Öffnet die Szene aus dem angegebenen Pfad.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |

### open(String fileName, Cancellation cancellationToken) {#open-java.lang.String-com.aspose.threed.Cancellation-}
```
public void open(String fileName, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Pfad.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe |

### open(String fileName, FileFormat format) {#open-java.lang.String-com.aspose.threed.FileFormat-}
```
public void open(String fileName, FileFormat format)
```


Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Dateiformat. |

### open(String fileName, FileFormat format, Cancellation cancellationToken) {#open-java.lang.String-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public void open(String fileName, FileFormat format, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Dateiformat. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe |

### open(String fileName, LoadOptions options) {#open-java.lang.String-com.aspose.threed.LoadOptions-}
```
public void open(String fileName, LoadOptions options)
```


Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | Detailliertere Konfiguration zum Öffnen des Streams. |

### open(String fileName, LoadOptions options, Cancellation cancellationToken) {#open-java.lang.String-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-}
```
public void open(String fileName, LoadOptions options, Cancellation cancellationToken)
```


Öffnet die Szene aus dem angegebenen Pfad unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | Detailliertere Konfiguration zum Öffnen des Streams. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruch-Token für die Ladeaufgabe |

### removeProperty(Property property) {#removeProperty-com.aspose.threed.Property-}
```
public boolean removeProperty(Property property)
```


Entfernt eine dynamische Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| property | [Property](../../com.aspose.threed/property) | Welche Eigenschaft zu entfernen ist |

**Returns:**
boolean - true, wenn die Eigenschaft erfolgreich entfernt wurde
### removeProperty(String property) {#removeProperty-java.lang.String-}
```
public boolean removeProperty(String property)
```


Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Welche Eigenschaft zu entfernen ist |

**Returns:**
boolean - true, wenn die Eigenschaft erfolgreich entfernt wurde
### render(Camera camera, TextureData bitmap) {#render-com.aspose.threed.Camera-com.aspose.threed.TextureData-}
```
public void render(Camera camera, TextureData bitmap)
```


Rendert die Szene aus der Sicht der angegebenen Kamera in ein Bitmap.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | Aus welcher Kameraperspektive die Szene gerendert werden soll |
| bitmap | [TextureData](../../com.aspose.threed/texturedata) | Ziel des gerenderten Ergebnisses |

### render(Camera camera, TextureData bitmap, ImageRenderOptions options) {#render-com.aspose.threed.Camera-com.aspose.threed.TextureData-com.aspose.threed.ImageRenderOptions-}
```
public void render(Camera camera, TextureData bitmap, ImageRenderOptions options)
```


Rendert die Szene aus der Sicht der angegebenen Kamera in ein Bitmap.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | Aus welcher Kameraperspektive die Szene gerendert werden soll |
| bitmap | [TextureData](../../com.aspose.threed/texturedata) | Ziel des gerenderten Ergebnisses |
| options | [ImageRenderOptions](../../com.aspose.threed/imagerenderoptions) | Die Option, einige interne Einstellungen anzupassen. |

### render(Camera camera, String fileName) {#render-com.aspose.threed.Camera-java.lang.String-}
```
public void render(Camera camera, String fileName)
```


Rendern Sie die Szene aus der angegebenen Kameraperspektive in eine externe Datei. Die Standardausgabegröße beträgt 1024 × 768 und das Ausgabeformat ist PNG

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | Aus welcher Kameraperspektive die Szene gerendert werden soll |
| fileName | java.lang.String | Der Dateiname der Ausgabedatei |

### render(Camera camera, String fileName, Vector2 size, String format) {#render-com.aspose.threed.Camera-java.lang.String-com.aspose.threed.Vector2-java.lang.String-}
```
public void render(Camera camera, String fileName, Vector2 size, String format)
```


Rendert die Szene aus der Sicht der angegebenen Kamera in eine externe Datei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | Aus welcher Kameraperspektive die Szene gerendert werden soll |
| fileName | java.lang.String | Der Dateiname der Ausgabedatei |
| size | [Vector2](../../com.aspose.threed/vector2) | Die Größe des finalen gerenderten Bildes |
| Format | java.lang.String | Das Bildformat der Ausgabedatei |

### render(Camera camera, String fileName, Vector2 size, String format, ImageRenderOptions options) {#render-com.aspose.threed.Camera-java.lang.String-com.aspose.threed.Vector2-java.lang.String-com.aspose.threed.ImageRenderOptions-}
```
public void render(Camera camera, String fileName, Vector2 size, String format, ImageRenderOptions options)
```


Rendert die Szene aus der Sicht der angegebenen Kamera in eine externe Datei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | Aus welcher Kameraperspektive die Szene gerendert werden soll |
| fileName | java.lang.String | Der Dateiname der Ausgabedatei |
| size | [Vector2](../../com.aspose.threed/vector2) | Die Größe des finalen gerenderten Bildes |
| Format | java.lang.String | Das Bildformat der Ausgabedatei |
| options | [ImageRenderOptions](../../com.aspose.threed/imagerenderoptions) | Die Option, einige interne Einstellungen anzupassen. |

### save(Stream stream, FileFormat format) {#save-com.aspose.threed.Stream-com.aspose.threed.FileFormat-}
```
public void save(Stream stream, FileFormat format)
```


Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Format. |

### save(Stream stream, FileFormat format, Cancellation cancellationToken) {#save-com.aspose.threed.Stream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public void save(Stream stream, FileFormat format, Cancellation cancellationToken)
```


Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Format. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruchtoken für die Speicheraufgabe |

### save(Stream stream, SaveOptions options) {#save-com.aspose.threed.Stream-com.aspose.threed.SaveOptions-}
```
public void save(Stream stream, SaveOptions options)
```


Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| options | [SaveOptions](../../com.aspose.threed/saveoptions) | Detailliertere Konfiguration zum Speichern des Streams. |

### save(Stream stream, SaveOptions options, Cancellation cancellationToken) {#save-com.aspose.threed.Stream-com.aspose.threed.SaveOptions-com.aspose.threed.Cancellation-}
```
public void save(Stream stream, SaveOptions options, Cancellation cancellationToken)
```


Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| options | [SaveOptions](../../com.aspose.threed/saveoptions) | Detailliertere Konfiguration zum Speichern des Streams. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruchtoken für die Speicheraufgabe |

### save(OutputStream stream, FileFormat format) {#save-java.io.OutputStream-com.aspose.threed.FileFormat-}
```
public void save(OutputStream stream, FileFormat format)
```


Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.OutputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
|  | format | [FileFormat](../../com.aspose.threed/fileformat) | Format. **Beispiel:** Der folgende Code zeigt, wie man eine Szene speichert |

```
Scene scene = Scene.fromFile("input.fbx");    
     try(var ms = new ByteArrayOutputStream())    
     {    
         scene.save(ms, FileFormat.USDZ);    
     }
``` |

### save(OutputStream stream, FileFormat format, Cancellation cancellationToken) {#save-java.io.OutputStream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public void save(OutputStream stream, FileFormat format, Cancellation cancellationToken)
```


Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.OutputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Format. |
|  | cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruchtoken für die Speicheraufgabe **Beispiel:** Der folgende Code zeigt, wie man eine Szene speichert |

```
Scene scene = Scene.fromFile("input.fbx");    
     var cts = new Cancellation();    
     try(var ms = new ByteArrayOutputStream())    
     {    
         scene.save(ms, FileFormat.USDZ, cts);    
     }
``` |

### save(OutputStream stream, SaveOptions options) {#save-java.io.OutputStream-com.aspose.threed.SaveOptions-}
```
public void save(OutputStream stream, SaveOptions options)
```


Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.OutputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
|  | options | [SaveOptions](../../com.aspose.threed/saveoptions) | Detailliertere Konfiguration zum Speichern des Streams. **Beispiel:** Der folgende Code zeigt, wie man eine Szene speichert |

```
Scene scene = Scene.fromFile("input.fbx");    
     var opt = new UsdSaveOptions();    
     opt.setPrimitiveToMesh(true);    
     try(var ms = new ByteArrayOutputStream())    
     {    
         scene.save(ms, opt);    
     }
``` |

### save(OutputStream stream, SaveOptions options, Cancellation cancellationToken) {#save-java.io.OutputStream-com.aspose.threed.SaveOptions-com.aspose.threed.Cancellation-}
```
public void save(OutputStream stream, SaveOptions options, Cancellation cancellationToken)
```


Speichert die Szene in einen Stream unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.OutputStream | Eingabestream, der Benutzer ist für das Schließen des Streams verantwortlich. |
| options | [SaveOptions](../../com.aspose.threed/saveoptions) | Detailliertere Konfiguration zum Speichern des Streams. |
|  | cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruchtoken für die Speicheraufgabe **Beispiel:** Der folgende Code zeigt, wie man eine Szene speichert |

```
Scene scene = Scene.fromFile("input.fbx");    
     var cts = new Cancellation();    
     var opt = new UsdSaveOptions();    
     opt.setPrimitiveToMesh(true);    
     try(var ms = new ByteArrayOutputStream())    
     {    
         scene.save(ms, opt, cts);    
     }
``` |

### save(String fileName) {#save-java.lang.String-}
```
public void save(String fileName)
```


Speichert die Szene im angegebenen Pfad unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |

### save(String fileName, FileFormat format) {#save-java.lang.String-com.aspose.threed.FileFormat-}
```
public void save(String fileName, FileFormat format)
```


Speichert die Szene im angegebenen Pfad unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Format. |

### save(String fileName, FileFormat format, Cancellation cancellationToken) {#save-java.lang.String-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public void save(String fileName, FileFormat format, Cancellation cancellationToken)
```


Speichert die Szene im angegebenen Pfad unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Format. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruchtoken für die Speicheraufgabe |

### save(String fileName, SaveOptions options) {#save-java.lang.String-com.aspose.threed.SaveOptions-}
```
public void save(String fileName, SaveOptions options)
```


Speichert die Szene im angegebenen Pfad unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| options | [SaveOptions](../../com.aspose.threed/saveoptions) | Detailliertere Konfiguration zum Speichern des Streams. |

### save(String fileName, SaveOptions options, Cancellation cancellationToken) {#save-java.lang.String-com.aspose.threed.SaveOptions-com.aspose.threed.Cancellation-}
```
public void save(String fileName, SaveOptions options, Cancellation cancellationToken)
```


Speichert die Szene im angegebenen Pfad unter Verwendung des angegebenen Dateiformats.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname. |
| options | [SaveOptions](../../com.aspose.threed/saveoptions) | Detailliertere Konfiguration zum Speichern des Streams. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Abbruchtoken für die Speicheraufgabe |

### setAssetInfo(AssetInfo value) {#setAssetInfo-com.aspose.threed.AssetInfo-}
```
public void setAssetInfo(AssetInfo value)
```


Legt die Informationen des obersten Assets fest

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | value | [AssetInfo](../../com.aspose.threed/assetinfo) | Neuer Wert **Beispiel:** Der folgende Code zeigt, wie man Anwendungsinformationen aus einer FBX-Datei liest: |

```
Scene scene = Scene.fromFile("test.fbx");
     System.out.printf("The FBX file is created by %s %s",
         scene.getAssetInfo().getApplicationName(),
         scene.getAssetInfo().getApplicationVersion());
``` |

### setCurrentAnimationClip(AnimationClip value) {#setCurrentAnimationClip-com.aspose.threed.AnimationClip-}
```
public void setCurrentAnimationClip(AnimationClip value)
```


Setzt den aktiven [AnimationClip](../../com.aspose.threed/animationclip)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [AnimationClip](../../com.aspose.threed/animationclip) | Neuer Wert |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Setzt den Namen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setProperty(String property, Object value) {#setProperty-java.lang.String-java.lang.Object-}
```
public void setProperty(String property, Object value)
```


Setzt den Wert der angegebenen Eigenschaft

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Eigenschaftsname |
| Wert | java.lang.Object | Der Wert der Eigenschaft |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

