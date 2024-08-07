---
title: Копировать заголовки и нижние колонтитулы из предыдущего раздела
linktitle: Копировать заголовки и нижние колонтитулы из предыдущего раздела
second_title: Справочник по API Aspose.Words для .NET
description: Узнайте, как копировать верхние и нижние колонтитулы из предыдущего раздела в документы Word с помощью Aspose.Words для .NET.
type: docs
weight: 10
url: /ru/net/working-with-headers-and-footers/copy-headers-footers-from-previous-section/
---

В этом пошаговом руководстве мы расскажем вам, как скопировать верхние и нижние колонтитулы из предыдущего раздела в документ Word с помощью Aspose.Words для .NET. Мы объясним предоставленный исходный код C# и покажем вам, как реализовать его в ваших собственных проектах.

Для начала убедитесь, что Aspose.Words for .NET установлен и настроен в вашей среде разработки. Если вы этого не сделали, скачайте и установите библиотеку с официального сайта.

## Шаг 1: Доступ к предыдущему разделу

 Сначала извлеките предыдущий раздел, обратившись к`PreviousSibling` свойство текущего раздела:

```csharp
Section previousSection = (Section)section.PreviousSibling;
```

## Шаг 2: Проверка предыдущего раздела

Затем проверьте, существует ли предыдущий раздел. Если предыдущего раздела нет, мы просто возвращаемся:

```csharp
if (previousSection == null)
    return;
```

## Шаг 3: Очистка и копирование верхних и нижних колонтитулов

Чтобы скопировать верхние и нижние колонтитулы из предыдущего раздела в текущий раздел, мы очищаем существующие верхние и нижние колонтитулы в текущем разделе, а затем повторяем верхние и нижние колонтитулы предыдущего раздела, чтобы добавить клонированные копии в текущий раздел:

```csharp
section.HeadersFooters.Clear();

foreach (HeaderFooter headerFooter in previousSection.HeadersFooters)
    section.HeadersFooters.Add(headerFooter.Clone(true));
```

## Шаг 4: Сохранение документа

Наконец, сохраните измененный документ:

```csharp
doc.Save("OutputDocument.docx");
```

Вот и все! Вы успешно скопировали верхние и нижние колонтитулы из предыдущего раздела в текущий раздел документа Word с помощью Aspose.Words для .NET.

### Пример исходного кода для копирования нижних колонтитулов заголовков из предыдущего раздела с использованием Aspose.Words для .NET

```csharp
Section previousSection = (Section)section.PreviousSibling;

if (previousSection == null)
    return;

section.HeadersFooters.Clear();

foreach (HeaderFooter headerFooter in previousSection.HeadersFooters)
    section.HeadersFooters.Add(headerFooter.Clone(true));

doc.Save("OutputDocument.docx");
```

Не стесняйтесь использовать этот код в своих проектах и модифицировать его в соответствии с вашими конкретными требованиями.