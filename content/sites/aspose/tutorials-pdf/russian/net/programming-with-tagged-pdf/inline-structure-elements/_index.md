---
title: Встроенные элементы структуры
linktitle: Встроенные элементы структуры
second_title: Aspose.PDF для справочника API .NET
description: Пошаговое руководство по использованию структурных элементов онлайн с Aspose.PDF для .NET. Организуйте свои PDF-файлы с помощью заголовков и абзацев.
type: docs
weight: 110
url: /ru/net/programming-with-tagged-pdf/inline-structure-elements/
---
В этом пошаговом руководстве мы покажем вам, как использовать встроенные элементы структуры с Aspose.PDF для .NET. Aspose.PDF — это мощная библиотека, позволяющая программно управлять PDF-документами. Элементы встроенной структуры позволяют создавать иерархическую структуру в документе PDF с использованием заголовков разных уровней и абзацев.

Давайте углубимся в код и узнаем, как использовать встроенные элементы структуры с Aspose.PDF для .NET.

## Предпосылки

Прежде чем начать, убедитесь, что у вас есть следующее:

1. Установлена библиотека Aspose.PDF для .NET.
2. Базовые знания языка программирования C#.

## Шаг 1. Настройка среды

Для начала откройте среду разработки C# и создайте новый проект. Убедитесь, что вы добавили в свой проект ссылку на библиотеку Aspose.PDF для .NET.

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Шаг 2: Создание документа

 Первым шагом является создание нового документа PDF с помощью`Document` сорт.

```csharp
// Создайте PDF-документ
Document document = new Document();
```

## Шаг 3. Работа с размеченным контентом

Затем мы получаем тегированное содержимое документа для работы.

```csharp
// Получить тегированное содержимое документа
ITaggedContent taggedContent = document.TaggedContent;
```

## Шаг 4: Установите название документа и язык

Теперь мы можем установить название документа и язык.

```csharp
// Определите название документа и язык
taggedContent.SetTitle("Tagged PDF document");
taggedContent.SetLanguage("fr-FR");
```

## Шаг 5: Добавьте структурные элементы онлайн

Теперь мы собираемся добавить в наш документ встроенные элементы структуры, такие как заголовки разных уровней и абзацы.

```csharp
// Получить элемент корневой структуры
StructureElement rootElement = taggedContent.RootElement;

// Добавляйте заголовки разных уровней
HeaderElement h1 = taggedContent.CreateHeaderElement(1);
HeaderElement h2 = taggedContent.CreateHeaderElement(2);
HeaderElement h3 = taggedContent.CreateHeaderElement(3);
HeaderElement h4 = taggedContent.CreateHeaderElement(4);
HeaderElement h5 = taggedContent.CreateHeaderElement(5);
HeaderElement h6 = taggedContent.CreateHeaderElement(6);
rootElement.AppendChild(h1);
rootElement.AppendChild(h2);
rootElement.AppendChild(h3);
rootElement.AppendChild(h4);
rootElement.AppendChild(h5);
rootElement.AppendChild(h6);

// Добавьте содержимое в каждый заголовок
SpanElement spanH11 = taggedContent.CreateSpanElement();
spanH11.SetText("H1.");
h1.AppendChild(spanH11);
SpanElement spanH12 = taggedContent.CreateSpanElement();
spanH12.SetText("Level 1 header");
h1.AppendChild(spanH12);

SpanElement spanH21 = taggedContent.CreateSpanElement();
spanH21.SetText("H2.");
h2.AppendChild(spanH21);
SpanElement spanH22 = taggedContent.CreateSpanElement();
spanH22.SetText("Level 2 header");
h2.AppendChild(spanH22);

SpanElement spanH31 = taggedContent.CreateSpanElement();
spanH31.SetText("H3.");
h3.AppendChild(spanH31);
SpanElement spanH32 = taggedContent.CreateSpanElement();
spanH32.SetText("Level 3 header");
h3.AppendChild(spanH32);

SpanElement spanH41 = taggedContent.CreateSpanElement();
spanH41.SetText("H4.");
h4.AppendChild(spanH41);
SpanElement spanH42 = taggedContent.CreateSpanElement();
spanH42.SetText("Level 4 header");
h4.AppendChild(spanH42);

SpanElement spanH51 = taggedContent.CreateSpanElement();
spanH51.SetText("H5.");
h5.AppendChild(spanH51);
SpanElement spanH52 = taggedContent.CreateSpanElement();
spanH52.SetText("Level 5 header");
h5.AppendChild(spanH52);

SpanElement spanH61 = taggedContent.CreateSpanElement();
spanH61.SetText("H6.");
h6.AppendChild(spanH61);
SpanElement spanH62 = taggedContent.CreateSpanElement();
spanH62.SetText("Heading level 6");
h6.AppendChild(spanH62);

// Добавить абзац
ParagraphElement p = taggedContent.CreateParagraphElement();
p.SetText("P.");
rootElement.AppendChild(p);

// Добавьте содержимое в абзац
SpanElement span1 = taggedContent.CreateSpanElement();
span1.SetText("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
p.AppendChild(span1);
SpanElement span2 = taggedContent.CreateSpanElement();
span2.SetText("Aenean nec lectus ac sem faucibus imperdiet.");
p.AppendChild(span2);
SpanElement span3 = taggedContent.CreateSpanElement();
span3.SetText("Sed ut erat ac magna ullamcorper hendrerit.");
p.AppendChild(span3);
SpanElement span4 = taggedContent.CreateSpanElement();
span4.SetText("Cras pellentesque libero semper, gravida magna sed, luctus leo.");
p.AppendChild(span4);
SpanElement span5 = taggedContent.CreateSpanElement();
span5.SetText("Fusce lectus odio, laoreet nec ullamcorper ut, molestie eu elit.");
p.AppendChild(span5);
SpanElement span6 = taggedContent.CreateSpanElement();
span6.SetText("Interdum et malesuada fames ac ante ipsum primis in faucibus. ");
p.AppendChild(span6);
SpanElement span7 = taggedContent.CreateSpanElement();
span7.SetText("Aliquam lacinia sit amet elit ac consectetur. So cursus condimentum ligula, vitae volutpat sem tristique eget. ");
p.AppendChild(span7);
SpanElement span8 = taggedContent.CreateSpanElement();
span8.SetText("Nulla in consectetur massa. Vestibulum vitae lobortis ante. Nulla ullamcorper pellentesque justo rhoncus accumsan. ");
p.AppendChild(span8);
SpanElement span9 = taggedContent.CreateSpanElement();
span9.SetText("Mauris ornare eu odio non lacinia. Aliquam massa leo, rhoncus ac iaculis eget, tempus et magna. Sed non consectetur elit.");
p.AppendChild(span9);
SpanElement span10 = taggedContent.CreateSpanElement();
span10.SetText("Sed vulputate, quam sed lacinia luctus, ipsum nibh fringilla purus, vitae posuere risus odio id massa. Cras sed venenatis lacus.");
p.AppendChild(span10);
```

Здесь мы создаем встроенные элементы структуры, такие как заголовки разного уровня и абзац, и добавляем к ним контент.

## Шаг 6: Сохраните документ PDF с тегами

Наконец, мы сохраняем документ PDF с тегами.

```csharp
// Сохраните документ PDF с тегами
document.Save(dataDir + "InlineStructureElements.pdf");
```

### Пример исходного кода для встроенных элементов структуры с использованием Aspose.PDF для .NET 

```csharp

// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Создать PDF-документ
Document document = new Document();

// Получить контент для работы с TaggedPdf
ITaggedContent taggedContent = document.TaggedContent;

// Установить заголовок и язык для Documnet
taggedContent.SetTitle("Tagged Pdf Document");
taggedContent.SetLanguage("en-US");

// Получить элемент корневой структуры
StructureElement rootElement = taggedContent.RootElement;
HeaderElement h1 = taggedContent.CreateHeaderElement(1);
HeaderElement h2 = taggedContent.CreateHeaderElement(2);
HeaderElement h3 = taggedContent.CreateHeaderElement(3);
HeaderElement h4 = taggedContent.CreateHeaderElement(4);
HeaderElement h5 = taggedContent.CreateHeaderElement(5);
HeaderElement h6 = taggedContent.CreateHeaderElement(6);
rootElement.AppendChild(h1);
rootElement.AppendChild(h2);
rootElement.AppendChild(h3);
rootElement.AppendChild(h4);
rootElement.AppendChild(h5);
rootElement.AppendChild(h6);
SpanElement spanH11 = taggedContent.CreateSpanElement();
spanH11.SetText("H1. ");
h1.AppendChild(spanH11);
SpanElement spanH12 = taggedContent.CreateSpanElement();
spanH12.SetText("Level 1 Header");
h1.AppendChild(spanH12);
SpanElement spanH21 = taggedContent.CreateSpanElement();
spanH21.SetText("H2. ");
h2.AppendChild(spanH21);
SpanElement spanH22 = taggedContent.CreateSpanElement();
spanH22.SetText("Level 2 Header");
h2.AppendChild(spanH22);
SpanElement spanH31 = taggedContent.CreateSpanElement();
spanH31.SetText("H3. ");
h3.AppendChild(spanH31);
SpanElement spanH32 = taggedContent.CreateSpanElement();
spanH32.SetText("Level 3 Header");
h3.AppendChild(spanH32);
SpanElement spanH41 = taggedContent.CreateSpanElement();
spanH41.SetText("H4. ");
h4.AppendChild(spanH41);
SpanElement spanH42 = taggedContent.CreateSpanElement();
spanH42.SetText("Level 4 Header");
h4.AppendChild(spanH42);
SpanElement spanH51 = taggedContent.CreateSpanElement();
spanH51.SetText("H5. ");
h5.AppendChild(spanH51);
SpanElement spanH52 = taggedContent.CreateSpanElement();
spanH52.SetText("Level 5 Header");
h5.AppendChild(spanH52);
SpanElement spanH61 = taggedContent.CreateSpanElement();
spanH61.SetText("H6. ");
h6.AppendChild(spanH61);
SpanElement spanH62 = taggedContent.CreateSpanElement();
spanH62.SetText("Level 6 Header");
h6.AppendChild(spanH62);
ParagraphElement p = taggedContent.CreateParagraphElement();
p.SetText("P. ");
rootElement.AppendChild(p);
SpanElement span1 = taggedContent.CreateSpanElement();
span1.SetText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ");
p.AppendChild(span1);
SpanElement span2 = taggedContent.CreateSpanElement();
span2.SetText("Aenean nec lectus ac sem faucibus imperdiet. ");
p.AppendChild(span2);
SpanElement span3 = taggedContent.CreateSpanElement();
span3.SetText("Sed ut erat ac magna ullamcorper hendrerit. ");
p.AppendChild(span3);
SpanElement span4 = taggedContent.CreateSpanElement();
span4.SetText("Cras pellentesque libero semper, gravida magna sed, luctus leo. ");
p.AppendChild(span4);
SpanElement span5 = taggedContent.CreateSpanElement();
span5.SetText("Fusce lectus odio, laoreet nec ullamcorper ut, molestie eu elit. ");
p.AppendChild(span5);
SpanElement span6 = taggedContent.CreateSpanElement();
span6.SetText("Interdum et malesuada fames ac ante ipsum primis in faucibus. ");
p.AppendChild(span6);
SpanElement span7 = taggedContent.CreateSpanElement();
span7.SetText("Aliquam lacinia sit amet elit ac consectetur. Donec cursus condimentum ligula, vitae volutpat sem tristique eget. ");
p.AppendChild(span7);
SpanElement span8 = taggedContent.CreateSpanElement();
span8.SetText("Nulla in consectetur massa. Vestibulum vitae lobortis ante. Nulla ullamcorper pellentesque justo rhoncus accumsan. ");
p.AppendChild(span8);
SpanElement span9 = taggedContent.CreateSpanElement();
span9.SetText("Mauris ornare eu odio non lacinia. Aliquam massa leo, rhoncus ac iaculis eget, tempus et magna. Sed non consectetur elit. ");
p.AppendChild(span9);
SpanElement span10 = taggedContent.CreateSpanElement();
span10.SetText("Sed vulputate, quam sed lacinia luctus, ipsum nibh fringilla purus, vitae posuere risus odio id massa. Cras sed venenatis lacus.");
p.AppendChild(span10);

// Сохранить документ в формате PDF с тегами
document.Save(dataDir + "InlineStructureElements.pdf");

```

## Заключение

Поздравляем! Вы узнали, как использовать встроенные элементы структуры с Aspose.PDF для .NET. Теперь вы можете создать иерархическую структуру в документе PDF, используя заголовки разных уровней и абзацы. Изучите дополнительные функции Aspose.PDF, чтобы раскрыть весь его потенциал.

### Часто задаваемые вопросы

#### Вопрос. Что такое встроенные элементы структуры в документе PDF и как они способствуют созданию иерархической структуры?

О: Элементы встроенной структуры в документе PDF, такие как заголовки разных уровней и абзацы, используются для создания иерархической структуры, которая упорядочивает и представляет содержимое в структурированном виде. Эти элементы позволяют установить четкую иерархию и поток информации внутри документа.

#### Вопрос: Как встроенные элементы структуры могут повысить удобочитаемость и организацию PDF-документа?

О. Встроенные элементы структуры, особенно заголовки и абзацы, помогают улучшить читабельность и организацию PDF-документа, обеспечивая логическую структуру. Заголовки указывают на разные уровни важности и помогают читателям ориентироваться в содержании, а абзацы группируют связанную информацию.

#### В: Как Aspose.PDF для .NET упрощает использование встроенных структурных элементов?

О: Aspose.PDF для .NET предлагает классы и методы для создания встроенных структурных элементов, таких как заголовки и абзацы, и управления ими. Эти элементы можно настраивать, организовывать иерархически и дополнять контентом для улучшения визуального представления и доступности документа.

####  В: Какова цель`taggedContent` object in relation to inline structure elements?

 А:`taggedContent` объект, полученный от`TaggedContent` собственность`Document`, позволяет работать со структурированными элементами, включая встроенные элементы структуры. Он позволяет создавать, настраивать и упорядочивать заголовки и абзацы в документе.

#### Вопрос: Как встроенные элементы структуры помогают создать четкую иерархию документов?

О: Встроенные элементы структуры, такие как заголовки разного уровня, способствуют установлению четкой и четкой иерархии в документе. Читатели могут быстро определить основные темы, подтемы и связанный с ними контент, что упрощает навигацию по документу и его понимание.

#### В: Могу ли я настроить внешний вид и форматирование встроенных элементов структуры с помощью Aspose.PDF для .NET?

О: Да, вы можете настроить внешний вид и форматирование встроенных элементов структуры. Вы можете установить такие свойства, как стили шрифта, размеры, цвета, выравнивание, отступы и интервалы, чтобы добиться желаемого визуального представления заголовков и абзацев.

#### В: Как создать и добавить заголовки разных уровней в PDF-документ, используя встроенные элементы структуры в Aspose.PDF для .NET?

 О: Вы можете создавать заголовки разного уровня с помощью`CreateHeaderElement` метод, а затем добавить их к корневому элементу структуры. Впоследствии вы можете добавить содержимое к каждому элементу заголовка, используя кнопку`CreateSpanElement` метод создания фрагментов текста.

#### Вопрос. Можно ли использовать встроенные элементы структуры для создания списков, маркеров или других типов организации содержимого в документе PDF?

О: В то время как сами встроенные элементы структуры в основном используются для заголовков и абзацев, вы можете использовать их в сочетании с другими функциями, предлагаемыми Aspose.PDF для .NET, для создания списков, маркеров, таблиц и других типов организации содержимого для всеобъемлющего структура документа.

#### Вопрос: Как встроенные элементы структуры способствуют доступности документа?

О: Элементы встроенной структуры играют решающую роль в улучшении доступности документа. Правильно структурированные заголовки и абзацы обеспечивают четкую иерархию документов, которая помогает программам чтения с экрана и другим вспомогательным технологиям точно интерпретировать и передавать содержимое пользователям с ограниченными возможностями.

#### Вопрос: Могу ли я изучить более сложные способы использования встроенных элементов структуры, такие как создание интерактивных элементов или встраивание мультимедиа?

О: Абсолютно! В то время как это руководство посвящено созданию заголовков и абзацев, Aspose.PDF для .NET предлагает расширенные функции для создания интерактивных элементов, встраивания мультимедиа, добавления гиперссылок и многого другого. Ознакомьтесь с документацией и примерами библиотеки, чтобы вникнуть в эти расширенные возможности.