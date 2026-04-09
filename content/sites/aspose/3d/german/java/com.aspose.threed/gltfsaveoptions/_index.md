---
title: GltfSaveOptions
second_title: Aspose.3D für Java API-Referenz
description: Speicheroptionen für das glTF-Format.
type: docs
weight: 74
url: /de/java/com.aspose.threed/gltfsaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class GltfSaveOptions extends SaveOptions
```

Speicheroptionen für das glTF-Format.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [GltfSaveOptions(FileContentType contentType)](#GltfSaveOptions-com.aspose.threed.FileContentType-) | Konstruktor von [GltfSaveOptions](../../com.aspose.threed/gltfsaveoptions) |
| [GltfSaveOptions(FileFormat format)](#GltfSaveOptions-com.aspose.threed.FileFormat-) | Konstruktor von [GltfSaveOptions](../../com.aspose.threed/gltfsaveoptions) |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getApplyUnitScale()](#getApplyUnitScale--) | Wenden Sie [AssetInfo.getUnitScaleFactor](../../com.aspose.threed/assetinfo\#getUnitScaleFactor) auf das Mesh an. |
| [getBufferFile()](#getBufferFile--) | Der Dateiname der externen Pufferdatei, die zum Speichern binärer Daten verwendet wird. |
| [getClass()](#getClass--) |  |
| [getDracoCompression()](#getDracoCompression--) | Ermittelt, ob draco-Komprimierung aktiviert werden soll |
| [getEmbedAssets()](#getEmbedAssets--) | Betten Sie alle externen Assets als Base64 in eine einzelne Datei im ASCII‑Modus ein, der Standardwert ist false. |
| [getEncoding()](#getEncoding--) | Liefert die Standardkodierung für textbasierte Dateien. |
| [getExportTextures()](#getExportTextures--) | Versucht, im Szene verwendete Texturen in das Ausgabeverzeichnis zu kopieren. |
| [getExternalDracoEncoder()](#getExternalDracoEncoder--) | Verwenden Sie einen externen draco‑Encoder, um die draco‑Komprimierungsgeschwindigkeit zu beschleunigen. |
| [getFallbackNormal()](#getFallbackNormal--) | Wenn der GLTF2‑Exporter einen ungültigen Normalvektor erkennt, wird dies anstelle des ursprünglichen Werts verwendet, um die Validierung zu umgehen. |
| [getFileFormat()](#getFileFormat--) | Liefert das Dateiformat, das in der aktuellen Speicher-/Ladeoption angegeben ist. |
| [getFileName()](#getFileName--) | Der Dateiname der exportierenden/ importierenden Szene. |
| [getFileSystem()](#getFileSystem--) | Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden. |
| [getFileSystemFactory()](#getFileSystemFactory--) | Liefert die Fabrikklasse für das Dateisystem. |
| [getFlipTexCoordV()](#getFlipTexCoordV--) | Vertauschen Sie die v(t)-Komponente der Texturkoordinate, der Standardwert ist true. |
| [getImageFormat()](#getImageFormat--) | Standard‑glTF unterstützt nur PNG/JPG als Texturformat; diese Option legt fest, wie Aspose.3D nicht‑standardmäßige Bilder während des Exports in ein unterstütztes Format konvertiert. |
| [getLookupPaths()](#getLookupPaths--) | Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen. |
| [getMaterialConverter()](#getMaterialConverter--) | Benutzerdefinierter Konverter, um das Material der Geometrie in ein PBR‑Material zu konvertieren. Wenn dies nicht zugewiesen ist, konvertiert der glTF 2.0‑Exporter das Standardmaterial automatisch in ein PBR‑Material. |
| [getPrettyPrint()](#getPrettyPrint--) | Der JSON‑Inhalt der GLTF‑Datei ist für die Lesbarkeit durch Menschen eingerückt, Standardwert ist false |
| [getSaveExtras()](#getSaveExtras--) | Speichere die dynamischen Eigenschaften des Szenenobjekts in den 'extra'-Feldern der erzeugten glTF‑Datei. |
| [getUseCommonMaterials()](#getUseCommonMaterials--) | Serialisiere Materialien mithilfe der KHR‑gemeinsamen Materialerweiterungen, Standardwert ist false. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setApplyUnitScale(boolean value)](#setApplyUnitScale-boolean-) | Wenden Sie [AssetInfo.getUnitScaleFactor](../../com.aspose.threed/assetinfo\#getUnitScaleFactor) auf das Mesh an. |
| [setBufferFile(String value)](#setBufferFile-java.lang.String-) | Der Dateiname der externen Pufferdatei, die zum Speichern binärer Daten verwendet wird. |
| [setDracoCompression(boolean value)](#setDracoCompression-boolean-) | Legt fest, ob die Draco‑Kompression aktiviert werden soll. |
| [setEmbedAssets(boolean value)](#setEmbedAssets-boolean-) | Betten Sie alle externen Assets als Base64 in eine einzelne Datei im ASCII‑Modus ein, der Standardwert ist false. |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Setzt die Standardkodierung für textbasierte Dateien. |
| [setExportTextures(boolean value)](#setExportTextures-boolean-) | Versucht, im Szene verwendete Texturen in das Ausgabeverzeichnis zu kopieren. |
| [setExternalDracoEncoder(String value)](#setExternalDracoEncoder-java.lang.String-) | Verwenden Sie einen externen draco‑Encoder, um die draco‑Komprimierungsgeschwindigkeit zu beschleunigen. |
| [setFallbackNormal(Vector3 value)](#setFallbackNormal-com.aspose.threed.Vector3-) | Wenn der GLTF2‑Exporter einen ungültigen Normalvektor erkennt, wird dies anstelle des ursprünglichen Werts verwendet, um die Validierung zu umgehen. |
| [setFileName(String value)](#setFileName-java.lang.String-) | Der Dateiname der exportierenden/ importierenden Szene. |
| [setFileSystem(FileSystem value)](#setFileSystem-com.aspose.threed.FileSystem-) | Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden. |
| [setFileSystemFactory(FileSystemFactory value)](#setFileSystemFactory-com.aspose.threed.FileSystemFactory-) | Setzt die Fabrikklasse für das Dateisystem. |
| [setFlipTexCoordV(boolean value)](#setFlipTexCoordV-boolean-) | Vertauschen Sie die v(t)-Komponente der Texturkoordinate, der Standardwert ist true. |
| [setImageFormat(GltfEmbeddedImageFormat value)](#setImageFormat-com.aspose.threed.GltfEmbeddedImageFormat-) | Standard‑glTF unterstützt nur PNG/JPG als Texturformat; diese Option legt fest, wie Aspose.3D nicht‑standardmäßige Bilder während des Exports in ein unterstütztes Format konvertiert. |
| [setLookupPaths(ArrayList<String> value)](#setLookupPaths-java.util.ArrayList-java.lang.String--) | Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen. |
| [setMaterialConverter(MaterialConverter value)](#setMaterialConverter-com.aspose.threed.MaterialConverter-) | Benutzerdefinierter Konverter, um das Material der Geometrie in ein PBR‑Material zu konvertieren. Wenn dies nicht zugewiesen ist, konvertiert der glTF 2.0‑Exporter das Standardmaterial automatisch in ein PBR‑Material. |
| [setPrettyPrint(boolean value)](#setPrettyPrint-boolean-) | Der JSON‑Inhalt der GLTF‑Datei ist für die Lesbarkeit durch Menschen eingerückt, Standardwert ist false |
| [setSaveExtras(boolean value)](#setSaveExtras-boolean-) | Speichere die dynamischen Eigenschaften des Szenenobjekts in den 'extra'-Feldern der erzeugten glTF‑Datei. |
| [setUseCommonMaterials(boolean value)](#setUseCommonMaterials-boolean-) | Serialisiere Materialien mithilfe der KHR‑gemeinsamen Materialerweiterungen, Standardwert ist false. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### GltfSaveOptions(FileContentType contentType) {#GltfSaveOptions-com.aspose.threed.FileContentType-}
```
public GltfSaveOptions(FileContentType contentType)
```


Konstruktor von [GltfSaveOptions](../../com.aspose.threed/gltfsaveoptions)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| contentType | [FileContentType](../../com.aspose.threed/filecontenttype) |  |

### GltfSaveOptions(FileFormat format) {#GltfSaveOptions-com.aspose.threed.FileFormat-}
```
public GltfSaveOptions(FileFormat format)
```


Konstruktor von [GltfSaveOptions](../../com.aspose.threed/gltfsaveoptions)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| format | [FileFormat](../../com.aspose.threed/fileformat) |  |

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
### getBufferFile() {#getBufferFile--}
```
public String getBufferFile()
```


Der Dateiname der externen Pufferdatei, die zum Speichern binärer Daten verwendet wird. Wenn diese Datei nicht angegeben wird, erzeugt Aspose.3D einen Namen für Sie. Dies wird ignoriert, wenn glTF im Binärmodus exportiert wird.

**Returns:**
java.lang.String – Der Dateiname der externen Pufferdatei, die zum Speichern binärer Daten verwendet wird. Wenn diese Datei nicht angegeben wird, erzeugt Aspose.3D einen Namen für Sie. Dies wird ignoriert, wenn glTF im Binärmodus exportiert wird.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDracoCompression() {#getDracoCompression--}
```
public boolean getDracoCompression()
```


Ermittelt, ob draco-Komprimierung aktiviert werden soll

**Returns:**
boolean – ob die Draco‑Kompression aktiviert werden soll
### getEmbedAssets() {#getEmbedAssets--}
```
public boolean getEmbedAssets()
```


Betten Sie alle externen Assets als Base64 in eine einzelne Datei im ASCII‑Modus ein, der Standardwert ist false.

**Returns:**
boolean – Betten Sie alle externen Assets im ASCII‑Modus als Base64 in eine einzelne Datei ein, Standardwert ist false.
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
### getExternalDracoEncoder() {#getExternalDracoEncoder--}
```
public String getExternalDracoEncoder()
```


Verwenden Sie einen externen draco‑Encoder, um die draco‑Komprimierungsgeschwindigkeit zu beschleunigen.

**Returns:**
java.lang.String – Verwenden Sie einen externen Draco‑Encoder, um die Komprimierungsgeschwindigkeit zu beschleunigen. **Hinweise:** Aspose.3D erstellt einen neuen Unterprozess, um das Mesh in das Draco‑Format zu kodieren; verwenden Sie ihn auf eigenes Risiko.
### getFallbackNormal() {#getFallbackNormal--}
```
public Vector3 getFallbackNormal()
```


Wenn der GLTF2‑Exporter eine ungültige Normale erkennt, wird dieser Wert anstelle des ursprünglichen Wertes verwendet, um die Validierung zu umgehen. Standardwert ist (0, 1, 0).

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - When GLTF2 exporter detected an invalid normal, this will be used instead of its original value to bypass the validation. Default value is (0, 1, 0)
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
### getFlipTexCoordV() {#getFlipTexCoordV--}
```
public boolean getFlipTexCoordV()
```


Vertauschen Sie die v(t)-Komponente der Texturkoordinate, der Standardwert ist true.

**Returns:**
boolean – Vertausche die v(t)-Komponente der Texturkoordinate, Standardwert ist true.
### getImageFormat() {#getImageFormat--}
```
public GltfEmbeddedImageFormat getImageFormat()
```


Standard‑glTF unterstützt nur PNG/JPG als Texturformat; diese Option legt fest, wie Aspose.3D nicht‑standardmäßige Bilder während des Exports in ein unterstütztes Format konvertiert. Standardwert ist [GltfEmbeddedImageFormat.PNG](../../com.aspose.threed/gltfembeddedimageformat\#PNG)

**Returns:**
[GltfEmbeddedImageFormat](../../com.aspose.threed/gltfembeddedimageformat) - Standard glTF only supports PNG/JPG as its texture format, this option will guide how Aspose.3D convert the non-standard images to supported format during the exporting. Default value is [GltfEmbeddedImageFormat.PNG](../../com.aspose.threed/gltfembeddedimageformat\#PNG)
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
### getMaterialConverter() {#getMaterialConverter--}
```
public MaterialConverter getMaterialConverter()
```


Benutzerdefinierter Konverter, um das Material der Geometrie in ein PBR‑Material zu konvertieren. Wenn dies nicht zugewiesen ist, konvertiert der glTF 2.0‑Exporter das Standardmaterial automatisch in ein PBR‑Material. Standardwert ist null. Diese Eigenschaft wird beim Export einer Szene in eine glTF 2.0‑Datei verwendet.

**Returns:**
[MaterialConverter](../../com.aspose.threed/materialconverter) - Custom converter to convert the geometry's material to PBR material If this is unassigned, glTF 2.0 exporter will automatically convert the standard material to PBR material. Default value is null This property is used when exporting a scene to a glTF 2.0 file.
### getPrettyPrint() {#getPrettyPrint--}
```
public boolean getPrettyPrint()
```


Der JSON‑Inhalt der GLTF‑Datei ist für die Lesbarkeit durch Menschen eingerückt, Standardwert ist false

**Returns:**
boolean – Der JSON‑Inhalt der GLTF‑Datei ist für die Lesbarkeit durch Menschen eingerückt, Standardwert ist false.
### getSaveExtras() {#getSaveExtras--}
```
public boolean getSaveExtras()
```


Speichere die dynamischen Eigenschaften des Szenenobjekts in den 'extra'-Feldern der erzeugten glTF‑Datei. Dies ist nützlich, um anwendungsspezifische Daten bereitzustellen. Standardwert ist false.

**Returns:**
boolean – Speichere die dynamischen Eigenschaften des Szenenobjekts in den 'extra'-Feldern der erzeugten glTF‑Datei. Dies ist nützlich, um anwendungsspezifische Daten bereitzustellen. Standardwert ist false.
### getUseCommonMaterials() {#getUseCommonMaterials--}
```
public boolean getUseCommonMaterials()
```


Serialisiere Materialien mithilfe der KHR‑gemeinsamen Materialerweiterungen, Standardwert ist false. Setzt man dies auf false, exportiert Aspose.3D ein Satz von Vertex‑/Fragment‑Shadern, wenn [getExportShaders](../../com.aspose.threed/gltfsaveoptions\#getExportShaders) aktiviert ist.

**Returns:**
boolean – Serialisiere Materialien mithilfe der KHR‑gemeinsamen Materialerweiterungen, Standardwert ist false. Setzt man dies auf false, exportiert Aspose.3D ein Satz von Vertex‑/Fragment‑Shadern, wenn [getExportShaders](../../com.aspose.threed/gltfsaveoptions\#getExportShaders) aktiviert ist. **Hinweise:** Diese Eigenschaft funktioniert nur für glTF 1.0.
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

### setBufferFile(String value) {#setBufferFile-java.lang.String-}
```
public void setBufferFile(String value)
```


Der Dateiname der externen Pufferdatei, die zum Speichern binärer Daten verwendet wird. Wenn diese Datei nicht angegeben wird, erzeugt Aspose.3D einen Namen für Sie. Dies wird ignoriert, wenn glTF im Binärmodus exportiert wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setDracoCompression(boolean value) {#setDracoCompression-boolean-}
```
public void setDracoCompression(boolean value)
```


Legt fest, ob die Draco‑Kompression aktiviert werden soll.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setEmbedAssets(boolean value) {#setEmbedAssets-boolean-}
```
public void setEmbedAssets(boolean value)
```


Betten Sie alle externen Assets als Base64 in eine einzelne Datei im ASCII‑Modus ein, der Standardwert ist false.

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

### setExportTextures(boolean value) {#setExportTextures-boolean-}
```
public void setExportTextures(boolean value)
```


Versucht, im Szene verwendete Texturen in das Ausgabeverzeichnis zu kopieren.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setExternalDracoEncoder(String value) {#setExternalDracoEncoder-java.lang.String-}
```
public void setExternalDracoEncoder(String value)
```


Verwenden Sie einen externen draco‑Encoder, um die draco‑Komprimierungsgeschwindigkeit zu beschleunigen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert **Hinweise:** Aspose.3D erstellt einen neuen Unterprozess, um das Mesh in das Draco‑Format zu kodieren; verwenden Sie ihn auf eigenes Risiko. |

### setFallbackNormal(Vector3 value) {#setFallbackNormal-com.aspose.threed.Vector3-}
```
public void setFallbackNormal(Vector3 value)
```


Wenn der GLTF2‑Exporter eine ungültige Normale erkennt, wird dieser Wert anstelle des ursprünglichen Wertes verwendet, um die Validierung zu umgehen. Standardwert ist (0, 1, 0).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

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

### setFlipTexCoordV(boolean value) {#setFlipTexCoordV-boolean-}
```
public void setFlipTexCoordV(boolean value)
```


Vertauschen Sie die v(t)-Komponente der Texturkoordinate, der Standardwert ist true.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setImageFormat(GltfEmbeddedImageFormat value) {#setImageFormat-com.aspose.threed.GltfEmbeddedImageFormat-}
```
public void setImageFormat(GltfEmbeddedImageFormat value)
```


Standard‑glTF unterstützt nur PNG/JPG als Texturformat; diese Option legt fest, wie Aspose.3D nicht‑standardmäßige Bilder während des Exports in ein unterstütztes Format konvertiert. Standardwert ist [GltfEmbeddedImageFormat.PNG](../../com.aspose.threed/gltfembeddedimageformat\#PNG)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [GltfEmbeddedImageFormat](../../com.aspose.threed/gltfembeddedimageformat) | Neuer Wert |

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

### setMaterialConverter(MaterialConverter value) {#setMaterialConverter-com.aspose.threed.MaterialConverter-}
```
public void setMaterialConverter(MaterialConverter value)
```


Benutzerdefinierter Konverter, um das Material der Geometrie in ein PBR‑Material zu konvertieren. Wenn dies nicht zugewiesen ist, konvertiert der glTF 2.0‑Exporter das Standardmaterial automatisch in ein PBR‑Material. Standardwert ist null. Diese Eigenschaft wird beim Export einer Szene in eine glTF 2.0‑Datei verwendet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [MaterialConverter](../../com.aspose.threed/materialconverter) | Neuer Wert |

### setPrettyPrint(boolean value) {#setPrettyPrint-boolean-}
```
public void setPrettyPrint(boolean value)
```


Der JSON‑Inhalt der GLTF‑Datei ist für die Lesbarkeit durch Menschen eingerückt, Standardwert ist false

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setSaveExtras(boolean value) {#setSaveExtras-boolean-}
```
public void setSaveExtras(boolean value)
```


Speichere die dynamischen Eigenschaften des Szenenobjekts in den 'extra'-Feldern der erzeugten glTF‑Datei. Dies ist nützlich, um anwendungsspezifische Daten bereitzustellen. Standardwert ist false.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setUseCommonMaterials(boolean value) {#setUseCommonMaterials-boolean-}
```
public void setUseCommonMaterials(boolean value)
```


Serialisiere Materialien mithilfe der KHR‑gemeinsamen Materialerweiterungen, Standardwert ist false. Setzt man dies auf false, exportiert Aspose.3D ein Satz von Vertex‑/Fragment‑Shadern, wenn [getExportShaders](../../com.aspose.threed/gltfsaveoptions\#getExportShaders) aktiviert ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert **Hinweise:** Diese Eigenschaft funktioniert nur für glTF 1.0. |

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

