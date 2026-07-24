---
title: "JobPrimaryBannerSheet.BannerSheetOption"
second_title: "Référence API Aspose.Page pour Java"
description: "Représente les options de la fonctionnalité JobPrimaryBannerSheet."
type: docs
weight: 10
url: /fr/java/com.aspose.xps.metadata/jobprimarybannersheet.bannersheetoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobPrimaryBannerSheet.BannerSheetOption extends Option
```

Représente les options de la fonctionnalité JobPrimaryBannerSheet.
## Champs

| Champ | Description |
| --- | --- |
| [Custom](#Custom) | Spécifie qu’une feuille de bannière personnalisée doit être générée. |
| [None](#None) | Spécifie qu’aucune feuille de bannière ne doit être générée. |
| [Standard](#Standard) | Spécifie que la feuille de bannière standard (définie par l’appareil) doit être générée. |
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
public static final JobPrimaryBannerSheet.BannerSheetOption Custom
```


Spécifie qu’une feuille de bannière personnalisée doit être générée. Si un  JobPrimaryBannerSheetSource   ParameterInit  élément n’est pas spécifié, cette Option doit être ignorée.

### None {#None}
```
public static final JobPrimaryBannerSheet.BannerSheetOption None
```


Spécifie qu’aucune feuille de bannière ne doit être générée.

### Standard {#Standard}
```
public static final JobPrimaryBannerSheet.BannerSheetOption Standard
```


Spécifie que la feuille de bannière standard (définie par l’appareil) doit être générée.

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

