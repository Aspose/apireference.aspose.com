---
title: Delegate MessageAcceptanceCallback
second_title: Aspose.Email for .NET API Reference
description: Callback function which is being called during the conversion process
type: docs
weight: 19300
url: /net/aspose.email/messageacceptancecallback/
---
## MessageAcceptanceCallback delegate

Callback function which is being called during the conversion process.

```csharp
public delegate bool MessageAcceptanceCallback(MapiMessage mapiMessage);
```

| Parameter | Type | Description |
| --- | --- | --- |
| mapiMessage | MapiMessage | [`MapiMessage`](../../aspose.email.mapi/mapimessage/) to check. |

### Return Value

If it returns true it indicates that message can be accepted for conversion, otherwise it will be skipped.

### See Also

* class [MapiMessage](../../aspose.email.mapi/mapimessage/)
* namespace [Aspose.Email](../../aspose.email/)
* assembly [Aspose.Email](../../)


