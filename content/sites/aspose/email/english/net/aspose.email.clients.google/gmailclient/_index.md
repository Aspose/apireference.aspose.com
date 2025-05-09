---
title: Class GmailClient
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Clients.Google.GmailClient class. Base class for Gmail client
type: docs
weight: 15800
url: /net/aspose.email.clients.google/gmailclient/
---
## GmailClient class

Base class for Gmail client

```csharp
public abstract class GmailClient : IBaseGmailClient
```

## Properties

| Name | Description |
| --- | --- |
| virtual [AccessToken](../../aspose.email.clients.google/gmailclient/accesstoken/) { get; set; } | Gets or sets OAuth 2.0 access token In case if refresh token is set, access token is generated automatically. |
| virtual [DefaultEmail](../../aspose.email.clients.google/gmailclient/defaultemail/) { get; } | Gets or sets default email address |
| virtual [Proxy](../../aspose.email.clients.google/gmailclient/proxy/) { get; set; } | Gets or sets the proxy. |
| virtual [Timeout](../../aspose.email.clients.google/gmailclient/timeout/) { get; set; } | Gets or sets the number of milliseconds to wait before the operation times out. The default value is 100,000 milliseconds (100 seconds). |
| static [DefaultTimeout](../../aspose.email.clients.google/gmailclient/defaulttimeout/) { get; set; } | Gets or sets the default timeout value for ActiveSync client instances The default value is 100,000 milliseconds (100 seconds). |

## Methods

| Name | Description |
| --- | --- |
| virtual [Dispose](../../aspose.email.clients.google/gmailclient/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| virtual [RefreshToken](../../aspose.email.clients.google/gmailclient/refreshtoken/)() | Refresh access token |
| static [GetInstance](../../aspose.email.clients.google/gmailclient/getinstance/#getinstance_1)(string, string) | Gets instance of Gmail client |
| static [GetInstance](../../aspose.email.clients.google/gmailclient/getinstance/#getinstance)(string, IWebProxy, string) | Gets instance of Gmail client |
| static [GetInstance](../../aspose.email.clients.google/gmailclient/getinstance/#getinstance_3)(string, string, string, string) | Gets instance of Gmail client |
| static [GetInstance](../../aspose.email.clients.google/gmailclient/getinstance/#getinstance_2)(string, string, string, IWebProxy, string) | Gets instance of Gmail client |

### See Also

* interface [IBaseGmailClient](../ibasegmailclient/)
* namespace [Aspose.Email.Clients.Google](../../aspose.email.clients.google/)
* assembly [Aspose.Email](../../)


