---
title: Class MessageInfoBase
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Clients.MessageInfoBase class. The MessageInfo represents the EMail message info fetched from the mail server
type: docs
weight: 16920
url: /net/aspose.email.clients/messageinfobase/
---
## MessageInfoBase class

The MessageInfo represents the E-Mail message info fetched from the mail server.

```csharp
public abstract class MessageInfoBase : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [MessageInfoBase](messageinfobase/)() | Initializes a new instance of the `MessageInfoBase` class. |

## Properties

| Name | Description |
| --- | --- |
| virtual [Bcc](../../aspose.email.clients/messageinfobase/bcc/) { get; } | Gets blind carbon copy of the E-Mail message. |
| virtual [CC](../../aspose.email.clients/messageinfobase/cc/) { get; } | Gets CC of the E-Mail message. |
| virtual [Date](../../aspose.email.clients/messageinfobase/date/) { get; } | The origination date specifies the date and time at which the creator of the message indicated that the message was complete and ready to enter the mail delivery system. For instance, this might be the time that a user pushes the "send" or "submit" button in an application program. In any case, it is specifically not intended to convey the time that the message is actually transported, but rather the time at which the human or other creator of the message has put the message into its final form, ready for transport. (For example, a portable computer user who is not connected to a network might queue a message for delivery. The origination date is intended to contain the date and time that the user queued the message, not the time when the user connected to the network to send the message.) |
| [From](../../aspose.email.clients/messageinfobase/from/) { get; } | Gets the list of authors of this message. |
| [Headers](../../aspose.email.clients/messageinfobase/headers/) { get; } | Gets the Headers of the E-Mail message. |
| [ListUnsubscribe](../../aspose.email.clients/messageinfobase/listunsubscribe/) { get; } | The List-Unsubscribe field describes the command (preferably using mail) to directly unsubscribe the user(removing them from the list). For more details please see https://tools.ietf.org/html/rfc2369 |
| [MessageId](../../aspose.email.clients/messageinfobase/messageid/) { get; } | Gets the message ID. |
| virtual [Properties](../../aspose.email.clients/messageinfobase/properties/) { get; } | Gets a mapi properties. |
| [ReplyTo](../../aspose.email.clients/messageinfobase/replyto/) { get; } | Gets the list of addresses that should receive replies to this message. |
| [Sender](../../aspose.email.clients/messageinfobase/sender/) { get; } | Gets the sender of this message. |
| [Size](../../aspose.email.clients/messageinfobase/size/) { get; } | Gets the size of the E-Mail message. |
| [Subject](../../aspose.email.clients/messageinfobase/subject/) { get; } | Gets the Subject of the E-Mail message. |
| virtual [To](../../aspose.email.clients/messageinfobase/to/) { get; } | Gets the receiptants of the E-Mail message. |

## Methods

| Name | Description |
| --- | --- |
| virtual [Dispose](../../aspose.email.clients/messageinfobase/dispose/)() | Performs tasks associated with freeing, releasing, or resetting unmanaged resources. |
| override [ToString](../../aspose.email.clients/messageinfobase/tostring/)() | A string that represents the current object. |

### See Also

* namespace [Aspose.Email.Clients](../../aspose.email.clients/)
* assembly [Aspose.Email](../../)


