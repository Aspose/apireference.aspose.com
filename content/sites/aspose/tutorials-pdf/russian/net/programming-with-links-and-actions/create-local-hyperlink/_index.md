---
title: Создать локальную гиперссылку в файле PDF
linktitle: Создать локальную гиперссылку в файле PDF
second_title: Aspose.PDF для справочника API .NET
description: Легко создавайте локальные гиперссылки в файле PDF, используя Aspose.PDF для .NET.
type: docs
weight: 40
url: /ru/net/programming-with-links-and-actions/create-local-hyperlink/
---
Создание локальных гиперссылок в файле PDF позволяет создавать интерактивные ссылки, которые ведут пользователей на другие страницы в том же документе PDF. С Aspose.PDF для .NET вы можете легко создавать такие ссылки, следуя следующему исходному коду:

## Шаг 1. Импорт необходимых библиотек

Прежде чем начать, вам нужно импортировать необходимые библиотеки для вашего проекта C#. Вот необходимая директива импорта:

```csharp
using Aspose.Pdf;
using Aspose.Pdf.Text;
using Aspose.Pdf.InteractiveFeatures;
```

## Шаг 2. Укажите путь к папке с документами.

 На этом шаге вам нужно указать путь к папке, в которой вы хотите сохранить полученный PDF-файл. Заменять`"YOUR DOCUMENT DIRECTORY"`в следующем коде с фактическим путем к вашей папке документов:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## Шаг 3: Создайте экземпляр документа

 Мы создадим экземпляр`Document` класс для представления нашего PDF-документа. Вот соответствующий код:

```csharp
Document doc = new Document();
```

## Шаг 4: Добавьте страницу и текст с гиперссылками

На этом шаге мы добавим страницу в наш документ PDF и добавим текст, содержащий локальные гиперссылки. Мы определим целевые страницы для каждой ссылки. Вот соответствующий код:

```csharp
Page page = doc.Pages.Add();

TextFragment text = new TextFragment("Link to page 7");
LocalHyperlink link = new LocalHyperlink();
link.TargetPageNumber = 7;
text. Hyperlink = link;
page.Paragraphs.Add(text);

text = new TextFragment("Link to page 1");
text. IsInNewPage = true;
link = new LocalHyperlink();
link.TargetPageNumber = 1;
text. Hyperlink = link;
page.Paragraphs.Add(text);
```

## Шаг 5: Сохраните обновленный документ

 Теперь давайте сохраним обновленный PDF-файл, используя`Save` метод`doc` объект. Вот соответствующий код:

```csharp
dataDir = dataDir + "CreateLocalHyperlink_out.pdf";
doc.Save(dataDir);
```

### Пример исходного кода для создания локальной гиперссылки с использованием Aspose.PDF для .NET 
```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Создать экземпляр документа
Document doc = new Document();
// Добавить страницу в коллекцию страниц файла PDF
Page page = doc.Pages.Add();
// Создать экземпляр текстового фрагмента
Aspose.Pdf.Text.TextFragment text = new Aspose.Pdf.Text.TextFragment("link page number test to page 7");
// Создать локальный экземпляр гиперссылки
Aspose.Pdf.LocalHyperlink link = new Aspose.Pdf.LocalHyperlink();
// Установить целевую страницу для экземпляра ссылки
link.TargetPageNumber = 7;
// Установить гиперссылку TextFragment
text.Hyperlink = link;
//Добавить текст в коллекцию абзацев страницы
page.Paragraphs.Add(text);
// Создать новый экземпляр TextFragment
text = new TextFragment("link page number test to page 1");
// TextFragment должен быть добавлен на новую страницу
text.IsInNewPage = true;
// Создайте другой локальный экземпляр гиперссылки
link = new LocalHyperlink();
// Установить целевую страницу для второй гиперссылки
link.TargetPageNumber = 1;
// Установить ссылку для второго TextFragment
text.Hyperlink = link;
// Добавить текст в коллекцию абзацев объекта страницы
page.Paragraphs.Add(text);    
dataDir = dataDir + "CreateLocalHyperlink_out.pdf";
// Сохранить обновленный документ
doc.Save(dataDir);
Console.WriteLine("\nLocal hyperlink created successfully.\nFile saved at " + dataDir);            
```

## Заключение

Поздравляем! Теперь у вас есть пошаговое руководство по созданию локальных гиперссылок в PDF с помощью Aspose.PDF для .NET. Вы можете использовать этот код для создания интерактивных ссылок, которые перенаправляют пользователей на другие страницы того же документа.

Обязательно ознакомьтесь с официальной документацией Aspose.PDF для получения дополнительной информации о расширенных функциях гиперссылок.

### Часто задаваемые вопросы по созданию локальной гиперссылки в файле PDF

#### В: Что такое локальные гиперссылки в файле PDF?

О. Локальные гиперссылки в файле PDF — это интерактивные ссылки, по которым пользователи переходят на разные страницы одного и того же документа. Эти ссылки улучшают навигацию и позволяют читателям быстро получить доступ к нужным разделам.

#### В: Какую пользу могут принести локальные гиперссылки моему PDF-документу?

О. Локальные гиперссылки обеспечивают эффективный способ соединения связанного содержимого в одном и том же документе PDF. Они улучшают взаимодействие с пользователем, позволяя читателям быстро переходить к определенным разделам, не прокручивая весь документ.

#### В: Как Aspose.PDF для .NET поддерживает создание локальных гиперссылок?
О: Aspose.PDF для .NET предлагает всестороннюю поддержку для создания локальных гиперссылок. В пошаговом руководстве, представленном в этом руководстве, показано, как добавить локальные гиперссылки в документ PDF с помощью C#.

#### В: Могу ли я настроить внешний вид локальных гиперссылок?

О: Да, вы можете настроить внешний вид локальных гиперссылок, включая цвет и стиль текста, чтобы они соответствовали дизайну вашего документа и обеспечивали согласованное визуальное восприятие.

#### В: Можно ли создать несколько локальных гиперссылок на одной странице PDF?

О: Абсолютно! Вы можете создать несколько локальных гиперссылок на одной странице PDF, что позволит читателям переходить к различным разделам или страницам по мере необходимости. Каждая локальная гиперссылка может быть адаптирована к соответствующей цели.

#### В: Могу ли я ссылаться на определенные разделы страницы, используя локальные гиперссылки?

О. Хотя локальные гиперссылки обычно ведут на целые страницы, вы можете создавать якоря или закладки в документе PDF, чтобы создавать целевые ссылки. Aspose.PDF для .NET поддерживает различные варианты гиперссылок.

#### В: Как я могу убедиться, что мои локальные гиперссылки работают правильно?

О: Следуя предоставленному учебному пособию и образцу кода, вы сможете уверенно создавать функциональные локальные гиперссылки. Вы можете проверить ссылки, открыв сгенерированный PDF-документ и щелкнув текст с гиперссылкой.

#### В: Существуют ли какие-либо ограничения при использовании локальных гиперссылок?

О: Локальные гиперссылки — это эффективный способ улучшить навигацию по документу, но важно, чтобы структура документа оставалась ясной и интуитивно понятной. Правильно помеченные гиперссылки и якоря способствуют положительному взаимодействию с пользователем.

#### В: Могу ли я создавать локальные гиперссылки в таблицах или изображениях?

О: Да, вы можете создавать локальные гиперссылки в различных элементах документа PDF, включая таблицы, изображения и текст. Aspose.PDF для .NET предлагает гибкость в добавлении гиперссылок к различным типам контента.