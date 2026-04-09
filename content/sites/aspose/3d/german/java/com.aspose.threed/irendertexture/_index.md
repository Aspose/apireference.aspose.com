---
title: IRenderTexture
second_title: Aspose.3D für Java API-Referenz
description: Die Schnittstelle der Render-Textur
type: docs
weight: 250
url: /de/java/com.aspose.threed/irendertexture/
---

**All Implemented Interfaces:**
[com.aspose.threed.IRenderTarget](../../com.aspose.threed/irendertarget)
```
public interface IRenderTexture extends IRenderTarget
```

Die Schnittstelle der Render-Textur
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [getDepthTexture()](#getDepthTexture--) | Depth-Buffer-Textur |
| [getTargets()](#getTargets--) | Farb-Ausgabeziele. |
### getDepthTexture() {#getDepthTexture--}
```
public abstract ITextureUnit getDepthTexture()
```


Depth-Buffer-Textur

**Returns:**
[ITextureUnit](../../com.aspose.threed/itextureunit) - Depth buffer texture
### getTargets() {#getTargets--}
```
public abstract List<ITextureUnit> getTargets()
```


Farb-Ausgabeziele.

**Returns:**
java.util.List<com.aspose.threed.ITextureUnit> - Farb-Ausgabeziele.
