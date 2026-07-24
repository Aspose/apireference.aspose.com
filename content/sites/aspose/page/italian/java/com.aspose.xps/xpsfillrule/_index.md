---
title: "XpsFillRule"
second_title: "Aspose.Page per Java API Reference"
description: "Valori validi della proprietà FillRule degli elementi PathGeometry."
type: docs
weight: 59
url: /it/java/com.aspose.xps/xpsfillrule/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsFillRule extends Enum<XpsFillRule>
```

Valori validi della proprietà FillRule dell'elemento PathGeometry.
## Campi

| Campo | Descrizione |
| --- | --- |
| [EvenOdd](#EvenOdd) | Questa regola determina la \\u201cinsideness\\u201d di un punto sulla tela disegnando un raggio dal punto all'infinito in qualsiasi direzione e contando il numero di segmenti della forma data che il raggio attraversa. |
| [NonZero](#NonZero) | Questa regola determina la \\u201cinsideness\\u201d di un punto sulla tela disegnando un raggio dal punto all'infinito in qualsiasi direzione e poi esaminando i punti in cui un segmento della forma attraversa il raggio. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### EvenOdd {#EvenOdd}
```
public static final XpsFillRule EvenOdd
```


Questa regola determina la \\u201cinsideness\\u201d di un punto sulla tela disegnando un raggio dal punto all'infinito in qualsiasi direzione e contando il numero di segmenti della forma data che il raggio attraversa. Se questo numero è dispari, il punto è interno; se è pari, il punto è esterno.

### NonZero {#NonZero}
```
public static final XpsFillRule NonZero
```


Questa regola determina la \\u201cinsideness\\u201d di un punto sulla tela disegnando un raggio dal punto all'infinito in qualsiasi direzione e poi esaminando i punti in cui un segmento della forma attraversa il raggio. Partendo da un conteggio pari a zero, aggiungi uno ogni volta che un segmento attraversa il raggio da sinistra a destra e sottrai uno ogni volta che un segmento del percorso attraversa il raggio da destra a sinistra. Dopo aver contato le intersezioni, se il risultato è zero il punto è fuori dal percorso; altrimenti, è interno.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static XpsFillRule valueOf(String name)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | java.lang.String |  |

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule)
### values() {#values--}
```
public static XpsFillRule[] values()
```




**Returns:**
com.aspose.xps.XpsFillRule[]
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

