---
title: MeasureString
second_title: Справочник по API Aspose.Drawing для .NET
description: Измеряет указанную строку при рисовании с указаннымFont .
type: docs
weight: 620
url: /ru/net/system.drawing/graphics/measurestring/
---
## MeasureString(string, Font) {#measurestring}

Измеряет указанную строку при рисовании с указаннымFont .

```csharp
public SizeF MeasureString(string text, Font font)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| text | String | Строка для измерения. |
| font | Font | Font который определяет текстовый формат строки. |

### Возвращаемое значение

Этот метод возвращаетSizeF структура, которая представляет размер, в единицах, указанныхPageUnit свойство строки, указанной ,*text* параметр, как показано с помощью*font* параметр.

### Смотрите также

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF) {#measurestring_4}

Измеряет указанную строку при рисовании с указаннымFont .

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| text | String | Строка для измерения. |
| font | Font | Font который определяет текстовый формат строки. |
| layoutArea | SizeF | SizeF структура, определяющая максимальную область макета для текста. |

### Возвращаемое значение

Этот метод возвращаетSizeF структура, которая представляет размер, в единицах, указанныхPageUnit свойство строки, указанной ,*text* параметр, как показано с помощью*font* параметр.

### Смотрите также

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, int) {#measurestring_1}

Измеряет указанную строку при рисовании с указаннымFont .

```csharp
public SizeF MeasureString(string text, Font font, int width)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| text | String | Строка для измерения. |
| font | Font | Font который определяет текстовый формат строки. |
| width | Int32 | Максимальная ширина строки в пикселях. |

### Возвращаемое значение

Этот метод возвращаетSizeF структура, которая представляет размер, в единицах, указанныхPageUnit свойство строки, указанной ,*text* параметр, как показано с помощью*font* параметр.

### Смотрите также

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, PointF, StringFormat) {#measurestring_3}

Измеряет указанную строку при рисовании с указаннымFont и formatted с указаннымStringFormat .

```csharp
public SizeF MeasureString(string text, Font font, PointF origin, StringFormat stringFormat)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| text | String | Строка для измерения. |
| font | Font | Fontопределяет текстовый формат строки. |
| origin | PointF | PointF структура, представляющая верхний левый угол строки. |
| stringFormat | StringFormat | StringFormat который представляет информацию о форматировании, такую как межстрочный интервал, для строки. |

### Возвращаемое значение

Этот метод возвращаетSizeF структура, которая представляет размер, в единицах, указанныхPageUnit свойство строки, указанной ,*text* параметр, как показано с помощью*font* параметр и*stringFormat* параметр.

### Смотрите также

* struct [SizeF](../../sizef)
* class [Font](../../font)
* struct [PointF](../../pointf)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, int, StringFormat) {#measurestring_2}

Измеряет указанную строку при рисовании с указаннымFont и formatted с указаннымStringFormat .

```csharp
public SizeF MeasureString(string text, Font font, int width, StringFormat format)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| text | String | Строка для измерения. |
| font | Font | Font который определяет текстовый формат строки. |
| width | Int32 | Максимальная ширина строки. |
| format | StringFormat | StringFormat который представляет информацию о форматировании, , такую как межстрочный интервал, для строки. |

### Возвращаемое значение

Этот метод возвращаетSizeF структура, которая представляет размер, в единицах, указанныхPageUnit свойство, строки, указанной в*text* параметр, как показано с помощью*font* параметр и*format* параметр.

### Смотрите также

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF, StringFormat) {#measurestring_5}

Измеряет указанную строку при рисовании с указаннымFont и formatted с указаннымStringFormat .

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea, StringFormat stringFormat)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| text | String | Строка для измерения. |
| font | Font | Fontопределяет текстовый формат строки. |
| layoutArea | SizeF | SizeF структура, определяющая максимальную область макета для текста. |
| stringFormat | StringFormat | StringFormat который представляет информацию о форматировании, , такую как межстрочный интервал, для строки. |

### Возвращаемое значение

Этот метод возвращаетSizeF структура, которая представляет размер, в единицах, указанныхPageUnit свойство, строки, указанной в*text* параметр, как показано с помощью*font* параметр и*stringFormat* параметр.

### Смотрите также

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF, StringFormat, out int, out int) {#measurestring_6}

Измеряет указанную строку при рисовании с указаннымFont и formatted с указаннымStringFormat .

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea, StringFormat stringFormat, 
    out int charactersFitted, out int linesFilled)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| text | String | Строка для измерения. |
| font | Font | Fontопределяет текстовый формат строки. |
| layoutArea | SizeF | SizeF структура, определяющая максимальную область макета для текста. |
| stringFormat | StringFormat | StringFormat который представляет информацию о форматировании, , такую как межстрочный интервал, для строки. |
| charactersFitted | Int32& | Количество символов в строке. |
| linesFilled | Int32& | Количество строк текста в строке. |

### Возвращаемое значение

Этот метод возвращаетSizeF структура, которая представляет размер, в единицах, указанныхPageUnit свойство, строки, указанной в*text* параметр, как показано с помощью*font* параметр и*stringFormat* параметр.

### Смотрите также

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* пространство имен [System.Drawing](../../graphics)
* сборка [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
