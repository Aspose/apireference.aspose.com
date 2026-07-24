---
title: "UserProperties"
second_title: "Aspose.Page for Java API संदर्भ"
description: "विशेष प्रॉपर्टी क्लास जो टाइप्ड प्रॉपर्टीज़ को सेट और लौटाने की अनुमति देती है।"
type: docs
weight: 18
url: /hi/java/com.aspose.page/userproperties/
---
**Inheritance:**
java.lang.Object, java.util.Dictionary, java.util.Hashtable, java.util.Properties
```
public class UserProperties extends Properties
```

एक विशेष प्रॉपर्टी क्लास जो टाइप्ड प्रॉपर्टीज़ को सेट और रिटर्न करने की अनुमति देता है। यह दो डिफ़ॉल्ट प्रॉपर्टी ऑब्जेक्ट्स को खोजने के लिए हुकअप करने की भी सुविधा देता है यदि यह प्रॉपर्टी ऑब्जेक्ट प्रॉपर्टी नहीं रखता।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [UserProperties()](#UserProperties--) | UserProperties क्लास का एक खाली इंस्टेंस प्रारंभ करता है। |
| [UserProperties(Properties defaults)](#UserProperties-java.util.Properties-) | डिफ़ॉल्ट मानों के साथ UserProperties क्लास का एक इंस्टेंस प्रारंभ करता है। |
| [UserProperties(Properties defaults, Properties altDefaults)](#UserProperties-java.util.Properties-java.util.Properties-) | UserProperties को डिफ़ॉल्ट्स और altDefaults तालिका के साथ बनाता है, जिन्हें उस क्रम में खोजा जाता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [clear()](#clear--) |  |
| [clone()](#clone--) |  |
| [compute(K arg0, BiFunction<? super K,? super V,? extends V> arg1)](#compute-K-java.util.function.BiFunction---super-K---super-V---extends-V--) |  |
| [compute(Object arg0, BiFunction<? super Object,? super Object,?> arg1)](#compute-java.lang.Object-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----) |  |
| [computeIfAbsent(K arg0, Function<? super K,? extends V> arg1)](#computeIfAbsent-K-java.util.function.Function---super-K---extends-V--) |  |
| [computeIfAbsent(Object arg0, Function<? super Object,?> arg1)](#computeIfAbsent-java.lang.Object-java.util.function.Function---super-java.lang.Object----) |  |
| [computeIfPresent(K arg0, BiFunction<? super K,? super V,? extends V> arg1)](#computeIfPresent-K-java.util.function.BiFunction---super-K---super-V---extends-V--) |  |
| [computeIfPresent(Object arg0, BiFunction<? super Object,? super Object,?> arg1)](#computeIfPresent-java.lang.Object-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----) |  |
| [contains(Object arg0)](#contains-java.lang.Object-) |  |
| [containsKey(Object arg0)](#containsKey-java.lang.Object-) |  |
| [containsValue(Object arg0)](#containsValue-java.lang.Object-) |  |
| [elements()](#elements--) |  |
| [entrySet()](#entrySet--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [forEach(BiConsumer<? super K,? super V> arg0)](#forEach-java.util.function.BiConsumer---super-K---super-V--) |  |
| [forEach(BiConsumer<? super Object,? super Object> arg0)](#forEach-java.util.function.BiConsumer---super-java.lang.Object---super-java.lang.Object--) |  |
| [get(Object arg0)](#get-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOrDefault(Object arg0, V arg1)](#getOrDefault-java.lang.Object-V-) |  |
| [getOrDefault(Object arg0, Object arg1)](#getOrDefault-java.lang.Object-java.lang.Object-) |  |
| [getProperty(String key)](#getProperty-java.lang.String-) | स्ट्रिंग प्रॉपर्टी मान प्राप्त करता है। |
| [getProperty(String key, String def)](#getProperty-java.lang.String-java.lang.String-) | स्ट्रिंग प्रॉपर्टी मान प्राप्त करता है। |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | रंग प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyColor(String key, Color def)](#getPropertyColor-java.lang.String-java.awt.Color-) | रंग प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyDimension(String key)](#getPropertyDimension-java.lang.String-) | आयाम प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyDimension(String key, Dimension def)](#getPropertyDimension-java.lang.String-java.awt.Dimension-) | आयाम प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | डबल प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyDouble(String key, double def)](#getPropertyDouble-java.lang.String-double-) | डबल प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyFloat(String key)](#getPropertyFloat-java.lang.String-) | फ़्लोट प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyFloat(String key, float def)](#getPropertyFloat-java.lang.String-float-) | फ़्लोट प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyInsets(String key)](#getPropertyInsets-java.lang.String-) | इनसेट्स प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyInsets(String key, Insets def)](#getPropertyInsets-java.lang.String-java.awt.Insets-) | इनसेट्स प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | इंटीजर प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyInt(String key, int def)](#getPropertyInt-java.lang.String-int-) | इंटीजर प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | फ़्लोट प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyMatrix(String key, AffineTransform def)](#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-) | फ़्लोट प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | रेक्टैंगल प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyRectangle(String key, Rectangle def)](#getPropertyRectangle-java.lang.String-java.awt.Rectangle-) | रेक्टैंगल प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyStringArray(String key)](#getPropertyStringArray-java.lang.String-) | स्ट्रिंग एरे प्रॉपर्टी का मान प्राप्त करता है। |
| [getPropertyStringArray(String key, String[] def)](#getPropertyStringArray-java.lang.String-java.lang.String---) | स्ट्रिंग एरे प्रॉपर्टी का मान प्राप्त करता है। |
| [hashCode()](#hashCode--) |  |
| [isEmpty()](#isEmpty--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | बूलियन प्रॉपर्टी का मान प्राप्त करता है। |
| [isProperty(String key, boolean def)](#isProperty-java.lang.String-boolean-) | बूलियन प्रॉपर्टी का मान प्राप्त करता है। |
| [keySet()](#keySet--) |  |
| [keys()](#keys--) |  |
| [list(PrintStream arg0)](#list-java.io.PrintStream-) |  |
| [list(PrintWriter arg0)](#list-java.io.PrintWriter-) |  |
| [load(InputStream arg0)](#load-java.io.InputStream-) |  |
| [load(Reader arg0)](#load-java.io.Reader-) |  |
| [loadFromXML(InputStream arg0)](#loadFromXML-java.io.InputStream-) |  |
| [merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2)](#merge-K-V-java.util.function.BiFunction---super-V---super-V---extends-V--) |  |
| [merge(Object arg0, Object arg1, BiFunction<? super Object,? super Object,?> arg2)](#merge-java.lang.Object-java.lang.Object-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [printProperties()](#printProperties--) | सभी सेट की गई प्रॉपर्टीज़ को प्रिंट करता है। |
| [propertyNames()](#propertyNames--) | प्रॉपर्टी नामों को लौटाता है। |
| [put(K arg0, V arg1)](#put-K-V-) |  |
| [put(Object arg0, Object arg1)](#put-java.lang.Object-java.lang.Object-) |  |
| [putAll(Map<? extends K,? extends V> arg0)](#putAll-java.util.Map---extends-K---extends-V--) |  |
| [putAll(Map<?,?> arg0)](#putAll-java.util.Map------) |  |
| [putIfAbsent(K arg0, V arg1)](#putIfAbsent-K-V-) |  |
| [putIfAbsent(Object arg0, Object arg1)](#putIfAbsent-java.lang.Object-java.lang.Object-) |  |
| [remove(Object arg0)](#remove-java.lang.Object-) |  |
| [remove(Object arg0, Object arg1)](#remove-java.lang.Object-java.lang.Object-) |  |
| [replace(K arg0, V arg1)](#replace-K-V-) |  |
| [replace(K arg0, V arg1, V arg2)](#replace-K-V-V-) |  |
| [replace(Object arg0, Object arg1)](#replace-java.lang.Object-java.lang.Object-) |  |
| [replace(Object arg0, Object arg1, Object arg2)](#replace-java.lang.Object-java.lang.Object-java.lang.Object-) |  |
| [replaceAll(BiFunction<? super K,? super V,? extends V> arg0)](#replaceAll-java.util.function.BiFunction---super-K---super-V---extends-V--) |  |
| [replaceAll(BiFunction<? super Object,? super Object,?> arg0)](#replaceAll-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----) |  |
| [save(OutputStream arg0, String arg1)](#save-java.io.OutputStream-java.lang.String-) |  |
| [setProperties(Properties properties)](#setProperties-java.util.Properties-) | प्रॉपर्टीज़ को कॉपी करता है, जिसमें उनके डिफ़ॉल्ट भी शामिल हैं, इस UserProperties में। |
| [setProperty(String key, boolean value)](#setProperty-java.lang.String-boolean-) | बूलियन प्रॉपर्टी का मान सेट करता है। |
| [setProperty(String key, double value)](#setProperty-java.lang.String-double-) | डबल प्रॉपर्टी का मान सेट करता है। |
| [setProperty(String key, float value)](#setProperty-java.lang.String-float-) | फ़्लोट प्रॉपर्टी का मान सेट करता है। |
| [setProperty(String key, int value)](#setProperty-java.lang.String-int-) | इंटीजर प्रॉपर्टी का मान सेट करता है। |
| [setProperty(String key, Color value)](#setProperty-java.lang.String-java.awt.Color-) | रंग प्रॉपर्टी का मान सेट करता है। |
| [setProperty(String key, Dimension value)](#setProperty-java.lang.String-java.awt.Dimension-) | आयाम प्रॉपर्टी का मान सेट करता है। |
| [setProperty(String key, Insets value)](#setProperty-java.lang.String-java.awt.Insets-) | इनसेट्स प्रॉपर्टी का मान सेट करता है। |
| [setProperty(String key, Rectangle value)](#setProperty-java.lang.String-java.awt.Rectangle-) | रेक्टैंगल प्रॉपर्टी का मान सेट करता है। |
| [setProperty(String key, AffineTransform value)](#setProperty-java.lang.String-java.awt.geom.AffineTransform-) | मैट्रिक्स प्रॉपर्टी का मान सेट करता है। |
| [setProperty(String key, String value)](#setProperty-java.lang.String-java.lang.String-) | स्ट्रिंग प्रॉपर्टी का मान सेट करता है। |
| [setProperty(String key, String[] value)](#setProperty-java.lang.String-java.lang.String---) | स्ट्रिंग एरे प्रॉपर्टी का मान सेट करता है। |
| [setProperty(Properties properties, String key, boolean value)](#setProperty-java.util.Properties-java.lang.String-boolean-) | निर्दिष्ट प्रॉपर्टीज़ टेबल में बूलियन प्रॉपर्टी का मान सेट करता है। |
| [setProperty(Properties properties, String key, double value)](#setProperty-java.util.Properties-java.lang.String-double-) | निर्दिष्ट प्रॉपर्टीज़ टेबल में डबल प्रॉपर्टी का मान सेट करता है। |
| [setProperty(Properties properties, String key, float value)](#setProperty-java.util.Properties-java.lang.String-float-) | निर्दिष्ट प्रॉपर्टीज़ तालिका में float प्रॉपर्टी मान सेट करता है। |
| [setProperty(Properties properties, String key, int value)](#setProperty-java.util.Properties-java.lang.String-int-) | निर्दिष्ट प्रॉपर्टीज़ तालिका में integer प्रॉपर्टी मान सेट करता है। |
| [setProperty(Properties properties, String key, Color value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Color-) | निर्दिष्ट प्रॉपर्टीज़ तालिका में color प्रॉपर्टी मान सेट करता है। |
| [setProperty(Properties properties, String key, Dimension value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-) | निर्दिष्ट प्रॉपर्टीज़ तालिका में dimension प्रॉपर्टी मान सेट करता है। |
| [setProperty(Properties properties, String key, Insets value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-) | निर्दिष्ट प्रॉपर्टीज़ तालिका में insets प्रॉपर्टी मान सेट करता है। |
| [setProperty(Properties properties, String key, Rectangle value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-) | निर्दिष्ट प्रॉपर्टीज़ तालिका में rectangle प्रॉपर्टी मान सेट करता है। |
| [setProperty(Properties properties, String key, AffineTransform value)](#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-) | निर्दिष्ट प्रॉपर्टीज़ तालिका में matrix प्रॉपर्टी मान सेट करता है। |
| [setProperty(Properties properties, String key, String[] value)](#setProperty-java.util.Properties-java.lang.String-java.lang.String---) | निर्दिष्ट प्रॉपर्टीज़ तालिका में string array प्रॉपर्टी मान सेट करता है। |
| [size()](#size--) |  |
| [store(OutputStream arg0, String arg1)](#store-java.io.OutputStream-java.lang.String-) |  |
| [store(Writer arg0, String arg1)](#store-java.io.Writer-java.lang.String-) |  |
| [storeToXML(OutputStream arg0, String arg1)](#storeToXML-java.io.OutputStream-java.lang.String-) |  |
| [storeToXML(OutputStream arg0, String arg1, String arg2)](#storeToXML-java.io.OutputStream-java.lang.String-java.lang.String-) |  |
| [storeToXML(OutputStream arg0, String arg1, Charset arg2)](#storeToXML-java.io.OutputStream-java.lang.String-java.nio.charset.Charset-) |  |
| [stringPropertyNames()](#stringPropertyNames--) |  |
| [toString()](#toString--) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### UserProperties() {#UserProperties--}
```
public UserProperties()
```


UserProperties क्लास का एक खाली इंस्टेंस प्रारंभ करता है।

### UserProperties(Properties defaults) {#UserProperties-java.util.Properties-}
```
public UserProperties(Properties defaults)
```


डिफ़ॉल्ट मानों के साथ UserProperties क्लास का एक इंस्टेंस प्रारंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| डिफ़ॉल्ट्स | java.util.Properties | डिफ़ॉल्ट प्रॉपर्टीज़ मान। |

### UserProperties(Properties defaults, Properties altDefaults) {#UserProperties-java.util.Properties-java.util.Properties-}
```
public UserProperties(Properties defaults, Properties altDefaults)
```


UserProperties को डिफ़ॉल्ट्स और altDefaults तालिका के साथ बनाता है, जिन्हें उस क्रम में खोजा जाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| डिफ़ॉल्ट्स | java.util.Properties | डिफ़ॉल्ट प्रॉपर्टीज़। |
| altDefaults | java.util.Properties | वैकल्पिक डिफ़ॉल्ट प्रॉपर्टीज़। |

### clear() {#clear--}
```
public synchronized void clear()
```




### clone() {#clone--}
```
public synchronized Object clone()
```




**Returns:**
java.lang.Object
### compute(K arg0, BiFunction<? super K,? super V,? extends V> arg1) {#compute-K-java.util.function.BiFunction---super-K---super-V---extends-V--}
```
public synchronized V compute(K arg0, BiFunction<? super K,? super V,? extends V> arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | K |  |
| arg1 | java.util.function.BiFunction<? super K,? super V,? extends V> |  |

**Returns:**
V
### compute(Object arg0, BiFunction<? super Object,? super Object,?> arg1) {#compute-java.lang.Object-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----}
```
public synchronized Object compute(Object arg0, BiFunction<? super Object,? super Object,?> arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.util.function.BiFunction<? super java.lang.Object,? super java.lang.Object,?> |  |

**Returns:**
java.lang.Object
### computeIfAbsent(K arg0, Function<? super K,? extends V> arg1) {#computeIfAbsent-K-java.util.function.Function---super-K---extends-V--}
```
public synchronized V computeIfAbsent(K arg0, Function<? super K,? extends V> arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | K |  |
| arg1 | java.util.function.Function<? super K,? extends V> |  |

**Returns:**
V
### computeIfAbsent(Object arg0, Function<? super Object,?> arg1) {#computeIfAbsent-java.lang.Object-java.util.function.Function---super-java.lang.Object----}
```
public synchronized Object computeIfAbsent(Object arg0, Function<? super Object,?> arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.util.function.Function<? super java.lang.Object,?> |  |

**Returns:**
java.lang.Object
### computeIfPresent(K arg0, BiFunction<? super K,? super V,? extends V> arg1) {#computeIfPresent-K-java.util.function.BiFunction---super-K---super-V---extends-V--}
```
public synchronized V computeIfPresent(K arg0, BiFunction<? super K,? super V,? extends V> arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | K |  |
| arg1 | java.util.function.BiFunction<? super K,? super V,? extends V> |  |

**Returns:**
V
### computeIfPresent(Object arg0, BiFunction<? super Object,? super Object,?> arg1) {#computeIfPresent-java.lang.Object-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----}
```
public synchronized Object computeIfPresent(Object arg0, BiFunction<? super Object,? super Object,?> arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.util.function.BiFunction<? super java.lang.Object,? super java.lang.Object,?> |  |

**Returns:**
java.lang.Object
### contains(Object arg0) {#contains-java.lang.Object-}
```
public boolean contains(Object arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsKey(Object arg0) {#containsKey-java.lang.Object-}
```
public boolean containsKey(Object arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsValue(Object arg0) {#containsValue-java.lang.Object-}
```
public boolean containsValue(Object arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### elements() {#elements--}
```
public Enumeration<Object> elements()
```




**Returns:**
java.util.Enumeration<java.lang.Object>
### entrySet() {#entrySet--}
```
public Set<Map.Entry<Object,Object>> entrySet()
```




**Returns:**
java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public synchronized boolean equals(Object arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### forEach(BiConsumer<? super K,? super V> arg0) {#forEach-java.util.function.BiConsumer---super-K---super-V--}
```
public synchronized void forEach(BiConsumer<? super K,? super V> arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super K,? super V> |  |

### forEach(BiConsumer<? super Object,? super Object> arg0) {#forEach-java.util.function.BiConsumer---super-java.lang.Object---super-java.lang.Object--}
```
public synchronized void forEach(BiConsumer<? super Object,? super Object> arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super java.lang.Object,? super java.lang.Object> |  |

### get(Object arg0) {#get-java.lang.Object-}
```
public Object get(Object arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
java.lang.Object
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOrDefault(Object arg0, V arg1) {#getOrDefault-java.lang.Object-V-}
```
public synchronized V getOrDefault(Object arg0, V arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | V |  |

**Returns:**
V
### getOrDefault(Object arg0, Object arg1) {#getOrDefault-java.lang.Object-java.lang.Object-}
```
public Object getOrDefault(Object arg0, Object arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
java.lang.Object
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


स्ट्रिंग प्रॉपर्टी मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
java.lang.String - प्रॉपर्टी मान।
### getProperty(String key, String def) {#getProperty-java.lang.String-java.lang.String-}
```
public String getProperty(String key, String def)
```


स्ट्रिंग प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| def | java.lang.String | प्रॉपर्टी का डिफ़ॉल्ट मान। |

**Returns:**
java.lang.String - प्रॉपर्टी मान।
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


रंग प्रॉपर्टी का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
java.awt.Color - प्रॉपर्टी मान।
### getPropertyColor(String key, Color def) {#getPropertyColor-java.lang.String-java.awt.Color-}
```
public Color getPropertyColor(String key, Color def)
```


रंग प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| def | java.awt.Color | प्रॉपर्टी का डिफ़ॉल्ट मान। |

**Returns:**
java.awt.Color - प्रॉपर्टी मान।
### getPropertyDimension(String key) {#getPropertyDimension-java.lang.String-}
```
public Dimension getPropertyDimension(String key)
```


आयाम प्रॉपर्टी का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
java.awt.Dimension - प्रॉपर्टी मान।
### getPropertyDimension(String key, Dimension def) {#getPropertyDimension-java.lang.String-java.awt.Dimension-}
```
public Dimension getPropertyDimension(String key, Dimension def)
```


आयाम प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| def | java.awt.Dimension | प्रॉपर्टी का डिफ़ॉल्ट मान। |

**Returns:**
java.awt.Dimension - प्रॉपर्टी मान।
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


डबल प्रॉपर्टी का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
double - प्रॉपर्टी मान।
### getPropertyDouble(String key, double def) {#getPropertyDouble-java.lang.String-double-}
```
public double getPropertyDouble(String key, double def)
```


डबल प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| def | double | प्रॉपर्टी का डिफ़ॉल्ट मान। |

**Returns:**
double - प्रॉपर्टी मान।
### getPropertyFloat(String key) {#getPropertyFloat-java.lang.String-}
```
public float getPropertyFloat(String key)
```


फ़्लोट प्रॉपर्टी का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
float - प्रॉपर्टी मान।
### getPropertyFloat(String key, float def) {#getPropertyFloat-java.lang.String-float-}
```
public float getPropertyFloat(String key, float def)
```


फ़्लोट प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| def | float | प्रॉपर्टी का डिफ़ॉल्ट मान। |

**Returns:**
float - प्रॉपर्टी मान।
### getPropertyInsets(String key) {#getPropertyInsets-java.lang.String-}
```
public Insets getPropertyInsets(String key)
```


इनसेट्स प्रॉपर्टी का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
java.awt.Insets - प्रॉपर्टी मान।
### getPropertyInsets(String key, Insets def) {#getPropertyInsets-java.lang.String-java.awt.Insets-}
```
public Insets getPropertyInsets(String key, Insets def)
```


इनसेट्स प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| def | java.awt.Insets | प्रॉपर्टी का डिफ़ॉल्ट मान। |

**Returns:**
java.awt.Insets - प्रॉपर्टी मान।
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


इंटीजर प्रॉपर्टी का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
int - प्रॉपर्टी मान।
### getPropertyInt(String key, int def) {#getPropertyInt-java.lang.String-int-}
```
public int getPropertyInt(String key, int def)
```


इंटीजर प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| def | int | प्रॉपर्टी का डिफ़ॉल्ट मान। |

**Returns:**
int - प्रॉपर्टी मान।
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


फ़्लोट प्रॉपर्टी का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
java.awt.geom.AffineTransform - प्रॉपर्टी मान।
### getPropertyMatrix(String key, AffineTransform def) {#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-}
```
public AffineTransform getPropertyMatrix(String key, AffineTransform def)
```


फ़्लोट प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| def | java.awt.geom.AffineTransform | प्रॉपर्टी का डिफ़ॉल्ट मान। |

**Returns:**
java.awt.geom.AffineTransform - प्रॉपर्टी मान।
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


रेक्टैंगल प्रॉपर्टी का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
java.awt.Rectangle - प्रॉपर्टी मान।
### getPropertyRectangle(String key, Rectangle def) {#getPropertyRectangle-java.lang.String-java.awt.Rectangle-}
```
public Rectangle getPropertyRectangle(String key, Rectangle def)
```


रेक्टेंगल प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| def | java.awt.Rectangle | प्रॉपर्टी का डिफ़ॉल्ट मान। |

**Returns:**
java.awt.Rectangle - प्रॉपर्टी मान।
### getPropertyStringArray(String key) {#getPropertyStringArray-java.lang.String-}
```
public String[] getPropertyStringArray(String key)
```


स्ट्रिंग एरे प्रॉपर्टी का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
java.lang.String[] - प्रॉपर्टी मान।
### getPropertyStringArray(String key, String[] def) {#getPropertyStringArray-java.lang.String-java.lang.String---}
```
public String[] getPropertyStringArray(String key, String[] def)
```


स्ट्रिंग एरे प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| def | java.lang.String[] | प्रॉपर्टी का डिफ़ॉल्ट मान। |

**Returns:**
java.lang.String[] - प्रॉपर्टी मान।
### hashCode() {#hashCode--}
```
public synchronized int hashCode()
```




**Returns:**
int
### isEmpty() {#isEmpty--}
```
public boolean isEmpty()
```




**Returns:**
boolean
### isProperty(String key) {#isProperty-java.lang.String-}
```
public boolean isProperty(String key)
```


बूलियन प्रॉपर्टी का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
boolean - प्रॉपर्टी मान।
### isProperty(String key, boolean def) {#isProperty-java.lang.String-boolean-}
```
public boolean isProperty(String key, boolean def)
```


बूलियन प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| def | boolean | प्रॉपर्टी का डिफ़ॉल्ट मान। |

**Returns:**
boolean - प्रॉपर्टी मान।
### keySet() {#keySet--}
```
public Set<Object> keySet()
```




**Returns:**
java.util.Set<java.lang.Object>
### keys() {#keys--}
```
public Enumeration<Object> keys()
```




**Returns:**
java.util.Enumeration<java.lang.Object>
### list(PrintStream arg0) {#list-java.io.PrintStream-}
```
public void list(PrintStream arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.io.PrintStream |  |

### list(PrintWriter arg0) {#list-java.io.PrintWriter-}
```
public void list(PrintWriter arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.io.PrintWriter |  |

### load(InputStream arg0) {#load-java.io.InputStream-}
```
public synchronized void load(InputStream arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### load(Reader arg0) {#load-java.io.Reader-}
```
public synchronized void load(Reader arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.io.Reader |  |

### loadFromXML(InputStream arg0) {#loadFromXML-java.io.InputStream-}
```
public synchronized void loadFromXML(InputStream arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2) {#merge-K-V-java.util.function.BiFunction---super-V---super-V---extends-V--}
```
public synchronized V merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | K |  |
| arg1 | V |  |
| arg2 | java.util.function.BiFunction<? super V,? super V,? extends V> |  |

**Returns:**
V
### merge(Object arg0, Object arg1, BiFunction<? super Object,? super Object,?> arg2) {#merge-java.lang.Object-java.lang.Object-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----}
```
public synchronized Object merge(Object arg0, Object arg1, BiFunction<? super Object,? super Object,?> arg2)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |
| arg2 | java.util.function.BiFunction<? super java.lang.Object,? super java.lang.Object,?> |  |

**Returns:**
java.lang.Object
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### printProperties() {#printProperties--}
```
public void printProperties()
```


सभी सेट की गई प्रॉपर्टीज़ को प्रिंट करता है।

### propertyNames() {#propertyNames--}
```
public Enumeration propertyNames()
```


प्रॉपर्टी नामों को लौटाता है।

**Returns:**
java.util.Enumeration - प्रॉपर्टी नामों की एनेमरेशन।
### put(K arg0, V arg1) {#put-K-V-}
```
public synchronized V put(K arg0, V arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | K |  |
| arg1 | V |  |

**Returns:**
V
### put(Object arg0, Object arg1) {#put-java.lang.Object-java.lang.Object-}
```
public synchronized Object put(Object arg0, Object arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
java.lang.Object
### putAll(Map<? extends K,? extends V> arg0) {#putAll-java.util.Map---extends-K---extends-V--}
```
public synchronized void putAll(Map<? extends K,? extends V> arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.util.Map<? extends K,? extends V> |  |

### putAll(Map<?,?> arg0) {#putAll-java.util.Map------}
```
public synchronized void putAll(Map<?,?> arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.util.Map<?,?> |  |

### putIfAbsent(K arg0, V arg1) {#putIfAbsent-K-V-}
```
public synchronized V putIfAbsent(K arg0, V arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | K |  |
| arg1 | V |  |

**Returns:**
V
### putIfAbsent(Object arg0, Object arg1) {#putIfAbsent-java.lang.Object-java.lang.Object-}
```
public synchronized Object putIfAbsent(Object arg0, Object arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
java.lang.Object
### remove(Object arg0) {#remove-java.lang.Object-}
```
public synchronized Object remove(Object arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
java.lang.Object
### remove(Object arg0, Object arg1) {#remove-java.lang.Object-java.lang.Object-}
```
public synchronized boolean remove(Object arg0, Object arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
boolean
### replace(K arg0, V arg1) {#replace-K-V-}
```
public synchronized V replace(K arg0, V arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | K |  |
| arg1 | V |  |

**Returns:**
V
### replace(K arg0, V arg1, V arg2) {#replace-K-V-V-}
```
public synchronized boolean replace(K arg0, V arg1, V arg2)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | K |  |
| arg1 | V |  |
| arg2 | V |  |

**Returns:**
boolean
### replace(Object arg0, Object arg1) {#replace-java.lang.Object-java.lang.Object-}
```
public synchronized Object replace(Object arg0, Object arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
java.lang.Object
### replace(Object arg0, Object arg1, Object arg2) {#replace-java.lang.Object-java.lang.Object-java.lang.Object-}
```
public synchronized boolean replace(Object arg0, Object arg1, Object arg2)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |
| arg2 | java.lang.Object |  |

**Returns:**
boolean
### replaceAll(BiFunction<? super K,? super V,? extends V> arg0) {#replaceAll-java.util.function.BiFunction---super-K---super-V---extends-V--}
```
public synchronized void replaceAll(BiFunction<? super K,? super V,? extends V> arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super K,? super V,? extends V> |  |

### replaceAll(BiFunction<? super Object,? super Object,?> arg0) {#replaceAll-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----}
```
public synchronized void replaceAll(BiFunction<? super Object,? super Object,?> arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super java.lang.Object,? super java.lang.Object,?> |  |

### save(OutputStream arg0, String arg1) {#save-java.io.OutputStream-java.lang.String-}
```
public void save(OutputStream arg0, String arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### setProperties(Properties properties) {#setProperties-java.util.Properties-}
```
public void setProperties(Properties properties)
```


प्रॉपर्टीज़ को कॉपी करता है, जिसमें उनके डिफ़ॉल्ट भी शामिल हैं, इस UserProperties में।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रॉपर्टीज़ | java.util.Properties | प्रॉपर्टीज़। |

### setProperty(String key, boolean value) {#setProperty-java.lang.String-boolean-}
```
public Object setProperty(String key, boolean value)
```


बूलियन प्रॉपर्टी का मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | boolean | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(String key, double value) {#setProperty-java.lang.String-double-}
```
public Object setProperty(String key, double value)
```


डबल प्रॉपर्टी का मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | double | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(String key, float value) {#setProperty-java.lang.String-float-}
```
public Object setProperty(String key, float value)
```


फ़्लोट प्रॉपर्टी का मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | float | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(String key, int value) {#setProperty-java.lang.String-int-}
```
public Object setProperty(String key, int value)
```


इंटीजर प्रॉपर्टी का मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | int | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(String key, Color value) {#setProperty-java.lang.String-java.awt.Color-}
```
public Object setProperty(String key, Color value)
```


रंग प्रॉपर्टी का मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | java.awt.Color | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(String key, Dimension value) {#setProperty-java.lang.String-java.awt.Dimension-}
```
public Object setProperty(String key, Dimension value)
```


आयाम प्रॉपर्टी का मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | java.awt.Dimension | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(String key, Insets value) {#setProperty-java.lang.String-java.awt.Insets-}
```
public Object setProperty(String key, Insets value)
```


इनसेट्स प्रॉपर्टी का मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | java.awt.Insets | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(String key, Rectangle value) {#setProperty-java.lang.String-java.awt.Rectangle-}
```
public Object setProperty(String key, Rectangle value)
```


रेक्टैंगल प्रॉपर्टी का मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | java.awt.Rectangle | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(String key, AffineTransform value) {#setProperty-java.lang.String-java.awt.geom.AffineTransform-}
```
public Object setProperty(String key, AffineTransform value)
```


मैट्रिक्स प्रॉपर्टी का मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | java.awt.geom.AffineTransform | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(String key, String value) {#setProperty-java.lang.String-java.lang.String-}
```
public Object setProperty(String key, String value)
```


स्ट्रिंग प्रॉपर्टी का मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | java.lang.String | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(String key, String[] value) {#setProperty-java.lang.String-java.lang.String---}
```
public Object setProperty(String key, String[] value)
```


स्ट्रिंग एरे प्रॉपर्टी का मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | java.lang.String[] | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(Properties properties, String key, boolean value) {#setProperty-java.util.Properties-java.lang.String-boolean-}
```
public static Object setProperty(Properties properties, String key, boolean value)
```


निर्दिष्ट प्रॉपर्टीज़ टेबल में बूलियन प्रॉपर्टी का मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रॉपर्टीज़ | java.util.Properties | प्रॉपर्टीज़ तालिका। |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | boolean | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(Properties properties, String key, double value) {#setProperty-java.util.Properties-java.lang.String-double-}
```
public static Object setProperty(Properties properties, String key, double value)
```


निर्दिष्ट प्रॉपर्टीज़ टेबल में डबल प्रॉपर्टी का मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रॉपर्टीज़ | java.util.Properties | प्रॉपर्टीज़ तालिका। |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | double | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(Properties properties, String key, float value) {#setProperty-java.util.Properties-java.lang.String-float-}
```
public static Object setProperty(Properties properties, String key, float value)
```


निर्दिष्ट प्रॉपर्टीज़ तालिका में float प्रॉपर्टी मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रॉपर्टीज़ | java.util.Properties | प्रॉपर्टीज़ तालिका। |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | float | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(Properties properties, String key, int value) {#setProperty-java.util.Properties-java.lang.String-int-}
```
public static Object setProperty(Properties properties, String key, int value)
```


निर्दिष्ट प्रॉपर्टीज़ तालिका में integer प्रॉपर्टी मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रॉपर्टीज़ | java.util.Properties | प्रॉपर्टीज़ तालिका। |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | int | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(Properties properties, String key, Color value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Color-}
```
public static Object setProperty(Properties properties, String key, Color value)
```


निर्दिष्ट प्रॉपर्टीज़ तालिका में color प्रॉपर्टी मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रॉपर्टीज़ | java.util.Properties | प्रॉपर्टीज़ तालिका। |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | java.awt.Color | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(Properties properties, String key, Dimension value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-}
```
public static Object setProperty(Properties properties, String key, Dimension value)
```


निर्दिष्ट प्रॉपर्टीज़ तालिका में dimension प्रॉपर्टी मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रॉपर्टीज़ | java.util.Properties | प्रॉपर्टीज़ तालिका। |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | java.awt.Dimension | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(Properties properties, String key, Insets value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-}
```
public static Object setProperty(Properties properties, String key, Insets value)
```


निर्दिष्ट प्रॉपर्टीज़ तालिका में insets प्रॉपर्टी मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रॉपर्टीज़ | java.util.Properties | प्रॉपर्टीज़ तालिका। |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | java.awt.Insets | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(Properties properties, String key, Rectangle value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-}
```
public static Object setProperty(Properties properties, String key, Rectangle value)
```


निर्दिष्ट प्रॉपर्टीज़ तालिका में rectangle प्रॉपर्टी मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रॉपर्टीज़ | java.util.Properties | प्रॉपर्टीज़ तालिका। |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | java.awt.Rectangle | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(Properties properties, String key, AffineTransform value) {#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-}
```
public static Object setProperty(Properties properties, String key, AffineTransform value)
```


निर्दिष्ट प्रॉपर्टीज़ तालिका में matrix प्रॉपर्टी मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रॉपर्टीज़ | java.util.Properties | प्रॉपर्टीज़ तालिका। |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | java.awt.geom.AffineTransform | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### setProperty(Properties properties, String key, String[] value) {#setProperty-java.util.Properties-java.lang.String-java.lang.String---}
```
public static Object setProperty(Properties properties, String key, String[] value)
```


निर्दिष्ट प्रॉपर्टीज़ तालिका में string array प्रॉपर्टी मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रॉपर्टीज़ | java.util.Properties | प्रॉपर्टीज़ तालिका। |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |
| मान | java.lang.String[] | प्रॉपर्टी का मान। |

**Returns:**
java.lang.Object - एक प्रॉपर्टी।
### size() {#size--}
```
public int size()
```




**Returns:**
int
### store(OutputStream arg0, String arg1) {#store-java.io.OutputStream-java.lang.String-}
```
public void store(OutputStream arg0, String arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### store(Writer arg0, String arg1) {#store-java.io.Writer-java.lang.String-}
```
public void store(Writer arg0, String arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.io.Writer |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1) {#storeToXML-java.io.OutputStream-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, String arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1, String arg2)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |
| arg2 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, Charset arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.nio.charset.Charset-}
```
public void storeToXML(OutputStream arg0, String arg1, Charset arg2)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |
| arg2 | java.nio.charset.Charset |  |

### stringPropertyNames() {#stringPropertyNames--}
```
public Set<String> stringPropertyNames()
```




**Returns:**
java.util.Set<java.lang.String>
### toString() {#toString--}
```
public synchronized String toString()
```




**Returns:**
java.lang.String
### values() {#values--}
```
public Collection<Object> values()
```




**Returns:**
java.util.Collection<java.lang.Object>
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

