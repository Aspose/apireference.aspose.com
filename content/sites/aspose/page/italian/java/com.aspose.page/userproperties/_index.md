---
title: "UserProperties"
second_title: "Aspose.Page per Java API Reference"
description: "Classe di proprietà speciale che consente di impostare e restituire proprietà tipizzate."
type: docs
weight: 18
url: /it/java/com.aspose.page/userproperties/
---
**Inheritance:**
java.lang.Object, java.util.Dictionary, java.util.Hashtable, java.util.Properties
```
public class UserProperties extends Properties
```

Classe di proprietà speciale che consente di impostare e restituire proprietà tipizzate. Consente anche di collegare due oggetti di proprietà predefiniti da cercare se questo oggetto di proprietà non contiene la proprietà.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [UserProperties()](#UserProperties--) | Inizializza un'istanza vuota della classe UserProperties. |
| [UserProperties(Properties defaults)](#UserProperties-java.util.Properties-) | Inizializza una classe UserProperties con valori predefiniti. |
| [UserProperties(Properties defaults, Properties altDefaults)](#UserProperties-java.util.Properties-java.util.Properties-) | Costruisce UserProperties con una tabella defaults e altDefaults, che vengono cercate in quest'ordine. |
## Metodi

| Metodo | Descrizione |
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
| [getProperty(String key)](#getProperty-java.lang.String-) | Ottiene il valore della proprietà stringa. |
| [getProperty(String key, String def)](#getProperty-java.lang.String-java.lang.String-) | Ottiene il valore della proprietà stringa. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Ottiene il valore della proprietà colore. |
| [getPropertyColor(String key, Color def)](#getPropertyColor-java.lang.String-java.awt.Color-) | Ottiene il valore della proprietà colore. |
| [getPropertyDimension(String key)](#getPropertyDimension-java.lang.String-) | Ottiene il valore della proprietà dimensione. |
| [getPropertyDimension(String key, Dimension def)](#getPropertyDimension-java.lang.String-java.awt.Dimension-) | Ottiene il valore della proprietà dimensione. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Ottiene il valore della proprietà double. |
| [getPropertyDouble(String key, double def)](#getPropertyDouble-java.lang.String-double-) | Ottiene il valore della proprietà double. |
| [getPropertyFloat(String key)](#getPropertyFloat-java.lang.String-) | Ottiene il valore della proprietà float. |
| [getPropertyFloat(String key, float def)](#getPropertyFloat-java.lang.String-float-) | Ottiene il valore della proprietà float. |
| [getPropertyInsets(String key)](#getPropertyInsets-java.lang.String-) | Ottiene il valore della proprietà insets. |
| [getPropertyInsets(String key, Insets def)](#getPropertyInsets-java.lang.String-java.awt.Insets-) | Ottiene il valore della proprietà insets. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Ottiene il valore della proprietà integer. |
| [getPropertyInt(String key, int def)](#getPropertyInt-java.lang.String-int-) | Ottiene il valore della proprietà integer. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Ottiene il valore della proprietà float. |
| [getPropertyMatrix(String key, AffineTransform def)](#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-) | Ottiene il valore della proprietà float. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Ottiene il valore della proprietà rectangle. |
| [getPropertyRectangle(String key, Rectangle def)](#getPropertyRectangle-java.lang.String-java.awt.Rectangle-) | Ottiene il valore della proprietà rectangle. |
| [getPropertyStringArray(String key)](#getPropertyStringArray-java.lang.String-) | Ottiene il valore della proprietà array di stringhe. |
| [getPropertyStringArray(String key, String[] def)](#getPropertyStringArray-java.lang.String-java.lang.String---) | Ottiene il valore della proprietà array di stringhe. |
| [hashCode()](#hashCode--) |  |
| [isEmpty()](#isEmpty--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Ottiene il valore della proprietà boolean. |
| [isProperty(String key, boolean def)](#isProperty-java.lang.String-boolean-) | Ottiene il valore della proprietà boolean. |
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
| [printProperties()](#printProperties--) | Stampa tutte le proprietà impostate. |
| [propertyNames()](#propertyNames--) | Restituisce i nomi delle proprietà. |
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
| [setProperties(Properties properties)](#setProperties-java.util.Properties-) | Copia le proprietà, inclusi i valori predefiniti, in questo UserProperties |
| [setProperty(String key, boolean value)](#setProperty-java.lang.String-boolean-) | Imposta il valore della proprietà boolean. |
| [setProperty(String key, double value)](#setProperty-java.lang.String-double-) | Imposta il valore della proprietà double. |
| [setProperty(String key, float value)](#setProperty-java.lang.String-float-) | Imposta il valore della proprietà float. |
| [setProperty(String key, int value)](#setProperty-java.lang.String-int-) | Imposta il valore della proprietà integer. |
| [setProperty(String key, Color value)](#setProperty-java.lang.String-java.awt.Color-) | Imposta il valore della proprietà colore. |
| [setProperty(String key, Dimension value)](#setProperty-java.lang.String-java.awt.Dimension-) | Imposta il valore della proprietà dimensione. |
| [setProperty(String key, Insets value)](#setProperty-java.lang.String-java.awt.Insets-) | Imposta il valore della proprietà insets. |
| [setProperty(String key, Rectangle value)](#setProperty-java.lang.String-java.awt.Rectangle-) | Imposta il valore della proprietà rectangle. |
| [setProperty(String key, AffineTransform value)](#setProperty-java.lang.String-java.awt.geom.AffineTransform-) | Imposta il valore della proprietà matrix. |
| [setProperty(String key, String value)](#setProperty-java.lang.String-java.lang.String-) | Imposta il valore della proprietà string. |
| [setProperty(String key, String[] value)](#setProperty-java.lang.String-java.lang.String---) | Imposta il valore della proprietà array di stringhe. |
| [setProperty(Properties properties, String key, boolean value)](#setProperty-java.util.Properties-java.lang.String-boolean-) | Imposta il valore della proprietà boolean nella tabella delle proprietà specificata. |
| [setProperty(Properties properties, String key, double value)](#setProperty-java.util.Properties-java.lang.String-double-) | Imposta il valore della proprietà double nella tabella delle proprietà specificata. |
| [setProperty(Properties properties, String key, float value)](#setProperty-java.util.Properties-java.lang.String-float-) | Imposta il valore della proprietà float nella tabella delle proprietà specificata. |
| [setProperty(Properties properties, String key, int value)](#setProperty-java.util.Properties-java.lang.String-int-) | Imposta il valore della proprietà intera nella tabella delle proprietà specificata. |
| [setProperty(Properties properties, String key, Color value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Color-) | Imposta il valore della proprietà colore nella tabella delle proprietà specificata. |
| [setProperty(Properties properties, String key, Dimension value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-) | Imposta il valore della proprietà dimensione nella tabella delle proprietà specificata. |
| [setProperty(Properties properties, String key, Insets value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-) | Imposta il valore della proprietà inset nella tabella delle proprietà specificata. |
| [setProperty(Properties properties, String key, Rectangle value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-) | Imposta il valore della proprietà rettangolo nella tabella delle proprietà specificata. |
| [setProperty(Properties properties, String key, AffineTransform value)](#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-) | Imposta il valore della proprietà matrice nella tabella delle proprietà specificata. |
| [setProperty(Properties properties, String key, String[] value)](#setProperty-java.util.Properties-java.lang.String-java.lang.String---) | Imposta il valore della proprietà array di stringhe nella tabella delle proprietà specificata. |
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


Inizializza un'istanza vuota della classe UserProperties.

### UserProperties(Properties defaults) {#UserProperties-java.util.Properties-}
```
public UserProperties(Properties defaults)
```


Inizializza una classe UserProperties con valori predefiniti.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| defaults | java.util.Properties | Valori predefiniti delle proprietà. |

### UserProperties(Properties defaults, Properties altDefaults) {#UserProperties-java.util.Properties-java.util.Properties-}
```
public UserProperties(Properties defaults, Properties altDefaults)
```


Costruisce UserProperties con una tabella defaults e altDefaults, che vengono cercate in quest'ordine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| defaults | java.util.Properties | Proprietà predefinite. |
| altDefaults | java.util.Properties | Proprietà predefinite alternative. |

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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsKey(Object arg0) {#containsKey-java.lang.Object-}
```
public boolean containsKey(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsValue(Object arg0) {#containsValue-java.lang.Object-}
```
public boolean containsValue(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### forEach(BiConsumer<? super K,? super V> arg0) {#forEach-java.util.function.BiConsumer---super-K---super-V--}
```
public synchronized void forEach(BiConsumer<? super K,? super V> arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super K,? super V> |  |

### forEach(BiConsumer<? super Object,? super Object> arg0) {#forEach-java.util.function.BiConsumer---super-java.lang.Object---super-java.lang.Object--}
```
public synchronized void forEach(BiConsumer<? super Object,? super Object> arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super java.lang.Object,? super java.lang.Object> |  |

### get(Object arg0) {#get-java.lang.Object-}
```
public Object get(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
java.lang.Object
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Ottiene il valore della proprietà stringa.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
java.lang.String - Valore della proprietà.
### getProperty(String key, String def) {#getProperty-java.lang.String-java.lang.String-}
```
public String getProperty(String key, String def)
```


Ottiene il valore della proprietà stringa. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| def | java.lang.String | Valore predefinito della proprietà. |

**Returns:**
java.lang.String - Valore della proprietà.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Ottiene il valore della proprietà colore.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
java.awt.Color - Valore della proprietà.
### getPropertyColor(String key, Color def) {#getPropertyColor-java.lang.String-java.awt.Color-}
```
public Color getPropertyColor(String key, Color def)
```


Ottiene il valore della proprietà colore. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| def | java.awt.Color | Valore predefinito della proprietà. |

**Returns:**
java.awt.Color - Valore della proprietà.
### getPropertyDimension(String key) {#getPropertyDimension-java.lang.String-}
```
public Dimension getPropertyDimension(String key)
```


Ottiene il valore della proprietà dimensione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
java.awt.Dimension - Valore della proprietà.
### getPropertyDimension(String key, Dimension def) {#getPropertyDimension-java.lang.String-java.awt.Dimension-}
```
public Dimension getPropertyDimension(String key, Dimension def)
```


Ottiene il valore della proprietà dimensione. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| def | java.awt.Dimension | Valore predefinito della proprietà. |

**Returns:**
java.awt.Dimension - Valore della proprietà.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Ottiene il valore della proprietà double.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
double - Valore della proprietà.
### getPropertyDouble(String key, double def) {#getPropertyDouble-java.lang.String-double-}
```
public double getPropertyDouble(String key, double def)
```


Ottiene il valore della proprietà double. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| def | double | Valore predefinito della proprietà. |

**Returns:**
double - Valore della proprietà.
### getPropertyFloat(String key) {#getPropertyFloat-java.lang.String-}
```
public float getPropertyFloat(String key)
```


Ottiene il valore della proprietà float.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
float - Valore della proprietà.
### getPropertyFloat(String key, float def) {#getPropertyFloat-java.lang.String-float-}
```
public float getPropertyFloat(String key, float def)
```


Ottiene il valore della proprietà float. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| def | float | Valore predefinito della proprietà. |

**Returns:**
float - Valore della proprietà.
### getPropertyInsets(String key) {#getPropertyInsets-java.lang.String-}
```
public Insets getPropertyInsets(String key)
```


Ottiene il valore della proprietà insets.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
java.awt.Insets - Valore della proprietà.
### getPropertyInsets(String key, Insets def) {#getPropertyInsets-java.lang.String-java.awt.Insets-}
```
public Insets getPropertyInsets(String key, Insets def)
```


Ottiene il valore della proprietà insets. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| def | java.awt.Insets | Valore predefinito della proprietà. |

**Returns:**
java.awt.Insets - Valore della proprietà.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Ottiene il valore della proprietà integer.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
int - Valore della proprietà.
### getPropertyInt(String key, int def) {#getPropertyInt-java.lang.String-int-}
```
public int getPropertyInt(String key, int def)
```


Ottiene il valore della proprietà intera. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| def | int | Valore predefinito della proprietà. |

**Returns:**
int - Valore della proprietà.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Ottiene il valore della proprietà float.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
java.awt.geom.AffineTransform - Valore della proprietà.
### getPropertyMatrix(String key, AffineTransform def) {#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-}
```
public AffineTransform getPropertyMatrix(String key, AffineTransform def)
```


Ottiene il valore della proprietà float. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| def | java.awt.geom.AffineTransform | Valore predefinito della proprietà. |

**Returns:**
java.awt.geom.AffineTransform - Valore della proprietà.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Ottiene il valore della proprietà rectangle.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
java.awt.Rectangle - Valore della proprietà.
### getPropertyRectangle(String key, Rectangle def) {#getPropertyRectangle-java.lang.String-java.awt.Rectangle-}
```
public Rectangle getPropertyRectangle(String key, Rectangle def)
```


Ottiene il valore della proprietà rettangolo. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| def | java.awt.Rectangle | Valore predefinito della proprietà. |

**Returns:**
java.awt.Rectangle - Valore della proprietà.
### getPropertyStringArray(String key) {#getPropertyStringArray-java.lang.String-}
```
public String[] getPropertyStringArray(String key)
```


Ottiene il valore della proprietà array di stringhe.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
java.lang.String[] - Valore della proprietà.
### getPropertyStringArray(String key, String[] def) {#getPropertyStringArray-java.lang.String-java.lang.String---}
```
public String[] getPropertyStringArray(String key, String[] def)
```


Ottiene il valore della proprietà array di stringhe. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| def | java.lang.String[] | Valore predefinito della proprietà. |

**Returns:**
java.lang.String[] - Valore della proprietà.
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


Ottiene il valore della proprietà boolean.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
boolean - Valore della proprietà.
### isProperty(String key, boolean def) {#isProperty-java.lang.String-boolean-}
```
public boolean isProperty(String key, boolean def)
```


Ottiene il valore della proprietà booleana. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| def | boolean | Valore predefinito della proprietà. |

**Returns:**
boolean - Valore della proprietà.
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.io.PrintStream |  |

### list(PrintWriter arg0) {#list-java.io.PrintWriter-}
```
public void list(PrintWriter arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.io.PrintWriter |  |

### load(InputStream arg0) {#load-java.io.InputStream-}
```
public synchronized void load(InputStream arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### load(Reader arg0) {#load-java.io.Reader-}
```
public synchronized void load(Reader arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.io.Reader |  |

### loadFromXML(InputStream arg0) {#loadFromXML-java.io.InputStream-}
```
public synchronized void loadFromXML(InputStream arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2) {#merge-K-V-java.util.function.BiFunction---super-V---super-V---extends-V--}
```
public synchronized V merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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


Stampa tutte le proprietà impostate.

### propertyNames() {#propertyNames--}
```
public Enumeration propertyNames()
```


Restituisce i nomi delle proprietà.

**Returns:**
java.util.Enumeration - Enumerazione dei nomi delle proprietà.
### put(K arg0, V arg1) {#put-K-V-}
```
public synchronized V put(K arg0, V arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.util.Map<? extends K,? extends V> |  |

### putAll(Map<?,?> arg0) {#putAll-java.util.Map------}
```
public synchronized void putAll(Map<?,?> arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.util.Map<?,?> |  |

### putIfAbsent(K arg0, V arg1) {#putIfAbsent-K-V-}
```
public synchronized V putIfAbsent(K arg0, V arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
java.lang.Object
### remove(Object arg0, Object arg1) {#remove-java.lang.Object-java.lang.Object-}
```
public synchronized boolean remove(Object arg0, Object arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super K,? super V,? extends V> |  |

### replaceAll(BiFunction<? super Object,? super Object,?> arg0) {#replaceAll-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----}
```
public synchronized void replaceAll(BiFunction<? super Object,? super Object,?> arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super java.lang.Object,? super java.lang.Object,?> |  |

### save(OutputStream arg0, String arg1) {#save-java.io.OutputStream-java.lang.String-}
```
public void save(OutputStream arg0, String arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### setProperties(Properties properties) {#setProperties-java.util.Properties-}
```
public void setProperties(Properties properties)
```


Copia le proprietà, inclusi i valori predefiniti, in questo UserProperties

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| proprietà | java.util.Properties | Proprietà. |

### setProperty(String key, boolean value) {#setProperty-java.lang.String-boolean-}
```
public Object setProperty(String key, boolean value)
```


Imposta il valore della proprietà boolean.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| valore | boolean | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(String key, double value) {#setProperty-java.lang.String-double-}
```
public Object setProperty(String key, double value)
```


Imposta il valore della proprietà double.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| valore | double | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(String key, float value) {#setProperty-java.lang.String-float-}
```
public Object setProperty(String key, float value)
```


Imposta il valore della proprietà float.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| valore | float | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(String key, int value) {#setProperty-java.lang.String-int-}
```
public Object setProperty(String key, int value)
```


Imposta il valore della proprietà integer.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| valore | int | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(String key, Color value) {#setProperty-java.lang.String-java.awt.Color-}
```
public Object setProperty(String key, Color value)
```


Imposta il valore della proprietà colore.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| valore | java.awt.Color | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(String key, Dimension value) {#setProperty-java.lang.String-java.awt.Dimension-}
```
public Object setProperty(String key, Dimension value)
```


Imposta il valore della proprietà dimensione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| valore | java.awt.Dimension | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(String key, Insets value) {#setProperty-java.lang.String-java.awt.Insets-}
```
public Object setProperty(String key, Insets value)
```


Imposta il valore della proprietà insets.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| valore | java.awt.Insets | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(String key, Rectangle value) {#setProperty-java.lang.String-java.awt.Rectangle-}
```
public Object setProperty(String key, Rectangle value)
```


Imposta il valore della proprietà rectangle.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| valore | java.awt.Rectangle | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(String key, AffineTransform value) {#setProperty-java.lang.String-java.awt.geom.AffineTransform-}
```
public Object setProperty(String key, AffineTransform value)
```


Imposta il valore della proprietà matrix.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| valore | java.awt.geom.AffineTransform | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(String key, String value) {#setProperty-java.lang.String-java.lang.String-}
```
public Object setProperty(String key, String value)
```


Imposta il valore della proprietà string.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| valore | java.lang.String | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(String key, String[] value) {#setProperty-java.lang.String-java.lang.String---}
```
public Object setProperty(String key, String[] value)
```


Imposta il valore della proprietà array di stringhe.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |
| valore | java.lang.String[] | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(Properties properties, String key, boolean value) {#setProperty-java.util.Properties-java.lang.String-boolean-}
```
public static Object setProperty(Properties properties, String key, boolean value)
```


Imposta il valore della proprietà boolean nella tabella delle proprietà specificata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| proprietà | java.util.Properties | La tabella delle proprietà. |
| key | java.lang.String | Il nome della proprietà. |
| valore | boolean | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(Properties properties, String key, double value) {#setProperty-java.util.Properties-java.lang.String-double-}
```
public static Object setProperty(Properties properties, String key, double value)
```


Imposta il valore della proprietà double nella tabella delle proprietà specificata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| proprietà | java.util.Properties | La tabella delle proprietà. |
| key | java.lang.String | Il nome della proprietà. |
| valore | double | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(Properties properties, String key, float value) {#setProperty-java.util.Properties-java.lang.String-float-}
```
public static Object setProperty(Properties properties, String key, float value)
```


Imposta il valore della proprietà float nella tabella delle proprietà specificata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| proprietà | java.util.Properties | La tabella delle proprietà. |
| key | java.lang.String | Il nome della proprietà. |
| valore | float | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(Properties properties, String key, int value) {#setProperty-java.util.Properties-java.lang.String-int-}
```
public static Object setProperty(Properties properties, String key, int value)
```


Imposta il valore della proprietà intera nella tabella delle proprietà specificata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| proprietà | java.util.Properties | La tabella delle proprietà. |
| key | java.lang.String | Il nome della proprietà. |
| valore | int | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(Properties properties, String key, Color value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Color-}
```
public static Object setProperty(Properties properties, String key, Color value)
```


Imposta il valore della proprietà colore nella tabella delle proprietà specificata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| proprietà | java.util.Properties | La tabella delle proprietà. |
| key | java.lang.String | Il nome della proprietà. |
| valore | java.awt.Color | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(Properties properties, String key, Dimension value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-}
```
public static Object setProperty(Properties properties, String key, Dimension value)
```


Imposta il valore della proprietà dimensione nella tabella delle proprietà specificata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| proprietà | java.util.Properties | La tabella delle proprietà. |
| key | java.lang.String | Il nome della proprietà. |
| valore | java.awt.Dimension | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(Properties properties, String key, Insets value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-}
```
public static Object setProperty(Properties properties, String key, Insets value)
```


Imposta il valore della proprietà inset nella tabella delle proprietà specificata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| proprietà | java.util.Properties | La tabella delle proprietà. |
| key | java.lang.String | Il nome della proprietà. |
| valore | java.awt.Insets | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(Properties properties, String key, Rectangle value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-}
```
public static Object setProperty(Properties properties, String key, Rectangle value)
```


Imposta il valore della proprietà rettangolo nella tabella delle proprietà specificata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| proprietà | java.util.Properties | La tabella delle proprietà. |
| key | java.lang.String | Il nome della proprietà. |
| valore | java.awt.Rectangle | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(Properties properties, String key, AffineTransform value) {#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-}
```
public static Object setProperty(Properties properties, String key, AffineTransform value)
```


Imposta il valore della proprietà matrice nella tabella delle proprietà specificata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| proprietà | java.util.Properties | La tabella delle proprietà. |
| key | java.lang.String | Il nome della proprietà. |
| valore | java.awt.geom.AffineTransform | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
### setProperty(Properties properties, String key, String[] value) {#setProperty-java.util.Properties-java.lang.String-java.lang.String---}
```
public static Object setProperty(Properties properties, String key, String[] value)
```


Imposta il valore della proprietà array di stringhe nella tabella delle proprietà specificata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| proprietà | java.util.Properties | La tabella delle proprietà. |
| key | java.lang.String | Il nome della proprietà. |
| valore | java.lang.String[] | Il valore della proprietà. |

**Returns:**
java.lang.Object - Una proprietà.
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### store(Writer arg0, String arg1) {#store-java.io.Writer-java.lang.String-}
```
public void store(Writer arg0, String arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.io.Writer |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1) {#storeToXML-java.io.OutputStream-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, String arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1, String arg2)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |
| arg2 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, Charset arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.nio.charset.Charset-}
```
public void storeToXML(OutputStream arg0, String arg1, Charset arg2)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

