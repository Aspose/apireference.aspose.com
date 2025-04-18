---
title: Enum MapiMessageFlags
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Mapi.MapiMessageFlags enum. MapiMessageFlags
type: docs
weight: 18680
url: /net/aspose.email.mapi/mapimessageflags/
---
## MapiMessageFlags enumeration

MapiMessageFlags.

```csharp
[Flags]
public enum MapiMessageFlags : long
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| MSGFLAG_ZERO | `0` |  |
| MSGFLAG_READ | `1` | The message is marked as having been read. |
| MSGFLAG_UNMODIFIED | `2` | The message has not been modified since it was first saved (if unsent) or it was delivered (if sent). |
| MSGFLAG_SUBMIT | `4` | The message is marked for sending as a result of a call to IMessage::SubmitMessage. Message store providers set this flag; the client has read-only access. |
| MSGFLAG_UNSENT | `8` | The message is still being composed. It is saved, but has not been sent. |
| MSGFLAG_HASATTACH | `10` | The message has at least one attachment. |
| MSGFLAG_FROMME | `20` | The user receiving the message was also the user who sent the message. |
| MSGFLAG_ASSOCIATED | `40` | MSGFLAG_ASSOCIATED. |
| MSGFLAG_RESEND | `80` | The message includes a request for a resend operation with a non-delivery report. |
| MSGFLAG_NOTIFYREAD | `100` | The user who sent the message has requested notification when a recipient first reads it. |
| MSGFLAG_NOTIFYUNREAD | `200` | The user who sent the message has requested notification when a recipient deletes it before reading or the Message object expires. |
| MSGFLAG_EVERREAD | `400` | The message has been read at least once. This flag is set or cleared by the server whenever the MSGFLAG_READ flag is set or cleared. |
| MSGFLAG_ORIGIN_X400 | `1000` | The incoming message arrived over an X.400 link. |
| MSGFLAG_ORIGIN_INTERNET | `2000` | The incoming message arrived over the Internet. |
| MSGFLAG_ORIGIN_MISC_EXT | `8000` | The incoming message arrived over an external link other than X.400 or the Internet. |

### See Also

* namespace [Aspose.Email.Mapi](../../aspose.email.mapi/)
* assembly [Aspose.Email](../../)


