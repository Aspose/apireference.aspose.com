---
title: "IntegerParameterInit"
second_title: "Aspose.Page for Java API 参考"
description: "所有整数参数初始化器的基类。"
type: docs
weight: 42
url: /zh/java/com.aspose.xps.metadata/integerparameterinit/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit)
```
public abstract class IntegerParameterInit extends ParameterInit
```

所有整数参数初始化器的基类。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [IntegerParameterInit(String name, int value)](#IntegerParameterInit-java.lang.String-int-) | 创建一个新实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxValue()](#getMaxValue--) | 对于整数或小数值参数，定义允许的最大值。 |
| [getMinValue()](#getMinValue--) | 对于整数或小数值参数，定义允许的最小值。 |
| [getMultiple()](#getMultiple--) | 对于整数或小数值参数，参数的值应是该数字的倍数。 |
| [getName()](#getName--) | 获取元素名称。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### IntegerParameterInit(String name, int value) {#IntegerParameterInit-java.lang.String-int-}
```
public IntegerParameterInit(String name, int value)
```


创建一个新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | java.lang.String | 参数名称。 |
| 值 | int | 参数值。 |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMaxValue() {#getMaxValue--}
```
public int getMaxValue()
```


对于整数或小数值参数，定义允许的最大值。

**Returns:**
int - 最大允许值。
### getMinValue() {#getMinValue--}
```
public int getMinValue()
```


对于整数或小数值参数，定义允许的最小值。

**Returns:**
int - 最小允许值。
### getMultiple() {#getMultiple--}
```
public int getMultiple()
```


对于整数或小数值参数，参数的值应是该数字的倍数。

**Returns:**
int - 参数应为其倍数的数字。
### getName() {#getName--}
```
public String getName()
```


获取元素名称。

**Returns:**
java.lang.String
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
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

