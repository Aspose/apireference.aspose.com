---
title: "IPathSegment"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет интерфейс любого сегмента пути."
type: docs
weight: 131
url: /ru/java/com.aspose.font/ipathsegment/
---
**All Implemented Interfaces:**
java.lang.Cloneable
```
public interface IPathSegment extends Cloneable
```

Представляет интерфейс любого сегмента пути.
## Методы

| Метод | Описание |
| --- | --- |
| [copy()](#copy--) | Создаёт копию объекта сегмента. |
| [shift(double dx, double dy)](#shift-double-double-) | Выполняет сдвиг по координатам x и y. |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | Преобразует координаты с помощью матрицы преобразования. |
### copy() {#copy--}
```
public abstract IPathSegment copy()
```


Создаёт копию объекта сегмента.

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
### shift(double dx, double dy) {#shift-double-double-}
```
public abstract void shift(double dx, double dy)
```


Выполняет сдвиг по координатам x и y.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| dx | double | Значение dx. |
| dy | double | Значение dy. |

### transform(TransformationMatrix matrix) {#transform-com.aspose.font.TransformationMatrix-}
```
public abstract void transform(TransformationMatrix matrix)
```


Преобразует координаты с помощью матрицы преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Матрица преобразования. |

