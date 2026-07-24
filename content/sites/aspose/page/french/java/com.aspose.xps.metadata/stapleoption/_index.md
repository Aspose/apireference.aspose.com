---
title: "Staple.StapleOption"
second_title: "Référence API Aspose.Page pour Java"
description: "Décrit les options des fonctionnalités JobStapleAllDocuments et DocumentStaple."
type: docs
weight: 10
url: /fr/java/com.aspose.xps.metadata/staple.stapleoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Staple.StapleOption extends Option
```

Décrit les options des fonctionnalités  JobStapleAllDocuments  et  DocumentStaple .
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [StapleOption(String optionName, Staple.IStapleOptionItem[] items)](#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Crée une nouvelle instance. |
## Champs

| Champ | Description |
| --- | --- |
| [None](#None) | Spécifie aucune agrafe. |
| [SaddleStitch](#SaddleStitch) | Spécifie l'agrafe en couture à cheval. |
| [StapleBottomLeft](#StapleBottomLeft) | Spécifie une seule agrafe dans le coin inférieur gauche. |
| [StapleBottomRight](#StapleBottomRight) | Spécifie une seule agrafe dans le coin inférieur droit. |
| [StapleDualBottom](#StapleDualBottom) | Spécifie deux agrafes le long du bord inférieur. |
| [StapleDualLeft](#StapleDualLeft) | Spécifie deux agrafes le long du bord gauche. |
| [StapleDualRight](#StapleDualRight) | Spécifie deux agrafes le long du bord droit. |
| [StapleDualTop](#StapleDualTop) | Spécifie deux agrafes le long du bord supérieur |
| [StapleTopLeft](#StapleTopLeft) | Spécifie une seule agrafe dans le coin supérieur gauche. |
| [StapleTopRight](#StapleTopRight) | Spécifie une seule agrafe dans le coin supérieur droit. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette option. |
| [add(Staple.IStapleOptionItem[] items)](#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Ajoute un tableau d'instances IStapleOptionItem à la fonctionnalité. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Obtient le nom de l'élément. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAngle(int angle)](#setAngle-int-) | Définit la valeur de la propriété notée Angle. |
| [setSheetCapacity(int sheetCapacity)](#setSheetCapacity-int-) | Définit la valeur de la propriété notée SheetCapacity. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StapleOption(String optionName, Staple.IStapleOptionItem[] items) {#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public StapleOption(String optionName, Staple.IStapleOptionItem[] items)
```


Crée une nouvelle instance.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| optionName | java.lang.String | Un nom d'option. |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Un tableau arbitraire d'instances IStapleOptionItem. |

### None {#None}
```
public static final Staple.StapleOption None
```


Spécifie aucune agrafe.

### SaddleStitch {#SaddleStitch}
```
public static final Staple.StapleOption SaddleStitch
```


Spécifie l'agrafe en couture à cheval.

### StapleBottomLeft {#StapleBottomLeft}
```
public static final Staple.StapleOption StapleBottomLeft
```


Spécifie une seule agrafe dans le coin inférieur gauche.

### StapleBottomRight {#StapleBottomRight}
```
public static final Staple.StapleOption StapleBottomRight
```


Spécifie une seule agrafe dans le coin inférieur droit.

### StapleDualBottom {#StapleDualBottom}
```
public static final Staple.StapleOption StapleDualBottom
```


Spécifie deux agrafes le long du bord inférieur.

### StapleDualLeft {#StapleDualLeft}
```
public static final Staple.StapleOption StapleDualLeft
```


Spécifie deux agrafes le long du bord gauche.

### StapleDualRight {#StapleDualRight}
```
public static final Staple.StapleOption StapleDualRight
```


Spécifie deux agrafes le long du bord droit.

### StapleDualTop {#StapleDualTop}
```
public static final Staple.StapleOption StapleDualTop
```


Spécifie deux agrafes le long du bord supérieur

### StapleTopLeft {#StapleTopLeft}
```
public static final Staple.StapleOption StapleTopLeft
```


Spécifie une seule agrafe dans le coin supérieur gauche.

### StapleTopRight {#StapleTopRight}
```
public static final Staple.StapleOption StapleTopRight
```


Spécifie une seule agrafe dans le coin supérieur droit.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Ajoute une liste d'éléments à la fin de la liste d'éléments de cette option. Chaque élément doit être une instance de  ScoredProperty  ou de  Property .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Liste des éléments à ajouter. |

### add(Staple.IStapleOptionItem[] items) {#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public Staple.StapleOption add(Staple.IStapleOptionItem[] items)
```


Ajoute un tableau d'instances IStapleOptionItem à la fonctionnalité.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Un tableau arbitraire d'instances IStapleOptionItem. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This options instance.
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




### setAngle(int angle) {#setAngle-int-}
```
public final Staple.StapleOption setAngle(int angle)
```


Définit la valeur de la propriété notée Angle.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| angle | int | Une valeur de propriété notée Angle. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
### setSheetCapacity(int sheetCapacity) {#setSheetCapacity-int-}
```
public final Staple.StapleOption setSheetCapacity(int sheetCapacity)
```


Définit la valeur de la propriété notée SheetCapacity.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| sheetCapacity | int | Une valeur de propriété notée SheetCapacity. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
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

