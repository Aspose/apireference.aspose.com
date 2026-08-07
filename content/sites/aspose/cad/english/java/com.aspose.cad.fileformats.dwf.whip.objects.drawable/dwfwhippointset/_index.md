---
title: "DwfWhipPointSet"
linktitle: "DwfWhipPointSet"
second_title: "Aspose.CAD for Java"
description: "Represents point set object"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.dwf.whip.objects.drawable/dwfwhippointset/
---

**Inheritance:** java.lang.Object, DwfWhipDrawable

Represents point set object

## Constructors

| Constructor | Description |
| --- | --- |
| [DwfWhipPointSet()](#DwfWhipPointSet) |  |

## Methods

| Method | Description |
| --- | --- |
| [getPoints()](#getPoints) | Gets points |
| [isTransformed()](#isTransformed) | Gets or sets is transformed, true if the points have been transformed |
| [getMinPoint()](#getMinPoint) | Gets the min point of object. |
| [getMaxPoint()](#getMaxPoint) | Gets the max point of object. |
| [transform(DwfWhipTransform transform)](#transform-com.aspose.cad.fileformats.dwf.whip.objects.DwfWhipTransform) | Transforms object |

### DwfWhipPointSet() {#DwfWhipPointSet}
```java
public DwfWhipPointSet()
```

### getPoints() {#getPoints}
```java
public com.aspose.ms.System.Collections.ObjectModel.ReadOnlyCollection<DwfWhipLogicalPoint> getPoints()
```

Gets points

**Returns:** com.aspose.ms.System.Collections.ObjectModel.ReadOnlyCollection<DwfWhipLogicalPoint>

### isTransformed() {#isTransformed}
```java
public boolean isTransformed()
```

Gets or sets is transformed, true if the points have been transformed

**Returns:** boolean

### getMinPoint() {#getMinPoint}
```java
public Cad3DPoint getMinPoint()
```

Gets the min point of object.

**Returns:** Cad3DPoint - Min point of object.

### getMaxPoint() {#getMaxPoint}
```java
public Cad3DPoint getMaxPoint()
```

Gets the max point of object.

**Returns:** Cad3DPoint - Max point of object.

### transform(DwfWhipTransform transform) {#transform-com.aspose.cad.fileformats.dwf.whip.objects.DwfWhipTransform}
```java
public void transform(DwfWhipTransform transform)
```

Transforms object

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| transform | DwfWhipTransform | Transform matrix |

