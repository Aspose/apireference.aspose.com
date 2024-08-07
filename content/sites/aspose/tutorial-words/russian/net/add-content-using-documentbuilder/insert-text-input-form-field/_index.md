---
title: Вставить поле формы ввода текста
linktitle: Вставить поле формы ввода текста
second_title: Справочник по API Aspose.Words для .NET
description: Из этого пошагового руководства вы узнаете, как использовать Aspose.Words для .NET для вставки поля формы ввода текста в документы Word.
type: docs
weight: 10
url: /ru/net/add-content-using-documentbuilder/insert-text-input-form-field/
---

В этом пошаговом руководстве мы рассмотрим, как использовать функцию «Вставить поле формы ввода текста» в Aspose.Words для .NET для добавления полей формы ввода текста и управления ими в ваших документах Word с использованием исходного кода C#. Поля формы ввода текста позволяют пользователям вводить произвольный текст в документе, что делает их идеальными для создания интерактивных форм и анкет. Следуя приведенным ниже инструкциям, вы сможете легко вставлять и настраивать поля формы ввода текста в своих документах. Давайте начнем!

## Введение в функцию «Вставить поле формы ввода текста» в Aspose.Words для .NET

Функция «Вставить поле формы ввода текста» в Aspose.Words для .NET позволяет программно добавлять поля формы ввода текста в документы Word. Эти поля формы представляют собой интерактивный элемент, в который пользователи могут вводить собственный текст или данные.

## Понимание требований для использования функции

Прежде чем приступить к реализации, убедитесь, что вы соответствуете следующим требованиям:

1. В вашем проекте установлена библиотека Aspose.Words for .NET.
2. Базовые знания языка программирования С#.
3. Существующий документ Word или новый документ для вставки поля формы ввода текста.

Убедитесь, что у вас есть эти предварительные условия, чтобы продолжить гладко.

## Пошаговое руководство по реализации вставки поля формы ввода текста с использованием исходного кода C#

Выполните следующие действия, чтобы реализовать функцию «Вставить поле формы ввода текста», используя предоставленный исходный код C#.

### Шаг 1: Инициализация документа и построителя документов

Для начала инициализируйте документ и конструктор документов. Конструктор документов — это мощный инструмент, предоставляемый Aspose.Words для .NET, который позволяет нам программно создавать документы Word и управлять ими. Используйте следующий фрагмент кода:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

### Шаг 2: Вставка поля формы ввода текста

 Далее мы будем вставлять поле формы ввода текста в документ с помощью`InsertTextInput` метод. Этот метод принимает различные параметры, в том числе имя поля формы, тип поля формы (в данном случае`TextFormFieldType.Regular`), значение по умолчанию и максимальную длину. Вот пример:

```csharp
builder.InsertTextInput("TextInput", TextFormFieldType.Regular, "", "Hello", 0);
```

Приведенный выше код вставит поле формы ввода текста с именем «TextInput», значением по умолчанию «Hello» и без ограничения максимальной длины.

### Шаг 3: Сохранение документа

 После вставки поля формы ввода текста сохраните документ в нужное место с помощью кнопки`Save` метод. Обязательно укажите правильный путь к файлу:

```csharp
doc.Save(dataDir + "AddContentUsingDocumentBuilder.InsertTextInputFormField.docx");
```

Этот код сохранит документ со вставленным полем формы ввода текста в указанном месте.

### Пример исходного кода для вставки поля формы ввода текста с использованием Aspose.Words для .NET

```csharp

	// Путь к каталогу документов.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	
	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);
	
	builder.InsertTextInput("TextInput", TextFormFieldType.Regular, "", "Hello", 0);

	doc.Save(dataDir + "AddContentUsingDocumentBuilder.InsertTextInputFormField.docx");
            
        
```
