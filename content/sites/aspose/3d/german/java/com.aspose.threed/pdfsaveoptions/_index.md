---
title: PdfSaveOptions
second_title: Aspose.3D für Java API-Referenz
description: Die Speicheroptionen beim PDF‑Export.
type: docs
weight: 125
url: /de/java/com.aspose.threed/pdfsaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class PdfSaveOptions extends SaveOptions
```

Die Speicheroptionen beim PDF‑Export.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Konstruktor von [PdfSaveOptions](../../com.aspose.threed/pdfsaveoptions) |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAuxiliaryColor()](#getAuxiliaryColor--) | Ruft die Hilfsfarbe ab, die beim Rendern des 3D-Inhalts verwendet wird. |
| [getBackgroundColor()](#getBackgroundColor--) | Hintergrundfarbe der 3D-Ansicht in der PDF-Datei. |
| [getClass()](#getClass--) |  |
| [getEmbedTextures()](#getEmbedTextures--) | Betten Sie die externen Texturen in die PDF-Datei ein, der Standardwert ist false. |
| [getEncoding()](#getEncoding--) | Liefert die Standardkodierung für textbasierte Dateien. |
| [getExportTextures()](#getExportTextures--) | Versucht, im Szene verwendete Texturen in das Ausgabeverzeichnis zu kopieren. |
| [getFaceColor()](#getFaceColor--) | Ruft die Oberflächenfarbe ab, die beim Rendern des 3D-Inhalts verwendet wird. |
| [getFileFormat()](#getFileFormat--) | Liefert das Dateiformat, das in der aktuellen Speicher-/Ladeoption angegeben ist. |
| [getFileName()](#getFileName--) | Der Dateiname der exportierenden/ importierenden Szene. |
| [getFileSystem()](#getFileSystem--) | Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden. |
| [getFileSystemFactory()](#getFileSystemFactory--) | Liefert die Fabrikklasse für das Dateisystem. |
| [getFlipCoordinateSystem()](#getFlipCoordinateSystem--) | Ruft ab, ob das Koordinatensystem der Szene beim Exportieren umgekehrt wird. |
| [getLightingScheme()](#getLightingScheme--) | LightingScheme gibt die Beleuchtung an, die auf 3D‑Grafiken angewendet wird. |
| [getLookupPaths()](#getLookupPaths--) | Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen. |
| [getRenderMode()](#getRenderMode--) | Rendermodus gibt den Stil an, in dem die 3D‑Grafik gerendert wird. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAuxiliaryColor(Vector3 value)](#setAuxiliaryColor-com.aspose.threed.Vector3-) | Setzt die Hilfsfarbe, die beim Rendern des 3D-Inhalts verwendet wird. |
| [setBackgroundColor(Vector3 value)](#setBackgroundColor-com.aspose.threed.Vector3-) | Hintergrundfarbe der 3D-Ansicht in der PDF-Datei. |
| [setEmbedTextures(boolean value)](#setEmbedTextures-boolean-) | Betten Sie die externen Texturen in die PDF-Datei ein, der Standardwert ist false. |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Setzt die Standardkodierung für textbasierte Dateien. |
| [setExportTextures(boolean value)](#setExportTextures-boolean-) | Versucht, im Szene verwendete Texturen in das Ausgabeverzeichnis zu kopieren. |
| [setFaceColor(Vector3 value)](#setFaceColor-com.aspose.threed.Vector3-) | Setzt die Oberflächenfarbe, die beim Rendern des 3D-Inhalts verwendet wird. |
| [setFileName(String value)](#setFileName-java.lang.String-) | Der Dateiname der exportierenden/ importierenden Szene. |
| [setFileSystem(FileSystem value)](#setFileSystem-com.aspose.threed.FileSystem-) | Erlaubt dem Benutzer zu bestimmen, wie externe Abhängigkeiten beim Laden/Speichern verwaltet werden. |
| [setFileSystemFactory(FileSystemFactory value)](#setFileSystemFactory-com.aspose.threed.FileSystemFactory-) | Setzt die Fabrikklasse für das Dateisystem. |
| [setFlipCoordinateSystem(boolean value)](#setFlipCoordinateSystem-boolean-) | Setzt, ob das Koordinatensystem der Szene beim Exportieren umgekehrt wird. |
| [setLightingScheme(PdfLightingScheme value)](#setLightingScheme-com.aspose.threed.PdfLightingScheme-) | LightingScheme gibt die Beleuchtung an, die auf 3D‑Grafiken angewendet wird. |
| [setLookupPaths(ArrayList<String> value)](#setLookupPaths-java.util.ArrayList-java.lang.String--) | Einige Dateien wie OBJ hängen von externen Dateien ab, die Suchpfade ermöglichen es Aspose.3D, nach externen Dateien zum Laden zu suchen. |
| [setRenderMode(PdfRenderMode value)](#setRenderMode-com.aspose.threed.PdfRenderMode-) | Rendermodus gibt den Stil an, in dem die 3D‑Grafik gerendert wird. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


Konstruktor von [PdfSaveOptions](../../com.aspose.threed/pdfsaveoptions)

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
### getAuxiliaryColor() {#getAuxiliaryColor--}
```
public Vector3 getAuxiliaryColor()
```


Ruft die Hilfsfarbe ab, die beim Rendern des 3D-Inhalts verwendet wird. Die Interpretation dieser Farbe hängt von [getRenderMode](../../com.aspose.threed/pdfsaveoptions\#getRenderMode) ab.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the auxiliary color to be used when rendering the 3D content. The interpretation of this color depends on the [getRenderMode](../../com.aspose.threed/pdfsaveoptions\#getRenderMode)
### getBackgroundColor() {#getBackgroundColor--}
```
public Vector3 getBackgroundColor()
```


Hintergrundfarbe der 3D-Ansicht in der PDF-Datei.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Background color of the 3D view in PDF file.
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


Betten Sie die externen Texturen in die PDF-Datei ein, der Standardwert ist false.

**Returns:**
boolean - Betten Sie die externen Texturen in die PDF-Datei ein, der Standardwert ist false.
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
### getFaceColor() {#getFaceColor--}
```
public Vector3 getFaceColor()
```


Ruft die Oberflächenfarbe ab, die beim Rendern des 3D-Inhalts verwendet wird. Dies ist nur relevant, wenn [getRenderMode](../../com.aspose.threed/pdfsaveoptions\#getRenderMode) den Wert Illustration hat.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the face color to be used when rendering the 3D content. This is only relevant only when the [getRenderMode](../../com.aspose.threed/pdfsaveoptions\#getRenderMode) has a value of Illustration.
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


Ruft ab, ob das Koordinatensystem der Szene beim Exportieren umgekehrt wird.

**Returns:**
boolean - um das Koordinatensystem der Szene beim Exportieren umzukehren.
### getLightingScheme() {#getLightingScheme--}
```
public PdfLightingScheme getLightingScheme()
```


LightingScheme gibt die Beleuchtung an, die auf 3D‑Grafiken angewendet wird.

**Returns:**
[PdfLightingScheme](../../com.aspose.threed/pdflightingscheme) - LightingScheme specifies the lighting to apply to 3D artwork.
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
### getRenderMode() {#getRenderMode--}
```
public PdfRenderMode getRenderMode()
```


Rendermodus gibt den Stil an, in dem die 3D‑Grafik gerendert wird.

**Returns:**
[PdfRenderMode](../../com.aspose.threed/pdfrendermode) - Render mode specifies the style in which the 3D artwork is rendered.
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




### setAuxiliaryColor(Vector3 value) {#setAuxiliaryColor-com.aspose.threed.Vector3-}
```
public void setAuxiliaryColor(Vector3 value)
```


Setzt die Hilfsfarbe, die beim Rendern des 3D-Inhalts verwendet wird. Die Interpretation dieser Farbe hängt von [getRenderMode](../../com.aspose.threed/pdfsaveoptions\#getRenderMode) ab.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setBackgroundColor(Vector3 value) {#setBackgroundColor-com.aspose.threed.Vector3-}
```
public void setBackgroundColor(Vector3 value)
```


Hintergrundfarbe der 3D-Ansicht in der PDF-Datei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setEmbedTextures(boolean value) {#setEmbedTextures-boolean-}
```
public void setEmbedTextures(boolean value)
```


Betten Sie die externen Texturen in die PDF-Datei ein, der Standardwert ist false.

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

### setFaceColor(Vector3 value) {#setFaceColor-com.aspose.threed.Vector3-}
```
public void setFaceColor(Vector3 value)
```


Setzt die Oberflächenfarbe, die beim Rendern des 3D-Inhalts verwendet wird. Dies ist nur relevant, wenn [getRenderMode](../../com.aspose.threed/pdfsaveoptions\#getRenderMode) den Wert Illustration hat.

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

### setFlipCoordinateSystem(boolean value) {#setFlipCoordinateSystem-boolean-}
```
public void setFlipCoordinateSystem(boolean value)
```


Setzt, ob das Koordinatensystem der Szene beim Exportieren umgekehrt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setLightingScheme(PdfLightingScheme value) {#setLightingScheme-com.aspose.threed.PdfLightingScheme-}
```
public void setLightingScheme(PdfLightingScheme value)
```


LightingScheme gibt die Beleuchtung an, die auf 3D‑Grafiken angewendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [PdfLightingScheme](../../com.aspose.threed/pdflightingscheme) | Neuer Wert |

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

### setRenderMode(PdfRenderMode value) {#setRenderMode-com.aspose.threed.PdfRenderMode-}
```
public void setRenderMode(PdfRenderMode value)
```


Rendermodus gibt den Stil an, in dem die 3D‑Grafik gerendert wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [PdfRenderMode](../../com.aspose.threed/pdfrendermode) | Neuer Wert |

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

