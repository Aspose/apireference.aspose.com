---
title: Получить все шрифты в файле PDF
linktitle: Получить все шрифты в файле PDF
second_title: Aspose.PDF для справочника API .NET
description: Узнайте, как использовать Aspose.PDF для .NET для программного получения всех шрифтов, используемых в файле PDF, с помощью этого пошагового руководства и примера кода.
type: docs
weight: 160
url: /ru/net/programming-with-document/getallfonts/
---
Aspose.PDF для .NET — это мощная библиотека, которая позволяет разработчикам программно работать с файлами PDF. Одной из функций, которые он предоставляет, является возможность получить все шрифты, используемые в файле PDF. Это может быть полезно, если вам нужно программно анализировать или манипулировать шрифтами в файле PDF.

В этом руководстве мы обсудим, как использовать Aspose.PDF для .NET, чтобы получить все шрифты, используемые в документе PDF. Мы предоставим пошаговое руководство о том, как это сделать, а также пример исходного кода.

## Шаг 1. Создайте новое консольное приложение C#
Для начала создайте новое консольное приложение C# в Visual Studio. Вы можете назвать это как угодно. После создания проекта необходимо добавить ссылку на библиотеку Aspose.PDF для .NET.

## Шаг 2. Импортируйте пространство имен Aspose.PDF
Добавьте следующую строку кода вверху файла C#, чтобы импортировать пространство имен Aspose.PDF:

```csharp
using Aspose.Pdf;
```

## Шаг 3: Загрузите PDF-документ
Загрузите документ PDF, из которого вы хотите получить шрифты:

```csharp
Document doc = new Document(dataDir + "input.pdf");
```

## Шаг 4: Получите все шрифты
Получите все шрифты, используемые в документе PDF:

```csharp
Aspose.Pdf.Text.Font[] fonts = doc.FontUtilities.GetAllFonts();
```

## Шаг 5: Распечатайте все шрифты
Распечатайте все шрифты, используемые в документе PDF:

```csharp
foreach (Aspose.Pdf.Text.Font font in fonts)
{
    Console.WriteLine(font.FontName);
}
```

### Пример исходного кода для получения всех шрифтов с использованием Aspose.PDF для .NET
```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document(dataDir + "input.pdf");
Aspose.Pdf.Text.Font[] fonts = doc.FontUtilities.GetAllFonts();
foreach (Aspose.Pdf.Text.Font font in fonts)
{
    Console.WriteLine(font.FontName);
}
```

## Заключение
В этом руководстве мы обсудили, как получить все шрифты, используемые в документе PDF, с помощью Aspose.PDF для .NET. Получение всех шрифтов, используемых в PDF-документе, может быть полезно, если вам нужно программно проанализировать или управлять шрифтами в PDF-документе. Aspose.PDF для .NET предоставляет простой и удобный API для работы с PDF-документами, включая получение всех шрифтов, используемых в PDF-документе.

### Часто задаваемые вопросы

#### В: Зачем мне нужно получать все шрифты, используемые в PDF-документе?

О: Получение всех шрифтов, используемых в PDF-документе, может быть полезно, если вам нужно программно анализировать или манипулировать шрифтами для различных целей, таких как замена шрифта или настройка шрифта.

#### В: Как получить все шрифты, используемые в PDF-документе, с помощью Aspose.PDF для .NET?

 О: Вы можете получить все шрифты, используемые в PDF-документе, используя Aspose.PDF для .NET, вызвав`GetAllFonts` метод`FontUtilities` сорт. Этот метод возвращает массив`Aspose.Pdf.Text.Font` объекты, которые представляют шрифты, используемые в документе PDF.

#### В: Могу ли я фильтровать шрифты по определенным критериям?

О: Да, вы можете фильтровать шрифты по определенным критериям, используя Aspose.PDF для .NET. После получения всех шрифтов вы можете программно проанализировать шрифты и применить логику фильтрации по мере необходимости.

#### В: Совместим ли Aspose.PDF для .NET с различными форматами шрифтов?

О: Да, Aspose.PDF для .NET совместим с различными форматами шрифтов, включая шрифты TrueType, OpenType и Type 1. Он может работать с различными форматами шрифтов и обрабатывать их при работе с документами PDF.