---
title: ITexture1D
second_title: Aspose.3D für Java API-Referenz
description: 1D-Textur
type: docs
weight: 252
url: /de/java/com.aspose.threed/itexture1d/
---

**All Implemented Interfaces:**
[com.aspose.threed.ITextureUnit](../../com.aspose.threed/itextureunit)
```
public interface ITexture1D extends ITextureUnit
```

1D-Textur
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [load(TextureData bitmap)](#load-com.aspose.threed.TextureData-) | Lade Texturinhalt aus dem angegebenen Bitmap |
| [save(TextureData bitmap)](#save-com.aspose.threed.TextureData-) | Speichere den Texturinhalt in eine externe Datei. |
| [save(String path, String format)](#save-java.lang.String-java.lang.String-) | Speichere den Texturinhalt in eine externe Datei. |
| [toBitmap()](#toBitmap--) | Konvertiere die Textureinheit in eine [TextureData](../../com.aspose.threed/texturedata)-Instanz |
### load(TextureData bitmap) {#load-com.aspose.threed.TextureData-}
```
public abstract void load(TextureData bitmap)
```


Lade Texturinhalt aus dem angegebenen Bitmap

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| bitmap | [TextureData](../../com.aspose.threed/texturedata) |  |

### save(TextureData bitmap) {#save-com.aspose.threed.TextureData-}
```
public abstract void save(TextureData bitmap)
```


Speichere den Texturinhalt in eine externe Datei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| bitmap | [TextureData](../../com.aspose.threed/texturedata) | Ergebnis-Bitmap zum Speichern. |

### save(String path, String format) {#save-java.lang.String-java.lang.String-}
```
public abstract void save(String path, String format)
```


Speichere den Texturinhalt in eine externe Datei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | java.lang.String | Dateiname zum Speichern. |
| Format | java.lang.String | Bildformat |

### toBitmap() {#toBitmap--}
```
public abstract TextureData toBitmap()
```


Konvertiere die Textureinheit in eine [TextureData](../../com.aspose.threed/texturedata)-Instanz

**Returns:**
[TextureData](../../com.aspose.threed/texturedata)
