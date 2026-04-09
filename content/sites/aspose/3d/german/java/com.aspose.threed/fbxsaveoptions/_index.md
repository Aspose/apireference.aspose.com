---
title: FbxSaveOptions
second_title: Aspose.3D für Java API-Referenz
description: Speicheroptionen für die Fbx-Datei.
type: docs
weight: 63
url: /de/java/com.aspose.threed/fbxsaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class FbxSaveOptions extends SaveOptions
```

Speicheroptionen für die Fbx-Datei.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [FbxSaveOptions(FileFormat format)](#FbxSaveOptions-com.aspose.threed.FileFormat-) | Initialisiert ein [FbxSaveOptions](../../com.aspose.threed/fbxsaveoptions) |
| [FbxSaveOptions(FileContentType contentType)](#FbxSaveOptions-com.aspose.threed.FileContentType-) | Initialisieren Sie ein [FbxSaveOptions](../../com.aspose.threed/fbxsaveoptions) mit der neuesten unterstützten Version. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEmbedTextures()](#getEmbedTextures--) | Ermittelt, ob die Textur in die endgültige Ausgabedatei eingebettet werden soll. |
| [getEnableCompression()](#getEnableCompression--) | Komprimierung großer Binärdaten in der FBX-Datei (z. B. |
| [getEncoding()](#getEncoding--) | Liefert die Standardkodierung für textbasierte Dateien. |
| [getExportLegacyMaterialProperties()](#getExportLegacyMaterialProperties--) | Ermittelt, ob veraltete Materialeigenschaften exportiert werden, die für die Rückwärtskompatibilität verwendet werden. |
| [getExportTextures()](#getExportTextures--) | Versucht, im Szene verwendete Texturen in das Ausgabeverzeichnis zu kopieren. |
| [getFileFormat()](#getFileFormat--) | Liefert das Dateiformat, das in der aktuellen Speicher-/Ladeoption angegeben ist. |
| [getFileName()](#getFileName--) | Der Dateiname der exportierenden/ importierenden Szene. |
| [getFileSystem()](#getFileSystem--) | Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden. |
| [getFileSystemFactory()](#getFileSystemFactory--) | Liefert die Fabrikklasse für das Dateisystem. |
| [getFoldRepeatedCurveData()](#getFoldRepeatedCurveData--) | Ermittelt, ob wiederholte Kurvendaten durch Erhöhen des Referenzzählers der letzten Daten wiederverwendet werden. |
| [getGenerateVertexElementMaterial()](#getGenerateVertexElementMaterial--) | Ermittelt, ob stets ein [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial) für Geometrien erzeugt wird, wenn der zugehörige Knoten Materialien enthält. |
| [getLookupPaths()](#getLookupPaths--) | Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen. |
| [getReusePrimitiveMesh()](#getReusePrimitiveMesh--) | Verwenden Sie das Mesh für Primitive mit denselben Parametern erneut, dies reduziert die Größe der FBX-Ausgabe erheblich, wenn die Szene aus einer großen Menge primitiver Formen (wie aus CAD-Dateien importiert) aufgebaut ist. |
| [getVideoForTexture()](#getVideoForTexture--) | Ermittelt, ob eine Video-Instanz für [Texture](../../com.aspose.threed/texture) beim Exportieren als FBX erzeugt wird. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEmbedTextures(boolean value)](#setEmbedTextures-boolean-) | Legt fest, ob die Textur in die endgültige Ausgabedatei eingebettet werden soll. |
| [setEnableCompression(boolean value)](#setEnableCompression-boolean-) | Komprimierung großer Binärdaten in der FBX-Datei (z. B. |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Setzt die Standardkodierung für textbasierte Dateien. |
| [setExportLegacyMaterialProperties(boolean value)](#setExportLegacyMaterialProperties-boolean-) | Legt fest, ob veraltete Materialeigenschaften exportiert werden, die für die Rückwärtskompatibilität verwendet werden. |
| [setExportTextures(boolean value)](#setExportTextures-boolean-) | Versucht, im Szene verwendete Texturen in das Ausgabeverzeichnis zu kopieren. |
| [setFileName(String value)](#setFileName-java.lang.String-) | Der Dateiname der exportierenden/ importierenden Szene. |
| [setFileSystem(FileSystem value)](#setFileSystem-com.aspose.threed.FileSystem-) | Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden. |
| [setFileSystemFactory(FileSystemFactory value)](#setFileSystemFactory-com.aspose.threed.FileSystemFactory-) | Setzt die Fabrikklasse für das Dateisystem. |
| [setFoldRepeatedCurveData(Boolean value)](#setFoldRepeatedCurveData-java.lang.Boolean-) | Legt fest, ob wiederholte Kurvendaten durch Erhöhen des Referenzzählers der letzten Daten wiederverwendet werden. |
| [setGenerateVertexElementMaterial(boolean value)](#setGenerateVertexElementMaterial-boolean-) | Legt fest, ob stets ein [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial) für Geometrien erzeugt wird, wenn der zugehörige Knoten Materialien enthält. |
| [setLookupPaths(ArrayList<String> value)](#setLookupPaths-java.util.ArrayList-java.lang.String--) | Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen. |
| [setReusePrimitiveMesh(boolean value)](#setReusePrimitiveMesh-boolean-) | Verwenden Sie das Mesh für Primitive mit denselben Parametern erneut, dies reduziert die Größe der FBX-Ausgabe erheblich, wenn die Szene aus einer großen Menge primitiver Formen (wie aus CAD-Dateien importiert) aufgebaut ist. |
| [setVideoForTexture(boolean value)](#setVideoForTexture-boolean-) | Legt fest, ob eine Video-Instanz für [Texture](../../com.aspose.threed/texture) beim Exportieren als FBX erzeugt wird. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FbxSaveOptions(FileFormat format) {#FbxSaveOptions-com.aspose.threed.FileFormat-}
```
public FbxSaveOptions(FileFormat format)
```


Initialisiert ein [FbxSaveOptions](../../com.aspose.threed/fbxsaveoptions)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Instanz von [getFileFormat](../../com.aspose.threed/fbxsaveoptions\#getFileFormat), sie sollte ein gültiges FBX-Format sein. |

### FbxSaveOptions(FileContentType contentType) {#FbxSaveOptions-com.aspose.threed.FileContentType-}
```
public FbxSaveOptions(FileContentType contentType)
```


Initialisieren Sie ein [FbxSaveOptions](../../com.aspose.threed/fbxsaveoptions) mit der neuesten unterstützten Version.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| contentType | [FileContentType](../../com.aspose.threed/filecontenttype) | Binär oder ASCII |

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
### getEmbedTextures() {#getEmbedTextures--}
```
public boolean getEmbedTextures()
```


Ermittelt, ob die Textur in die endgültige Ausgabedatei eingebettet werden soll. Der FBX-Exporter versucht, die Rohdaten der Textur über [IOConfig.getFileSystem](../../com.aspose.threed/ioconfig\#getFileSystem) zu finden und die Datei in die endgültige FBX-Datei einzubetten. Der Standardwert ist false.

**Returns:**
boolean – ob die Textur in die endgültige Ausgabedatei eingebettet werden soll. Der FBX-Exporter versucht, die Rohdaten der Textur über [IOConfig.getFileSystem](../../com.aspose.threed/ioconfig\#getFileSystem) zu finden und die Datei in die endgültige FBX-Datei einzubetten. Der Standardwert ist false.
### getEnableCompression() {#getEnableCompression--}
```
public boolean getEnableCompression()
```


Komprimierung großer Binärdaten in der FBX-Datei (z. B. Animationsdaten, Kontrollpunkte, Vertex-Element-Daten, Indizes), Standardwert ist true.

**Returns:**
boolean – Komprimierung großer Binärdaten in der FBX-Datei (z. B. Animationsdaten, Kontrollpunkte, Vertex-Element-Daten, Indizes), Standardwert ist true.
### getEncoding() {#getEncoding--}
```
public Charset getEncoding()
```


Liefert die Standardkodierung für textbasierte Dateien. Der Standardwert ist null, was bedeutet, dass der Importer/Exporter entscheidet, welche Kodierung verwendet wird.

**Returns:**
java.nio.charset.Charset - die Standardkodierung für textbasierte Dateien. Der Standardwert ist null, was bedeutet, dass der Importer/Exporter entscheidet, welche Kodierung verwendet wird.
### getExportLegacyMaterialProperties() {#getExportLegacyMaterialProperties--}
```
public boolean getExportLegacyMaterialProperties()
```


Ermittelt, ob veraltete Materialeigenschaften exportiert werden, die für die Rückwärtskompatibilität verwendet werden. Diese Option ist standardmäßig aktiviert.

**Returns:**
boolean – ob veraltete Materialeigenschaften exportiert werden, die für die Rückwärtskompatibilität verwendet werden. Diese Option ist standardmäßig aktiviert.
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
### getFoldRepeatedCurveData() {#getFoldRepeatedCurveData--}
```
public Boolean getFoldRepeatedCurveData()
```


Ermittelt, ob wiederholte Kurvendaten durch Erhöhen des Referenzzählers der letzten Daten wiederverwendet werden.

**Returns:**
java.lang.Boolean – ob wiederholte Kurvendaten durch Erhöhen des Referenzzählers der letzten Daten wiederverwendet werden
### getGenerateVertexElementMaterial() {#getGenerateVertexElementMaterial--}
```
public boolean getGenerateVertexElementMaterial()
```


Ermittelt, ob stets ein [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial) für Geometrien erzeugt wird, wenn der zugehörige Knoten Materialien enthält. Diese Einstellung ist standardmäßig deaktiviert.

**Returns:**
boolean – ob stets ein [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial) für Geometrien erzeugt wird, wenn der zugehörige Knoten Materialien enthält. Diese Einstellung ist standardmäßig deaktiviert.
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
### getReusePrimitiveMesh() {#getReusePrimitiveMesh--}
```
public boolean getReusePrimitiveMesh()
```


Verwenden Sie das Mesh für Primitive mit denselben Parametern erneut, dies reduziert die Größe der FBX-Ausgabe erheblich, wenn die Szene aus einer großen Menge primitiver Formen (wie aus CAD-Dateien importiert) aufgebaut ist. Der Standardwert ist false

**Returns:**
boolean - Wiederverwenden Sie das Mesh für die Primitive mit denselben Parametern, dies reduziert die Größe der FBX-Ausgabe erheblich, wenn die Szene aus einer großen Menge primitiver Formen (wie aus CAD-Dateien importiert) aufgebaut wurde. Der Standardwert ist false
### getVideoForTexture() {#getVideoForTexture--}
```
public boolean getVideoForTexture()
```


Ermittelt, ob eine Video-Instanz für [Texture](../../com.aspose.threed/texture) beim Exportieren als FBX erzeugt wird.

**Returns:**
boolean - ob eine Video-Instanz für [Texture](../../com.aspose.threed/texture) beim Exportieren als FBX erzeugt wird.
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




### setEmbedTextures(boolean value) {#setEmbedTextures-boolean-}
```
public void setEmbedTextures(boolean value)
```


Legt fest, ob die Textur in die endgültige Ausgabedatei eingebettet wird. Der FBX-Exporter versucht, die Rohdaten der Textur aus [IOConfig.getFileSystem](../../com.aspose.threed/ioconfig\#getFileSystem) zu finden und die Datei in die endgültige FBX-Datei einzubetten. Der Standardwert ist false.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setEnableCompression(boolean value) {#setEnableCompression-boolean-}
```
public void setEnableCompression(boolean value)
```


Komprimierung großer Binärdaten in der FBX-Datei (z. B. Animationsdaten, Kontrollpunkte, Vertex-Element-Daten, Indizes), Standardwert ist true.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setEncoding(Charset value) {#setEncoding-java.nio.charset.Charset-}
```
public void setEncoding(Charset value)
```


Legt die Standardkodierung für textbasierte Dateien fest. Der Standardwert ist null, was bedeutet, dass der Importer/Exporter die zu verwendende Kodierung entscheidet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.nio.charset.Charset | Neuer Wert |

### setExportLegacyMaterialProperties(boolean value) {#setExportLegacyMaterialProperties-boolean-}
```
public void setExportLegacyMaterialProperties(boolean value)
```


Legt fest, ob veraltete Materialeigenschaften exportiert werden, die für die Rückwärtskompatibilität verwendet werden. Diese Option ist standardmäßig aktiviert.

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

### setFoldRepeatedCurveData(Boolean value) {#setFoldRepeatedCurveData-java.lang.Boolean-}
```
public void setFoldRepeatedCurveData(Boolean value)
```


Legt fest, ob wiederholte Kurvendaten durch Erhöhen des Referenzzählers der letzten Daten wiederverwendet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.Boolean | Neuer Wert |

### setGenerateVertexElementMaterial(boolean value) {#setGenerateVertexElementMaterial-boolean-}
```
public void setGenerateVertexElementMaterial(boolean value)
```


Legt fest, ob stets ein [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial) für Geometrien erzeugt wird, wenn der zugehörige Knoten Materialien enthält. Diese Einstellung ist standardmäßig deaktiviert.

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

### setReusePrimitiveMesh(boolean value) {#setReusePrimitiveMesh-boolean-}
```
public void setReusePrimitiveMesh(boolean value)
```


Verwenden Sie das Mesh für Primitive mit denselben Parametern erneut, dies reduziert die Größe der FBX-Ausgabe erheblich, wenn die Szene aus einer großen Menge primitiver Formen (wie aus CAD-Dateien importiert) aufgebaut ist. Der Standardwert ist false

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setVideoForTexture(boolean value) {#setVideoForTexture-boolean-}
```
public void setVideoForTexture(boolean value)
```


Legt fest, ob eine Video-Instanz für [Texture](../../com.aspose.threed/texture) beim Exportieren als FBX erzeugt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

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

