---
title: "Option"
second_title: "Référence API Aspose.Page pour Java"
description: "La classe qui implémente une Option PrintTicket commune."
type: docs
weight: 76
url: /fr/java/com.aspose.xps.metadata/option/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Option extends CompositePrintTicketElement implements IFeatureItem
```

La classe qui implémente une Option PrintTicket commune. La classe de base pour toutes les options définies par le schéma. Un élément Option contient tous les éléments Property et ScoredProperty associés à cette option. https://docs.microsoft.com/en-us/windows/win32/printdocs/option
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [Option(String name, IOptionItem[] items)](#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-) | Crée une nouvelle instance d'option PrintTicket. |
| [Option(IOptionItem[] items)](#Option-com.aspose.xps.metadata.IOptionItem...-) | Crée une nouvelle instance d'option PrintTicket. |
| [Option(Option option)](#Option-com.aspose.xps.metadata.Option-) | Crée une instance d'option clonée. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette option. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Obtient le nom de l'élément. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Option(String name, IOptionItem[] items) {#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(String name, IOptionItem[] items)
```


Crée une nouvelle instance d'option PrintTicket.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| nom | java.lang.String | Un nom d'option arbitraire. |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Un tableau arbitraire d'instances IOptionItem. Chaque élément doit être une instance de ScoredProperty ou de Property. |

### Option(IOptionItem[] items) {#Option-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(IOptionItem[] items)
```


Crée une nouvelle instance d'option PrintTicket.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Un tableau arbitraire d'instances IOptionItem. Chaque élément doit être une instance de ScoredProperty ou de Property. |

### Option(Option option) {#Option-com.aspose.xps.metadata.Option-}
```
public Option(Option option)
```


Crée une instance d'option clonée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| option | [Option](../../com.aspose.xps.metadata/option) | Une instance d'option à cloner. |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Ajoute une liste d'éléments à la fin de la liste d'éléments de cette option. Chaque élément doit être une instance de  ScoredProperty  ou de  Property .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Liste des éléments à ajouter. |

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

