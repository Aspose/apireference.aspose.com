---
title: "Type1Encoding"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل ترميز خط Type1."
type: docs
weight: 114
url: /ar/java/com.aspose.font/type1encoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class Type1Encoding implements IFontEncoding, ISupportsNameAddressing
```

يمثل ترميز خط Type1.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | يفك تشفير Gid إلى Unicode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | طريقة فك تشفير معلمة. |
| [encode(long gid, long charCode)](#encode-long-long-) | يقوم بترميز الحرف. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | يرجع خريطة الاسم إلى ترميز رمز الحرف. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | يفك تشفير Gid إلى Unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | يرجع GlyphId للـ Unicode. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


يفك تشفير Gid إلى Unicode. معرف الحرف (Glyph id) هو رقم فريد لحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم الحرف، وهو مثال على الفئة (GlyphStringId). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة (GlyphUInt32Id).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| charCode | long | رمز الحرف للحصول على معرف الحرف. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


طريقة فك تشفير معلمة. غير مدعومة لنوع الخط Type1.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | غير مدعومة لنوع الخط Type1. |
| charCode | long | غير مدعومة لنوع الخط Type1. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Not supported for Type1 Font type.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


يقوم بترميز الحرف. بالنسبة لخطوط TTF يكون رمز الحرف هو Unicode. غير مدعومة لأنواع الخط Type1.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| gid | long | معرف الرمز. |
| charCode | long | رمز الحرف المرتبط بمعرف الحرف. |

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
### getNameToCharCodeIndex() {#getNameToCharCodeIndex--}
```
public NameToCodeMap getNameToCharCodeIndex()
```


يرجع خريطة الاسم إلى ترميز رمز الحرف. ملاحظة: رمز الحرف ليس Unicode. رمز الحرف هو فهرس حرف في "جدول" ترميز الخط.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


يفك تشفير Gid إلى Unicode. معرف الحرف (Glyph id) هو رقم فريد لحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم الحرف، وهو مثال على الفئة (GlyphStringId). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة (GlyphUInt32Id).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| gid | [GlyphId](../../com.aspose.font/glyphid) | معرف الحرف للرمز المراد فك تشفيره. |

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


يرجع GlyphId للـ Unicode. أو notdef إذا كان الخط لا يحتوي على حرف للـ Unicode. معرف الحرف (Glyph id) هو رقم فريد لحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم الحرف، وهو مثال على الفئة (GlyphStringId). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة (GlyphUInt32Id).

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

