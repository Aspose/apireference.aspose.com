---
title: Column
second_title: Справочник по Aspose.Cells для .NET API
description: Представляет один столбец на листе.
type: docs
weight: 1060
url: /ru/net/aspose.cells/column/
---
## Column class

Представляет один столбец на листе.

```csharp
public class Column
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [GroupLevel](../../aspose.cells/column/grouplevel) { get; } | Получает уровень группы столбца. |
| [Index](../../aspose.cells/column/index) { get; } | Получает индекс этого столбца. |
| [IsCollapsed](../../aspose.cells/column/iscollapsed) { get; set; } | свернута ли колонка |
| [IsHidden](../../aspose.cells/column/ishidden) { get; set; } | Указывает, скрыт ли столбец. |
| [Style](../../aspose.cells/column/style) { get; } | Получает стиль этого столбца. |
| [Width](../../aspose.cells/column/width) { get; set; } | Получает и задает ширину столбца в символах. |

## Методы

| Имя | Описание |
| --- | --- |
| [ApplyStyle](../../aspose.cells/column/applystyle)(Style, StyleFlag) | Применяет форматы ко всему столбцу. |

### Примеры

```csharp

[C#]

//Создание экземпляра объекта Workbook
Workbook workbook = new Workbook();

//Получение ссылки на первый рабочий лист
Worksheet worksheet = workbook.Worksheets[0];
Style style = workbook.CreateStyle();

//Установка цвета фона на синий
style.BackgroundColor = Color.Blue;

//Установка цвета переднего плана на красный
style.ForegroundColor= Color.Red;

//установка фонового рисунка
style.Pattern = BackgroundType.DiagonalStripe;

//Флаг нового стиля
StyleFlag styleFlag = new StyleFlag();

//Установить все стили
styleFlag.All = true;

//Получить первый столбец
Column column = worksheet.Cells.Columns[0];

//Применяем стиль к первому столбцу
column.ApplyStyle(style, styleFlag);

//Сохранение файла Excel
workbook.Save("book1.xls");

[VB.NET]

'Создание экземпляра объекта Workbook
Dim workbook As Workbook = New Workbook()

'Получение ссылки на первый рабочий лист
Dim worksheet As Worksheet = workbook.Worksheets(0)

Dim style As Style = workbook.CreateStyle()

'Установка цвета фона на синий
style.BackgroundColor = Color.Blue

'Установка цвета переднего плана на красный
style.ForegroundColor = Color.Red

'настройка фонового рисунка
style.Pattern = BackgroundType.DiagonalStripe

'Флаг нового стиля
Dim styleFlag As New StyleFlag()

'Установить все стили
styleFlag.All = True

'Получить первую колонку
Dim column As Column = worksheet.Cells.Columns(0)

'Применить стиль к первому столбцу
column.ApplyStyle(style, styleFlag)

'Сохранение файла Excel
workbook.Save("book1.xls")
```

### Смотрите также

* пространство имен [Aspose.Cells](../../aspose.cells)
* сборка [Aspose.Cells](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
