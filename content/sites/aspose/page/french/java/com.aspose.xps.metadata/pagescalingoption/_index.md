---
title: "PageScaling.PageScalingOption"
second_title: "Référence API Aspose.Page pour Java"
description: "Décrit les options des fonctionnalités PageScaling."
type: docs
weight: 10
url: /fr/java/com.aspose.xps.metadata/pagescaling.pagescalingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageScaling.IPageScalingItem](../../com.aspose.xps.metadata/ipagescalingitem)
```
public static final class PageScaling.PageScalingOption extends Option implements PageScaling.IPageScalingItem
```

Décrit les options de fonctionnalité PageScaling.
## Champs

| Champ | Description |
| --- | --- |
| [Custom](#Custom) | Spécifie qu’une mise à l’échelle personnalisée doit être appliquée à la taille du média d’application. |
| [CustomSquare](#CustomSquare) | Spécifie qu’une mise à l’échelle carrée personnalisée doit être appliquée à la taille du média d’application. |
| [FitApplicationBleedSizeToPageImageableSize](#FitApplicationBleedSizeToPageImageableSize) | Spécifie que la taille de débordement de l’application doit être mise à l’échelle à la  PageImageableSize  en préservant le rapport d’aspect. |
| [FitApplicationContentSizeToPageImageableSize](#FitApplicationContentSizeToPageImageableSize) | Spécifie que la taille du contenu de l’application doit être mise à l’échelle à la  PageImageableSize  en préservant le rapport d’aspect. |
| [FitApplicationMediaSizeToPageImageableSize](#FitApplicationMediaSizeToPageImageableSize) | Spécifie que la taille du média de l’application doit être mise à l’échelle à la  PageImageableSize  en préservant le rapport d’aspect. |
| [FitApplicationMediaSizeToPageMediaSize](#FitApplicationMediaSizeToPageMediaSize) | Spécifie que la taille du média de l’application doit être mise à l’échelle à la  PageMediaSize  en préservant le rapport d’aspect. |
| [None](#None) | Spécifie qu’aucune mise à l’échelle ne doit être appliquée. |
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
### Custom {#Custom}
```
public static PageScaling.PageScalingOption Custom
```


Spécifie qu’une mise à l’échelle personnalisée doit être appliquée à la taille du média d’application.

### CustomSquare {#CustomSquare}
```
public static PageScaling.PageScalingOption CustomSquare
```


Spécifie qu’une mise à l’échelle carrée personnalisée doit être appliquée à la taille du média d’application.

### FitApplicationBleedSizeToPageImageableSize {#FitApplicationBleedSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationBleedSizeToPageImageableSize
```


Spécifie que la taille de débordement de l’application doit être mise à l’échelle à la  PageImageableSize  en préservant le rapport d’aspect.

### FitApplicationContentSizeToPageImageableSize {#FitApplicationContentSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationContentSizeToPageImageableSize
```


Spécifie que la taille du contenu de l’application doit être mise à l’échelle à la  PageImageableSize  en préservant le rapport d’aspect.

### FitApplicationMediaSizeToPageImageableSize {#FitApplicationMediaSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageImageableSize
```


Spécifie que la taille du média de l’application doit être mise à l’échelle à la  PageImageableSize  en préservant le rapport d’aspect.

### FitApplicationMediaSizeToPageMediaSize {#FitApplicationMediaSizeToPageMediaSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageMediaSize
```


Spécifie que la taille du média de l’application doit être mise à l’échelle à la  PageMediaSize  en préservant le rapport d’aspect.

### None {#None}
```
public static PageScaling.PageScalingOption None
```


Spécifie qu’aucune mise à l’échelle ne doit être appliquée.

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

