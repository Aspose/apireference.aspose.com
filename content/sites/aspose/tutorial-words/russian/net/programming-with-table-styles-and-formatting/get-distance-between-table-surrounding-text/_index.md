---
title: Получить расстояние между таблицей, окружающей текст
linktitle: Получить расстояние между таблицей, окружающей текст
second_title: Справочник по API Aspose.Words для .NET
description: Пошаговое руководство по определению расстояния между текстом и таблицей в документе Word с помощью Aspose.Words для .NET.
type: docs
weight: 10
url: /ru/net/programming-with-table-styles-and-formatting/get-distance-between-table-surrounding-text/
---

В этом руководстве мы проведем вас через пошаговый процесс, чтобы получить расстояние между окружающим текстом в таблице с помощью Aspose.Words для .NET. Мы объясним прилагаемый исходный код C# и предоставим вам исчерпывающее руководство, которое поможет вам понять и реализовать эту функцию в ваших собственных проектах. В конце этого руководства вы узнаете, как получить доступ к различным расстояниям между таблицей и окружающим текстом в ваших документах Word с помощью Aspose.Words для .NET.

## Шаг 1: Определите каталог документов
Во-первых, вам нужно указать путь к каталогу ваших документов. Здесь находится ваш документ Word. Замените «КАТАЛОГ ВАШИХ ДОКУМЕНТОВ» на соответствующий путь.

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Шаг 2: Загрузите существующий документ
 Далее вам нужно загрузить существующий документ Word в экземпляр`Document` сорт.

```csharp
Document doc = new Document(dataDir + "Tables.docx");
```

## Шаг 3: Получите расстояние между таблицей и окружающим текстом
 Чтобы получить расстояние между таблицей и окружающим текстом, нам нужно получить доступ к таблице в документе с помощью`GetChild()` метод и`NodeType.Table` свойство. Затем мы можем отобразить различные расстояния, используя свойства массива.`DistanceTop`, `DistanceBottom`, `DistanceRight` и`DistanceLeft`.

```csharp
Table table = (Table)doc.GetChild(NodeType.Table, 0, true);
Console.WriteLine("Distance between table and top text: " + table.DistanceTop);
Console.WriteLine("Distance between table and bottom text: " + table.DistanceBottom);
Console.WriteLine("Distance between the table and the text on the right: " + table.DistanceRight);
Console.WriteLine("Distance between the table and the text on the left: " + table.DistanceLeft);
```

### Пример исходного кода для получения расстояния между текстом, окружающим таблицу, с использованием Aspose.Words для .NET 

```csharp
	// Путь к вашему каталогу документов
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document doc = new Document(dataDir + "Tables.docx");
	Console.WriteLine("\nGet distance between table left, right, bottom, top and the surrounding text.");
	Table table = (Table) doc.GetChild(NodeType.Table, 0, true);
	Console.WriteLine(table.DistanceTop);
	Console.WriteLine(table.DistanceBottom);
	Console.WriteLine(table.DistanceRight);
	Console.WriteLine(table.DistanceLeft);
```

## Заключение
В этом уроке мы узнали, как получить расстояние между окружающим текстом в таблице с помощью Aspose.Words для .NET. Следуя этому пошаговому руководству, вы сможете легко получить доступ к различным расстояниям между таблицей и окружающим текстом в ваших документах Word. Aspose.Words предлагает мощный и гибкий API для управления и форматирования таблиц в ваших документах. Обладая этими знаниями, вы можете анализировать расположение своих таблиц по отношению к тексту и удовлетворять конкретные потребности.