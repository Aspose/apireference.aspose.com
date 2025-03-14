---
title: Мета-символы в шаблоне поиска
linktitle: Мета-символы в шаблоне поиска
second_title: Справочник по API Aspose.Words для .NET
description: Узнайте, как использовать метасимволы в шаблоне поиска с Aspose.Words для .NET для работы с документами Word.
type: docs
weight: 10
url: /ru/net/find-and-replace-text/meta-characters-in-search-pattern/
---

В этой статье мы рассмотрим приведенный выше исходный код C#, чтобы понять, как использовать функцию метасимволов в шаблоне поиска в библиотеке Aspose.Words для .NET. Эта функция позволяет использовать специальные метасимволы для расширенного поиска и замены в документах Word.

## Предпосылки

- Базовые знания языка С#.
- Среда разработки .NET с установленной библиотекой Aspose.Words.

## Шаг 1: Создание нового документа

 Прежде чем мы начнем использовать метасимволы в шаблоне поиска, нам нужно создать новый документ, используя Aspose.Words для .NET. Это можно сделать, создав экземпляр`Document` объект:

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
Document doc = new Document();
```

## Шаг 2. Вставьте текст в документ

 Когда у нас есть документ, мы можем вставить текст, используя`DocumentBuilder` объект. В нашем примере мы используем`Writeln` и`Write` методы для вставки двух строк текста:

```csharp
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("This is line 1");
builder.Writeln("This is line 2");
```

## Шаг 3. Найдите и замените текст метасимволами

 Теперь мы будем использовать`Range.Replace` для поиска и замены текста с использованием шаблона поиска, содержащего специальные метасимволы. В нашем примере мы заменяем фразу «Это строка 1&pЭто строка 2» на «Эта строка заменена», используя`&p` метасимвол для представления разрыва абзаца:

```csharp
doc.Range.Replace("This is row 1&pThis is line 2", "This line is replaced");
```

## Шаг 4. Вставка разрыва страницы в документ

 Чтобы проиллюстрировать использование другого метасимвола, мы вставим разрыв страницы в документ, используя`InsertBreak` метод с`BreakType.PageBreak` параметр. Сначала мы перемещаем курсор из`DocumentBuilder` в конец документа, затем вставляем разрыв страницы и новую строку текста:

```csharp
builder. MoveToDocumentEnd();
builder.Write("This is line 1");
builder. InsertBreak(BreakType.PageBreak);
builder.Writeln("This is line 2");
```

## Шаг 5. Найдите и замените другим метасимволом

 Теперь мы выполним еще один поиск и замену, используя`&m` метасимвол для представления разрыва страницы. Мы заменяем фразу «Это строка 1&mЭто строка 2» на «Разрыв страницы заменяется новым текстом». :

```csharp
doc.Range.Replace("This is line 1&mThis is line 2", "The page break is replaced with new text.");
```

## Шаг 6: Сохранение отредактированного документа

 Наконец, мы сохраняем измененный документ в указанный каталог, используя`Save` метод:

```csharp
doc.Save(dataDir + "SearchAndReplace.MetaCharactersInSearchPattern.docx");
```

### Пример исходного кода для метасимволов в шаблоне поиска с использованием Aspose.Words для .NET

Вот полный образец исходного кода, демонстрирующий использование метасимволов в шаблоне поиска с помощью Aspose.Words для .NET:

```csharp

	/* meta-characters
	&p - paragraph break
	&b - section break
	&m - page break
	&l - manual line break
	*/

	// Путь к каталогу документов.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);
	
	builder.Writeln("This is Line 1");
	builder.Writeln("This is Line 2");

	doc.Range.Replace("This is Line 1&pThis is Line 2", "This is replaced line");

	builder.MoveToDocumentEnd();
	builder.Write("This is Line 1");
	builder.InsertBreak(BreakType.PageBreak);
	builder.Writeln("This is Line 2");

	doc.Range.Replace("This is Line 1&mThis is Line 2", "Page break is replaced with new text.");

	doc.Save(dataDir + "FindAndReplace.MetaCharactersInSearchPattern.docx");

```

## Заключение

В этой статье мы изучили исходный код C#, чтобы понять, как использовать метасимволы в шаблоне поиска Aspose.Words для .NET. Мы следовали пошаговому руководству, чтобы создать документ, вставить текст, выполнить поиск и замену с использованием специальных метасимволов, вставить разрывы страниц и сохранить отредактированный документ.
