---
title: Class ImapFolderInfo
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Clients.Imap.ImapFolderInfo class. Represents an IMAP folder
type: docs
weight: 16460
url: /net/aspose.email.clients.imap/imapfolderinfo/
---
## ImapFolderInfo class

Represents an IMAP folder.

```csharp
public sealed class ImapFolderInfo
```

## Properties

| Name | Description |
| --- | --- |
| [FolderType](../../aspose.email.clients.imap/imapfolderinfo/foldertype/) { get; } | Gets information about folder purpose in case if it is used as special folder. This option is accessible only in case if server supports IMAP LIST: Special-Use Mailboxes (rfc6154) See more: http://tools.ietf.org/html/rfc6154 |
| [HasChildren](../../aspose.email.clients.imap/imapfolderinfo/haschildren/) { get; } | Gets value indicating whether folder contains subfolders. This option is accessible only in case if server supports IMAP4 LIST Command Extensions (rfc5258) See more: http://tools.ietf.org/html/rfc5258 If value is `true`, it indicates that the folder has child sub-folders that are accessible to the currently authenticated user, otherwise false. |
| [HighestModSequence](../../aspose.email.clients.imap/imapfolderinfo/highestmodsequence/) { get; } | Gets value of all messages in the mailbox. See more: https://tools.ietf.org/html/rfc7162 |
| [Marked](../../aspose.email.clients.imap/imapfolderinfo/marked/) { get; } | Gets a value indicating whether it is marked this folder. |
| [Name](../../aspose.email.clients.imap/imapfolderinfo/name/) { get; } | Gets the name of the folder. |
| [NewMessageCount](../../aspose.email.clients.imap/imapfolderinfo/newmessagecount/) { get; } | Gets the number of the new messages. |
| [NoInferiors](../../aspose.email.clients.imap/imapfolderinfo/noinferiors/) { get; } | Gets a value indicating whether this folder can have child levels. If it is `True`, then no child levels exist now and none can be created in the future |
| [NoModSeq](../../aspose.email.clients.imap/imapfolderinfo/nomodseq/) { get; } | Gets value which indicates if mailbox supports mod-sequences. This property works only if server supports CONDSTORE extension. Please, read more https://tools.ietf.org/html/rfc4551#section-3.1.2 |
| [NonExistent](../../aspose.email.clients.imap/imapfolderinfo/nonexistent/) { get; } | Gets value indicating whether a folder name is referred to an existing folder. See more: http://tools.ietf.org/html/rfc5258 |
| [ReadOnly](../../aspose.email.clients.imap/imapfolderinfo/readonly/) { get; } | Gets a value indicating whether the folder is read-only. |
| [RecentMessageCount](../../aspose.email.clients.imap/imapfolderinfo/recentmessagecount/) { get; } | Gets the number of messages that arrived recently. |
| [Remote](../../aspose.email.clients.imap/imapfolderinfo/remote/) { get; } | Gets value indicating that a folder is a remote mailbox. This option is accessible only in case if server supports IMAP4 LIST Command Extensions (rfc5258) See more: http://tools.ietf.org/html/rfc5258 |
| [Selectable](../../aspose.email.clients.imap/imapfolderinfo/selectable/) { get; } | Gets a value indicating whether it is possible to select this folder. |
| [Subscribed](../../aspose.email.clients.imap/imapfolderinfo/subscribed/) { get; } | Gets value that indicates that a folder name is subscribed to. See more: http://tools.ietf.org/html/rfc5258 |
| [TotalMessageCount](../../aspose.email.clients.imap/imapfolderinfo/totalmessagecount/) { get; } | Gets the number of messages in the folder. |
| [UIDNext](../../aspose.email.clients.imap/imapfolderinfo/uidnext/) { get; } | Gets the validity ID of the mailbox. |
| [UidNotSticky](../../aspose.email.clients.imap/imapfolderinfo/uidnotsticky/) { get; } | Gets value which indicates if mail store does not support persistent UIDs This property works only if server supports UIDPLUS extension. Please, read more https://tools.ietf.org/html/rfc4315 |
| [ValidityId](../../aspose.email.clients.imap/imapfolderinfo/validityid/) { get; } | Gets the validity ID of the mailbox. |

## Methods

| Name | Description |
| --- | --- |
| override [ToString](../../aspose.email.clients.imap/imapfolderinfo/tostring/)() | Returns a string that represents the current object. |

## Fields

| Name | Description |
| --- | --- |
| const [InBox](../../aspose.email.clients.imap/imapfolderinfo/inbox/) | Gets inbox name. |

### See Also

* namespace [Aspose.Email.Clients.Imap](../../aspose.email.clients.imap/)
* assembly [Aspose.Email](../../)


