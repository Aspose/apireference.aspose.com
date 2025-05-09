---
title: Class GetUserSettingsResponse
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Clients.Exchange.GetUserSettingsResponse class. Represents the response to a GetUsersSettings call for an individual user
type: docs
weight: 3480
url: /net/aspose.email.clients.exchange/getusersettingsresponse/
---
## GetUserSettingsResponse class

Represents the response to a GetUsersSettings call for an individual user.

```csharp
public sealed class GetUserSettingsResponse : AutodiscoverResponse
```

## Constructors

| Name | Description |
| --- | --- |
| [GetUserSettingsResponse](getusersettingsresponse/)() | Initializes a new instance of the `GetUserSettingsResponse` class. |

## Properties

| Name | Description |
| --- | --- |
| [ErrorCode](../../aspose.email.clients.exchange/autodiscoverresponse/errorcode/) { get; } | Gets the error code that was returned by the service. |
| [ErrorMessage](../../aspose.email.clients.exchange/autodiscoverresponse/errormessage/) { get; } | Gets the error message that was returned by the service. |
| [RedirectTarget](../../aspose.email.clients.exchange/getusersettingsresponse/redirecttarget/) { get; } | Gets the redirectionTarget (URL or email address) |
| [Settings](../../aspose.email.clients.exchange/getusersettingsresponse/settings/) { get; } | Gets the requested settings for the user. |
| [SmtpAddress](../../aspose.email.clients.exchange/getusersettingsresponse/smtpaddress/) { get; } | Gets the SMTP address this response applies to. |
| [UserSettingErrors](../../aspose.email.clients.exchange/getusersettingsresponse/usersettingerrors/) { get; } | Gets error information for settings that could not be returned. |

## Methods

| Name | Description |
| --- | --- |
| [TryGetSettingValue&lt;T&gt;](../../aspose.email.clients.exchange/getusersettingsresponse/trygetsettingvalue/)(UserSettingName, out T) | Tries the get the user setting value. |

### See Also

* class [AutodiscoverResponse](../autodiscoverresponse/)
* namespace [Aspose.Email.Clients.Exchange](../../aspose.email.clients.exchange/)
* assembly [Aspose.Email](../../)


