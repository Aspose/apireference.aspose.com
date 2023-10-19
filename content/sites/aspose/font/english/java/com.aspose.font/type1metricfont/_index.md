---
title: Type1MetricFont
second_title: Aspose.Font for Java API Reference
description: Type1 metric font implementation.
type: docs
weight: 97
url: /java/com.aspose.font/type1metricfont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font), [com.aspose.font.Type1Font](../../com.aspose.font/type1font)
```
public class Type1MetricFont extends Type1Font
```

Type1 metric font implementation. This type1 font is created using metrics only. Glyphs retrieval functions and some other that require real font are not allowed, not allowed functions throw exception  Type1NotSupportedException . Other properties (FontName, Weight, Metrics and Encoding) are used from metrics file.

--------------------

> ```
> Note: If metrics file defines Encoding as "FontSpecific", user should provide the specific encoding with following way:
>      string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
>      FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
>  ```
> 
>      System::ArrayPtr<System::String> zapfDingbatsEncoding = System::MakeArray<System::String>({nullptr, nullptr, ..., u"space", u"a1", ...});
>      FontEnvironment::get_Current()->get_FontSpecificEncodings()->RegisterEncoding(u"ZapfDingbats", zapfDingbatsEncoding);
>  
> ```
> ```
## Methods

| Method | Description |
| --- | --- |
| [getEncoding()](#getEncoding--) | Encoding is defined in metrics file. |
| [getFontFamily()](#getFontFamily--) | Gets Font family. |
| [getFontName()](#getFontName--) | Gets Font name. |
| [getStyle()](#getStyle--) | Gets Font style. |
| [getFontStyle()](#getFontStyle--) | Gets Font style. |
| [getNumGlyphs()](#getNumGlyphs--) | Gets number of glyphs in the Font. |
| [getGlyphById(String id)](#getGlyphById-java.lang.String-) | Returns glyph by glyph Id. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Returns glyph by glyph Id. |
| [getAllGlyphIds()](#getAllGlyphIds--) | Returns all glyph Ids, available in the Font. |
### getEncoding() {#getEncoding--}
```
public IFontEncoding getEncoding()
```


Encoding is defined in metrics file. StandardAdobeEncoding: the encoding is populated automatically

--------------------

> ```
> FontSpecific:
>         user should provide the specific encoding with following way:
>      string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
>      FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
>  ```
> 
>      System::ArrayPtr<System::String> zapfDingbatsEncoding = System::MakeArray<System::String>({nullptr, nullptr, ..., u"space", u"a1", ...});
>      FontEnvironment::get_Current()->get_FontSpecificEncodings()->RegisterEncoding(u"ZapfDingbats", zapfDingbatsEncoding);
>  
> ```
> ```

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding)
### getFontFamily() {#getFontFamily--}
```
public String getFontFamily()
```


Gets Font family.

**Returns:**
java.lang.String - Font family.
### getFontName() {#getFontName--}
```
public String getFontName()
```


Gets Font name.

**Returns:**
java.lang.String - Font name.
### getStyle() {#getStyle--}
```
public String getStyle()
```


Gets Font style.

**Returns:**
java.lang.String - Font style.
### getFontStyle() {#getFontStyle--}
```
public int getFontStyle()
```


Gets Font style. This is a value computed and represented in generalized type.

**Returns:**
int - Gets Font style. Usually, a combination of FontStyle class constant flag values or 0.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Gets number of glyphs in the Font.

**Returns:**
int - Number of glyphs in the Font.
### getGlyphById(String id) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String id)
```


Returns glyph by glyph Id. Not supported for (@code Type1MetricFont\} type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Glyph identifier. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(GlyphId id) {#getGlyphById-com.aspose.font.GlyphId-}
```
public Glyph getGlyphById(GlyphId id)
```


Returns glyph by glyph Id. Not supported for (@code Type1MetricFont\} type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Glyph identifier. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getAllGlyphIds() {#getAllGlyphIds--}
```
public GlyphId[] getAllGlyphIds()
```


Returns all glyph Ids, available in the Font. Not supported for  Type1MetricFont  type.

**Returns:**
com.aspose.font.GlyphId[] - All glyph identifiers, available in the Font.
