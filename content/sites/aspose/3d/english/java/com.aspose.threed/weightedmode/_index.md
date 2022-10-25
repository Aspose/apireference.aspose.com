---
title: WeightedMode
second_title: Aspose.3D for Java API Reference
description: Weighted mode.
type: docs
weight: 210
url: /java/com.aspose.threed/weightedmode/
---

**Inheritance:**
java.lang.Object
```
public final class WeightedMode
```

Weighted mode.
## Constructors

| Constructor | Description |
| --- | --- |
| [WeightedMode()](#WeightedMode--) |  |
## Fields

| Field | Description |
| --- | --- |
| [NONE](#NONE) | Both out and next in weights are not used. |
| [OUT_WEIGHT](#OUT-WEIGHT) | Out(right) tangent is weighted. |
| [NEXT_IN_WEIGHT](#NEXT-IN-WEIGHT) | Next in(left) tangent is weighted. |
| [BOTH](#BOTH) | Both out and next in tangents are weighted. |
### WeightedMode() {#WeightedMode--}
```
public WeightedMode()
```


### NONE {#NONE}
```
public static final int NONE
```


Both out and next in weights are not used. When calculation needs tangent information, default value(0.3333) will be used.

### OUT_WEIGHT {#OUT-WEIGHT}
```
public static final int OUT_WEIGHT
```


Out(right) tangent is weighted.

### NEXT_IN_WEIGHT {#NEXT-IN-WEIGHT}
```
public static final int NEXT_IN_WEIGHT
```


Next in(left) tangent is weighted.

### BOTH {#BOTH}
```
public static final int BOTH
```


Both out and next in tangents are weighted.

