---
title: "PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption"
second_title: "Référence API Aspose.Page pour Java"
description: "Décrit les options de fonctionnalité PageDeviceColorSpaceUsage."
type: docs
weight: 10
url: /fr/java/com.aspose.xps.metadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption extends Option
```

Décrit les options de la fonctionnalité  PageDeviceColorSpaceUsage .
## Champs

| Champ | Description |
| --- | --- |
| [MatchToDefault](#MatchToDefault) | Si l'appareil détermine que le profil spécifié par le paramètre PageDeviceColorSpaceProfileURI peut être utilisé comme profil d'espace couleur de l'appareil, tous les éléments utilisant le même profil sont considérés comme déjà spécifiés dans l'espace couleur de l'appareil. |
| [OverrideDeviceDefault](#OverrideDeviceDefault) | Si le profil spécifié par le paramètre PageDeviceColorSpaceProfileURI possède un nombre de canaux correspondant au nombre de primaires de l'appareil, il DOIT être utilisé à la place de la gestion interne des couleurs de l'appareil pour tous les éléments. |
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
### MatchToDefault {#MatchToDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption MatchToDefault
```


Si l'appareil détermine que le profil spécifié par le paramètre PageDeviceColorSpaceProfileURI peut être utilisé comme profil d'espace couleur de l'appareil, tous les éléments utilisant le même profil sont considérés comme déjà spécifiés dans l'espace couleur de l'appareil. Tous les autres éléments DOIVENT utiliser le profil spécifié pour cet élément. Si le profil ne peut pas être utilisé comme profil d'espace couleur de l'appareil, les éléments utilisant le profil DOIVENT être gérés colorimétriquement comme tout autre élément utilisant le profil couleur.

### OverrideDeviceDefault {#OverrideDeviceDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption OverrideDeviceDefault
```


Si le profil spécifié par le paramètre PageDeviceColorSpaceProfileURI possède un nombre de canaux correspondant au nombre de primaires de l'appareil, il DEVRAIT être utilisé à la place de la gestion interne des couleurs de l'appareil pour tous les éléments. Les éléments utilisant ce profil sont supposés être dans l'espace couleur de l'appareil et ne seront pas gérés colorimétriquement davantage.

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

