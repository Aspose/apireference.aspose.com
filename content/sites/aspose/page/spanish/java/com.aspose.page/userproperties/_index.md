---
title: "UserProperties"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase de propiedad especial que permite establecer y devolver propiedades tipadas."
type: docs
weight: 18
url: /es/java/com.aspose.page/userproperties/
---
**Inheritance:**
java.lang.Object, java.util.Dictionary, java.util.Hashtable, java.util.Properties
```
public class UserProperties extends Properties
```

Clase de propiedad especial que permite establecer y devolver propiedades tipadas. También permite la conexión de dos objetos de propiedad predeterminados para buscar si este objeto de propiedad no contiene la propiedad.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [UserProperties()](#UserProperties--) | Inicializa una instancia vacía de la clase UserProperties. |
| [UserProperties(Properties defaults)](#UserProperties-java.util.Properties-) | Inicializa una instancia de la clase UserProperties con valores predeterminados. |
| [UserProperties(Properties defaults, Properties altDefaults)](#UserProperties-java.util.Properties-java.util.Properties-) | Construye UserProperties con una tabla defaults y altDefaults, que se buscan en ese orden. |
## Métodos

| Método | Descripción |
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
| [getProperty(String key)](#getProperty-java.lang.String-) | Obtiene el valor de la propiedad de cadena. |
| [getProperty(String key, String def)](#getProperty-java.lang.String-java.lang.String-) | Obtiene el valor de la propiedad de cadena. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Obtiene el valor de la propiedad de color. |
| [getPropertyColor(String key, Color def)](#getPropertyColor-java.lang.String-java.awt.Color-) | Obtiene el valor de la propiedad de color. |
| [getPropertyDimension(String key)](#getPropertyDimension-java.lang.String-) | Obtiene el valor de la propiedad de dimensión. |
| [getPropertyDimension(String key, Dimension def)](#getPropertyDimension-java.lang.String-java.awt.Dimension-) | Obtiene el valor de la propiedad de dimensión. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Obtiene el valor de la propiedad doble. |
| [getPropertyDouble(String key, double def)](#getPropertyDouble-java.lang.String-double-) | Obtiene el valor de la propiedad doble. |
| [getPropertyFloat(String key)](#getPropertyFloat-java.lang.String-) | Obtiene el valor de la propiedad flotante. |
| [getPropertyFloat(String key, float def)](#getPropertyFloat-java.lang.String-float-) | Obtiene el valor de la propiedad flotante. |
| [getPropertyInsets(String key)](#getPropertyInsets-java.lang.String-) | Obtiene el valor de la propiedad insets. |
| [getPropertyInsets(String key, Insets def)](#getPropertyInsets-java.lang.String-java.awt.Insets-) | Obtiene el valor de la propiedad insets. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Obtiene el valor de la propiedad entera. |
| [getPropertyInt(String key, int def)](#getPropertyInt-java.lang.String-int-) | Obtiene el valor de la propiedad entera. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Obtiene el valor de la propiedad flotante. |
| [getPropertyMatrix(String key, AffineTransform def)](#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-) | Obtiene el valor de la propiedad flotante. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Obtiene el valor de la propiedad rectángulo. |
| [getPropertyRectangle(String key, Rectangle def)](#getPropertyRectangle-java.lang.String-java.awt.Rectangle-) | Obtiene el valor de la propiedad rectángulo. |
| [getPropertyStringArray(String key)](#getPropertyStringArray-java.lang.String-) | Obtiene el valor de la propiedad de matriz de cadenas. |
| [getPropertyStringArray(String key, String[] def)](#getPropertyStringArray-java.lang.String-java.lang.String---) | Obtiene el valor de la propiedad de matriz de cadenas. |
| [hashCode()](#hashCode--) |  |
| [isEmpty()](#isEmpty--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Obtiene el valor de la propiedad booleana. |
| [isProperty(String key, boolean def)](#isProperty-java.lang.String-boolean-) | Obtiene el valor de la propiedad booleana. |
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
| [printProperties()](#printProperties--) | Imprime todas las propiedades establecidas. |
| [propertyNames()](#propertyNames--) | Devuelve los nombres de las propiedades. |
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
| [setProperties(Properties properties)](#setProperties-java.util.Properties-) | Copia las propiedades, incluidos sus valores predeterminados, en este UserProperties. |
| [setProperty(String key, boolean value)](#setProperty-java.lang.String-boolean-) | Establece el valor de la propiedad booleana. |
| [setProperty(String key, double value)](#setProperty-java.lang.String-double-) | Establece el valor de la propiedad double. |
| [setProperty(String key, float value)](#setProperty-java.lang.String-float-) | Establece el valor de la propiedad float. |
| [setProperty(String key, int value)](#setProperty-java.lang.String-int-) | Establece el valor de la propiedad entera. |
| [setProperty(String key, Color value)](#setProperty-java.lang.String-java.awt.Color-) | Establece el valor de la propiedad de color. |
| [setProperty(String key, Dimension value)](#setProperty-java.lang.String-java.awt.Dimension-) | Establece el valor de la propiedad de dimensión. |
| [setProperty(String key, Insets value)](#setProperty-java.lang.String-java.awt.Insets-) | Establece el valor de la propiedad de inset. |
| [setProperty(String key, Rectangle value)](#setProperty-java.lang.String-java.awt.Rectangle-) | Establece el valor de la propiedad de rectángulo. |
| [setProperty(String key, AffineTransform value)](#setProperty-java.lang.String-java.awt.geom.AffineTransform-) | Establece el valor de la propiedad de matriz. |
| [setProperty(String key, String value)](#setProperty-java.lang.String-java.lang.String-) | Establece el valor de la propiedad de cadena. |
| [setProperty(String key, String[] value)](#setProperty-java.lang.String-java.lang.String---) | Establece el valor de la propiedad de matriz de cadenas. |
| [setProperty(Properties properties, String key, boolean value)](#setProperty-java.util.Properties-java.lang.String-boolean-) | Establece el valor de la propiedad booleana en la tabla de propiedades especificada. |
| [setProperty(Properties properties, String key, double value)](#setProperty-java.util.Properties-java.lang.String-double-) | Establece el valor de la propiedad double en la tabla de propiedades especificada. |
| [setProperty(Properties properties, String key, float value)](#setProperty-java.util.Properties-java.lang.String-float-) | Establece el valor de la propiedad float en la tabla de propiedades especificada. |
| [setProperty(Properties properties, String key, int value)](#setProperty-java.util.Properties-java.lang.String-int-) | Establece el valor de la propiedad entera en la tabla de propiedades especificada. |
| [setProperty(Properties properties, String key, Color value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Color-) | Establece el valor de la propiedad de color en la tabla de propiedades especificada. |
| [setProperty(Properties properties, String key, Dimension value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-) | Establece el valor de la propiedad de dimensión en la tabla de propiedades especificada. |
| [setProperty(Properties properties, String key, Insets value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-) | Establece el valor de la propiedad de inset en la tabla de propiedades especificada. |
| [setProperty(Properties properties, String key, Rectangle value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-) | Establece el valor de la propiedad de rectángulo en la tabla de propiedades especificada. |
| [setProperty(Properties properties, String key, AffineTransform value)](#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-) | Establece el valor de la propiedad de matriz en la tabla de propiedades especificada. |
| [setProperty(Properties properties, String key, String[] value)](#setProperty-java.util.Properties-java.lang.String-java.lang.String---) | Establece el valor de la propiedad de matriz de cadenas en la tabla de propiedades especificada. |
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


Inicializa una instancia vacía de la clase UserProperties.

### UserProperties(Properties defaults) {#UserProperties-java.util.Properties-}
```
public UserProperties(Properties defaults)
```


Inicializa una instancia de la clase UserProperties con valores predeterminados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| defaults | java.util.Properties | Valores predeterminados de propiedades. |

### UserProperties(Properties defaults, Properties altDefaults) {#UserProperties-java.util.Properties-java.util.Properties-}
```
public UserProperties(Properties defaults, Properties altDefaults)
```


Construye UserProperties con una tabla defaults y altDefaults, que se buscan en ese orden.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| defaults | java.util.Properties | Propiedades predeterminadas. |
| altDefaults | java.util.Properties | Propiedades predeterminadas alternativas. |

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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsKey(Object arg0) {#containsKey-java.lang.Object-}
```
public boolean containsKey(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsValue(Object arg0) {#containsValue-java.lang.Object-}
```
public boolean containsValue(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### forEach(BiConsumer<? super K,? super V> arg0) {#forEach-java.util.function.BiConsumer---super-K---super-V--}
```
public synchronized void forEach(BiConsumer<? super K,? super V> arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super K,? super V> |  |

### forEach(BiConsumer<? super Object,? super Object> arg0) {#forEach-java.util.function.BiConsumer---super-java.lang.Object---super-java.lang.Object--}
```
public synchronized void forEach(BiConsumer<? super Object,? super Object> arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super java.lang.Object,? super java.lang.Object> |  |

### get(Object arg0) {#get-java.lang.Object-}
```
public Object get(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
java.lang.Object
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Obtiene el valor de la propiedad de cadena.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
java.lang.String - Valor de la propiedad.
### getProperty(String key, String def) {#getProperty-java.lang.String-java.lang.String-}
```
public String getProperty(String key, String def)
```


Obtiene el valor de la propiedad de cadena. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| def | java.lang.String | Valor predeterminado de la propiedad. |

**Returns:**
java.lang.String - Valor de la propiedad.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Obtiene el valor de la propiedad de color.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
java.awt.Color - Valor de la propiedad.
### getPropertyColor(String key, Color def) {#getPropertyColor-java.lang.String-java.awt.Color-}
```
public Color getPropertyColor(String key, Color def)
```


Obtiene el valor de la propiedad de color. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| def | java.awt.Color | Valor predeterminado de la propiedad. |

**Returns:**
java.awt.Color - Valor de la propiedad.
### getPropertyDimension(String key) {#getPropertyDimension-java.lang.String-}
```
public Dimension getPropertyDimension(String key)
```


Obtiene el valor de la propiedad de dimensión.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
java.awt.Dimension - Valor de la propiedad.
### getPropertyDimension(String key, Dimension def) {#getPropertyDimension-java.lang.String-java.awt.Dimension-}
```
public Dimension getPropertyDimension(String key, Dimension def)
```


Obtiene el valor de la propiedad de dimensión. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| def | java.awt.Dimension | Valor predeterminado de la propiedad. |

**Returns:**
java.awt.Dimension - Valor de la propiedad.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Obtiene el valor de la propiedad doble.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
double - Valor de la propiedad.
### getPropertyDouble(String key, double def) {#getPropertyDouble-java.lang.String-double-}
```
public double getPropertyDouble(String key, double def)
```


Obtiene el valor de la propiedad double. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| def | double | Valor predeterminado de la propiedad. |

**Returns:**
double - Valor de la propiedad.
### getPropertyFloat(String key) {#getPropertyFloat-java.lang.String-}
```
public float getPropertyFloat(String key)
```


Obtiene el valor de la propiedad flotante.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
float - Valor de la propiedad.
### getPropertyFloat(String key, float def) {#getPropertyFloat-java.lang.String-float-}
```
public float getPropertyFloat(String key, float def)
```


Obtiene el valor de la propiedad float. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| def | float | Valor predeterminado de la propiedad. |

**Returns:**
float - Valor de la propiedad.
### getPropertyInsets(String key) {#getPropertyInsets-java.lang.String-}
```
public Insets getPropertyInsets(String key)
```


Obtiene el valor de la propiedad insets.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
java.awt.Insets - Valor de la propiedad.
### getPropertyInsets(String key, Insets def) {#getPropertyInsets-java.lang.String-java.awt.Insets-}
```
public Insets getPropertyInsets(String key, Insets def)
```


Obtiene el valor de la propiedad insets. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| def | java.awt.Insets | Valor predeterminado de la propiedad. |

**Returns:**
java.awt.Insets - Valor de la propiedad.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Obtiene el valor de la propiedad entera.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
int - Valor de la propiedad.
### getPropertyInt(String key, int def) {#getPropertyInt-java.lang.String-int-}
```
public int getPropertyInt(String key, int def)
```


Obtiene el valor de la propiedad entera. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| def | int | Valor predeterminado de la propiedad. |

**Returns:**
int - Valor de la propiedad.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Obtiene el valor de la propiedad flotante.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
java.awt.geom.AffineTransform - Valor de la propiedad.
### getPropertyMatrix(String key, AffineTransform def) {#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-}
```
public AffineTransform getPropertyMatrix(String key, AffineTransform def)
```


Obtiene el valor de la propiedad float. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| def | java.awt.geom.AffineTransform | Valor predeterminado de la propiedad. |

**Returns:**
java.awt.geom.AffineTransform - Valor de la propiedad.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Obtiene el valor de la propiedad rectángulo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
java.awt.Rectangle - Valor de la propiedad.
### getPropertyRectangle(String key, Rectangle def) {#getPropertyRectangle-java.lang.String-java.awt.Rectangle-}
```
public Rectangle getPropertyRectangle(String key, Rectangle def)
```


Obtiene el valor de la propiedad rectángulo. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| def | java.awt.Rectangle | Valor predeterminado de la propiedad. |

**Returns:**
java.awt.Rectangle - Valor de la propiedad.
### getPropertyStringArray(String key) {#getPropertyStringArray-java.lang.String-}
```
public String[] getPropertyStringArray(String key)
```


Obtiene el valor de la propiedad de matriz de cadenas.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
java.lang.String[] - Valor de la propiedad.
### getPropertyStringArray(String key, String[] def) {#getPropertyStringArray-java.lang.String-java.lang.String---}
```
public String[] getPropertyStringArray(String key, String[] def)
```


Obtiene el valor de la propiedad matriz de cadenas. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| def | java.lang.String[] | Valor predeterminado de la propiedad. |

**Returns:**
java.lang.String[] - Valor de la propiedad.
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


Obtiene el valor de la propiedad booleana.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
boolean - Valor de la propiedad.
### isProperty(String key, boolean def) {#isProperty-java.lang.String-boolean-}
```
public boolean isProperty(String key, boolean def)
```


Obtiene el valor de la propiedad boolean. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| def | boolean | Valor predeterminado de la propiedad. |

**Returns:**
boolean - Valor de la propiedad.
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.io.PrintStream |  |

### list(PrintWriter arg0) {#list-java.io.PrintWriter-}
```
public void list(PrintWriter arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.io.PrintWriter |  |

### load(InputStream arg0) {#load-java.io.InputStream-}
```
public synchronized void load(InputStream arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### load(Reader arg0) {#load-java.io.Reader-}
```
public synchronized void load(Reader arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.io.Reader |  |

### loadFromXML(InputStream arg0) {#loadFromXML-java.io.InputStream-}
```
public synchronized void loadFromXML(InputStream arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2) {#merge-K-V-java.util.function.BiFunction---super-V---super-V---extends-V--}
```
public synchronized V merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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


Imprime todas las propiedades establecidas.

### propertyNames() {#propertyNames--}
```
public Enumeration propertyNames()
```


Devuelve los nombres de las propiedades.

**Returns:**
java.util.Enumeration - Enumeración de nombres de propiedades.
### put(K arg0, V arg1) {#put-K-V-}
```
public synchronized V put(K arg0, V arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.util.Map<? extends K,? extends V> |  |

### putAll(Map<?,?> arg0) {#putAll-java.util.Map------}
```
public synchronized void putAll(Map<?,?> arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.util.Map<?,?> |  |

### putIfAbsent(K arg0, V arg1) {#putIfAbsent-K-V-}
```
public synchronized V putIfAbsent(K arg0, V arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
java.lang.Object
### remove(Object arg0, Object arg1) {#remove-java.lang.Object-java.lang.Object-}
```
public synchronized boolean remove(Object arg0, Object arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super K,? super V,? extends V> |  |

### replaceAll(BiFunction<? super Object,? super Object,?> arg0) {#replaceAll-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----}
```
public synchronized void replaceAll(BiFunction<? super Object,? super Object,?> arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super java.lang.Object,? super java.lang.Object,?> |  |

### save(OutputStream arg0, String arg1) {#save-java.io.OutputStream-java.lang.String-}
```
public void save(OutputStream arg0, String arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### setProperties(Properties properties) {#setProperties-java.util.Properties-}
```
public void setProperties(Properties properties)
```


Copia las propiedades, incluidos sus valores predeterminados, en este UserProperties.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| propiedades | java.util.Properties | Propiedades. |

### setProperty(String key, boolean value) {#setProperty-java.lang.String-boolean-}
```
public Object setProperty(String key, boolean value)
```


Establece el valor de la propiedad booleana.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| value | boolean | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(String key, double value) {#setProperty-java.lang.String-double-}
```
public Object setProperty(String key, double value)
```


Establece el valor de la propiedad double.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| value | double | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(String key, float value) {#setProperty-java.lang.String-float-}
```
public Object setProperty(String key, float value)
```


Establece el valor de la propiedad float.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| value | float | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(String key, int value) {#setProperty-java.lang.String-int-}
```
public Object setProperty(String key, int value)
```


Establece el valor de la propiedad entera.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| value | int | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(String key, Color value) {#setProperty-java.lang.String-java.awt.Color-}
```
public Object setProperty(String key, Color value)
```


Establece el valor de la propiedad de color.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| value | java.awt.Color | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(String key, Dimension value) {#setProperty-java.lang.String-java.awt.Dimension-}
```
public Object setProperty(String key, Dimension value)
```


Establece el valor de la propiedad de dimensión.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| value | java.awt.Dimension | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(String key, Insets value) {#setProperty-java.lang.String-java.awt.Insets-}
```
public Object setProperty(String key, Insets value)
```


Establece el valor de la propiedad de inset.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| value | java.awt.Insets | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(String key, Rectangle value) {#setProperty-java.lang.String-java.awt.Rectangle-}
```
public Object setProperty(String key, Rectangle value)
```


Establece el valor de la propiedad de rectángulo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| value | java.awt.Rectangle | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(String key, AffineTransform value) {#setProperty-java.lang.String-java.awt.geom.AffineTransform-}
```
public Object setProperty(String key, AffineTransform value)
```


Establece el valor de la propiedad de matriz.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| value | java.awt.geom.AffineTransform | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(String key, String value) {#setProperty-java.lang.String-java.lang.String-}
```
public Object setProperty(String key, String value)
```


Establece el valor de la propiedad de cadena.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| value | java.lang.String | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(String key, String[] value) {#setProperty-java.lang.String-java.lang.String---}
```
public Object setProperty(String key, String[] value)
```


Establece el valor de la propiedad de matriz de cadenas.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |
| value | java.lang.String[] | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(Properties properties, String key, boolean value) {#setProperty-java.util.Properties-java.lang.String-boolean-}
```
public static Object setProperty(Properties properties, String key, boolean value)
```


Establece el valor de la propiedad booleana en la tabla de propiedades especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| propiedades | java.util.Properties | La tabla de propiedades. |
| clave | java.lang.String | El nombre de la propiedad. |
| value | boolean | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(Properties properties, String key, double value) {#setProperty-java.util.Properties-java.lang.String-double-}
```
public static Object setProperty(Properties properties, String key, double value)
```


Establece el valor de la propiedad double en la tabla de propiedades especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| propiedades | java.util.Properties | La tabla de propiedades. |
| clave | java.lang.String | El nombre de la propiedad. |
| value | double | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(Properties properties, String key, float value) {#setProperty-java.util.Properties-java.lang.String-float-}
```
public static Object setProperty(Properties properties, String key, float value)
```


Establece el valor de la propiedad float en la tabla de propiedades especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| propiedades | java.util.Properties | La tabla de propiedades. |
| clave | java.lang.String | El nombre de la propiedad. |
| value | float | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(Properties properties, String key, int value) {#setProperty-java.util.Properties-java.lang.String-int-}
```
public static Object setProperty(Properties properties, String key, int value)
```


Establece el valor de la propiedad entera en la tabla de propiedades especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| propiedades | java.util.Properties | La tabla de propiedades. |
| clave | java.lang.String | El nombre de la propiedad. |
| value | int | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(Properties properties, String key, Color value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Color-}
```
public static Object setProperty(Properties properties, String key, Color value)
```


Establece el valor de la propiedad de color en la tabla de propiedades especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| propiedades | java.util.Properties | La tabla de propiedades. |
| clave | java.lang.String | El nombre de la propiedad. |
| value | java.awt.Color | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(Properties properties, String key, Dimension value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-}
```
public static Object setProperty(Properties properties, String key, Dimension value)
```


Establece el valor de la propiedad de dimensión en la tabla de propiedades especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| propiedades | java.util.Properties | La tabla de propiedades. |
| clave | java.lang.String | El nombre de la propiedad. |
| value | java.awt.Dimension | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(Properties properties, String key, Insets value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-}
```
public static Object setProperty(Properties properties, String key, Insets value)
```


Establece el valor de la propiedad de inset en la tabla de propiedades especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| propiedades | java.util.Properties | La tabla de propiedades. |
| clave | java.lang.String | El nombre de la propiedad. |
| value | java.awt.Insets | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(Properties properties, String key, Rectangle value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-}
```
public static Object setProperty(Properties properties, String key, Rectangle value)
```


Establece el valor de la propiedad de rectángulo en la tabla de propiedades especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| propiedades | java.util.Properties | La tabla de propiedades. |
| clave | java.lang.String | El nombre de la propiedad. |
| value | java.awt.Rectangle | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(Properties properties, String key, AffineTransform value) {#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-}
```
public static Object setProperty(Properties properties, String key, AffineTransform value)
```


Establece el valor de la propiedad de matriz en la tabla de propiedades especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| propiedades | java.util.Properties | La tabla de propiedades. |
| clave | java.lang.String | El nombre de la propiedad. |
| value | java.awt.geom.AffineTransform | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
### setProperty(Properties properties, String key, String[] value) {#setProperty-java.util.Properties-java.lang.String-java.lang.String---}
```
public static Object setProperty(Properties properties, String key, String[] value)
```


Establece el valor de la propiedad de matriz de cadenas en la tabla de propiedades especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| propiedades | java.util.Properties | La tabla de propiedades. |
| clave | java.lang.String | El nombre de la propiedad. |
| value | java.lang.String[] | El valor de la propiedad. |

**Returns:**
java.lang.Object - Una propiedad.
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### store(Writer arg0, String arg1) {#store-java.io.Writer-java.lang.String-}
```
public void store(Writer arg0, String arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.io.Writer |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1) {#storeToXML-java.io.OutputStream-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, String arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1, String arg2)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |
| arg2 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, Charset arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.nio.charset.Charset-}
```
public void storeToXML(OutputStream arg0, String arg1, Charset arg2)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

