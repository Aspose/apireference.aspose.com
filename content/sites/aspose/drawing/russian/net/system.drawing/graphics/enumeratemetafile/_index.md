---
title: EnumerateMetafile
second_title: Справочник по API Aspose.Drawing для .NET
description: Отправляет записи в указанномMetafilesystem.drawing.imaging/metafile  по одному в метод обратного вызова method для отображения в указанной точке с использованием указанных атрибутов изображения.
type: docs
weight: 460
url: /ru/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

Отправляет записи в указанном[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова method для отображения в указанной точке с использованием указанных атрибутов изображения.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoint | PointF | [`PointF`](../../pointf) структура, указывающая расположение верхнего левого угла нарисованного метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) который определяет информацию об атрибутах изображения для нарисованного изображения. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

Отправляет записи в указанном[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoint | PointF | [`PointF`](../../pointf) структура, указывающая расположение верхнего левого угла нарисованного метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

Отправляет записи в указанном[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoints | PointF[] | Массив из трех[`PointF`](../../pointf) структуры, определяющие параллелограмм, определяющий размер и расположение отрисовываемого метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

Отправляет записи в указанном[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoint | Point | [`Point`](../../point) структура, указывающая расположение верхнего левого угла нарисованного метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

Отправляет записи в указанном[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoint | Point | [`Point`](../../point) структура, указывающая расположение верхнего левого угла нарисованного метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

Отправляет записи в указанном[`Metafile`](../../../system.drawing.imaging/metafile) по одному, в метод обратного вызова для отображения в указанной точке с использованием указанных атрибутов изображения.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoint | Point | [`Point`](../../point) структура, указывающая расположение верхнего левого угла нарисованного метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) который определяет информацию об атрибутах изображения для нарисованного изображения. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

Отправляет записи указанного[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая расположение и размер отрисовываемого метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

Отправляет записи указанного[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая расположение и размер отрисовываемого метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

Отправляет записи указанного[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике с использованием указанных атрибутов изображения.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая расположение и размер отрисовываемого метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) который определяет информацию об атрибутах изображения для нарисованного изображения. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

Отправляет записи указанного[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая расположение и размер отрисовываемого метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

Отправляет записи в указанном[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoint | PointF | [`PointF`](../../pointf) структура, указывающая расположение верхнего левого угла нарисованного метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

Отправляет записи в указанном[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoints | PointF[] | Массив из трех[`PointF`](../../pointf) структуры, определяющие параллелограмм, определяющий размер и расположение отрисовываемого метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

Отправляет записи в указанном[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoints | Point[] | Массив из трех[`Point`](../../point) структуры, определяющие параллелограмм, определяющий размер и расположение отрисовываемого метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

Отправляет записи в указанном[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoints | Point[] | Массив из трех[`Point`](../../point) структуры, определяющие параллелограмм, определяющий размер и расположение отрисовываемого метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме с использованием указанных атрибутов изображения.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoints | Point[] | Массив из трех[`Point`](../../point) структуры, определяющие параллелограмм, определяющий размер и расположение отрисовываемого метафайла. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| unit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) который определяет информацию об атрибутах изображения для нарисованного изображения. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoints | Point[] | Массив из трех[`Point`](../../point) структуры, определяющие параллелограмм, определяющий размер и расположение отрисовываемого метафайла. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| srcUnit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoints | Point[] | Массив из трех[`Point`](../../point) структуры, определяющие параллелограмм, определяющий размер и расположение отрисовываемого метафайла. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| srcUnit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме с использованием указанных атрибутов изображения.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoints | PointF[] | Массив из трех[`PointF`](../../pointf) структуры, определяющие параллелограмм, определяющий размер и расположение отрисовываемого метафайла. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| unit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) который определяет информацию об атрибутах изображения для нарисованного изображения. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoints | PointF[] | Массив из трех[`PointF`](../../pointf) структуры, определяющие параллелограмм, определяющий размер и расположение отрисовываемого метафайла. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| srcUnit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

Отправляет записи в выбранном прямоугольнике из S[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoints | PointF[] | Массив из трех[`PointF`](../../pointf) структуры, определяющие параллелограмм, определяющий размер и расположение отрисовываемого метафайла. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| srcUnit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

Отправляет записи выбранного прямоугольника из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике с использованием указанных атрибутов изображения.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая расположение и размер отрисовываемого метафайла. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| unit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) который определяет информацию об атрибутах изображения для нарисованного изображения. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

Отправляет записи выбранного прямоугольника из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая расположение и размер отрисовываемого метафайла. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| srcUnit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

Отправляет записи выбранного прямоугольника из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая расположение и размер отрисовываемого метафайла. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| srcUnit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

Отправляет записи в указанном[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме с использованием указанных атрибутов изображения.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoints | PointF[] | Массив из трех[`PointF`](../../pointf) структуры, определяющие параллелограмм, определяющий размер и расположение отрисовываемого метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) который определяет информацию об атрибутах изображения для нарисованного изображения. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

Отправляет записи выбранного прямоугольника из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике с использованием указанных атрибутов изображения.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая расположение и размер отрисовываемого метафайла. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| unit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) который определяет информацию об атрибутах изображения для нарисованного изображения. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

Отправляет записи выбранного прямоугольника из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая расположение и размер отрисовываемого метафайла. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| srcUnit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../../system.drawing.imaging/metafile) по одному, в метод обратного вызова для отображения в указанной точке с использованием указанных атрибутов изображения.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoint | Point | [`Point`](../../point) структура, указывающая расположение верхнего левого угла нарисованного метафайла. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| unit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) который определяет информацию об атрибутах изображения для нарисованного изображения. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoint | Point | [`Point`](../../point) структура, указывающая расположение верхнего левого угла нарисованного метафайла. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| srcUnit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoint | Point | [`Point`](../../point) структура, указывающая расположение верхнего левого угла нарисованного метафайла. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| srcUnit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

Отправляет записи указанного[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destRect | Rectangle | [`RectangleF`](../../rectanglef) структура, указывающая расположение и размер отрисовываемого метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../../system.drawing.imaging/metafile) по одному, в метод обратного вызова для отображения в указанной точке с использованием указанных атрибутов изображения.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoint | PointF | [`PointF`](../../pointf) структура, указывающая расположение верхнего левого угла нарисованного метафайла. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| unit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) который определяет информацию об атрибутах изображения для нарисованного изображения. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoint | PointF | [`PointF`](../../pointf) структура, указывающая расположение верхнего левого угла нарисованного метафайла. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| srcUnit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

Отправляет записи в выбранном прямоугольнике из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанной точке.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoint | PointF | [`PointF`](../../pointf) структура, указывающая расположение верхнего левого угла нарисованного метафайла. |
| srcRect | RectangleF | Структура System.Drawing.RectangleF, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| srcUnit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

Отправляет записи в указанном[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном параллелограмме с использованием указанных атрибутов изображения.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destPoints | Point[] | Массив из трех[`Point`](../../point) структуры, определяющие параллелограмм, определяющий размер и расположение отрисовываемого метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) который определяет информацию об атрибутах изображения для нарисованного изображения. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

Отправляет записи выбранного прямоугольника из[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая расположение и размер отрисовываемого метафайла. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) структура, указывающая часть метафайла относительно его левого верхнего угла для рисования. |
| srcUnit | GraphicsUnit | Член[`GraphicsUnit`](../../graphicsunit) перечисление, указывающее единицу измерения, используемую для определения части метафайла, которую прямоугольник, заданный*srcRect* параметр содержит. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

Отправляет записи указанного[`Metafile`](../../../system.drawing.imaging/metafile) , по одному, в метод обратного вызова для отображения в указанном прямоугольнике с использованием указанных атрибутов изображения.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) перечислить. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) структура, указывающая расположение и размер отрисовываемого метафайла. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) делегат, указывающий метод, которому отправляются записи метафайла. |
| callbackData | IntPtr | Внутренний указатель, который требуется, но игнорируется. Вы можете пройтиZero для этого параметра. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) который определяет информацию об атрибутах изображения для нарисованного изображения. |

### Смотрите также

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
