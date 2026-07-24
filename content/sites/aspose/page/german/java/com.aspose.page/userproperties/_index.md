---
title: "UserProperties"
second_title: "Aspose.Page for Java API-Referenz"
description: "Spezielle Eigenschaftsklasse, die das Setzen und Zurückgeben typisierter Eigenschaften ermöglicht."
type: docs
weight: 18
url: /de/java/com.aspose.page/userproperties/
---
**Inheritance:**
java.lang.Object, java.util.Dictionary, java.util.Hashtable, java.util.Properties
```
public class UserProperties extends Properties
```

Spezielle Eigenschaftsklasse, die das Setzen und Abrufen typisierter Eigenschaften ermöglicht. Sie erlaubt außerdem das Verknüpfen von zwei Standard‑Eigenschaftsobjekten, die durchsucht werden, falls dieses Eigenschaftsobjekt die gesuchte Eigenschaft nicht enthält.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [UserProperties()](#UserProperties--) | Initialisiert eine leere Instanz der Klasse UserProperties. |
| [UserProperties(Properties defaults)](#UserProperties-java.util.Properties-) | Initialisiert eine Instanz der Klasse UserProperties mit Standardwerten. |
| [UserProperties(Properties defaults, Properties altDefaults)](#UserProperties-java.util.Properties-java.util.Properties-) | Konstruiert UserProperties mit einer defaults- und einer altDefaults-Tabelle, die in dieser Reihenfolge durchsucht werden. |
## Methoden

| Methode | Beschreibung |
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
| [getProperty(String key)](#getProperty-java.lang.String-) | Liefert den Zeichenketten‑Eigenschaftswert. |
| [getProperty(String key, String def)](#getProperty-java.lang.String-java.lang.String-) | Liefert den Zeichenketten‑Eigenschaftswert. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Ruft den Farb‑Eigenschaftswert ab. |
| [getPropertyColor(String key, Color def)](#getPropertyColor-java.lang.String-java.awt.Color-) | Ruft den Farb‑Eigenschaftswert ab. |
| [getPropertyDimension(String key)](#getPropertyDimension-java.lang.String-) | Ruft den Dimensionseigenschaftswert ab. |
| [getPropertyDimension(String key, Dimension def)](#getPropertyDimension-java.lang.String-java.awt.Dimension-) | Ruft den Dimensionseigenschaftswert ab. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Ruft den Double‑Eigenschaftswert ab. |
| [getPropertyDouble(String key, double def)](#getPropertyDouble-java.lang.String-double-) | Ruft den Double‑Eigenschaftswert ab. |
| [getPropertyFloat(String key)](#getPropertyFloat-java.lang.String-) | Ruft den Float‑Eigenschaftswert ab. |
| [getPropertyFloat(String key, float def)](#getPropertyFloat-java.lang.String-float-) | Ruft den Float‑Eigenschaftswert ab. |
| [getPropertyInsets(String key)](#getPropertyInsets-java.lang.String-) | Ruft den Insets‑Eigenschaftswert ab. |
| [getPropertyInsets(String key, Insets def)](#getPropertyInsets-java.lang.String-java.awt.Insets-) | Ruft den Insets‑Eigenschaftswert ab. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Ruft den Integer‑Eigenschaftswert ab. |
| [getPropertyInt(String key, int def)](#getPropertyInt-java.lang.String-int-) | Ruft den Integer‑Eigenschaftswert ab. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Ruft den Float‑Eigenschaftswert ab. |
| [getPropertyMatrix(String key, AffineTransform def)](#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-) | Ruft den Float‑Eigenschaftswert ab. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Ruft den Rechteck‑Eigenschaftswert ab. |
| [getPropertyRectangle(String key, Rectangle def)](#getPropertyRectangle-java.lang.String-java.awt.Rectangle-) | Ruft den Rechteck‑Eigenschaftswert ab. |
| [getPropertyStringArray(String key)](#getPropertyStringArray-java.lang.String-) | Ruft den String‑Array‑Eigenschaftswert ab. |
| [getPropertyStringArray(String key, String[] def)](#getPropertyStringArray-java.lang.String-java.lang.String---) | Ruft den String‑Array‑Eigenschaftswert ab. |
| [hashCode()](#hashCode--) |  |
| [isEmpty()](#isEmpty--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Ruft den Boolean‑Eigenschaftswert ab. |
| [isProperty(String key, boolean def)](#isProperty-java.lang.String-boolean-) | Ruft den Boolean‑Eigenschaftswert ab. |
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
| [printProperties()](#printProperties--) | Gibt alle gesetzten Eigenschaften aus. |
| [propertyNames()](#propertyNames--) | Gibt Eigenschaftsnamen zurück. |
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
| [setProperties(Properties properties)](#setProperties-java.util.Properties-) | Kopiert Eigenschaften, einschließlich ihrer Standardwerte, in diese UserProperties. |
| [setProperty(String key, boolean value)](#setProperty-java.lang.String-boolean-) | Setzt den Boolean‑Eigenschaftswert. |
| [setProperty(String key, double value)](#setProperty-java.lang.String-double-) | Setzt den Double‑Eigenschaftswert. |
| [setProperty(String key, float value)](#setProperty-java.lang.String-float-) | Setzt den Float‑Eigenschaftswert. |
| [setProperty(String key, int value)](#setProperty-java.lang.String-int-) | Setzt den Integer‑Eigenschaftswert. |
| [setProperty(String key, Color value)](#setProperty-java.lang.String-java.awt.Color-) | Setzt den Farb‑Eigenschaftswert. |
| [setProperty(String key, Dimension value)](#setProperty-java.lang.String-java.awt.Dimension-) | Setzt den Dimensionseigenschaftswert. |
| [setProperty(String key, Insets value)](#setProperty-java.lang.String-java.awt.Insets-) | Setzt den Insets‑Eigenschaftswert. |
| [setProperty(String key, Rectangle value)](#setProperty-java.lang.String-java.awt.Rectangle-) | Setzt den Rechteck‑Eigenschaftswert. |
| [setProperty(String key, AffineTransform value)](#setProperty-java.lang.String-java.awt.geom.AffineTransform-) | Setzt den Matrix‑Eigenschaftswert. |
| [setProperty(String key, String value)](#setProperty-java.lang.String-java.lang.String-) | Setzt den String‑Eigenschaftswert. |
| [setProperty(String key, String[] value)](#setProperty-java.lang.String-java.lang.String---) | Setzt den String‑Array‑Eigenschaftswert. |
| [setProperty(Properties properties, String key, boolean value)](#setProperty-java.util.Properties-java.lang.String-boolean-) | Setzt den Boolean‑Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle. |
| [setProperty(Properties properties, String key, double value)](#setProperty-java.util.Properties-java.lang.String-double-) | Setzt den Double‑Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle. |
| [setProperty(Properties properties, String key, float value)](#setProperty-java.util.Properties-java.lang.String-float-) | Setzt den float-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle. |
| [setProperty(Properties properties, String key, int value)](#setProperty-java.util.Properties-java.lang.String-int-) | Setzt den integer-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle. |
| [setProperty(Properties properties, String key, Color value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Color-) | Setzt den color-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle. |
| [setProperty(Properties properties, String key, Dimension value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-) | Setzt den dimension-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle. |
| [setProperty(Properties properties, String key, Insets value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-) | Setzt den insets-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle. |
| [setProperty(Properties properties, String key, Rectangle value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-) | Setzt den rectangle-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle. |
| [setProperty(Properties properties, String key, AffineTransform value)](#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-) | Setzt den matrix-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle. |
| [setProperty(Properties properties, String key, String[] value)](#setProperty-java.util.Properties-java.lang.String-java.lang.String---) | Setzt den string array-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle. |
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


Initialisiert eine leere Instanz der Klasse UserProperties.

### UserProperties(Properties defaults) {#UserProperties-java.util.Properties-}
```
public UserProperties(Properties defaults)
```


Initialisiert eine Instanz der Klasse UserProperties mit Standardwerten.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| defaults | java.util.Properties | Standard-Eigenschaftswerte. |

### UserProperties(Properties defaults, Properties altDefaults) {#UserProperties-java.util.Properties-java.util.Properties-}
```
public UserProperties(Properties defaults, Properties altDefaults)
```


Konstruiert UserProperties mit einer defaults- und einer altDefaults-Tabelle, die in dieser Reihenfolge durchsucht werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| defaults | java.util.Properties | Standard-Eigenschaften. |
| altDefaults | java.util.Properties | Alternative Standard-Eigenschaften. |

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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsKey(Object arg0) {#containsKey-java.lang.Object-}
```
public boolean containsKey(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsValue(Object arg0) {#containsValue-java.lang.Object-}
```
public boolean containsValue(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### forEach(BiConsumer<? super K,? super V> arg0) {#forEach-java.util.function.BiConsumer---super-K---super-V--}
```
public synchronized void forEach(BiConsumer<? super K,? super V> arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super K,? super V> |  |

### forEach(BiConsumer<? super Object,? super Object> arg0) {#forEach-java.util.function.BiConsumer---super-java.lang.Object---super-java.lang.Object--}
```
public synchronized void forEach(BiConsumer<? super Object,? super Object> arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super java.lang.Object,? super java.lang.Object> |  |

### get(Object arg0) {#get-java.lang.Object-}
```
public Object get(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
java.lang.Object
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Liefert den Zeichenketten‑Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
java.lang.String - Eigenschaftswert.
### getProperty(String key, String def) {#getProperty-java.lang.String-java.lang.String-}
```
public String getProperty(String key, String def)
```


Liest den Zeichenketten-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| def | java.lang.String | Standardwert der Eigenschaft. |

**Returns:**
java.lang.String - Eigenschaftswert.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Ruft den Farb‑Eigenschaftswert ab.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
java.awt.Color - Eigenschaftswert.
### getPropertyColor(String key, Color def) {#getPropertyColor-java.lang.String-java.awt.Color-}
```
public Color getPropertyColor(String key, Color def)
```


Liest den Farb-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| def | java.awt.Color | Standardwert der Eigenschaft. |

**Returns:**
java.awt.Color - Eigenschaftswert.
### getPropertyDimension(String key) {#getPropertyDimension-java.lang.String-}
```
public Dimension getPropertyDimension(String key)
```


Ruft den Dimensionseigenschaftswert ab.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
java.awt.Dimension - Eigenschaftswert.
### getPropertyDimension(String key, Dimension def) {#getPropertyDimension-java.lang.String-java.awt.Dimension-}
```
public Dimension getPropertyDimension(String key, Dimension def)
```


Liest den Dimensions-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| def | java.awt.Dimension | Standardwert der Eigenschaft. |

**Returns:**
java.awt.Dimension - Eigenschaftswert.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Ruft den Double‑Eigenschaftswert ab.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
double - Eigenschaftswert.
### getPropertyDouble(String key, double def) {#getPropertyDouble-java.lang.String-double-}
```
public double getPropertyDouble(String key, double def)
```


Liest den Double-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| def | double | Standardwert der Eigenschaft. |

**Returns:**
double - Eigenschaftswert.
### getPropertyFloat(String key) {#getPropertyFloat-java.lang.String-}
```
public float getPropertyFloat(String key)
```


Ruft den Float‑Eigenschaftswert ab.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
float - Eigenschaftswert.
### getPropertyFloat(String key, float def) {#getPropertyFloat-java.lang.String-float-}
```
public float getPropertyFloat(String key, float def)
```


Liest den Float-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| def | float | Standardwert der Eigenschaft. |

**Returns:**
float - Eigenschaftswert.
### getPropertyInsets(String key) {#getPropertyInsets-java.lang.String-}
```
public Insets getPropertyInsets(String key)
```


Ruft den Insets‑Eigenschaftswert ab.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
java.awt.Insets - Eigenschaftswert.
### getPropertyInsets(String key, Insets def) {#getPropertyInsets-java.lang.String-java.awt.Insets-}
```
public Insets getPropertyInsets(String key, Insets def)
```


Liest den Insets-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| def | java.awt.Insets | Standardwert der Eigenschaft. |

**Returns:**
java.awt.Insets - Eigenschaftswert.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Ruft den Integer‑Eigenschaftswert ab.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
int - Eigenschaftswert.
### getPropertyInt(String key, int def) {#getPropertyInt-java.lang.String-int-}
```
public int getPropertyInt(String key, int def)
```


Liest den Integer-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| def | int | Standardwert der Eigenschaft. |

**Returns:**
int - Eigenschaftswert.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Ruft den Float‑Eigenschaftswert ab.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
java.awt.geom.AffineTransform - Eigenschaftswert.
### getPropertyMatrix(String key, AffineTransform def) {#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-}
```
public AffineTransform getPropertyMatrix(String key, AffineTransform def)
```


Liest den Float-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| def | java.awt.geom.AffineTransform | Standardwert der Eigenschaft. |

**Returns:**
java.awt.geom.AffineTransform - Eigenschaftswert.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Ruft den Rechteck‑Eigenschaftswert ab.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
java.awt.Rectangle - Eigenschaftswert.
### getPropertyRectangle(String key, Rectangle def) {#getPropertyRectangle-java.lang.String-java.awt.Rectangle-}
```
public Rectangle getPropertyRectangle(String key, Rectangle def)
```


Liest den Rechteck-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| def | java.awt.Rectangle | Standardwert der Eigenschaft. |

**Returns:**
java.awt.Rectangle - Eigenschaftswert.
### getPropertyStringArray(String key) {#getPropertyStringArray-java.lang.String-}
```
public String[] getPropertyStringArray(String key)
```


Ruft den String‑Array‑Eigenschaftswert ab.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
java.lang.String[] - Eigenschaftswert.
### getPropertyStringArray(String key, String[] def) {#getPropertyStringArray-java.lang.String-java.lang.String---}
```
public String[] getPropertyStringArray(String key, String[] def)
```


Liest den Wert der String-Array-Eigenschaft. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| def | java.lang.String[] | Standardwert der Eigenschaft. |

**Returns:**
java.lang.String[] - Eigenschaftswert.
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


Ruft den Boolean‑Eigenschaftswert ab.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
boolean - Eigenschaftswert.
### isProperty(String key, boolean def) {#isProperty-java.lang.String-boolean-}
```
public boolean isProperty(String key, boolean def)
```


Liest den booleschen Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| def | boolean | Standardwert der Eigenschaft. |

**Returns:**
boolean - Eigenschaftswert.
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.io.PrintStream |  |

### list(PrintWriter arg0) {#list-java.io.PrintWriter-}
```
public void list(PrintWriter arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.io.PrintWriter |  |

### load(InputStream arg0) {#load-java.io.InputStream-}
```
public synchronized void load(InputStream arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### load(Reader arg0) {#load-java.io.Reader-}
```
public synchronized void load(Reader arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.io.Reader |  |

### loadFromXML(InputStream arg0) {#loadFromXML-java.io.InputStream-}
```
public synchronized void loadFromXML(InputStream arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2) {#merge-K-V-java.util.function.BiFunction---super-V---super-V---extends-V--}
```
public synchronized V merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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


Gibt alle gesetzten Eigenschaften aus.

### propertyNames() {#propertyNames--}
```
public Enumeration propertyNames()
```


Gibt Eigenschaftsnamen zurück.

**Returns:**
java.util.Enumeration - Aufzählung der Eigenschaftsnamen.
### put(K arg0, V arg1) {#put-K-V-}
```
public synchronized V put(K arg0, V arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.util.Map<? extends K,? extends V> |  |

### putAll(Map<?,?> arg0) {#putAll-java.util.Map------}
```
public synchronized void putAll(Map<?,?> arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.util.Map<?,?> |  |

### putIfAbsent(K arg0, V arg1) {#putIfAbsent-K-V-}
```
public synchronized V putIfAbsent(K arg0, V arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
java.lang.Object
### remove(Object arg0, Object arg1) {#remove-java.lang.Object-java.lang.Object-}
```
public synchronized boolean remove(Object arg0, Object arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super K,? super V,? extends V> |  |

### replaceAll(BiFunction<? super Object,? super Object,?> arg0) {#replaceAll-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----}
```
public synchronized void replaceAll(BiFunction<? super Object,? super Object,?> arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super java.lang.Object,? super java.lang.Object,?> |  |

### save(OutputStream arg0, String arg1) {#save-java.io.OutputStream-java.lang.String-}
```
public void save(OutputStream arg0, String arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### setProperties(Properties properties) {#setProperties-java.util.Properties-}
```
public void setProperties(Properties properties)
```


Kopiert Eigenschaften, einschließlich ihrer Standardwerte, in diese UserProperties.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaften | java.util.Properties | Eigenschaften. |

### setProperty(String key, boolean value) {#setProperty-java.lang.String-boolean-}
```
public Object setProperty(String key, boolean value)
```


Setzt den Boolean‑Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | boolean | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(String key, double value) {#setProperty-java.lang.String-double-}
```
public Object setProperty(String key, double value)
```


Setzt den Double‑Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | double | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(String key, float value) {#setProperty-java.lang.String-float-}
```
public Object setProperty(String key, float value)
```


Setzt den Float‑Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | float | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(String key, int value) {#setProperty-java.lang.String-int-}
```
public Object setProperty(String key, int value)
```


Setzt den Integer‑Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | int | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(String key, Color value) {#setProperty-java.lang.String-java.awt.Color-}
```
public Object setProperty(String key, Color value)
```


Setzt den Farb‑Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | java.awt.Color | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(String key, Dimension value) {#setProperty-java.lang.String-java.awt.Dimension-}
```
public Object setProperty(String key, Dimension value)
```


Setzt den Dimensionseigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | java.awt.Dimension | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(String key, Insets value) {#setProperty-java.lang.String-java.awt.Insets-}
```
public Object setProperty(String key, Insets value)
```


Setzt den Insets‑Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | java.awt.Insets | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(String key, Rectangle value) {#setProperty-java.lang.String-java.awt.Rectangle-}
```
public Object setProperty(String key, Rectangle value)
```


Setzt den Rechteck‑Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | java.awt.Rectangle | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(String key, AffineTransform value) {#setProperty-java.lang.String-java.awt.geom.AffineTransform-}
```
public Object setProperty(String key, AffineTransform value)
```


Setzt den Matrix‑Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | java.awt.geom.AffineTransform | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(String key, String value) {#setProperty-java.lang.String-java.lang.String-}
```
public Object setProperty(String key, String value)
```


Setzt den String‑Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | java.lang.String | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(String key, String[] value) {#setProperty-java.lang.String-java.lang.String---}
```
public Object setProperty(String key, String[] value)
```


Setzt den String‑Array‑Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | java.lang.String[] | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(Properties properties, String key, boolean value) {#setProperty-java.util.Properties-java.lang.String-boolean-}
```
public static Object setProperty(Properties properties, String key, boolean value)
```


Setzt den Boolean‑Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaften | java.util.Properties | Die Eigenschaftstabelle. |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | boolean | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(Properties properties, String key, double value) {#setProperty-java.util.Properties-java.lang.String-double-}
```
public static Object setProperty(Properties properties, String key, double value)
```


Setzt den Double‑Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaften | java.util.Properties | Die Eigenschaftstabelle. |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | double | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(Properties properties, String key, float value) {#setProperty-java.util.Properties-java.lang.String-float-}
```
public static Object setProperty(Properties properties, String key, float value)
```


Setzt den float-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaften | java.util.Properties | Die Eigenschaftstabelle. |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | float | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(Properties properties, String key, int value) {#setProperty-java.util.Properties-java.lang.String-int-}
```
public static Object setProperty(Properties properties, String key, int value)
```


Setzt den integer-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaften | java.util.Properties | Die Eigenschaftstabelle. |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | int | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(Properties properties, String key, Color value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Color-}
```
public static Object setProperty(Properties properties, String key, Color value)
```


Setzt den color-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaften | java.util.Properties | Die Eigenschaftstabelle. |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | java.awt.Color | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(Properties properties, String key, Dimension value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-}
```
public static Object setProperty(Properties properties, String key, Dimension value)
```


Setzt den dimension-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaften | java.util.Properties | Die Eigenschaftstabelle. |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | java.awt.Dimension | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(Properties properties, String key, Insets value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-}
```
public static Object setProperty(Properties properties, String key, Insets value)
```


Setzt den insets-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaften | java.util.Properties | Die Eigenschaftstabelle. |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | java.awt.Insets | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(Properties properties, String key, Rectangle value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-}
```
public static Object setProperty(Properties properties, String key, Rectangle value)
```


Setzt den rectangle-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaften | java.util.Properties | Die Eigenschaftstabelle. |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | java.awt.Rectangle | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(Properties properties, String key, AffineTransform value) {#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-}
```
public static Object setProperty(Properties properties, String key, AffineTransform value)
```


Setzt den matrix-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaften | java.util.Properties | Die Eigenschaftstabelle. |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | java.awt.geom.AffineTransform | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
### setProperty(Properties properties, String key, String[] value) {#setProperty-java.util.Properties-java.lang.String-java.lang.String---}
```
public static Object setProperty(Properties properties, String key, String[] value)
```


Setzt den string array-Eigenschaftswert in der angegebenen Eigenschaften‑Tabelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaften | java.util.Properties | Die Eigenschaftstabelle. |
| key | java.lang.String | Der Name der Eigenschaft. |
| Wert | java.lang.String[] | Der Wert der Eigenschaft. |

**Returns:**
java.lang.Object - Eine Eigenschaft.
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### store(Writer arg0, String arg1) {#store-java.io.Writer-java.lang.String-}
```
public void store(Writer arg0, String arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.io.Writer |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1) {#storeToXML-java.io.OutputStream-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, String arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1, String arg2)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |
| arg2 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, Charset arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.nio.charset.Charset-}
```
public void storeToXML(OutputStream arg0, String arg1, Charset arg2)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

