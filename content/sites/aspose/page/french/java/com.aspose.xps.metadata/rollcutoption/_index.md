---
title: "RollCut.RollCutOption"
second_title: "Référence API Aspose.Page pour Java"
description: "Décrit les options des fonctionnalités JobRollCutAtEndOfJob et DocumentRollCut."
type: docs
weight: 10
url: /fr/java/com.aspose.xps.metadata/rollcut.rollcutoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class RollCut.RollCutOption extends Option
```

Décrit les options des fonctionnalités  JobRollCutAtEndOfJob  et  DocumentRollCut .
## Champs

| Champ | Description |
| --- | --- |
| [Banner](#Banner) | Spécifie la méthode de découpe pour la bannière ( uniquement DocumentRollCut ). |
| [CutSheetAtImageEdge](#CutSheetAtImageEdge) | Spécifie la découpe au bord de l'image. |
| [CutSheetAtStandardMediaSize](#CutSheetAtStandardMediaSize) | Spécifie la découpe pour le format de support standard. |
| [None](#None) | Spécifie aucune découpe de rouleau de travail. |
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
### Banner {#Banner}
```
public static RollCut.RollCutOption Banner
```


Spécifie la méthode de découpe pour la bannière ( uniquement DocumentRollCut ).

### CutSheetAtImageEdge {#CutSheetAtImageEdge}
```
public static RollCut.RollCutOption CutSheetAtImageEdge
```


Spécifie la découpe au bord de l'image.

### CutSheetAtStandardMediaSize {#CutSheetAtStandardMediaSize}
```
public static RollCut.RollCutOption CutSheetAtStandardMediaSize
```


Spécifie la découpe pour le format de support standard.

### None {#None}
```
public static RollCut.RollCutOption None
```


Spécifie aucune découpe de rouleau de travail.

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

