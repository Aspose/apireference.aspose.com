---
title: Discreet3dsSaveOptions
second_title: Aspose.3D für Java API-Referenz
description: Speicheroptionen für 3DS-Datei.
type: docs
weight: 44
url: /de/java/com.aspose.threed/discreet3dssaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class Discreet3dsSaveOptions extends SaveOptions
```

Speicheroptionen für 3DS-Datei.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Discreet3dsSaveOptions()](#Discreet3dsSaveOptions--) | Konstruktor von [Discreet3dsSaveOptions](../../com.aspose.threed/discreet3dssaveoptions) |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDuplicatedNameCounterBase()](#getDuplicatedNameCounterBase--) | Der Zähler, der zum Erzeugen neuer Namen für duplizierte Namen verwendet wird, Standardwert ist 2. |
| [getDuplicatedNameCounterFormat()](#getDuplicatedNameCounterFormat--) | Das Format des duplizierten Zählers, Standardwert ist ein leerer String. |
| [getDuplicatedNameSeparator()](#getDuplicatedNameSeparator--) | Der Trenner zwischen dem Namen des Objekts und dem duplizierten Zähler, Standardwert ist "\_". |
| [getEncoding()](#getEncoding--) | Liefert die Standardkodierung für textbasierte Dateien. |
| [getExportCamera()](#getExportCamera--) | Gibt an, ob alle Kameras in der Szene exportiert werden. |
| [getExportLight()](#getExportLight--) | Gibt an, ob alle Lichter in der Szene exportiert werden. |
| [getExportTextures()](#getExportTextures--) | Versucht, im Szene verwendete Texturen in das Ausgabeverzeichnis zu kopieren. |
| [getFileFormat()](#getFileFormat--) | Liefert das Dateiformat, das in der aktuellen Speicher-/Ladeoption angegeben ist. |
| [getFileName()](#getFileName--) | Der Dateiname der exportierenden/ importierenden Szene. |
| [getFileSystem()](#getFileSystem--) | Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden. |
| [getFileSystemFactory()](#getFileSystemFactory--) | Liefert die Fabrikklasse für das Dateisystem. |
| [getFlipCoordinateSystem()](#getFlipCoordinateSystem--) | Liefert das Umkehren des Koordinatensystems von Kontrollpunkten/Normalen während des Imports/Exports. |
| [getGammaCorrectedColor()](#getGammaCorrectedColor--) | Eine 3ds-Datei kann originale Farbe und gamma‑korrigierte Farbe für dasselbe Attribut enthalten. Wird dies auf true gesetzt, wird nach Möglichkeit die gamma‑korrigierte Farbe verwendet, andernfalls versucht Aspose.3D, die originale Farbe zu nutzen. |
| [getHighPreciseColor()](#getHighPreciseColor--) | Wenn dies true ist, verwendet die erzeugte 3ds-Datei hochpräzise Farben, d.h. jeder Rot‑/Grün‑/Blau‑Kanal ist ein 32‑Bit‑Float. |
| [getLookupPaths()](#getLookupPaths--) | Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen. |
| [getMasterScale()](#getMasterScale--) | Liefert die beim Export verwendete Master‑Skala. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setDuplicatedNameCounterBase(int value)](#setDuplicatedNameCounterBase-int-) | Der Zähler, der zum Erzeugen neuer Namen für duplizierte Namen verwendet wird, Standardwert ist 2. |
| [setDuplicatedNameCounterFormat(String value)](#setDuplicatedNameCounterFormat-java.lang.String-) | Das Format des duplizierten Zählers, Standardwert ist ein leerer String. |
| [setDuplicatedNameSeparator(String value)](#setDuplicatedNameSeparator-java.lang.String-) | Der Trenner zwischen dem Namen des Objekts und dem duplizierten Zähler, Standardwert ist "\_". |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Setzt die Standardkodierung für textbasierte Dateien. |
| [setExportCamera(boolean value)](#setExportCamera-boolean-) | Legt fest, ob alle Kameras in der Szene exportiert werden. |
| [setExportLight(boolean value)](#setExportLight-boolean-) | Legt fest, ob alle Lichter in der Szene exportiert werden. |
| [setExportTextures(boolean value)](#setExportTextures-boolean-) | Versucht, im Szene verwendete Texturen in das Ausgabeverzeichnis zu kopieren. |
| [setFileName(String value)](#setFileName-java.lang.String-) | Der Dateiname der exportierenden/ importierenden Szene. |
| [setFileSystem(FileSystem value)](#setFileSystem-com.aspose.threed.FileSystem-) | Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden. |
| [setFileSystemFactory(FileSystemFactory value)](#setFileSystemFactory-com.aspose.threed.FileSystemFactory-) | Setzt die Fabrikklasse für das Dateisystem. |
| [setFlipCoordinateSystem(boolean value)](#setFlipCoordinateSystem-boolean-) | Setzt das Umkehren des Koordinatensystems von Kontrollpunkten/Normalen beim Import/Export. |
| [setGammaCorrectedColor(boolean value)](#setGammaCorrectedColor-boolean-) | Eine 3ds-Datei kann originale Farbe und gamma‑korrigierte Farbe für dasselbe Attribut enthalten. Wird dies auf true gesetzt, wird nach Möglichkeit die gamma‑korrigierte Farbe verwendet, andernfalls versucht Aspose.3D, die originale Farbe zu nutzen. |
| [setHighPreciseColor(boolean value)](#setHighPreciseColor-boolean-) | Wenn dies true ist, verwendet die erzeugte 3ds-Datei hochpräzise Farben, d.h. jeder Rot‑/Grün‑/Blau‑Kanal ist ein 32‑Bit‑Float. |
| [setLookupPaths(ArrayList<String> value)](#setLookupPaths-java.util.ArrayList-java.lang.String--) | Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen. |
| [setMasterScale(double value)](#setMasterScale-double-) | Legt den für den Export verwendeten Master‑Skalierungsfaktor fest. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Discreet3dsSaveOptions() {#Discreet3dsSaveOptions--}
```
public Discreet3dsSaveOptions()
```


Konstruktor von [Discreet3dsSaveOptions](../../com.aspose.threed/discreet3dssaveoptions)

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDuplicatedNameCounterBase() {#getDuplicatedNameCounterBase--}
```
public int getDuplicatedNameCounterBase()
```


Der Zähler, der zum Erzeugen neuer Namen für duplizierte Namen verwendet wird, Standardwert ist 2.

**Returns:**
int – Der Zähler, der beim Erzeugen neuer Namen für duplizierte Namen verwendet wird, Standardwert ist 2.
### getDuplicatedNameCounterFormat() {#getDuplicatedNameCounterFormat--}
```
public String getDuplicatedNameCounterFormat()
```


Das Format des duplizierten Zählers, Standardwert ist ein leerer String.

**Returns:**
java.lang.String – Das Format des duplizierten Zählers, Standardwert ist ein leerer String.
### getDuplicatedNameSeparator() {#getDuplicatedNameSeparator--}
```
public String getDuplicatedNameSeparator()
```


Der Trenner zwischen dem Objektnamen und dem duplizierten Zähler, Standardwert ist "\\_". Wenn die Szene Objekte enthält, die denselben Namen verwenden, erzeugt der Aspose.3D 3DS‑Exporter einen anderen Namen für das Objekt. Zum Beispiel gibt es zwei Knoten mit dem Namen "Box"; der erste Knoten hat den Namen "Box", und der zweite Knoten erhält mit der Standardkonfiguration den neuen Namen "Box\\_2".

**Returns:**
java.lang.String – Der Trenner zwischen dem Objektnamen und dem duplizierten Zähler, Standardwert ist "\\_". Wenn die Szene Objekte enthält, die denselben Namen verwenden, erzeugt der Aspose.3D 3DS‑Exporter einen anderen Namen für das Objekt. Zum Beispiel gibt es zwei Knoten mit dem Namen "Box"; der erste Knoten hat den Namen "Box", und der zweite Knoten erhält mit der Standardkonfiguration den neuen Namen "Box\\_2".
### getEncoding() {#getEncoding--}
```
public Charset getEncoding()
```


Liefert die Standardkodierung für textbasierte Dateien. Der Standardwert ist null, was bedeutet, dass der Importer/Exporter entscheidet, welche Kodierung verwendet wird.

**Returns:**
java.nio.charset.Charset - die Standardkodierung für textbasierte Dateien. Der Standardwert ist null, was bedeutet, dass der Importer/Exporter entscheidet, welche Kodierung verwendet wird.
### getExportCamera() {#getExportCamera--}
```
public boolean getExportCamera()
```


Gibt an, ob alle Kameras in der Szene exportiert werden.

**Returns:**
boolean – ob alle Kameras in der Szene exportiert werden.
### getExportLight() {#getExportLight--}
```
public boolean getExportLight()
```


Gibt an, ob alle Lichter in der Szene exportiert werden.

**Returns:**
boolean – ob alle Lichter in der Szene exportiert werden.
### getExportTextures() {#getExportTextures--}
```
public boolean getExportTextures()
```


Versucht, im Szene verwendete Texturen in das Ausgabeverzeichnis zu kopieren.

**Returns:**
boolean – Versucht, Texturen, die in der Szene verwendet werden, in das Ausgabeverzeichnis zu kopieren.
### getFileFormat() {#getFileFormat--}
```
public FileFormat getFileFormat()
```


Liefert das Dateiformat, das in der aktuellen Speicher-/Ladeoption angegeben ist.

**Returns:**
[FileFormat](../../com.aspose.threed/fileformat) - the file format that specified in current Save/Load option.
### getFileName() {#getFileName--}
```
public String getFileName()
```


Der Dateiname der exportierenden/ importierenden Szene. Dies ist optional, aber nützlich beim Serialisieren externer Assets wie dem Material von OBJ.

**Returns:**
java.lang.String - Der Dateiname der exportierenden/ importierenden Szene. Dies ist optional, aber nützlich beim Serialisieren externer Assets wie dem Material von OBJ.
### getFileSystem() {#getFileSystem--}
```
public FileSystem getFileSystem()
```


Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden.

**Returns:**
[FileSystem](../../com.aspose.threed/filesystem) - Allow user to handle how to manage the external dependencies during load/save. **Example:** The default FileSystem is LocalFileSystem, it is not safe in environment like server side, But you can override the file system access by specifying a different implementation. Aspose.3D provides different FileSystem implementation like:

 *  Memory-based file system
 *  Directory-based file system
 *  Dummy file system
 *  Zip file system

Und Sie können auch Ihre eigene Implementierung verwenden.

```
Scene scene = new Scene();
             var material = new PhongMaterial();
             var boxNode = scene.getRootNode().createChildNode(new Box());
             boxNode.setMaterial(material);
 
             var opt = new ObjSaveOptions();
             var memFs = new HashMap<string, MemoryStream>();
             opt.setFileSystem(FileSystem.createMemoryFileSystem(memFs));
 			opt.setFileName("output.obj");
             try(var output = new ByteArrayOutputStream()) {
 				scene.save(output, opt);
 				//The material will be written to variable memFs named output.mtl
 				var materialInBytes = memFs["output.mtl"].toArray();
             }
```
### getFileSystemFactory() {#getFileSystemFactory--}
```
public static FileSystemFactory getFileSystemFactory()
```


Liefert die Fabrikklasse für FileSystem. Die Standardfabrik erstellt com.aspose.threed.LocalFileSystem, das für Serverumgebungen nicht geeignet ist.

**Returns:**
[FileSystemFactory](../../com.aspose.threed/filesystemfactory) - the factory class for FileSystem. The default factory will create com.aspose.threed.LocalFileSystem which is not suitable for server environment. **Example:** The default FileSystem in SaveOptions/LoadOptions is directory-based file system, You can override the default implementation by specify it through IOConfig.FileSystemFactory:

```
IOConfig.setFileSystemFactory(new FileSystemFactory() {
 				@Override
 				public FileSystem call() {
 					return FileSystem.createDummyFileSystem();
 				}
 			});
 
             Scene scene = new Scene();
             var material = new PhongMaterial();
             var boxNode = scene.getRootNode().createChildNode(new Box());
             boxNode.setMaterial(material);
 
             //opt.FileSystem would be dummy file system now
             var opt = new ObjSaveOptions();
             scene.Save("output.obj", opt);
             //the material file output.mtl will not be written to any places because we've configured a dummy file system as default implementation.
```
### getFlipCoordinateSystem() {#getFlipCoordinateSystem--}
```
public boolean getFlipCoordinateSystem()
```


Liefert das Umkehren des Koordinatensystems von Kontrollpunkten/Normalen während des Imports/Exports.

**Returns:**
boolean - Koordinatensystem von Kontrollpunkten/Normale beim Import/Export umkehren.
### getGammaCorrectedColor() {#getGammaCorrectedColor--}
```
public boolean getGammaCorrectedColor()
```


Eine 3ds-Datei kann originale Farbe und gamma‑korrigierte Farbe für dasselbe Attribut enthalten. Wird dies auf true gesetzt, wird nach Möglichkeit die gamma‑korrigierte Farbe verwendet, andernfalls versucht Aspose.3D, die originale Farbe zu nutzen.

**Returns:**
boolean – Eine 3ds‑Datei kann für dasselbe Attribut Originalfarbe und gamma‑korrigierte Farbe enthalten. Wird dies auf true gesetzt, wird nach Möglichkeit die gamma‑korrigierte Farbe verwendet, andernfalls versucht Aspose.3D, die Originalfarbe zu nutzen.
### getHighPreciseColor() {#getHighPreciseColor--}
```
public boolean getHighPreciseColor()
```


Wenn dies true ist, verwendet die erzeugte 3ds‑Datei hochpräzise Farben, d. h. jeder Rot‑/Grün‑/Blau‑Kanal ist ein 32‑Bit‑Float. Andernfalls verwendet die erzeugte Datei 24‑Bit‑Farben, wobei jeder Kanal ein 8‑Bit‑Byte nutzt. Der Standardwert ist false, da nicht alle Anwendungen hochpräzise Farben unterstützen.

**Returns:**
boolean – Wenn dies true ist, verwendet die erzeugte 3ds‑Datei hochpräzise Farben, d. h. jeder Rot‑/Grün‑/Blau‑Kanal ist ein 32‑Bit‑Float. Andernfalls verwendet die erzeugte Datei 24‑Bit‑Farben, wobei jeder Kanal ein 8‑Bit‑Byte nutzt. Der Standardwert ist false, da nicht alle Anwendungen hochpräzise Farben unterstützen.
### getLookupPaths() {#getLookupPaths--}
```
public ArrayList<String> getLookupPaths()
```


Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen.

**Returns:**
java.util.ArrayList<java.lang.String> - Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen Aspose.3D das Auffinden externer Dateien zum Laden. **Beispiel:** Der folgende Code zeigt, wie man die Suchpfade für Texturen manuell festlegt, damit der Importer sie finden kann

```
var opt = new ObjLoadOptions();
             //Specify the lookup paths, so the textures can be located.
             opt.getLookupPaths().add("textures");
             var scene = Scene.fromFile("input.obj", opt);
             scene.save("output.glb");
```
### getMasterScale() {#getMasterScale--}
```
public double getMasterScale()
```


Liefert die beim Export verwendete Master‑Skala.

**Returns:**
double – der für den Export verwendete Master‑Skalierungsfaktor.
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




### setDuplicatedNameCounterBase(int value) {#setDuplicatedNameCounterBase-int-}
```
public void setDuplicatedNameCounterBase(int value)
```


Der Zähler, der zum Erzeugen neuer Namen für duplizierte Namen verwendet wird, Standardwert ist 2.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setDuplicatedNameCounterFormat(String value) {#setDuplicatedNameCounterFormat-java.lang.String-}
```
public void setDuplicatedNameCounterFormat(String value)
```


Das Format des duplizierten Zählers, Standardwert ist ein leerer String.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setDuplicatedNameSeparator(String value) {#setDuplicatedNameSeparator-java.lang.String-}
```
public void setDuplicatedNameSeparator(String value)
```


Der Trenner zwischen dem Objektnamen und dem duplizierten Zähler, Standardwert ist "\\_". Wenn die Szene Objekte enthält, die denselben Namen verwenden, erzeugt der Aspose.3D 3DS‑Exporter einen anderen Namen für das Objekt. Zum Beispiel gibt es zwei Knoten mit dem Namen "Box"; der erste Knoten hat den Namen "Box", und der zweite Knoten erhält mit der Standardkonfiguration den neuen Namen "Box\\_2".

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setEncoding(Charset value) {#setEncoding-java.nio.charset.Charset-}
```
public void setEncoding(Charset value)
```


Legt die Standardkodierung für textbasierte Dateien fest. Der Standardwert ist null, was bedeutet, dass der Importer/Exporter die zu verwendende Kodierung entscheidet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.nio.charset.Charset | Neuer Wert |

### setExportCamera(boolean value) {#setExportCamera-boolean-}
```
public void setExportCamera(boolean value)
```


Legt fest, ob alle Kameras in der Szene exportiert werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setExportLight(boolean value) {#setExportLight-boolean-}
```
public void setExportLight(boolean value)
```


Legt fest, ob alle Lichter in der Szene exportiert werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setExportTextures(boolean value) {#setExportTextures-boolean-}
```
public void setExportTextures(boolean value)
```


Versucht, im Szene verwendete Texturen in das Ausgabeverzeichnis zu kopieren.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setFileName(String value) {#setFileName-java.lang.String-}
```
public void setFileName(String value)
```


Der Dateiname der exportierenden/ importierenden Szene. Dies ist optional, aber nützlich beim Serialisieren externer Assets wie dem Material von OBJ.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setFileSystem(FileSystem value) {#setFileSystem-com.aspose.threed.FileSystem-}
```
public void setFileSystem(FileSystem value)
```


Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | value | [FileSystem](../../com.aspose.threed/filesystem) | Neuer Wert **Beispiel:** Das Standard-FileSystem ist LocalFileSystem, es ist in einer Server-Umgebung nicht sicher, aber Sie können den Dateisystemzugriff überschreiben, indem Sie eine andere Implementierung angeben. Aspose.3D bietet verschiedene FileSystem-Implementierungen, wie zum Beispiel: |

 *  Memory-based file system
 *  Directory-based file system
 *  Dummy file system
 *  Zip file system

Und Sie können auch Ihre eigene Implementierung verwenden.

```
Scene scene = new Scene();
             var material = new PhongMaterial();
             var boxNode = scene.getRootNode().createChildNode(new Box());
             boxNode.setMaterial(material);
 
             var opt = new ObjSaveOptions();
             var memFs = new HashMap<string, MemoryStream>();
             opt.setFileSystem(FileSystem.createMemoryFileSystem(memFs));
 			opt.setFileName("output.obj");
             try(var output = new ByteArrayOutputStream()) {
 				scene.save(output, opt);
 				//The material will be written to variable memFs named output.mtl
 				var materialInBytes = memFs["output.mtl"].toArray();
             }
``` |

### setFileSystemFactory(FileSystemFactory value) {#setFileSystemFactory-com.aspose.threed.FileSystemFactory-}
```
public static void setFileSystemFactory(FileSystemFactory value)
```


Legt die Fabrikklasse für FileSystem fest. Die Standardfabrik erstellt com.aspose.threed.LocalFileSystem, das für Serverumgebungen nicht geeignet ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | value | [FileSystemFactory](../../com.aspose.threed/filesystemfactory) | Neuer Wert **Beispiel:** Das Standard-FileSystem in SaveOptions/LoadOptions ist ein verzeichnisbasiertes Dateisystem. Sie können die Standardimplementierung überschreiben, indem Sie sie über IOConfig.FileSystemFactory angeben: |

```
IOConfig.setFileSystemFactory(new FileSystemFactory() {
 				@Override
 				public FileSystem call() {
 					return FileSystem.createDummyFileSystem();
 				}
 			});
 
             Scene scene = new Scene();
             var material = new PhongMaterial();
             var boxNode = scene.getRootNode().createChildNode(new Box());
             boxNode.setMaterial(material);
 
             //opt.FileSystem would be dummy file system now
             var opt = new ObjSaveOptions();
             scene.Save("output.obj", opt);
             //the material file output.mtl will not be written to any places because we've configured a dummy file system as default implementation.
``` |

### setFlipCoordinateSystem(boolean value) {#setFlipCoordinateSystem-boolean-}
```
public void setFlipCoordinateSystem(boolean value)
```


Setzt das Umkehren des Koordinatensystems von Kontrollpunkten/Normalen beim Import/Export.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setGammaCorrectedColor(boolean value) {#setGammaCorrectedColor-boolean-}
```
public void setGammaCorrectedColor(boolean value)
```


Eine 3ds-Datei kann originale Farbe und gamma‑korrigierte Farbe für dasselbe Attribut enthalten. Wird dies auf true gesetzt, wird nach Möglichkeit die gamma‑korrigierte Farbe verwendet, andernfalls versucht Aspose.3D, die originale Farbe zu nutzen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setHighPreciseColor(boolean value) {#setHighPreciseColor-boolean-}
```
public void setHighPreciseColor(boolean value)
```


Wenn dies true ist, verwendet die erzeugte 3ds‑Datei hochpräzise Farben, d. h. jeder Rot‑/Grün‑/Blau‑Kanal ist ein 32‑Bit‑Float. Andernfalls verwendet die erzeugte Datei 24‑Bit‑Farben, wobei jeder Kanal ein 8‑Bit‑Byte nutzt. Der Standardwert ist false, da nicht alle Anwendungen hochpräzise Farben unterstützen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setLookupPaths(ArrayList<String> value) {#setLookupPaths-java.util.ArrayList-java.lang.String--}
```
public void setLookupPaths(ArrayList<String> value)
```


Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | Wert | java.util.ArrayList<java.lang.String> | Neuer Wert **Beispiel:** Der folgende Code zeigt, wie man die Suchpfade für Texturen manuell festlegt, damit der Importer sie finden kann |

```
var opt = new ObjLoadOptions();
             //Specify the lookup paths, so the textures can be located.
             opt.getLookupPaths().add("textures");
             var scene = Scene.fromFile("input.obj", opt);
             scene.save("output.glb");
``` |

### setMasterScale(double value) {#setMasterScale-double-}
```
public void setMasterScale(double value)
```


Legt den für den Export verwendeten Master‑Skalierungsfaktor fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

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

