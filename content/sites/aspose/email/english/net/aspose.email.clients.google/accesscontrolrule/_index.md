---
title: Class AccessControlRule
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Clients.Google.AccessControlRule class. Access control rule
type: docs
weight: 15590
url: /net/aspose.email.clients.google/accesscontrolrule/
---
## AccessControlRule class

Access control rule.

```csharp
public class AccessControlRule : BaseDataObject
```

## Constructors

| Name | Description |
| --- | --- |
| [AccessControlRule](accesscontrolrule/#constructor)() | Initializes a new instance of the AccessControlRule class. |
| [AccessControlRule](accesscontrolrule/#constructor_1)(AclScope, AccessRole) | Initializes a new instance of the AccessControlRule class. |
| [AccessControlRule](accesscontrolrule/#constructor_2)(string, AclScope, AccessRole) | Initializes a new instance of the AccessControlRule class. |
| [AccessControlRule](accesscontrolrule/#constructor_3)(string, string, AclScope, AccessRole) | Initializes a new instance of the AccessControlRule class. |

## Properties

| Name | Description |
| --- | --- |
| virtual [ETag](../../aspose.email.clients.google/basedataobject/etag/) { get; set; } | An ETag or entity tag is one of several mechanisms that HTTP provides for web cache validation, and which allows a client to make conditional requests. This allows caches to be more efficient, and saves bandwidth, as a web server does not need to send a full response if the content has not changed. ETags can also be used for optimistic concurrency control, as a way to help prevent simultaneous updates of a resource from overwriting each other. |
| virtual [Id](../../aspose.email.clients.google/basedataobject/id/) { get; set; } | Identifier of the resource. |
| virtual [Kind](../../aspose.email.clients.google/basedataobject/kind/) { get; } | Type of the resource |
| [Role](../../aspose.email.clients.google/accesscontrolrule/role/) { get; set; } | The role assigned to the scope. |
| [Scope](../../aspose.email.clients.google/accesscontrolrule/scope/) { get; set; } | The scope of the rule. |

## Methods

| Name | Description |
| --- | --- |
| override [ToString](../../aspose.email.clients.google/accesscontrolrule/tostring/)() | Returns a string which represents the object instance. |

## Fields

| Name | Description |
| --- | --- |
| const [AccessControlRuleKind](../../aspose.email.clients.google/accesscontrolrule/accesscontrolrulekind/) | Type of the resource ("calendar#calendar"). |

### See Also

* class [BaseDataObject](../basedataobject/)
* namespace [Aspose.Email.Clients.Google](../../aspose.email.clients.google/)
* assembly [Aspose.Email](../../)


