---
title: "InputBin.InputBinOption"
second_title: "Référence API Aspose.Page pour Java"
description: "Décrit les options des fonctionnalités JobInputBin, DocumentInputBin et PageInputBin."
type: docs
weight: 14
url: /fr/java/com.aspose.xps.metadata/inputbin.inputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.InputBin.IInputBinItem](../../com.aspose.xps.metadata/iinputbinitem)
```
public static final class InputBin.InputBinOption extends Option implements InputBin.IInputBinItem
```

Décrit les options des fonctionnalités  JobInputBin ,  DocumentInputBin  et  PageInputBin .
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)](#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Crée une nouvelle instance. |
## Champs

| Champ | Description |
| --- | --- |
| [AutoSelect](#AutoSelect) | L'appareil choisira automatiquement la meilleure option en fonction de la configuration. |
| [AutoSheetFeeder](#AutoSheetFeeder) | Bac d'entrée de l'appareil pour les imprimantes à jet d'encre. |
| [Cassette](#Cassette) | Spécifie que le bac d'alimentation est une cassette. |
| [Manual](#Manual) | Spécifie le bac d'alimentation manuel par défaut. |
| [Tractor](#Tractor) | Spécifie que le bac d'alimentation est un tracteur. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette option. |
| [add(InputBin.IInputBinOptionItem[] items)](#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Ajoute un tableau d'instances  IInputBinOptionItem  à l'option. |
| [clone()](#clone--) | Clone cette instance d'option. |
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
### InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items) {#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)
```


Crée une nouvelle instance.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| optionName | java.lang.String | Un nom d'option. |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | Un tableau arbitraire d'instances  IInputBinOptionItem . |

### AutoSelect {#AutoSelect}
```
public static final InputBin.InputBinOption AutoSelect
```


L'appareil choisira automatiquement la meilleure option en fonction de la configuration.

### AutoSheetFeeder {#AutoSheetFeeder}
```
public static final InputBin.InputBinOption AutoSheetFeeder
```


Bac d'entrée de l'appareil pour les imprimantes à jet d'encre.

### Cassette {#Cassette}
```
public static final InputBin.InputBinOption Cassette
```


Spécifie que le bac d'alimentation est une cassette.

### Manual {#Manual}
```
public static final InputBin.InputBinOption Manual
```


Spécifie le bac d'alimentation manuel par défaut.

### Tractor {#Tractor}
```
public static final InputBin.InputBinOption Tractor
```


Spécifie que le bac d'alimentation est un tracteur.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Ajoute une liste d'éléments à la fin de la liste d'éléments de cette option. Chaque élément doit être une instance de  ScoredProperty  ou de  Property .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Liste des éléments à ajouter. |

### add(InputBin.IInputBinOptionItem[] items) {#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBin.InputBinOption add(InputBin.IInputBinOptionItem[] items)
```


Ajoute un tableau d'instances  IInputBinOptionItem  à l'option.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | Un tableau arbitraire d'instances  IInputBinOptionItem . |

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - This options instance.
### clone() {#clone--}
```
public InputBin.InputBinOption clone()
```


Clone cette instance d'option.

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - The clone of this option instance.
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

