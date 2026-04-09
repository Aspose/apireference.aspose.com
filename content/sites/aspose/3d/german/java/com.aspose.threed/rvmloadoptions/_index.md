---
title: RvmLoadOptions
second_title: Aspose.3D für Java API-Referenz
description: Ladeoptionen für AVEVA Plant Design Management Systems RVM-Datei.
type: docs
weight: 157
url: /de/java/com.aspose.threed/rvmloadoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.LoadOptions](../../com.aspose.threed/loadoptions)
```
public class RvmLoadOptions extends LoadOptions
```

Ladeoptionen für die RVM-Datei des AVEVA Plant Design Management Systems. **Beispiel:** Der folgende Code zeigt, wie man die Tessellationsparameter für primitive Geometrien, die aus einer RVM-Datei importiert wurden, mit **RvmLoadOptions** anpasst.

```
RvmLoadOptions opt = new RvmLoadOptions();
             opt.setRectangularTorusSegments(30);
             opt.setCylinderRadialSegments(20);
             opt.setDishLatitudeSegments(20);
             opt.setDishLongitudeSegments(20);
             opt.setCenterScene(true);
             var scene = Scene.fromFile("input.rvm", opt);
             scene.save("output.obj");
```
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [RvmLoadOptions(FileContentType contentType)](#RvmLoadOptions-com.aspose.threed.FileContentType-) | Erstelle eine [RvmLoadOptions](../../com.aspose.threed/rvmloadoptions) Instanz |
| [RvmLoadOptions()](#RvmLoadOptions--) | Erstelle eine [RvmLoadOptions](../../com.aspose.threed/rvmloadoptions) Instanz |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAttributePrefix()](#getAttributePrefix--) | Ermittelt das Präfix der Attribute, die in externen Attributdateien definiert wurden. Das Präfix wird verwendet, um Namenskonflikte zu vermeiden; Standardwert ist "rvm:" |
| [getCenterScene()](#getCenterScene--) | Zentriere die Szene, nachdem sie geladen wurde. |
| [getClass()](#getClass--) |  |
| [getCylinderRadialSegments()](#getCylinderRadialSegments--) | Ermittelt die Anzahl der radialen Segmente des Zylinders, Standardwert ist 16 |
| [getDishLatitudeSegments()](#getDishLatitudeSegments--) | Ermittelt die Anzahl der Breitengradsegmente der Schüssel, Standardwert ist 8 |
| [getDishLongitudeSegments()](#getDishLongitudeSegments--) | Ermittelt die Anzahl der Längengradsegmente der Schüssel, Standardwert ist 12 |
| [getEncoding()](#getEncoding--) | Liefert die Standardkodierung für textbasierte Dateien. |
| [getFileFormat()](#getFileFormat--) | Liefert das Dateiformat, das in der aktuellen Speicher-/Ladeoption angegeben ist. |
| [getFileName()](#getFileName--) | Der Dateiname der exportierenden/ importierenden Szene. |
| [getFileSystem()](#getFileSystem--) | Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden. |
| [getFileSystemFactory()](#getFileSystemFactory--) | Liefert die Fabrikklasse für das Dateisystem. |
| [getGenerateMaterials()](#getGenerateMaterials--) | Erstelle Materialien mit zufälligen Farben für jedes Objekt in der Szene, wenn die Farbpalette nicht innerhalb der RVM-Datei exportiert wird. |
| [getLookupAttributes()](#getLookupAttributes--) | Ermittelt, ob Attribute aus einer externen Attributlistendatei (.att/.attrib/.txt) geladen werden sollen, Standardwert ist true. |
| [getLookupPaths()](#getLookupPaths--) | Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen. |
| [getRectangularTorusSegments()](#getRectangularTorusSegments--) | Ermittelt die Anzahl der radialen Segmente des rechteckigen Torus, Standardwert ist 20 |
| [getTorusTubularSegments()](#getTorusTubularSegments--) | Ermittelt die Anzahl der röhrenförmigen Segmente des Torus, Standardwert ist 20 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAttributePrefix(String value)](#setAttributePrefix-java.lang.String-) | Legt das Präfix der Attribute fest, die in externen Attributdateien definiert wurden. Das Präfix wird verwendet, um Namenskonflikte zu vermeiden; Standardwert ist "rvm:" |
| [setCenterScene(boolean value)](#setCenterScene-boolean-) | Zentriere die Szene, nachdem sie geladen wurde. |
| [setCylinderRadialSegments(int value)](#setCylinderRadialSegments-int-) | Legt die Anzahl der radialen Segmente des Zylinders fest, Standardwert ist 16 |
| [setDishLatitudeSegments(int value)](#setDishLatitudeSegments-int-) | Legt die Anzahl der Breitengradsegmente der Schüssel fest, Standardwert ist 8 |
| [setDishLongitudeSegments(int value)](#setDishLongitudeSegments-int-) | Legt die Anzahl der Längengradsegmente der Schüssel fest, Standardwert ist 12 |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Setzt die Standardkodierung für textbasierte Dateien. |
| [setFileName(String value)](#setFileName-java.lang.String-) | Der Dateiname der exportierenden/ importierenden Szene. |
| [setFileSystem(FileSystem value)](#setFileSystem-com.aspose.threed.FileSystem-) | Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden. |
| [setFileSystemFactory(FileSystemFactory value)](#setFileSystemFactory-com.aspose.threed.FileSystemFactory-) | Setzt die Fabrikklasse für das Dateisystem. |
| [setGenerateMaterials(boolean value)](#setGenerateMaterials-boolean-) | Erstelle Materialien mit zufälligen Farben für jedes Objekt in der Szene, wenn die Farbpalette nicht innerhalb der RVM-Datei exportiert wird. |
| [setLookupAttributes(boolean value)](#setLookupAttributes-boolean-) | Legt fest, ob Attribute aus einer externen Attributlistendatei (.att/.attrib/.txt) geladen werden sollen, Standardwert ist true. |
| [setLookupPaths(ArrayList<String> value)](#setLookupPaths-java.util.ArrayList-java.lang.String--) | Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen. |
| [setRectangularTorusSegments(int value)](#setRectangularTorusSegments-int-) | Legt die Anzahl der radialen Segmente des rechteckigen Torus fest, Standardwert ist 20 |
| [setTorusTubularSegments(int value)](#setTorusTubularSegments-int-) | Legt die Anzahl der röhrenförmigen Segmente des Torus fest, Standardwert ist 20 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### RvmLoadOptions(FileContentType contentType) {#RvmLoadOptions-com.aspose.threed.FileContentType-}
```
public RvmLoadOptions(FileContentType contentType)
```


Erstelle eine [RvmLoadOptions](../../com.aspose.threed/rvmloadoptions) Instanz

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| contentType | [FileContentType](../../com.aspose.threed/filecontenttype) |  |

### RvmLoadOptions() {#RvmLoadOptions--}
```
public RvmLoadOptions()
```


Erstelle eine [RvmLoadOptions](../../com.aspose.threed/rvmloadoptions) Instanz

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
### getAttributePrefix() {#getAttributePrefix--}
```
public String getAttributePrefix()
```


Ermittelt das Präfix der Attribute, die in externen Attributdateien definiert wurden. Das Präfix wird verwendet, um Namenskonflikte zu vermeiden; Standardwert ist "rvm:"

**Returns:**
java.lang.String - das Präfix der Attribute, die in externen Attributdateien definiert wurden. Das Präfix wird verwendet, um Namenskonflikte zu vermeiden, Standardwert ist "rvm:"
### getCenterScene() {#getCenterScene--}
```
public boolean getCenterScene()
```


Zentriere die Szene, nachdem sie geladen wurde.

**Returns:**
boolean - Szene nach dem Laden zentrieren.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCylinderRadialSegments() {#getCylinderRadialSegments--}
```
public int getCylinderRadialSegments()
```


Ermittelt die Anzahl der radialen Segmente des Zylinders, Standardwert ist 16

**Returns:**
int - die Anzahl der radialen Segmente des Zylinders, Standardwert ist 16
### getDishLatitudeSegments() {#getDishLatitudeSegments--}
```
public int getDishLatitudeSegments()
```


Ermittelt die Anzahl der Breitengradsegmente der Schüssel, Standardwert ist 8

**Returns:**
int - die Anzahl der Breitengradsegmente der Schüssel, Standardwert ist 8
### getDishLongitudeSegments() {#getDishLongitudeSegments--}
```
public int getDishLongitudeSegments()
```


Ermittelt die Anzahl der Längengradsegmente der Schüssel, Standardwert ist 12

**Returns:**
int - die Anzahl der Längengradsegmente der Schüssel, Standardwert ist 12
### getEncoding() {#getEncoding--}
```
public Charset getEncoding()
```


Liefert die Standardkodierung für textbasierte Dateien. Der Standardwert ist null, was bedeutet, dass der Importer/Exporter entscheidet, welche Kodierung verwendet wird.

**Returns:**
java.nio.charset.Charset - die Standardkodierung für textbasierte Dateien. Der Standardwert ist null, was bedeutet, dass der Importer/Exporter entscheidet, welche Kodierung verwendet wird.
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
### getGenerateMaterials() {#getGenerateMaterials--}
```
public boolean getGenerateMaterials()
```


Materialien mit zufälligen Farben für jedes Objekt in der Szene erzeugen, wenn die Farbpalette nicht im RVM‑Datei exportiert wird. Standardwert ist true

**Returns:**
boolean - Materialien mit zufälligen Farben für jedes Objekt in der Szene erzeugen, wenn die Farbpalette nicht im RVM‑Datei exportiert wird. Standardwert ist true
### getLookupAttributes() {#getLookupAttributes--}
```
public boolean getLookupAttributes()
```


Ermittelt, ob Attribute aus einer externen Attributlistendatei (.att/.attrib/.txt) geladen werden sollen, Standardwert ist true.

**Returns:**
boolean - ob Attribute aus einer externen Attributlistendatei (.att/.attrib/.txt) geladen werden sollen, Standardwert ist true.
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
### getRectangularTorusSegments() {#getRectangularTorusSegments--}
```
public int getRectangularTorusSegments()
```


Ermittelt die Anzahl der radialen Segmente des rechteckigen Torus, Standardwert ist 20

**Returns:**
int - die Anzahl der radialen Segmente des rechteckigen Torus, Standardwert ist 20
### getTorusTubularSegments() {#getTorusTubularSegments--}
```
public int getTorusTubularSegments()
```


Ermittelt die Anzahl der röhrenförmigen Segmente des Torus, Standardwert ist 20

**Returns:**
int - die Anzahl der röhrenförmigen Segmente des Torus, Standardwert ist 20
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




### setAttributePrefix(String value) {#setAttributePrefix-java.lang.String-}
```
public void setAttributePrefix(String value)
```


Legt das Präfix der Attribute fest, die in externen Attributdateien definiert wurden. Das Präfix wird verwendet, um Namenskonflikte zu vermeiden; Standardwert ist "rvm:"

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setCenterScene(boolean value) {#setCenterScene-boolean-}
```
public void setCenterScene(boolean value)
```


Zentriere die Szene, nachdem sie geladen wurde.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setCylinderRadialSegments(int value) {#setCylinderRadialSegments-int-}
```
public void setCylinderRadialSegments(int value)
```


Legt die Anzahl der radialen Segmente des Zylinders fest, Standardwert ist 16

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setDishLatitudeSegments(int value) {#setDishLatitudeSegments-int-}
```
public void setDishLatitudeSegments(int value)
```


Legt die Anzahl der Breitengradsegmente der Schüssel fest, Standardwert ist 8

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setDishLongitudeSegments(int value) {#setDishLongitudeSegments-int-}
```
public void setDishLongitudeSegments(int value)
```


Legt die Anzahl der Längengradsegmente der Schüssel fest, Standardwert ist 12

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setEncoding(Charset value) {#setEncoding-java.nio.charset.Charset-}
```
public void setEncoding(Charset value)
```


Legt die Standardkodierung für textbasierte Dateien fest. Der Standardwert ist null, was bedeutet, dass der Importer/Exporter die zu verwendende Kodierung entscheidet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.nio.charset.Charset | Neuer Wert |

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

### setGenerateMaterials(boolean value) {#setGenerateMaterials-boolean-}
```
public void setGenerateMaterials(boolean value)
```


Materialien mit zufälligen Farben für jedes Objekt in der Szene erzeugen, wenn die Farbpalette nicht im RVM‑Datei exportiert wird. Standardwert ist true

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setLookupAttributes(boolean value) {#setLookupAttributes-boolean-}
```
public void setLookupAttributes(boolean value)
```


Legt fest, ob Attribute aus einer externen Attributlistendatei (.att/.attrib/.txt) geladen werden sollen, Standardwert ist true.

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

### setRectangularTorusSegments(int value) {#setRectangularTorusSegments-int-}
```
public void setRectangularTorusSegments(int value)
```


Legt die Anzahl der radialen Segmente des rechteckigen Torus fest, Standardwert ist 20

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setTorusTubularSegments(int value) {#setTorusTubularSegments-int-}
```
public void setTorusTubularSegments(int value)
```


Legt die Anzahl der röhrenförmigen Segmente des Torus fest, Standardwert ist 20

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

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

