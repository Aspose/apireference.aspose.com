---
title: Сохранить права
linktitle: Сохранить права
second_title: Aspose.PDF для справочника API .NET
description: Сохраняйте права на формы в своих PDF-документах с помощью Aspose.PDF для .NET.
type: docs
weight: 210
url: /ru/net/programming-with-forms/preserve-rights/
---
В этом руководстве мы покажем вам, как сохранить права на форму в документе PDF с помощью Aspose.PDF для .NET. Мы объясним исходный код C# шаг за шагом, чтобы помочь вам в этом процессе.

## Шаг 1: Подготовка

Убедитесь, что вы импортировали необходимые библиотеки и указали путь к каталогу ваших документов:

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Шаг 2. Откройте документ

 Откройте исходный документ PDF с помощью`FileStream` с правами на чтение и запись:

```csharp
FileStream fs = new FileStream(dataDir + "input.pdf", FileMode.Open, FileAccess.ReadWrite);
Aspose.Pdf.Document pdfDocument = new Aspose.Pdf.Document(fs);
```

## Шаг 3: Редактируйте поля формы

Пройдитесь по всем полям формы в документе и внесите необходимые изменения. В этом примере мы изменяем значение поля формы, в имени которого есть «A1»:

```csharp
foreach(Field formField in pdfDocument.Form)
{
if (formField.FullName.Contains("A1"))
{
TextBoxField textBoxField = formField as TextBoxField;
textBoxField.Value = "Testing";
}
}
```

## Шаг 4: Сохраните обновленный документ

Сохраните измененный PDF-документ:

```csharp
pdfDocument.Save();
```

##  Шаг 5: Закройте`FileStream`

 Не забудьте закрыть`FileStream` объект, когда вы закончите:

```csharp
fs. Close();
```

### Пример исходного кода для сохранения прав с использованием Aspose.PDF для .NET 
```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Прочитайте исходную PDF-форму с помощью FileAccess для чтения и записи.
// Нам нужно разрешение на чтение и запись, потому что после модификации
// Нам нужно сохранить обновленное содержимое в том же документе/файле.
FileStream fs = new FileStream(dataDir + "input.pdf", FileMode.Open, FileAccess.ReadWrite);
// Создать экземпляр документа
Aspose.Pdf.Document pdfDocument = new Aspose.Pdf.Document(fs);
// Получить значения из всех полей
foreach (Field formField in pdfDocument.Form)
{
	// Если полное имя поля содержит A1, выполните операцию
	if (formField.FullName.Contains("A1"))
	{
		// Приведение поля формы как TextBox
		TextBoxField textBoxField = formField as TextBoxField;
		// Изменить значение поля
		textBoxField.Value = "Testing";
	}
}
// Сохраните обновленный документ в файле сохранения FileStream.
pdfDocument.Save();
// Закройте объект «Файловый поток».
fs.Close();
```

## Заключение

В этом руководстве мы узнали, как сохранить права формы в документе PDF с помощью Aspose.PDF для .NET. Следуя этим шагам, вы можете легко получать доступ к полям формы и вносить определенные изменения, сохраняя при этом права доступа и записи.


### Часто задаваемые вопросы

#### Вопрос: Могу ли я сохранить права определенных полей формы, не затрагивая другие в документе PDF?

 О: Да, с помощью`FullName` свойство полей формы, вы можете сохранить определенные поля формы, не затрагивая другие.

#### В: Могу ли я сохранить права формы в PDF-документе, защищенном паролем?

О: Да, Aspose.PDF для .NET позволяет сохранять права на форму даже в PDF-документах, защищенных паролем, если вы указываете правильный пароль для доступа и изменения файла.

#### В: Что произойдет, если я попытаюсь изменить поля формы без соответствующих прав доступа?

О: Если вы попытаетесь изменить поля формы без соответствующих прав доступа, изменения не будут сохранены в документе PDF, и вы можете получить исключение или сообщение об ошибке.

#### В: Совместим ли Aspose.PDF для .NET со всеми версиями .NET Framework?

О: Да, Aspose.PDF для .NET совместим со всеми версиями .NET Framework, включая .NET Core и .NET Standard.

#### Вопрос. Можно ли программно сохранить права на форму в PDF-документе на других языках программирования, кроме C#?

О: Да, Aspose.PDF для .NET поддерживает различные языки программирования, такие как VB.NET и ASP.NET, в дополнение к C#.