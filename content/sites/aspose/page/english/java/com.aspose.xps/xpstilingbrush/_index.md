---
title: XpsTilingBrush
second_title: Aspose.Page for Java API Reference
description: Class incapsulating common features of tiling brushes elements VisualBrush and ImageBrush.
type: docs
weight: 50
url: /java/com.aspose.xps/xpstilingbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush)
```
public abstract class XpsTilingBrush extends XpsTransformableBrush
```

Class incapsulating common features of tiling brushes elements (VisualBrush and ImageBrush).
## Methods

| Method | Description |
| --- | --- |
| [getViewbox()](#getViewbox--) | Returns the region of the source content of the brush that is to be mapped to the viewport. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Sets the region of the source content of the brush that is to be mapped to the viewport. |
| [getViewport()](#getViewport--) | Returns the position and dimensions of the first brush tile. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | Sets the position and dimensions of the first brush tile. |
| [getTileMode()](#getTileMode--) | Returns value specifying how tiling is performed in the filled geometry. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Sets value specifying how tiling is performed in the filled geometry. |
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


Returns the region of the source content of the brush that is to be mapped to the viewport.

**Returns:**
java.awt.geom.Rectangle2D - The region of the source content of the brush that is to be mapped to the viewport.
### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


Sets the region of the source content of the brush that is to be mapped to the viewport.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Rectangle2D | The region of the source content of the brush that is to be mapped to the viewport. |

### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


Returns the position and dimensions of the first brush tile. Subsequent tiles are positioned relative to this tile, as specified by the tile mode.

**Returns:**
java.awt.geom.Rectangle2D - The position and dimensions of the first brush tile.
### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


Sets the position and dimensions of the first brush tile. Subsequent tiles are positioned relative to this tile, as specified by the tile mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Rectangle2D | The position and dimensions of the first brush tile. |

### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


Returns value specifying how tiling is performed in the filled geometry.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


Sets value specifying how tiling is performed in the filled geometry.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | Value specifying how tiling is performed in the filled geometry. |

