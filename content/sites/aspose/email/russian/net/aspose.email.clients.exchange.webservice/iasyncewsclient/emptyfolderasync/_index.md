---
title: EmptyFolderAsync
second_title: Справочник по Aspose.Email для .NET API
description: Очищает указанную папку
type: docs
weight: 200
url: /ru/net/aspose.email.clients.exchange.webservice/iasyncewsclient/emptyfolderasync/
---
## IAsyncEwsClient.EmptyFolderAsync method

Очищает указанную папку

```csharp
public Task EmptyFolderAsync(string folderUri, 
    EmptyFolderOptions options = EmptyFolderOptions.None, 
    CancellationToken cancellationToken = default)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| folderUri | String | Указывает, что папка должна быть пустой |
| options | EmptyFolderOptions | Указывает параметры очистки папки |
| cancellationToken | CancellationToken | Токен отмены. |

### Исключения

| исключение | условие |
| --- | --- |
| [ExchangeException](../../../aspose.email/exchangeexception) | Не удалось выполнить операцию EmptyFolder |
| [AsposeArgumentException](../../../aspose.email/asposeargumentexception) | *folderUri* является`нулевой`или же`пустой` |

### Смотрите также

* enum [EmptyFolderOptions](../../emptyfolderoptions)
* interface [IAsyncEwsClient](../../iasyncewsclient)
* пространство имен [Aspose.Email.Clients.Exchange.WebService](../../iasyncewsclient)
* сборка [Aspose.Email](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Email.dll -->
