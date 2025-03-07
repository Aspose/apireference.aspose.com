---
title: Установить свойство выноски в файле PDF
linktitle: Установить свойство выноски в файле PDF
second_title: Aspose.PDF для справочника API .NET
description: Узнайте, как установить свойство выноски в файле PDF с помощью Aspose.PDF для .NET. Настройте аннотации с помощью линий выноски, цвета текста и стилей окончания.
type: docs
weight: 130
url: /ru/net/annotations/setcalloutproperty/
---
 Aspose.PDF для .NET — это мощная библиотека для создания, обработки и преобразования PDF-документов на C#. Одной из функций, предоставляемых этой библиотекой, является возможность устанавливать свойства выноски для аннотаций произвольного текста в документах PDF. Это можно сделать с помощью`FreeTextAnnotation` класс, который позволяет создавать аннотации с выносками.

В этом руководстве мы проведем вас через процесс настройки свойств выноски для произвольной текстовой аннотации с использованием Aspose.PDF для .NET на C#. Чтобы начать, выполните следующие действия.

## Установите Aspose.PDF для .NET

 Если вы еще этого не сделали, вам необходимо[скачать](https://releases.aspose.com/pdf/net/) и установите Aspose.PDF для .NET из Aspose Releases или через диспетчер пакетов NuGet.

## Шаг 1. Создайте новый PDF-документ

 Создайте новый документ PDF с помощью`Document`класс, предоставляемый Aspose.PDF для .NET.

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();
```

## Шаг 2. Добавьте новую страницу в документ

 Добавьте новую страницу в документ с помощью`Pages` коллекция`Document` сорт.

```csharp
Page page = doc.Pages.Add();
```

## Шаг 3: Установите внешний вид по умолчанию

 Задайте внешний вид по умолчанию для произвольной текстовой аннотации, создав новый`DefaultAppearance` объект и установка его свойств, таких как`TextColor` и`FontSize`.

```csharp
DefaultAppearance da = new DefaultAppearance();
da.TextColor = System.Drawing.Color.Red;
da.FontSize = 10;
```

## Шаг 4. Создайте аннотацию произвольного текста с выноской

 Создайте новую текстовую аннотацию с выноской, используя`FreeTextAnnotation` сорт. Установить`Intent` собственность на`FreeTextIntent.FreeTextCallout` чтобы указать, что это аннотация выноски. Установить`EndingStyle` собственность на`LineEnding.OpenArrow` чтобы указать стиль стрелки в конце выноски. Установить`Callout` свойство массива`Point` объекты, представляющие точки на странице, где должна быть нарисована линия выноски.

```csharp
FreeTextAnnotation fta = new FreeTextAnnotation(page, new Rectangle(422.25, 645.75, 583.5, 702.75), da);
fta.Intent = FreeTextIntent.FreeTextCallout;
fta.EndingStyle = LineEnding.OpenArrow;
fta.Callout = new Point[]
{
    new Point(428.25,651.75), new Point(462.75,681.375), new Point(474,681.375)
};
```

## Шаг 5. Добавьте на страницу аннотацию произвольного текста.

 Добавьте аннотацию произвольного текста на страницу с помощью`Annotations` коллекция`Page` сорт.

```csharp
page.Annotations.Add(fta);
```

## Шаг 6: Добавьте текст в аннотацию

 Добавьте текст в аннотацию, установив`RichText`свойство в строку форматированного XML. В этом уроке мы устанавливаем красный цвет текста и размер шрифта 9.

```csharp
fta.RichText = "<body xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:xfa=\"http://www.xfa.org/schema/xfa-data/1.0/\" xfa:APIVersion=\"Acrobat:11.0.23\" xfa:spec=\"2.0.2\" стиль=\"цвет:#FF
```

## Шаг 7: сохраните документ

Теперь сохраните документ, используя следующий код:

```csharp
doc.Save(dataDir + "SetCalloutProperty.pdf")
```

### Пример исходного кода для установки свойства выноски с использованием Aspose.PDF для .NET

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document();
Page page = doc.Pages.Add();
DefaultAppearance da = new DefaultAppearance();
da.TextColor = System.Drawing.Color.Red;
da.FontSize = 10;
FreeTextAnnotation fta = new FreeTextAnnotation(page, new Rectangle(422.25, 645.75, 583.5, 702.75), da);
fta.Intent = FreeTextIntent.FreeTextCallout;
fta.EndingStyle = LineEnding.OpenArrow;
fta.Callout = new Point[]
{
	new Point(428.25,651.75), new Point(462.75,681.375), new Point(474,681.375)
};
page.Annotations.Add(fta);
fta.RichText = "<body xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:xfa=\"http://www.xfa.org/schema/xfa-data/1.0/\" xfa:APIVersion=\"Acrobat:11.0.23\" xfa:spec=\"2.0.2\" стиль=\"цвет:#FF0000;вес шрифта:нормальный;стиль шрифта:нормальный;растяжка шрифта:нормальный\"><p dir=\"ltr\"> <span style=\"font-size:9.0pt;font-family:Helvetica\">Это образец</span></p></body>";
doc.Save(dataDir + "SetCalloutProperty.pdf");
```

## Заключение

В этом руководстве мы рассмотрели, как установить свойства выноски для произвольной текстовой аннотации в документе PDF с помощью Aspose.PDF для .NET. Выносные аннотации полезны для предоставления дополнительной информации или пояснений, относящихся к определенным областям документа. Aspose.PDF для .NET предоставляет широкий спектр функций и возможностей для работы с PDF-файлами, включая создание и настройку аннотаций, таких как выноски. Следуя пошаговому руководству и используя предоставленный исходный код C#, разработчики могут легко внедрять аннотации выноски в свои документы PDF, повышая удобство использования и ясность своих документов. Aspose.PDF для .NET — это универсальная и надежная библиотека для операций с PDF в приложениях .NET, предлагающая мощные инструменты для эффективного решения различных задач, связанных с PDF.

### Часто задаваемые вопросы по установке свойства выноски в файле PDF

#### Вопрос. Что такое аннотация выноски в документе PDF?

О. Выносная аннотация в документе PDF — это тип аннотации, который позволяет создать текстовое поле с линией выноски, указывающей на определенную область документа. Он обычно используется для предоставления дополнительной информации или комментариев, относящихся к определенному разделу или элементу документа.

#### Вопрос. Можно ли настроить внешний вид аннотации выноски с помощью Aspose.PDF для .NET?

О: Да, вы можете настроить различные свойства аннотации выноски, такие как цвет, размер шрифта, выравнивание текста, стиль линии, стиль стрелки и многое другое.

#### Вопрос. Как добавить текст в аннотацию выноски?

 A: Чтобы добавить текст в аннотацию выноски, вы можете установить`RichText` собственность`FreeTextAnnotation` объект.`RichText` Свойство принимает строку форматированного XML, которая представляет текст, отображаемый в аннотации выноски.

#### Вопрос: Могу ли я добавить несколько аннотаций выноски в PDF-документ, используя Aspose.PDF для .NET?

 О: Да, вы можете создать несколько аннотаций выноски в документе PDF, создав несколько экземпляров`FreeTextAnnotation`объекта и добавляя их на разные страницы или места в документе.