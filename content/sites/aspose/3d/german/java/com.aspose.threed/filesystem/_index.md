---
title: FileSystem
second_title: Aspose.3D für Java API-Referenz
description: Dateisystemkapselung.
type: docs
weight: 67
url: /de/java/com.aspose.threed/filesystem/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.io.Closeable
```
public abstract class FileSystem implements Closeable
```

Dateisystemkapselung. Aspose.3D wird dies verwenden, um Abhängigkeiten zu lesen/zu schreiben. **Example:** Der folgende Code zeigt, wie man eine Datei importiert und abhängige Dateien in einem angegebenen Verzeichnis bereitstellt.

```
var inputFile = "input.fbx";
     var format = FileFormat.detect(inputFile);
     //create a load options instance and specify a zip file system
     var opt = format.createLoadOptions();
     opt.setFileSystem(new LocalFileSystem("textures/"));
     //load the file
     var scene = Scene.fromFile(inputFile, opt);
```
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [FileSystem()](#FileSystem--) |  |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [close()](#close--) | Entsorgen Sie das Dateisystem und geben Sie dessen Ressourcen frei. |
| [createDummyFileSystem()](#createDummyFileSystem--) | Erstelle ein Dummy-Dateisystem, Lese-/Schreibvorgänge sind Dummy-Operationen. |
| [createLocalFileSystem(String directory)](#createLocalFileSystem-java.lang.String-) | Initialisiere ein neues [FileSystem](../../com.aspose.threed/filesystem), das nur auf das lokale Verzeichnis zugreift. |
| [createMemoryFileSystem()](#createMemoryFileSystem--) | Erstelle ein speicherbasiertes Dateisystem, das die Lese-/Schreibvorgänge in den Speicher abbildet. |
| [createMemoryFileSystem(HashMap<String,MemoryStream> files)](#createMemoryFileSystem-java.util.HashMap-java.lang.String-com.aspose.threed.MemoryStream--) | Erstelle ein speicherbasiertes Dateisystem, das die Lese-/Schreibvorgänge in den Speicher abbildet. |
| [createZipFileSystem(Stream stream)](#createZipFileSystem-com.aspose.threed.Stream-) | Erstelle ein Dateisystem, das nur Lesezugriff auf die angegebene ZIP-Datei oder den ZIP-Stream ermöglicht. |
| [createZipFileSystem(Stream stream, String baseDir)](#createZipFileSystem-com.aspose.threed.Stream-java.lang.String-) | Erstelle ein Dateisystem, das nur Lesezugriff auf die angegebene ZIP-Datei oder den ZIP-Stream ermöglicht. |
| [createZipFileSystem(String fileName)](#createZipFileSystem-java.lang.String-) | Dateisystem, das einen schreibgeschützten Zugriff auf die angegebene ZIP-Datei oder den ZIP-Stream ermöglicht. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [readFile(String fileName, IOConfig options)](#readFile-java.lang.String-com.aspose.threed.IOConfig-) | Erstellen Sie einen Stream zum Lesen von Abhängigkeiten. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeFile(String fileName, IOConfig options)](#writeFile-java.lang.String-com.aspose.threed.IOConfig-) | Erstellen Sie einen Stream zum Schreiben von Abhängigkeiten. |
### FileSystem() {#FileSystem--}
```
public FileSystem()
```


### close() {#close--}
```
public void close()
```


Entsorgen Sie das Dateisystem und geben Sie dessen Ressourcen frei.

### createDummyFileSystem() {#createDummyFileSystem--}
```
public static FileSystem createDummyFileSystem()
```


Erstelle ein Dummy-Dateisystem, Lese-/Schreibvorgänge sind Dummy-Operationen.

**Returns:**
[FileSystem](../../com.aspose.threed/filesystem) - A dummy file system **Example:** The following code shows how to export file to memory, and ignore all dependent file generation.

```
//create a scene with material
     Scene scene = new Scene();
     scene.getRootNode().createChildNode(new Box()).setMaterial(new LambertMaterial());
     //create a save option and specify the file system, so the dependent file will be written to memory
     var opt = FileFormat.WAVEFRONTOBJ.createSaveOptions();
     var dfs = FileSystem.CreateDummyFileSystem();
     opt.setFileSystem(dfs);
     //obj's material file name is associated with the obj's file name, so we need a explicit name.
     opt.setFileName("test.obj");
     try (var ms = new MemoryStream())
     {
         scene.save(ms, opt);
     }
```
### createLocalFileSystem(String directory) {#createLocalFileSystem-java.lang.String-}
```
public static FileSystem createLocalFileSystem(String directory)
```


Initialisiere ein neues [FileSystem](../../com.aspose.threed/filesystem), das nur auf das lokale Verzeichnis zugreift. Alle Lese-/Schreibvorgänge auf dieser FileSystem-Instanz werden auf das angegebene Verzeichnis abgebildet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Verzeichnis | java.lang.String | Das Verzeichnis in Ihrem physischen Dateisystem als virtuelles Stammverzeichnis. |

**Returns:**
[FileSystem](../../com.aspose.threed/filesystem) - A new instance of file system to provide local file access
### createMemoryFileSystem() {#createMemoryFileSystem--}
```
public static FileSystem createMemoryFileSystem()
```


Erstelle ein speicherbasiertes Dateisystem, das die Lese-/Schreibvorgänge in den Speicher abbildet.

**Returns:**
[FileSystem](../../com.aspose.threed/filesystem) - A memory-based file system **Example:** The following code shows how to export file to memory, includes the dependent file by using MemoryFileSystem.

```
//create a scene with material
     Scene scene = new Scene();
     scene.getRootNode().createChildNode(new Box()).setMaterial(new LambertMaterial());
     //create a save option and specify the file system, so the dependent file will be written to memory
     var opt = FileFormat.WAVEFRONTOBJ.createSaveOptions();
     var mfs = new HashMap<String, MemoryStream>();
     opt.setFileSystem(FileSystem.createMemoryFileSystem(mfs));
     //obj's material file name is associated with the obj's file name, so we need a explicit name.
     opt.setFileName("test.obj");
     try (var ms = new MemoryStream())
     {
         scene.save(ms, opt);
     }
     //the test.obj was written to variable ms, and we can also get the test.mtl file content by
     var materialFile = mfs.get("test.mtl");
```
### createMemoryFileSystem(HashMap<String,MemoryStream> files) {#createMemoryFileSystem-java.util.HashMap-java.lang.String-com.aspose.threed.MemoryStream--}
```
public static FileSystem createMemoryFileSystem(HashMap<String,MemoryStream> files)
```


Erstelle ein speicherbasiertes Dateisystem, das die Lese-/Schreibvorgänge in den Speicher abbildet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Dateien | java.util.HashMap<java.lang.String,com.aspose.threed.MemoryStream> | Dies ermöglicht das Lesen/Schreiben der virtuellen Dateien. |

**Returns:**
[FileSystem](../../com.aspose.threed/filesystem) - A memory-based file system **Example:** The following code shows how to export file to memory, includes the dependent file by using MemoryFileSystem.

```
//create a scene with material
     Scene scene = new Scene();
     scene.getRootNode().createChildNode(new Box()).setMaterial(new LambertMaterial());
     //create a save option and specify the file system, so the dependent file will be written to memory
     var opt = FileFormat.WAVEFRONTOBJ.createSaveOptions();
     var mfs = new HashMap<String, MemoryStream>();
     opt.setFileSystem(FileSystem.createMemoryFileSystem(mfs));
     //obj's material file name is associated with the obj's file name, so we need a explicit name.
     opt.setFileName("test.obj");
     try (var ms = new MemoryStream())
     {
         scene.save(ms, opt);
     }
     //the test.obj was written to variable ms, and we can also get the test.mtl file content by
     var materialFile = mfs.get("test.mtl");
```
### createZipFileSystem(Stream stream) {#createZipFileSystem-com.aspose.threed.Stream-}
```
public static FileSystem createZipFileSystem(Stream stream)
```


Erstelle ein Dateisystem, das nur Lesezugriff auf die angegebene ZIP-Datei oder den ZIP-Stream ermöglicht. Das Dateisystem wird nach dem Öffnen/Speichern freigegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Der Stream zum Zugriff auf die ZIP-Datei |

**Returns:**
[FileSystem](../../com.aspose.threed/filesystem) - A zip file system
### createZipFileSystem(Stream stream, String baseDir) {#createZipFileSystem-com.aspose.threed.Stream-java.lang.String-}
```
public static FileSystem createZipFileSystem(Stream stream, String baseDir)
```


Erstelle ein Dateisystem, das nur Lesezugriff auf die angegebene ZIP-Datei oder den ZIP-Stream ermöglicht. Das Dateisystem wird nach dem Öffnen/Speichern freigegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Der Stream zum Zugriff auf die ZIP-Datei |
| baseDir | java.lang.String | Das Basisverzeichnis innerhalb der ZIP-Datei. |

**Returns:**
[FileSystem](../../com.aspose.threed/filesystem) - A zip file system
### createZipFileSystem(String fileName) {#createZipFileSystem-java.lang.String-}
```
public static FileSystem createZipFileSystem(String fileName)
```


Dateisystem, das nur Lesezugriff auf die angegebene ZIP-Datei oder den ZIP-Stream ermöglicht. Das Dateisystem wird nach dem Öffnen/Speichern freigegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname der ZIP-Datei. |

**Returns:**
[FileSystem](../../com.aspose.threed/filesystem) - A zip file system
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




### readFile(String fileName, IOConfig options) {#readFile-java.lang.String-com.aspose.threed.IOConfig-}
```
public abstract Stream readFile(String fileName, IOConfig options)
```


Erstellen Sie einen Stream zum Lesen von Abhängigkeiten.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Dateiname zum Öffnen zum Lesen |
| options | [IOConfig](../../com.aspose.threed/ioconfig) | Speicher- oder Ladeoptionen |

**Returns:**
[Stream](../../com.aspose.threed/stream) - Stream for reading the file.
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

### writeFile(String fileName, IOConfig options) {#writeFile-java.lang.String-com.aspose.threed.IOConfig-}
```
public abstract Stream writeFile(String fileName, IOConfig options)
```


Erstellen Sie einen Stream zum Schreiben von Abhängigkeiten.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Der Dateiname zum Öffnen zum Schreiben |
| options | [IOConfig](../../com.aspose.threed/ioconfig) | Speicher- oder Ladeoptionen |

**Returns:**
[Stream](../../com.aspose.threed/stream) - Stream for writing the file
