---
title: "PageOutputQuality.PageOutputQualityOption"
second_title: "Référence API Aspose.Page pour Java"
description: "Définit les options de la fonctionnalité PageOutputQuality."
type: docs
weight: 10
url: /fr/java/com.aspose.xps.metadata/pageoutputquality.pageoutputqualityoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageOutputQuality.PageOutputQualityOption extends Option
```

Définit les options de fonctionnalité PageOutputQuality.
## Champs

| Champ | Description |
| --- | --- |
| [Automatic](#Automatic) | Spécifie l'intention pour la sortie automatique (permet au client de choisir automatiquement les meilleurs paramètres). |
| [Draft](#Draft) | Spécifie l'intention pour la sortie brouillon (équilibrée pour le texte et les graphiques de qualité brouillon). |
| [Fax](#Fax) | Spécifie l'intention pour la sortie fax (équilibrée pour la qualité fax standard). |
| [High](#High) | Spécifie l'intention pour la sortie haute qualité (équilibrée pour le texte et les graphiques de haute qualité). |
| [Normal](#Normal) | Spécifie l'intention pour une sortie normale (équilibrée pour un texte et des graphiques de bonne qualité). |
| [Photographic](#Photographic) | Spécifie l'intention pour une sortie photographique (les images doivent être de la plus haute qualité). |
| [Text](#Text) | Spécifie l'intention pour une sortie texte uniquement (les graphiques peuvent être rendus de façon médiocre ou pas du tout). |
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
### Automatic {#Automatic}
```
public static PageOutputQuality.PageOutputQualityOption Automatic
```


Spécifie l'intention pour la sortie automatique (permet au client de choisir automatiquement les meilleurs paramètres).

### Draft {#Draft}
```
public static PageOutputQuality.PageOutputQualityOption Draft
```


Spécifie l'intention pour la sortie brouillon (équilibrée pour le texte et les graphiques de qualité brouillon).

### Fax {#Fax}
```
public static PageOutputQuality.PageOutputQualityOption Fax
```


Spécifie l'intention pour la sortie fax (équilibrée pour la qualité fax standard).

### High {#High}
```
public static PageOutputQuality.PageOutputQualityOption High
```


Spécifie l'intention pour la sortie haute qualité (équilibrée pour le texte et les graphiques de haute qualité).

### Normal {#Normal}
```
public static PageOutputQuality.PageOutputQualityOption Normal
```


Spécifie l'intention pour une sortie normale (équilibrée pour un texte et des graphiques de bonne qualité).

### Photographic {#Photographic}
```
public static PageOutputQuality.PageOutputQualityOption Photographic
```


Spécifie l'intention pour une sortie photographique (les images doivent être de la plus haute qualité).

### Text {#Text}
```
public static PageOutputQuality.PageOutputQualityOption Text
```


Spécifie l'intention pour une sortie texte uniquement (les graphiques peuvent être rendus de façon médiocre ou pas du tout).

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

