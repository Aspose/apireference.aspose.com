---
title: "CffEncoding"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل ترميز _font الخاص بـ CFF."
type: docs
weight: 18
url: /ar/java/com.aspose.font/cffencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class CffEncoding implements IFontEncoding, ISupportsNameAddressing
```

يمثل ترميز CFF \_font.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | يحصل على Gid لرمز الحرف الممرّر. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | طريقة فك تشفير معلمة. |
| [encode(long gid, long charCode)](#encode-long-long-) | يقوم بترميز الحرف. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | يرجع خريطة الاسم إلى ترميز رمز الحرف. |
| [getNameToGidIndex()](#getNameToGidIndex--) | يرجع خريطة الاسم إلى ترميز رمز الحرف. |
| [getNameToSidIndex()](#getNameToSidIndex--) | يرجع خريطة الاسم إلى ترميز رمز الحرف. |
| [getSidName(int sid)](#getSidName-int-) | يحصل على الاسم للـ SID المحدد. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | يفك تشفير Gid إلى Unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | يفك تشفير Unicode ويعيد glyph id. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


يحصل على Gid لرمز الحرف الممرّر. تم تصميم هذه الطريقة لخطوط CFF CIDFonts، حيث يجب أن يكون charCode قيمة CID صالحة. معرف الشكل (Glyph id) هو رقم فريد لشكل، وهو يعتمد على نوع \_font. يمكن أن يكون معرف شكل خط CFF Font مثالًا من الفئة ( GlyphStringId ) أو الفئة ( GlyphUInt32Id ).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| charCode | long | رمز الحرف (CID) للحصول على معرف الشكل. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to CID passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


طريقة فك ترميز معلمة. غير مدعومة لنوع خط CFF.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | تنفيذ واجهة IEncodingParameters. |
| charCode | long | رمز الحرف للحصول على معرف الحرف. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to charCode passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


يقوم بترميز الشكل. غير مدعومة لأنواع خطوط CFF.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| gid | long | معرف الشكل |
| charCode | long | CharCode المرتبط بمعرف الشكل. |

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


يعيد خريطة الاسم إلى ترميز رمز الحرف. ملاحظة: رمز الحرف ليس يونيكود. رمز الحرف هو فهرس حرف في \"جدول\" ترميز الخط.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToGidIndex() {#getNameToGidIndex--}
```
public NameToCodeMap getNameToGidIndex()
```


يعيد خريطة الاسم إلى ترميز رمز الحرف. ملاحظة: رمز الحرف ليس يونيكود. رمز الحرف هو فهرس حرف في \"جدول\" ترميز الخط.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToSidIndex() {#getNameToSidIndex--}
```
public NameToCodeMap getNameToSidIndex()
```


يعيد خريطة الاسم إلى ترميز رمز الحرف. ملاحظة: رمز الحرف ليس يونيكود. رمز الحرف هو فهرس حرف في \"جدول\" ترميز الخط.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getSidName(int sid) {#getSidName-int-}
```
public String getSidName(int sid)
```


يحصل على الاسم للـ SID المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| sid | int | معرف السلسلة. |

**Returns:**
java.lang.String - الاسم من فهرس السلسلة إذا وجد.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


يفك ترميز Gid إلى يونيكود. معرف الشكل هو رقم فريد لشكل، وهو يعتمد على نوع \_font. يمكن أن يكون معرف شكل خط CFF Font مثالًا من الفئة ( GlyphStringId ) أو الفئة ( GlyphUInt32Id ).

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


يفك ترميز يونيكود ويعيد معرف الشكل. معرف الشكل هو رقم فريد لشكل، وهو يعتمد على نوع \_font. يمكن أن يكون معرف شكل خط CFF Font مثالًا من الفئة ( GlyphStringId ) أو الفئة ( GlyphUInt32Id ).

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

