---
title: "ScoredProperty"
second_title: "Java için Aspose.Page API Referansı"
description: "Ortak bir PrintTicket ScoredProperty uygulayan sınıf."
type: docs
weight: 146
url: /tr/java/com.aspose.xps.metadata/scoredproperty/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IOptionItem](../../com.aspose.xps.metadata/ioptionitem), [com.aspose.xps.metadata.IScoredPropertyItem](../../com.aspose.xps.metadata/iscoredpropertyitem)
```
public class ScoredProperty extends CompositePrintTicketElement implements IOptionItem, IScoredPropertyItem
```

Ortak bir PrintTicket ScoredProperty uygulayan sınıf. Şema tanımlı tüm puanlanmış özellikler için temel sınıf. Bir ScoredProperty öğesi, bir Option tanımına özgü bir özelliği bildirir. Bu özellikler, istenen Option'ın cihaz tarafından desteklenen Option ile ne kadar yakın eşleştiğini değerlendirirken karşılaştırılmalıdır. https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [ScoredProperty(String name, ParameterRef parameterRef)](#ScoredProperty-java.lang.String-com.aspose.xps.metadata.ParameterRef-) | Yeni bir örnek oluşturur. |
| [ScoredProperty(String name, Value value, IScoredPropertyItem[] items)](#ScoredProperty-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IScoredPropertyItem...-) | Yeni bir örnek oluşturur. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Elemanın adını alır. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ScoredProperty(String name, ParameterRef parameterRef) {#ScoredProperty-java.lang.String-com.aspose.xps.metadata.ParameterRef-}
```
public ScoredProperty(String name, ParameterRef parameterRef)
```


Yeni bir örnek oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | java.lang.String | Bir özellik adı. |
| parameterRef | [ParameterRef](../../com.aspose.xps.metadata/parameterref) | Bir ParameterRef örneği. |

### ScoredProperty(String name, Value value, IScoredPropertyItem[] items) {#ScoredProperty-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IScoredPropertyItem...-}
```
public ScoredProperty(String name, Value value, IScoredPropertyItem[] items)
```


Yeni bir örnek oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | java.lang.String | Bir özellik adı. |
| value | [Value](../../com.aspose.xps.metadata/value) | Bir özellik değeri. |
| items | [IScoredPropertyItem\[\]](../../com.aspose.xps.metadata/iscoredpropertyitem) | İsteğe bağlı bir IScoredPropertyItem örnekleri dizisi. Her biri bir ScoredProperty, bir Property veya bir Value örneği olmalıdır. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametre | Tür | Açıklama |
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


Elemanın adını alır.

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
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

