---
title: Class MailQueryBuilder
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Tools.Search.MailQueryBuilder class. Represents the builder of search expression
type: docs
weight: 21180
url: /net/aspose.email.tools.search/mailquerybuilder/
---
## MailQueryBuilder class

Represents the builder of search expression.

```csharp
public class MailQueryBuilder
```

## Constructors

| Name | Description |
| --- | --- |
| [MailQueryBuilder](mailquerybuilder/#constructor)() | Initializes a new instance of the `MailQueryBuilder` class. |
| [MailQueryBuilder](mailquerybuilder/#constructor_1)(Encoding) | Initializes a new instance of the `MailQueryBuilder` class. |

## Properties

| Name | Description |
| --- | --- |
| [Bcc](../../aspose.email.tools.search/mailquerybuilder/bcc/) { get; } | Gets the field that allows to find messages that contain the specified string in the envelope structure's BCC field. |
| [Body](../../aspose.email.tools.search/mailquerybuilder/body/) { get; } | Gets the field that allows to find messages that contain the specified string in the body of the message. |
| [Cc](../../aspose.email.tools.search/mailquerybuilder/cc/) { get; } | Gets the field that allows to find messages that contain the specified string in the envelope structure's CC field. |
| [DefaultEncoding](../../aspose.email.tools.search/mailquerybuilder/defaultencoding/) { get; } | Gets default encoding (charset) for query builder |
| [From](../../aspose.email.tools.search/mailquerybuilder/from/) { get; } | Gets the field that allows to find messages that contain the specified string in the envelope structure's FROM field. |
| [InternalDate](../../aspose.email.tools.search/mailquerybuilder/internaldate/) { get; } | Gets the field that allows to find messages by internal date. |
| [SentDate](../../aspose.email.tools.search/mailquerybuilder/sentdate/) { get; } | Gets the field that allows to find messages by sent date. |
| [Subject](../../aspose.email.tools.search/mailquerybuilder/subject/) { get; } | Gets the field that allows to find messages that contain the specified string in the envelope structure's SUBJECT field. |
| [Text](../../aspose.email.tools.search/mailquerybuilder/text/) { get; } | Gets the field that allows to find the messages that contain the specified string in the headers (subject, from, to, cc) and body of the message. |
| [To](../../aspose.email.tools.search/mailquerybuilder/to/) { get; } | Gets the field that allows to find messages that contain the specified string in the envelope structure's TO field. |

## Methods

| Name | Description |
| --- | --- |
| [GetQuery](../../aspose.email.tools.search/mailquerybuilder/getquery/)() | Gets the query. |
| [Or](../../aspose.email.tools.search/mailquerybuilder/or/)(MailQuery, MailQuery) | Search messages that match either search key. Provides disjunction between two expressions (OR). |

## Remarks

Note: By default, the result is the intersection (AND function) of all the messages that match those keys. To join keys by OR function, please, use Or() method of this class

### See Also

* namespace [Aspose.Email.Tools.Search](../../aspose.email.tools.search/)
* assembly [Aspose.Email](../../)


