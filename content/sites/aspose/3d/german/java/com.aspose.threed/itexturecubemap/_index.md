---
title: ITextureCubemap
second_title: Aspose.3D für Java API-Referenz
description: Cube-Map-Textur
type: docs
weight: 255
url: /de/java/com.aspose.threed/itexturecubemap/
---

**All Implemented Interfaces:**
[com.aspose.threed.ITextureUnit](../../com.aspose.threed/itextureunit)
```
public interface ITextureCubemap extends ITextureUnit
```

Cube-Map-Textur
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [load(CubeFace face, TextureData data)](#load-com.aspose.threed.CubeFace-com.aspose.threed.TextureData-) | Lade die Daten in das angegebene Face |
| [load(CubeFaceData<TextureData> data)](#load-com.aspose.threed.CubeFaceData-com.aspose.threed.TextureData--) | Lade Texturinhalt von angegebenem [TextureData](../../com.aspose.threed/texturedata) |
| [loadFromFiles(CubeFaceData<String> fileNames)](#loadFromFiles-com.aspose.threed.CubeFaceData-java.lang.String--) | Lade Texturinhalt aus angegebenen Dateien |
| [save(CubeFace side, TextureData bitmap)](#save-com.aspose.threed.CubeFace-com.aspose.threed.TextureData-) | Speichere die angegebene Seite im Speicher |
| [save(CubeFaceData<TextureData> bitmap)](#save-com.aspose.threed.CubeFaceData-com.aspose.threed.TextureData--) | Speichere den Texturinhalt im Speicher. |
| [save(CubeFaceData<String> path, String format)](#save-com.aspose.threed.CubeFaceData-java.lang.String--java.lang.String-) | Speichere den Texturinhalt der Würfelseiten in externe Dateien. |
| [toBitmap(CubeFace side)](#toBitmap-com.aspose.threed.CubeFace-) | Konvertiere die Textureinheit in eine [TextureData](../../com.aspose.threed/texturedata)-Instanz |
### load(CubeFace face, TextureData data) {#load-com.aspose.threed.CubeFace-com.aspose.threed.TextureData-}
```
public abstract void load(CubeFace face, TextureData data)
```


Lade die Daten in das angegebene Face

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| face | [CubeFace](../../com.aspose.threed/cubeface) |  |
| data | [TextureData](../../com.aspose.threed/texturedata) |  |

### load(CubeFaceData<TextureData> data) {#load-com.aspose.threed.CubeFaceData-com.aspose.threed.TextureData--}
```
public abstract void load(CubeFaceData<TextureData> data)
```


Lade Texturinhalt von angegebenem [TextureData](../../com.aspose.threed/texturedata)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | com.aspose.threed.CubeFaceData<com.aspose.threed.TextureData> |  |

### loadFromFiles(CubeFaceData<String> fileNames) {#loadFromFiles-com.aspose.threed.CubeFaceData-java.lang.String--}
```
public abstract void loadFromFiles(CubeFaceData<String> fileNames)
```


Lade Texturinhalt aus angegebenen Dateien

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Dateinamen | com.aspose.threed.CubeFaceData<java.lang.String> |  |

### save(CubeFace side, TextureData bitmap) {#save-com.aspose.threed.CubeFace-com.aspose.threed.TextureData-}
```
public abstract void save(CubeFace side, TextureData bitmap)
```


Speichere die angegebene Seite im Speicher

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| side | [CubeFace](../../com.aspose.threed/cubeface) |  |
| bitmap | [TextureData](../../com.aspose.threed/texturedata) |  |

### save(CubeFaceData<TextureData> bitmap) {#save-com.aspose.threed.CubeFaceData-com.aspose.threed.TextureData--}
```
public abstract void save(CubeFaceData<TextureData> bitmap)
```


Speichere den Texturinhalt im Speicher.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bitmap | com.aspose.threed.CubeFaceData<com.aspose.threed.TextureData> | Ergebnis-Bitmap zum Speichern. |

### save(CubeFaceData<String> path, String format) {#save-com.aspose.threed.CubeFaceData-java.lang.String--java.lang.String-}
```
public abstract void save(CubeFaceData<String> path, String format)
```


Speichere den Texturinhalt der Würfelseiten in externe Dateien.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | com.aspose.threed.CubeFaceData<java.lang.String> | Dateinamen zum Speichern. |
| Format | java.lang.String | Bildformat |

### toBitmap(CubeFace side) {#toBitmap-com.aspose.threed.CubeFace-}
```
public abstract TextureData toBitmap(CubeFace side)
```


Konvertiere die Textureinheit in eine [TextureData](../../com.aspose.threed/texturedata)-Instanz

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| side | [CubeFace](../../com.aspose.threed/cubeface) |  |

**Returns:**
[TextureData](../../com.aspose.threed/texturedata)
