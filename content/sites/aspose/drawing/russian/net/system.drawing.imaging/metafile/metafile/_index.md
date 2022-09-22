---
title: Metafile
second_title: Справочник по API Aspose.Drawing для .NET
description: Инициализирует новый экземплярMetafilesystem.drawing.imaging/metafile класс из указанного дескриптора.
type: docs
weight: 10
url: /ru/net/system.drawing.imaging/metafile/metafile/
---
## Metafile(IntPtr, bool) {#constructor}

Инициализирует новый экземпляр[`Metafile`](../../metafile) класс из указанного дескриптора.

```csharp
public Metafile(IntPtr henhmetafile, bool deleteEmf)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| henhmetafile | IntPtr | Дескриптор расширенного метафайла. |
| deleteEmf | Boolean | Значение true, чтобы удалить дескриптор расширенного метафайла, когда Metafile удаляется; в противном случае ложно. |

### Смотрите также

* class [Metafile](../../metafile)
* пространство имен [System.Drawing.Imaging](../../metafile)
* сборка [Aspose.Drawing](../../../)

---

## Metafile(IntPtr, EmfType) {#constructor_1}

Инициализирует новый экземпляр[`Metafile`](../../metafile) класс из указанного дескриптора в контекст устройства иEmfTypeперечисление, определяющее форматMetafile .

```csharp
public Metafile(IntPtr referenceHdc, EmfType emfType)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| referenceHdc | IntPtr | Дескриптор контекста устройства. |
| emfType | EmfType | АнEmfType который определяет форматMetafile. |

### Смотрите также

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* пространство имен [System.Drawing.Imaging](../../metafile)
* сборка [Aspose.Drawing](../../../)

---

## Metafile(string) {#constructor_6}

Инициализирует новый экземпляр[`Metafile`](../../metafile) класс из указанного имени файла.

```csharp
public Metafile(string filename)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| filename | String | АString который представляет файл name , из которого создается новыйMetafile. |

### Смотрите также

* class [Metafile](../../metafile)
* пространство имен [System.Drawing.Imaging](../../metafile)
* сборка [Aspose.Drawing](../../../)

---

## Metafile(string, IntPtr) {#constructor_7}

Инициализирует новый экземпляр[`Metafile`](../../metafile) класс из указанного имени файла.

```csharp
public Metafile(string filename, IntPtr referenceHdc)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| filename | String | АString который представляет файл name , из которого создается новыйMetafile. |
| referenceHdc | IntPtr | Дескриптор Windows для контекста устройства. |

### Смотрите также

* class [Metafile](../../metafile)
* пространство имен [System.Drawing.Imaging](../../metafile)
* сборка [Aspose.Drawing](../../../)

---

## Metafile(Stream) {#constructor_2}

Инициализирует новый экземпляр[`Metafile`](../../metafile) класс из указанного потока данных.

```csharp
public Metafile(Stream stream)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | Stream | Stream из которого создать новыйMetafile. |

### Смотрите также

* class [Metafile](../../metafile)
* пространство имен [System.Drawing.Imaging](../../metafile)
* сборка [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr) {#constructor_3}

Инициализирует новый экземпляр[`Metafile`](../../metafile) class из потока данных selected и дескриптор Windows в контекст устройства. /&gt;.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | Stream | АStream который содержит данные for thisMetafile. |
| referenceHdc | IntPtr | Дескриптор Windows для контекста устройстваMetafile объект. |

### Смотрите также

* class [Metafile](../../metafile)
* пространство имен [System.Drawing.Imaging](../../metafile)
* сборка [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, EmfType) {#constructor_4}

Инициализирует новый экземпляр[`Metafile`](../../metafile) класс из потока данных selected , дескриптор Windows для контекста устройства иEmfType enumeration , указывающий форматMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, EmfType type)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | Stream | АStream который содержит данные for thisMetafile. |
| referenceHdc | IntPtr | Дескриптор Windows для контекста устройства. |
| type | EmfType | АнEmfType который указывает формат дляMetafile. |

### Смотрите также

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* пространство имен [System.Drawing.Imaging](../../metafile)
* сборка [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) {#constructor_5}

Инициализирует новый экземпляр[`Metafile`](../../metafile) класс из потока данных selected , дескриптор Windows для контекста устройства иEmfType enumeration , указывающий форматMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, RectangleF frameRect, 
    MetafileFrameUnit frameUnit, EmfType type)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | Stream | АStream который содержит данные for thisMetafile. |
| referenceHdc | IntPtr | Дескриптор Windows для контекста устройства. |
| frameRect | RectangleF | АRectangle который представляет собой прямоугольник, ограничивающий новыйMetafile . |
| frameUnit | MetafileFrameUnit | АMetafileFrameUnit который указывает единицу измерения для frameRect. |
| type | EmfType | АнEmfType который указывает формат дляMetafile. |

### Смотрите также

* struct [RectangleF](../../../system.drawing/rectanglef)
* enum [MetafileFrameUnit](../../metafileframeunit)
* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* пространство имен [System.Drawing.Imaging](../../metafile)
* сборка [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
