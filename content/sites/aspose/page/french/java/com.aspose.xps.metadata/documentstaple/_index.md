---
title: "DocumentStaple"
second_title: "Référence API Aspose.Page pour Java"
description: "Décrit les caractéristiques d'agrafage de la sortie."
type: docs
weight: 35
url: /fr/java/com.aspose.xps.metadata/documentstaple/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Staple](../../com.aspose.xps.metadata/staple)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentStaple extends Staple implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Décrit les caractéristiques d'agrafage de la sortie. Chaque document est agrafé séparément. Les mots-clés JobStapleAllDocuments et DocumentStaple sont mutuellement exclusifs. Il appartient au pilote de déterminer la gestion des contraintes entre ces mots-clés. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [DocumentStaple(Staple.StapleOption[] options)](#DocumentStaple-com.aspose.xps.metadata.Staple.StapleOption...-) | Crée une nouvelle instance. |
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
### DocumentStaple(Staple.StapleOption[] options) {#DocumentStaple-com.aspose.xps.metadata.Staple.StapleOption...-}
```
public DocumentStaple(Staple.StapleOption[] options)
```


Crée une nouvelle instance.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| options | [StapleOption\[\]](../../com.aspose.xps.metadata/stapleoption) | Un tableau d'options spécifiques à la fonctionnalité. |

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

