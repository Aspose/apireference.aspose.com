---
title: Enum ListFoldersOptions
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Clients.Imap.ListFoldersOptions enum. The folder list selection options Please note this options are supported in case if server supports RFC 5258 IMAP LIST Command Extensions See more details in https//tools.ietf.org/html/rfc5258
type: docs
weight: 16670
url: /net/aspose.email.clients.imap/listfoldersoptions/
---
## ListFoldersOptions enumeration

The folder list selection options Please note, this options are supported in case if server supports RFC 5258 "IMAP LIST Command Extensions" See more details in https://tools.ietf.org/html/rfc5258

```csharp
[Flags]
public enum ListFoldersOptions
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | `0` | Not defined |
| Subscribed | `1` | SUBSCRIBED - causes the LIST command to list subscribed names, rather than the existing mailboxes. This will often be a subset of the actual mailboxes. It's also possible for this list to contain the names of mailboxes that don't exist. In any case, the list MUST include exactly those mailbox names that match the canonical list pattern and are subscribed to. This option is intended to supplement the LSUB command. Of particular note are the mailbox attributes as returned by this option, compared with what is returned by LSUB. With the latter, the attributes returned may not reflect the actual attribute status on the mailbox name, and the \NoSelect attribute has a second special meaning (it indicates that this mailbox is not, itself, subscribed, but that it has descendant mailboxes that are). With the SUBSCRIBED selection option described here, the attributes are accurate and complete, and have no special meanings. "LSUB" and "LIST (SUBSCRIBED)" are, thus, not the same thing, and some servers must do significant extra work to respond to "LIST (SUBSCRIBED)". Because of this, clients SHOULD continue to use "LSUB" unless they specifically want the additional information offered by "LIST (SUBSCRIBED)". This option defines a new mailbox attribute, "\Subscribed", that indicates that a mailbox name is subscribed to. The "\Subscribed" attribute MUST be supported and MUST be accurately computed when the SUBSCRIBED selection option is specified. Note that the SUBSCRIBED selection option implies the SUBSCRIBED return option (see below). |
| Remote | `2` | REMOTE - causes the LIST command to show remote mailboxes as well as local ones, as described in [MBRef]. This option is intended to replace the RLIST command and, in conjunction with the SUBSCRIBED selection option, the RLSUB command. This option defines a new mailbox attribute, "\Remote", that indicates that a mailbox is a remote mailbox. The "\Remote" attribute MUST be accurately computed when the REMOTE option is specified. The REMOTE selection option has no interaction with other options. Its effect is to tell the server to apply the other options, if any, to remote mailboxes, in addition to local ones. In particular, it has no interaction with RECURSIVEMATCH (see below). A request for (REMOTE RECURSIVEMATCH) is invalid, because a request for (RECURSIVEMATCH) is. A request for (REMOTE RECURSIVEMATCH SUBSCRIBED) is asking for all subscribed mailboxes, both local and remote. |
| RecursiveMatch | `4` | RECURSIVEMATCH - this option forces the server to return information about parent mailboxes that don't match other selection options, but have some submailboxes that do. Information about children is returned in the CHILDINFO extended data item. Note 1: In order for a parent mailbox to be returned, it still has to match the canonical LIST pattern. Note 2: When returning the CHILDINFO extended data item, it doesn't matter whether or not the submailbox matches the canonical LIST pattern. The RECURSIVEMATCH option MUST NOT occur as the only selection option (or only with REMOTE), as it only makes sense when other selection options are also used. The server MUST return BAD tagged response in such case. Note that even if the RECURSIVEMATCH option is specified, the client MUST still be able to handle a case when a CHILDINFO extended data item is returned and there are no submailboxes that meet the selection criteria of the subsequent LIST command, as they can be deleted/renamed after the LIST response was sent, but before the client had a chance to access them. |

### See Also

* namespace [Aspose.Email.Clients.Imap](../../aspose.email.clients.imap/)
* assembly [Aspose.Email](../../)


