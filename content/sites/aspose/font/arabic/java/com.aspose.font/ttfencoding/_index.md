---
title: "TtfEncoding"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل ترميز خط TTF."
type: docs
weight: 92
url: /ar/java/com.aspose.font/ttfencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding)
```
public class TtfEncoding implements IFontEncoding
```

يمثل ترميز خط TTF.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [decodeToGid(long unicode)](#decodeToGid-long-) | تنفيذ DecodeToGlyphId لخط TTF يبحث عن جدول Unicode ويعيد glyph id للرمز Unicode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | الإصدار المعلم يسمح باستخدام جدول CMap محدد (ليس Unicode). |
| [encode(long gid, long charCode)](#encode-long-long-) | يقوم بترميز الحرف. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [gidToUnicode(GlyphId glyphId)](#gidToUnicode-com.aspose.font.GlyphId-) | يفك تشفير glyph id إلى Unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | يفك تشفير Unicode ويعيد glyph id. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long unicode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long unicode)
```


تنفيذ DecodeToGlyphId لخط TTF يبحث عن جدول Unicode ويعيد glyph id للرمز Unicode. glyph id هو رقم فريد لحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم حرف، وهو نسخة من الفئة ( GlyphStringId ). معرف TTF هو فهرس int، وهو نسخة من الفئة ( GlyphUInt32Id ).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| unicode | long | رمز الحرف للحصول على معرف الحرف. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


الإصدار المعلم يسمح باستخدام جدول CMap محدد (ليس Unicode).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | تنفيذ واجهة IEncodingParameters. |
| charCode | long | رمز الحرف للحصول على معرف glyph. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


يقوم بترميز glyph. بالنسبة لخطوط TTF يكون رمز الحرف هو Unicode.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| gid | long | معرف الرمز. |
| charCode | long | رمز الحرف. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
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
### gidToUnicode(GlyphId glyphId) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId glyphId)
```


يفك تشفير glyph id إلى Unicode. glyph id هو رقم فريد لحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم glyph، وهو نسخة من الفئة ( GlyphStringId ). معرف TTF هو فهرس int، وهو نسخة من الفئة ( GlyphUInt32Id ).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | معرف الحرف للرمز المراد فك تشفيره. |

**Returns:**
long - قيمة Unicode المتعلقة بمعرف الحرف الممرَّر.
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




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### unicodeToGid(long unicode) {#unicodeToGid-long-}
```
public GlyphId unicodeToGid(long unicode)
```


يفك تشفير Unicode ويعيد glyph id.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| unicode | long | Unicode للحصول على معرف الحرف. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to unicode passed.
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

