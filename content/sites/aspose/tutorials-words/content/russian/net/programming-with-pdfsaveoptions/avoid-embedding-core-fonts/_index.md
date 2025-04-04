---
title: Уменьшите размер PDF-файла, не встраивая основные шрифты
linktitle: Уменьшите размер PDF-файла, не встраивая основные шрифты
second_title: API обработки документов Aspose.Words
description: Узнайте, как уменьшить размер PDF-файла, не встраивая основные шрифты при преобразовании документов Word в PDF с помощью Aspose.Words для .NET.
type: docs
weight: 10
url: /ru/net/programming-with-pdfsaveoptions/avoid-embedding-core-fonts/
---

В этом уроке мы покажем вам, как уменьшить размер PDF-файла, не встраивая основные шрифты с помощью Aspose.Words для .NET. Эта функция позволяет вам контролировать, должны ли основные шрифты, такие как Arial, Times New Roman и т. д., быть встроены в PDF при преобразовании документа Word. Выполните следующие действия:

## Шаг 1: Загрузка документа

Начните с загрузки документа Word, который вы хотите преобразовать в PDF:

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
Document doc = new Document(dataDir + "Rendering.docx");
```

Обязательно укажите правильный путь к документу Word.

## Шаг 2. Установите параметры преобразования PDF

Создайте экземпляр класса PdfSaveOptions и включите базовое предотвращение внедрения шрифтов:

```csharp
PdfSaveOptions saveOptions = new PdfSaveOptions { UseCoreFonts = true };
```

Этот параметр определяет, должны ли базовые шрифты быть встроены в PDF-файл или нет.

## Шаг 3. Конвертируйте документ в PDF

 Использовать`Save` метод преобразования документа Word в PDF с указанием параметров преобразования:

```csharp
doc.Save(dataDir + "WorkingWithPdfSaveOptions.AvoidEmbeddingCoreFonts.pdf", saveOptions);
```

Обязательно укажите правильный путь для сохранения преобразованного PDF-файла.

### Пример исходного кода для отказа от внедрения основных шрифтов с помощью Aspose.Words для .NET

Вот полный исходный код для использования этой функции, чтобы избежать встраивания основных шрифтов в Aspose.Words для .NET:

```csharp

	// Путь к каталогу документов.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(dataDir + "Rendering.docx");

	// Выходной PDF-файл не будет встроен в основные шрифты, такие как Arial, Times New Roman и т. д.
	PdfSaveOptions saveOptions = new PdfSaveOptions { UseCoreFonts = true };
	
	doc.Save(dataDir + "WorkingWithPdfSaveOptions.AvoidEmbeddingCoreFonts.pdf", saveOptions);

```

Следуя этим шагам, вы можете легко контролировать, следует ли встраивать базовые шрифты в PDF при преобразовании документа Word с помощью Aspose.Words для .NET.


## Заключение

В этом уроке мы объяснили, как уменьшить размер PDF-файла, не встраивая базовые шрифты с помощью Aspose.Words для .NET. Эта функция позволяет вам контролировать, следует ли внедрять базовые шрифты в PDF при преобразовании документа Word. Следуя описанным шагам, вы можете легко контролировать встраивание или невстраивание основных шрифтов, что может помочь уменьшить размер PDF-файла и обеспечить лучшую совместимость и единообразный вид документа на разных устройствах и платформах. Не забудьте учесть последствия отсутствия встраивания базовых шрифтов и поэкспериментировать, чтобы гарантировать, что документ отображается должным образом.

### Часто задаваемые вопросы

#### Вопрос: Как можно не встраивать базовые шрифты в PDF-файл и почему это важно?
О: Параметр «Не встраивать базовые шрифты в PDF-файл» определяет, должны ли базовые шрифты, такие как Arial, Times New Roman и т. д., быть встроены в PDF-файл при преобразовании документа Word. Это может быть важно для уменьшения размера файла PDF, избегая включения шрифтов, обычно доступных в системах чтения PDF. Это также может помочь обеспечить лучшую совместимость и единообразный внешний вид PDF-документа на разных устройствах и платформах.

#### Вопрос: Как мне настроить Aspose.Words для .NET, чтобы он не встраивал базовые шрифты в PDF-файл?
О: Чтобы настроить Aspose.Words для .NET так, чтобы он не встраивал основные шрифты в PDF-файл, выполните следующие действия:

 Задайте путь к каталогу, в котором расположены ваши документы, заменив`"YOUR DOCUMENTS DIRECTORY"` с фактическим путем к каталогу ваших документов.

 Загрузите документ Word, который хотите преобразовать в PDF, с помощью`Document` класс и указанный путь к документу.

 Создайте экземпляр`PdfSaveOptions` класс и установите`UseCoreFonts` собственность`true`. Это позволит избежать внедрения базовых шрифтов в созданный PDF-файл.

 Использовать`Save` метод`Document` объект для сохранения документа в формате PDF с указанием ранее настроенных параметров преобразования.

#### Вопрос: Каковы преимущества отсутствия встраивания базовых шрифтов в PDF-файл?
О: Преимущества отсутствия встраивания базовых шрифтов в файл PDF:

Уменьшение размера PDF-файла. Избегая встраивания общедоступных шрифтов, таких как Arial, Times New Roman и т. д., можно уменьшить размер PDF-файла, что упрощает хранение, обмен и передачу файлов.

Лучшая совместимость. Используя базовые шрифты, обычно доступные в системах чтения PDF-файлов, вы обеспечиваете лучшую совместимость и внешний вид документа на разных устройствах и платформах.

#### Вопрос: Каковы последствия отсутствия встраивания базовых шрифтов в PDF-файл?
О: Если не встроить базовые шрифты в PDF-файл, последствия будут следующими:

Другой внешний вид: если базовые шрифты недоступны в системе, в которой открыт PDF-файл, будут использоваться замещающие шрифты, что может привести к тому, что внешний вид будет отличаться от предполагаемого.

Проблемы с читаемостью. Используемые заменяющие шрифты могут быть не такими разборчивыми, как исходные шрифты, что может повлиять на читаемость документа.