---
title: IOrientable
second_title: Aspose.3D für Java API-Referenz
description: Orientierbare Entitäten müssen dieses Interface implementieren.
type: docs
weight: 246
url: /de/java/com.aspose.threed/iorientable/
---
```
public interface IOrientable
```

Orientierbare Entitäten müssen dieses Interface implementieren.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [getDirection()](#getDirection--) | Ermittelt die Richtung, in die die Entität schaut. |
| [getTarget()](#getTarget--) | Ermittelt das Ziel, auf das die Entität schaut. |
| [setDirection(Vector3 value)](#setDirection-com.aspose.threed.Vector3-) | Setzt die Richtung, in die die Entität schaut. |
| [setTarget(Node value)](#setTarget-com.aspose.threed.Node-) | Setzt das Ziel, auf das die Entität schaut. |
### getDirection() {#getDirection--}
```
public abstract Vector3 getDirection()
```


Ermittelt die Richtung, in die die Entität schaut.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the direction that the entity is looking at.
### getTarget() {#getTarget--}
```
public abstract Node getTarget()
```


Ermittelt das Ziel, auf das die Entität schaut.

**Returns:**
[Node](../../com.aspose.threed/node) - the target that the entity is looking at.
### setDirection(Vector3 value) {#setDirection-com.aspose.threed.Vector3-}
```
public abstract void setDirection(Vector3 value)
```


Setzt die Richtung, in die die Entität schaut.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setTarget(Node value) {#setTarget-com.aspose.threed.Node-}
```
public abstract void setTarget(Node value)
```


Setzt das Ziel, auf das die Entität schaut.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | Neuer Wert |

