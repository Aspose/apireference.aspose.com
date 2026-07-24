---
title: "UserProperties"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe de propriété spéciale qui permet de définir et de retourner des propriétés typées."
type: docs
weight: 18
url: /fr/java/com.aspose.page/userproperties/
---
**Inheritance:**
java.lang.Object, java.util.Dictionary, java.util.Hashtable, java.util.Properties
```
public class UserProperties extends Properties
```

Classe de propriété spéciale qui permet de définir et de récupérer des propriétés typées. Elle permet également de lier deux objets de propriétés par défaut à rechercher si cet objet de propriété ne contient pas la propriété.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [UserProperties()](#UserProperties--) | Initialise une instance vide de la classe UserProperties. |
| [UserProperties(Properties defaults)](#UserProperties-java.util.Properties-) | Initialise une instance de la classe UserProperties avec des valeurs par défaut. |
| [UserProperties(Properties defaults, Properties altDefaults)](#UserProperties-java.util.Properties-java.util.Properties-) | Construit UserProperties avec une table defaults et altDefaults, qui sont recherchées dans cet ordre. |
## Méthodes

| Méthode | Description |
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
| [getProperty(String key)](#getProperty-java.lang.String-) | Obtient la valeur de la propriété chaîne. |
| [getProperty(String key, String def)](#getProperty-java.lang.String-java.lang.String-) | Obtient la valeur de la propriété chaîne. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Obtient la valeur de la propriété couleur. |
| [getPropertyColor(String key, Color def)](#getPropertyColor-java.lang.String-java.awt.Color-) | Obtient la valeur de la propriété couleur. |
| [getPropertyDimension(String key)](#getPropertyDimension-java.lang.String-) | Obtient la valeur de la propriété dimension. |
| [getPropertyDimension(String key, Dimension def)](#getPropertyDimension-java.lang.String-java.awt.Dimension-) | Obtient la valeur de la propriété dimension. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Obtient la valeur de la propriété double. |
| [getPropertyDouble(String key, double def)](#getPropertyDouble-java.lang.String-double-) | Obtient la valeur de la propriété double. |
| [getPropertyFloat(String key)](#getPropertyFloat-java.lang.String-) | Obtient la valeur de la propriété flottante. |
| [getPropertyFloat(String key, float def)](#getPropertyFloat-java.lang.String-float-) | Obtient la valeur de la propriété flottante. |
| [getPropertyInsets(String key)](#getPropertyInsets-java.lang.String-) | Obtient la valeur de la propriété retraits. |
| [getPropertyInsets(String key, Insets def)](#getPropertyInsets-java.lang.String-java.awt.Insets-) | Obtient la valeur de la propriété retraits. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Obtient la valeur de la propriété entier. |
| [getPropertyInt(String key, int def)](#getPropertyInt-java.lang.String-int-) | Obtient la valeur de la propriété entier. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Obtient la valeur de la propriété flottante. |
| [getPropertyMatrix(String key, AffineTransform def)](#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-) | Obtient la valeur de la propriété flottante. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Obtient la valeur de la propriété rectangle. |
| [getPropertyRectangle(String key, Rectangle def)](#getPropertyRectangle-java.lang.String-java.awt.Rectangle-) | Obtient la valeur de la propriété rectangle. |
| [getPropertyStringArray(String key)](#getPropertyStringArray-java.lang.String-) | Obtient la valeur de la propriété tableau de chaînes. |
| [getPropertyStringArray(String key, String[] def)](#getPropertyStringArray-java.lang.String-java.lang.String---) | Obtient la valeur de la propriété tableau de chaînes. |
| [hashCode()](#hashCode--) |  |
| [isEmpty()](#isEmpty--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Obtient la valeur de la propriété booléenne. |
| [isProperty(String key, boolean def)](#isProperty-java.lang.String-boolean-) | Obtient la valeur de la propriété booléenne. |
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
| [printProperties()](#printProperties--) | Affiche toutes les propriétés définies. |
| [propertyNames()](#propertyNames--) | Renvoie les noms des propriétés. |
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
| [setProperties(Properties properties)](#setProperties-java.util.Properties-) | Copie les propriétés, y compris leurs valeurs par défaut, dans cet UserProperties |
| [setProperty(String key, boolean value)](#setProperty-java.lang.String-boolean-) | Définit la valeur de la propriété booléenne. |
| [setProperty(String key, double value)](#setProperty-java.lang.String-double-) | Définit la valeur de la propriété double. |
| [setProperty(String key, float value)](#setProperty-java.lang.String-float-) | Définit la valeur de la propriété flottante. |
| [setProperty(String key, int value)](#setProperty-java.lang.String-int-) | Définit la valeur de la propriété entier. |
| [setProperty(String key, Color value)](#setProperty-java.lang.String-java.awt.Color-) | Définit la valeur de la propriété couleur. |
| [setProperty(String key, Dimension value)](#setProperty-java.lang.String-java.awt.Dimension-) | Définit la valeur de la propriété dimension. |
| [setProperty(String key, Insets value)](#setProperty-java.lang.String-java.awt.Insets-) | Définit la valeur de la propriété retraits. |
| [setProperty(String key, Rectangle value)](#setProperty-java.lang.String-java.awt.Rectangle-) | Définit la valeur de la propriété rectangle. |
| [setProperty(String key, AffineTransform value)](#setProperty-java.lang.String-java.awt.geom.AffineTransform-) | Définit la valeur de la propriété matrice. |
| [setProperty(String key, String value)](#setProperty-java.lang.String-java.lang.String-) | Définit la valeur de la propriété chaîne. |
| [setProperty(String key, String[] value)](#setProperty-java.lang.String-java.lang.String---) | Définit la valeur de la propriété tableau de chaînes. |
| [setProperty(Properties properties, String key, boolean value)](#setProperty-java.util.Properties-java.lang.String-boolean-) | Définit la valeur de la propriété booléenne dans la table des propriétés spécifiée. |
| [setProperty(Properties properties, String key, double value)](#setProperty-java.util.Properties-java.lang.String-double-) | Définit la valeur de la propriété double dans la table des propriétés spécifiée. |
| [setProperty(Properties properties, String key, float value)](#setProperty-java.util.Properties-java.lang.String-float-) | Définit la valeur de la propriété float dans la table de propriétés spécifiée. |
| [setProperty(Properties properties, String key, int value)](#setProperty-java.util.Properties-java.lang.String-int-) | Définit la valeur de la propriété integer dans la table de propriétés spécifiée. |
| [setProperty(Properties properties, String key, Color value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Color-) | Définit la valeur de la propriété color dans la table de propriétés spécifiée. |
| [setProperty(Properties properties, String key, Dimension value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-) | Définit la valeur de la propriété dimension dans la table de propriétés spécifiée. |
| [setProperty(Properties properties, String key, Insets value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-) | Définit la valeur de la propriété insets dans la table de propriétés spécifiée. |
| [setProperty(Properties properties, String key, Rectangle value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-) | Définit la valeur de la propriété rectangle dans la table de propriétés spécifiée. |
| [setProperty(Properties properties, String key, AffineTransform value)](#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-) | Définit la valeur de la propriété matrix dans la table de propriétés spécifiée. |
| [setProperty(Properties properties, String key, String[] value)](#setProperty-java.util.Properties-java.lang.String-java.lang.String---) | Définit la valeur de la propriété string array dans la table de propriétés spécifiée. |
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


Initialise une instance vide de la classe UserProperties.

### UserProperties(Properties defaults) {#UserProperties-java.util.Properties-}
```
public UserProperties(Properties defaults)
```


Initialise une instance de la classe UserProperties avec des valeurs par défaut.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| défauts | java.util.Properties | Valeurs par défaut des propriétés. |

### UserProperties(Properties defaults, Properties altDefaults) {#UserProperties-java.util.Properties-java.util.Properties-}
```
public UserProperties(Properties defaults, Properties altDefaults)
```


Construit UserProperties avec une table defaults et altDefaults, qui sont recherchées dans cet ordre.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| défauts | java.util.Properties | Propriétés par défaut. |
| altDefaults | java.util.Properties | Propriétés par défaut alternatives. |

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
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsKey(Object arg0) {#containsKey-java.lang.Object-}
```
public boolean containsKey(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsValue(Object arg0) {#containsValue-java.lang.Object-}
```
public boolean containsValue(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### forEach(BiConsumer<? super K,? super V> arg0) {#forEach-java.util.function.BiConsumer---super-K---super-V--}
```
public synchronized void forEach(BiConsumer<? super K,? super V> arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super K,? super V> |  |

### forEach(BiConsumer<? super Object,? super Object> arg0) {#forEach-java.util.function.BiConsumer---super-java.lang.Object---super-java.lang.Object--}
```
public synchronized void forEach(BiConsumer<? super Object,? super Object> arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super java.lang.Object,? super java.lang.Object> |  |

### get(Object arg0) {#get-java.lang.Object-}
```
public Object get(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
java.lang.Object
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Obtient la valeur de la propriété chaîne.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
java.lang.String - Valeur de la propriété.
### getProperty(String key, String def) {#getProperty-java.lang.String-java.lang.String-}
```
public String getProperty(String key, String def)
```


Obtient la valeur de la propriété de chaîne. Si la propriété demandée est absente, renvoie la valeur par défaut fournie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| def | java.lang.String | Valeur par défaut de la propriété. |

**Returns:**
java.lang.String - Valeur de la propriété.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Obtient la valeur de la propriété couleur.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
java.awt.Color - Valeur de la propriété.
### getPropertyColor(String key, Color def) {#getPropertyColor-java.lang.String-java.awt.Color-}
```
public Color getPropertyColor(String key, Color def)
```


Obtient la valeur de la propriété de couleur. Si la propriété demandée est absente, renvoie la valeur par défaut fournie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| def | java.awt.Color | Valeur par défaut de la propriété. |

**Returns:**
java.awt.Color - Valeur de la propriété.
### getPropertyDimension(String key) {#getPropertyDimension-java.lang.String-}
```
public Dimension getPropertyDimension(String key)
```


Obtient la valeur de la propriété dimension.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
java.awt.Dimension - Valeur de la propriété.
### getPropertyDimension(String key, Dimension def) {#getPropertyDimension-java.lang.String-java.awt.Dimension-}
```
public Dimension getPropertyDimension(String key, Dimension def)
```


Obtient la valeur de la propriété de dimension. Si la propriété demandée est absente, renvoie la valeur par défaut fournie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| def | java.awt.Dimension | Valeur par défaut de la propriété. |

**Returns:**
java.awt.Dimension - Valeur de la propriété.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Obtient la valeur de la propriété double.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
double - Valeur de la propriété.
### getPropertyDouble(String key, double def) {#getPropertyDouble-java.lang.String-double-}
```
public double getPropertyDouble(String key, double def)
```


Obtient la valeur de la propriété double. Si la propriété demandée est absente, renvoie la valeur par défaut fournie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| def | double | Valeur par défaut de la propriété. |

**Returns:**
double - Valeur de la propriété.
### getPropertyFloat(String key) {#getPropertyFloat-java.lang.String-}
```
public float getPropertyFloat(String key)
```


Obtient la valeur de la propriété flottante.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
float - Valeur de la propriété.
### getPropertyFloat(String key, float def) {#getPropertyFloat-java.lang.String-float-}
```
public float getPropertyFloat(String key, float def)
```


Obtient la valeur de la propriété float. Si la propriété demandée est absente, renvoie la valeur par défaut fournie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| def | float | Valeur par défaut de la propriété. |

**Returns:**
float - Valeur de la propriété.
### getPropertyInsets(String key) {#getPropertyInsets-java.lang.String-}
```
public Insets getPropertyInsets(String key)
```


Obtient la valeur de la propriété retraits.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
java.awt.Insets - Valeur de la propriété.
### getPropertyInsets(String key, Insets def) {#getPropertyInsets-java.lang.String-java.awt.Insets-}
```
public Insets getPropertyInsets(String key, Insets def)
```


Obtient la valeur de la propriété d'insets. Si la propriété demandée est absente, renvoie la valeur par défaut fournie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| def | java.awt.Insets | Valeur par défaut de la propriété. |

**Returns:**
java.awt.Insets - Valeur de la propriété.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Obtient la valeur de la propriété entier.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
int - Valeur de la propriété.
### getPropertyInt(String key, int def) {#getPropertyInt-java.lang.String-int-}
```
public int getPropertyInt(String key, int def)
```


Obtient la valeur de la propriété entière. Si la propriété demandée est absente, renvoie la valeur par défaut fournie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| def | int | Valeur par défaut de la propriété. |

**Returns:**
int - Valeur de la propriété.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Obtient la valeur de la propriété flottante.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
java.awt.geom.AffineTransform - Valeur de la propriété.
### getPropertyMatrix(String key, AffineTransform def) {#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-}
```
public AffineTransform getPropertyMatrix(String key, AffineTransform def)
```


Obtient la valeur de la propriété float. Si la propriété demandée est absente, renvoie la valeur par défaut fournie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| def | java.awt.geom.AffineTransform | Valeur par défaut de la propriété. |

**Returns:**
java.awt.geom.AffineTransform - Valeur de la propriété.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Obtient la valeur de la propriété rectangle.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
java.awt.Rectangle - Valeur de la propriété.
### getPropertyRectangle(String key, Rectangle def) {#getPropertyRectangle-java.lang.String-java.awt.Rectangle-}
```
public Rectangle getPropertyRectangle(String key, Rectangle def)
```


Obtient la valeur de la propriété rectangle. Si la propriété demandée est absente, renvoie la valeur par défaut fournie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| def | java.awt.Rectangle | Valeur par défaut de la propriété. |

**Returns:**
java.awt.Rectangle - Valeur de la propriété.
### getPropertyStringArray(String key) {#getPropertyStringArray-java.lang.String-}
```
public String[] getPropertyStringArray(String key)
```


Obtient la valeur de la propriété tableau de chaînes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
java.lang.String[] - Valeur de la propriété.
### getPropertyStringArray(String key, String[] def) {#getPropertyStringArray-java.lang.String-java.lang.String---}
```
public String[] getPropertyStringArray(String key, String[] def)
```


Obtient la valeur de la propriété tableau de chaînes. Si la propriété demandée est absente, renvoie la valeur par défaut fournie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| def | java.lang.String[] | Valeur par défaut de la propriété. |

**Returns:**
java.lang.String[] - Valeur de la propriété.
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


Obtient la valeur de la propriété booléenne.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
boolean - Valeur de la propriété.
### isProperty(String key, boolean def) {#isProperty-java.lang.String-boolean-}
```
public boolean isProperty(String key, boolean def)
```


Obtient la valeur de la propriété booléenne. Si la propriété demandée est absente, renvoie la valeur par défaut fournie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| def | boolean | Valeur par défaut de la propriété. |

**Returns:**
boolean - Valeur de la propriété.
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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.io.PrintStream |  |

### list(PrintWriter arg0) {#list-java.io.PrintWriter-}
```
public void list(PrintWriter arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.io.PrintWriter |  |

### load(InputStream arg0) {#load-java.io.InputStream-}
```
public synchronized void load(InputStream arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### load(Reader arg0) {#load-java.io.Reader-}
```
public synchronized void load(Reader arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.io.Reader |  |

### loadFromXML(InputStream arg0) {#loadFromXML-java.io.InputStream-}
```
public synchronized void loadFromXML(InputStream arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2) {#merge-K-V-java.util.function.BiFunction---super-V---super-V---extends-V--}
```
public synchronized V merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2)
```




**Parameters:**
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
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


Affiche toutes les propriétés définies.

### propertyNames() {#propertyNames--}
```
public Enumeration propertyNames()
```


Renvoie les noms des propriétés.

**Returns:**
java.util.Enumeration - Énumération des noms de propriétés.
### put(K arg0, V arg1) {#put-K-V-}
```
public synchronized V put(K arg0, V arg1)
```




**Parameters:**
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.util.Map<? extends K,? extends V> |  |

### putAll(Map<?,?> arg0) {#putAll-java.util.Map------}
```
public synchronized void putAll(Map<?,?> arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.util.Map<?,?> |  |

### putIfAbsent(K arg0, V arg1) {#putIfAbsent-K-V-}
```
public synchronized V putIfAbsent(K arg0, V arg1)
```




**Parameters:**
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
java.lang.Object
### remove(Object arg0, Object arg1) {#remove-java.lang.Object-java.lang.Object-}
```
public synchronized boolean remove(Object arg0, Object arg1)
```




**Parameters:**
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super K,? super V,? extends V> |  |

### replaceAll(BiFunction<? super Object,? super Object,?> arg0) {#replaceAll-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----}
```
public synchronized void replaceAll(BiFunction<? super Object,? super Object,?> arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super java.lang.Object,? super java.lang.Object,?> |  |

### save(OutputStream arg0, String arg1) {#save-java.io.OutputStream-java.lang.String-}
```
public void save(OutputStream arg0, String arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### setProperties(Properties properties) {#setProperties-java.util.Properties-}
```
public void setProperties(Properties properties)
```


Copie les propriétés, y compris leurs valeurs par défaut, dans cet UserProperties

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| propriétés | java.util.Properties | Propriétés. |

### setProperty(String key, boolean value) {#setProperty-java.lang.String-boolean-}
```
public Object setProperty(String key, boolean value)
```


Définit la valeur de la propriété booléenne.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | boolean | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(String key, double value) {#setProperty-java.lang.String-double-}
```
public Object setProperty(String key, double value)
```


Définit la valeur de la propriété double.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | double | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(String key, float value) {#setProperty-java.lang.String-float-}
```
public Object setProperty(String key, float value)
```


Définit la valeur de la propriété flottante.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | float | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(String key, int value) {#setProperty-java.lang.String-int-}
```
public Object setProperty(String key, int value)
```


Définit la valeur de la propriété entier.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | int | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(String key, Color value) {#setProperty-java.lang.String-java.awt.Color-}
```
public Object setProperty(String key, Color value)
```


Définit la valeur de la propriété couleur.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | java.awt.Color | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(String key, Dimension value) {#setProperty-java.lang.String-java.awt.Dimension-}
```
public Object setProperty(String key, Dimension value)
```


Définit la valeur de la propriété dimension.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | java.awt.Dimension | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(String key, Insets value) {#setProperty-java.lang.String-java.awt.Insets-}
```
public Object setProperty(String key, Insets value)
```


Définit la valeur de la propriété retraits.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | java.awt.Insets | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(String key, Rectangle value) {#setProperty-java.lang.String-java.awt.Rectangle-}
```
public Object setProperty(String key, Rectangle value)
```


Définit la valeur de la propriété rectangle.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | java.awt.Rectangle | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(String key, AffineTransform value) {#setProperty-java.lang.String-java.awt.geom.AffineTransform-}
```
public Object setProperty(String key, AffineTransform value)
```


Définit la valeur de la propriété matrice.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | java.awt.geom.AffineTransform | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(String key, String value) {#setProperty-java.lang.String-java.lang.String-}
```
public Object setProperty(String key, String value)
```


Définit la valeur de la propriété chaîne.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | java.lang.String | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(String key, String[] value) {#setProperty-java.lang.String-java.lang.String---}
```
public Object setProperty(String key, String[] value)
```


Définit la valeur de la propriété tableau de chaînes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | java.lang.String[] | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(Properties properties, String key, boolean value) {#setProperty-java.util.Properties-java.lang.String-boolean-}
```
public static Object setProperty(Properties properties, String key, boolean value)
```


Définit la valeur de la propriété booléenne dans la table des propriétés spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| propriétés | java.util.Properties | Le tableau des propriétés. |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | boolean | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(Properties properties, String key, double value) {#setProperty-java.util.Properties-java.lang.String-double-}
```
public static Object setProperty(Properties properties, String key, double value)
```


Définit la valeur de la propriété double dans la table des propriétés spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| propriétés | java.util.Properties | Le tableau des propriétés. |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | double | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(Properties properties, String key, float value) {#setProperty-java.util.Properties-java.lang.String-float-}
```
public static Object setProperty(Properties properties, String key, float value)
```


Définit la valeur de la propriété float dans la table de propriétés spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| propriétés | java.util.Properties | Le tableau des propriétés. |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | float | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(Properties properties, String key, int value) {#setProperty-java.util.Properties-java.lang.String-int-}
```
public static Object setProperty(Properties properties, String key, int value)
```


Définit la valeur de la propriété integer dans la table de propriétés spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| propriétés | java.util.Properties | Le tableau des propriétés. |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | int | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(Properties properties, String key, Color value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Color-}
```
public static Object setProperty(Properties properties, String key, Color value)
```


Définit la valeur de la propriété color dans la table de propriétés spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| propriétés | java.util.Properties | Le tableau des propriétés. |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | java.awt.Color | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(Properties properties, String key, Dimension value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-}
```
public static Object setProperty(Properties properties, String key, Dimension value)
```


Définit la valeur de la propriété dimension dans la table de propriétés spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| propriétés | java.util.Properties | Le tableau des propriétés. |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | java.awt.Dimension | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(Properties properties, String key, Insets value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-}
```
public static Object setProperty(Properties properties, String key, Insets value)
```


Définit la valeur de la propriété insets dans la table de propriétés spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| propriétés | java.util.Properties | Le tableau des propriétés. |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | java.awt.Insets | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(Properties properties, String key, Rectangle value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-}
```
public static Object setProperty(Properties properties, String key, Rectangle value)
```


Définit la valeur de la propriété rectangle dans la table de propriétés spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| propriétés | java.util.Properties | Le tableau des propriétés. |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | java.awt.Rectangle | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(Properties properties, String key, AffineTransform value) {#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-}
```
public static Object setProperty(Properties properties, String key, AffineTransform value)
```


Définit la valeur de la propriété matrix dans la table de propriétés spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| propriétés | java.util.Properties | Le tableau des propriétés. |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | java.awt.geom.AffineTransform | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
### setProperty(Properties properties, String key, String[] value) {#setProperty-java.util.Properties-java.lang.String-java.lang.String---}
```
public static Object setProperty(Properties properties, String key, String[] value)
```


Définit la valeur de la propriété string array dans la table de propriétés spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| propriétés | java.util.Properties | Le tableau des propriétés. |
| clé | java.lang.String | Le nom de la propriété. |
| valeur | java.lang.String[] | La valeur de la propriété. |

**Returns:**
java.lang.Object - Une propriété.
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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### store(Writer arg0, String arg1) {#store-java.io.Writer-java.lang.String-}
```
public void store(Writer arg0, String arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.io.Writer |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1) {#storeToXML-java.io.OutputStream-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, String arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1, String arg2)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |
| arg2 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, Charset arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.nio.charset.Charset-}
```
public void storeToXML(OutputStream arg0, String arg1, Charset arg2)
```




**Parameters:**
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

