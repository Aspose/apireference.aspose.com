---
title: Отключить шрифты и оптимизировать PDF-файлы
linktitle: Отключить шрифты и оптимизировать PDF-файлы
second_title: Aspose.PDF для справочника API .NET
description: Узнайте, как использовать Aspose.PDF для .NET для получения невстроенных шрифтов и оптимизации PDF-файлов. Пошаговое руководство.
type: docs
weight: 370
url: /ru/net/programming-with-document/unembedfonts/
---
Aspose.PDF для .NET — это мощная библиотека, предоставляющая широкий спектр функций для работы с PDF-документами. Одной из его функций является получение невстроенных шрифтов из PDF-документа. Это может быть полезно, если вам нужно извлечь шрифты из PDF-документа и использовать их в других приложениях.

мы предоставим пошаговое руководство, объясняющее следующий исходный код C# функции получения невстроенных шрифтов в Aspose.PDF для .NET.

## Шаг 1: Установите путь к каталогу документов

Прежде чем мы начнем, нам нужно указать путь к каталогу, в котором находится наш PDF-документ. Мы будем хранить этот путь в переменной с именем «dataDir».

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

Замените «КАТАЛОГ ВАШИХ ДОКУМЕНТОВ» на фактический путь к каталогу, в котором находится ваш PDF-документ.

## Шаг 2: Откройте PDF-документ

 Первым шагом является загрузка PDF-документа, который вы хотите сделать, используйте кнопку`Document` класс Aspose.PDF для .NET. В следующем фрагменте кода показано, как загрузить PDF-документ:

```csharp
// Открыть документ
Document pdfDocument = new Document(dataDir + "OptimizeDocument.pdf");
```

## Шаг 3: установите параметр UnembedFonts

 Чтобы получить невстроенные шрифты из документа PDF, вам необходимо установить`UnembedFonts` возможность`true` . Эта опция доступна в`OptimizationOptions` сорт. В следующем фрагменте кода показано, как установить`UnembedFonts` вариант:

```csharp
// Установите параметр UnembedFonts
var optimizeOptions = new Pdf.Optimization.OptimizationOptions
{
	UnembedFonts = true
};
```

## Шаг 4. Оптимизируйте PDF-документ

 После установки`UnembedFonts` вариант, вы можете оптимизировать документ PDF с помощью`OptimizeResources` метод`Document` сорт. В следующем фрагменте кода показано, как оптимизировать PDF-документ:

```csharp
// Оптимизируйте документ PDF с помощью OptimizationOptions
pdfDocument.OptimizeResources(optimizeOptions);
```

## Шаг 5: Сохраните обновленный документ

 После оптимизации документа PDF вы можете сохранить обновленный документ с помощью кнопки`Save` метод`Document`сорт. В следующем фрагменте кода показано, как сохранить обновленный документ:

```csharp
// Сохранить обновленный документ
pdfDocument.Save(dataDir + "OptimizeDocument_out.pdf");
```

## Шаг 6: Получите исходный и уменьшенный размер файла

 Наконец, вы можете получить исходный и уменьшенный размер файла PDF-документа, используя`FileInfo` класс System.IO. В следующем фрагменте кода показано, как получить исходный и уменьшенный размер файла:

```csharp
var fi1 = new System.IO.FileInfo(dataDir + "OptimizeDocument.pdf");
var fi2 = new System.IO.FileInfo(dataDir + "OptimizeDocument_out.pdf");
Console.WriteLine("Original file size: {0}. Reduced file size: {1}", fi1.Length, fi2.Length);
```

### Пример исходного кода для получения невстроенных шрифтов с использованием Aspose.PDF для .NET

Вот полный пример исходного кода для получения невстроенных шрифтов из документа PDF с использованием Aspose.PDF для .NET:

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Открыть документ
Document pdfDocument = new Document(dataDir + "OptimizeDocument.pdf");
// Установите параметр UnembedFonts
var optimizeOptions = new Pdf.Optimization.OptimizationOptions
{
	UnembedFonts = true
};
Console.WriteLine("Start");
// Оптимизируйте документ PDF с помощью OptimizationOptions
pdfDocument.OptimizeResources(optimizeOptions);
// Сохранить обновленный документ
pdfDocument.Save(dataDir + "OptimizeDocument_out.pdf");
Console.WriteLine("Finished");
var fi1 = new System.IO.FileInfo(dataDir + "OptimizeDocument.pdf");
var fi2 = new System.IO.FileInfo(dataDir + "OptimizeDocument_out.pdf");
Console.WriteLine("Original file size: {0}. Reduced file size: {1}", fi1.Length, fi2.Length);
```

## Заключение

В этом руководстве мы продемонстрировали, как использовать Aspose.PDF для .NET для получения невстроенных шрифтов из документа PDF. Следуя пошаговому руководству, вы сможете легко реализовать эту функцию в своих приложениях C#. Извлечение шрифтов может быть полезным, когда вам нужно работать с извлеченными шрифтами отдельно или обеспечить согласованное использование шрифтов на разных платформах.

## Часто задаваемые вопросы

#### В: Какова цель извлечения шрифтов из PDF-документа?

О: Извлечение шрифтов из PDF-документа позволяет извлечь встроенные шрифты и использовать их в других приложениях. Это может быть полезно для обеспечения последовательного рендеринга шрифтов и сохранения внешнего вида документа.

#### Q: Как мне указать путь к каталогу документа в коде C#?

 A: Чтобы указать путь к каталогу документов, замените`"YOUR DOCUMENT DIRECTORY"` в коде с фактическим путем к каталогу, в котором находится ваш PDF-документ.

####  В: Что означает`UnembedFonts` option do, and where is it set?

 А:`UnembedFonts` вариант, доступный в`OptimizationOptions` class, включает или отключает извлечение шрифтов из документа PDF. Чтобы установить этот параметр на`true`, используйте следующий код:

```csharp
var optimizeOptions = new Pdf.Optimization.OptimizationOptions
{
	UnembedFonts = true
};
```

#### В: Могу ли я отменить изменения, внесенные в процессе оптимизации?

О: Aspose.PDF для .NET не вносит постоянных изменений в исходный PDF-документ во время оптимизации. Процесс оптимизации выполняется на копии документа, оставляя оригинал нетронутым.

#### Q: Как проверить исходный и уменьшенный размер файла после оптимизации?

О: Вы можете использовать`FileInfo` класс`System.IO` чтобы получить исходный и уменьшенный размер файла. Вот пример фрагмента кода для достижения этой цели:

```csharp
var fi1 = new System.IO.FileInfo(dataDir + "OptimizeDocument.pdf");
var fi2 = new System.IO.FileInfo(dataDir + "OptimizeDocument_out.pdf");
Console.WriteLine("Original file size: {0}. Reduced file size: {1}", fi1.Length, fi2.Length);
```