---
title: "ExternalFontCache"
second_title: "Aspose.Page for Java API संदर्भ"
description: "इस क्लास का उपयोग फ़ॉन्ट समाहित करने के लिए करें, ऐसी रूप में जो Device द्वारा स्वीकार किया जाता है।"
type: docs
weight: 13
url: /hi/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

इस क्लास का उपयोग फ़ॉन्ट समाहित करने के लिए करें, ऐसी रूप में जो Device द्वारा स्वीकार किया जाता है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | डिफ़ॉल्ट फ़ॉन्ट आकार। |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | डिफ़ॉल्ट फ़ॉन्ट शैली। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | फ़ॉन्ट परिवार नाम, डिफ़ॉल्ट आकार (1) और डिफ़ॉल्ट शैली (PLAIN) द्वारा DrFont प्राप्त करता है। |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | फ़ॉन्ट परिवार नाम, डिफ़ॉल्ट आकार (1) और शैली द्वारा DrFont प्राप्त करता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | फ़ॉन्ट परिवार नाम, आकार और शैली द्वारा DrFont प्राप्त करता है। |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | फ़ॉन्ट परिवार नाम, आकार, शैली और फ़ॉन्ट कैपिटल्स द्वारा DrFont प्राप्त करता है। |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | फ़ॉन्ट परिवार नाम, आकार, शैली और वैकल्पिक फ़ॉन्ट परिवार नाम द्वारा DrFont प्राप्त करता है। |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | फ़ॉन्ट परिवार नाम, आकार, शैली, फ़ॉन्ट कैपिटल्स और वैकल्पिक फ़ॉन्ट परिवार नाम द्वारा DrFont प्राप्त करता है। |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | फ़ॉन्ट परिवार नाम, शैली और वैकल्पिक फ़ॉन्ट परिवार नाम द्वारा TTFont प्राप्त करता है। |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | अतिरिक्त फ़ॉन्ट फ़ोल्डर निर्दिष्ट करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ExternalFontCache() {#ExternalFontCache--}
```
public ExternalFontCache()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final float DEFAULT_SIZE
```


डिफ़ॉल्ट फ़ॉन्ट आकार।

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


डिफ़ॉल्ट फ़ॉन्ट शैली।

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


फ़ॉन्ट परिवार नाम, डिफ़ॉल्ट आकार (1) और डिफ़ॉल्ट शैली (PLAIN) द्वारा DrFont प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| familyName | java.lang.String | फ़ॉन्ट परिवार नाम। |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


फ़ॉन्ट परिवार नाम, डिफ़ॉल्ट आकार (1) और शैली द्वारा DrFont प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| familyName | java.lang.String | फ़ॉन्ट परिवार नाम। |
| शैली | int | फ़ॉन्ट शैली। |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


फ़ॉन्ट परिवार नाम, आकार और शैली द्वारा DrFont प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| familyName | java.lang.String | फ़ॉन्ट परिवार नाम। |
| sizePoints | float | फ़ॉन्ट आकार पॉइंट्स में (एक पॉइंट 1/72 इंच के बराबर है)। |
| शैली | int | फ़ॉन्ट शैली। |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


फ़ॉन्ट परिवार नाम, आकार, शैली और फ़ॉन्ट कैपिटल्स द्वारा DrFont प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| familyName | java.lang.String | फ़ॉन्ट परिवार नाम। |
| sizePoints | float | फ़ॉन्ट आकार पॉइंट्स में (एक पॉइंट 1/72 इंच के बराबर है)। |
| शैली | int | फ़ॉन्ट शैली। |
| fontCapitals | int | फ़ॉन्ट बड़े अक्षर। |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


फ़ॉन्ट परिवार नाम, आकार, शैली और वैकल्पिक फ़ॉन्ट परिवार नाम द्वारा DrFont प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| familyName | java.lang.String | फ़ॉन्ट परिवार नाम। |
| sizePoints | float | फ़ॉन्ट आकार पॉइंट्स में (एक पॉइंट 1/72 इंच के बराबर है)। |
| शैली | int | फ़ॉन्ट शैली। |
| altFamilyName | java.lang.String | वैकल्पिक फ़ॉन्ट फ़ैमिली नाम। |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


फ़ॉन्ट परिवार नाम, आकार, शैली, फ़ॉन्ट कैपिटल्स और वैकल्पिक फ़ॉन्ट परिवार नाम द्वारा DrFont प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| familyName | java.lang.String | फ़ॉन्ट परिवार नाम। |
| sizePoints | float | फ़ॉन्ट आकार पॉइंट्स में (एक पॉइंट 1/72 इंच के बराबर है)। |
| शैली | int | फ़ॉन्ट शैली। |
| altFamilyName | java.lang.String | वैकल्पिक फ़ॉन्ट फ़ैमिली नाम। |
| fontCapitals | int | फ़ॉन्ट बड़े अक्षर। |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


फ़ॉन्ट परिवार नाम, शैली और वैकल्पिक फ़ॉन्ट परिवार नाम द्वारा TTFont प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| familyName | java.lang.String | फ़ॉन्ट परिवार नाम। |
| शैली | int | फ़ॉन्ट शैली। |
| altFamilyName | java.lang.String | वैकल्पिक फ़ॉन्ट फ़ैमिली नाम। |

**Returns:**
com.aspose.foundation.truetype.TTFont - TTFont.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
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




### setAdditionalFontsFolders(String[] additionalFontFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public static void setAdditionalFontsFolders(String[] additionalFontFolders)
```


अतिरिक्त फ़ॉन्ट फ़ोल्डर निर्दिष्ट करता है। फ़ॉन्ट फ़ोल्डर जो OS द्वारा उपयोग किए जाते हैं, डिफ़ॉल्ट रूप से ExternalFont Cache द्वारा उपयोग किए जाते हैं। इन्हें परिभाषित करने की आवश्यकता नहीं है,

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | अतिरिक्त फ़ॉन्ट फ़ोल्डर की एक सरणी। |

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
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

