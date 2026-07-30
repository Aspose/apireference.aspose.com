---
title: "IPathSegment"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "تمثل واجهة أي مقطع مسار."
type: docs
weight: 131
url: /ar/java/com.aspose.font/ipathsegment/
---
**All Implemented Interfaces:**
java.lang.Cloneable
```
public interface IPathSegment extends Cloneable
```

تمثل واجهة أي مقطع مسار.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [copy()](#copy--) | ينشئ نسخة من كائن الجزء. |
| [shift(double dx, double dy)](#shift-double-double-) | ينفّذ إزاحة باستخدام إحداثيات x و y. |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | يحوّل الإحداثيات باستخدام مصفوفة التحويل. |
### copy() {#copy--}
```
public abstract IPathSegment copy()
```


ينشئ نسخة من كائن الجزء.

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
### shift(double dx, double dy) {#shift-double-double-}
```
public abstract void shift(double dx, double dy)
```


ينفّذ إزاحة باستخدام إحداثيات x و y.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| dx | double | قيمة dx. |
| dy | double | قيمة dy. |

### transform(TransformationMatrix matrix) {#transform-com.aspose.font.TransformationMatrix-}
```
public abstract void transform(TransformationMatrix matrix)
```


يحوّل الإحداثيات باستخدام مصفوفة التحويل.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | مصفوفة التحويل. |

