---
title: ITextureEncoder
second_title: Aspose.3D für Java API-Referenz
description: Externer Texturencoder sollte dieses Interface zum Kodieren implementieren.
type: docs
weight: 257
url: /de/java/com.aspose.threed/itextureencoder/
---
```
public interface ITextureEncoder
```

Externer Texturencoder sollte dieses Interface zum Kodieren implementieren.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [encode(TextureData texture, Stream stream)](#encode-com.aspose.threed.TextureData-com.aspose.threed.Stream-) | Kodiert Texturdaten in einen Stream |
| [getFileExtension()](#getFileExtension--) | Dateierweiterungsname(ohne Punkt) dieses Encoders |
### encode(TextureData texture, Stream stream) {#encode-com.aspose.threed.TextureData-com.aspose.threed.Stream-}
```
public abstract void encode(TextureData texture, Stream stream)
```


Kodiert Texturdaten in einen Stream

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| texture | [TextureData](../../com.aspose.threed/texturedata) | Die zu kodierenden Texturdaten |
| stream | [Stream](../../com.aspose.threed/stream) | Der Ausgabestream |

### getFileExtension() {#getFileExtension--}
```
public abstract String getFileExtension()
```


Dateierweiterungsname(ohne Punkt) dieses Encoders

**Returns:**
java.lang.String - Dateierweiterungsname(ohne Punkt) dieses Encoders
