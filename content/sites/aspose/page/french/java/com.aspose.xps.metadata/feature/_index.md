---
title: "Fonctionnalité"
second_title: "Référence API Aspose.Page pour Java"
description: "La classe qui encapsule une fonctionnalité commune du schéma d'impression."
type: docs
weight: 38
url: /fr/java/com.aspose.xps.metadata/feature/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem), [com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Feature extends CompositePrintTicketElement implements IPrintTicketItem, IFeatureItem
```

La classe qui encapsule une fonctionnalité commune du schéma d'impression. La classe de base pour toutes les fonctionnalités définies par le schéma. Un élément  Feature  contient une liste complète des éléments  Option  et  Property  qui décrivent pleinement un attribut d'appareil, un paramètre de mise en forme du travail, ou toute autre caractéristique pertinente. https://docs.microsoft.com/en-us/windows/win32/printdocs/feature
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [Feature(String name, Option option, IFeatureItem[] items)](#Feature-java.lang.String-com.aspose.xps.metadata.Option-com.aspose.xps.metadata.IFeatureItem...-) | Crée une nouvelle instance de fonctionnalité PrintTicket. |
| [Feature(String name, Feature feature, IFeatureItem[] items)](#Feature-java.lang.String-com.aspose.xps.metadata.Feature-com.aspose.xps.metadata.IFeatureItem...-) | Crée une nouvelle instance de fonctionnalité PrintTicket. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette fonctionnalité. |
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
### Feature(String name, Option option, IFeatureItem[] items) {#Feature-java.lang.String-com.aspose.xps.metadata.Option-com.aspose.xps.metadata.IFeatureItem...-}
```
public Feature(String name, Option option, IFeatureItem[] items)
```


Crée une nouvelle instance de fonctionnalité PrintTicket.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| nom | java.lang.String | Un nom de fonctionnalité. |
| option | [Option](../../com.aspose.xps.metadata/option) | Instance  Option  requise. |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Un tableau arbitraire d'instances  IFeatureItem . Chacune doit être une  Feature , une  Option , ou une instance  Property . |

### Feature(String name, Feature feature, IFeatureItem[] items) {#Feature-java.lang.String-com.aspose.xps.metadata.Feature-com.aspose.xps.metadata.IFeatureItem...-}
```
public Feature(String name, Feature feature, IFeatureItem[] items)
```


Crée une nouvelle instance de fonctionnalité PrintTicket.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| nom | java.lang.String | Nom de fonctionnalité. |
| feature | [Feature](../../com.aspose.xps.metadata/feature) | Instance de Feature requise. |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Un tableau arbitraire d'instances de Property. Chaque élément doit être une Feature, une Option ou une instance de Property. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Ajoute une liste d'éléments à la fin de la liste d'éléments de cette fonctionnalité. Chaque élément doit être une instance de Feature, une Option ou une Property.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Liste des éléments à ajouter. |

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

