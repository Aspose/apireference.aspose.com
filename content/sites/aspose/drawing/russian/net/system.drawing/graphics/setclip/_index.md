---
title: SetClip
second_title: Справочник по API Aspose.Drawing для .NET
description: Устанавливает область отсечения этогоGraphicssystem.drawing/graphics к свойству Clip указанногоGraphicssystem.drawing/graphics
type: docs
weight: 710
url: /ru/net/system.drawing/graphics/setclip/
---
## SetClip(Graphics) {#setclip_2}

Устанавливает область отсечения этого[`Graphics`](../../graphics) к свойству Clip указанного[`Graphics`](../../graphics)

```csharp
public void SetClip(Graphics g)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| g | Graphics | [`Graphics`](../../graphics) - для источника свойства Clip. |

### Смотрите также

* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## SetClip(Graphics, CombineMode) {#setclip_3}

Устанавливает область отсечения этого[`Graphics`](../../graphics) к результату указанной операции объединения текущей области клипа и свойства Clip указанного[`Graphics`](../../graphics) .

```csharp
public void SetClip(Graphics g, CombineMode combineMode)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| g | Graphics | [`Graphics`](../../graphics) который указывает область клипа для объединения. |
| combineMode | CombineMode | Член[`CombineMode`](../../../system.drawing.drawing2d/combinemode) перечисление, указывающее используемую операцию объединения. |

### Смотрите также

* enum [CombineMode](../../../system.drawing.drawing2d/combinemode)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## SetClip(Rectangle) {#setclip_4}

Устанавливает область отсечения этого[`Graphics`](../../graphics) к результату указанной операции, объединяющей текущую область отсечения и прямоугольник, указанный[`Rectangle`](../../rectangle) структура.

```csharp
public void SetClip(Rectangle rect)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rect | Rectangle | [`Rectangle`](../../rectangle) структуру для объединения. |

### Смотрите также

* struct [Rectangle](../../rectangle)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## SetClip(Rectangle, CombineMode) {#setclip_5}

Устанавливает область отсечения этого[`Graphics`](../../graphics) к результату указанной операции, объединяющей текущую область отсечения и прямоугольник, указанный[`Rectangle`](../../rectangle) структура.

```csharp
public void SetClip(Rectangle rect, CombineMode combineMode)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rect | Rectangle | [`Rectangle`](../../rectangle) структуру для объединения. |
| combineMode | CombineMode | Член[`CombineMode`](../../../system.drawing.drawing2d/combinemode) перечисление, указывающее используемую операцию объединения. |

### Смотрите также

* struct [Rectangle](../../rectangle)
* enum [CombineMode](../../../system.drawing.drawing2d/combinemode)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## SetClip(RectangleF) {#setclip_6}

Устанавливает область отсечения этого[`Graphics`](../../graphics) к результату указанной операции, объединяющей текущую область отсечения и прямоугольник, указанный[`RectangleF`](../../rectanglef) структура.

```csharp
public void SetClip(RectangleF rect)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rect | RectangleF | [`RectangleF`](../../rectanglef) структуру для объединения. |

### Смотрите также

* struct [RectangleF](../../rectanglef)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## SetClip(RectangleF, CombineMode) {#setclip_7}

Устанавливает область отсечения этого[`Graphics`](../../graphics) к результату указанной операции, объединяющей текущую область отсечения и прямоугольник, указанный[`RectangleF`](../../rectanglef) структура.

```csharp
public void SetClip(RectangleF rect, CombineMode combineMode)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rect | RectangleF | [`Rectangle`](../../rectangle) структуру для объединения. |
| combineMode | CombineMode | Комбинированный режим. |

### Смотрите также

* struct [RectangleF](../../rectanglef)
* enum [CombineMode](../../../system.drawing.drawing2d/combinemode)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## SetClip(GraphicsPath) {#setclip}

Устанавливает область отсечения этого[`Graphics`](../../graphics) к указанному[`GraphicsPath`](../../../system.drawing.drawing2d/graphicspath) .

```csharp
public void SetClip(GraphicsPath path)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | GraphicsPath | [`GraphicsPath`](../../../system.drawing.drawing2d/graphicspath) который представляет новую область клипа. |

### Смотрите также

* class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## SetClip(GraphicsPath, CombineMode) {#setclip_1}

Устанавливает область отсечения этого[`Graphics`](../../graphics) к результату указанной операции, объединяющей текущий регион клипа и указанный[`GraphicsPath`](../../../system.drawing.drawing2d/graphicspath) .

```csharp
public void SetClip(GraphicsPath path, CombineMode combineMode)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | GraphicsPath | [`GraphicsPath`](../../../system.drawing.drawing2d/graphicspath) комбинировать.. |
| combineMode | CombineMode | Член[`CombineMode`](../../../system.drawing.drawing2d/combinemode) перечисление, указывающее операцию объединения для использования. |

### Смотрите также

* class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath)
* enum [CombineMode](../../../system.drawing.drawing2d/combinemode)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## SetClip(Region, CombineMode) {#setclip_8}

Устанавливает область отсечения этогоGraphicsк результату указанной операции, объединяющей текущую область клипа и указанныйRegion .

```csharp
public void SetClip(Region region, CombineMode combineMode)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| region | Region | Region комбинировать. |
| combineMode | CombineMode | Член изCombineMode перечисление, указывающее используемую операцию объединения. |

### Смотрите также

* class [Region](../../region)
* enum [CombineMode](../../../system.drawing.drawing2d/combinemode)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
