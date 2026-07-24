---
title: "IGlyph"
second_title: "Aspose.Page용 Java API 참조"
description: "이 인터페이스는 글리프의 주요 매개변수에 접근할 수 있게 합니다."
type: docs
weight: 19
url: /ko/java/com.aspose.page/iglyph/
---```
public interface IGlyph
```

This interface give access to main parameters of glyph.
## Methods

| Method | Description |
| --- | --- |
| [getAdvanceWidth()](#getAdvanceWidth--) | Gets advanced width of the glyph. |
| [getCharCode()](#getCharCode--) | Gets char code of the glyph. |
| [getCharName()](#getCharName--) | Gets character name. |
| [getGlyphVector()](#getGlyphVector--) | Gets glyphs vectors. |
| [getLeftSideBearing()](#getLeftSideBearing--) | Gets left side bearing of the glyph. |
### getAdvanceWidth() {#getAdvanceWidth--}
```
public abstract float getAdvanceWidth()
```


Gets advanced width of the glyph.

**Returns:**
float - Advanced width.
### getCharCode() {#getCharCode--}
```
public abstract char getCharCode()
```


Gets char code of the glyph.

**Returns:**
char - A char code.
### getCharName() {#getCharName--}
```
public abstract String getCharName()
```


Gets character name.

**Returns:**
java.lang.String - Character name
### getGlyphVector() {#getGlyphVector--}
```
public abstract GlyphVector getGlyphVector()
```


Gets glyphs vectors.

**Returns:**
java.awt.font.GlyphVector - Glyphs vectors.
### getLeftSideBearing() {#getLeftSideBearing--}
```
public abstract float getLeftSideBearing()
```


Gets left side bearing of the glyph.

**Returns:**
float - Left side bearing of the glyph.
