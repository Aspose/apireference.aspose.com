---
title: "PrintTicket"
second_title: "Référence API Aspose.Page pour Java"
description: "La classe qui implémente un PrintTicket commun de n'importe quel périmètre."
type: docs
weight: 141
url: /fr/java/com.aspose.xps.metadata/printticket/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable
```
public abstract class PrintTicket implements Iterable<String>
```

La classe qui implémente un PrintTicket commun de n'importe quel périmètre. La classe de base pour les tickets d'impression au niveau du travail, du document et de la page. Un élément  PrintTicket  est l'élément racine du document PrintTicket. Un élément  PrintTicket  contient toutes les informations de formatage du travail nécessaires pour produire un travail. https://docs.microsoft.com/en-us/windows/win32/printdocs/printticket
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [PrintTicket(IPrintTicketItem[] items)](#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-) | Crée une nouvelle instance. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Renvoie l'itérateur des noms d'éléments du ticket d'impression. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | Supprime un élément de cette liste d'éléments PrintTicket. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PrintTicket(IPrintTicketItem[] items) {#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-}
```
public PrintTicket(IPrintTicketItem[] items)
```


Crée une nouvelle instance.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| items | [IPrintTicketItem\[\]](../../com.aspose.xps.metadata/iprintticketitem) | Un tableau arbitraire d'instances  IPrintTicketItem . Chaque instance doit être une  Feature , une  ParameterInit  ou une  Property . |

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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<String> iterator()
```


Renvoie l'itérateur des noms d'éléments du ticket d'impression.

**Returns:**
java.util.Iterator<java.lang.String> - Renvoie l'itérateur pour la liste.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(String[] names) {#remove-java.lang.String...-}
```
public void remove(String[] names)
```


Supprime un élément de cette liste d'éléments PrintTicket.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| noms | java.lang.String[] | Un tableau de noms d'éléments. |

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

