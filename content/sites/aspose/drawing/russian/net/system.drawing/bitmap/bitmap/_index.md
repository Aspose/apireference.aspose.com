---
title: Bitmap
second_title: Справочник по API Aspose.Drawing для .NET
description: Инициализирует новый экземплярBitmapsystem.drawing/bitmap класс с указанным размером.
type: docs
weight: 10
url: /ru/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

Инициализирует новый экземпляр[`Bitmap`](../../bitmap) класс с указанным размером.

```csharp
public Bitmap(int width, int height)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| width | Int32 | Ширина нового растрового изображения в пикселях. |
| height | Int32 | Высота нового растрового изображения в пикселях. |

### Примечания

Единственный поддерживаемый внутренний растровый формат на данный момент эквивалентен`PixelFormat.Format32bppPArgb` .

### Смотрите также

* class [Bitmap](../../bitmap)
* пространство имен [System.Drawing](../../bitmap)
* сборка [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

Инициализирует новый экземпляр[`Bitmap`](../../bitmap) класс из указанного файла.

```csharp
public Bitmap(string filename)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| filename | String | Имя файла растрового изображения. |

### Смотрите также

* class [Bitmap](../../bitmap)
* пространство имен [System.Drawing](../../bitmap)
* сборка [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

Инициализирует новый экземпляр[`Bitmap`](../../bitmap) класс из указанного файла.

```csharp
public Bitmap(string filename, bool useIcm)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| filename | String | Имя файла растрового изображения. |
| useIcm | Boolean | true, чтобы использовать коррекцию цвета для этогоBitmap; в противном случае ложно. |

### Смотрите также

* class [Bitmap](../../bitmap)
* пространство имен [System.Drawing](../../bitmap)
* сборка [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

Инициализирует новый экземпляр[`Bitmap`](../../bitmap) класс из указанного потока данных.

```csharp
public Bitmap(Stream stream)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | Stream | Поток данных, используемый для загрузки изображения. |

### Смотрите также

* class [Bitmap](../../bitmap)
* пространство имен [System.Drawing](../../bitmap)
* сборка [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

Инициализирует новый экземпляр[`Bitmap`](../../bitmap) класс из указанного потока данных.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | Stream | Поток данных, используемый для загрузки изображения. |
| useIcm | Boolean | `истинный` использовать цветокоррекцию для этогоBitmap ; в противном случае,`ЛОЖЬ`. |

### Смотрите также

* class [Bitmap](../../bitmap)
* пространство имен [System.Drawing](../../bitmap)
* сборка [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

Инициализирует новый экземпляр[`Bitmap`](../../bitmap) класс с указанным размером и форматом.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| width | Int32 | Ширина в пикселях новогоBitmap. |
| height | Int32 | Высота в пикселях новогоBitmap. |
| format | PixelFormat | PixelFormat перечисление для новогоBitmap. |

### Смотрите также

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* пространство имен [System.Drawing](../../bitmap)
* сборка [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

Инициализирует новый экземпляр[`Bitmap`](../../bitmap) класс с указанным размером и данными в пикселях.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| width | Int32 | Ширина в пикселях новогоBitmap. |
| height | Int32 | Высота в пикселях новогоBitmap. |
| stride | Int32 | Смещение в байтах между началом одной строки развертки и следующей должно быть кратно четырем. |
| format | PixelFormat | PixelFormat перечисление для новогоBitmap. |
| data | Int32[] | Пиксельные данные. |

### Смотрите также

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* пространство имен [System.Drawing](../../bitmap)
* сборка [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

Инициализирует новый экземпляр[`Bitmap`](../../bitmap) класс из указанного существующего образа.

```csharp
public Bitmap(Image original)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| original | Image | Image из которого создать новыйBitmap. |

### Смотрите также

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* пространство имен [System.Drawing](../../bitmap)
* сборка [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

Инициализирует новый экземпляр[`Bitmap`](../../bitmap)класс из указанного существующего изображения, масштабированного до указанного размера.

```csharp
public Bitmap(Image original, Size newSize)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| original | Image | Image из которого создать новыйBitmap |
| newSize | Size | Size структуры, которые представляют размер новогоBitmap. |

### Смотрите также

* class [Image](../../image)
* struct [Size](../../size)
* class [Bitmap](../../bitmap)
* пространство имен [System.Drawing](../../bitmap)
* сборка [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

Инициализирует новый экземпляр[`Bitmap`](../../bitmap) класс из указанного существующего изображения, масштабируется до указанного размера.

```csharp
public Bitmap(Image original, int width, int height)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| original | Image | Image из которого создать новыйBitmap. |
| width | Int32 | Ширина в пикселях новогоBitmap. |
| height | Int32 | Высота в пикселях новогоBitmap. |

### Смотрите также

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* пространство имен [System.Drawing](../../bitmap)
* сборка [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
