---
title: Преобразование полей в абзаце
linktitle: Преобразование полей в абзаце
second_title: Справочник по API Aspose.Words для .NET
description: Преобразуйте поля ЕСЛИ в обычный текст в абзаце с помощью Aspose.Words для .NET.
type: docs
weight: 10
url: /ru/net/working-with-fields/convert-fields-in-paragraph/
---

Вот руководство, демонстрирующее, как использовать функцию «Преобразовать поля в абзацы» с Aspose.Words для .NET. Этот код преобразует все поля типа IF, встречающиеся в последнем абзаце документа, в обычный текст. Выполните следующие шаги, чтобы понять и запустить этот код.

Прежде чем начать, убедитесь, что вы установили Aspose.Words для .NET и настроили среду разработки.

## Шаг 1. Импорт ссылок

Чтобы использовать Aspose.Words в своем проекте, вам необходимо добавить необходимые ссылки. Убедитесь, что вы добавили ссылку на библиотеку Aspose.Words в свой проект.

## Шаг 2: Загрузка документа

Прежде чем вы сможете преобразовать поля, вы должны загрузить документ, содержащий поля для преобразования. Обязательно укажите правильный путь к каталогу, содержащему документ. Вот как загрузить документ:

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Загрузите документ.
Document doc = new Document(dataDir + "Linked fields.docx");
```

Замените «КАТАЛОГ ВАШИХ ДОКУМЕНТОВ» на фактический путь к каталогу ваших документов.

## Шаг 3. Преобразование полей в текст

Теперь, когда документ загружен, мы можем приступить к преобразованию полей типа в обычный текст. В этом примере мы ориентируемся только на поля, присутствующие в последнем абзаце документа. Вот код, который выполняет это преобразование:

```csharp
doc.FirstSection.Body.LastParagraph.Range.Fields
     .Where(f => f.Type == FieldType.FieldIf)
     .ToList()
     .ForEach(f => f.Unlink());
```

 Этот код использует комбинацию методов LINQ для фильтрации полей в последнем абзаце документа, а затем преобразует их в обычный текст, вызывая метод`Unlink()` метод.

## Шаг 4: Сохранение измененного документа

 После преобразования полей вы можете сохранить измененный документ. Использовать`Save()` метод для этого. Вот пример:

```csharp
doc.Save(dataDir + "WorkingWithFields.TestFile.docx");
```

Обязательно укажите правильный путь и имя файла для резервной копии.

### Пример исходного кода для преобразования полей в абзац с использованием Aspose.Words для .NET

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Загрузите документ.
Document doc = new Document(dataDir + "Linked fields.docx");

// Преобразование полей ЕСЛИ в обычный текст в последнем абзаце документа.
doc.FirstSection.Body.LastParagraph.Range.Fields
     .Where(f => f.Type == FieldType.FieldIf)
     .ToList()
     .ForEach(f => f.Unlink());

// Сохраните измененный документ.
doc.Save(dataDir + "WorkingWithFields.TestFile.docx");
```
