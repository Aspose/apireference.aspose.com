---
title: IIndexBuffer
second_title: Aspose.3D für Java API-Referenz
description: Der Indexpuffer beschreibt die Geometrie, die in der Rendering-Pipeline verwendet wird.
type: docs
weight: 242
url: /de/java/com.aspose.threed/iindexbuffer/
---

**All Implemented Interfaces:**
[com.aspose.threed.IBuffer](../../com.aspose.threed/ibuffer)
```
public interface IIndexBuffer extends IBuffer
```

Der Indexpuffer beschreibt die Geometrie, die in der Rendering-Pipeline verwendet wird.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [getCount()](#getCount--) | Ermittelt die Anzahl der Indizes in diesem Puffer. |
| [getIndexDataType()](#getIndexDataType--) | Ermittelt den Datentyp jedes Elements. |
| [loadData(TriMesh mesh)](#loadData-com.aspose.threed.TriMesh-) | Lade Indexdaten von [TriMesh](../../com.aspose.threed/trimesh) |
| [loadData(int[] indices)](#loadData-int---) | Lade Indexdaten |
| [loadData(short[] indices)](#loadData-short---) | Lade Indexdaten |
### getCount() {#getCount--}
```
public abstract int getCount()
```


Ermittelt die Anzahl der Indizes in diesem Puffer.

**Returns:**
int - die Anzahl der Indizes in diesem Puffer.
### getIndexDataType() {#getIndexDataType--}
```
public abstract IndexDataType getIndexDataType()
```


Ermittelt den Datentyp jedes Elements.

**Returns:**
[IndexDataType](../../com.aspose.threed/indexdatatype) - the data type of each element.
### loadData(TriMesh mesh) {#loadData-com.aspose.threed.TriMesh-}
```
public abstract void loadData(TriMesh mesh)
```


Lade Indexdaten von [TriMesh](../../com.aspose.threed/trimesh)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mesh | [TriMesh](../../com.aspose.threed/trimesh) |  |

### loadData(int[] indices) {#loadData-int---}
```
public abstract void loadData(int[] indices)
```


Lade Indexdaten

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Indizes | int[] |  |

### loadData(short[] indices) {#loadData-short---}
```
public abstract void loadData(short[] indices)
```


Lade Indexdaten

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Indizes | short[] |  |

