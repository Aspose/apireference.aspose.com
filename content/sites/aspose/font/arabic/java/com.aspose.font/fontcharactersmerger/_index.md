---
title: "FontCharactersMerger"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يعلن عن وظيفة دمج الخطوط من أنواع مختلفة."
type: docs
weight: 35
url: /ar/java/com.aspose.font/fontcharactersmerger/
---
**Inheritance:**
java.lang.Object
```
public abstract class FontCharactersMerger
```

يعلن عن وظيفة دمج الخطوط من أنواع مختلفة. يلزم وجود زوج من الخطوط لعملية الدمج. يُعتبر أحد الخطوط في هذا الزوج الخط الأساسي. يعني ذلك أن العديد من الخصائص المتعلقة بالخط المدمج النهائي، مثل المقاييس وبنية الترميز وغيرها، ستُؤخذ من هذا الخط الأساسي. الخط الآخر في هذا الزوج (الثانوي) يوفر فقط الرموز للخط المدمج النهائي.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPrimaryFont()](#getPrimaryFont--) | يحصل على الخط الأساسي. |
| [getSecondaryFont()](#getSecondaryFont--) | يحصل على الخط الثانوي. |
| [hashCode()](#hashCode--) |  |
| [mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)](#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-) | يدمج الخطوط بناءً على قوائم الرموز الممررة. |
| [mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)](#mergeFonts-int---int---java.lang.String-) | يدمج الخطوط بناءً على قوائم رموز الأحرف الممررة. |
| [mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)](#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-) | تم تصميم نسخة هذه الطريقة للحالات التي تريد فيها تعيين رموز الأحرف للرموز في الخط الناتج بشكل صريح. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getPrimaryFont() {#getPrimaryFont--}
```
public abstract Font getPrimaryFont()
```


يحصل على الخط الأساسي.

**Returns:**
[Font](../../com.aspose.font/font) - The primary font.
### getSecondaryFont() {#getSecondaryFont--}
```
public abstract Font getSecondaryFont()
```


يحصل على الخط الثانوي.

**Returns:**
[Font](../../com.aspose.font/font) - The secondary font.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName) {#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-}
```
public abstract Font mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)
```


يدمج الخطوط بناءً على قوائم الرموز الممررة. يبحث عن رمز حرف لكل رمز ممرر ويضيف رمز الحرف المكتشف مع الرمز المقابل إلى الخط الجديد الناتج.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| primaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | قائمة الرموز التي سيتم أخذها من الخط الأساسي. |
| secondaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | قائمة الرموز التي سيتم أخذها من الخط الثانوي. |
| newFontName | java.lang.String | الاسم المطلوب للخط الناتج. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font
### mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName) {#mergeFonts-int---int---java.lang.String-}
```
public abstract Font mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)
```


يدمج الخطوط بناءً على قوائم رموز الأحرف الممررة. لإنشاء الخط الناتج المطلوب، ما عليك سوى تمرير رموز الأحرف من الخطوط الأصلية التي تريد تضمينها في الخط الناتج. سيتم العثور على الرموز المرتبطة بالرموز الممررة تلقائيًا. على سبيل المثال، إذا كنت تريد تضمين الرموز المرتبطة بالحرفين A و B من الخط الأول والرموز المرتبطة بالحرفين C و D من الخط الثاني، فقط استدعِ هذه الطريقة هكذا: `mergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")`

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| primaryFontCharCodes | int[] | الرموز التي سيتم أخذها من الخط الأساسي. |
| secondaryFontCharCodes | int[] | الرموز التي سيتم أخذها من الخط الثانوي. |
| newFontName | java.lang.String | الاسم المطلوب للخط الناتج. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
### mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName) {#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-}
```
public abstract Font mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)
```


تم تصميم نسخة هذه الطريقة للحالات التي تريد فيها تعيين رموز الأحرف للرموز في الخط الناتج بشكل صريح. ليس من الضروري أن يكون رمز الرمز الذي قدمته موجودًا في الخط الأصلي. الغرض من الرمز الممرر هو ربطه بمعرف الرمز المقابل في الخط الناتج. وبالتالي، القاعدة لمعالجة كل زوج يُمرّر عبر معلمة القاموس [code, glyph identifier] هي أن معرف الرمز فقط يُؤخذ من الخط الأصلي ثم يُربط بالرمز المقابل في الخط الناتج. يمكن أن يكون هذا مفيدًا عندما تتعارض بعض الرموز من الخط الأول مع نفس الرموز من الخط الثاني.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| primaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | قاموس يحتوي على أزواج [symbol code, glyph identifier] من الخط الأساسي. |
| secondaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | قاموس يحتوي على أزواج [symbol code, glyph identifier] من الخط الثانوي. |
| newFontName | java.lang.String | الاسم المطلوب للخط الناتج. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
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

