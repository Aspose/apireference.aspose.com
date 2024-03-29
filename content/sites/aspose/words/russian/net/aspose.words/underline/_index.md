---
title: Underline Enum
linktitle: Underline
articleTitle: Underline
second_title: Aspose.Words для .NET
description: Aspose.Words.Underline перечисление. Указывает тип подчеркивания примененного к шрифту на С#.
type: docs
weight: 6510
url: /ru/net/aspose.words/underline/
---
## Underline enumeration

Указывает тип подчеркивания, примененного к шрифту.

```csharp
public enum Underline
```

### Ценности

| Имя | Ценность | Описание |
| --- | --- | --- |
| None | `0` |  |
| Single | `1` |  |
| Words | `2` |  |
| Double | `3` |  |
| Dotted | `4` |  |
| Thick | `6` |  |
| Dash | `7` |  |
| DashLong | `39` |  |
| DotDash | `9` |  |
| DotDotDash | `10` |  |
| Wavy | `11` |  |
| DottedHeavy | `20` |  |
| DashHeavy | `23` |  |
| DashLongHeavy | `55` |  |
| DotDashHeavy | `25` |  |
| DotDotDashHeavy | `26` |  |
| WavyHeavy | `27` |  |
| WavyDouble | `43` |  |

## Примеры

Показывает, как вставить поле гиперссылки.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Write("For more information, please visit the ");

// Вставьте гиперссылку и подчеркните ее с помощью специального форматирования.
// Гиперссылка будет интерактивным фрагментом текста, который приведет нас к месту, указанному в URL-адресе.
builder.Font.Color = Color.Blue;
builder.Font.Underline = Underline.Single;
builder.InsertHyperlink("Google website", "https://www.google.com", false);
builder.Font.ClearFormatting();
builder.Writeln(".");

// Ctrl + щелчок левой кнопкой мыши по ссылке в тексте в Microsoft Word приведет нас к URL-адресу через новое окно веб-браузера.
doc.Save(ArtifactsDir + "DocumentBuilder.InsertHyperlink.docx");
```

### Смотрите также

* пространство имен [Aspose.Words](../../aspose.words/)
* сборка [Aspose.Words](../../)
