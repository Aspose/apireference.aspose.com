---
title: Копировать рабочий лист Excel
linktitle: Копировать рабочий лист Excel
second_title: Справочник по Aspose.Cells для .NET API
description: Скопируйте один лист Excel в другой с помощью Aspose.Cells для .NET.
type: docs
weight: 20
url: /ru/net/excel-copy-worksheet/excel-copy-worksheet/
---

В этом руководстве мы объясним, как скопировать рабочий лист Excel с помощью библиотеки Aspose.Cells для .NET. Мы предоставим вам исходный код C# и проведем вас через шаги, необходимые для выполнения этой задачи. В конце мы покажем вам ожидаемый результат. Чтобы начать, следуйте приведенным ниже инструкциям.

## Шаг 1: Подготовка

Прежде чем начать, убедитесь, что вы установили Aspose.Cells для .NET и создали проект C# в предпочитаемой вами интегрированной среде разработки (IDE). Также убедитесь, что у вас есть копия файла Excel, с которым вы хотите работать.

## Шаг 2. Импортируйте необходимые библиотеки

 В исходный файл C# импортируйте необходимые библиотеки из Aspose.Cells, используя команду`using` директива:

```csharp
using Aspose.Cells;
```

## Шаг 3: Установите путь к файлу

 объявить`dataDir` переменную и инициализируйте ее каталогом, содержащим ваш файл Excel. Например :

```csharp
string dataDir = "PATH_TO_YOUR_DOCUMENT_DIRECTORY";
```

 Обязательно замените`"PATH_TO_YOUR_DOCUMENT_DIRECTORY"` с фактическим путем к вашему каталогу.

## Шаг 4: Загрузите существующий файл Excel

 Использовать`Workbook`класс из Aspose.Cells, чтобы открыть существующий файл Excel. Использовать`InputPath` переменная для указания пути к файлу:

```csharp
string InputPath = dataDir + "book1.xls";
Workbook wb = new Workbook(InputPath);
```

 Убедитесь, что вы заменили`"book1.xls"` с фактическим именем вашего файла Excel.

## Шаг 5: Скопируйте рабочий лист

 Теперь мы скопируем существующий рабочий лист на новый рабочий лист. Использовать`Worksheets` собственность`Workbook` объект для доступа к коллекции рабочих листов:

```csharp
WorksheetCollection sheets = wb.Worksheets;
```

 Затем используйте`AddCopy` метод для копирования указанного рабочего листа. Например, чтобы скопировать «Лист1»:

```csharp
sheets.AddCopy("Sheet1");
```

## Шаг 6: Сохраните файл Excel

 Использовать`Save` метод`Workbook` объект для сохранения изменений в новый файл:

```csharp
wb.Save(dataDir + "CopyWithinWorkbook_out.xls");
```

Обязательно укажите желаемый путь и имя файла для выходного файла.

### Пример исходного кода для Excel Copy Worksheet с использованием Aspose.Cells для .NET 

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";
string InputPath = dataDir + "book1.xls";
// Откройте существующий файл Excel.
Workbook wb = new Workbook(InputPath);
// Создайте объект Worksheets со ссылкой на
// листы Рабочей тетради.
WorksheetCollection sheets = wb.Worksheets;
// Скопируйте данные на новый лист из существующего
// лист в рабочей тетради.
sheets.AddCopy("Sheet1");
// Сохраните файл Excel.
wb.Save(dataDir + "CopyWithinWorkbook_out.xls");
```

## Заключение

Поздравляем! Теперь вы узнали, как копировать рабочий лист Excel с помощью Aspose.Cells для .NET. В этом пошаговом руководстве показано, как импортировать необходимые библиотеки, загрузить существующий файл Excel, скопировать рабочий лист и сохранить измененный файл. Не стесняйтесь использовать этот метод в своих проектах для эффективного управления файлами Excel.

### Часто задаваемые вопросы

#### В. Совместим ли Aspose.Cells с другими языками программирования?

A. Да, Aspose.Cells поддерживает несколько языков программирования, включая C#, Java, Python и многие другие.

#### Вопрос. Можно ли скопировать лист в другую книгу Excel?

A.  Да, вы можете использовать`AddCopy` метод копирования рабочего листа в другую книгу Excel.

#### В. Сохраняет ли Aspose.Cells формулы и форматирование при копировании рабочего листа?

A. Да, Aspose.Cells сохраняет формулы, форматирование и другие свойства при копировании рабочего листа.

#### В. Требуется ли Aspose.Cells лицензия для коммерческого использования?

A. Да, Aspose.Cells является коммерческим продуктом и требует покупки лицензии для коммерческого использования. Дополнительную информацию о лицензировании можно найти на официальном сайте Aspose.