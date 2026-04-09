---
title: DracoSaveOptions
second_title: Aspose.3D für Java API-Referenz
description: Speicheroptionen für Google Draco-Dateien
type: docs
weight: 47
url: /de/java/com.aspose.threed/dracosaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class DracoSaveOptions extends SaveOptions
```

Speicheroptionen für Google Draco-Dateien
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [DracoSaveOptions()](#DracoSaveOptions--) | Erstelle eine Standardkonfiguration zum Speichern von draco-Dateien. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getApplyUnitScale()](#getApplyUnitScale--) | Wenden Sie [AssetInfo.getUnitScaleFactor](../../com.aspose.threed/assetinfo\#getUnitScaleFactor) auf das Mesh an. |
| [getClass()](#getClass--) |  |
| [getColorBits()](#getColorBits--) | Quantisierungsbits für Vertex-Farbe, Standardwert ist 10 |
| [getCompressionLevel()](#getCompressionLevel--) | Komprimierungsstufe, Standardwert ist [DracoCompressionLevel.STANDARD](../../com.aspose.threed/dracocompressionlevel\#STANDARD) |
| [getEncoding()](#getEncoding--) | Liefert die Standardkodierung für textbasierte Dateien. |
| [getExportTextures()](#getExportTextures--) | Versucht, im Szene verwendete Texturen in das Ausgabeverzeichnis zu kopieren. |
| [getFileFormat()](#getFileFormat--) | Liefert das Dateiformat, das in der aktuellen Speicher-/Ladeoption angegeben ist. |
| [getFileName()](#getFileName--) | Der Dateiname der exportierenden/ importierenden Szene. |
| [getFileSystem()](#getFileSystem--) | Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden. |
| [getFileSystemFactory()](#getFileSystemFactory--) | Liefert die Fabrikklasse für das Dateisystem. |
| [getLookupPaths()](#getLookupPaths--) | Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen. |
| [getNormalBits()](#getNormalBits--) | Quantisierungsbits für Normalenvektoren, Standardwert ist 10 |
| [getPointCloud()](#getPointCloud--) | Exportieren Sie die Szene als Punktwolke, Standardwert ist false. |
| [getPositionBits()](#getPositionBits--) | Quantisierungsbits für Position, Standardwert ist 14 |
| [getTextureCoordinateBits()](#getTextureCoordinateBits--) | Quantisierungsbits für Texturkoordinate, Standardwert ist 12 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setApplyUnitScale(boolean value)](#setApplyUnitScale-boolean-) | Wenden Sie [AssetInfo.getUnitScaleFactor](../../com.aspose.threed/assetinfo\#getUnitScaleFactor) auf das Mesh an. |
| [setColorBits(int value)](#setColorBits-int-) | Quantisierungsbits für Vertex-Farbe, Standardwert ist 10 |
| [setCompressionLevel(DracoCompressionLevel value)](#setCompressionLevel-com.aspose.threed.DracoCompressionLevel-) | Komprimierungsstufe, Standardwert ist [DracoCompressionLevel.STANDARD](../../com.aspose.threed/dracocompressionlevel\#STANDARD) |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Setzt die Standardkodierung für textbasierte Dateien. |
| [setExportTextures(boolean value)](#setExportTextures-boolean-) | Versucht, im Szene verwendete Texturen in das Ausgabeverzeichnis zu kopieren. |
| [setFileName(String value)](#setFileName-java.lang.String-) | Der Dateiname der exportierenden/ importierenden Szene. |
| [setFileSystem(FileSystem value)](#setFileSystem-com.aspose.threed.FileSystem-) | Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden. |
| [setFileSystemFactory(FileSystemFactory value)](#setFileSystemFactory-com.aspose.threed.FileSystemFactory-) | Setzt die Fabrikklasse für das Dateisystem. |
| [setLookupPaths(ArrayList<String> value)](#setLookupPaths-java.util.ArrayList-java.lang.String--) | Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen. |
| [setNormalBits(int value)](#setNormalBits-int-) | Quantisierungsbits für Normalenvektoren, Standardwert ist 10 |
| [setPointCloud(boolean value)](#setPointCloud-boolean-) | Exportieren Sie die Szene als Punktwolke, Standardwert ist false. |
| [setPositionBits(int value)](#setPositionBits-int-) | Quantisierungsbits für Position, Standardwert ist 14 |
| [setTextureCoordinateBits(int value)](#setTextureCoordinateBits-int-) | Quantisierungsbits für Texturkoordinate, Standardwert ist 12 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DracoSaveOptions() {#DracoSaveOptions--}
```
public DracoSaveOptions()
```


Erstelle eine Standardkonfiguration zum Speichern von draco-Dateien.

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
### getApplyUnitScale() {#getApplyUnitScale--}
```
public boolean getApplyUnitScale()
```


Wenden Sie [AssetInfo.getUnitScaleFactor](../../com.aspose.threed/assetinfo\#getUnitScaleFactor) auf das Mesh an. Standardwert ist false.

**Returns:**
boolean - Wenden Sie [AssetInfo.getUnitScaleFactor](../../com.aspose.threed/assetinfo\#getUnitScaleFactor) auf das Mesh an. Standardwert ist false.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getColorBits() {#getColorBits--}
```
public int getColorBits()
```


Quantisierungsbits für Vertex-Farbe, Standardwert ist 10

**Returns:**
int - Quantisierungsbits für Vertex-Farbe, Standardwert ist 10
### getCompressionLevel() {#getCompressionLevel--}
```
public DracoCompressionLevel getCompressionLevel()
```


Komprimierungsstufe, Standardwert ist [DracoCompressionLevel.STANDARD](../../com.aspose.threed/dracocompressionlevel\#STANDARD)

**Returns:**
[DracoCompressionLevel](../../com.aspose.threed/dracocompressionlevel) - Compression level, default value is [DracoCompressionLevel.STANDARD](../../com.aspose.threed/dracocompressionlevel\#STANDARD)
### getEncoding() {#getEncoding--}
```
public Charset getEncoding()
```


Liefert die Standardkodierung für textbasierte Dateien. Der Standardwert ist null, was bedeutet, dass der Importer/Exporter entscheidet, welche Kodierung verwendet wird.

**Returns:**
java.nio.charset.Charset - die Standardkodierung für textbasierte Dateien. Der Standardwert ist null, was bedeutet, dass der Importer/Exporter entscheidet, welche Kodierung verwendet wird.
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
### getNormalBits() {#getNormalBits--}
```
public int getNormalBits()
```


Quantisierungsbits für Normalenvektoren, Standardwert ist 10

**Returns:**
int - Quantisierungsbits für Normalenvektoren, Standardwert ist 10
### getPointCloud() {#getPointCloud--}
```
public boolean getPointCloud()
```


Exportieren Sie die Szene als Punktwolke, Standardwert ist false.

**Returns:**
boolean - Exportieren Sie die Szene als Punktwolke, Standardwert ist false.
### getPositionBits() {#getPositionBits--}
```
public int getPositionBits()
```


Quantisierungsbits für Position, Standardwert ist 14

**Returns:**
int - Quantisierungsbits für Position, Standardwert ist 14
### getTextureCoordinateBits() {#getTextureCoordinateBits--}
```
public int getTextureCoordinateBits()
```


Quantisierungsbits für Texturkoordinate, Standardwert ist 12

**Returns:**
int - Quantisierungsbits für Texturkoordinate, Standardwert ist 12
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




### setApplyUnitScale(boolean value) {#setApplyUnitScale-boolean-}
```
public void setApplyUnitScale(boolean value)
```


Wenden Sie [AssetInfo.getUnitScaleFactor](../../com.aspose.threed/assetinfo\#getUnitScaleFactor) auf das Mesh an. Standardwert ist false.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setColorBits(int value) {#setColorBits-int-}
```
public void setColorBits(int value)
```


Quantisierungsbits für Vertex-Farbe, Standardwert ist 10

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setCompressionLevel(DracoCompressionLevel value) {#setCompressionLevel-com.aspose.threed.DracoCompressionLevel-}
```
public void setCompressionLevel(DracoCompressionLevel value)
```


Komprimierungsstufe, Standardwert ist [DracoCompressionLevel.STANDARD](../../com.aspose.threed/dracocompressionlevel\#STANDARD)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [DracoCompressionLevel](../../com.aspose.threed/dracocompressionlevel) | Neuer Wert |

### setEncoding(Charset value) {#setEncoding-java.nio.charset.Charset-}
```
public void setEncoding(Charset value)
```


Legt die Standardkodierung für textbasierte Dateien fest. Der Standardwert ist null, was bedeutet, dass der Importer/Exporter die zu verwendende Kodierung entscheidet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.nio.charset.Charset | Neuer Wert |

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

### setNormalBits(int value) {#setNormalBits-int-}
```
public void setNormalBits(int value)
```


Quantisierungsbits für Normalenvektoren, Standardwert ist 10

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setPointCloud(boolean value) {#setPointCloud-boolean-}
```
public void setPointCloud(boolean value)
```


Exportieren Sie die Szene als Punktwolke, Standardwert ist false.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setPositionBits(int value) {#setPositionBits-int-}
```
public void setPositionBits(int value)
```


Quantisierungsbits für Position, Standardwert ist 14

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setTextureCoordinateBits(int value) {#setTextureCoordinateBits-int-}
```
public void setTextureCoordinateBits(int value)
```


Quantisierungsbits für Texturkoordinate, Standardwert ist 12

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

