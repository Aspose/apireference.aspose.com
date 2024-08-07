---
title: Удалить гиперссылки после преобразования из HTML
linktitle: Удалить гиперссылки после преобразования из HTML
second_title: Aspose.PDF для справочника API .NET
description: Пошаговое руководство по удалению гиперссылок после преобразования HTML в PDF с помощью Aspose.PDF для .NET.
type: docs
weight: 250
url: /ru/net/document-conversion/remove-hyperlinks-after-converting-from-html/
---
В этом руководстве мы познакомим вас с процессом удаления гиперссылок из файла PDF, созданного из файла HTML с помощью Aspose.PDF для .NET. Гиперссылки — это интерактивные ссылки, которые могут перенаправлять на другие страницы или веб-сайты. Следуя приведенным ниже инструкциям, вы сможете удалить гиперссылки из полученного PDF-файла.

## Предпосылки
Прежде чем начать, убедитесь, что выполнены следующие условия:

- Базовые знания языка программирования С#.
- Библиотека Aspose.PDF для .NET, установленная в вашей системе.
- Среда разработки, такая как Visual Studio.

## Шаг 1: Загрузка файла HTML и удаление гиперссылок
На этом этапе мы загрузим HTML-файл и удалим гиперссылки из полученного PDF-документа. Используйте следующий код:

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Загрузите файл HTML, используя параметры загрузки HTML.
Document doc = new Document(dataDir + "SampleHtmlFile.html", new HtmlLoadOptions());

// Просмотрите аннотации первой страницы документа
foreach(Annotation a in doc.Pages[1].Annotations)
{
     // Проверить, является ли аннотация ссылкой
     if (a.AnnotationType == AnnotationType.Link)
     {
         LinkAnnotation the = (LinkAnnotation)a;
        
         // Проверьте, относится ли действие к типу GoToURIAction.
         if (the.Action is GoToURIAction)
         {
             GoToURIAction gta = (GoToURIAction)the.Action;
             gta.URI = "";
            
             // Используйте поглотитель текстовых фрагментов, чтобы найти совпадающие текстовые фрагменты
             TextFragmentAbsorber tfa = new TextFragmentAbsorber();
             tfa.TextSearchOptions = new TextSearchOptions(a.Rect);
             doc.Pages[a.PageIndex].Accept(tfa);
            
             // Перебирать совпадающие текстовые фрагменты и удалять атрибуты из гиперссылок
             foreach(TextFragment tf in tfa.TextFragments)
             {
                 tf.TextState.Underline = false;
                 tf.TextState.ForegroundColor = Color.Black;
             }
         }
        
         // Удалить аннотацию со страницы
         doc.Pages[a.PageIndex].Annotations.Delete(a);
     }
}
```

 Обязательно замените`"YOUR DOCUMENTS DIRECTORY"` с фактическим каталогом, в котором находится ваш файл HTML.

## Шаг 2: Сохранение полученного PDF-файла
Наконец, мы сохраним полученный PDF-файл без гиперссылок. Используйте следующий код:

```csharp
// Сохраните полученный PDF-файл
doc.Save(dataDir + "RemoveHyperlinksFromText_out.pdf");
```

 Приведенный выше код сохраняет полученный PDF-файл с именем файла`"RemoveHyperlinksFromText_out.pdf"`.

### Пример исходного кода для удаления гиперссылок после преобразования из HTML с использованием Aspose.PDF для .NET

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document(dataDir + "SampleHtmlFile.html", new HtmlLoadOptions());
doc.Save(new MemoryStream());
foreach (Annotation a in doc.Pages[1].Annotations)
{
	if (a.AnnotationType == AnnotationType.Link)
	{
		LinkAnnotation la = (LinkAnnotation)a;
		if (la.Action is GoToURIAction)
		{
			GoToURIAction gta = (GoToURIAction)la.Action;
			gta.URI = "";
			TextFragmentAbsorber tfa = new TextFragmentAbsorber();
			tfa.TextSearchOptions = new TextSearchOptions(a.Rect);
			doc.Pages[a.PageIndex].Accept(tfa);
			foreach (TextFragment tf in tfa.TextFragments)
			{
				tf.TextState.Underline = false;
				tf.TextState.ForegroundColor = Color.Black;
			}
		}
		doc.Pages[a.PageIndex].Annotations.Delete(a);
	}
}
doc.Save(dataDir + "RemoveHyperlinksFromText_out.pdf");
```

## Заключение
В этом руководстве мы рассмотрели пошаговый процесс удаления гиперссылок из файла PDF, созданного из файла HTML с помощью Aspose.PDF для .NET. Следуя инструкциям, описанным выше, вы сможете успешно удалить гиперссылки из полученного PDF-файла.

### Часто задаваемые вопросы

#### В: Что такое Aspose.PDF для .NET?

О: Aspose.PDF для .NET — это мощная библиотека, которая позволяет разработчикам работать с PDF-документами в приложениях C#. Он предлагает широкий спектр функций, в том числе возможность конвертировать HTML-файлы в PDF и управлять содержимым PDF.

#### В: Зачем мне удалять гиперссылки из PDF-файла?

О: Существуют различные причины для удаления гиперссылок из PDF-файла. Например, вы можете удалить внешние ссылки для целей печати или архивирования или сделать так, чтобы содержимое PDF не было доступно для навигации по гиперссылкам.

#### Q: Как я могу загрузить файл HTML и удалить гиперссылки, используя Aspose.PDF для .NET?

 О: Чтобы загрузить файл HTML и удалить гиперссылки, вы можете использовать Aspose.PDF для .NET.`HtmlLoadOptions` сорт. Просмотрите аннотации страниц PDF, чтобы найти аннотации ссылок и изменить их атрибуты.

#### В: Могу ли я настроить имя выходного файла для итогового PDF-файла?

О: Да, вы можете настроить имя выходного файла для итогового PDF-файла, изменив код, сохраняющий PDF-документ. Просто измените желаемое имя файла в`doc.Save()` метод.

#### В: Можно ли выборочно удалять гиперссылки по определенным критериям?

О: Да, вы можете выборочно удалять гиперссылки на основе определенных критериев. Например, вы можете удалить только внешние ссылки или ссылки, указывающие на определенные URL-адреса.