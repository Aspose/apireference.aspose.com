---
title: CoordinateSpace
second_title: Aspose.Drawing for Java API Reference
description: Specifies the system to use when evaluating coordinates.
type: docs
weight: 16
url: /java/com.aspose.drawing.drawing2d/coordinatespace/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.System.Enum
```
public final class CoordinateSpace extends System.Enum
```

Specifies the system to use when evaluating coordinates.
## Fields

| Field | Description |
| --- | --- |
| [World](#World) | Specifies that coordinates are in the world coordinate context. |
| [Page](#Page) | Specifies that coordinates are in the page coordinate context. |
| [Device](#Device) | Specifies that coordinates are in the device coordinate context. |
### World {#World}
```
public static final int World
```


Specifies that coordinates are in the world coordinate context. World coordinates are used in a nonphysical environment, such as a modeling environment.

### Page {#Page}
```
public static final int Page
```


Specifies that coordinates are in the page coordinate context. Their units are defined by the Graphics.PageUnit property, and must be one of the elements of the GraphicsUnit enumeration.

### Device {#Device}
```
public static final int Device
```


Specifies that coordinates are in the device coordinate context. On a computer screen the device coordinates are usually measured in pixels.

