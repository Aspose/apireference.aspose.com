---
title: IBuffer
second_title: Aspose.3D für Java API-Referenz
description: Die Basisschnittstelle aller verwalteten Puffer, die beim Rendern verwendet werden
type: docs
weight: 239
url: /de/java/com.aspose.threed/ibuffer/
---

**All Implemented Interfaces:**
java.io.Closeable
```
public interface IBuffer extends Closeable
```

Die Basisschnittstelle aller verwalteten Puffer, die beim Rendern verwendet werden
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [getSize()](#getSize--) | Größe dieses Puffers in Bytes |
| [loadData(byte[] data)](#loadData-byte---) | Lädt die Daten in den aktuellen Puffer |
### getSize() {#getSize--}
```
public abstract int getSize()
```


Größe dieses Puffers in Bytes

**Returns:**
int - Größe dieses Puffers in Bytes
### loadData(byte[] data) {#loadData-byte---}
```
public abstract void loadData(byte[] data)
```


Lädt die Daten in den aktuellen Puffer

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | byte[] |  |

