---
title: Enum MapiItemType
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Mapi.MapiItemType enum. Represents a MAPI item type that can be explicitly converted into an object of the corresponding class derived from the IMapiMessageItem interface
type: docs
weight: 18630
url: /net/aspose.email.mapi/mapiitemtype/
---
## MapiItemType enumeration

Represents a MAPI item type that can be explicitly converted into an object of the corresponding class derived from the [`IMapiMessageItem`](../imapimessageitem/) interface.

```csharp
public enum MapiItemType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | `0` | Non-supported type. MapiMessage cannot be converted to an appropriate item type. |
| Message | `1` | An email message. This type does not need to be converted. |
| Contact | `2` | A contact item. Can be converted to [`MapiContact`](../mapicontact/). |
| Calendar | `3` | A calendar item. Can be converted to [`MapiCalendar`](../mapicalendar/). |
| DistList | `4` | A distribution list. Can be converted to [`MapiDistributionList`](../mapidistributionlist/). |
| Journal | `5` | A Journal entry. Can be converted to [`MapiJournal`](../mapijournal/). |
| Note | `6` | A StickyNote. Can be converted to [`MapiNote`](../mapinote/). |
| Task | `7` | A Task item. Can be converted to [`MapiTask`](../mapitask/). |

### See Also

* namespace [Aspose.Email.Mapi](../../aspose.email.mapi/)
* assembly [Aspose.Email](../../)


