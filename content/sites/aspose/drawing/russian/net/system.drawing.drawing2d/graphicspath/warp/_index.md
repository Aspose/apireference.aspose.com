---
title: Warp
second_title: Справочник по API Aspose.Drawing для .NET
description: Применяет преобразование деформации заданное прямоугольником и параллелограммом к этомуGraphicsPathsystem.drawing.drawing2d/graphicspath .
type: docs
weight: 350
url: /ru/net/system.drawing.drawing2d/graphicspath/warp/
---
## Warp(PointF[], RectangleF) {#warp}

Применяет преобразование деформации, заданное прямоугольником и параллелограммом, к этому[`GraphicsPath`](../../graphicspath) .

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| destPoints | PointF[] | МассивPointF структуры, которые определяют параллелограмм, к которому прямоугольник, заданный*srcRect* трансформируется. Массив может содержать три или четыре элемента. Если массив содержит три элемента, нижний правый угол параллелограмма подразумевается первыми тремя точками. |
| srcRect | RectangleF | АRectangleF который представляет прямоугольник, который преобразуется в параллелограмм, определяемый формулой*destPoints* . |

### Смотрите также

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [GraphicsPath](../../graphicspath)
* пространство имен [System.Drawing.Drawing2D](../../graphicspath)
* сборка [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix) {#warp_1}

Применяет преобразование деформации, заданное прямоугольником и параллелограммом, к этому[`GraphicsPath`](../../graphicspath).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| destPoints | PointF[] | МассивPointF структуры, которые определяют параллелограмм, к которому прямоугольник, заданный*srcRect* трансформируется. Массив может содержать три или четыре элемента. Если массив содержит три элемента, нижний правый угол параллелограмма подразумевается первыми тремя точками. |
| srcRect | RectangleF | АRectangleF который представляет прямоугольник, который преобразуется в параллелограмм, определяемый формулой*destPoints* . |
| matrix | Matrix | А[`Matrix`](../../matrix) который определяет геометрическое преобразование, применяемое к пути. |

### Смотрите также

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [Matrix](../../matrix)
* class [GraphicsPath](../../graphicspath)
* пространство имен [System.Drawing.Drawing2D](../../graphicspath)
* сборка [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode) {#warp_2}

Применяет преобразование деформации, заданное прямоугольником и параллелограммом, к этому[`GraphicsPath`](../../graphicspath).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| destPoints | PointF[] | МассивPointF структуры, определяющие параллелограмм, к которому прямоугольник, заданный*srcRect* трансформируется. Массив может содержать три или четыре элемента. Если массив содержит три элемента, правый нижний угол параллелограмма подразумевается первыми тремя точками. |
| srcRect | RectangleF | АRectangleF который представляет прямоугольник, который преобразуется в параллелограмм, определяемый формулой*destPoints* . |
| matrix | Matrix | А[`Matrix`](../../matrix) который определяет геометрическое преобразование, применяемое к пути. |
| warpMode | WarpMode | А[`WarpMode`](../../warpmode) перечисление, указывающее, использует ли эта операция деформации перспективный или билинейный режим. |

### Смотрите также

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [Matrix](../../matrix)
* enum [WarpMode](../../warpmode)
* class [GraphicsPath](../../graphicspath)
* пространство имен [System.Drawing.Drawing2D](../../graphicspath)
* сборка [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode, float) {#warp_3}

Применяет преобразование деформации, заданное прямоугольником и параллелограммом, к этому[`GraphicsPath`](../../graphicspath).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode, 
    float flatness)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| destPoints | PointF[] | МассивPointF структуры, которые определяют параллелограмм, к которому прямоугольник, заданный*srcRect* трансформируется. Массив может содержать три или четыре элемента. Если массив содержит три элемента, правый нижний угол параллелограмма подразумевается первыми тремя точками. |
| srcRect | RectangleF | АRectangleF который представляет прямоугольник, который преобразуется в параллелограмм, определяемый формулой*destPoints* . |
| matrix | Matrix | А[`Matrix`](../../matrix) который определяет геометрическое преобразование, применяемое к пути. |
| warpMode | WarpMode | А[`WarpMode`](../../warpmode) перечисление, указывающее, использует ли эта операция деформации перспективный или билинейный режим. |
| flatness | Single | Значение от 0 до 1, указывающее, насколько плоским будет результирующий путь. Для получения дополнительной информации см.[`Flatten`](../flatten) методы. |

### Смотрите также

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [Matrix](../../matrix)
* enum [WarpMode](../../warpmode)
* class [GraphicsPath](../../graphicspath)
* пространство имен [System.Drawing.Drawing2D](../../graphicspath)
* сборка [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
