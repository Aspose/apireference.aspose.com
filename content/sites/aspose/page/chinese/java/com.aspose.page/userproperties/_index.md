---
title: "UserProperties"
second_title: "Aspose.Page for Java API 参考"
description: "特殊属性类，允许设置和返回类型化属性。"
type: docs
weight: 18
url: /zh/java/com.aspose.page/userproperties/
---
**Inheritance:**
java.lang.Object, java.util.Dictionary, java.util.Hashtable, java.util.Properties
```
public class UserProperties extends Properties
```

特殊属性类，允许设置和返回类型化属性。如果该属性对象不包含某属性，还可以挂接两个默认属性对象进行搜索。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [UserProperties()](#UserProperties--) | 初始化 UserProperties 类的空实例。 |
| [UserProperties(Properties defaults)](#UserProperties-java.util.Properties-) | 使用默认值初始化 UserProperties 类的实例。 |
| [UserProperties(Properties defaults, Properties altDefaults)](#UserProperties-java.util.Properties-java.util.Properties-) | 构造 UserProperties，使用 defaults 和 altDefaults 表，按该顺序进行搜索。 |
## 方法

| 方法 | 描述 |
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
| [getProperty(String key)](#getProperty-java.lang.String-) | 获取字符串属性值。 |
| [getProperty(String key, String def)](#getProperty-java.lang.String-java.lang.String-) | 获取字符串属性值。 |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | 获取颜色属性值。 |
| [getPropertyColor(String key, Color def)](#getPropertyColor-java.lang.String-java.awt.Color-) | 获取颜色属性值。 |
| [getPropertyDimension(String key)](#getPropertyDimension-java.lang.String-) | 获取尺寸属性值。 |
| [getPropertyDimension(String key, Dimension def)](#getPropertyDimension-java.lang.String-java.awt.Dimension-) | 获取尺寸属性值。 |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | 获取 double 属性值。 |
| [getPropertyDouble(String key, double def)](#getPropertyDouble-java.lang.String-double-) | 获取 double 属性值。 |
| [getPropertyFloat(String key)](#getPropertyFloat-java.lang.String-) | 获取 float 属性值。 |
| [getPropertyFloat(String key, float def)](#getPropertyFloat-java.lang.String-float-) | 获取 float 属性值。 |
| [getPropertyInsets(String key)](#getPropertyInsets-java.lang.String-) | 获取 insets 属性值。 |
| [getPropertyInsets(String key, Insets def)](#getPropertyInsets-java.lang.String-java.awt.Insets-) | 获取 insets 属性值。 |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | 获取 integer 属性值。 |
| [getPropertyInt(String key, int def)](#getPropertyInt-java.lang.String-int-) | 获取 integer 属性值。 |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | 获取 float 属性值。 |
| [getPropertyMatrix(String key, AffineTransform def)](#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-) | 获取 float 属性值。 |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | 获取 rectangle 属性值。 |
| [getPropertyRectangle(String key, Rectangle def)](#getPropertyRectangle-java.lang.String-java.awt.Rectangle-) | 获取 rectangle 属性值。 |
| [getPropertyStringArray(String key)](#getPropertyStringArray-java.lang.String-) | 获取 string array 属性值。 |
| [getPropertyStringArray(String key, String[] def)](#getPropertyStringArray-java.lang.String-java.lang.String---) | 获取 string array 属性值。 |
| [hashCode()](#hashCode--) |  |
| [isEmpty()](#isEmpty--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | 获取 boolean 属性值。 |
| [isProperty(String key, boolean def)](#isProperty-java.lang.String-boolean-) | 获取 boolean 属性值。 |
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
| [printProperties()](#printProperties--) | 打印所有已设置的属性。 |
| [propertyNames()](#propertyNames--) | 返回属性名称。 |
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
| [setProperties(Properties properties)](#setProperties-java.util.Properties-) | 复制属性，包括其默认值到此 UserProperties。 |
| [setProperty(String key, boolean value)](#setProperty-java.lang.String-boolean-) | 设置 boolean 属性值。 |
| [setProperty(String key, double value)](#setProperty-java.lang.String-double-) | 设置 double 属性值。 |
| [setProperty(String key, float value)](#setProperty-java.lang.String-float-) | 设置 float 属性值。 |
| [setProperty(String key, int value)](#setProperty-java.lang.String-int-) | 设置 integer 属性值。 |
| [setProperty(String key, Color value)](#setProperty-java.lang.String-java.awt.Color-) | 设置颜色属性值。 |
| [setProperty(String key, Dimension value)](#setProperty-java.lang.String-java.awt.Dimension-) | 设置尺寸属性值。 |
| [setProperty(String key, Insets value)](#setProperty-java.lang.String-java.awt.Insets-) | 设置 insets 属性值。 |
| [setProperty(String key, Rectangle value)](#setProperty-java.lang.String-java.awt.Rectangle-) | 设置 rectangle 属性值。 |
| [setProperty(String key, AffineTransform value)](#setProperty-java.lang.String-java.awt.geom.AffineTransform-) | 设置 matrix 属性值。 |
| [setProperty(String key, String value)](#setProperty-java.lang.String-java.lang.String-) | 设置 string 属性值。 |
| [setProperty(String key, String[] value)](#setProperty-java.lang.String-java.lang.String---) | 设置 string array 属性值。 |
| [setProperty(Properties properties, String key, boolean value)](#setProperty-java.util.Properties-java.lang.String-boolean-) | 在指定的属性表中设置 boolean 属性值。 |
| [setProperty(Properties properties, String key, double value)](#setProperty-java.util.Properties-java.lang.String-double-) | 在指定的属性表中设置 double 属性值。 |
| [setProperty(Properties properties, String key, float value)](#setProperty-java.util.Properties-java.lang.String-float-) | 在指定的属性表中设置 float 属性值。 |
| [setProperty(Properties properties, String key, int value)](#setProperty-java.util.Properties-java.lang.String-int-) | 在指定的属性表中设置 integer 属性值。 |
| [setProperty(Properties properties, String key, Color value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Color-) | 在指定的属性表中设置 color 属性值。 |
| [setProperty(Properties properties, String key, Dimension value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-) | 在指定的属性表中设置 dimension 属性值。 |
| [setProperty(Properties properties, String key, Insets value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-) | 在指定的属性表中设置 insets 属性值。 |
| [setProperty(Properties properties, String key, Rectangle value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-) | 在指定的属性表中设置 rectangle 属性值。 |
| [setProperty(Properties properties, String key, AffineTransform value)](#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-) | 在指定的属性表中设置 matrix 属性值。 |
| [setProperty(Properties properties, String key, String[] value)](#setProperty-java.util.Properties-java.lang.String-java.lang.String---) | 在指定的属性表中设置 string array 属性值。 |
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


初始化 UserProperties 类的空实例。

### UserProperties(Properties defaults) {#UserProperties-java.util.Properties-}
```
public UserProperties(Properties defaults)
```


使用默认值初始化 UserProperties 类的实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 默认值 | java.util.Properties | 默认属性值。 |

### UserProperties(Properties defaults, Properties altDefaults) {#UserProperties-java.util.Properties-java.util.Properties-}
```
public UserProperties(Properties defaults, Properties altDefaults)
```


构造 UserProperties，使用 defaults 和 altDefaults 表，按该顺序进行搜索。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 默认值 | java.util.Properties | 默认属性。 |
| altDefaults | java.util.Properties | 替代默认属性。 |

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
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsKey(Object arg0) {#containsKey-java.lang.Object-}
```
public boolean containsKey(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsValue(Object arg0) {#containsValue-java.lang.Object-}
```
public boolean containsValue(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### forEach(BiConsumer<? super K,? super V> arg0) {#forEach-java.util.function.BiConsumer---super-K---super-V--}
```
public synchronized void forEach(BiConsumer<? super K,? super V> arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super K,? super V> |  |

### forEach(BiConsumer<? super Object,? super Object> arg0) {#forEach-java.util.function.BiConsumer---super-java.lang.Object---super-java.lang.Object--}
```
public synchronized void forEach(BiConsumer<? super Object,? super Object> arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super java.lang.Object,? super java.lang.Object> |  |

### get(Object arg0) {#get-java.lang.Object-}
```
public Object get(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
java.lang.Object
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


获取字符串属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
java.lang.String - 属性值。
### getProperty(String key, String def) {#getProperty-java.lang.String-java.lang.String-}
```
public String getProperty(String key, String def)
```


获取字符串属性值。如果请求的属性不存在，则返回提供的默认值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| def | java.lang.String | 属性的默认值。 |

**Returns:**
java.lang.String - 属性值。
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


获取颜色属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
java.awt.Color - 属性值。
### getPropertyColor(String key, Color def) {#getPropertyColor-java.lang.String-java.awt.Color-}
```
public Color getPropertyColor(String key, Color def)
```


获取颜色属性值。如果请求的属性不存在，则返回提供的默认值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| def | java.awt.Color | 属性的默认值。 |

**Returns:**
java.awt.Color - 属性值。
### getPropertyDimension(String key) {#getPropertyDimension-java.lang.String-}
```
public Dimension getPropertyDimension(String key)
```


获取尺寸属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
java.awt.Dimension - 属性值。
### getPropertyDimension(String key, Dimension def) {#getPropertyDimension-java.lang.String-java.awt.Dimension-}
```
public Dimension getPropertyDimension(String key, Dimension def)
```


获取尺寸属性值。如果请求的属性不存在，则返回提供的默认值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| def | java.awt.Dimension | 属性的默认值。 |

**Returns:**
java.awt.Dimension - 属性值。
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


获取 double 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
double - 属性值。
### getPropertyDouble(String key, double def) {#getPropertyDouble-java.lang.String-double-}
```
public double getPropertyDouble(String key, double def)
```


获取 double 属性值。如果请求的属性不存在，则返回提供的默认值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| def | double | 属性的默认值。 |

**Returns:**
double - 属性值。
### getPropertyFloat(String key) {#getPropertyFloat-java.lang.String-}
```
public float getPropertyFloat(String key)
```


获取 float 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
float - 属性值。
### getPropertyFloat(String key, float def) {#getPropertyFloat-java.lang.String-float-}
```
public float getPropertyFloat(String key, float def)
```


获取 float 属性值。如果请求的属性不存在，则返回提供的默认值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| def | float | 属性的默认值。 |

**Returns:**
float - 属性值。
### getPropertyInsets(String key) {#getPropertyInsets-java.lang.String-}
```
public Insets getPropertyInsets(String key)
```


获取 insets 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
java.awt.Insets - 属性值。
### getPropertyInsets(String key, Insets def) {#getPropertyInsets-java.lang.String-java.awt.Insets-}
```
public Insets getPropertyInsets(String key, Insets def)
```


获取 Insets 属性值。如果请求的属性不存在，则返回提供的默认值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| def | java.awt.Insets | 属性的默认值。 |

**Returns:**
java.awt.Insets - 属性值。
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


获取 integer 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
int - 属性值。
### getPropertyInt(String key, int def) {#getPropertyInt-java.lang.String-int-}
```
public int getPropertyInt(String key, int def)
```


获取整数属性值。如果请求的属性不存在，则返回提供的默认值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| def | int | 属性的默认值。 |

**Returns:**
int - 属性值。
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


获取 float 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
java.awt.geom.AffineTransform - 属性值。
### getPropertyMatrix(String key, AffineTransform def) {#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-}
```
public AffineTransform getPropertyMatrix(String key, AffineTransform def)
```


获取 float 属性值。如果请求的属性不存在，则返回提供的默认值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| def | java.awt.geom.AffineTransform | 属性的默认值。 |

**Returns:**
java.awt.geom.AffineTransform - 属性值。
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


获取 rectangle 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
java.awt.Rectangle - 属性值。
### getPropertyRectangle(String key, Rectangle def) {#getPropertyRectangle-java.lang.String-java.awt.Rectangle-}
```
public Rectangle getPropertyRectangle(String key, Rectangle def)
```


获取矩形属性值。如果请求的属性不存在，则返回提供的默认值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| def | java.awt.Rectangle | 属性的默认值。 |

**Returns:**
java.awt.Rectangle - 属性值。
### getPropertyStringArray(String key) {#getPropertyStringArray-java.lang.String-}
```
public String[] getPropertyStringArray(String key)
```


获取 string array 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
java.lang.String[] - 属性值。
### getPropertyStringArray(String key, String[] def) {#getPropertyStringArray-java.lang.String-java.lang.String---}
```
public String[] getPropertyStringArray(String key, String[] def)
```


获取字符串数组属性值。如果请求的属性不存在，则返回提供的默认值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| def | java.lang.String[] | 属性的默认值。 |

**Returns:**
java.lang.String[] - 属性值。
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


获取 boolean 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
boolean - 属性值。
### isProperty(String key, boolean def) {#isProperty-java.lang.String-boolean-}
```
public boolean isProperty(String key, boolean def)
```


获取布尔属性值。如果请求的属性不存在，则返回提供的默认值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| def | boolean | 属性的默认值。 |

**Returns:**
boolean - 属性值。
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.io.PrintStream |  |

### list(PrintWriter arg0) {#list-java.io.PrintWriter-}
```
public void list(PrintWriter arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.io.PrintWriter |  |

### load(InputStream arg0) {#load-java.io.InputStream-}
```
public synchronized void load(InputStream arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### load(Reader arg0) {#load-java.io.Reader-}
```
public synchronized void load(Reader arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.io.Reader |  |

### loadFromXML(InputStream arg0) {#loadFromXML-java.io.InputStream-}
```
public synchronized void loadFromXML(InputStream arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2) {#merge-K-V-java.util.function.BiFunction---super-V---super-V---extends-V--}
```
public synchronized V merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2)
```




**Parameters:**
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
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


打印所有已设置的属性。

### propertyNames() {#propertyNames--}
```
public Enumeration propertyNames()
```


返回属性名称。

**Returns:**
java.util.Enumeration - 属性名称的枚举。
### put(K arg0, V arg1) {#put-K-V-}
```
public synchronized V put(K arg0, V arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.util.Map<? extends K,? extends V> |  |

### putAll(Map<?,?> arg0) {#putAll-java.util.Map------}
```
public synchronized void putAll(Map<?,?> arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.util.Map<?,?> |  |

### putIfAbsent(K arg0, V arg1) {#putIfAbsent-K-V-}
```
public synchronized V putIfAbsent(K arg0, V arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
java.lang.Object
### remove(Object arg0, Object arg1) {#remove-java.lang.Object-java.lang.Object-}
```
public synchronized boolean remove(Object arg0, Object arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super K,? super V,? extends V> |  |

### replaceAll(BiFunction<? super Object,? super Object,?> arg0) {#replaceAll-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----}
```
public synchronized void replaceAll(BiFunction<? super Object,? super Object,?> arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super java.lang.Object,? super java.lang.Object,?> |  |

### save(OutputStream arg0, String arg1) {#save-java.io.OutputStream-java.lang.String-}
```
public void save(OutputStream arg0, String arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### setProperties(Properties properties) {#setProperties-java.util.Properties-}
```
public void setProperties(Properties properties)
```


复制属性，包括其默认值到此 UserProperties。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 属性 | java.util.Properties | 属性。 |

### setProperty(String key, boolean value) {#setProperty-java.lang.String-boolean-}
```
public Object setProperty(String key, boolean value)
```


设置 boolean 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| 值 | boolean | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(String key, double value) {#setProperty-java.lang.String-double-}
```
public Object setProperty(String key, double value)
```


设置 double 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| 值 | double | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(String key, float value) {#setProperty-java.lang.String-float-}
```
public Object setProperty(String key, float value)
```


设置 float 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| 值 | float | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(String key, int value) {#setProperty-java.lang.String-int-}
```
public Object setProperty(String key, int value)
```


设置 integer 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| 值 | int | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(String key, Color value) {#setProperty-java.lang.String-java.awt.Color-}
```
public Object setProperty(String key, Color value)
```


设置颜色属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| 值 | java.awt.Color | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(String key, Dimension value) {#setProperty-java.lang.String-java.awt.Dimension-}
```
public Object setProperty(String key, Dimension value)
```


设置尺寸属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| 值 | java.awt.Dimension | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(String key, Insets value) {#setProperty-java.lang.String-java.awt.Insets-}
```
public Object setProperty(String key, Insets value)
```


设置 insets 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| 值 | java.awt.Insets | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(String key, Rectangle value) {#setProperty-java.lang.String-java.awt.Rectangle-}
```
public Object setProperty(String key, Rectangle value)
```


设置 rectangle 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| 值 | java.awt.Rectangle | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(String key, AffineTransform value) {#setProperty-java.lang.String-java.awt.geom.AffineTransform-}
```
public Object setProperty(String key, AffineTransform value)
```


设置 matrix 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| 值 | java.awt.geom.AffineTransform | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(String key, String value) {#setProperty-java.lang.String-java.lang.String-}
```
public Object setProperty(String key, String value)
```


设置 string 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| 值 | java.lang.String | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(String key, String[] value) {#setProperty-java.lang.String-java.lang.String---}
```
public Object setProperty(String key, String[] value)
```


设置 string array 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |
| 值 | java.lang.String[] | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(Properties properties, String key, boolean value) {#setProperty-java.util.Properties-java.lang.String-boolean-}
```
public static Object setProperty(Properties properties, String key, boolean value)
```


在指定的属性表中设置 boolean 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 属性 | java.util.Properties | 属性表。 |
| 键 | java.lang.String | 属性的名称。 |
| 值 | boolean | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(Properties properties, String key, double value) {#setProperty-java.util.Properties-java.lang.String-double-}
```
public static Object setProperty(Properties properties, String key, double value)
```


在指定的属性表中设置 double 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 属性 | java.util.Properties | 属性表。 |
| 键 | java.lang.String | 属性的名称。 |
| 值 | double | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(Properties properties, String key, float value) {#setProperty-java.util.Properties-java.lang.String-float-}
```
public static Object setProperty(Properties properties, String key, float value)
```


在指定的属性表中设置 float 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 属性 | java.util.Properties | 属性表。 |
| 键 | java.lang.String | 属性的名称。 |
| 值 | float | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(Properties properties, String key, int value) {#setProperty-java.util.Properties-java.lang.String-int-}
```
public static Object setProperty(Properties properties, String key, int value)
```


在指定的属性表中设置 integer 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 属性 | java.util.Properties | 属性表。 |
| 键 | java.lang.String | 属性的名称。 |
| 值 | int | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(Properties properties, String key, Color value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Color-}
```
public static Object setProperty(Properties properties, String key, Color value)
```


在指定的属性表中设置 color 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 属性 | java.util.Properties | 属性表。 |
| 键 | java.lang.String | 属性的名称。 |
| 值 | java.awt.Color | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(Properties properties, String key, Dimension value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-}
```
public static Object setProperty(Properties properties, String key, Dimension value)
```


在指定的属性表中设置 dimension 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 属性 | java.util.Properties | 属性表。 |
| 键 | java.lang.String | 属性的名称。 |
| 值 | java.awt.Dimension | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(Properties properties, String key, Insets value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-}
```
public static Object setProperty(Properties properties, String key, Insets value)
```


在指定的属性表中设置 insets 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 属性 | java.util.Properties | 属性表。 |
| 键 | java.lang.String | 属性的名称。 |
| 值 | java.awt.Insets | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(Properties properties, String key, Rectangle value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-}
```
public static Object setProperty(Properties properties, String key, Rectangle value)
```


在指定的属性表中设置 rectangle 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 属性 | java.util.Properties | 属性表。 |
| 键 | java.lang.String | 属性的名称。 |
| 值 | java.awt.Rectangle | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(Properties properties, String key, AffineTransform value) {#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-}
```
public static Object setProperty(Properties properties, String key, AffineTransform value)
```


在指定的属性表中设置 matrix 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 属性 | java.util.Properties | 属性表。 |
| 键 | java.lang.String | 属性的名称。 |
| 值 | java.awt.geom.AffineTransform | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
### setProperty(Properties properties, String key, String[] value) {#setProperty-java.util.Properties-java.lang.String-java.lang.String---}
```
public static Object setProperty(Properties properties, String key, String[] value)
```


在指定的属性表中设置 string array 属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 属性 | java.util.Properties | 属性表。 |
| 键 | java.lang.String | 属性的名称。 |
| 值 | java.lang.String[] | 属性的值。 |

**Returns:**
java.lang.Object - 一个属性。
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### store(Writer arg0, String arg1) {#store-java.io.Writer-java.lang.String-}
```
public void store(Writer arg0, String arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.io.Writer |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1) {#storeToXML-java.io.OutputStream-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, String arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1, String arg2)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |
| arg2 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, Charset arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.nio.charset.Charset-}
```
public void storeToXML(OutputStream arg0, String arg1, Charset arg2)
```




**Parameters:**
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

