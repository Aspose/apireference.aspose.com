---
title: Выравнивание текста для содержимого строки таблицы
linktitle: Выравнивание текста для содержимого строки таблицы
second_title: Aspose.PDF для справочника API .NET
description: Узнайте, как выровнять содержимое строк в таблице PDF с помощью Aspose.PDF для .NET.
type: docs
weight: 210
url: /ru/net/programming-with-tables/text-alignment-for-table-row-content/
---
В этом руководстве мы шаг за шагом проведем вас по выравниванию содержимого строки в таблице документа PDF с помощью Aspose.PDF для .NET. Мы объясним предоставленный исходный код C# и покажем, как его реализовать.

## Шаг 1: Создание PDF-документа
Сначала мы создадим PDF-документ:

```csharp
var dataDir = "YOUR DOCUMENTS DIRECTORY";
Aspose.Pdf.Document doc = new Aspose.Pdf.Document();
```

## Шаг 2: Инициализация таблицы
Далее инициализируем таблицу:

```csharp
Aspose.Pdf.Table table = new Aspose.Pdf.Table();
```

## Шаг 3: Установка цвета границы таблицы
Настроим цвет границы таблицы:

```csharp
table.Border = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, .5f, Aspose.Pdf.Color.FromRgb(System.Drawing.Color.LightGray));
```

## Шаг 4: Настройка границы ячейки таблицы
Настроим границу ячейки таблицы:

```csharp
table.DefaultCellBorder = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, .5f, Aspose.Pdf.Color.FromRgb(System.Drawing.Color.LightGray));
```

## Шаг 5: Цикл, чтобы добавить 10 строк в таблицу
Теперь мы будем использовать цикл, чтобы добавить 10 строк в таблицу:

```csharp
for (int row_count = 0; row_count < 10; row_count++)
{
     Aspose.Pdf.Row row = table.Rows.Add();
     row.VerticalAlignment = VerticalAlignment.Center;

     row.Cells.Add("Column("+row_count+",1)"+DateTime.Now.Ticks);
     row.Cells.Add("Column("+row_count+",2)");
     row.Cells.Add("Column("+row_count+",3)");
}
```

## Шаг 6: Настройка выравнивания по вертикали
Настроим вертикальное выравнивание строк таблицы:

```csharp
row.VerticalAlignment = VerticalAlignment.Center;
```

## Шаг 7. Добавление содержимого в ячейки строк
Мы собираемся добавить содержимое в ячейки строки:

```csharp
row.Cells.Add("Column("+row_count+",1)"+DateTime.Now.Ticks);
row.Cells.Add("Column("+row_count+",2)");
row.Cells.Add("Column("+row_count+",3)");
```

## Шаг 8: Добавление таблицы на страницу документа
Теперь добавим таблицу на страницу документа:

```csharp
Page tocPage = doc.Pages.Add();
tocPage.Paragraphs.Add(table);
```

## Шаг 9: Сохранение PDF-документа
Наконец, мы сохраним документ PDF:

```csharp
doc.Save(dataDir + "43620_ByWords_out.pdf");
```

### Пример исходного кода для выравнивания текста для содержимого строки таблицы с использованием Aspose.PDF для .NET

```csharp
var dataDir = "YOUR DOCUMENT DIRECTORY";

// Создать PDF-документ
Aspose.Pdf.Document doc = new Aspose.Pdf.Document();
// Инициализирует новый экземпляр таблицы
Aspose.Pdf.Table table = new Aspose.Pdf.Table();
// Установите цвет границы таблицы как LightGray
table.Border = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, .5f, Aspose.Pdf.Color.FromRgb(System.Drawing.Color.LightGray));
// установить границу для ячеек таблицы
table.DefaultCellBorder = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, .5f, Aspose.Pdf.Color.FromRgb(System.Drawing.Color.LightGray));
// создать цикл для добавления 10 строк
for (int row_count = 0; row_count < 10; row_count++)
{
	// добавить строку в таблицу
	Aspose.Pdf.Row row = table.Rows.Add();
	row.VerticalAlignment = VerticalAlignment.Center;

	row.Cells.Add("Column (" + row_count + ", 1)" + DateTime.Now.Ticks);
	row.Cells.Add("Column (" + row_count + ", 2)");
	row.Cells.Add("Column (" + row_count + ", 3)");
}
Page tocPage = doc.Pages.Add();
// Добавить табличный объект на первую страницу входного документа
tocPage.Paragraphs.Add(table);
// Сохранить обновленный документ, содержащий табличный объект
doc.Save(dataDir + "43620_ByWords_out.pdf");
```

## Заключение
Поздравляем! Теперь вы узнали, как выровнять содержимое строки в таблице в документе PDF с помощью Aspose.PDF для .NET. В этом пошаговом руководстве показано, как создать документ, инициализировать таблицу, настроить границы и выравнивание, добавить содержимое и сохранить документ PDF. Теперь вы можете применить эти знания в своих проектах.

### Часто задаваемые вопросы

#### В: Как выровнять содержимое ячеек таблицы по горизонтали?

 О: Вы можете выровнять содержимое ячеек таблицы по горизонтали, установив`HorizontalAlign` свойство клетки`TextState` объект. Например, чтобы выровнять текст по центру, используйте`cell.TextState.HorizontalAlignment = HorizontalAlignment.Center` . Вы также можете установить его на`HorizontalAlignment.Left` или`HorizontalAlignment.Right` для выравнивания по левому и правому краю соответственно.

#### Вопрос. Можно ли применять разные стили и цвета границ к отдельным ячейкам в таблице?

 О: Да, вы можете применять разные стили и цвета границ к отдельным ячейкам в таблице. Чтобы настроить границу для конкретной ячейки, установите`cell.Border` собственность на новый`BorderInfo`объекта с нужными настройками, такими как стороны границы, ширина и цвет.

#### Q: Как настроить вертикальное выравнивание содержимого таблицы внутри ячеек?

 A: Вы можете настроить вертикальное выравнивание содержимого таблицы внутри ячеек, установив`VerticalAlignment` свойство строки в`VerticalAlignment.Center`, `VerticalAlignment.Top` , или`VerticalAlignment.Bottom`. Это свойство управляет вертикальным выравниванием всех ячеек в этой строке.

#### Вопрос. Можно ли динамически добавлять в таблицу дополнительные столбцы или строки?

 О: Да, вы можете динамически добавлять в таблицу дополнительные столбцы и строки, используя`table.Rows.Add()` метод для добавления новых строк и`row.Cells.Add()` метод для добавления новых ячеек в строки. Вы можете сделать это внутри циклов или на основе ваших конкретных требований.

#### В: Как установить цвет фона для отдельных ячеек или всей таблицы?

 О: Чтобы установить цвет фона для определенных ячеек или всей таблицы, используйте кнопку`BackgroundColor` собственность`Cell` или`Table` объект. Например, чтобы установить цвет фона ячейки, используйте`cell.BackgroundColor = Aspose.Pdf.Color.LightBlue`.