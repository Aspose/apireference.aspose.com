---
title: "UserProperties"
second_title: "Aspose.Page for Java API リファレンス"
description: "型付きプロパティの設定と取得を可能にする特別なプロパティクラスです。"
type: docs
weight: 18
url: /ja/java/com.aspose.page/userproperties/
---
**Inheritance:**
java.lang.Object, java.util.Dictionary, java.util.Hashtable, java.util.Properties
```
public class UserProperties extends Properties
```

型付きプロパティの設定と取得を可能にする特別なプロパティクラスです。また、このプロパティオブジェクトにプロパティが存在しない場合に検索される2つのデフォルトプロパティオブジェクトをフックアップすることもできます。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [UserProperties()](#UserProperties--) | UserProperties クラスの空のインスタンスを初期化します。 |
| [UserProperties(Properties defaults)](#UserProperties-java.util.Properties-) | UserProperties クラスをデフォルト値で初期化します。 |
| [UserProperties(Properties defaults, Properties altDefaults)](#UserProperties-java.util.Properties-java.util.Properties-) | UserProperties を、デフォルトテーブルと代替デフォルトテーブル（この順序で検索されます）で構築します。 |
## メソッド

| メソッド | 説明 |
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
| [getProperty(String key)](#getProperty-java.lang.String-) | 文字列プロパティの値を取得します。 |
| [getProperty(String key, String def)](#getProperty-java.lang.String-java.lang.String-) | 文字列プロパティの値を取得します。 |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | 色プロパティの値を取得します。 |
| [getPropertyColor(String key, Color def)](#getPropertyColor-java.lang.String-java.awt.Color-) | 色プロパティの値を取得します。 |
| [getPropertyDimension(String key)](#getPropertyDimension-java.lang.String-) | 寸法プロパティの値を取得します。 |
| [getPropertyDimension(String key, Dimension def)](#getPropertyDimension-java.lang.String-java.awt.Dimension-) | 寸法プロパティの値を取得します。 |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | double プロパティの値を取得します。 |
| [getPropertyDouble(String key, double def)](#getPropertyDouble-java.lang.String-double-) | double プロパティの値を取得します。 |
| [getPropertyFloat(String key)](#getPropertyFloat-java.lang.String-) | float プロパティの値を取得します。 |
| [getPropertyFloat(String key, float def)](#getPropertyFloat-java.lang.String-float-) | float プロパティの値を取得します。 |
| [getPropertyInsets(String key)](#getPropertyInsets-java.lang.String-) | インセットプロパティの値を取得します。 |
| [getPropertyInsets(String key, Insets def)](#getPropertyInsets-java.lang.String-java.awt.Insets-) | インセットプロパティの値を取得します。 |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | integer プロパティの値を取得します。 |
| [getPropertyInt(String key, int def)](#getPropertyInt-java.lang.String-int-) | integer プロパティの値を取得します。 |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | float プロパティの値を取得します。 |
| [getPropertyMatrix(String key, AffineTransform def)](#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-) | float プロパティの値を取得します。 |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | rectangle プロパティの値を取得します。 |
| [getPropertyRectangle(String key, Rectangle def)](#getPropertyRectangle-java.lang.String-java.awt.Rectangle-) | rectangle プロパティの値を取得します。 |
| [getPropertyStringArray(String key)](#getPropertyStringArray-java.lang.String-) | string 配列プロパティの値を取得します。 |
| [getPropertyStringArray(String key, String[] def)](#getPropertyStringArray-java.lang.String-java.lang.String---) | string 配列プロパティの値を取得します。 |
| [hashCode()](#hashCode--) |  |
| [isEmpty()](#isEmpty--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | boolean プロパティの値を取得します。 |
| [isProperty(String key, boolean def)](#isProperty-java.lang.String-boolean-) | boolean プロパティの値を取得します。 |
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
| [printProperties()](#printProperties--) | 設定されたすべてのプロパティを出力します。 |
| [propertyNames()](#propertyNames--) | プロパティ名を返します。 |
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
| [setProperties(Properties properties)](#setProperties-java.util.Properties-) | プロパティをコピーし、デフォルトもこの UserProperties に含めます。 |
| [setProperty(String key, boolean value)](#setProperty-java.lang.String-boolean-) | boolean プロパティの値を設定します。 |
| [setProperty(String key, double value)](#setProperty-java.lang.String-double-) | double プロパティの値を設定します。 |
| [setProperty(String key, float value)](#setProperty-java.lang.String-float-) | float プロパティの値を設定します。 |
| [setProperty(String key, int value)](#setProperty-java.lang.String-int-) | integer プロパティの値を設定します。 |
| [setProperty(String key, Color value)](#setProperty-java.lang.String-java.awt.Color-) | 色プロパティの値を設定します。 |
| [setProperty(String key, Dimension value)](#setProperty-java.lang.String-java.awt.Dimension-) | 寸法プロパティの値を設定します。 |
| [setProperty(String key, Insets value)](#setProperty-java.lang.String-java.awt.Insets-) | インセットプロパティの値を設定します。 |
| [setProperty(String key, Rectangle value)](#setProperty-java.lang.String-java.awt.Rectangle-) | rectangle プロパティの値を設定します。 |
| [setProperty(String key, AffineTransform value)](#setProperty-java.lang.String-java.awt.geom.AffineTransform-) | matrix プロパティの値を設定します。 |
| [setProperty(String key, String value)](#setProperty-java.lang.String-java.lang.String-) | string プロパティの値を設定します。 |
| [setProperty(String key, String[] value)](#setProperty-java.lang.String-java.lang.String---) | string 配列プロパティの値を設定します。 |
| [setProperty(Properties properties, String key, boolean value)](#setProperty-java.util.Properties-java.lang.String-boolean-) | 指定されたプロパティテーブルで boolean プロパティの値を設定します。 |
| [setProperty(Properties properties, String key, double value)](#setProperty-java.util.Properties-java.lang.String-double-) | 指定されたプロパティテーブルで double プロパティの値を設定します。 |
| [setProperty(Properties properties, String key, float value)](#setProperty-java.util.Properties-java.lang.String-float-) | 指定されたプロパティテーブルの float プロパティ値を設定します。 |
| [setProperty(Properties properties, String key, int value)](#setProperty-java.util.Properties-java.lang.String-int-) | 指定されたプロパティテーブルの integer プロパティ値を設定します。 |
| [setProperty(Properties properties, String key, Color value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Color-) | 指定されたプロパティテーブルの color プロパティ値を設定します。 |
| [setProperty(Properties properties, String key, Dimension value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-) | 指定されたプロパティテーブルの dimension プロパティ値を設定します。 |
| [setProperty(Properties properties, String key, Insets value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-) | 指定されたプロパティテーブルの insets プロパティ値を設定します。 |
| [setProperty(Properties properties, String key, Rectangle value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-) | 指定されたプロパティテーブルの rectangle プロパティ値を設定します。 |
| [setProperty(Properties properties, String key, AffineTransform value)](#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-) | 指定されたプロパティテーブルの matrix プロパティ値を設定します。 |
| [setProperty(Properties properties, String key, String[] value)](#setProperty-java.util.Properties-java.lang.String-java.lang.String---) | 指定されたプロパティテーブルの string array プロパティ値を設定します。 |
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


UserProperties クラスの空のインスタンスを初期化します。

### UserProperties(Properties defaults) {#UserProperties-java.util.Properties-}
```
public UserProperties(Properties defaults)
```


UserProperties クラスをデフォルト値で初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| デフォルト | java.util.Properties | デフォルトのプロパティ値です。 |

### UserProperties(Properties defaults, Properties altDefaults) {#UserProperties-java.util.Properties-java.util.Properties-}
```
public UserProperties(Properties defaults, Properties altDefaults)
```


UserProperties を、デフォルトテーブルと代替デフォルトテーブル（この順序で検索されます）で構築します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| デフォルト | java.util.Properties | デフォルトのプロパティです。 |
| altDefaults | java.util.Properties | 代替のデフォルトプロパティです。 |

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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsKey(Object arg0) {#containsKey-java.lang.Object-}
```
public boolean containsKey(Object arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### containsValue(Object arg0) {#containsValue-java.lang.Object-}
```
public boolean containsValue(Object arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### forEach(BiConsumer<? super K,? super V> arg0) {#forEach-java.util.function.BiConsumer---super-K---super-V--}
```
public synchronized void forEach(BiConsumer<? super K,? super V> arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super K,? super V> |  |

### forEach(BiConsumer<? super Object,? super Object> arg0) {#forEach-java.util.function.BiConsumer---super-java.lang.Object---super-java.lang.Object--}
```
public synchronized void forEach(BiConsumer<? super Object,? super Object> arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.util.function.BiConsumer<? super java.lang.Object,? super java.lang.Object> |  |

### get(Object arg0) {#get-java.lang.Object-}
```
public Object get(Object arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |
| arg1 | java.lang.Object |  |

**Returns:**
java.lang.Object
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


文字列プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
java.lang.String - プロパティ値。
### getProperty(String key, String def) {#getProperty-java.lang.String-java.lang.String-}
```
public String getProperty(String key, String def)
```


文字列プロパティの値を取得します。要求されたプロパティが存在しない場合、提供されたデフォルト値を返します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| def | java.lang.String | プロパティのデフォルト値。 |

**Returns:**
java.lang.String - プロパティ値。
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


色プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
java.awt.Color - プロパティ値。
### getPropertyColor(String key, Color def) {#getPropertyColor-java.lang.String-java.awt.Color-}
```
public Color getPropertyColor(String key, Color def)
```


カラー プロパティの値を取得します。要求されたプロパティが存在しない場合、提供されたデフォルト値を返します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| def | java.awt.Color | プロパティのデフォルト値。 |

**Returns:**
java.awt.Color - プロパティ値。
### getPropertyDimension(String key) {#getPropertyDimension-java.lang.String-}
```
public Dimension getPropertyDimension(String key)
```


寸法プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
java.awt.Dimension - プロパティ値。
### getPropertyDimension(String key, Dimension def) {#getPropertyDimension-java.lang.String-java.awt.Dimension-}
```
public Dimension getPropertyDimension(String key, Dimension def)
```


次元プロパティの値を取得します。要求されたプロパティが存在しない場合、提供されたデフォルト値を返します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| def | java.awt.Dimension | プロパティのデフォルト値。 |

**Returns:**
java.awt.Dimension - プロパティ値。
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


double プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
double - プロパティ値。
### getPropertyDouble(String key, double def) {#getPropertyDouble-java.lang.String-double-}
```
public double getPropertyDouble(String key, double def)
```


double プロパティの値を取得します。要求されたプロパティが存在しない場合、提供されたデフォルト値を返します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| def | double | プロパティのデフォルト値。 |

**Returns:**
double - プロパティ値。
### getPropertyFloat(String key) {#getPropertyFloat-java.lang.String-}
```
public float getPropertyFloat(String key)
```


float プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
float - プロパティ値。
### getPropertyFloat(String key, float def) {#getPropertyFloat-java.lang.String-float-}
```
public float getPropertyFloat(String key, float def)
```


float プロパティの値を取得します。要求されたプロパティが存在しない場合、提供されたデフォルト値を返します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| def | float | プロパティのデフォルト値。 |

**Returns:**
float - プロパティ値。
### getPropertyInsets(String key) {#getPropertyInsets-java.lang.String-}
```
public Insets getPropertyInsets(String key)
```


インセットプロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
java.awt.Insets - プロパティ値。
### getPropertyInsets(String key, Insets def) {#getPropertyInsets-java.lang.String-java.awt.Insets-}
```
public Insets getPropertyInsets(String key, Insets def)
```


インセット プロパティの値を取得します。要求されたプロパティが存在しない場合、提供されたデフォルト値を返します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| def | java.awt.Insets | プロパティのデフォルト値。 |

**Returns:**
java.awt.Insets - プロパティ値。
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


integer プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
int - プロパティ値。
### getPropertyInt(String key, int def) {#getPropertyInt-java.lang.String-int-}
```
public int getPropertyInt(String key, int def)
```


整数プロパティの値を取得します。要求されたプロパティが存在しない場合、提供されたデフォルト値を返します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| def | int | プロパティのデフォルト値。 |

**Returns:**
int - プロパティ値。
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


float プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
java.awt.geom.AffineTransform - プロパティ値。
### getPropertyMatrix(String key, AffineTransform def) {#getPropertyMatrix-java.lang.String-java.awt.geom.AffineTransform-}
```
public AffineTransform getPropertyMatrix(String key, AffineTransform def)
```


float プロパティの値を取得します。要求されたプロパティが存在しない場合、提供されたデフォルト値を返します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| def | java.awt.geom.AffineTransform | プロパティのデフォルト値。 |

**Returns:**
java.awt.geom.AffineTransform - プロパティ値。
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


rectangle プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
java.awt.Rectangle - プロパティ値。
### getPropertyRectangle(String key, Rectangle def) {#getPropertyRectangle-java.lang.String-java.awt.Rectangle-}
```
public Rectangle getPropertyRectangle(String key, Rectangle def)
```


矩形プロパティの値を取得します。要求されたプロパティが存在しない場合、提供されたデフォルト値を返します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| def | java.awt.Rectangle | プロパティのデフォルト値。 |

**Returns:**
java.awt.Rectangle - プロパティ値。
### getPropertyStringArray(String key) {#getPropertyStringArray-java.lang.String-}
```
public String[] getPropertyStringArray(String key)
```


string 配列プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
java.lang.String[] - プロパティ値。
### getPropertyStringArray(String key, String[] def) {#getPropertyStringArray-java.lang.String-java.lang.String---}
```
public String[] getPropertyStringArray(String key, String[] def)
```


文字列配列プロパティの値を取得します。要求されたプロパティが存在しない場合、提供されたデフォルト値を返します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| def | java.lang.String[] | プロパティのデフォルト値。 |

**Returns:**
java.lang.String[] - プロパティ値。
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


boolean プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
boolean - プロパティ値。
### isProperty(String key, boolean def) {#isProperty-java.lang.String-boolean-}
```
public boolean isProperty(String key, boolean def)
```


ブール型プロパティの値を取得します。要求されたプロパティが存在しない場合、提供されたデフォルト値を返します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| def | boolean | プロパティのデフォルト値。 |

**Returns:**
boolean - プロパティ値。
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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.io.PrintStream |  |

### list(PrintWriter arg0) {#list-java.io.PrintWriter-}
```
public void list(PrintWriter arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.io.PrintWriter |  |

### load(InputStream arg0) {#load-java.io.InputStream-}
```
public synchronized void load(InputStream arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### load(Reader arg0) {#load-java.io.Reader-}
```
public synchronized void load(Reader arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.io.Reader |  |

### loadFromXML(InputStream arg0) {#loadFromXML-java.io.InputStream-}
```
public synchronized void loadFromXML(InputStream arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.io.InputStream |  |

### merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2) {#merge-K-V-java.util.function.BiFunction---super-V---super-V---extends-V--}
```
public synchronized V merge(K arg0, V arg1, BiFunction<? super V,? super V,? extends V> arg2)
```




**Parameters:**
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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


設定されたすべてのプロパティを出力します。

### propertyNames() {#propertyNames--}
```
public Enumeration propertyNames()
```


プロパティ名を返します。

**Returns:**
java.util.Enumeration - プロパティ名の列挙。
### put(K arg0, V arg1) {#put-K-V-}
```
public synchronized V put(K arg0, V arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.util.Map<? extends K,? extends V> |  |

### putAll(Map<?,?> arg0) {#putAll-java.util.Map------}
```
public synchronized void putAll(Map<?,?> arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.util.Map<?,?> |  |

### putIfAbsent(K arg0, V arg1) {#putIfAbsent-K-V-}
```
public synchronized V putIfAbsent(K arg0, V arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
java.lang.Object
### remove(Object arg0, Object arg1) {#remove-java.lang.Object-java.lang.Object-}
```
public synchronized boolean remove(Object arg0, Object arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super K,? super V,? extends V> |  |

### replaceAll(BiFunction<? super Object,? super Object,?> arg0) {#replaceAll-java.util.function.BiFunction---super-java.lang.Object---super-java.lang.Object----}
```
public synchronized void replaceAll(BiFunction<? super Object,? super Object,?> arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.util.function.BiFunction<? super java.lang.Object,? super java.lang.Object,?> |  |

### save(OutputStream arg0, String arg1) {#save-java.io.OutputStream-java.lang.String-}
```
public void save(OutputStream arg0, String arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### setProperties(Properties properties) {#setProperties-java.util.Properties-}
```
public void setProperties(Properties properties)
```


プロパティをコピーし、デフォルトもこの UserProperties に含めます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| プロパティ | java.util.Properties | プロパティ。 |

### setProperty(String key, boolean value) {#setProperty-java.lang.String-boolean-}
```
public Object setProperty(String key, boolean value)
```


boolean プロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| value | boolean | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(String key, double value) {#setProperty-java.lang.String-double-}
```
public Object setProperty(String key, double value)
```


double プロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| value | double | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(String key, float value) {#setProperty-java.lang.String-float-}
```
public Object setProperty(String key, float value)
```


float プロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| value | float | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(String key, int value) {#setProperty-java.lang.String-int-}
```
public Object setProperty(String key, int value)
```


integer プロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| value | int | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(String key, Color value) {#setProperty-java.lang.String-java.awt.Color-}
```
public Object setProperty(String key, Color value)
```


色プロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| value | java.awt.Color | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(String key, Dimension value) {#setProperty-java.lang.String-java.awt.Dimension-}
```
public Object setProperty(String key, Dimension value)
```


寸法プロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| value | java.awt.Dimension | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(String key, Insets value) {#setProperty-java.lang.String-java.awt.Insets-}
```
public Object setProperty(String key, Insets value)
```


インセットプロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| value | java.awt.Insets | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(String key, Rectangle value) {#setProperty-java.lang.String-java.awt.Rectangle-}
```
public Object setProperty(String key, Rectangle value)
```


rectangle プロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| value | java.awt.Rectangle | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(String key, AffineTransform value) {#setProperty-java.lang.String-java.awt.geom.AffineTransform-}
```
public Object setProperty(String key, AffineTransform value)
```


matrix プロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| value | java.awt.geom.AffineTransform | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(String key, String value) {#setProperty-java.lang.String-java.lang.String-}
```
public Object setProperty(String key, String value)
```


string プロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| value | java.lang.String | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(String key, String[] value) {#setProperty-java.lang.String-java.lang.String---}
```
public Object setProperty(String key, String[] value)
```


string 配列プロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |
| value | java.lang.String[] | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(Properties properties, String key, boolean value) {#setProperty-java.util.Properties-java.lang.String-boolean-}
```
public static Object setProperty(Properties properties, String key, boolean value)
```


指定されたプロパティテーブルで boolean プロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| プロパティ | java.util.Properties | プロパティテーブル。 |
| キー | java.lang.String | プロパティの名前です。 |
| value | boolean | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(Properties properties, String key, double value) {#setProperty-java.util.Properties-java.lang.String-double-}
```
public static Object setProperty(Properties properties, String key, double value)
```


指定されたプロパティテーブルで double プロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| プロパティ | java.util.Properties | プロパティテーブル。 |
| キー | java.lang.String | プロパティの名前です。 |
| value | double | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(Properties properties, String key, float value) {#setProperty-java.util.Properties-java.lang.String-float-}
```
public static Object setProperty(Properties properties, String key, float value)
```


指定されたプロパティテーブルの float プロパティ値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| プロパティ | java.util.Properties | プロパティテーブル。 |
| キー | java.lang.String | プロパティの名前です。 |
| value | float | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(Properties properties, String key, int value) {#setProperty-java.util.Properties-java.lang.String-int-}
```
public static Object setProperty(Properties properties, String key, int value)
```


指定されたプロパティテーブルの integer プロパティ値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| プロパティ | java.util.Properties | プロパティテーブル。 |
| キー | java.lang.String | プロパティの名前です。 |
| value | int | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(Properties properties, String key, Color value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Color-}
```
public static Object setProperty(Properties properties, String key, Color value)
```


指定されたプロパティテーブルの color プロパティ値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| プロパティ | java.util.Properties | プロパティテーブル。 |
| キー | java.lang.String | プロパティの名前です。 |
| value | java.awt.Color | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(Properties properties, String key, Dimension value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-}
```
public static Object setProperty(Properties properties, String key, Dimension value)
```


指定されたプロパティテーブルの dimension プロパティ値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| プロパティ | java.util.Properties | プロパティテーブル。 |
| キー | java.lang.String | プロパティの名前です。 |
| value | java.awt.Dimension | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(Properties properties, String key, Insets value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-}
```
public static Object setProperty(Properties properties, String key, Insets value)
```


指定されたプロパティテーブルの insets プロパティ値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| プロパティ | java.util.Properties | プロパティテーブル。 |
| キー | java.lang.String | プロパティの名前です。 |
| value | java.awt.Insets | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(Properties properties, String key, Rectangle value) {#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-}
```
public static Object setProperty(Properties properties, String key, Rectangle value)
```


指定されたプロパティテーブルの rectangle プロパティ値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| プロパティ | java.util.Properties | プロパティテーブル。 |
| キー | java.lang.String | プロパティの名前です。 |
| value | java.awt.Rectangle | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(Properties properties, String key, AffineTransform value) {#setProperty-java.util.Properties-java.lang.String-java.awt.geom.AffineTransform-}
```
public static Object setProperty(Properties properties, String key, AffineTransform value)
```


指定されたプロパティテーブルの matrix プロパティ値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| プロパティ | java.util.Properties | プロパティテーブル。 |
| キー | java.lang.String | プロパティの名前です。 |
| value | java.awt.geom.AffineTransform | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
### setProperty(Properties properties, String key, String[] value) {#setProperty-java.util.Properties-java.lang.String-java.lang.String---}
```
public static Object setProperty(Properties properties, String key, String[] value)
```


指定されたプロパティテーブルの string array プロパティ値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| プロパティ | java.util.Properties | プロパティテーブル。 |
| キー | java.lang.String | プロパティの名前です。 |
| value | java.lang.String[] | プロパティの値。 |

**Returns:**
java.lang.Object - プロパティ。
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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### store(Writer arg0, String arg1) {#store-java.io.Writer-java.lang.String-}
```
public void store(Writer arg0, String arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.io.Writer |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1) {#storeToXML-java.io.OutputStream-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, String arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.lang.String-}
```
public void storeToXML(OutputStream arg0, String arg1, String arg2)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.io.OutputStream |  |
| arg1 | java.lang.String |  |
| arg2 | java.lang.String |  |

### storeToXML(OutputStream arg0, String arg1, Charset arg2) {#storeToXML-java.io.OutputStream-java.lang.String-java.nio.charset.Charset-}
```
public void storeToXML(OutputStream arg0, String arg1, Charset arg2)
```




**Parameters:**
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

