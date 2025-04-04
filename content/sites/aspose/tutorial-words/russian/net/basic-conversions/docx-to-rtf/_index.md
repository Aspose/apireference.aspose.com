---
title: Docx в RTF
linktitle: Docx в RTF
second_title: Справочник по API Aspose.Words для .NET
description: Узнайте, как конвертировать документы Word из формата Docx в формат RTF с помощью Aspose.Words для .NET. Пошаговое руководство с примером исходного кода.
type: docs
weight: 10
url: /ru/net/basic-conversions/docx-to-rtf/
---

В этом пошаговом руководстве мы расскажем вам, как использовать Aspose.Words для .NET для преобразования документа Word в формате Docx в RTF. Мы объясним предоставленный исходный код C# и покажем вам, как реализовать его в ваших собственных проектах.

Для начала убедитесь, что Aspose.Words for .NET установлен и настроен в вашей среде разработки. Если вы этого не сделали, скачайте и установите библиотеку с официального сайта.

## Шаг 1: Чтение документа из потока

Сначала откройте поток для чтения документа Docx:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Stream stream = File.OpenRead(MyDir + "Document.docx");
```

## Шаг 2: Загрузка документа

Далее загружаем документ из потока:

```csharp
Document doc = new Document(stream);
```

## Шаг 3: Закрытие потока

Поскольку документ загружается в память, можно закрыть поток:

```csharp
stream.Close();
```

## Шаг 4: Выполнение операций над документом

На этом этапе вы можете выполнять любые необходимые операции с документом.

## Шаг 5: Сохранение документа в формате RTF

Чтобы сохранить документ в формате RTF, сохраните его в поток памяти:

```csharp
MemoryStream dstStream = new MemoryStream();
doc.Save(dstStream, SaveFormat.Rtf);
```

## Шаг 6: Перемотка потока

Перед записью потока памяти в файл отмотаем его позицию обратно на ноль:

```csharp
dstStream.Position = 0;
```

## Шаг 7: Запись потока в файл

Наконец, запишите поток памяти в файл RTF:

```csharp
File.WriteAllBytes(dataDir + "BaseConversions.DocxToRtf.rtf", dstStream.ToArray());
```

Вот и все! Вы успешно преобразовали документ Word в формате Docx в RTF с помощью Aspose.Words для .NET.

### Пример исходного кода для Docx To Rtf с использованием Aspose.Words для .NET

```csharp

	// Путь к каталогу документов.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	// Доступа только для чтения достаточно, чтобы Aspose.Words загрузил документ.
	Stream stream = File.OpenRead(MyDir + "Document.docx");

	Document doc = new Document(stream);
	//Теперь можно закрыть поток, он больше не нужен, так как документ находится в памяти.
	stream.Close();

	// ... сделайте что-нибудь с документом.

	// Преобразуйте документ в другой формат и сохраните в поток.
	MemoryStream dstStream = new MemoryStream();
	doc.Save(dstStream, SaveFormat.Rtf);

	// Перемотать положение потока обратно на ноль, чтобы он был готов к следующему считывателю.
	dstStream.Position = 0;

	File.WriteAllBytes(dataDir + "BaseConversions.DocxToRtf.rtf", dstStream.ToArray());
	
```

Не стесняйтесь использовать этот код в своих проектах и модифицировать его в соответствии с вашими конкретными требованиями.