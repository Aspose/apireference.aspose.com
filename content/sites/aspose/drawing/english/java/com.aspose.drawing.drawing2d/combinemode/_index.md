---
title: CombineMode
second_title: Aspose.Drawing for Java API Reference
description: Specifies how different clipping regions can be combined.
type: docs
weight: 13
url: /java/com.aspose.drawing.drawing2d/combinemode/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.System.Enum
```
public final class CombineMode extends System.Enum
```

Specifies how different clipping regions can be combined.
## Fields

| Field | Description |
| --- | --- |
| [Replace](#Replace) | One clipping region is replaced by another. |
| [Intersect](#Intersect) | Two clipping regions are combined by taking their intersection. |
| [Union](#Union) | Two clipping regions are combined by taking the union of both. |
| [Xor](#Xor) | Two clipping regions are combined by taking only the areas enclosed by one or the other region, but not both. |
| [Exclude](#Exclude) | Specifies that the existing region is replaced by the result of the new region being removed from the existing region. |
| [Complement](#Complement) | Specifies that the existing region is replaced by the result of the existing region being removed from the new region. |
### Replace {#Replace}
```
public static final int Replace
```


One clipping region is replaced by another.

### Intersect {#Intersect}
```
public static final int Intersect
```


Two clipping regions are combined by taking their intersection.

### Union {#Union}
```
public static final int Union
```


Two clipping regions are combined by taking the union of both.

### Xor {#Xor}
```
public static final int Xor
```


Two clipping regions are combined by taking only the areas enclosed by one or the other region, but not both.

### Exclude {#Exclude}
```
public static final int Exclude
```


Specifies that the existing region is replaced by the result of the new region being removed from the existing region. Said differently, the new region is excluded from the existing region.

### Complement {#Complement}
```
public static final int Complement
```


Specifies that the existing region is replaced by the result of the existing region being removed from the new region. Said differently, the existing region is excluded from the new region.

