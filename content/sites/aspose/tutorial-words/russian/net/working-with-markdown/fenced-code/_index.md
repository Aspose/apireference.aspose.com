---
title: Огражденный код
linktitle: Огражденный код
second_title: Справочник по API Aspose.Words для .NET
description: Узнайте, как использовать функцию изолированного кода с Aspose.Words для .NET. Пошаговое руководство.
type: docs
weight: 10
url: /ru/net/working-with-markdown/fenced-code/
---

В этом примере мы покажем вам, как использовать функцию изолированного кода с Aspose.Words для .NET. защищенный код используется для представления блоков кода с определенным форматированием.

## Шаг 1: Использование генератора документов

Во-первых, мы будем использовать генератор документов, чтобы добавить содержимое в наш документ.

```csharp
DocumentBuilder builder = new DocumentBuilder();
```

## Шаг 2. Добавление стиля для изолированного кода

 Мы добавим собственный стиль для изолированного кода, используя`Styles.Add` метод`Document` объект. В этом примере мы создаем стиль FencedCode для изолированного кода.

```csharp
Style fencedCode = builder.Document.Styles.Add(StyleType.Paragraph, "FencedCode");
builder.ParagraphFormat.Style = fencedCode;
```

## Шаг 3. Добавление защищенного кода без информации

Теперь мы можем добавить огороженный блок кода без информационной строки, используя собственный стиль «FencedCode».

```csharp
builder.Writeln("This is an fenced code");
```

## Шаг 4. Добавьте защищенный код с информационной строкой.

Мы также можем добавить выделенный блок кода со строкой информации, используя другой пользовательский стиль. В этом примере мы создаем стиль под названием «FencedCode.C#» для представления блока кода C#.

```csharp
Style fencedCodeWithInfo = builder.Document.Styles.Add(StyleType.Paragraph, "FencedCode.C#");
builder.ParagraphFormat.Style = fencedCodeWithInfo;
builder.Writeln("This is a fenced code with info string");
```

### Пример исходного кода для Fenced Code с использованием Aspose.Words для .NET

```csharp
	// Используйте конструктор документов, чтобы добавить содержимое в документ.
	DocumentBuilder builder = new DocumentBuilder();

	Style fencedCode = builder.Document.Styles.Add(StyleType.Paragraph, "FencedCode");
	builder.ParagraphFormat.Style = fencedCode;
	builder.Writeln("This is an fenced code");

	Style fencedCodeWithInfo = builder.Document.Styles.Add(StyleType.Paragraph, "FencedCode.C#");
	builder.ParagraphFormat.Style = fencedCodeWithInfo;
	builder.Writeln("This is a fenced code with info string");
            
```


