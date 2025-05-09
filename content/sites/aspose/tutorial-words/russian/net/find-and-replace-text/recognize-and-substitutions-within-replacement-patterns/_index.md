---
title: Распознавание и замены в шаблонах замены
linktitle: Распознавание и замены в шаблонах замены
second_title: Справочник по API Aspose.Words для .NET
description: Узнайте, как использовать шаблоны замены с распознаванием и заменой в Aspose.Words для .NET для работы с документами Word.
type: docs
weight: 10
url: /ru/net/find-and-replace-text/recognize-and-substitutions-within-replacement-patterns/
---

В этой статье мы рассмотрим приведенный выше исходный код C#, чтобы понять, как использовать функцию распознавания и замены в шаблонах замены в библиотеке Aspose.Words для .NET. Эта функция помогает распознавать сложные шаблоны поиска и выполнять замены на основе групп, захваченных во время манипулирования документами.

## Предпосылки

- Базовые знания языка С#.
- Среда разработки .NET с установленной библиотекой Aspose.Words.

## Шаг 1: Создание нового документа

 Прежде чем мы начнем использовать совпадения и замены в шаблонах замены, нам нужно создать новый документ, используя Aspose.Words для .NET. Это можно сделать, создав экземпляр`Document` объект:

```csharp
Document doc = new Document();
```

## Шаг 2. Вставьте текст в документ

 Когда у нас есть документ, мы можем вставить текст, используя`DocumentBuilder`объект. В нашем примере мы используем`Write` способ вставить фразу «Джейсон дает Полу немного денег». :

```csharp
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Write("Jason gives money to Paul.");
```

## Шаг 3: Распознавание и замена в шаблонах замены

 Теперь мы будем использовать`Range.Replace` функция для поиска и замены текста с использованием регулярного выражения для распознавания определенных шаблонов. В нашем примере мы используем регулярное выражение`([A-z]+) gives money to ([A-z]+)` распознавать предложения, в которых кто-то дает деньги кому-то другому. Мы используем шаблон замены`$2 takes money from $1` выполнить замену, поменяв местами роли. Использование`$1` и`$2` относится к группам, захваченным регулярным выражением:

```csharp
Regex regex = new Regex(@"([A-z]+) gives money to ([A-z]+)");

FindReplaceOptions options = new FindReplaceOptions { UseSubstitutions = true };

doc.Range.Replace(regex, @"$2 takes money from $1", options);
```

### Пример исходного кода для распознавания и замены в шаблонах замены с использованием Aspose.Words для .NET

Вот полный пример исходного кода, иллюстрирующий использование совпадений и замен в шаблонах замены с помощью Aspose.Words для .NET:

```csharp

	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);

	builder.Write("Jason give money to Paul.");

	Regex regex = new Regex(@"([A-z]+) give money to ([A-z]+)");

	FindReplaceOptions options = new FindReplaceOptions { UseSubstitutions = true };

	doc.Range.Replace(regex, @"$2 take money from $1", options);

```

## Заключение

В этой статье мы изучили исходный код C#, чтобы понять, как использовать функцию распознавания и замены в шаблонах замены Aspose.Words для .NET. Мы следовали пошаговому руководству, чтобы создать документ, вставить текст, выполнить поиск и замену с использованием регулярных выражений и шаблонов подстановки на основе захваченных групп и управлять документом.
