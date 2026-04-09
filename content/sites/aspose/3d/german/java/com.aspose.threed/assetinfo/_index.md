---
title: AssetInfo
second_title: Aspose.3D für Java API-Referenz
description: Informationen zum Asset.
type: docs
weight: 17
url: /de/java/com.aspose.threed/assetinfo/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class AssetInfo extends A3DObject
```

Information zum Asset. Asset-Informationen können an einer [Scene](../../com.aspose.threed/scene) angehängt werden. Ein untergeordnetes [Scene](../../com.aspose.threed/scene) kann sein eigenes [AssetInfo](../../com.aspose.threed/assetinfo) haben, um die Definition des übergeordneten Elements zu überschreiben. **Beispiel:** Der folgende Code zeigt, wie man Asset-Informationen aus einer fbx-Datei liest:

```
Scene scene = Scene.fromFile("test.fbx");
     System.out.printf("The file is created at %s by %s %s",
          scene.getAssetInfo().getCreationTime(),
          scene.getAssetInfo().getApplicationName(),
          scene.getAssetInfo().getApplicationVersion());
```
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [AssetInfo()](#AssetInfo--) | Initialisiert eine neue Instanz der Klasse [AssetInfo](../../com.aspose.threed/assetinfo). |
| [AssetInfo(String name)](#AssetInfo-java.lang.String-) | Initialisiert eine neue Instanz der Klasse [AssetInfo](../../com.aspose.threed/assetinfo). |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getAmbient()](#getAmbient--) | Liest oder setzt die Standard-Ambientfarbe dieses Assets |
| [getApplicationName()](#getApplicationName--) | Liest die Anwendung, die dieses Asset erstellt hat |
| [getApplicationVendor()](#getApplicationVendor--) | Liest den Namen des Anwendungsanbieters |
| [getApplicationVersion()](#getApplicationVersion--) | Liest die Version der Anwendung, die dieses Asset erstellt hat. |
| [getAuthor()](#getAuthor--) | Liest den Autor dieses Assets |
| [getAxisSystem()](#getAxisSystem--) | Liest das Koordinatensystem/Up-Vektor/Front-Vektor der Asset-Informationen. |
| [getClass()](#getClass--) |  |
| [getComment()](#getComment--) | Liest den Kommentar dieses Assets. |
| [getCoordinateSystem()](#getCoordinateSystem--) | Liest das in diesem Asset verwendete Koordinatensystem. |
| [getCopyright()](#getCopyright--) | Liest das Urheberrecht des Dokuments |
| [getCreationTime()](#getCreationTime--) | Liest oder setzt die Erstellungszeit dieses Assets |
| [getFrontVector()](#getFrontVector--) | Liest den Frontvektor, der in diesem Asset verwendet wird. |
| [getKeywords()](#getKeywords--) | Liest die Schlüsselwörter dieses Assets |
| [getModificationTime()](#getModificationTime--) | Liest oder setzt die Änderungszeit dieses Assets |
| [getName()](#getName--) | Liefert den Namen. |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getRevision()](#getRevision--) | Liest die Revisionsnummer dieses Assets, die üblicherweise im Versionskontrollsystem verwendet wird. |
| [getSubject()](#getSubject--) | Liest das Thema dieses Assets |
| [getTitle()](#getTitle--) | Liest den Titel dieses Assets |
| [getUnitName()](#getUnitName--) | Liest die Längeneinheit, die in diesem Asset verwendet wird. |
| [getUnitScaleFactor()](#getUnitScaleFactor--) | Liest den Skalierungsfaktor zu realen Metern. |
| [getUpVector()](#getUpVector--) | Liest den Aufwärtsvektor, der in diesem Asset verwendet wird. |
| [getUrl()](#getUrl--) | Liest oder setzt die URL dieses Assets. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setAmbient(Vector4 value)](#setAmbient-com.aspose.threed.Vector4-) | Liest oder setzt die Standard-Ambientfarbe dieses Assets |
| [setApplicationName(String value)](#setApplicationName-java.lang.String-) | Setzt die Anwendung, die dieses Asset erstellt hat |
| [setApplicationVendor(String value)](#setApplicationVendor-java.lang.String-) | Setzt den Namen des Anwendungsanbieters |
| [setApplicationVersion(String value)](#setApplicationVersion-java.lang.String-) | Setzt die Version der Anwendung, die dieses Asset erstellt hat. |
| [setAuthor(String value)](#setAuthor-java.lang.String-) | Setzt den Autor dieses Assets |
| [setAxisSystem(AxisSystem value)](#setAxisSystem-com.aspose.threed.AxisSystem-) | Setzt das Koordinatensystem/den Aufwärtsvektor/den Frontvektor der Asset-Informationen. |
| [setComment(String value)](#setComment-java.lang.String-) | Setzt den Kommentar dieses Assets. |
| [setCoordinateSystem(CoordinateSystem value)](#setCoordinateSystem-com.aspose.threed.CoordinateSystem-) | Setzt das in diesem Asset verwendete Koordinatensystem. |
| [setCopyright(String value)](#setCopyright-java.lang.String-) | Setzt das Urheberrecht des Dokuments |
| [setCreationTime(Calendar value)](#setCreationTime-java.util.Calendar-) | Liest oder setzt die Erstellungszeit dieses Assets |
| [setFrontVector(Axis value)](#setFrontVector-com.aspose.threed.Axis-) | Setzt den Frontvektor, der in diesem Asset verwendet wird. |
| [setKeywords(String value)](#setKeywords-java.lang.String-) | Setzt die Schlüsselwörter dieses Assets |
| [setModificationTime(Calendar value)](#setModificationTime-java.util.Calendar-) | Liest oder setzt die Änderungszeit dieses Assets |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setRevision(String value)](#setRevision-java.lang.String-) | Setzt die Revisionsnummer dieses Assets, die üblicherweise im Versionskontrollsystem verwendet wird. |
| [setSubject(String value)](#setSubject-java.lang.String-) | Setzt das Thema dieses Assets |
| [setTitle(String value)](#setTitle-java.lang.String-) | Setzt den Titel dieses Assets |
| [setUnitName(String value)](#setUnitName-java.lang.String-) | Setzt die Längeneinheit, die in diesem Asset verwendet wird. |
| [setUnitScaleFactor(double value)](#setUnitScaleFactor-double-) | Setzt den Skalierungsfaktor auf reale Meter. |
| [setUpVector(Axis value)](#setUpVector-com.aspose.threed.Axis-) | Setzt den Aufwärts-Vektor, der in diesem Asset verwendet wird. |
| [setUrl(String value)](#setUrl-java.lang.String-) | Liest oder setzt die URL dieses Assets. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AssetInfo() {#AssetInfo--}
```
public AssetInfo()
```


Initialisiert eine neue Instanz der Klasse [AssetInfo](../../com.aspose.threed/assetinfo).

### AssetInfo(String name) {#AssetInfo-java.lang.String-}
```
public AssetInfo(String name)
```


Initialisiert eine neue Instanz der Klasse [AssetInfo](../../com.aspose.threed/assetinfo).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name |

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
### getAmbient() {#getAmbient--}
```
public Vector4 getAmbient()
```


Liest oder setzt die Standard-Ambientfarbe dieses Assets

**Returns:**
[Vector4](../../com.aspose.threed/vector4) - or Sets the default ambient color of this asset
### getApplicationName() {#getApplicationName--}
```
public String getApplicationName()
```


Liest die Anwendung, die dieses Asset erstellt hat

**Returns:**
java.lang.String - die Anwendung, die dieses Asset erstellt hat
### getApplicationVendor() {#getApplicationVendor--}
```
public String getApplicationVendor()
```


Liest den Namen des Anwendungsanbieters

**Returns:**
java.lang.String - der Name des Anwendungsanbieters
### getApplicationVersion() {#getApplicationVersion--}
```
public String getApplicationVersion()
```


Liest die Version der Anwendung, die dieses Asset erstellt hat.

**Returns:**
java.lang.String - die Version der Anwendung, die dieses Asset erstellt hat.
### getAuthor() {#getAuthor--}
```
public String getAuthor()
```


Liest den Autor dieses Assets

**Returns:**
java.lang.String - der Autor dieses Assets
### getAxisSystem() {#getAxisSystem--}
```
public AxisSystem getAxisSystem()
```


Liest das Koordinatensystem/Up-Vektor/Front-Vektor der Asset-Informationen.

**Returns:**
[AxisSystem](../../com.aspose.threed/axissystem) - the coordinate system/up vector/front vector of the asset info.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getComment() {#getComment--}
```
public String getComment()
```


Liest den Kommentar dieses Assets.

**Returns:**
java.lang.String - der Kommentar zu diesem Asset.
### getCoordinateSystem() {#getCoordinateSystem--}
```
public CoordinateSystem getCoordinateSystem()
```


Liest das in diesem Asset verwendete Koordinatensystem.

**Returns:**
[CoordinateSystem](../../com.aspose.threed/coordinatesystem) - the coordinate system used in this asset.
### getCopyright() {#getCopyright--}
```
public String getCopyright()
```


Liest das Urheberrecht des Dokuments

**Returns:**
java.lang.String - das Urheberrecht des Dokuments
### getCreationTime() {#getCreationTime--}
```
public Calendar getCreationTime()
```


Liest oder setzt die Erstellungszeit dieses Assets

**Returns:**
java.util.Calendar - oder Setzt die Erstellungszeit dieses Assets
### getFrontVector() {#getFrontVector--}
```
public Axis getFrontVector()
```


Liest den Frontvektor, der in diesem Asset verwendet wird.

**Returns:**
[Axis](../../com.aspose.threed/axis) - the front-vector used in this asset.
### getKeywords() {#getKeywords--}
```
public String getKeywords()
```


Liest die Schlüsselwörter dieses Assets

**Returns:**
java.lang.String - die Schlüsselwörter dieses Assets
### getModificationTime() {#getModificationTime--}
```
public Calendar getModificationTime()
```


Liest oder setzt die Änderungszeit dieses Assets

**Returns:**
java.util.Calendar - oder Setzt die Änderungszeit dieses Assets
### getName() {#getName--}
```
public String getName()
```


Liefert den Namen.

**Returns:**
java.lang.String - der Name.
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
### getRevision() {#getRevision--}
```
public String getRevision()
```


Liest die Revisionsnummer dieses Assets, die üblicherweise im Versionskontrollsystem verwendet wird.

**Returns:**
java.lang.String - die Revisionsnummer dieses Assets, üblicherweise in Versionskontrollsystemen verwendet.
### getSubject() {#getSubject--}
```
public String getSubject()
```


Liest das Thema dieses Assets

**Returns:**
java.lang.String - das Thema dieses Assets
### getTitle() {#getTitle--}
```
public String getTitle()
```


Liest den Titel dieses Assets

**Returns:**
java.lang.String - der Titel dieses Assets
### getUnitName() {#getUnitName--}
```
public String getUnitName()
```


Ermittelt die Längeneinheit, die in diesem Asset verwendet wird. z.B. cm/m/km/Zoll/Fuß

**Returns:**
java.lang.String - die Längeneinheit, die in diesem Asset verwendet wird. z.B. cm/m/km/Zoll/Fuß
### getUnitScaleFactor() {#getUnitScaleFactor--}
```
public double getUnitScaleFactor()
```


Liest den Skalierungsfaktor zu realen Metern.

**Returns:**
double - der Skalierungsfaktor auf reale Meter. **Remarks:** Dies wird bei der Serialisierung ignoriert, wenn der Einheitenname null ist.
### getUpVector() {#getUpVector--}
```
public Axis getUpVector()
```


Liest den Aufwärtsvektor, der in diesem Asset verwendet wird.

**Returns:**
[Axis](../../com.aspose.threed/axis) - the up-vector used in this asset.
### getUrl() {#getUrl--}
```
public String getUrl()
```


Liest oder setzt die URL dieses Assets.

**Returns:**
java.lang.String - oder Setzt die URL dieses Assets.
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
### setAmbient(Vector4 value) {#setAmbient-com.aspose.threed.Vector4-}
```
public void setAmbient(Vector4 value)
```


Liest oder setzt die Standard-Ambientfarbe dieses Assets

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector4](../../com.aspose.threed/vector4) | Neuer Wert |

### setApplicationName(String value) {#setApplicationName-java.lang.String-}
```
public void setApplicationName(String value)
```


Setzt die Anwendung, die dieses Asset erstellt hat

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setApplicationVendor(String value) {#setApplicationVendor-java.lang.String-}
```
public void setApplicationVendor(String value)
```


Setzt den Namen des Anwendungsanbieters

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setApplicationVersion(String value) {#setApplicationVersion-java.lang.String-}
```
public void setApplicationVersion(String value)
```


Setzt die Version der Anwendung, die dieses Asset erstellt hat.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setAuthor(String value) {#setAuthor-java.lang.String-}
```
public void setAuthor(String value)
```


Setzt den Autor dieses Assets

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setAxisSystem(AxisSystem value) {#setAxisSystem-com.aspose.threed.AxisSystem-}
```
public void setAxisSystem(AxisSystem value)
```


Setzt das Koordinatensystem/den Aufwärtsvektor/den Frontvektor der Asset-Informationen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [AxisSystem](../../com.aspose.threed/axissystem) | Neuer Wert |

### setComment(String value) {#setComment-java.lang.String-}
```
public void setComment(String value)
```


Setzt den Kommentar dieses Assets.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setCoordinateSystem(CoordinateSystem value) {#setCoordinateSystem-com.aspose.threed.CoordinateSystem-}
```
public void setCoordinateSystem(CoordinateSystem value)
```


Setzt das in diesem Asset verwendete Koordinatensystem.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [CoordinateSystem](../../com.aspose.threed/coordinatesystem) | Neuer Wert |

### setCopyright(String value) {#setCopyright-java.lang.String-}
```
public void setCopyright(String value)
```


Setzt das Urheberrecht des Dokuments

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setCreationTime(Calendar value) {#setCreationTime-java.util.Calendar-}
```
public void setCreationTime(Calendar value)
```


Liest oder setzt die Erstellungszeit dieses Assets

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.util.Calendar | Neuer Wert |

### setFrontVector(Axis value) {#setFrontVector-com.aspose.threed.Axis-}
```
public void setFrontVector(Axis value)
```


Setzt den Frontvektor, der in diesem Asset verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Axis](../../com.aspose.threed/axis) | Neuer Wert |

### setKeywords(String value) {#setKeywords-java.lang.String-}
```
public void setKeywords(String value)
```


Setzt die Schlüsselwörter dieses Assets

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setModificationTime(Calendar value) {#setModificationTime-java.util.Calendar-}
```
public void setModificationTime(Calendar value)
```


Liest oder setzt die Änderungszeit dieses Assets

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.util.Calendar | Neuer Wert |

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

### setRevision(String value) {#setRevision-java.lang.String-}
```
public void setRevision(String value)
```


Setzt die Revisionsnummer dieses Assets, die üblicherweise im Versionskontrollsystem verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setSubject(String value) {#setSubject-java.lang.String-}
```
public void setSubject(String value)
```


Setzt das Thema dieses Assets

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setTitle(String value) {#setTitle-java.lang.String-}
```
public void setTitle(String value)
```


Setzt den Titel dieses Assets

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setUnitName(String value) {#setUnitName-java.lang.String-}
```
public void setUnitName(String value)
```


Setzt die Längeneinheit, die in diesem Asset verwendet wird. z.B. cm/m/km/Zoll/Fuß

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setUnitScaleFactor(double value) {#setUnitScaleFactor-double-}
```
public void setUnitScaleFactor(double value)
```


Setzt den Skalierungsfaktor auf reale Meter.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert **Remarks:** Dies wird bei der Serialisierung ignoriert, wenn der Einheitenname null ist. |

### setUpVector(Axis value) {#setUpVector-com.aspose.threed.Axis-}
```
public void setUpVector(Axis value)
```


Setzt den Aufwärts-Vektor, der in diesem Asset verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Axis](../../com.aspose.threed/axis) | Neuer Wert |

### setUrl(String value) {#setUrl-java.lang.String-}
```
public void setUrl(String value)
```


Liest oder setzt die URL dieses Assets.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

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

