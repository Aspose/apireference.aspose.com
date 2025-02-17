---
title: Class ExchangeQueryBuilder
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Clients.Exchange.ExchangeQueryBuilder class. Represents the builder of search expression based on search filters that used by Exchange protocol
type: docs
weight: 3450
url: /net/aspose.email.clients.exchange/exchangequerybuilder/
---
## ExchangeQueryBuilder class

Represents the builder of search expression based on search filters that used by Exchange protocol.

```csharp
public sealed class ExchangeQueryBuilder : MailQueryBuilder
```

## Constructors

| Name | Description |
| --- | --- |
| [ExchangeQueryBuilder](exchangequerybuilder/)() | Initializes a new instance of the `ExchangeQueryBuilder` class. |

## Properties

| Name | Description |
| --- | --- |
| [Appointment](../../aspose.email.clients.exchange/exchangequerybuilder/appointment/) { get; } | Gets object with appointment properties to create query |
| [Bcc](../../aspose.email.tools.search/mailquerybuilder/bcc/) { get; } | Gets the field that allows to find messages that contain the specified string in the envelope structure's BCC field. |
| [Body](../../aspose.email.tools.search/mailquerybuilder/body/) { get; } | Gets the field that allows to find messages that contain the specified string in the body of the message. |
| [Cc](../../aspose.email.tools.search/mailquerybuilder/cc/) { get; } | Gets the field that allows to find messages that contain the specified string in the envelope structure's CC field. |
| [Contact](../../aspose.email.clients.exchange/exchangequerybuilder/contact/) { get; } | Gets object with contact properties to create query |
| [ContentClass](../../aspose.email.clients.exchange/exchangequerybuilder/contentclass/) { get; } | Gets items with an specified content class. |
| [DefaultEncoding](../../aspose.email.tools.search/mailquerybuilder/defaultencoding/) { get; } | Gets default encoding (charset) for query builder |
| [ExtendedProperties](../../aspose.email.clients.exchange/exchangequerybuilder/extendedproperties/) { get; } | Gets dictionary with pairs of property descriptors and comparison field to search by extended properties. |
| [From](../../aspose.email.tools.search/mailquerybuilder/from/) { get; } | Gets the field that allows to find messages that contain the specified string in the envelope structure's FROM field. |
| [InternalDate](../../aspose.email.tools.search/mailquerybuilder/internaldate/) { get; } | Gets the field that allows to find messages by internal date. |
| [ItemSize](../../aspose.email.clients.exchange/exchangequerybuilder/itemsize/) { get; } | Gets the field that allows to find items with a specified size. |
| [MessageId](../../aspose.email.clients.exchange/exchangequerybuilder/messageid/) { get; } | Gets the field that allows to find messages that contain the specified string in the envelope structure's MessageId field. |
| [SentDate](../../aspose.email.tools.search/mailquerybuilder/sentdate/) { get; } | Gets the field that allows to find messages by sent date. |
| [Subject](../../aspose.email.tools.search/mailquerybuilder/subject/) { get; } | Gets the field that allows to find messages that contain the specified string in the envelope structure's SUBJECT field. |
| [TaskStatus](../../aspose.email.clients.exchange/exchangequerybuilder/taskstatus/) { get; } | Gets the field that allows to find tasks that contains the specified status. Server compatibility: Exchange 2010 and higher |
| [Text](../../aspose.email.tools.search/mailquerybuilder/text/) { get; } | Gets the field that allows to find the messages that contain the specified string in the headers (subject, from, to, cc) and body of the message. |
| [To](../../aspose.email.tools.search/mailquerybuilder/to/) { get; } | Gets the field that allows to find messages that contain the specified string in the envelope structure's TO field. |

## Methods

| Name | Description |
| --- | --- |
| [GetQuery](../../aspose.email.tools.search/mailquerybuilder/getquery/)() | Gets the query. |
| [HasFlags](../../aspose.email.clients.exchange/exchangequerybuilder/hasflags/)(ExchangeMessageFlag) | Search messages with the specified flags. |
| [HasNoFlags](../../aspose.email.clients.exchange/exchangequerybuilder/hasnoflags/)(ExchangeMessageFlag) | Search messages with the unspecified flags. |
| [Or](../../aspose.email.tools.search/mailquerybuilder/or/)(MailQuery, MailQuery) | Search messages that match either search key. Provides disjunction between two expressions (OR). |

### See Also

* class [MailQueryBuilder](../../aspose.email.tools.search/mailquerybuilder/)
* namespace [Aspose.Email.Clients.Exchange](../../aspose.email.clients.exchange/)
* assembly [Aspose.Email](../../)


