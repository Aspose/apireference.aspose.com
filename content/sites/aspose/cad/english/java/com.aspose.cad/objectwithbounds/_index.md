---
title: "ObjectWithBounds"
linktitle: "ObjectWithBounds"
second_title: "Aspose.CAD for Java"
description: "The object having bounds."
type: docs
weight: 10
url: /java/com.aspose.cad/objectwithbounds/
---

The object having bounds.

## Constructors

| Constructor | Description |
| --- | --- |
| [ObjectWithBounds()](#ObjectWithBounds) |  |

## Methods

| Method | Description |
| --- | --- |
| [getBounds()](#getBounds) | Gets the object's bounds. |
| [getBounds(Matrix matrix)](#getBounds-com.aspose.cad.Matrix) | Gets the object's bounds. |
| [transform(Matrix transform)](#transform-com.aspose.cad.Matrix) | Applies the specified transformation to the shape. |

### ObjectWithBounds() {#ObjectWithBounds}
```java
public ObjectWithBounds()
```

### getBounds() {#getBounds}
```java
public abstract com.aspose.cad.RectangleF getBounds()
```

Gets the object's bounds.

**Returns:** com.aspose.cad.RectangleF - The object's bounds.

### getBounds(Matrix matrix) {#getBounds-com.aspose.cad.Matrix}
```java
public abstract com.aspose.cad.RectangleF getBounds(Matrix matrix)
```

Gets the object's bounds.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| matrix | Matrix | The matrix to apply before bounds will be calculated. |

**Returns:** com.aspose.cad.RectangleF - The estimated object's bounds.

### transform(Matrix transform) {#transform-com.aspose.cad.Matrix}
```java
public abstract void transform(Matrix transform)
```

Applies the specified transformation to the shape.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| transform | Matrix | The transformation to apply. |

