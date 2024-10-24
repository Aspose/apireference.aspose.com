---
title: Замените отсутствующие шрифты
linktitle: Замените отсутствующие шрифты
second_title: Aspose.PDF для справочника API .NET
description: Пошаговое руководство по замене отсутствующих шрифтов в файле PDF с помощью Aspose.PDF для .NET.
type: docs
weight: 260
url: /ru/net/document-conversion/replace-missing-fonts/
---
В этом руководстве мы познакомим вас с процессом замены отсутствующих шрифтов в файле PDF с помощью Aspose.PDF для .NET. Когда вы открываете файл PDF на компьютере, где отсутствует определенный шрифт, могут возникнуть проблемы с отображением шрифта. В таких случаях можно заменить отсутствующий шрифт другим шрифтом, доступным на машине. Следуя приведенным ниже инструкциям, вы сможете заменить отсутствующие шрифты в файле PDF.

## Предпосылки
Прежде чем начать, убедитесь, что выполнены следующие условия:

- Базовые знания языка программирования С#.
- Библиотека Aspose.PDF для .NET, установленная в вашей системе.
- Среда разработки, такая как Visual Studio.

## Шаг 1. Поиск недостающего шрифта
Первый шаг — найти отсутствующий шрифт в файле PDF. Используйте следующий код:

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

Aspose.Pdf.Text.Font originalFont = null;
try
{
     // Найдите оригинальный шрифт
     originalFont = FontRepository.FindFont("AgencyFB");
}
catch(Exception)
{
     // Шрифт отсутствует на целевом компьютере
     // Добавить простую замену шрифта
     FontRepository.Substitutions.Add(new SimpleFontSubstitution("AgencyFB", "Arial"));
}
```

 Обязательно замените`"YOUR DOCUMENTS DIRECTORY"` с фактическим каталогом, в котором находится ваш файл PDF.

## Шаг 2. Замените отсутствующий шрифт
Далее мы заменим отсутствующий шрифт другим доступным шрифтом. Используйте следующий код:

```csharp
var fileNew = new FileInfo(dataDir + "newfile_out.pdf");
var pdf = new Document(dataDir + "input.pdf");

// Преобразование файла PDF в формат PDF/A с удалением ошибок
pdf.Convert(dataDir + "log.xml", PdfFormat.PDF_A_1B, ConvertErrorAction.Delete);

// Сохраните полученный PDF-файл
pdf.Save(fileNew.FullName);
```

 Обязательно замените`"input.pdf"` с фактическим путем к исходному файлу PDF и`"newfile_out.pdf"` с желаемым именем для полученного PDF-файла.

## Шаг 3: Сохранение полученного PDF-файла
Наконец, мы сохраним полученный файл PDF с замененным шрифтом. Используйте следующий код:

```csharp
// Сохраните полученный PDF-файл
pdf.Save(fileNew.FullName);
```

Гарантирует, что вы установили правильный путь назначения для результирующего PDF-файла.

### Пример исходного кода для замены отсутствующих шрифтов с помощью Aspose.PDF для .NET

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";

Aspose.Pdf.Text.Font originalFont = null;
try
{
	originalFont = FontRepository.FindFont("AgencyFB");
}
catch (Exception)
{
	// Шрифт отсутствует на целевой машине
	FontRepository.Substitutions.Add(new SimpleFontSubstitution("AgencyFB", "Arial"));
}
var fileNew = new FileInfo(dataDir + "newfile_out.pdf");
var pdf = new Document(dataDir + "input.pdf");
pdf.Convert( dataDir +  "log.xml", PdfFormat.PDF_A_1B, ConvertErrorAction.Delete);
pdf.Save(fileNew.FullName);
```

## Заключение
В этом руководстве мы рассмотрели пошаговый процесс замены отсутствующих шрифтов в файле PDF с помощью Aspose.PDF для .NET. Следуя приведенным выше инструкциям, вы сможете успешно заменить отсутствующие шрифты в файле PDF.

### Часто задаваемые вопросы

#### В: Что такое Aspose.PDF для .NET?

О: Aspose.PDF для .NET — это мощная библиотека, которая позволяет разработчикам работать с PDF-документами в приложениях C#. Он предлагает различные функции, в том числе возможность замены отсутствующих шрифтов в файлах PDF.

#### В: Почему я могу столкнуться с отсутствующими шрифтами в файле PDF?

О: Отсутствующие шрифты в файле PDF могут возникать, когда файл открывается на компьютере, на котором не установлены необходимые шрифты. Это может привести к замене шрифта, что повлияет на внешний вид документа.

#### В: Как найти и заменить отсутствующие шрифты в файле PDF с помощью Aspose.PDF для .NET?

 A: Чтобы найти и заменить отсутствующие шрифты, вы можете использовать`FontRepository.FindFont` способ проверки наличия необходимого шрифта. Если шрифт отсутствует, вы можете добавить замену шрифта с помощью`FontRepository.Substitutions` свойство.

#### В: Могу ли я настроить процесс замены шрифта?

О: Да, вы можете настроить процесс замены шрифта, указав другой шрифт для замены. В предоставленном коде мы использовали Arial вместо отсутствующего шрифта «AgencyFB», но вы можете выбрать другой шрифт в соответствии со своими предпочтениями.

#### В: Как я могу обеспечить точность отрисовки шрифта после замены?

О: Aspose.PDF для .NET предоставляет надежные возможности обработки шрифтов, обеспечивая точную визуализацию шрифта после замены. Вы можете предварительно просмотреть полученный PDF-файл, чтобы проверить замену шрифта.