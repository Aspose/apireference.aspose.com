---
title: "UserProperties"
second_title: "Aspose.Page voor Java API-referentie"
description: "Speciale eigenschapsklasse die het instellen en retourneren van getypeerde eigenschappen mogelijk maakt."
type: docs
weight: 18
url: /nl/java/com.aspose.page/userproperties/
---
**Inheritance:**
java.lang.Object, java.util.Dictionary, java.util.Hashtable, java.util.Properties
```
public class UserProperties extends Properties
```

Speciale eigenschapsklasse die het mogelijk maakt getypeerde eigenschappen in te stellen en op te halen. Het maakt ook het koppelen van twee standaard eigenschapsobjecten mogelijk die worden doorzocht als dit eigenschapsobject de eigenschap niet bevat.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [UserProperties()](#UserProperties--) | Initialiseert een lege instantie van de UserProperties‑klasse. |
| [UserProperties(Properties defaults)](#UserProperties-java.util.Properties-) | Initialiseert een UserProperties‑klasse met standaardwaarden. |
| [UserProperties(Properties defaults, Properties altDefaults)](#UserProperties-java.util.Properties-java.util.Properties-) | Construeert UserProperties met een defaults‑ en altDefaults‑tabel, die in die volgorde worden doorzocht. |
## Methoden

| Methode | Beschrijving |
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
| [getProperty(String key)](#getProperty-java.lang.String-) | Haalt de string‑eigenschapwaarde op. |
| [getProperty(String key, String def)](#getProperty-java.lang.String-java.lang.String-) | Haalt de string‑eigenschapwaarde op. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Haalt de waarde van de kleureigenschap op. |
| [getPropertyColor(String key, Color def)](#getPropertyColor-java.lang.String-java.awt.Color-) | Haalt de waarde van de kleureigenschap op. |
| [getPropertyDimension(String key)](#getPropertyDimension-java.lang.String-) | Haalt de waarde van de dimensie‑eigenschap op. |
| [getPropertyDimension(String key, Dimension def)](#getPropertyDimension-java.lang.String-java.awt.Dimension-) | Haalt de waarde van de dimensie‑eigenschap op. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Haalt de waarde van de double‑eigenschap op. |
| [getPropertyDouble(String key, double def)](#getPropertyDouble-java.lang.String-double-) | Haalt de waarde van de double‑eigenschap op. |
| [getPropertyFloat(String key)](#getPropertyFloat-java.lang.String-) | Haalt de waarde van de float‑eigenschap op. |
| [getPropertyFloat(String key, float def)](#getPropertyFloat-java.lang.String-float-) | Haalt de waarde van de float‑eigenschap op. |
| [getPropertyInsets(String key)](#getPropertyInsets-java.lang.String-) | Haalt de waarde van de inset‑eigenschap op. |
| [getPropertyInsets(String key, Insets def)](#getPropertyInsets-java.lang.String-java.awt.Insets-) | Haalt de waarde van de inset‑eigenschap op. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Haalt de waarde van de integer‑eigenschap op. |
| [getPropertyInt(String key, int def)](#getPropertyInt-java.lang.String-int-) | Haalt de waarde van de integer‑eigenschap op. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Haalt de waarde van de float‑eigenschap op. |
| [getPropertyMatrix(String key, AffineTransform def)](#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-) | Haalt de waarde van de float‑eigenschap op. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Haalt de waarde van de rechthoek‑eigenschap op. |
| [getPropertyRectangle(String key, Rectangle def)](#getPropertyRectangle-java.lang.String-java.awt.Rectangle-) | Haalt de waarde van de rechthoek‑eigenschap op. |
| [getPropertyStringArray(String key)](#getPropertyStringArray-java.lang.String-) | Haalt de waarde van de tekenreeks‑array‑eigenschap op. |
| [getPropertyStringArray(String key, String[] def)](#getPropertyStringArray-java.lang.String-java.lang.String---) | Haalt de waarde van de tekenreeks‑array‑eigenschap op. |
| [hashCode()](#hashCode--) |  |
| [isEmpty()](#isEmpty--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Haalt de waarde van de boolean‑eigenschap op. |
| [isProperty(String key, boolean def)](#isProperty-java.lang.String-boolean-) | Haalt de waarde van de boolean‑eigenschap op. |
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
| [printProperties()](#printProperties--) | Print alle ingestelde eigenschappen. |
| [propertyNames()](#propertyNames--) | Retourneert eigenschapsnamen. |
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
| [setProperties(Properties properties)](#setProperties-java.util.Properties-) | Kopieert eigenschappen, inclusief de standaardwaarden, naar deze UserProperties. |
| [setProperty(String key, boolean value)](#setProperty-java.lang.String-boolean-) | Stelt de waarde van de boolean‑eigenschap in. |
| [setProperty(String key, double value)](#setProperty-java.lang.String-double-) | Stelt de waarde van de double‑eigenschap in. |
| [setProperty(String key, float value)](#setProperty-java.lang.String-float-) | Stelt de waarde van de float‑eigenschap in. |
| [setProperty(String key, int value)](#setProperty-java.lang.String-int-) | Stelt de waarde van de integer‑eigenschap in. |
| [setProperty(String key, Color value)](#setProperty-java.lang.String-java.awt.Color-) | Stelt de waarde van de kleureigenschap in. |
| [setProperty(String key, Dimension value)](#setProperty-java.lang.String-java.awt.Dimension-) | Stelt de waarde van de dimensie‑eigenschap in. |
| [setProperty(String key, Insets value)](#setProperty-java.lang.String-java.awt.Insets-) | Stelt de waarde van de inset‑eigenschap in. |
| [setProperty(String key, Rectangle value)](#setProperty-java.lang.String-java.awt.Rectangle-) | Stelt de waarde van de rechthoek‑eigenschap in. |
| [setProperty(String key, AffineTransform value)](#setProperty-java.lang.String-java.awt.geom.AffineTransform-) | Stelt de waarde van de matrix‑eigenschap in. |
| [setProperty(String key, String value)](#setProperty-java.lang.String-java.lang.String-) | Stelt de waarde van de tekenreeks‑eigenschap in. |
| [setProperty(String key, String[] value)](#setProperty-java.lang.String-java.lang.String---) | Stelt de waarde van de tekenreeks‑array‑eigenschap in. |
| [setProperty(Properties properties, String key, boolean value)](#setProperty-java.util.Properties-java.lang.String-boolean-) | Stelt de waarde van de boolean‑eigenschap in de opgegeven eigenschappen‑tabel in. |
| [setProperty(Properties properties, String key, double value)](#setProperty-java.util.Properties-java.lang.String-double-) | Stelt de waarde van de double‑eigenschap in de opgegeven eigenschappen‑tabel in. |
| [setProperty(Properties properties, String key, float value)](#setProperty-java.util.Properties-java.lang.String-float-) | Stelt de float‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| [setProperty(Properties properties, String key, int value)](#setProperty-java.util.Properties-java.lang.String-int-) | Stelt de integer‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| [setProperty(Properties properties, String key, Color value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Color-) | Stelt de kleur‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| [setProperty(Properties properties, String key, Dimension value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-) | Stelt de dimensie‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| [setProperty(Properties properties, String key, Insets value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-) | Stelt de insets‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| [setProperty(Properties properties, String key, Rectangle value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-) | Stelt de rechthoek‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| [setProperty(Properties properties, String key, AffineTransform value)](#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-) | Stelt de matrix‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| [setProperty(Properties properties, String key, String[] value)](#setProperty-java.util.Properties-java.lang.String-java.lang.String---) | Stelt de string‑array‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
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


Initialiseert een lege instantie van de UserProperties‑klasse.

### UserProperties(Properties defaults) {#UserProperties-java.util.Properties-}
```
public UserProperties(Properties defaults)
```


Initialiseert een UserProperties‑klasse met standaardwaarden.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| standaardinstellingen | java.util.Properties | Standaard eigenschapswaarden. |

### UserProperties(Properties defaults, Properties altDefaults) {#UserProperties-java.util.Properties-java.util.Properties-}
```
public UserProperties(Properties defaults, Properties altDefaults)
```


Construeert UserProperties met een defaults‑ en altDefaults‑tabel, die in die volgorde worden doorzocht.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| standaardinstellingen | java.util.Properties | Standaard eigenschappen. |
| altDefaults | java.util.Properties | Alternatieve standaard eigenschappen. |

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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsKey(Object arg0) {#containsKey-java.lang.Object-}
```
public boolean containsKey(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsValue(Object arg0) {#containsValue-java.lang.Object-}
```
public boolean containsValue(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### forEach(BiConsumer<? super K,? super V> arg0) {#forEach-java.util.function.BiConsumer---super-K---super-V--}
```
public synchronized void forEach(BiConsumer<? super K,? super V> arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super K,? super V> |  |

### forEach(BiConsumer<? super Object,? super Object> arg0) {#forEach-java.util.function.BiConsumer---super-java.lang.Object---super-java.lang.Object--}
```
public synchronized void forEach(BiConsumer<? super Object,? super Object> arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super java.lang.Object,? super java.lang.Object> |  |

### get(Object arg0) {#get-java.lang.Object-}
```
public Object get(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
java.lang.Object
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Haalt de string‑eigenschapwaarde op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
java.lang.String - Eigenschapwaarde.
### getProperty(String key, String def) {#getProperty-java.lang.String-java.lang.String-}
```
public String getProperty(String key, String def)
```


Haalt de string eigenschapwaarde op. Als de gevraagde eigenschap afwezig is, wordt de opgegeven standaardwaarde geretourneerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| def | java.lang.String | Standaardwaarde van de eigenschap. |

**Returns:**
java.lang.String - Eigenschapwaarde.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Haalt de waarde van de kleureigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
java.awt.Color - Eigenschapwaarde.
### getPropertyColor(String key, Color def) {#getPropertyColor-java.lang.String-java.awt.Color-}
```
public Color getPropertyColor(String key, Color def)
```


Haalt de kleur eigenschapwaarde op. Als de gevraagde eigenschap afwezig is, wordt de opgegeven standaardwaarde geretourneerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| def | java.awt.Color | Standaardwaarde van de eigenschap. |

**Returns:**
java.awt.Color - Eigenschapwaarde.
### getPropertyDimension(String key) {#getPropertyDimension-java.lang.String-}
```
public Dimension getPropertyDimension(String key)
```


Haalt de waarde van de dimensie‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
java.awt.Dimension - Eigenschapwaarde.
### getPropertyDimension(String key, Dimension def) {#getPropertyDimension-java.lang.String-java.awt.Dimension-}
```
public Dimension getPropertyDimension(String key, Dimension def)
```


Haalt de dimensie eigenschapwaarde op. Als de gevraagde eigenschap afwezig is, wordt de opgegeven standaardwaarde geretourneerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| def | java.awt.Dimension | Standaardwaarde van de eigenschap. |

**Returns:**
java.awt.Dimension - Eigenschapwaarde.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Haalt de waarde van de double‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
double - Eigenschapwaarde.
### getPropertyDouble(String key, double def) {#getPropertyDouble-java.lang.String-double-}
```
public double getPropertyDouble(String key, double def)
```


Haalt de double eigenschapwaarde op. Als de gevraagde eigenschap afwezig is, wordt de opgegeven standaardwaarde geretourneerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| def | double | Standaardwaarde van de eigenschap. |

**Returns:**
double - Eigenschapwaarde.
### getPropertyFloat(String key) {#getPropertyFloat-java.lang.String-}
```
public float getPropertyFloat(String key)
```


Haalt de waarde van de float‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
float - Eigenschapwaarde.
### getPropertyFloat(String key, float def) {#getPropertyFloat-java.lang.String-float-}
```
public float getPropertyFloat(String key, float def)
```


Haalt de float eigenschapwaarde op. Als de gevraagde eigenschap afwezig is, wordt de opgegeven standaardwaarde geretourneerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| def | float | Standaardwaarde van de eigenschap. |

**Returns:**
float - Eigenschapwaarde.
### getPropertyInsets(String key) {#getPropertyInsets-java.lang.String-}
```
public Insets getPropertyInsets(String key)
```


Haalt de waarde van de inset‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
java.awt.Insets - Eigenschapwaarde.
### getPropertyInsets(String key, Insets def) {#getPropertyInsets-java.lang.String-java.awt.Insets-}
```
public Insets getPropertyInsets(String key, Insets def)
```


Haalt de insets eigenschapwaarde op. Als de gevraagde eigenschap afwezig is, wordt de opgegeven standaardwaarde geretourneerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| def | java.awt.Insets | Standaardwaarde van de eigenschap. |

**Returns:**
java.awt.Insets - Eigenschapwaarde.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Haalt de waarde van de integer‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
int - Eigenschapwaarde.
### getPropertyInt(String key, int def) {#getPropertyInt-java.lang.String-int-}
```
public int getPropertyInt(String key, int def)
```


Haalt de integer eigenschapwaarde op. Als de gevraagde eigenschap afwezig is, wordt de opgegeven standaardwaarde geretourneerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| def | int | Standaardwaarde van de eigenschap. |

**Returns:**
int - Eigenschapwaarde.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Haalt de waarde van de float‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
java.awt.geom.AffineTransform - Eigenschapwaarde.
### getPropertyMatrix(String key, AffineTransform def) {#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-}
```
public AffineTransform getPropertyMatrix(String key, AffineTransform def)
```


Haalt de float eigenschapwaarde op. Als de gevraagde eigenschap afwezig is, wordt de opgegeven standaardwaarde geretourneerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| def | java.awt.geom.AffineTransform | Standaardwaarde van de eigenschap. |

**Returns:**
java.awt.geom.AffineTransform - Eigenschapwaarde.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Haalt de waarde van de rechthoek‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
java.awt.Rectangle - Eigenschapwaarde.
### getPropertyRectangle(String key, Rectangle def) {#getPropertyRectangle-java.lang.String-java.awt.Rectangle-}
```
public Rectangle getPropertyRectangle(String key, Rectangle def)
```


Haalt de rechthoek eigenschapwaarde op. Als de gevraagde eigenschap afwezig is, wordt de opgegeven standaardwaarde geretourneerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| def | java.awt.Rectangle | Standaardwaarde van de eigenschap. |

**Returns:**
java.awt.Rectangle - Eigenschapwaarde.
### getPropertyStringArray(String key) {#getPropertyStringArray-java.lang.String-}
```
public String[] getPropertyStringArray(String key)
```


Haalt de waarde van de tekenreeks‑array‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
java.lang.String[] - Eigenschapwaarde.
### getPropertyStringArray(String key, String[] def) {#getPropertyStringArray-java.lang.String-java.lang.String---}
```
public String[] getPropertyStringArray(String key, String[] def)
```


Haalt de tekenreeksarray eigenschapwaarde op. Als de gevraagde eigenschap afwezig is, wordt de opgegeven standaardwaarde geretourneerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| def | java.lang.String[] | Standaardwaarde van de eigenschap. |

**Returns:**
java.lang.String[] - Eigenschapwaarde.
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


Haalt de waarde van de boolean‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
boolean - Eigenschapwaarde.
### isProperty(String key, boolean def) {#isProperty-java.lang.String-boolean-}
```
public boolean isProperty(String key, boolean def)
```


Haalt de booleaanse eigenschapwaarde op. Als de gevraagde eigenschap afwezig is, wordt de opgegeven standaardwaarde geretourneerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| def | boolean | Standaardwaarde van de eigenschap. |

**Returns:**
boolean - Eigenschapwaarde.
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.io.PrintStream |  |

### list(PrintWriter arg0) {#list-java.io.PrintWriter-}
```
public void list(PrintWriter arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.io.PrintWriter |  |

### load(InputStream arg0) {#load-java.io.InputStream-}
```
public synchronized void load(InputStream arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### load(Reader arg0) {#load-java.io.Reader-}
```
public synchronized void load(Reader arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.io.Reader |  |

### loadFromXML(InputStream arg0) {#loadFromXML-java.io.InputStream-}
```
public synchronized void loadFromXML(InputStream arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2) {#merge-K-V-java.util.function.BiFunction---super-V---super-V---extends-V--}
```
public synchronized V merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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


Print alle ingestelde eigenschappen.

### propertyNames() {#propertyNames--}
```
public Enumeration propertyNames()
```


Retourneert eigenschapsnamen.

**Returns:**
java.util.Enumeration - Enumeratie van eigenschapsnamen.
### put(K arg0, V arg1) {#put-K-V-}
```
public synchronized V put(K arg0, V arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.util.Map<? extends K,? extends V> |  |

### putAll(Map<?,?> arg0) {#putAll-java.util.Map------}
```
public synchronized void putAll(Map<?,?> arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.util.Map<?,?> |  |

### putIfAbsent(K arg0, V arg1) {#putIfAbsent-K-V-}
```
public synchronized V putIfAbsent(K arg0, V arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
java.lang.Object
### remove(Object arg0, Object arg1) {#remove-java.lang.Object-java.lang.Object-}
```
public synchronized boolean remove(Object arg0, Object arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super K,? super V,? extends V> |  |

### replaceAll(BiFunction<? super Object,? super Object,?> arg0) {#replaceAll-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----}
```
public synchronized void replaceAll(BiFunction<? super Object,? super Object,?> arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super java.lang.Object,? super java.lang.Object,?> |  |

### save(OutputStream arg0, String arg1) {#save-java.io.OutputStream-java.lang.String-}
```
public void save(OutputStream arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### setProperties(Properties properties) {#setProperties-java.util.Properties-}
```
public void setProperties(Properties properties)
```


Kopieert eigenschappen, inclusief de standaardwaarden, naar deze UserProperties.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| eigenschappen | java.util.Properties | Eigenschappen. |

### setProperty(String key, boolean value) {#setProperty-java.lang.String-boolean-}
```
public Object setProperty(String key, boolean value)
```


Stelt de waarde van de boolean‑eigenschap in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | boolean | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(String key, double value) {#setProperty-java.lang.String-double-}
```
public Object setProperty(String key, double value)
```


Stelt de waarde van de double‑eigenschap in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | double | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(String key, float value) {#setProperty-java.lang.String-float-}
```
public Object setProperty(String key, float value)
```


Stelt de waarde van de float‑eigenschap in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | float | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(String key, int value) {#setProperty-java.lang.String-int-}
```
public Object setProperty(String key, int value)
```


Stelt de waarde van de integer‑eigenschap in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | int | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(String key, Color value) {#setProperty-java.lang.String-java.awt.Color-}
```
public Object setProperty(String key, Color value)
```


Stelt de waarde van de kleureigenschap in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | java.awt.Color | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(String key, Dimension value) {#setProperty-java.lang.String-java.awt.Dimension-}
```
public Object setProperty(String key, Dimension value)
```


Stelt de waarde van de dimensie‑eigenschap in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | java.awt.Dimension | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(String key, Insets value) {#setProperty-java.lang.String-java.awt.Insets-}
```
public Object setProperty(String key, Insets value)
```


Stelt de waarde van de inset‑eigenschap in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | java.awt.Insets | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(String key, Rectangle value) {#setProperty-java.lang.String-java.awt.Rectangle-}
```
public Object setProperty(String key, Rectangle value)
```


Stelt de waarde van de rechthoek‑eigenschap in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | java.awt.Rectangle | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(String key, AffineTransform value) {#setProperty-java.lang.String-java.awt.geom.AffineTransform-}
```
public Object setProperty(String key, AffineTransform value)
```


Stelt de waarde van de matrix‑eigenschap in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | java.awt.geom.AffineTransform | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(String key, String value) {#setProperty-java.lang.String-java.lang.String-}
```
public Object setProperty(String key, String value)
```


Stelt de waarde van de tekenreeks‑eigenschap in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | java.lang.String | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(String key, String[] value) {#setProperty-java.lang.String-java.lang.String---}
```
public Object setProperty(String key, String[] value)
```


Stelt de waarde van de tekenreeks‑array‑eigenschap in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | java.lang.String[] | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(Properties properties, String key, boolean value) {#setProperty-java.util.Properties-java.lang.String-boolean-}
```
public static Object setProperty(Properties properties, String key, boolean value)
```


Stelt de waarde van de boolean‑eigenschap in de opgegeven eigenschappen‑tabel in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| eigenschappen | java.util.Properties | De tabel met eigenschappen. |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | boolean | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(Properties properties, String key, double value) {#setProperty-java.util.Properties-java.lang.String-double-}
```
public static Object setProperty(Properties properties, String key, double value)
```


Stelt de waarde van de double‑eigenschap in de opgegeven eigenschappen‑tabel in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| eigenschappen | java.util.Properties | De tabel met eigenschappen. |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | double | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(Properties properties, String key, float value) {#setProperty-java.util.Properties-java.lang.String-float-}
```
public static Object setProperty(Properties properties, String key, float value)
```


Stelt de float‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| eigenschappen | java.util.Properties | De tabel met eigenschappen. |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | float | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(Properties properties, String key, int value) {#setProperty-java.util.Properties-java.lang.String-int-}
```
public static Object setProperty(Properties properties, String key, int value)
```


Stelt de integer‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| eigenschappen | java.util.Properties | De tabel met eigenschappen. |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | int | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(Properties properties, String key, Color value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Color-}
```
public static Object setProperty(Properties properties, String key, Color value)
```


Stelt de kleur‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| eigenschappen | java.util.Properties | De tabel met eigenschappen. |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | java.awt.Color | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(Properties properties, String key, Dimension value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-}
```
public static Object setProperty(Properties properties, String key, Dimension value)
```


Stelt de dimensie‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| eigenschappen | java.util.Properties | De tabel met eigenschappen. |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | java.awt.Dimension | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(Properties properties, String key, Insets value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-}
```
public static Object setProperty(Properties properties, String key, Insets value)
```


Stelt de insets‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| eigenschappen | java.util.Properties | De tabel met eigenschappen. |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | java.awt.Insets | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(Properties properties, String key, Rectangle value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-}
```
public static Object setProperty(Properties properties, String key, Rectangle value)
```


Stelt de rechthoek‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| eigenschappen | java.util.Properties | De tabel met eigenschappen. |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | java.awt.Rectangle | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(Properties properties, String key, AffineTransform value) {#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-}
```
public static Object setProperty(Properties properties, String key, AffineTransform value)
```


Stelt de matrix‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| eigenschappen | java.util.Properties | De tabel met eigenschappen. |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | java.awt.geom.AffineTransform | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
### setProperty(Properties properties, String key, String[] value) {#setProperty-java.util.Properties-java.lang.String-java.lang.String---}
```
public static Object setProperty(Properties properties, String key, String[] value)
```


Stelt de string‑array‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| eigenschappen | java.util.Properties | De tabel met eigenschappen. |
| sleutel | java.lang.String | De naam van de eigenschap. |
| waarde | java.lang.String[] | De waarde van de eigenschap. |

**Returns:**
java.lang.Object - Een eigenschap.
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### store(Writer arg0, String arg1) {#store-java.io.Writer-java.lang.String-}
```
public void store(Writer arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.io.Writer |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1) {#storeToXML-java.io.OutputStream-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, String arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1, String arg2)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |
| arg2 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, Charset arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.nio.charset.Charset-}
```
public void storeToXML(OutputStream arg0, String arg1, Charset arg2)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

