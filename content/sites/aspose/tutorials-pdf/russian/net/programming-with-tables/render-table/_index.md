---
title: Визуализация таблицы в PDF-документе
linktitle: Визуализация таблицы в PDF-документе
second_title: Aspose.PDF для справочника API .NET
description: Узнайте, как отобразить таблицу в документе PDF с помощью Aspose.PDF для .NET.
type: docs
weight: 170
url: /ru/net/programming-with-tables/render-table/
---
В этом руководстве мы шаг за шагом проведем вас по отображению таблицы в документе PDF с помощью Aspose.PDF для .NET. Мы объясним предоставленный исходный код C# и покажем, как его реализовать.

## Шаг 1: Создание документа
Сначала мы создадим новый PDF-документ:

```csharp
// Путь к каталогу документов
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Создать новый документ
Document doc = new Document();
```

## Шаг 2. Настройка полей и ориентации страницы
Далее мы настроим поля страницы и установим альбомную ориентацию:

```csharp
PageInfo pageInfo = doc.PageInfo;
Aspose.Pdf.MarginInfo marginInfo = pageInfo.Margin;

marginInfo. Left = 37;
marginInfo. Right = 37;
marginInfo. Top = 37;
marginInfo.Bottom = 37;

pageInfo.IsLandscape = true;
```

## Шаг 3: Создание таблицы и столбцов
Теперь давайте создадим таблицу и установим ширину столбцов:

```csharp
Aspose.Pdf.Table table = new Aspose.Pdf.Table();
table. ColumnWidths = "50 100";
```

## Шаг 4. Добавьте строки и ячейки в таблицу
Далее мы добавим строки и ячейки в таблицу с помощью цикла:

```csharp
for (int i = 1; i <= 120; i++)
{
     Aspose.Pdf.Row row = table.Rows.Add();
     row. FixedRowHeight = 15;
     Aspose.Pdf.Cell cell1 = row.Cells.Add();
     cell1.Paragraphs.Add(new TextFragment("Content 1"));
     Aspose.Pdf.Cell cell2 = row.Cells.Add();
     cell2.Paragraphs.Add(new TextFragment("HHHHH"));
}
```

## Шаг 5: Добавление таблицы на страницу
Теперь добавим таблицу на страницу документа:

```csharp
Page curPage = doc.Pages.Add();
Aspose.Pdf.Paragraphs paragraphs = curPage.Paragraphs;
paragraphs. Add(table);
```

## Шаг 6: Отображение таблицы на новой странице
Далее мы создадим новую таблицу и установим для свойства «IsInNewPage» значение «true», чтобы отобразить таблицу на новой странице:

```csharp
Aspose.Pdf.Table table1 = new Aspose.Pdf.Table();
table. ColumnWidths = "100 100";
for (int i = 1; i <= 10; i++)
{
     Aspose.Pdf.Row row = table1.Rows.Add();
     Aspose.Pdf.Cell cell1 = row.Cells.Add();
     cell1.Paragraphs.Add(new TextFragment("LAAAAAAA"));
     Aspose.Pdf.Cell cell2 = row.Cells.Add();
     cell2.Paragraphs.Add(new TextFragment("LAAGGGGGG"));
}
table1.IsInNewPage = true;
paragraphs. Add(table1);
```

## Шаг 7: Сохраните PDF
Наконец, мы сохраняем документ PDF:

```csharp
dataDir = dataDir + "IsNewPageProperty_Test_out.pdf";
doc.Save(dataDir);

Console.WriteLine("\nTable displayed successfully on a page.\nFile saved at location: " + dataDir);
```

### Пример исходного кода для Render Table с использованием Aspose.PDF для .NET

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document();
PageInfo pageInfo = doc.PageInfo;
Aspose.Pdf.MarginInfo marginInfo = pageInfo.Margin;

marginInfo.Left = 37;
marginInfo.Right = 37;
marginInfo.Top = 37;
marginInfo.Bottom = 37;

pageInfo.IsLandscape = true;

Aspose.Pdf.Table table = new Aspose.Pdf.Table();
table.ColumnWidths = "50 100";
// Добавлена страница.
Page curPage = doc.Pages.Add();
for (int i = 1; i <= 120; i++)
{
	Aspose.Pdf.Row row = table.Rows.Add();
	row.FixedRowHeight = 15;
	Aspose.Pdf.Cell cell1 = row.Cells.Add();
	cell1.Paragraphs.Add(new TextFragment("Content 1"));
	Aspose.Pdf.Cell cell2 = row.Cells.Add();
	cell2.Paragraphs.Add(new TextFragment("HHHHH"));
}
Aspose.Pdf.Paragraphs paragraphs = curPage.Paragraphs;
paragraphs.Add(table);
/********************************************/
Aspose.Pdf.Table table1 = new Aspose.Pdf.Table();
table.ColumnWidths = "100 100";
for (int i = 1; i <= 10; i++)
{
	Aspose.Pdf.Row row = table1.Rows.Add();
	Aspose.Pdf.Cell cell1 = row.Cells.Add();
	cell1.Paragraphs.Add(new TextFragment("LAAAAAAA"));
	Aspose.Pdf.Cell cell2 = row.Cells.Add();
	cell2.Paragraphs.Add(new TextFragment("LAAGGGGGG"));
}
table1.IsInNewPage = true;
// Я хочу сохранить таблицу 1 на следующей странице, пожалуйста...
paragraphs.Add(table1);
dataDir = dataDir + "IsNewPageProperty_Test_out.pdf";
doc.Save(dataDir);

Console.WriteLine("\nTable render successfully on a page.\nFile saved at " + dataDir);
```

## Заключение
Поздравляем! Теперь вы узнали, как отобразить таблицу в документе PDF с помощью Aspose.PDF для .NET. В этом пошаговом руководстве показано, как создать документ, настроить поля и ориентацию страницы, добавить таблицу и отобразить таблицу на новой странице. Теперь вы можете применить эти знания в своих проектах.

### Часто задаваемые вопросы по таблице рендеринга в документе PDF

#### В: Как изменить внешний вид таблицы, например изменить цвет ячеек или добавить границы?

A: Чтобы изменить внешний вид таблицы, вы можете установить различные свойства`Aspose.Pdf.Table` и его клетки. Например, вы можете установить`BackgroundColor` свойство ячеек менять цвет фона. Вы также можете установить`Border` свойство таблицы или отдельных ячеек для добавления границ. Кроме того, вы можете настроить шрифт, цвет текста и выравнивание содержимого таблицы, изменив`TextState` принадлежащий`TextFragment` объекты, добавленные в ячейки.

#### В: Могу ли я добавить в таблицу верхние или нижние колонтитулы?

О: Да, вы можете добавить в таблицу верхние или нижние колонтитулы, создав дополнительные строки в начале или конце таблицы и задав соответствующее содержимое в ячейках. Вы можете настраивать верхние или нижние колонтитулы независимо от остального содержимого таблицы, добавляя различные стили или содержимое к этим конкретным строкам.

#### Q: Как я могу управлять положением таблицы на странице?

 О: Чтобы контролировать положение таблицы на странице, вы можете настроить`MarginInfo` принадлежащий`PageInfo` объект.`MarginInfo`позволяет установить левое, правое, верхнее и нижнее поля страницы, что влияет на доступное пространство для таблицы. Вы также можете использовать`PositioningType` собственность`Aspose.Pdf.Table` для управления его горизонтальным и вертикальным выравниванием в области содержимого страницы.

#### В: Могу ли я экспортировать таблицу в другие форматы файлов, например Excel или CSV?

О: Aspose.PDF для .NET в первую очередь предназначен для работы с PDF-документами. Хотя он может экспортировать документ PDF как изображение или XPS, он не поддерживает прямой экспорт таблиц в такие форматы, как Excel или CSV. Чтобы экспортировать данные таблицы в другие форматы файлов, вам может потребоваться использовать дополнительные библиотеки или методы для преобразования содержимого PDF в нужный формат.

#### Q: Как я могу добавить гиперссылки в ячейки таблицы?

 О: Чтобы добавить гиперссылки в ячейки таблицы, вы можете использовать кнопку`Aspose.Pdf.WebHyperlink` класс, чтобы создать гиперссылку, а затем добавить ее в качестве привязки к`TextFragment`внутри клетки. Это позволяет связать URL-адрес или цель ссылки с определенным текстом или содержимым в ячейке, создавая интерактивные гиперссылки.