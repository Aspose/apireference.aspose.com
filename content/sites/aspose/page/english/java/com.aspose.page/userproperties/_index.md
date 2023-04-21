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
| [propertyNames()](#propertyNames--) | Returns properties names. |
| [printProperties()](#printProperties--) | Prints all set properties. |
| [setProperties(Properties properties)](#setProperties-java.util.Properties-) | Copies properties, including its defaults into this UserProperties |
| [setProperty(String key, String value)](#setProperty-java.lang.String-java.lang.String-) | Sets string property value. |
| [setProperty(String key, String[] value)](#setProperty-java.lang.String-java.lang.String---) | Sets string array property value. |
| [setProperty(Properties properties, String key, String[] value)](#setProperty-java.util.Properties-java.lang.String-java.lang.String---) | Sets string array property value in specified properties table. |
| [setProperty(String key, Color value)](#setProperty-java.lang.String-java.awt.Color-) | Sets color property value. |
| [setProperty(Properties properties, String key, Color value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Color-) | Sets color property value in specified properties table. |
| [setProperty(String key, Rectangle value)](#setProperty-java.lang.String-java.awt.Rectangle-) | Sets rectangle property value. |
| [setProperty(Properties properties, String key, Rectangle value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Rectangle-) | Sets rectangle property value in specified properties table. |
| [setProperty(String key, Insets value)](#setProperty-java.lang.String-java.awt.Insets-) | Sets insets property value. |
| [setProperty(Properties properties, String key, Insets value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Insets-) | Sets insets property value in specified properties table. |
| [setProperty(String key, Dimension value)](#setProperty-java.lang.String-java.awt.Dimension-) | Sets dimension property value. |
| [setProperty(Properties properties, String key, Dimension value)](#setProperty-java.util.Properties-java.lang.String-java.awt.Dimension-) | Sets dimension property value in specified properties table. |
| [setProperty(String key, int value)](#setProperty-java.lang.String-int-) | Sets integer property value. |
| [setProperty(Properties properties, String key, int value)](#setProperty-java.util.Properties-java.lang.String-int-) | Sets integer property value in specified properties table. |
| [setProperty(String key, double value)](#setProperty-java.lang.String-double-) | Sets double property value. |
| [setProperty(Properties properties, String key, double value)](#setProperty-java.util.Properties-java.lang.String-double-) | Sets double property value in specified properties table. |
| [setProperty(String key, float value)](#setProperty-java.lang.String-float-) | Sets float property value. |
| [setProperty(Properties properties, String key, float value)](#setProperty-java.util.Properties-java.lang.String-float-) | Sets float property value in specified properties table. |
| [setProperty(String key, boolean value)](#setProperty-java.lang.String-boolean-) | Sets boolean property value. |
| [setProperty(Properties properties, String key, boolean value)](#setProperty-java.util.Properties-java.lang.String-boolean-) | Sets boolean property value in specified properties table. |
| [getProperty(String key)](#getProperty-java.lang.String-) | Gets string property value. |
| [getProperty(String key, String def)](#getProperty-java.lang.String-java.lang.String-) | Gets string property value. |
| [getPropertyStringArray(String key)](#getPropertyStringArray-java.lang.String-) | Gets string array property value. |
| [getPropertyStringArray(String key, String[] def)](#getPropertyStringArray-java.lang.String-java.lang.String---) | Gets string array property value. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Gets color property value. |
| [getPropertyColor(String key, Color def)](#getPropertyColor-java.lang.String-java.awt.Color-) | Gets color property value. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Gets rectangle property value. |
| [getPropertyRectangle(String key, Rectangle def)](#getPropertyRectangle-java.lang.String-java.awt.Rectangle-) | Gets rectangle property value. |
| [getPropertyInsets(String key)](#getPropertyInsets-java.lang.String-) | Gets insets property value. |
| [getPropertyInsets(String key, Insets def)](#getPropertyInsets-java.lang.String-java.awt.Insets-) | Gets insets property value. |
| [getPropertyDimension(String key)](#getPropertyDimension-java.lang.String-) | Gets dimension property value. |
| [getPropertyDimension(String key, Dimension def)](#getPropertyDimension-java.lang.String-java.awt.Dimension-) | Gets dimension property value. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Gets integer property value. |
| [getPropertyInt(String key, int def)](#getPropertyInt-java.lang.String-int-) | Gets integer property value. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Gets double property value. |
| [getPropertyDouble(String key, double def)](#getPropertyDouble-java.lang.String-double-) | Gets double property value. |
| [getPropertyFloat(String key)](#getPropertyFloat-java.lang.String-) | Gets float property value. |
| [getPropertyFloat(String key, float def)](#getPropertyFloat-java.lang.String-float-) | Gets float property value. |
| [isProperty(String key)](#isProperty-java.lang.String-) | Gets boolean property value. |
| [isProperty(String key, boolean def)](#isProperty-java.lang.String-boolean-) | Gets boolean property value. |
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

### propertyNames() {#propertyNames--}
```
public Enumeration propertyNames()
```


Returns properties names.

**Returns:**
java.util.Enumeration - Enumeration of properties names.
### printProperties() {#printProperties--}
```
public void printProperties()
```


Prints all set properties.

### setProperties(Properties properties) {#setProperties-java.util.Properties-}
```
public void setProperties(Properties properties)
```


Copies properties, including its defaults into this UserProperties

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| properties | java.util.Properties | Properties. |

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
