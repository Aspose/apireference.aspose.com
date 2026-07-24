---
title: "Staple.StapleOption"
second_title: "Aspose.Page for Java API 参考"
description: "描述 JobStapleAllDocuments 和 DocumentStaple 功能选项。"
type: docs
weight: 10
url: /zh/java/com.aspose.xps.metadata/staple.stapleoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Staple.StapleOption extends Option
```

描述 JobStapleAllDocuments 和 DocumentStaple 功能选项。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [StapleOption(String optionName, Staple.IStapleOptionItem[] items)](#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | 创建一个新实例。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| [None](#None) | 指定无装订。 |
| [SaddleStitch](#SaddleStitch) | 指定骑马钉装订。 |
| [StapleBottomLeft](#StapleBottomLeft) | 指定在左下角的单个订书钉。 |
| [StapleBottomRight](#StapleBottomRight) | 指定在右下角的单个订书钉。 |
| [StapleDualBottom](#StapleDualBottom) | 指定沿底部边缘的两个订书钉。 |
| [StapleDualLeft](#StapleDualLeft) | 指定沿左侧边缘的两个订书钉。 |
| [StapleDualRight](#StapleDualRight) | 指定沿右侧边缘的两个订书钉。 |
| [StapleDualTop](#StapleDualTop) | 指定沿顶部边缘的两个订书钉 |
| [StapleTopLeft](#StapleTopLeft) | 指定在左上角的单个订书钉。 |
| [StapleTopRight](#StapleTopRight) | 指定在右上角的单个订书钉。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | 将一系列项目添加到此选项的项目列表末尾。 |
| [add(Staple.IStapleOptionItem[] items)](#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | 向功能添加一个 IStapleOptionItem 实例数组。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 获取元素名称。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAngle(int angle)](#setAngle-int-) | 设置 Angle 计分属性值。 |
| [setSheetCapacity(int sheetCapacity)](#setSheetCapacity-int-) | 设置 SheetCapacity 计分属性值。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StapleOption(String optionName, Staple.IStapleOptionItem[] items) {#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public StapleOption(String optionName, Staple.IStapleOptionItem[] items)
```


创建一个新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| optionName | java.lang.String | 一个选项名称。 |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | 任意的 IStapleOptionItem 实例数组。 |

### None {#None}
```
public static final Staple.StapleOption None
```


指定无装订。

### SaddleStitch {#SaddleStitch}
```
public static final Staple.StapleOption SaddleStitch
```


指定骑马钉装订。

### StapleBottomLeft {#StapleBottomLeft}
```
public static final Staple.StapleOption StapleBottomLeft
```


指定在左下角的单个订书钉。

### StapleBottomRight {#StapleBottomRight}
```
public static final Staple.StapleOption StapleBottomRight
```


指定在右下角的单个订书钉。

### StapleDualBottom {#StapleDualBottom}
```
public static final Staple.StapleOption StapleDualBottom
```


指定沿底部边缘的两个订书钉。

### StapleDualLeft {#StapleDualLeft}
```
public static final Staple.StapleOption StapleDualLeft
```


指定沿左侧边缘的两个订书钉。

### StapleDualRight {#StapleDualRight}
```
public static final Staple.StapleOption StapleDualRight
```


指定沿右侧边缘的两个订书钉。

### StapleDualTop {#StapleDualTop}
```
public static final Staple.StapleOption StapleDualTop
```


指定沿顶部边缘的两个订书钉

### StapleTopLeft {#StapleTopLeft}
```
public static final Staple.StapleOption StapleTopLeft
```


指定在左上角的单个订书钉。

### StapleTopRight {#StapleTopRight}
```
public static final Staple.StapleOption StapleTopRight
```


指定在右上角的单个订书钉。

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


将一系列项目添加到此选项的项目列表末尾。每个项目必须是 ScoredProperty 或 Property 实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 要添加的项目列表。 |

### add(Staple.IStapleOptionItem[] items) {#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public Staple.StapleOption add(Staple.IStapleOptionItem[] items)
```


向功能添加一个 IStapleOptionItem 实例数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | 任意的 IStapleOptionItem 实例数组。 |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This options instance.
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




### setAngle(int angle) {#setAngle-int-}
```
public final Staple.StapleOption setAngle(int angle)
```


设置 Angle 计分属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| angle | int | 一个 Angle 计分属性值。 |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
### setSheetCapacity(int sheetCapacity) {#setSheetCapacity-int-}
```
public final Staple.StapleOption setSheetCapacity(int sheetCapacity)
```


设置 SheetCapacity 计分属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| sheetCapacity | int | 一个 SheetCapacity 计分属性值。 |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
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

