---
title: "JobPrimaryCoverBack.CoverBackOption"
second_title: "Référence API Aspose.Page pour Java"
description: "Décrit les options de la fonctionnalité JobPrimaryCoverBack."
type: docs
weight: 10
url: /fr/java/com.aspose.xps.metadata/jobprimarycoverback.coverbackoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobPrimaryCoverBack.CoverBackOption extends Option
```

Décrit les options de la fonctionnalité JobPrimaryCoverBack.
## Champs

| Champ | Description |
| --- | --- |
| [BlankCover](#BlankCover) | Spécifie qu’une feuille de couverture vierge doit être imprimée. |
| [NoCover](#NoCover) | Spécifie qu’aucune couverture ne sera produite. |
| [PrintBack](#PrintBack) | Spécifie que la couverture indiquée par \"CoverBackSource\" doit être imprimée sur le côté arrière de la feuille de couverture. |
| [PrintBoth](#PrintBoth) | Spécifie que la couverture indiquée par \"CoverBackSource\" peut être imprimée sur les deux faces de la feuille de couverture. |
| [PrintFront](#PrintFront) | Spécifie que la couverture indiquée par \"CoverBackSource\" doit être imprimée sur le côté avant de la feuille de couverture. |
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
### BlankCover {#BlankCover}
```
public static final JobPrimaryCoverBack.CoverBackOption BlankCover
```


Spécifie qu’une feuille de couverture vierge doit être imprimée.

### NoCover {#NoCover}
```
public static final JobPrimaryCoverBack.CoverBackOption NoCover
```


Spécifie qu’aucune couverture ne sera produite.

### PrintBack {#PrintBack}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBack
```


Spécifie que la couverture indiquée par \"CoverBackSource\" doit être imprimée sur le côté arrière de la feuille de couverture. Si un élément  JobPrimaryCoverBackSource   ParameterInit  n'est pas spécifié, cette option doit être ignorée.

### PrintBoth {#PrintBoth}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBoth
```


Spécifie que la couverture indiquée par \"CoverBackSource\" peut être imprimée sur les deux faces de la feuille de couverture. Si un élément  JobPrimaryCoverBackSource   ParameterInit  n'est pas spécifié, cette option doit être ignorée.

### PrintFront {#PrintFront}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintFront
```


Spécifie que la couverture indiquée par \"CoverBackSource\" doit être imprimée sur le côté avant de la feuille de couverture. Si un élément  JobPrimaryCoverBackSource   ParameterInit  n'est pas spécifié, cette option doit être ignorée.

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

