---
title: RestoreAsync
second_title: Справочник по Aspose.Email для .NET API
description: Восстанавливает указанные папки обмена из заданного личного хранилища.
type: docs
weight: 600
url: /ru/net/aspose.email.clients.exchange.webservice/iasyncewsclient/restoreasync/
---
## IAsyncEwsClient.RestoreAsync method

Восстанавливает указанные папки обмена из заданного личного хранилища.

```csharp
public Task RestoreAsync(PersonalStorage pst, RestoreSettings settings, 
    CancellationToken cancellationToken = default)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| pst | PersonalStorage | Личное хранилище, содержащее резервные копии папок обмена. |
| settings | RestoreSettings | Настройки восстановления. |
| cancellationToken | CancellationToken | Токен отмены. |

### Исключения

| исключение | условие |
| --- | --- |
| [AsposeArgumentNullException](../../../aspose.email/asposeargumentnullexception) | *pst* является`нулевой`. |

### Смотрите также

* class [PersonalStorage](../../../aspose.email.storage.pst/personalstorage)
* class [RestoreSettings](../../restoresettings)
* interface [IAsyncEwsClient](../../iasyncewsclient)
* пространство имен [Aspose.Email.Clients.Exchange.WebService](../../iasyncewsclient)
* сборка [Aspose.Email](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Email.dll -->
