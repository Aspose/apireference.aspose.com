---
title: UserProperties
second_title: Aspose.Page for Java API Reference
description: Special property class which allows typed properties to be set and returned.
type: docs
weight: 18
url: /java/com.aspose.page/userproperties/
---
**Inheritance:**
java.lang.Object, java.util.Dictionary, java.util.Hashtable, java.util.Properties
```
public class UserProperties extends Properties
```

Special property class which allows typed properties to be set and returned. It also allows the hookup of two default property objects to be searched if this property object does not contain the property.
## Constructors

| Constructor | Description |
| --- | --- |
| [UserProperties()](#UserProperties--) | Initializes an empty instance of UserProperties class. |
| [UserProperties(Properties defaults)](#UserProperties-java.util.Properties-) | Initializes an of UserProperties class with default values. |
| [UserProperties(Properties defaults, Properties altDefaults)](#UserProperties-java.util.Properties-java.util.Properties-) | Constructs UserProperties with a defaults and altDefaults table, which are searched in that order. |
## Methods

| Method | Description |
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
| [getProperty(String key)](#getProperty-java.lang.String-) | Gets string property value. |
| [getProperty(String key, String def)](#getProperty-java.lang.String-java.lang.String-) | Gets string property value. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Gets color property value. |
| [getPropertyColor(String key, Color def)](#getPropertyColor-java.lang.String-java.awt.Color-) | Gets color property value. |
| [getPropertyDimension(String key)](#getPropertyDimension-java.lang.String-) | Gets dimension property value. |
| [getPropertyDimension(String key, Dimension def)](#getPropertyDimension-java.lang.String-java.awt.Dimension-) | Gets dimension property value. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Gets double property value. |
| [getPropertyDouble(String key, double def)](#getPropertyDouble-java.lang.String-double-) | Gets double property value. |
| [getPropertyFloat(String key)](#getPropertyFloat-java.lang.String-) | Gets float property value. |
| [getPropertyFloat(String key, float def)](#getPropertyFloat-java.lang.String-float-) | Gets float property value. |
| [getPropertyInsets(String key)](#getPropertyInsets-java.lang.String-) | Gets insets property value. |
| [getPropertyInsets(String key, Insets def)](#getPropertyInsets-java.lang.String-java.awt.Insets-) | Gets insets property value. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Gets integer property value. |
| [getPropertyInt(String key, int def)](#getPropertyInt-java.lang.String-int-) | Gets integer property value. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Gets float property value. |
| [getPropertyMatrix(String key, AffineTransform def)](#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-) | Gets float property value. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Gets rectangle property value. |
| [getPropertyRectangle(String key, Rectangle def)](#getPropertyRectangle-java.lang.String-java.awt.Rectangle-) | Gets rectangle property value. |
| [getPropertyStringArray(String key)](#getPropertyStringArray-java.lang.String-) | Gets string array property value. |
| [getPropertyStringArray(String key, String[] def)](#getPropertyStringArray-java.lang.String-java.lang.String---) | Gets string array property value. |
| [hashCode()](#hashCode--) |  |
| [isEmpty()](#isEmpty--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Gets boolean property value. |
| [isProperty(String key, boolean def)](#isProperty-java.lang.String-boolean-) | Gets boolean property value. |
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
| [printProperties()](#printProperties--) | Prints all set properties. |
| [propertyNames()](#propertyNames--) | Returns properties names. |
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
| [setProperties(Properties properties)](#setProperties-java.util.Properties-) | Copies properties, including its defaults into this UserProperties |
| [setProperty(String key, boolean value)](#setProperty-java.lang.String-boolean-) | Sets boolean property value. |
| [setProperty(String key, double value)](#setProperty-java.lang.String-double-) | Sets double property value. |
| [setProperty(String key, float value)](#setProperty-java.lang.String-float-) | Sets float property value. |
| [setProperty(String key, int value)](#setProperty-java.lang.String-int-) | Sets integer property value. |
| [setProperty(String key, Color value)](#setProperty-java.lang.String-java.awt.Color-) | Sets color property value. |
| [setProperty(String key, Dimension value)](#setProperty-java.lang.String-java.awt.Dimension-) | Sets dimension property value. |
| [setProperty(String key, Insets value)](#setProperty-java.lang.String-java.awt.Insets-) | Sets insets property value. |
| [setProperty(String key, Rectangle value)](#setProperty-java.lang.String-java.awt.Rectangle-) | Sets rectangle property value. |
| [setProperty(String key, AffineTransform value)](#setProperty-java.lang.String-java.awt.geom.AffineTransform-) | Sets matrix property value. |
| [setProperty(String key, String value)](#setProperty-java.lang.String-java.lang.String-) | Sets string property value. |
| [setProperty(String key, String[] value)](#setProperty-java.lang.String-java.lang.String---) | Sets string array property value. |
| [setProperty(Properties properties, String key, boolean value)](#setProperty-java.util.Properties-java.lang.String-boolean-) | Sets boolean property value in specified properties table. |
| [setProperty(Properties properties, String key, double value)](#setProperty-java.util.Properties-java.lang.String-double-) | Sets double property value in specified properties table. |
| [setProperty(Properties properties, String key, float value)](#setProperty-java.util.Properties-java.lang.String-float-) | Sets float property value in specified properties table. |
| [setProperty(Properties properties, String key, int value)](#setProperty-java.util.Properties-java.lang.String-int-) | Sets integer property value in specified properties table. |
| [setProperty(Properties properties, String key, Color value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Color-) | Sets color property value in specified properties table. |
| [setProperty(Properties properties, String key, Dimension value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-) | Sets dimension property value in specified properties table. |
| [setProperty(Properties properties, String key, Insets value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-) | Sets insets property value in specified properties table. |
| [setProperty(Properties properties, String key, Rectangle value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-) | Sets rectangle property value in specified properties table. |
| [setProperty(Properties properties, String key, AffineTransform value)](#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-) | Sets matrix property value in specified properties table. |
| [setProperty(Properties properties, String key, String[] value)](#setProperty-java.util.Properties-java.lang.String-java.lang.String---) | Sets string array property value in specified properties table. |
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


Initializes an empty instance of UserProperties class.

### UserProperties(Properties defaults) {#UserProperties-java.util.Properties-}
```
public UserProperties(Properties defaults)
```


Initializes an of UserProperties class with default values.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| defaults | java.util.Properties | Default properties values. |

### UserProperties(Properties defaults, Properties altDefaults) {#UserProperties-java.util.Properties-java.util.Properties-}
```
public UserProperties(Properties defaults, Properties altDefaults)
```


Constructs UserProperties with a defaults and altDefaults table, which are searched in that order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| defaults | java.util.Properties | Default properties. |
| altDefaults | java.util.Properties | Alternative default properties. |

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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsKey(Object arg0) {#containsKey-java.lang.Object-}
```
public boolean containsKey(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsValue(Object arg0) {#containsValue-java.lang.Object-}
```
public boolean containsValue(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### forEach(BiConsumer<? super K,? super V> arg0) {#forEach-java.util.function.BiConsumer---super-K---super-V--}
```
public synchronized void forEach(BiConsumer<? super K,? super V> arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super K,? super V> |  |

### forEach(BiConsumer<? super Object,? super Object> arg0) {#forEach-java.util.function.BiConsumer---super-java.lang.Object---super-java.lang.Object--}
```
public synchronized void forEach(BiConsumer<? super Object,? super Object> arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super java.lang.Object,? super java.lang.Object> |  |

### get(Object arg0) {#get-java.lang.Object-}
```
public Object get(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
java.lang.Object
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Gets string property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
java.lang.String - Property value.
### getProperty(String key, String def) {#getProperty-java.lang.String-java.lang.String-}
```
public String getProperty(String key, String def)
```


Gets string property value. If requested property is absent, returns provided default value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| def | java.lang.String | Default value of property. |

**Returns:**
java.lang.String - Property value.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Gets color property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
java.awt.Color - Property value.
### getPropertyColor(String key, Color def) {#getPropertyColor-java.lang.String-java.awt.Color-}
```
public Color getPropertyColor(String key, Color def)
```


Gets color property value. If requested property is absent, returns provided default value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| def | java.awt.Color | Default value of property. |

**Returns:**
java.awt.Color - Property value.
### getPropertyDimension(String key) {#getPropertyDimension-java.lang.String-}
```
public Dimension getPropertyDimension(String key)
```


Gets dimension property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
java.awt.Dimension - Property value.
### getPropertyDimension(String key, Dimension def) {#getPropertyDimension-java.lang.String-java.awt.Dimension-}
```
public Dimension getPropertyDimension(String key, Dimension def)
```


Gets dimension property value. If requested property is absent, returns provided default value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| def | java.awt.Dimension | Default value of property. |

**Returns:**
java.awt.Dimension - Property value.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Gets double property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
double - Property value.
### getPropertyDouble(String key, double def) {#getPropertyDouble-java.lang.String-double-}
```
public double getPropertyDouble(String key, double def)
```


Gets double property value. If requested property is absent, returns provided default value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| def | double | Default value of property. |

**Returns:**
double - Property value.
### getPropertyFloat(String key) {#getPropertyFloat-java.lang.String-}
```
public float getPropertyFloat(String key)
```


Gets float property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
float - Property value.
### getPropertyFloat(String key, float def) {#getPropertyFloat-java.lang.String-float-}
```
public float getPropertyFloat(String key, float def)
```


Gets float property value. If requested property is absent, returns provided default value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| def | float | Default value of property. |

**Returns:**
float - Property value.
### getPropertyInsets(String key) {#getPropertyInsets-java.lang.String-}
```
public Insets getPropertyInsets(String key)
```


Gets insets property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
java.awt.Insets - Property value.
### getPropertyInsets(String key, Insets def) {#getPropertyInsets-java.lang.String-java.awt.Insets-}
```
public Insets getPropertyInsets(String key, Insets def)
```


Gets insets property value. If requested property is absent, returns provided default value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| def | java.awt.Insets | Default value of property. |

**Returns:**
java.awt.Insets - Property value.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Gets integer property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
int - Property value.
### getPropertyInt(String key, int def) {#getPropertyInt-java.lang.String-int-}
```
public int getPropertyInt(String key, int def)
```


Gets integer property value. If requested property is absent, returns provided default value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| def | int | Default value of property. |

**Returns:**
int - Property value.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Gets float property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
java.awt.geom.AffineTransform - Property value.
### getPropertyMatrix(String key, AffineTransform def) {#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-}
```
public AffineTransform getPropertyMatrix(String key, AffineTransform def)
```


Gets float property value. If requested property is absent, returns provided default value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| def | java.awt.geom.AffineTransform | Default value of property. |

**Returns:**
java.awt.geom.AffineTransform - Property value.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Gets rectangle property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
java.awt.Rectangle - Property value.
### getPropertyRectangle(String key, Rectangle def) {#getPropertyRectangle-java.lang.String-java.awt.Rectangle-}
```
public Rectangle getPropertyRectangle(String key, Rectangle def)
```


Gets rectangle property value. If requested property is absent, returns provided default value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| def | java.awt.Rectangle | Default value of property. |

**Returns:**
java.awt.Rectangle - Property value.
### getPropertyStringArray(String key) {#getPropertyStringArray-java.lang.String-}
```
public String[] getPropertyStringArray(String key)
```


Gets string array property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
java.lang.String[] - Property value.
### getPropertyStringArray(String key, String[] def) {#getPropertyStringArray-java.lang.String-java.lang.String---}
```
public String[] getPropertyStringArray(String key, String[] def)
```


Gets string array property value. If requested property is absent, returns provided default value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| def | java.lang.String[] | Default value of property. |

**Returns:**
java.lang.String[] - Property value.
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


Gets boolean property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
boolean - Property value.
### isProperty(String key, boolean def) {#isProperty-java.lang.String-boolean-}
```
public boolean isProperty(String key, boolean def)
```


Gets boolean property value. If requested property is absent, returns provided default value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| def | boolean | Default value of property. |

**Returns:**
boolean - Property value.
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.io.PrintStream |  |

### list(PrintWriter arg0) {#list-java.io.PrintWriter-}
```
public void list(PrintWriter arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.io.PrintWriter |  |

### load(InputStream arg0) {#load-java.io.InputStream-}
```
public synchronized void load(InputStream arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### load(Reader arg0) {#load-java.io.Reader-}
```
public synchronized void load(Reader arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.io.Reader |  |

### loadFromXML(InputStream arg0) {#loadFromXML-java.io.InputStream-}
```
public synchronized void loadFromXML(InputStream arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2) {#merge-K-V-java.util.function.BiFunction---super-V---super-V---extends-V--}
```
public synchronized V merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2)
```




**Parameters:**
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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


Prints all set properties.

### propertyNames() {#propertyNames--}
```
public Enumeration propertyNames()
```


Returns properties names.

**Returns:**
java.util.Enumeration - Enumeration of properties names.
### put(K arg0, V arg1) {#put-K-V-}
```
public synchronized V put(K arg0, V arg1)
```




**Parameters:**
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.util.Map<? extends K,? extends V> |  |

### putAll(Map<?,?> arg0) {#putAll-java.util.Map------}
```
public synchronized void putAll(Map<?,?> arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.util.Map<?,?> |  |

### putIfAbsent(K arg0, V arg1) {#putIfAbsent-K-V-}
```
public synchronized V putIfAbsent(K arg0, V arg1)
```




**Parameters:**
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
java.lang.Object
### remove(Object arg0, Object arg1) {#remove-java.lang.Object-java.lang.Object-}
```
public synchronized boolean remove(Object arg0, Object arg1)
```




**Parameters:**
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super K,? super V,? extends V> |  |

### replaceAll(BiFunction<? super Object,? super Object,?> arg0) {#replaceAll-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----}
```
public synchronized void replaceAll(BiFunction<? super Object,? super Object,?> arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super java.lang.Object,? super java.lang.Object,?> |  |

### save(OutputStream arg0, String arg1) {#save-java.io.OutputStream-java.lang.String-}
```
public void save(OutputStream arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### setProperties(Properties properties) {#setProperties-java.util.Properties-}
```
public void setProperties(Properties properties)
```


Copies properties, including its defaults into this UserProperties

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| properties | java.util.Properties | Properties. |

### setProperty(String key, boolean value) {#setProperty-java.lang.String-boolean-}
```
public Object setProperty(String key, boolean value)
```


Sets boolean property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| value | boolean | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(String key, double value) {#setProperty-java.lang.String-double-}
```
public Object setProperty(String key, double value)
```


Sets double property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| value | double | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(String key, float value) {#setProperty-java.lang.String-float-}
```
public Object setProperty(String key, float value)
```


Sets float property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| value | float | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(String key, int value) {#setProperty-java.lang.String-int-}
```
public Object setProperty(String key, int value)
```


Sets integer property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| value | int | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(String key, Color value) {#setProperty-java.lang.String-java.awt.Color-}
```
public Object setProperty(String key, Color value)
```


Sets color property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| value | java.awt.Color | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(String key, Dimension value) {#setProperty-java.lang.String-java.awt.Dimension-}
```
public Object setProperty(String key, Dimension value)
```


Sets dimension property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| value | java.awt.Dimension | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(String key, Insets value) {#setProperty-java.lang.String-java.awt.Insets-}
```
public Object setProperty(String key, Insets value)
```


Sets insets property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| value | java.awt.Insets | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(String key, Rectangle value) {#setProperty-java.lang.String-java.awt.Rectangle-}
```
public Object setProperty(String key, Rectangle value)
```


Sets rectangle property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| value | java.awt.Rectangle | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(String key, AffineTransform value) {#setProperty-java.lang.String-java.awt.geom.AffineTransform-}
```
public Object setProperty(String key, AffineTransform value)
```


Sets matrix property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| value | java.awt.geom.AffineTransform | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(String key, String value) {#setProperty-java.lang.String-java.lang.String-}
```
public Object setProperty(String key, String value)
```


Sets string property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| value | java.lang.String | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(String key, String[] value) {#setProperty-java.lang.String-java.lang.String---}
```
public Object setProperty(String key, String[] value)
```


Sets string array property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |
| value | java.lang.String[] | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(Properties properties, String key, boolean value) {#setProperty-java.util.Properties-java.lang.String-boolean-}
```
public static Object setProperty(Properties properties, String key, boolean value)
```


Sets boolean property value in specified properties table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| properties | java.util.Properties | The properties table. |
| key | java.lang.String | The name of property. |
| value | boolean | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(Properties properties, String key, double value) {#setProperty-java.util.Properties-java.lang.String-double-}
```
public static Object setProperty(Properties properties, String key, double value)
```


Sets double property value in specified properties table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| properties | java.util.Properties | The properties table. |
| key | java.lang.String | The name of property. |
| value | double | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(Properties properties, String key, float value) {#setProperty-java.util.Properties-java.lang.String-float-}
```
public static Object setProperty(Properties properties, String key, float value)
```


Sets float property value in specified properties table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| properties | java.util.Properties | The properties table. |
| key | java.lang.String | The name of property. |
| value | float | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(Properties properties, String key, int value) {#setProperty-java.util.Properties-java.lang.String-int-}
```
public static Object setProperty(Properties properties, String key, int value)
```


Sets integer property value in specified properties table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| properties | java.util.Properties | The properties table. |
| key | java.lang.String | The name of property. |
| value | int | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(Properties properties, String key, Color value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Color-}
```
public static Object setProperty(Properties properties, String key, Color value)
```


Sets color property value in specified properties table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| properties | java.util.Properties | The properties table. |
| key | java.lang.String | The name of property. |
| value | java.awt.Color | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(Properties properties, String key, Dimension value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-}
```
public static Object setProperty(Properties properties, String key, Dimension value)
```


Sets dimension property value in specified properties table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| properties | java.util.Properties | The properties table. |
| key | java.lang.String | The name of property. |
| value | java.awt.Dimension | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(Properties properties, String key, Insets value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-}
```
public static Object setProperty(Properties properties, String key, Insets value)
```


Sets insets property value in specified properties table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| properties | java.util.Properties | The properties table. |
| key | java.lang.String | The name of property. |
| value | java.awt.Insets | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(Properties properties, String key, Rectangle value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-}
```
public static Object setProperty(Properties properties, String key, Rectangle value)
```


Sets rectangle property value in specified properties table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| properties | java.util.Properties | The properties table. |
| key | java.lang.String | The name of property. |
| value | java.awt.Rectangle | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(Properties properties, String key, AffineTransform value) {#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-}
```
public static Object setProperty(Properties properties, String key, AffineTransform value)
```


Sets matrix property value in specified properties table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| properties | java.util.Properties | The properties table. |
| key | java.lang.String | The name of property. |
| value | java.awt.geom.AffineTransform | The value of property. |

**Returns:**
java.lang.Object - A property.
### setProperty(Properties properties, String key, String[] value) {#setProperty-java.util.Properties-java.lang.String-java.lang.String---}
```
public static Object setProperty(Properties properties, String key, String[] value)
```


Sets string array property value in specified properties table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| properties | java.util.Properties | The properties table. |
| key | java.lang.String | The name of property. |
| value | java.lang.String[] | The value of property. |

**Returns:**
java.lang.Object - A property.
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### store(Writer arg0, String arg1) {#store-java.io.Writer-java.lang.String-}
```
public void store(Writer arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.io.Writer |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1) {#storeToXML-java.io.OutputStream-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, String arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1, String arg2)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |
| arg2 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, Charset arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.nio.charset.Charset-}
```
public void storeToXML(OutputStream arg0, String arg1, Charset arg2)
```




**Parameters:**
| Parameter | Type | Description |
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

