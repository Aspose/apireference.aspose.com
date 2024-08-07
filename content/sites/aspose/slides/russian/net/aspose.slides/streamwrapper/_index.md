---
title: StreamWrapper
second_title: Справочник по API Aspose.Slides для .NET
description: Оболочка Aspose.IO.Stream для COM-интерфейса.
type: docs
weight: 9940
url: /ru/net/aspose.slides/streamwrapper/
---
## StreamWrapper class

Оболочка Aspose.IO.Stream для COM-интерфейса.

```csharp
public class StreamWrapper : IStreamWrapper
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [AsIDisposable](../../aspose.slides/streamwrapper/asidisposable) { get; } | Позволяет получить базовый интерфейс IDisposable. Только для чтенияIDisposable. |
| [CanRead](../../aspose.slides/streamwrapper/canread) { get; } | Получает значение, указывающее, поддерживает ли текущий поток чтение. Только чтениеBoolean. |
| [CanSeek](../../aspose.slides/streamwrapper/canseek) { get; } | Получает значение, указывающее, поддерживает ли текущий поток поиск. Только чтениеBoolean. |
| [CanWrite](../../aspose.slides/streamwrapper/canwrite) { get; } | Получает значение, указывающее, поддерживает ли текущий поток запись. Только чтениеBoolean. |
| [Length](../../aspose.slides/streamwrapper/length) { get; } | Получает длину потока в байтах. Только для чтенияInt64. |
| [Position](../../aspose.slides/streamwrapper/position) { get; } | Получает или задает позицию в текущем потоке. Только для чтенияInt64. |
| [Stream](../../aspose.slides/streamwrapper/stream) { get; } | Получает поток. Только чтениеStream. |

## Методы

| Имя | Описание |
| --- | --- |
| [Close](../../aspose.slides/streamwrapper/close)() | Закрывает текущий поток и освобождает все ресурсы. |
| [Dispose](../../aspose.slides/streamwrapper/dispose)() | Удаляет объект. |
| [Flush](../../aspose.slides/streamwrapper/flush)() | Очищает все буферы для этого потока и вызывает запись всех буферизованных данных на базовое устройство. |
| [Read](../../aspose.slides/streamwrapper/read)(byte[], int, int) | Считывает последовательность байтов из текущего потока и перемещает позицию в потоке на количество прочитанных байтов. |
| [ReadByte](../../aspose.slides/streamwrapper/readbyte)() | Считывает байт из потока и сдвигает позицию в потоке на один байт или возвращает -1, если в конце потока. |
| [Seek](../../aspose.slides/streamwrapper/seek)(long, SeekOrigin) | Устанавливает позицию в текущем потоке |
| [Write](../../aspose.slides/streamwrapper/write)(byte[], int, int) | записывает последовательность байтов в текущий поток и продвигает текущую позицию в этом потоке на количество записанных байтов. |
| [WriteByte](../../aspose.slides/streamwrapper/writebyte)(byte) | Записывает байт в текущую позицию в потоке и перемещает позицию в потоке на один байт. |

### Смотрите также

* interface [IStreamWrapper](../istreamwrapper)
* пространство имен [Aspose.Slides](../../aspose.slides)
* сборка [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
