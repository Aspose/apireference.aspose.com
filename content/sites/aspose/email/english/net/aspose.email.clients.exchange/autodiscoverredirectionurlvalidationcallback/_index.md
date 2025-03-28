---
title: Delegate AutodiscoverRedirectionUrlValidationCallback
second_title: Aspose.Email for .NET API Reference
description: Defines a delegate that is used by the AutodiscoverService to ask whether a redirectionUrl can be used
type: docs
weight: 3070
url: /net/aspose.email.clients.exchange/autodiscoverredirectionurlvalidationcallback/
---
## AutodiscoverRedirectionUrlValidationCallback delegate

Defines a delegate that is used by the AutodiscoverService to ask whether a redirectionUrl can be used.

```csharp
public delegate bool AutodiscoverRedirectionUrlValidationCallback(string redirectionUrl);
```

| Parameter | Type | Description |
| --- | --- | --- |
| redirectionUrl | String | Redirection URL that Autodiscover wants to use. |

### Return Value

Delegate returns true if Autodiscover is allowed to use this URL.

### See Also

* namespace [Aspose.Email.Clients.Exchange](../../aspose.email.clients.exchange/)
* assembly [Aspose.Email](../../)


