---
title: "PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает параметры функции PageDeviceColorSpaceUsage."
type: docs
weight: 10
url: /ru/java/com.aspose.xps.metadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption extends Option
```

Описывает параметры функции PageDeviceColorSpaceUsage.
## Поля

| Поле | Описание |
| --- | --- |
| [MatchToDefault](#MatchToDefault) | Если устройство определяет, что профиль, указанный параметром PageDeviceColorSpaceProfileURI, может быть использован в качестве профиля цветового пространства устройства, все элементы, использующие тот же профиль, рассматриваются как уже указанные в цветовом пространстве устройства. |
| [OverrideDeviceDefault](#OverrideDeviceDefault) | Если профиль, указанный параметром PageDeviceColorSpaceProfileURI, имеет количество каналов, соответствующее количеству первичных цветов устройства, его SHOULD использовать вместо внутреннего управления цветом устройства для всех элементов. |
## Методы

| Метод | Описание |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Добавляет список элементов в конец списка элементов этой опции. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Получает имя элемента. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MatchToDefault {#MatchToDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption MatchToDefault
```


Если устройство определяет, что профиль, указанный параметром PageDeviceColorSpaceProfileURI, может использоваться в качестве профиля цветового пространства устройства, все элементы, использующие тот же профиль, рассматриваются как уже заданные в цветовом пространстве устройства. Все остальные элементы ДОЛЖНЫ использовать профиль, указанный для этого элемента. Если профиль нельзя использовать в качестве профиля цветового пространства устройства, элементы, использующие профиль, ДОЛЖНЫ управляться цветом так же, как любой другой элемент, использующий цветовой профиль.

### OverrideDeviceDefault {#OverrideDeviceDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption OverrideDeviceDefault
```


Если профиль, указанный параметром PageDeviceColorSpaceProfileURI, имеет количество каналов, соответствующее количеству основных цветов устройства, его СЛЕДУЕТ использовать вместо внутреннего управления цветом устройства для всех элементов. Элементы, использующие этот профиль, считаются находящимися в цветовом пространстве устройства и не будут дополнительно управляться цветом.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Добавляет список элементов в конец списка элементов этой опции. Каждый из них должен быть экземпляром  ScoredProperty  или  Property  instance.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Список элементов для добавления. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
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


Получает имя элемента.

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
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

