---
title: ITextureDecoder
second_title: Aspose.3D für Java API-Referenz
description: Externer Texturdecoder sollte dieses Interface zum Dekodieren implementieren.
type: docs
weight: 256
url: /de/java/com.aspose.threed/itexturedecoder/
---
```
public interface ITextureDecoder
```

Externer Texturdecoder sollte dieses Interface zum Dekodieren implementieren.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [decode(Stream stream, boolean reverseY)](#decode-com.aspose.threed.Stream-boolean-) | Textur aus Stream dekodieren, null zurückgeben, wenn das Dekodieren fehlschlägt. |
### decode(Stream stream, boolean reverseY) {#decode-com.aspose.threed.Stream-boolean-}
```
public abstract TextureData decode(Stream stream, boolean reverseY)
```


Textur aus Stream dekodieren, null zurückgeben, wenn das Dekodieren fehlschlägt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Textur-Datenquellen-Stream |
| reverseY | boolean | Textur umkehren. |

**Returns:**
[TextureData](../../com.aspose.threed/texturedata) - Decoded texture data or null if not supported.
