---
title: "FontEnvironment"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يوفر معلومات حول البيئة الحالية والمنصة."
type: docs
weight: 39
url: /ar/java/com.aspose.font/fontenvironment/
---
**Inheritance:**
java.lang.Object
```
public class FontEnvironment
```

يوفر معلومات حول البيئة الحالية والمنصة.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCffCommonFontsSettings()](#getCffCommonFontsSettings--) | الإعدادات المشتركة لخطوط CFF. |
| [getClass()](#getClass--) |  |
| [getCurrent()](#getCurrent--) | يحصل على البيئة الحالية. |
| [getCurrentPlatformId()](#getCurrentPlatformId--) | يحصل على معرف المنصة الحالي. |
| [getFontSpecificEncodings()](#getFontSpecificEncodings--) | يخزن الترميزات المحددة للخطوط التي تدرك المستهلك. |
| [getStrictness()](#getStrictness--) | قد تحتوي بعض الخطوط على بيانات غير متوقعة أو ميزات غير محددة، أو قد تكون مقطوعة بشكل غير دقيق. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setStrictness(FontEnvironment.ParsingStrictness value)](#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-) | قد تحتوي بعض الخطوط على بيانات غير متوقعة أو ميزات غير محددة، أو قد تكون مقطوعة بشكل غير دقيق. |
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
### getCffCommonFontsSettings() {#getCffCommonFontsSettings--}
```
public static CffFontsSettings getCffCommonFontsSettings()
```


الإعدادات المشتركة لخطوط CFF.

**Returns:**
[CffFontsSettings](../../com.aspose.font/cfffontssettings)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCurrent() {#getCurrent--}
```
public static FontEnvironment getCurrent()
```


يحصل على البيئة الحالية.

**Returns:**
[FontEnvironment](../../com.aspose.font/fontenvironment) - Current environment.
### getCurrentPlatformId() {#getCurrentPlatformId--}
```
public int getCurrentPlatformId()
```


يحصل على معرف المنصة الحالي.

**Returns:**
int - معرف المنصة الحالي.
### getFontSpecificEncodings() {#getFontSpecificEncodings--}
```
public FontSpecificEncodings getFontSpecificEncodings()
```


يخزن الترميزات المحددة للخطوط التي تدرك المستهلك. على سبيل المثال، يستخدم PDF ترميزات محددة لـ Adobe Symbol وZapfDingbats.

**Returns:**
[FontSpecificEncodings](../../com.aspose.font/fontspecificencodings) - Specific encodings for consumer-aware Fonts.
### getStrictness() {#getStrictness--}
```
public FontEnvironment.ParsingStrictness getStrictness()
```


قد تحتوي بعض الخطوط على بيانات غير متوقعة أو ميزات غير محددة، أو قد تكون مقطوعة بشكل غير دقيق. يُنصح باستخدام الإعداد المتسامح للمستهلكين الذين يرغبون في فتح أي خط بغض النظر عن احتمالية عدم كفاءة الخط. لا يُضمن أن تكون الهياكل الداخلية للخط متسقة. يُنصح باستخدام الإعداد الصارم للمستهلكين الذين يرغبون في فتح خطوط صالحة وصلبة في الغالب.

**Returns:**
[ParsingStrictness](../../com.aspose.font/parsingstrictness) - Strictness.
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




### setStrictness(FontEnvironment.ParsingStrictness value) {#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-}
```
public void setStrictness(FontEnvironment.ParsingStrictness value)
```


قد تحتوي بعض الخطوط على بيانات غير متوقعة أو ميزات غير محددة، أو قد تكون مقطوعة بشكل غير دقيق. يُنصح باستخدام الإعداد المتسامح للمستهلكين الذين يرغبون في فتح أي خط بغض النظر عن احتمالية عدم كفاءة الخط. لا يُضمن أن تكون الهياكل الداخلية للخط متسقة. يُنصح باستخدام الإعداد الصارم للمستهلكين الذين يرغبون في فتح خطوط صالحة وصلبة في الغالب.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [ParsingStrictness](../../com.aspose.font/parsingstrictness) | الصرامة. |

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

