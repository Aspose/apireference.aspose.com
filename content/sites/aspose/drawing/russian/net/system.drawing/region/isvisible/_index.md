---
title: IsVisible
second_title: Справочник по API Aspose.Drawing для .NET
description: Проверяет содержится ли указанная точка в этомRegion .
type: docs
weight: 130
url: /ru/net/system.drawing/region/isvisible/
---
## IsVisible(float, float) {#isvisible_3}

Проверяет, содержится ли указанная точка в этомRegion .

```csharp
public bool IsVisible(float x, float y)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | Single | X-координата точки для проверки. |
| y | Single | Y-координата точки для проверки. |

### Возвращаемое значение

истина, когда указанная точка содержится в этомRegion; в противном случае ложно.

### Смотрите также

* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(PointF) {#isvisible_9}

Проверяет, указанныйPointF структура содержится в этомRegion .

```csharp
public bool IsVisible(PointF point)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| point | PointF | PointF структуру для тестирования. |

### Возвращаемое значение

верно, когда*point* содержится в этомRegion; в противном случае ложно.

### Смотрите также

* struct [PointF](../../pointf)
* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(float, float, Graphics) {#isvisible_6}

Проверяет, содержится ли указанная точка в этомRegion при рисовании с использованием указанногоGraphics.

```csharp
public bool IsVisible(float x, float y, Graphics g)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | Single | X-координата точки для проверки. |
| y | Single | Y-координата точки для проверки. |
| g | Graphics | АGraphics который представляет графический контекст. |

### Возвращаемое значение

истина, когда указанная точка содержится в этомRegion; в противном случае ложно.

### Смотрите также

* class [Graphics](../../graphics)
* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(PointF, Graphics) {#isvisible_10}

Проверяет, указанныйPointF структура содержится в этомRegion при рисовании с использованием указанногоGraphics .

```csharp
public bool IsVisible(PointF point, Graphics g)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| point | PointF | PointF структуру для тестирования. |
| g | Graphics | АGraphics который представляет графический контекст. |

### Возвращаемое значение

верно, когда*point* содержится в этомRegion; в противном случае ложно.

### Смотрите также

* struct [PointF](../../pointf)
* class [Graphics](../../graphics)
* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(float, float, float, float) {#isvisible_4}

Проверяет, содержится ли какая-либо часть указанного прямоугольника в этомRegion .

```csharp
public bool IsVisible(float x, float y, float width, float height)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | Single | Координата x левого верхнего угла прямоугольника для проверки. |
| y | Single | Y-координата левого верхнего угла прямоугольника для проверки. |
| width | Single | Ширина прямоугольника для проверки. |
| height | Single | Высота прямоугольника для проверки. |

### Возвращаемое значение

Истинно, когда любая часть указанного прямоугольника содержится внутри этогоRegion объект; в противном случае ложно.

### Смотрите также

* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(RectangleF) {#isvisible_13}

Проверяет, является ли какая-либо часть указанногоRectangleF структура содержится внутри этогоRegion .

```csharp
public bool IsVisible(RectangleF rect)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rect | RectangleF | RectangleF структуру для тестирования. |

### Возвращаемое значение

верно, когда какая-либо часть*rect* содержится в этомRegion; в противном случае false.

### Смотрите также

* struct [RectangleF](../../rectanglef)
* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(float, float, float, float, Graphics) {#isvisible_5}

Проверяет, содержится ли какая-либо часть указанного прямоугольника в этомRegion при рисовании с использованием указанногоGraphics .

```csharp
public bool IsVisible(float x, float y, float width, float height, Graphics g)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | Single | Координата x левого верхнего угла прямоугольника для проверки. |
| y | Single | Y-координата левого верхнего угла прямоугольника для проверки. |
| width | Single | Ширина прямоугольника для проверки. |
| height | Single | Высота прямоугольника для проверки. |
| g | Graphics | АGraphics который представляет графический контекст. |

### Возвращаемое значение

истина, когда любая часть указанного прямоугольника содержится в этомRegion; в противном случае false.

### Смотрите также

* class [Graphics](../../graphics)
* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(RectangleF, Graphics) {#isvisible_14}

Проверяет, является ли какая-либо часть указанногоRectangleF структура содержится внутри этогоRegion при рисовании с использованием указанногоGraphics .

```csharp
public bool IsVisible(RectangleF rect, Graphics g)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rect | RectangleF | RectangleF структуру для тестирования. |
| g | Graphics | АGraphics который представляет графический контекст. |

### Возвращаемое значение

верно, когда*rect* содержится в этомRegion; в противном случае false.

### Смотрите также

* struct [RectangleF](../../rectanglef)
* class [Graphics](../../graphics)
* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(int, int, Graphics) {#isvisible_2}

Проверяет, содержится ли указанная точка в этомRegion объект при рисовании с помощью указанногоGraphics объект.

```csharp
public bool IsVisible(int x, int y, Graphics g)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | Int32 | X-координата точки для проверки. |
| y | Int32 | Y-координата точки для проверки. |
| g | Graphics | АGraphics который представляет графический контекст. |

### Возвращаемое значение

истина, когда указанная точка содержится в этомRegion; в противном случае ложно.

### Смотрите также

* class [Graphics](../../graphics)
* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(Point) {#isvisible_7}

Проверяет, указанныйPoint структура содержится в этомRegion .

```csharp
public bool IsVisible(Point point)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| point | Point | Point структуру для тестирования. |

### Возвращаемое значение

верно, когда*point* содержится в этомRegion; в противном случае ложно.

### Смотрите также

* struct [Point](../../point)
* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(Point, Graphics) {#isvisible_8}

Проверяет, указанныйPoint структура содержится в этомRegion при рисовании с использованием указанногоGraphics .

```csharp
public bool IsVisible(Point point, Graphics g)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| point | Point | Point структуру для тестирования. |
| g | Graphics | АGraphics который представляет графический контекст. |

### Возвращаемое значение

верно, когда*point* содержится в этомRegion; в противном случае ложно.

### Смотрите также

* struct [Point](../../point)
* class [Graphics](../../graphics)
* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(int, int, int, int) {#isvisible}

Проверяет, содержится ли какая-либо часть указанного прямоугольника в этомRegion .

```csharp
public bool IsVisible(int x, int y, int width, int height)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | Int32 | Координата x левого верхнего угла прямоугольника для проверки. |
| y | Int32 | Y-координата левого верхнего угла прямоугольника для проверки. |
| width | Int32 | Ширина прямоугольника для проверки. |
| height | Int32 | Высота прямоугольника для проверки. |

### Возвращаемое значение

истина, когда любая часть указанного прямоугольника содержится в этомRegion; в противном случае false.

### Смотрите также

* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(Rectangle) {#isvisible_11}

Проверяет, является ли какая-либо часть указанногоRectangle структура содержится внутри this Region .

```csharp
public bool IsVisible(Rectangle rect)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rect | Rectangle | Rectangle структуру для тестирования. |

### Возвращаемое значение

Этот метод возвращает true, когда любая часть*rect* содержится внутри этогоRegion; в противном случае ложно.

### Смотрите также

* struct [Rectangle](../../rectangle)
* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(int, int, int, int, Graphics) {#isvisible_1}

Проверяет, содержится ли какая-либо часть указанного прямоугольника в этомRegion когда нарисовано с использованием указанногоGraphics .

```csharp
public bool IsVisible(int x, int y, int width, int height, Graphics g)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | Int32 | Координата x левого верхнего угла прямоугольника для проверки. |
| y | Int32 | Y-координата левого верхнего угла прямоугольника для проверки. |
| width | Int32 | Ширина прямоугольника для проверки. |
| height | Int32 | Высота прямоугольника для проверки. |
| g | Graphics | АGraphics который представляет графический контекст. |

### Возвращаемое значение

истина, когда любая часть указанного прямоугольника содержится в этомRegion; в противном случае false.

### Смотрите также

* class [Graphics](../../graphics)
* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

---

## IsVisible(Rectangle, Graphics) {#isvisible_12}

Проверяет, является ли какая-либо часть указанногоRectangle структура содержится внутри этогоRegion при рисовании с использованием указанногоGraphics .

```csharp
public bool IsVisible(Rectangle rect, Graphics g)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rect | Rectangle | Rectangle структуру для тестирования. |
| g | Graphics | АGraphics который представляет графический контекст. |

### Возвращаемое значение

верно, когда какая-либо часть*rect* содержится внутри этогоRegion; в противном случае ложно.

### Смотрите также

* struct [Rectangle](../../rectangle)
* class [Graphics](../../graphics)
* class [Region](../../region)
* пространство имен [System.Drawing](../../region)
* сборка [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
