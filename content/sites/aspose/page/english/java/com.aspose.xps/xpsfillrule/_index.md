---
title: XpsFillRule
second_title: Aspose.Page for Java API Reference
description: Valid values of PathGeometry elements FillRule property.
type: docs
weight: 57
url: /java/com.aspose.xps/xpsfillrule/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsFillRule extends Enum<XpsFillRule>
```

Valid values of PathGeometry element's FillRule property.
## Fields

| Field | Description |
| --- | --- |
| [EvenOdd](#EvenOdd) | This rule determines the \\u201cinsideness\\u201d of a point on the canvas by drawing a ray from the point to infinity in any direction and counting the number of segments from the given shape that the ray crosses. |
| [NonZero](#NonZero) | This rule determines the \\u201cinsideness\\u201d of a point on the canvas by drawing a ray from the point to infinity in any direction and then examining the places where a segment of the shape crosses the ray. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### EvenOdd {#EvenOdd}
```
public static final XpsFillRule EvenOdd
```


This rule determines the \\u201cinsideness\\u201d of a point on the canvas by drawing a ray from the point to infinity in any direction and counting the number of segments from the given shape that the ray crosses. If this number is odd, the point is inside; if it is even, the point is outside.

### NonZero {#NonZero}
```
public static final XpsFillRule NonZero
```


This rule determines the \\u201cinsideness\\u201d of a point on the canvas by drawing a ray from the point to infinity in any direction and then examining the places where a segment of the shape crosses the ray. Starting with a count of zero, add one each time a segment crosses the ray from left to right and subtract one each time a path segment crosses the ray from right to left. After counting the crossings, if the result is zero then the point is outside the path; otherwise, it is inside.

### values() {#values--}
```
public static XpsFillRule[] values()
```




**Returns:**
com.aspose.xps.XpsFillRule[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static XpsFillRule valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule)
