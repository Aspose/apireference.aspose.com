---
title: Удалить защиту документа в документе Word
linktitle: Удалить защиту документа в документе Word
second_title: API обработки документов Aspose.Words
description: Узнайте, как снять защиту в документе Word с помощью Aspose.Words для .NET.
type: docs
weight: 10
url: /ru/net/document-protection/remove-document-protection/
---
В этом руководстве мы покажем вам, как использовать функцию снятия защиты с документа в Aspose.Words для .NET. Эта функция позволяет снять защиту с документа Word, чтобы сделать его доступным для дальнейшего редактирования. Выполните следующие действия:

## Шаг 1. Создание документа и добавление контента

Начните с создания экземпляра класса Document и объекта DocumentBuilder:

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

## Шаг 2. Добавьте содержимое в документ

Используйте объект DocumentBuilder, чтобы добавить содержимое в документ:

```csharp
builder.Writeln("Text added to a document.");
```

## Шаг 3. Снимите защиту с документа

Чтобы снять защиту с документа, вы можете использовать метод Unprotect() объекта Document. Вы можете снять защиту без пароля или с правильным паролем. Удаление беспарольной защиты:

```csharp
doc.Unprotect();
doc.Protect(ProtectionType.ReadOnly, "newPassword");
doc.Unprotect("newPassword");
```

Обязательно замените «newPassword» правильным паролем документа.

## Шаг 4. Сохраните документ без защиты.

Наконец, сохраните документ незащищенным, используя метод Save() объекта Document:

```csharp
doc.Save(dataDir + "DocumentProtection.RemoveDocumentProtection.docx");
```

Обязательно укажите правильный путь и имя файла, чтобы сохранить документ незащищенным.

### Пример исходного кода для удаления защиты документов с использованием Aspose.Words для .NET

Вот полный исходный код для снятия защиты документа с помощью Aspose.Words for .NET:

```csharp

// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Text added to a document.");

// С документов можно снять защиту либо без пароля, либо с использованием правильного пароля.
doc.Unprotect();
doc.Protect(ProtectionType.ReadOnly, "newPassword");
doc.Unprotect("newPassword");

doc.Save(dataDir + "DocumentProtection.RemoveDocumentProtection.docx");

```

Выполнив эти шаги, вы можете легко снять защиту с документа Word с помощью Aspose.Words для .NET.

## Заключение

В этом уроке мы рассмотрели, как снять защиту документа в документе Word с помощью Aspose.Words для .NET. Следуя предоставленным инструкциям, вы можете легко снять защиту с документа и сделать его доступным для дальнейшего редактирования. Aspose.Words для .NET предоставляет мощный API, который позволяет вам управлять настройками защиты документов и настраивать уровень безопасности ваших документов Word. Снятие защиты документа дает вам возможность изменять содержимое и форматирование документа по мере необходимости.

### Часто задаваемые вопросы по снятию защиты документа в документе Word

#### Вопрос: Что такое защита документов в Aspose.Words for .NET?

О: Защита документов в Aspose.Words для .NET — это функция, которая позволяет вам применять меры безопасности к документу Word, чтобы ограничить редактирование, форматирование и изменение содержимого. Это помогает обеспечить целостность и конфиденциальность документа.

#### Вопрос: Как снять защиту документа с помощью Aspose.Words for .NET?

О: Чтобы снять защиту документа с помощью Aspose.Words for .NET, вы можете выполнить следующие действия:
1.  Создайте экземпляр`Document` класс и`DocumentBuilder` объект.
2.  Использовать`DocumentBuilder` для добавления содержимого в документ.
3.  Позвоните в`Unprotect` метод`Document` объект, чтобы снять любую существующую защиту с документа. Это можно сделать без пароля или указав правильный пароль.
4.  Сохраните незащищенный документ с помощью`Save` метод`Document` объект.

#### Вопрос: Можно ли снять защиту с документа Word без пароля?

 О: Да, вы можете снять защиту с документа Word без пароля, используя Aspose.Words for .NET. Позвонив в`Unprotect` метод`Document`объекта без указания пароля, вы можете снять защиту с документа, если он ранее был защищен без пароля.

#### Вопрос: Как снять защиту с документа Word с помощью пароля?

 О: Чтобы снять защиту с документа Word, защищенного паролем, вам необходимо указать правильный пароль при вызове`Unprotect` метод`Document` объект. Это гарантирует, что только пользователи с правильным паролем смогут снять защиту и получить доступ к документу для редактирования.

#### Вопрос: Могу ли я удалить определенные типы защиты из документа Word?

 О: Да, используя Aspose.Words для .NET, вы можете выборочно удалять определенные типы защиты из документа Word. Позвонив в`Unprotect` метод`Document` объекта, вы можете удалить нужный тип защиты, например защиту только для чтения или защиту формы, оставив при этом другие типы защиты.