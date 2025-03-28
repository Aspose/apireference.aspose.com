---
title: Реализовать пользовательский размер листа бумаги для рендеринга
linktitle: Реализовать пользовательский размер листа бумаги для рендеринга
second_title: Справочник по Aspose.Cells для .NET API
description: Пошаговое руководство по реализации пользовательского размера листа с помощью Aspose.Cells для .NET. Установите размеры, добавьте сообщение и сохраните в формате PDF.
type: docs
weight: 50
url: /ru/net/excel-page-setup/implement-custom-paper-size-of-worksheet-for-rendering/
---
Реализация пользовательского размера для вашего рабочего листа может быть очень полезной, когда вы хотите создать документ PDF с определенным размером. В этом руководстве мы узнаем, как использовать Aspose.Cells для .NET, чтобы установить нестандартный размер листа, а затем сохранить документ в формате PDF.

## Шаг 1: Создание выходной папки

Перед запуском вам необходимо создать выходную папку, в которой будет сохранен сгенерированный файл PDF. Вы можете использовать любой путь для выходной папки.

```csharp
// Выходные каталоги
string outputDir = "YOUR_OUTPUT_FOLDER";
```

Убедитесь, что вы указали правильный путь к выходной папке.

## Шаг 2: Создание объекта Workbook

Для начала вам нужно создать объект Workbook с помощью Aspose.Cells. Этот объект представляет вашу электронную таблицу.

```csharp
// Создайте объект «Рабочая книга»
Workbook wb = new Workbook();
```

## Шаг 3: Доступ к первому рабочему листу

После создания объекта Workbook вы можете получить доступ к первому рабочему листу внутри него.

```csharp
// Доступ к первому рабочему листу
Worksheet ws = wb.Worksheets[0];
```

## Шаг 4. Установка пользовательского размера листа

 Теперь вы можете установить пользовательский размер рабочего листа, используя`CustomPaperSize(width, height)` метод класса PageSetup.

```csharp
// Установить пользовательский размер листа (в дюймах)
ws.PageSetup.CustomPaperSize(6, 4);
```

В этом примере мы установили размер рабочего листа равным 6 дюймам в ширину и 4 дюймам в высоту.

## Шаг 5: Доступ к ячейке B4

После этого мы можем получить доступ к определенной ячейке на листе. В этом случае мы получим доступ к ячейке B4.

```csharp
// Доступ к ячейке B4
Cell b4 = ws.Cells["B4"];
```

## Шаг 6: Добавление сообщения в ячейку B4

 Теперь мы можем добавить сообщение в ячейку B4, используя`PutValue(value)` метод.

```csharp
// Добавьте сообщение в ячейку B4.
b4.PutValue("PDF page size: 6.00 x 4.00 inches");
```

В этом примере мы добавили сообщение «Размер страницы PDF: 6,00" x 4,00" в ячейку B4.

## Шаг 7: Сохранение рабочего листа в формате PDF

 Наконец, мы можем сохранить рабочий лист в формате PDF, используя`Save(filePath)` метод объекта Workbook.

```csharp
// Сохраните рабочий лист в формате PDF
wb.Save(outputDir + "outputCustomPaperSize.pdf");
```

Укажите желаемый путь к сгенерированному PDF-файлу, используя ранее созданную выходную папку.

### Пример исходного кода для реализации пользовательского размера листа бумаги для рендеринга с использованием Aspose.Cells для .NET 
```csharp
//Выходной каталог
string outputDir = "YOUR_OUTPUT_DIRECTORY";
//Создать объект рабочей книги
Workbook wb = new Workbook();
//Доступ к первому рабочему листу
Worksheet ws = wb.Worksheets[0];
//Установите пользовательский размер бумаги в дюймах
ws.PageSetup.CustomPaperSize(6, 4);
//Доступ к ячейке B4
Cell b4 = ws.Cells["B4"];
//Добавьте сообщение в ячейку B4.
b4.PutValue("Pdf Page Dimensions: 6.00 x 4.00 in");
//Сохраните книгу в формате pdf
wb.Save(outputDir + "outputCustomPaperSize.pdf");
```

## Выводы

В этом руководстве вы узнали, как реализовать нестандартный размер рабочего листа с помощью Aspose.Cells для .NET. Вы можете использовать эти шаги, чтобы установить определенные размеры для ваших рабочих листов, а затем сохранить документы в формате PDF. Мы надеемся, что это руководство помогло вам понять процесс реализации пользовательского размера электронной таблицы.

### Часто задаваемые вопросы (FAQ)

#### Вопрос 1: Могу ли я дополнительно настроить макет электронной таблицы?

Да, Aspose.Cells предлагает множество вариантов настройки макета рабочего листа. Вы можете установить пользовательские размеры, ориентацию страницы, поля, верхние и нижние колонтитулы и многое другое.

#### Вопрос 2: Какие еще выходные форматы поддерживает Aspose.Cells?

Aspose.Cells поддерживает множество различных выходных форматов, включая PDF, XLSX, XLS, CSV, HTML, TXT и многие другие. Вы можете выбрать желаемый формат вывода в соответствии с вашими потребностями.