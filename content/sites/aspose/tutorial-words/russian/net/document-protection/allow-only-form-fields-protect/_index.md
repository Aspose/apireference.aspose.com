---
title: Разрешить защиту только полей формы
linktitle: Разрешить защиту только полей формы
second_title: Справочник по API Aspose.Words для .NET
description: Узнайте, как использовать Aspose.Words для .NET для защиты документов и разрешения редактирования только полей формы.
type: docs
weight: 10
url: /ru/net/document-protection/allow-only-form-fields-protect/
---

Защита документов — важная функция при работе с файлами в приложении C#. С библиотекой Aspose.Words для .NET вы можете легко защитить свои документы и разрешить редактировать только поля формы. В этом пошаговом руководстве мы расскажем, как использовать исходный код C#, чтобы разрешить редактирование полей формы только с помощью функции «Разрешить защиту только полей формы» в Aspose.Words для .NET.

## Шаг 1: Настройка каталога документов

Первым шагом является определение каталога вашего документа. Вы должны указать путь, по которому вы хотите сохранить защищенный документ. Например :

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

Обязательно замените «КАТАЛОГ ВАШИХ ДОКУМЕНТОВ» на фактический путь к каталогу ваших документов.

## Шаг 2: Вставка разделов и текста

Затем вам нужно вставить разделы и текст в ваш документ. Используйте класс DocumentBuilder, предоставленный Aspose.Words, для создания содержимого вашего документа. Вот простой пример:

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("Text added to a document.");
```

В этом примере мы создаем новый пустой документ, а затем используем DocumentBuilder для добавления строки текста.

## Шаг 3. Включение защиты документов

 Защита документов работает только при включенной защите документов. Вы можете включить защиту документов с помощью`Protect` метод класса Document. Вот как:

```csharp
doc.Protect(ProtectionType.AllowOnlyFormFields, "password");
```

В этом примере мы включаем защиту документа, указав тип защиты `

AllowOnlyFormFields` и установка пароля.

## Шаг 4. Разрешение только полей формы

Теперь, когда защита документа включена, нам нужно указать, что разрешено только редактирование полей формы. Это гарантирует, что пользователи могут редактировать только те части документа, которые являются полями формы. Вот как:

```csharp
doc.Protect(ProtectionType.AllowOnlyFormFields, "password");
```

Обязательно замените «пароль» на пароль, который вы установили ранее.

## Шаг 5: Сохранение защищенного документа

Наконец, вы можете сохранить защищенный документ с помощью`Save` метод класса Document. Укажите полный путь к файлу и желаемое имя файла. Например :

```csharp
doc.Save(dataDir + "DocumentProtection.AllowOnlyFormFieldsProtect.docx");
```

Обязательно замените «dataDir» на путь к вашему каталогу документов.

### Пример исходного кода для функции «Разрешить защиту только полей формы» с использованием Aspose.Words для .NET

```csharp
// Путь к вашему каталогу документов
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Вставьте два раздела с текстом.
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("Text added to a document.");

// Защита документа работает только при включенной защите документа и разрешено только редактирование полей формы.
doc.Protect(ProtectionType.AllowOnlyFormFields, "password");

// Сохраните защищенный документ.
doc.Save(dataDir + "DocumentProtection.AllowOnlyFormFieldsProtect.docx");
```

## Заключение

В этом руководстве мы рассмотрели, как использовать библиотеку Aspose.Words для .NET для защиты документа и разрешения редактирования только полей формы. Следуя приведенным инструкциям, вы можете легко реализовать эту функциональность в своем приложении C#. Защита документов необходима для обеспечения безопасности и конфиденциальности ваших документов.
