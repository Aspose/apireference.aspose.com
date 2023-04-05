---
title: PsDocument.FillAndStrokeText
second_title: Справочник по Aspose.Page для .NET API
description: PsDocument метод. Добавляет текстовую строку заполняя внутреннюю часть глифов и рисуя контуры глифов.
type: docs
weight: 110
url: /ru/net/aspose.page.eps/psdocument/fillandstroketext/
---
## FillAndStrokeText(string, Font, float, float, Brush, Brush, Pen) {#fillandstroketext_1}

Добавляет текстовую строку, заполняя внутреннюю часть глифов и рисуя контуры глифов.

```csharp
public void FillAndStrokeText(string text, Font font, float x, float y, Brush fillPaint, 
    Brush strokePaint, Pen stroke)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| text | String | Текст для добавления. |
| font | Font | Системный шрифт, который будет использоваться для рисования текста. |
| x | Single | Координата X для начала текста. |
| y | Single | Координата Y для начала текста. |
| fillPaint | Brush | Заливка, используемая для росписи глифов интерьера. |
| strokePaint | Brush | Brush используется для рисования контуров глифов. Может быть любым подклассомBrush класс на платформе .NET. |
| stroke | Pen | Штрих, используемый для рисования контуров глифов. |

### Смотрите также

* class [PsDocument](../)
* пространство имен [Aspose.Page.EPS](../../psdocument/)
* сборка [Aspose.Page](../../../)

---

## FillAndStrokeText(string, float[], Font, float, float, Brush, Brush, Pen) {#fillandstroketext}

Добавляет текстовую строку, заполняя внутреннюю часть глифов и рисуя контуры глифов.

```csharp
public void FillAndStrokeText(string text, float[] advances, Font font, float x, float y, 
    Brush fillPaint, Brush strokePaint, Pen stroke)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| text | String | Текст для добавления. |
| advances | Single[] | Массив ширины глифов. Его длина должна соответствовать количеству глифов в строке. |
| font | Font | Системный шрифт, который будет использоваться для рисования текста. |
| x | Single | Координата X для начала текста. |
| y | Single | Координата Y для начала текста. |
| fillPaint | Brush | Заливка, используемая для росписи глифов интерьера. |
| strokePaint | Brush | Brush используется для рисования контуров глифов. Может быть любым подклассомBrush класс на платформе .NET. |
| stroke | Pen | Штрих, используемый для рисования контуров глифов. |

### Смотрите также

* class [PsDocument](../)
* пространство имен [Aspose.Page.EPS](../../psdocument/)
* сборка [Aspose.Page](../../../)


