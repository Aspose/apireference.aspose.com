---
title: Enum ListFoldersReturnOptions
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Clients.Imap.ListFoldersReturnOptions enum. Return options for ListFolders operation Please note this options are supported in case if server supports RFC 5258 IMAP LIST Command Extensions See more details in https//tools.ietf.org/html/rfc5258
type: docs
weight: 16680
url: /net/aspose.email.clients.imap/listfoldersreturnoptions/
---
## ListFoldersReturnOptions enumeration

Return options for ListFolders operation Please note, this options are supported in case if server supports RFC 5258 "IMAP LIST Command Extensions" See more details in https://tools.ietf.org/html/rfc5258

```csharp
[Flags]
public enum ListFoldersReturnOptions
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | `0` | Not defined |
| Subscribed | `1` | SUBSCRIBED - causes the LIST command to return subscription state for all matching mailbox names. The "\Subscribed" attribute MUST be supported and MUST be accurately computed when the SUBSCRIBED return option is specified. Further, all mailbox flags MUST be accurately computed (this differs from the behavior of the LSUB command). |
| Children | `2` | CHILDREN - requests mailbox child information. This option MUST be supported by all servers. |

### See Also

* namespace [Aspose.Email.Clients.Imap](../../aspose.email.clients.imap/)
* assembly [Aspose.Email](../../)


