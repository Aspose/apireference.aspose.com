---
title: "XpsGlyphs"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة تجسد ميزات عنصر Glyphs."
type: docs
weight: 25
url: /ar/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

فئة تُجَمِّع ميزات عنصر Glyphs. يمثل هذا العنصر سلسلة من النص المُنسَّق بشكل موحد من خط واحد. يوفر المعلومات اللازمة للتصيير الدقيق ويدعم ميزات البحث والاختيار في مستهلكي العرض.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [deepClone()](#deepClone--) | استنسخ هذه الرموز. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | يوفر وصولاً إلى أبناء العنصر حسب الفهرس i. |
| [getBidiLevel()](#getBidiLevel--) | يعيد القيمة التي تحدد مستوى التداخل الثنائي الاتجاه لخوارزمية Unicode. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | يعيد هندسة المسار التي تحدّ المنطقة المرسومة للعنصر. |
| [getFill()](#getFill--) | يعيد الفرشاة المستخدمة لملء شكل الرموز المُصوَّرة. |
| [getFont()](#getFont--) | يعيد مورد الخط لخط TrueType المستخدم لتنسيق نص العناصر. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | يعيد حجم الخط بوحدات سطح الرسم، معبرًا عنه كقيمة عائمة بوحدات الفضاء الإحداثي الفعّال. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | يعيد كائن هدف الارتباط التشعبي. |
| [getOpacity()](#getOpacity--) | يعيد القيمة التي تحدد الشفافية الموحدة للعنصر. |
| [getOpacityMask()](#getOpacityMask--) | يعيد الفرشاة التي تحدد قناع قيم ألفا المطبقة على العنصر بنفس طريقة خاصية الشفافية (Opacity)، ولكن تسمح بقيم ألفا مختلفة لمناطق مختلفة من العنصر. |
| [getOriginX()](#getOriginX--) | يعيد إحداثي x للرمز الأول في السلسلة، بوحدات الفضاء الإحداثي الفعّال. |
| [getOriginY()](#getOriginY--) | يعيد إحداثي y للرمز الأول في السلسلة، بوحدات الفضاء الإحداثي الفعّال. |
| [getRenderTransform()](#getRenderTransform--) | يعيد مصفوفة التحويل المتجانس التي تُنشئ إطار إحداثيات جديد لجميع خصائص العنصر ولكل العناصر الفرعية (إن وجدت). |
| [getStyleSimulations()](#getStyleSimulations--) | يعيد القيمة التي تحدد محاكاة النمط. |
| [getUnicodeString()](#getUnicodeString--) | يعيد سلسلة النص المُصوَّرة بواسطة عنصر Glyphs. |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | يعيد القيمة التي تشير إلى أن الرمز تم تدويره على جانبه، مع تعريف الأصل كأعلى مركز للرمز غير المدور. |
| [iterator()](#iterator--) | تنفيذ واجهة Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | يضبط القيمة التي تحدد مستوى التداخل الثنائي الاتجاه لخوارزمية Unicode. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | يضبط هندسة المسار التي تحدّ المنطقة المرسومة للعنصر. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | يضبط الفرشاة المستخدمة لملء شكل الرموز المُصوَّرة. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | يضبط حجم الخط بوحدات سطح الرسم، معبرًا عنه كقيمة عائمة بوحدات الفضاء الإحداثي الفعّال. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | يضبط كائن هدف الارتباط التشعبي. |
| [setOpacity(float value)](#setOpacity-float-) | يضبط القيمة التي تحدد الشفافية المتساوية للعنصر. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | يضبط الفرشاة التي تحدد قناعًا لقيم ألفا يُطبق على العنصر بنفس طريقة خاصية Opacity، مع السماح بقيم ألفا مختلفة لمناطق مختلفة من العنصر. |
| [setOriginX(float value)](#setOriginX-float-) | يضبط إحداثي x للرمز الأول في السلسلة، بوحدات الفضاء الإحداثي الفعّال. |
| [setOriginY(float value)](#setOriginY-float-) | يضبط إحداثي y للرمز الأول في السلسلة، بوحدات الفضاء الإحداثي الفعّال. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | يضبط مصفوفة التحويل الأفيني التي تُنشئ إطار إحداثيات جديد لجميع خصائص العنصر ولكل العناصر الفرعية (إن وجدت). |
| [setSideways(boolean value)](#setSideways-boolean-) | يضبط القيمة التي تشير إلى أن الرمز تم تدويره على جانبه، مع تعريف الأصل كأعلى مركز للرمز غير المدور. |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | يضبط القيمة التي تحدد محاكاة النمط. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | يضبط سلسلة النص المُصوَّرة بواسطة عنصر Glyphs. |
| [size()](#size--) | يعيد عدد العناصر الفرعية. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


استنسخ هذه الرموز.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
منطقي
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


يوفر وصولاً إلى أبناء العنصر حسب الفهرس i.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| i | int | فهرس العنصر الفرعي. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


يعيد القيمة التي تحدد مستوى التداخل الثنائي الاتجاه لخوارزمية Unicode. القيم الزوجية تعني تخطيط من اليسار إلى اليمين، والقيم الفردية تعني تخطيط من اليمين إلى اليسار. يضع تخطيط من اليمين إلى اليسار أصل السلسلة على الجانب الأيمن للرمز الأول، مع عرض تقدمات إيجابية (تمثل تقدمًا إلى اليسار) يضع الرموز اللاحقة إلى يسار الرمز السابق.

**Returns:**
int - القيمة التي تحدد مستوى التداخل الثنائي الاتجاه لخوارزمية Unicode.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


يعيد هندسة المسار التي تحدّ المنطقة المرسومة للعنصر.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


يعيد الفرشاة المستخدمة لملء شكل الرموز المُصوَّرة.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


يعيد مورد الخط لخط TrueType المستخدم لتنسيق نص العناصر.

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


يعيد حجم الخط بوحدات سطح الرسم، معبرًا عنه كقيمة عائمة بوحدات الفضاء الإحداثي الفعّال.

**Returns:**
float - حجم الخط.
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


يعيد كائن هدف الارتباط التشعبي.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


يعيد القيمة التي تحدد الشفافية الموحدة للعنصر.

**Returns:**
float - القيمة التي تحدد الشفافية المتساوية للعنصر.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


يعيد الفرشاة التي تحدد قناع قيم ألفا المطبقة على العنصر بنفس طريقة خاصية الشفافية (Opacity)، ولكن تسمح بقيم ألفا مختلفة لمناطق مختلفة من العنصر.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


يعيد إحداثي x للرمز الأول في السلسلة، بوحدات الفضاء الإحداثي الفعّال.

**Returns:**
float - إحداثي x لأول حرف في السلسلة، بوحدات مساحة الإحداثيات الفعّالة.
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


يعيد إحداثي y للرمز الأول في السلسلة، بوحدات الفضاء الإحداثي الفعّال.

**Returns:**
float - إحداثي y لأول حرف في السلسلة، بوحدات مساحة الإحداثيات الفعّالة.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


يعيد مصفوفة التحويل المتجانس التي تُنشئ إطار إحداثيات جديد لجميع خصائص العنصر ولكل العناصر الفرعية (إن وجدت).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


يعيد القيمة التي تحدد محاكاة النمط.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


يعيد السلسلة النصية التي تم عرضها بواسطة عنصر Glyphs. يتم تحديد النص كنقاط شفرة يونيكود.

**Returns:**
java.lang.String - السلسلة النصية التي تم عرضها بواسطة عنصر Glyphs.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSideways() {#isSideways--}
```
public boolean isSideways()
```


يعيد القيمة التي تشير إلى أن الرمز تم تدويره على جانبه، مع تعريف الأصل كأعلى مركز للرمز غير المدور.

**Returns:**
boolean - القيمة التي تشير إلى أن الحرف تم تدويره على جانبه.
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


تنفيذ واجهة Iterable.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - يعيد المُعدِّد للقائمة.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


يضبط القيمة التي تحدد مستوى التداخل الثنائي الاتجاه لخوارزمية يونيكود. القيم الزوجية تعني تخطيط من اليسار إلى اليمين، والقيم الفردية تعني تخطيط من اليمين إلى اليسار. يضع تخطيط من اليمين إلى اليسار أصل السلسلة على الجانب الأيمن من أول حرف، مع عرض تقدم إيجابي (يمثل التقدم إلى اليسار) يضع الأحرف اللاحقة إلى يسار الحرف السابق.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | int | القيمة التي تحدد مستوى التداخل الثنائي الاتجاه لخوارزمية يونيكود. |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


يضبط هندسة المسار التي تحدّ المنطقة المرسومة للعنصر.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | هندسة المسار التي تحدّ المنطقة المرسومة للعنصر. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


يضبط الفرشاة المستخدمة لملء شكل الرموز المُصوَّرة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | الفرشاة المستخدمة لملء شكل الأحرف المعروضة. |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


يضبط حجم الخط بوحدات سطح الرسم، معبرًا عنه كقيمة عائمة بوحدات الفضاء الإحداثي الفعّال.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | حجم الخط. |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


يضبط كائن هدف الارتباط التشعبي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | كائن هدف الارتباط التشعبي. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


يضبط القيمة التي تحدد الشفافية المتساوية للعنصر.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | القيمة التي تحدد الشفافية المتساوية للعنصر. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


يضبط الفرشاة التي تحدد قناعًا لقيم ألفا يُطبق على العنصر بنفس طريقة خاصية Opacity، مع السماح بقيم ألفا مختلفة لمناطق مختلفة من العنصر.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | الفرشاة التي تحدد قناعًا. |

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


يضبط إحداثي x للرمز الأول في السلسلة، بوحدات الفضاء الإحداثي الفعّال.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | إحداثي x لأول حرف في السلسلة، بوحدات مساحة الإحداثيات الفعّالة. |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


يضبط إحداثي y للرمز الأول في السلسلة، بوحدات الفضاء الإحداثي الفعّال.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | إحداثي y لأول حرف في السلسلة، بوحدات مساحة الإحداثيات الفعّالة. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


يضبط مصفوفة التحويل الأفيني التي تُنشئ إطار إحداثيات جديد لجميع خصائص العنصر ولكل العناصر الفرعية (إن وجدت).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | مصفوفة التحويل الأفيني. |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


يضبط القيمة التي تشير إلى أن الرمز تم تدويره على جانبه، مع تعريف الأصل كأعلى مركز للرمز غير المدور.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | منطقي | القيمة التي تشير إلى أن الحرف تم تدويره على جانبه. |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


يضبط القيمة التي تحدد محاكاة النمط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | القيمة التي تحدد محاكاة النمط. |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


يضبط السلسلة النصية التي تم عرضها بواسطة عنصر Glyphs. يتم تحديد النص كنقاط شفرة يونيكود.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | السلسلة النصية التي تم عرضها بواسطة عنصر Glyphs. |

### size() {#size--}
```
public int size()
```


يعيد عدد العناصر الفرعية.

**Returns:**
int - عدد العناصر الفرعية.
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

