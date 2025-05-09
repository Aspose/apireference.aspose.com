---
title: Class RunThreadCreateRequest
second_title: Aspose.PDF for .NET API Reference
description: Класс Aspose.Pdf.AI.RunThreadCreateRequest. Представляет запрос на создание потока и его выполнение в одном запросе
type: docs
weight: 1070
url: /ru/net/aspose.pdf.ai/runthreadcreaterequest/
---
## Класс RunThreadCreateRequest

Представляет запрос на создание потока и его выполнение в одном запросе.

```csharp
public class RunThreadCreateRequest
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [RunThreadCreateRequest](runthreadcreaterequest/)() | Конструктор по умолчанию. |

## Свойства

| Имя | Описание |
| --- | --- |
| [AssistantId](../../aspose.pdf.ai/runthreadcreaterequest/assistantid/) { get; set; } | Получает или задает идентификатор помощника, который будет использоваться для выполнения этого запроса. |
| [Instructions](../../aspose.pdf.ai/runthreadcreaterequest/instructions/) { get; set; } | Получает или задает инструкции, которые переопределяют инструкции помощника. Это полезно для изменения поведения на основе каждого запроса. |
| [MaxCompletionTokens](../../aspose.pdf.ai/runthreadcreaterequest/maxcompletiontokens/) { get; set; } | Получает или задает максимальное количество токенов завершения, которые могут быть использованы в ходе выполнения. Запрос будет стараться использовать только указанное количество токенов завершения на протяжении нескольких этапов выполнения. Если запрос превышает указанное количество токенов завершения, выполнение завершится со статусом неполное. См. incomplete_details для получения дополнительной информации. |
| [MaxPromptTokens](../../aspose.pdf.ai/runthreadcreaterequest/maxprompttokens/) { get; set; } | Получает или задает максимальное количество токенов подсказки, которые могут быть использованы в ходе выполнения. Запрос будет стараться использовать только указанное количество токенов подсказки на протяжении нескольких этапов выполнения. Если запрос превышает указанное количество токенов подсказки, выполнение завершится со статусом неполное. См. incomplete_details для получения дополнительной информации. |
| [Metadata](../../aspose.pdf.ai/runthreadcreaterequest/metadata/) { get; set; } | Получает или задает набор из 16 пар ключ-значение, которые могут быть прикреплены к объекту. Это может быть полезно для хранения дополнительной информации об объекте в структурированном формате. Ключи могут иметь максимальную длину 64 символа, а значения — максимальную длину 512 символов. |
| [Model](../../aspose.pdf.ai/runthreadcreaterequest/model/) { get; set; } | Получает или задает идентификатор модели, которая будет использоваться для выполнения этого запроса. Если здесь указано значение, оно переопределит модель, связанную с помощником. Если нет, будет использоваться модель, связанная с помощником. |
| [ResponseFormat](../../aspose.pdf.ai/runthreadcreaterequest/responseformat/) { get; set; } | Получает или задает формат, который модель должна выводить. Совместим с GPT-4o, GPT-4 Turbo и всеми моделями GPT-3.5 Turbo с gpt-3.5-turbo-1106. Установка { "type": "json_object" } включает режим JSON, который гарантирует, что сообщение, генерируемое моделью, является допустимым JSON. Важно: при использовании режима JSON вы также должны указать модели, чтобы она сама производила JSON через системное или пользовательское сообщение. Без этого модель может генерировать бесконечный поток пробелов, пока генерация не достигнет предела токенов, что приведет к длительному и, казалось бы, "застрявшему" запросу. Также обратите внимание, что содержимое сообщения может быть частично обрезано, если finish_reason="length", что указывает на то, что генерация превысила max_tokens или разговор превысил максимальную длину контекста. |
| [Stream](../../aspose.pdf.ai/runthreadcreaterequest/stream/) { get; set; } | Получает или задает, использовать ли потоковую передачу. Если true, возвращает поток событий, которые происходят во время выполнения в виде событий, отправляемых сервером, завершаясь, когда выполнение входит в конечное состояние с сообщением data: [DONE]. |
| [Temperature](../../aspose.pdf.ai/runthreadcreaterequest/temperature/) { get; set; } | Получает или задает, какую температуру выборки использовать, от 0 до 2. Более высокие значения, такие как 0.8, сделают вывод более случайным, в то время как более низкие значения, такие как 0.2, сделают его более сосредоточенным и детерминированным. |
| [Thread](../../aspose.pdf.ai/runthreadcreaterequest/thread/) { get; set; } | Получает или задает запрос на создание потока. |
| [ToolChoice](../../aspose.pdf.ai/runthreadcreaterequest/toolchoice/) { get; set; } | Получает или задает, какой (если есть) инструмент вызывается моделью. none означает, что модель не будет вызывать никаких инструментов и вместо этого генерирует сообщение. auto — это значение по умолчанию и означает, что модель может выбирать между генерацией сообщения или вызовом одного или нескольких инструментов. required означает, что модель должна вызвать один или несколько инструментов перед ответом пользователю. Указание конкретного инструмента, такого как {"type": "file_search"} или {"type": "function", "function": {"name": "my_function"}}, заставляет модель вызвать этот инструмент. |
| [ToolResources](../../aspose.pdf.ai/runthreadcreaterequest/toolresources/) { get; set; } | Получает или задает набор ресурсов, которые используются инструментами помощника. |
| [Tools](../../aspose.pdf.ai/runthreadcreaterequest/tools/) { get; set; } | Получает или задает инструменты, которые переопределяют инструменты, которые помощник может использовать для этого выполнения. Это полезно для изменения поведения на основе каждого запроса. |
| [TopP](../../aspose.pdf.ai/runthreadcreaterequest/topp/) { get; set; } | Получает или задает значение, альтернативное выборке с температурой, называемое выборкой по ядру, где модель учитывает результаты токенов с вероятностью top_p. Таким образом, 0.1 означает, что учитываются только токены, составляющие верхние 10% вероятности. Мы обычно рекомендуем изменять это или температуру, но не оба. |
| [TruncationStrategy](../../aspose.pdf.ai/runthreadcreaterequest/truncationstrategy/) { get; set; } | Получает или задает стратегию усечения, которая контролирует, как поток будет усечен перед выполнением. Используйте это, чтобы контролировать начальное окно контекста выполнения. |

### См. также

* пространство имен [Aspose.Pdf.AI](../../aspose.pdf.ai/)
* сборка [Aspose.PDF](../../)