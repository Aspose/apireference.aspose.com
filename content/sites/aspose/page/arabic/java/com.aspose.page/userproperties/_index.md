---
title: "UserProperties"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة خاصية خاصة تسمح بتعيين وإرجاع الخصائص ذات النوع."
type: docs
weight: 18
url: /ar/java/com.aspose.page/userproperties/
---
**Inheritance:**
java.lang.Object, java.util.Dictionary, java.util.Hashtable, java.util.Properties
```
public class UserProperties extends Properties
```

فئة خاصية خاصة تسمح بتعيين وإرجاع الخصائص ذات النوع المحدد. كما تسمح بربط كائنين خاصية افتراضيين للبحث إذا لم يحتوي كائن الخاصية هذا على الخاصية.
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [UserProperties()](#UserProperties--) | يُهيئ نسخة فارغة من فئة UserProperties. |
| [UserProperties(Properties defaults)](#UserProperties-java.util.Properties-) | يُهيئ فئة UserProperties بقيم افتراضية. |
| [UserProperties(Properties defaults, Properties altDefaults)](#UserProperties-java.util.Properties-java.util.Properties-) | يبني UserProperties بجدول defaults و altDefaults، يتم البحث فيهما بهذا الترتيب. |
## الطرق

| طريقة | الوصف |
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
| [getProperty(String key)](#getProperty-java.lang.String-) | يحصل على قيمة الخاصية النصية. |
| [getProperty(String key, String def)](#getProperty-java.lang.String-java.lang.String-) | يحصل على قيمة الخاصية النصية. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | يحصل على قيمة الخاصية color. |
| [getPropertyColor(String key, Color def)](#getPropertyColor-java.lang.String-java.awt.Color-) | يحصل على قيمة الخاصية color. |
| [getPropertyDimension(String key)](#getPropertyDimension-java.lang.String-) | يحصل على قيمة الخاصية dimension. |
| [getPropertyDimension(String key, Dimension def)](#getPropertyDimension-java.lang.String-java.awt.Dimension-) | يحصل على قيمة الخاصية dimension. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | يحصل على قيمة الخاصية double. |
| [getPropertyDouble(String key, double def)](#getPropertyDouble-java.lang.String-double-) | يحصل على قيمة الخاصية double. |
| [getPropertyFloat(String key)](#getPropertyFloat-java.lang.String-) | يحصل على قيمة الخاصية float. |
| [getPropertyFloat(String key, float def)](#getPropertyFloat-java.lang.String-float-) | يحصل على قيمة الخاصية float. |
| [getPropertyInsets(String key)](#getPropertyInsets-java.lang.String-) | يحصل على قيمة الخاصية insets. |
| [getPropertyInsets(String key, Insets def)](#getPropertyInsets-java.lang.String-java.awt.Insets-) | يحصل على قيمة الخاصية insets. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | يحصل على قيمة الخاصية integer. |
| [getPropertyInt(String key, int def)](#getPropertyInt-java.lang.String-int-) | يحصل على قيمة الخاصية integer. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | يحصل على قيمة الخاصية float. |
| [getPropertyMatrix(String key, AffineTransform def)](#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-) | يحصل على قيمة الخاصية float. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | يحصل على قيمة الخاصية rectangle. |
| [getPropertyRectangle(String key, Rectangle def)](#getPropertyRectangle-java.lang.String-java.awt.Rectangle-) | يحصل على قيمة الخاصية rectangle. |
| [getPropertyStringArray(String key)](#getPropertyStringArray-java.lang.String-) | يحصل على قيمة الخاصية string array. |
| [getPropertyStringArray(String key, String[] def)](#getPropertyStringArray-java.lang.String-java.lang.String---) | يحصل على قيمة الخاصية string array. |
| [hashCode()](#hashCode--) |  |
| [isEmpty()](#isEmpty--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | يحصل على قيمة الخاصية boolean. |
| [isProperty(String key, boolean def)](#isProperty-java.lang.String-boolean-) | يحصل على قيمة الخاصية boolean. |
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
| [printProperties()](#printProperties--) | يطبع جميع الخصائص المحددة. |
| [propertyNames()](#propertyNames--) | يعيد أسماء الخصائص. |
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
| [setProperties(Properties properties)](#setProperties-java.util.Properties-) | ينسخ الخصائص، بما في ذلك القيم الافتراضية، إلى هذا UserProperties |
| [setProperty(String key, boolean value)](#setProperty-java.lang.String-boolean-) | يضبط قيمة الخاصية boolean. |
| [setProperty(String key, double value)](#setProperty-java.lang.String-double-) | يضبط قيمة الخاصية double. |
| [setProperty(String key, float value)](#setProperty-java.lang.String-float-) | يضبط قيمة الخاصية float. |
| [setProperty(String key, int value)](#setProperty-java.lang.String-int-) | يضبط قيمة الخاصية integer. |
| [setProperty(String key, Color value)](#setProperty-java.lang.String-java.awt.Color-) | يضبط قيمة الخاصية color. |
| [setProperty(String key, Dimension value)](#setProperty-java.lang.String-java.awt.Dimension-) | يضبط قيمة الخاصية dimension. |
| [setProperty(String key, Insets value)](#setProperty-java.lang.String-java.awt.Insets-) | يضبط قيمة الخاصية insets. |
| [setProperty(String key, Rectangle value)](#setProperty-java.lang.String-java.awt.Rectangle-) | يضبط قيمة الخاصية rectangle. |
| [setProperty(String key, AffineTransform value)](#setProperty-java.lang.String-java.awt.geom.AffineTransform-) | يضبط قيمة الخاصية matrix. |
| [setProperty(String key, String value)](#setProperty-java.lang.String-java.lang.String-) | يضبط قيمة الخاصية string. |
| [setProperty(String key, String[] value)](#setProperty-java.lang.String-java.lang.String---) | يضبط قيمة الخاصية string array. |
| [setProperty(Properties properties, String key, boolean value)](#setProperty-java.util.Properties-java.lang.String-boolean-) | يضبط قيمة الخاصية boolean في جدول الخصائص المحدد. |
| [setProperty(Properties properties, String key, double value)](#setProperty-java.util.Properties-java.lang.String-double-) | يضبط قيمة الخاصية double في جدول الخصائص المحدد. |
| [setProperty(Properties properties, String key, float value)](#setProperty-java.util.Properties-java.lang.String-float-) | يضبط قيمة خاصية float في جدول الخصائص المحدد. |
| [setProperty(Properties properties, String key, int value)](#setProperty-java.util.Properties-java.lang.String-int-) | يضبط قيمة خاصية integer في جدول الخصائص المحدد. |
| [setProperty(Properties properties, String key, Color value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Color-) | يضبط قيمة خاصية اللون في جدول الخصائص المحدد. |
| [setProperty(Properties properties, String key, Dimension value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-) | يضبط قيمة خاصية الأبعاد في جدول الخصائص المحدد. |
| [setProperty(Properties properties, String key, Insets value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-) | يضبط قيمة خاصية الهوامش الداخلية في جدول الخصائص المحدد. |
| [setProperty(Properties properties, String key, Rectangle value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-) | يضبط قيمة خاصية المستطيل في جدول الخصائص المحدد. |
| [setProperty(Properties properties, String key, AffineTransform value)](#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-) | يضبط قيمة خاصية المصفوفة في جدول الخصائص المحدد. |
| [setProperty(Properties properties, String key, String[] value)](#setProperty-java.util.Properties-java.lang.String-java.lang.String---) | يضبط قيمة خاصية مصفوفة السلاسل في جدول الخصائص المحدد. |
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


يُهيئ نسخة فارغة من فئة UserProperties.

### UserProperties(Properties defaults) {#UserProperties-java.util.Properties-}
```
public UserProperties(Properties defaults)
```


يُهيئ فئة UserProperties بقيم افتراضية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الإعدادات الافتراضية | java.util.Properties | قيم الخصائص الافتراضية. |

### UserProperties(Properties defaults, Properties altDefaults) {#UserProperties-java.util.Properties-java.util.Properties-}
```
public UserProperties(Properties defaults, Properties altDefaults)
```


يبني UserProperties بجدول defaults و altDefaults، يتم البحث فيهما بهذا الترتيب.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الإعدادات الافتراضية | java.util.Properties | الخصائص الافتراضية. |
| altDefaults | java.util.Properties | الخصائص الافتراضية البديلة. |

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
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
منطقي
### containsKey(Object arg0) {#containsKey-java.lang.Object-}
```
public boolean containsKey(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
منطقي
### containsValue(Object arg0) {#containsValue-java.lang.Object-}
```
public boolean containsValue(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
منطقي
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
منطقي
### forEach(BiConsumer<? super K,? super V> arg0) {#forEach-java.util.function.BiConsumer---super-K---super-V--}
```
public synchronized void forEach(BiConsumer<? super K,? super V> arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super K,? super V> |  |

### forEach(BiConsumer<? super Object,? super Object> arg0) {#forEach-java.util.function.BiConsumer---super-java.lang.Object---super-java.lang.Object--}
```
public synchronized void forEach(BiConsumer<? super Object,? super Object> arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super java.lang.Object,? super java.lang.Object> |  |

### get(Object arg0) {#get-java.lang.Object-}
```
public Object get(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
java.lang.Object
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


يحصل على قيمة الخاصية النصية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
java.lang.String - قيمة الخاصية.
### getProperty(String key, String def) {#getProperty-java.lang.String-java.lang.String-}
```
public String getProperty(String key, String def)
```


يحصل على قيمة خاصية السلسلة. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| def | java.lang.String | القيمة الافتراضية للخاصية. |

**Returns:**
java.lang.String - قيمة الخاصية.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


يحصل على قيمة الخاصية color.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
java.awt.Color - قيمة الخاصية.
### getPropertyColor(String key, Color def) {#getPropertyColor-java.lang.String-java.awt.Color-}
```
public Color getPropertyColor(String key, Color def)
```


يحصل على قيمة خاصية اللون. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| def | java.awt.Color | القيمة الافتراضية للخاصية. |

**Returns:**
java.awt.Color - قيمة الخاصية.
### getPropertyDimension(String key) {#getPropertyDimension-java.lang.String-}
```
public Dimension getPropertyDimension(String key)
```


يحصل على قيمة الخاصية dimension.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
java.awt.Dimension - قيمة الخاصية.
### getPropertyDimension(String key, Dimension def) {#getPropertyDimension-java.lang.String-java.awt.Dimension-}
```
public Dimension getPropertyDimension(String key, Dimension def)
```


يحصل على قيمة خاصية البُعد. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| def | java.awt.Dimension | القيمة الافتراضية للخاصية. |

**Returns:**
java.awt.Dimension - قيمة الخاصية.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


يحصل على قيمة الخاصية double.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
double - قيمة الخاصية.
### getPropertyDouble(String key, double def) {#getPropertyDouble-java.lang.String-double-}
```
public double getPropertyDouble(String key, double def)
```


يحصل على قيمة خاصية double. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| def | double | القيمة الافتراضية للخاصية. |

**Returns:**
double - قيمة الخاصية.
### getPropertyFloat(String key) {#getPropertyFloat-java.lang.String-}
```
public float getPropertyFloat(String key)
```


يحصل على قيمة الخاصية float.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
float - قيمة الخاصية.
### getPropertyFloat(String key, float def) {#getPropertyFloat-java.lang.String-float-}
```
public float getPropertyFloat(String key, float def)
```


يحصل على قيمة خاصية float. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| def | float | القيمة الافتراضية للخاصية. |

**Returns:**
float - قيمة الخاصية.
### getPropertyInsets(String key) {#getPropertyInsets-java.lang.String-}
```
public Insets getPropertyInsets(String key)
```


يحصل على قيمة الخاصية insets.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
java.awt.Insets - قيمة الخاصية.
### getPropertyInsets(String key, Insets def) {#getPropertyInsets-java.lang.String-java.awt.Insets-}
```
public Insets getPropertyInsets(String key, Insets def)
```


يحصل على قيمة خاصية الهوامش الداخلية. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| def | java.awt.Insets | القيمة الافتراضية للخاصية. |

**Returns:**
java.awt.Insets - قيمة الخاصية.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


يحصل على قيمة الخاصية integer.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
int - قيمة الخاصية.
### getPropertyInt(String key, int def) {#getPropertyInt-java.lang.String-int-}
```
public int getPropertyInt(String key, int def)
```


يحصل على قيمة خاصية عدد صحيح. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| def | int | القيمة الافتراضية للخاصية. |

**Returns:**
int - قيمة الخاصية.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


يحصل على قيمة الخاصية float.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
java.awt.geom.AffineTransform - قيمة الخاصية.
### getPropertyMatrix(String key, AffineTransform def) {#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-}
```
public AffineTransform getPropertyMatrix(String key, AffineTransform def)
```


يحصل على قيمة خاصية float. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| def | java.awt.geom.AffineTransform | القيمة الافتراضية للخاصية. |

**Returns:**
java.awt.geom.AffineTransform - قيمة الخاصية.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


يحصل على قيمة الخاصية rectangle.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
java.awt.Rectangle - قيمة الخاصية.
### getPropertyRectangle(String key, Rectangle def) {#getPropertyRectangle-java.lang.String-java.awt.Rectangle-}
```
public Rectangle getPropertyRectangle(String key, Rectangle def)
```


يحصل على قيمة خاصية المستطيل. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| def | java.awt.Rectangle | القيمة الافتراضية للخاصية. |

**Returns:**
java.awt.Rectangle - قيمة الخاصية.
### getPropertyStringArray(String key) {#getPropertyStringArray-java.lang.String-}
```
public String[] getPropertyStringArray(String key)
```


يحصل على قيمة الخاصية string array.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
java.lang.String[] - قيمة الخاصية.
### getPropertyStringArray(String key, String[] def) {#getPropertyStringArray-java.lang.String-java.lang.String---}
```
public String[] getPropertyStringArray(String key, String[] def)
```


يحصل على قيمة خاصية مصفوفة السلاسل. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| def | java.lang.String[] | القيمة الافتراضية للخاصية. |

**Returns:**
java.lang.String[] - قيمة الخاصية.
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
منطقي
### isProperty(String key) {#isProperty-java.lang.String-}
```
public boolean isProperty(String key)
```


يحصل على قيمة الخاصية boolean.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
boolean - قيمة الخاصية.
### isProperty(String key, boolean def) {#isProperty-java.lang.String-boolean-}
```
public boolean isProperty(String key, boolean def)
```


يحصل على قيمة خاصية منطقية. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| def | منطقي | القيمة الافتراضية للخاصية. |

**Returns:**
boolean - قيمة الخاصية.
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.io.PrintStream |  |

### list(PrintWriter arg0) {#list-java.io.PrintWriter-}
```
public void list(PrintWriter arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.io.PrintWriter |  |

### load(InputStream arg0) {#load-java.io.InputStream-}
```
public synchronized void load(InputStream arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### load(Reader arg0) {#load-java.io.Reader-}
```
public synchronized void load(Reader arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.io.Reader |  |

### loadFromXML(InputStream arg0) {#loadFromXML-java.io.InputStream-}
```
public synchronized void loadFromXML(InputStream arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2) {#merge-K-V-java.util.function.BiFunction---super-V---super-V---extends-V--}
```
public synchronized V merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2)
```




**Parameters:**
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
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


يطبع جميع الخصائص المحددة.

### propertyNames() {#propertyNames--}
```
public Enumeration propertyNames()
```


يعيد أسماء الخصائص.

**Returns:**
java.util.Enumeration - تعداد أسماء الخصائص.
### put(K arg0, V arg1) {#put-K-V-}
```
public synchronized V put(K arg0, V arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.util.Map<? extends K,? extends V> |  |

### putAll(Map<?,?> arg0) {#putAll-java.util.Map------}
```
public synchronized void putAll(Map<?,?> arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.util.Map<?,?> |  |

### putIfAbsent(K arg0, V arg1) {#putIfAbsent-K-V-}
```
public synchronized V putIfAbsent(K arg0, V arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
java.lang.Object
### remove(Object arg0, Object arg1) {#remove-java.lang.Object-java.lang.Object-}
```
public synchronized boolean remove(Object arg0, Object arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
منطقي
### replace(K arg0, V arg1) {#replace-K-V-}
```
public synchronized V replace(K arg0, V arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | K |  |
| arg1 | V |  |
| arg2 | V |  |

**Returns:**
منطقي
### replace(Object arg0, Object arg1) {#replace-java.lang.Object-java.lang.Object-}
```
public synchronized Object replace(Object arg0, Object arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |
| arg2 | java.lang.Object |  |

**Returns:**
منطقي
### replaceAll(BiFunction<? super K,? super V,? extends V> arg0) {#replaceAll-java.util.function.BiFunction---super-K---super-V---extends-V--}
```
public synchronized void replaceAll(BiFunction<? super K,? super V,? extends V> arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super K,? super V,? extends V> |  |

### replaceAll(BiFunction<? super Object,? super Object,?> arg0) {#replaceAll-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----}
```
public synchronized void replaceAll(BiFunction<? super Object,? super Object,?> arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super java.lang.Object,? super java.lang.Object,?> |  |

### save(OutputStream arg0, String arg1) {#save-java.io.OutputStream-java.lang.String-}
```
public void save(OutputStream arg0, String arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### setProperties(Properties properties) {#setProperties-java.util.Properties-}
```
public void setProperties(Properties properties)
```


ينسخ الخصائص، بما في ذلك القيم الافتراضية، إلى هذا UserProperties

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الخصائص | java.util.Properties | الخصائص. |

### setProperty(String key, boolean value) {#setProperty-java.lang.String-boolean-}
```
public Object setProperty(String key, boolean value)
```


يضبط قيمة الخاصية boolean.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | منطقي | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(String key, double value) {#setProperty-java.lang.String-double-}
```
public Object setProperty(String key, double value)
```


يضبط قيمة الخاصية double.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | double | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(String key, float value) {#setProperty-java.lang.String-float-}
```
public Object setProperty(String key, float value)
```


يضبط قيمة الخاصية float.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | float | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(String key, int value) {#setProperty-java.lang.String-int-}
```
public Object setProperty(String key, int value)
```


يضبط قيمة الخاصية integer.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | int | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(String key, Color value) {#setProperty-java.lang.String-java.awt.Color-}
```
public Object setProperty(String key, Color value)
```


يضبط قيمة الخاصية color.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | java.awt.Color | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(String key, Dimension value) {#setProperty-java.lang.String-java.awt.Dimension-}
```
public Object setProperty(String key, Dimension value)
```


يضبط قيمة الخاصية dimension.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | java.awt.Dimension | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(String key, Insets value) {#setProperty-java.lang.String-java.awt.Insets-}
```
public Object setProperty(String key, Insets value)
```


يضبط قيمة الخاصية insets.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | java.awt.Insets | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(String key, Rectangle value) {#setProperty-java.lang.String-java.awt.Rectangle-}
```
public Object setProperty(String key, Rectangle value)
```


يضبط قيمة الخاصية rectangle.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | java.awt.Rectangle | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(String key, AffineTransform value) {#setProperty-java.lang.String-java.awt.geom.AffineTransform-}
```
public Object setProperty(String key, AffineTransform value)
```


يضبط قيمة الخاصية matrix.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | java.awt.geom.AffineTransform | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(String key, String value) {#setProperty-java.lang.String-java.lang.String-}
```
public Object setProperty(String key, String value)
```


يضبط قيمة الخاصية string.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | java.lang.String | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(String key, String[] value) {#setProperty-java.lang.String-java.lang.String---}
```
public Object setProperty(String key, String[] value)
```


يضبط قيمة الخاصية string array.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | java.lang.String[] | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(Properties properties, String key, boolean value) {#setProperty-java.util.Properties-java.lang.String-boolean-}
```
public static Object setProperty(Properties properties, String key, boolean value)
```


يضبط قيمة الخاصية boolean في جدول الخصائص المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الخصائص | java.util.Properties | جدول الخصائص. |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | منطقي | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(Properties properties, String key, double value) {#setProperty-java.util.Properties-java.lang.String-double-}
```
public static Object setProperty(Properties properties, String key, double value)
```


يضبط قيمة الخاصية double في جدول الخصائص المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الخصائص | java.util.Properties | جدول الخصائص. |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | double | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(Properties properties, String key, float value) {#setProperty-java.util.Properties-java.lang.String-float-}
```
public static Object setProperty(Properties properties, String key, float value)
```


يضبط قيمة خاصية float في جدول الخصائص المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الخصائص | java.util.Properties | جدول الخصائص. |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | float | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(Properties properties, String key, int value) {#setProperty-java.util.Properties-java.lang.String-int-}
```
public static Object setProperty(Properties properties, String key, int value)
```


يضبط قيمة خاصية integer في جدول الخصائص المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الخصائص | java.util.Properties | جدول الخصائص. |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | int | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(Properties properties, String key, Color value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Color-}
```
public static Object setProperty(Properties properties, String key, Color value)
```


يضبط قيمة خاصية اللون في جدول الخصائص المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الخصائص | java.util.Properties | جدول الخصائص. |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | java.awt.Color | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(Properties properties, String key, Dimension value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-}
```
public static Object setProperty(Properties properties, String key, Dimension value)
```


يضبط قيمة خاصية الأبعاد في جدول الخصائص المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الخصائص | java.util.Properties | جدول الخصائص. |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | java.awt.Dimension | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(Properties properties, String key, Insets value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-}
```
public static Object setProperty(Properties properties, String key, Insets value)
```


يضبط قيمة خاصية الهوامش الداخلية في جدول الخصائص المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الخصائص | java.util.Properties | جدول الخصائص. |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | java.awt.Insets | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(Properties properties, String key, Rectangle value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-}
```
public static Object setProperty(Properties properties, String key, Rectangle value)
```


يضبط قيمة خاصية المستطيل في جدول الخصائص المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الخصائص | java.util.Properties | جدول الخصائص. |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | java.awt.Rectangle | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(Properties properties, String key, AffineTransform value) {#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-}
```
public static Object setProperty(Properties properties, String key, AffineTransform value)
```


يضبط قيمة خاصية المصفوفة في جدول الخصائص المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الخصائص | java.util.Properties | جدول الخصائص. |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | java.awt.geom.AffineTransform | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
### setProperty(Properties properties, String key, String[] value) {#setProperty-java.util.Properties-java.lang.String-java.lang.String---}
```
public static Object setProperty(Properties properties, String key, String[] value)
```


يضبط قيمة خاصية مصفوفة السلاسل في جدول الخصائص المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الخصائص | java.util.Properties | جدول الخصائص. |
| المفتاح | java.lang.String | اسم الخاصية. |
| القيمة | java.lang.String[] | قيمة الخاصية. |

**Returns:**
java.lang.Object - خاصية.
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### store(Writer arg0, String arg1) {#store-java.io.Writer-java.lang.String-}
```
public void store(Writer arg0, String arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.io.Writer |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1) {#storeToXML-java.io.OutputStream-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, String arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1, String arg2)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |
| arg2 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, Charset arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.nio.charset.Charset-}
```
public void storeToXML(OutputStream arg0, String arg1, Charset arg2)
```




**Parameters:**
| معامل | نوع | الوصف |
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

