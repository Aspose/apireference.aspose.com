---
title: Class Pop3MessageInfo
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Clients.Pop3.Pop3MessageInfo class. The Pop3MessageInfo represents the EMail message info fetched from the Pop3 server
type: docs
weight: 17080
url: /net/aspose.email.clients.pop3/pop3messageinfo/
---
## Pop3MessageInfo class

The Pop3MessageInfo represents the E-Mail message info fetched from the Pop3 server.

```csharp
public sealed class Pop3MessageInfo : MessageInfoBase
```

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
| [SequenceNumber](../../aspose.email.clients.pop3/pop3messageinfo/sequencenumber/) { get; } | Gets the Sequence Number of the E-Mail message. |
| [Size](../../aspose.email.clients/messageinfobase/size/) { get; } | Gets the size of the E-Mail message. |
| [Subject](../../aspose.email.clients/messageinfobase/subject/) { get; } | Gets the Subject of the E-Mail message. |
| virtual [To](../../aspose.email.clients/messageinfobase/to/) { get; } | Gets the receiptants of the E-Mail message. |
| [UniqueId](../../aspose.email.clients.pop3/pop3messageinfo/uniqueid/) { get; } | Gets the Unique Id of the E-Mail message. |

## Methods

| Name | Description |
| --- | --- |
| virtual [Dispose](../../aspose.email.clients/messageinfobase/dispose/)() | Performs tasks associated with freeing, releasing, or resetting unmanaged resources. |
| override [ToString](../../aspose.email.clients.pop3/pop3messageinfo/tostring/)() | Returns a string that represents the current object. |

### See Also

* class [MessageInfoBase](../../aspose.email.clients/messageinfobase/)
* namespace [Aspose.Email.Clients.Pop3](../../aspose.email.clients.pop3/)
* assembly [Aspose.Email](../../)


