---
title: "IntegerParameterInit"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe de base pour tous les initialiseurs de paramètres entiers."
type: docs
weight: 42
url: /fr/java/com.aspose.xps.metadata/integerparameterinit/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit)
```
public abstract class IntegerParameterInit extends ParameterInit
```

Classe de base pour tous les initialiseurs de paramètres entiers.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [IntegerParameterInit(String name, int value)](#IntegerParameterInit-java.lang.String-int-) | Crée une nouvelle instance. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxValue()](#getMaxValue--) | Pour les paramètres de type entier ou décimal, définit la plus grande valeur autorisée. |
| [getMinValue()](#getMinValue--) | Pour les paramètres de type entier ou décimal, définit la plus petite valeur autorisée. |
| [getMultiple()](#getMultiple--) | Pour les paramètres de type entier ou décimal, la valeur du paramètre doit être un multiple de ce nombre. |
| [getName()](#getName--) | Obtient le nom de l'élément. |
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


Crée une nouvelle instance.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| nom | java.lang.String | Le nom du paramètre. |
| valeur | int | La valeur du paramètre. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
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


Pour les paramètres de type entier ou décimal, définit la plus grande valeur autorisée.

**Returns:**
int - La plus grande valeur autorisée.
### getMinValue() {#getMinValue--}
```
public int getMinValue()
```


Pour les paramètres de type entier ou décimal, définit la plus petite valeur autorisée.

**Returns:**
int - La plus petite valeur autorisée.
### getMultiple() {#getMultiple--}
```
public int getMultiple()
```


Pour les paramètres de type entier ou décimal, la valeur du paramètre doit être un multiple de ce nombre.

**Returns:**
int - Le nombre dont le paramètre doit être un multiple.
### getName() {#getName--}
```
public String getName()
```


Obtient le nom de l'élément.

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

