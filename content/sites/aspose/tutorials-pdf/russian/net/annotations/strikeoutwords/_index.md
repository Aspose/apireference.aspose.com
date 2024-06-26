---
title: Вычеркнуть слова
linktitle: Вычеркнуть слова
second_title: Aspose.PDF для справочника API .NET
description: В этой статье представлено пошаговое руководство по использованию Aspose.PDF для функции .NET Strike Out Words, включая пошаговое руководство и пояснения.
type: docs
weight: 150
url: /ru/net/annotations/strikeoutwords/
---
Aspose.PDF для .NET — это библиотека для обработки и обработки PDF-документов, которая предоставляет различные функции для создания, изменения и преобразования PDF-файлов. Одной из полезных функций, предоставляемых Aspose.PDF, является возможность зачеркивать слова или фразы в документе PDF с использованием исходного кода C#. В этой статье мы предоставим пошаговое руководство о том, как зачеркивать слова с помощью Aspose.PDF для .NET.

## Шаг 1: Загрузка PDF-документа
Первый шаг — загрузить документ PDF, который вы хотите изменить. В этом руководстве мы загрузим PDF-документ с именем «input.pdf» из папки «ВАШ КАТАЛОГ ДОКУМЕНТОВ». 

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document document = new Document(dataDir + "input.pdf");
```

## Шаг 2: Поиск текстовых фрагментов
Чтобы вычеркнуть определенные слова или фразы в документе PDF, сначала необходимо выполнить их поиск. Aspose.PDF предоставляет класс TextFragmentAbsorber, который можно использовать для поиска определенного текстового фрагмента в документе PDF.

```csharp
Aspose.Pdf.Text.TextFragmentAbsorber textFragmentAbsorber = new Aspose.Pdf.Text.TextFragmentAbsorber("Estoque");
```

В приведенном выше коде мы ищем фрагмент текста «Estoque» в документе PDF. Вы можете изменить это для поиска любого другого слова или фразы, которые вы хотите вычеркнуть.

## Шаг 3: Вычеркивание фрагментов текста
После нахождения текстовых фрагментов следующим шагом будет их вычеркивание. Aspose.PDF предоставляет класс StrikeOutAnnotation, который можно использовать для создания зачеркивающей аннотации к текстовому фрагменту. 

```csharp
Aspose.Pdf.Rectangle rect = new Aspose.Pdf.Rectangle((float)textFragment.Position.XIndent, (float)textFragment.Position.YIndent, (float)textFragment.Position.XIndent + (float)textFragment.Rectangle.Width, (float)textFragment.Position.YIndent + (float)textFragment.Rectangle.Height);

StrikeOutAnnotation strikeOut = new StrikeOutAnnotation(textFragment.Page, rect);
strikeOut.Opacity = .80f;
strikeOut.Border = new Border(strikeOut);
strikeOut.Color = Aspose.Pdf.Color.Red;
textFragment.Page.Annotations.Add(strikeOut);
```

В приведенном выше коде мы создаем зачеркнутую аннотацию для каждого найденного фрагмента текста. Мы также устанавливаем непрозрачность, границу и цвет зачеркнутой аннотации.

## Шаг 4: Сохранение измененного PDF-документа
Вычеркнув фрагменты текста, сохраните измененный документ.

```csharp
dataDir = dataDir + "StrikeOutWords_out.pdf";
document.Save(dataDir);
```

### Пример исходного кода для Strike Out Words с использованием Aspose.PDF для .NET


```csharp

// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Открыть документ
Document document = new Document(dataDir + "input.pdf");

// Создайте экземпляр TextFragment Absorber для поиска определенного текстового фрагмента
Aspose.Pdf.Text.TextFragmentAbsorber textFragmentAbsorber = new Aspose.Pdf.Text.TextFragmentAbsorber("Estoque");
// Итерация по страницам PDF-документа
for (int i = 1; i <= document.Pages.Count; i++)
{
	// Получить первую страницу документа PDF
	Page page = document.Pages[1];
	page.Accept(textFragmentAbsorber);
}

// Создайте коллекцию поглощенного текста
Aspose.Pdf.Text.TextFragmentCollection textFragmentCollection = textFragmentAbsorber.TextFragments;

//Повторить вышеприведенную коллекцию
for (int j = 1; j <= textFragmentCollection.Count; j++)
{
	Aspose.Pdf.Text.TextFragment textFragment = textFragmentCollection[j];

	// Получить прямоугольные размеры объекта TextFragment
	Aspose.Pdf.Rectangle rect = new Aspose.Pdf.Rectangle(
				(float)textFragment.Position.XIndent,
				(float)textFragment.Position.YIndent,
				(float)textFragment.Position.XIndent +
				(float)textFragment.Rectangle.Width,
				(float)textFragment.Position.YIndent +
				(float)textFragment.Rectangle.Height);

	// Создание экземпляра аннотации StrikeOut
	StrikeOutAnnotation strikeOut = new StrikeOutAnnotation(textFragment.Page, rect);
	// Установить непрозрачность для аннотации
	strikeOut.Opacity = .80f;
	// Установите границу для экземпляра аннотации
	strikeOut.Border = new Border(strikeOut);
	// Установить цвет аннотации
	strikeOut.Color = Aspose.Pdf.Color.Red;
	// Добавить аннотацию в коллекцию аннотаций TextFragment
	textFragment.Page.Annotations.Add(strikeOut);
}
dataDir = dataDir + "StrikeOutWords_out.pdf";
document.Save(dataDir);
```

## Заключение

В этом руководстве мы узнали, как использовать Aspose.PDF для .NET, чтобы вычеркивать определенные слова в документе PDF. Следуя пошаговому руководству и используя предоставленный исходный код C#, вы можете легко загружать PDF-документ, искать определенные текстовые фрагменты и создавать зачеркивающие аннотации, чтобы визуально помечать и зачеркивать эти слова. Aspose.PDF для .NET предоставляет простой и эффективный способ программного управления PDF-документами, что делает его ценным инструментом для разработчиков, работающих с PDF-файлами в приложениях .NET.

### Часто задаваемые вопросы

#### В: Что такое Aspose.PDF для .NET?

О: Aspose.PDF для .NET — это мощная библиотека, которая позволяет разработчикам программно создавать, редактировать и управлять PDF-документами в приложениях .NET. Он предоставляет широкий спектр функций для работы с файлами PDF, включая извлечение текста, обработку аннотаций, заполнение форм и многое другое.

#### В: Могу ли я использовать Aspose.PDF для .NET, чтобы вычеркивать определенные слова в документе PDF?

О: Да, Aspose.PDF для .NET предоставляет функциональные возможности для поиска определенных текстовых фрагментов в документе PDF, а затем создания зачеркивающих аннотаций, чтобы визуально помечать и зачеркивать эти слова.

#### В: Как указать текст, который я хочу зачеркнуть в документе PDF?

 A: Чтобы указать текст, который вы хотите зачеркнуть, вы можете использовать`TextFragmentAbsorber` класс, предоставляемый Aspose.PDF для .NET. Это позволяет вам искать определенный текстовый фрагмент в документе PDF на основе желаемых критериев.

#### Вопрос. Можно ли настроить внешний вид зачеркнутой аннотации?

О: Да, вы можете настроить различные свойства зачеркнутой аннотации, такие как непрозрачность, стиль границы и цвет. Это позволяет адаптировать внешний вид зачеркнутой аннотации к вашим конкретным требованиям.