---
title: BuiltInDocumentProperties.LastPrinted
linktitle: LastPrinted
articleTitle: LastPrinted
second_title: Aspose.Words для .NET
description: BuiltInDocumentProperties LastPrinted свойство. Получает или задает дату последней печати документа в формате UTC на С#.
type: docs
weight: 150
url: /ru/net/aspose.words.properties/builtindocumentproperties/lastprinted/
---
## BuiltInDocumentProperties.LastPrinted property

Получает или задает дату последней печати документа в формате UTC.

```csharp
public DateTime LastPrinted { get; set; }
```

## Примечания

Для документов, созданных в формате RTF, это свойство возвращает местное время последней операции печати.

Если документ никогда не печатался, это свойство вернет DateTime.MinValue.

Aspose.Words не обновляет это свойство.

## Примеры

Показывает, как работать со свойствами документа в категории «Происхождение».

```csharp
// Откройте документ, который мы создали и отредактировали с помощью Microsoft Word.
Document doc = new Document(MyDir + "Properties.docx");
BuiltInDocumentProperties properties = doc.BuiltInDocumentProperties;

// Следующие встроенные свойства содержат информацию о создании и редактировании этого документа.
// Мы можем щелкнуть этот документ правой кнопкой мыши в проводнике Windows и найти
// эти свойства через "Свойства" -> «Подробности» -> Категория «Происхождение».
// Такие поля, как PRINTDATE и EDITTIME, могут отображать эти значения в теле документа.
Console.WriteLine($"Created using {properties.NameOfApplication}, on {properties.CreatedTime}");
Console.WriteLine($"Minutes spent editing: {properties.TotalEditingTime}");
Console.WriteLine($"Date/time last printed: {properties.LastPrinted}");
Console.WriteLine($"Template document: {properties.Template}");

// Мы также можем изменить значения встроенных свойств.
properties.Company = "Doe Ltd.";
properties.Manager = "Jane Doe";
properties.Version = 5;
properties.RevisionNumber++;

// Microsoft Word автоматически обновляет следующие свойства при сохранении документа.
// Чтобы использовать эти свойства с Aspose.Words, нам нужно будет установить для них значения вручную.
properties.LastSavedBy = "John Doe";
properties.LastSavedTime = DateTime.Now;

// Мы можем щелкнуть этот документ правой кнопкой мыши в проводнике Windows и найти these properties in "Properties" -> "Details" -> "Origin".
doc.Save(ArtifactsDir + "DocumentProperties.Origin.docx");
```

### Смотрите также

* class [BuiltInDocumentProperties](../)
* пространство имен [Aspose.Words.Properties](../../../aspose.words.properties/)
* сборка [Aspose.Words](../../../)
