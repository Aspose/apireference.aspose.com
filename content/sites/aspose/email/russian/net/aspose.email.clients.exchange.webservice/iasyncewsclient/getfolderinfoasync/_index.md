---
title: GetFolderInfoAsync
second_title: Справочник по Aspose.Email для .NET API
description: Получает информацию о папке
type: docs
weight: 340
url: /ru/net/aspose.email.clients.exchange.webservice/iasyncewsclient/getfolderinfoasync/
---
## IAsyncEwsClient.GetFolderInfoAsync method

Получает информацию о папке

```csharp
public Task<ExchangeFolderInfo> GetFolderInfoAsync(string folder, 
    CancellationToken cancellationToken = default)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| folder | String | URI папки, отличительное имя папки. путь/к/папке также можно использовать, если установлен UseSlashAsFolderSeparator |
| cancellationToken | CancellationToken | Токен отмены |

### Возвращаемое значение

А[`ExchangeFolderInfo`](../../../aspose.email.clients.exchange/exchangefolderinfo) который представляет информацию о папке

### Исключения

| исключение | условие |
| --- | --- |
| [AsposeArgumentException](../../../aspose.email/asposeargumentexception) | *folder* является`нулевой`или же`пустой` |
| [ExchangeException](../../../aspose.email/exchangeexception) | Сервер ответил сообщением об ошибке |

### Смотрите также

* class [ExchangeFolderInfo](../../../aspose.email.clients.exchange/exchangefolderinfo)
* interface [IAsyncEwsClient](../../iasyncewsclient)
* пространство имен [Aspose.Email.Clients.Exchange.WebService](../../iasyncewsclient)
* сборка [Aspose.Email](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Email.dll -->
