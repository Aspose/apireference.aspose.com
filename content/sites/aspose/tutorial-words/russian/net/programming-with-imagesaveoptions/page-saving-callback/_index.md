---
title: Обратный вызов сохранения страницы
linktitle: Обратный вызов сохранения страницы
second_title: Справочник по API Aspose.Words для .NET
description: Узнайте, как настроить сохранение страниц документа в изображения с помощью Aspose.Words для .NET.
type: docs
weight: 10
url: /ru/net/programming-with-imagesaveoptions/page-saving-callback/
---

В этом руководстве мы рассмотрим исходный код C#, предоставленный для использования обратного вызова сохранения страницы с параметрами сохранения изображений Aspose.Words для .NET. Эта функция позволяет выполнять настраиваемые действия при сохранении каждой страницы документа в виде изображения.

## Шаг 1. Настройка среды

Прежде чем начать, убедитесь, что вы настроили среду разработки с Aspose.Words для .NET. Убедитесь, что вы добавили необходимые ссылки и импортировали соответствующие пространства имен.

## Шаг 2: Загрузка документа

```csharp
// Путь к каталогу ваших документов
string dataDir = "YOUR DOCUMENTS DIRECTORY";

Document doc = new Document(dataDir + "Rendering.docx");
```

 На этом шаге мы загружаем документ с помощью`Document` Метод и передача пути к файлу DOCX для загрузки.

## Шаг 3. Настройте параметры резервного копирования образа

```csharp
ImageSaveOptions imageSaveOptions = new ImageSaveOptions(SaveFormat.Png)
{
     PageSet = new PageSet(new PageRange(0, doc.PageCount - 1)),
     PageSavingCallback = new HandlePageSavingCallback()
};
```

 На этом шаге мы настроим параметры сохранения изображения, создав новый`ImageSaveOptions` объект. Указываем желаемый формат резервной копии, здесь «Png» для формата PNG. Мы используем`PageSet` чтобы указать диапазон страниц для сохранения, здесь от первой страницы до последней страницы документа (`doc.PageCount - 1`). Мы также устанавливаем`PageSavingCallback` к экземпляру`HandlePageSavingCallback`, который является пользовательским классом для обработки обратного вызова сохранения страницы.

## Шаг 4: Реализация обратного вызова сохранения страницы

```csharp
public class HandlePageSavingCallback : IPageSavingCallback
{
     public void PageSaving(PageSavingArgs args)
     {
         // Реализуйте свои пользовательские действия здесь
         // Вы можете получить доступ к информации о странице через свойство «args.PageIndex».
         // Вы также можете изменить параметры сохранения для каждой страницы отдельно.
     }
}
```

 На этом этапе мы реализуем`HandlePageSavingCallback` класс, который реализует`IPageSavingCallback` интерфейс. Вы можете настроить этот класс, добавив свои конкретные действия в`PageSaving` метод. Вы можете получить доступ к информации о странице через`args.PageIndex` собственность`PageSavingArgs` объект, переданный в качестве аргумента.

## Шаг 5. Сохранение страниц в виде изображений

```csharp
doc.Save(dataDir + "WorkingWithImageSaveOptions.PageSavingCallback.png", imageSaveOptions);
```

 На этом последнем шаге мы сохраняем каждую страницу документа как изображение, используя`Save` метод и передача пути к выходному файлу с`.png` расширение вместе с указанными параметрами сохранения.

Теперь вы можете запустить исходный код для выполнения пользовательских действий при сохранении каждой страницы документа в виде изображения. Полученный файл будет сохранен в указанном каталоге с именем «WorkingWithImageSaveOptions.PageSavingCallback.png».

### Пример исходного кода для обратного вызова при сохранении страницы с использованием Aspose.Words для .NET


```csharp 
// Путь к вашему каталогу документов
string dataDir = "YOUR DOCUMENT DIRECTORY"; 


Document doc = new Document(dataDir + "Rendering.docx");

ImageSaveOptions imageSaveOptions = new ImageSaveOptions(SaveFormat.Png)
{
	PageSet = new PageSet(new PageRange(0, doc.PageCount - 1)),
	PageSavingCallback = new HandlePageSavingCallback()
};

doc.Save(dataDir + "WorkingWithImageSaveOptions.PageSavingCallback.png", imageSaveOptions);
        
```

## Заключение

В этом руководстве мы рассмотрели функцию обратного вызова для сохранения страницы с параметрами сохранения изображений Aspose.Words для .NET. Мы научились выполнять пользовательские действия при сохранении каждой страницы документа в виде изображения.

Эта функция полезна, когда вы хотите выполнять определенные операции на каждой странице при преобразовании в изображения. Вы можете получить доступ к информации о странице и использовать ее для настройки параметров резервного копирования или выполнения другой обработки страницы.

Aspose.Words для .NET предлагает широкий спектр расширенных функций для обработки и создания документов. Напоминание о сохранении страницы — один из многих мощных инструментов, с помощью которого можно настроить процесс сохранения страниц в изображения.