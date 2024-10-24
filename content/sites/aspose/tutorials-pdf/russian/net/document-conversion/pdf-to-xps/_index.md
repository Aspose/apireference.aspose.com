---
title: PDF в XPS
linktitle: PDF в XPS
second_title: Aspose.PDF для справочника API .NET
description: Пошаговое руководство по преобразованию PDF в XPS с помощью Aspose.PDF для .NET.
type: docs
weight: 220
url: /ru/net/document-conversion/pdf-to-xps/
---
В этом руководстве мы познакомим вас с процессом преобразования PDF-файла в формат XPS (XML Paper Specification) с использованием Aspose.PDF для .NET. Формат XPS — это формат файлов на основе XML, используемый для электронного представления документов. Следуя приведенным ниже инструкциям, вы сможете преобразовать файл PDF в формат XPS.

## Предпосылки
Прежде чем начать, убедитесь, что выполнены следующие условия:

- Базовые знания языка программирования С#.
- Библиотека Aspose.PDF для .NET, установленная в вашей системе.
- Среда разработки, такая как Visual Studio.

## Шаг 1: Загрузка PDF-документа
На этом этапе мы загрузим исходный PDF-файл, используя Aspose.PDF для .NET. Следуйте приведенному ниже коду:

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Загрузите PDF-документ
Document pdfDocument = new Document(dataDir + "input.pdf");
```

 Обязательно замените`"YOUR DOCUMENTS DIRECTORY"` с фактическим каталогом, в котором находится ваш файл PDF.

## Шаг 2. Задайте параметры сохранения XPS
После загрузки файла PDF мы установим параметры сохранения XPS. Используйте следующий код:

```csharp
// Создание экземпляров параметров сохранения XPS
Aspose.Pdf.XpsSaveOptions saveOptions = new Aspose.Pdf.XpsSaveOptions();
```

## Шаг 3: Сохранение полученного XPS-файла
Теперь мы сохраним преобразованный файл PDF в формате XPS. Используйте следующий код:

```csharp
// Сохраните XPS-документ
pdfDocument.Save("PDFToXPS_out.xps", saveOptions);
```

 Приведенный выше код сохраняет преобразованный файл PDF в формате XPS с именем файла`"PDFToXPS_out.xps"`.


### Пример исходного кода для преобразования PDF в XPS с использованием Aspose.PDF для .NET

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Загрузить PDF-документ
Document pdfDocument = new Document(dataDir + "input.pdf");

// Создать параметры сохранения XPS
Aspose.Pdf.XpsSaveOptions saveOptions = new Aspose.Pdf.XpsSaveOptions();

// Сохраните XPS-документ
pdfDocument.Save("PDFToXPS_out.xps", saveOptions);
```

## Заключение
В этом руководстве мы рассмотрели пошаговый процесс преобразования файла PDF в формат XPS с помощью Aspose.PDF для .NET. Следуя инструкциям, изложенным выше, теперь вы сможете преобразовать файл PDF в формат XPS. Эта функция полезна, если вы хотите просмотреть или распечатать документы PDF в формате XPS.

### Часто задаваемые вопросы

#### В: Подходит ли формат XPS для кроссплатформенной совместимости?

О: Формат XPS, являющийся файловым форматом на основе XML, не зависит от платформы и может просматриваться в различных операционных системах и устройствах. Файлы XPS поддерживаются на платформах Windows по умолчанию, а некоторые сторонние приложения и средства просмотра могут быть доступны для других платформ.

#### В: Может ли Aspose.PDF для .NET обрабатывать сложные PDF-файлы с несколькими страницами и изображениями во время преобразования XPS?

О: Да, Aspose.PDF для .NET может обрабатывать сложные PDF-файлы с несколькими страницами и изображениями во время преобразования XPS. Он точно сохраняет макет, изображения и текстовое содержимое PDF-файла при преобразовании его в формат XPS.

#### В: Можно ли указать дополнительные параметры или параметры в процессе преобразования XPS?

 О: Да, Aspose.PDF для .NET предоставляет различные параметры и настройки, которые можно настроить в процессе преобразования XPS. Вы можете управлять сжатием изображения, встраиванием шрифта и другими настройками с помощью`XpsSaveOptions` сорт.

#### В: Можно ли преобразовать PDF-файлы, защищенные паролем, в формат XPS с помощью Aspose.PDF для .NET?

 О: Да, Aspose.PDF для .NET поддерживает преобразование PDF-файлов, защищенных паролем, в формат XPS. При загрузке PDF-файла, защищенного паролем, вы можете указать пароль, используя`Document` конструктор класса или установив`Password` свойство перед загрузкой PDF.