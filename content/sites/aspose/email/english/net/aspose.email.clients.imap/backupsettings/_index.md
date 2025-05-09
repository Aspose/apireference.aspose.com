---
title: Class BackupSettings
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Clients.Imap.BackupSettings class. Class contains options for backup operation
type: docs
weight: 16360
url: /net/aspose.email.clients.imap/backupsettings/
---
## BackupSettings class

Class contains options for backup operation

```csharp
public class BackupSettings
```

## Constructors

| Name | Description |
| --- | --- |
| [BackupSettings](backupsettings/#constructor)() | Initializes a new instance of the `BackupSettings` class |
| [BackupSettings](backupsettings/#constructor_1)(BackupOptions) | Initializes a new instance of the `BackupSettings` class |
| [BackupSettings](backupsettings/#constructor_2)(bool, bool, int, int) | Initializes a new instance of the `BackupSettings` class |

## Properties

| Name | Description |
| --- | --- |
| static [Default](../../aspose.email.clients.imap/backupsettings/default/) { get; } | Gets `BackupSettings` class with settings by default |
| [ExecuteRecursively](../../aspose.email.clients.imap/backupsettings/executerecursively/) { get; set; } | Gets or sets value which defines if backup should be executed recursively |
| [NumberOfAttemptsToRrepeat](../../aspose.email.clients.imap/backupsettings/numberofattemptstorrepeat/) { get; set; } | Gets or sets value which defines number of attempts to repeat failed operation In case of some IMAP command inside backup operation returns failed result, IMAP client tries to repeat this operation again according to defined quantity of times. For instance if FETCH operation returns error AE_1_1_0243 FETCH 219 (BODY) AE_1_1_0243 NO[UNAVAILABLE] FETCH Service is temporarily not available Client tries to execute it again. |
| [RestoreConnection](../../aspose.email.clients.imap/backupsettings/restoreconnection/) { get; set; } | Gets or sets value which defines if connection has to be restored in case if server closes connection forcibly This option has to be used together with NumberOfAttemptsToRrepeat option. |
| [TimeoutBetweenAttempts](../../aspose.email.clients.imap/backupsettings/timeoutbetweenattempts/) { get; set; } | Gets or sets value which defines timeout (in milliseconds) between attemptions to execute operation again This option has to be used together with NumberOfAttemptsToRrepeat option. |

## Methods

| Name | Description |
| --- | --- |
| [implicit operator](../../aspose.email.clients.imap/backupsettings/op_implicit/) | Converts enumerable options to class |

### See Also

* namespace [Aspose.Email.Clients.Imap](../../aspose.email.clients.imap/)
* assembly [Aspose.Email](../../)


