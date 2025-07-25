---
title: Class MapiRecipient
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Mapi.MapiRecipient class. Represents the recipient information in the Microsoft Outlook Message
type: docs
weight: 18840
url: /net/aspose.email.mapi/mapirecipient/
---
## MapiRecipient class

Represents the recipient information in the Microsoft Outlook Message.

```csharp
public class MapiRecipient : MapiPropertyContainer
```

## Properties

| Name | Description |
| --- | --- |
| [AddressType](../../aspose.email.mapi/mapirecipient/addresstype/) { get; } | Gets the type of the address of the message recipient or sender. |
| virtual [CodePage](../../aspose.email.mapi/mapipropertycontainer/codepage/) { get; } | Gets the code page. |
| [Content](../../aspose.email.mapi/mapirecipient/content/) { get; } | Gets the content. |
| [DisplayName](../../aspose.email.mapi/mapirecipient/displayname/) { get; set; } | Gets or sets the display name of the message recipient or sender. |
| [EmailAddress](../../aspose.email.mapi/mapirecipient/emailaddress/) { get; set; } | Gets or sets the email address of the message recipient or sender. |
| [NamedProperties](../../aspose.email.mapi/mapirecipient/namedproperties/) { get; } | Gets the named properties of message. |
| [OrganizationEmailAddress](../../aspose.email.mapi/mapirecipient/organizationemailaddress/) { get; } | Gets the organization email address. |
| virtual [Properties](../../aspose.email.mapi/mapipropertycontainer/properties/) { get; } | Gets the collection of properties. |
| [PropertyStream](../../aspose.email.mapi/mapirecipient/propertystream/) { get; } | Gets the property stream. |
| [RecipientClass](../../aspose.email.mapi/mapirecipient/recipientclass/) { get; } | Gets the type of recipent. |
| [RecipientTrackStatus](../../aspose.email.mapi/mapirecipient/recipienttrackstatus/) { get; set; } | Status of recipient’s response to a meeting request. |
| [RecipientType](../../aspose.email.mapi/mapirecipient/recipienttype/) { get; } | Gets the type of the recipient or sender. |
| [SubStorages](../../aspose.email.mapi/mapirecipient/substorages/) { get; } | Gets the sub storages. |

## Methods

| Name | Description |
| --- | --- |
| virtual [GetProperty](../../aspose.email.mapi/mapipropertycontainer/getproperty/)(PropertyDescriptor) | Gets MAPI property by property descriptor. |
| [GetPropertyBoolean](../../aspose.email.mapi/mapipropertycontainer/getpropertyboolean/)(long) | Gets the value of the property specified by tag as Boolean type. |
| [GetPropertyBytes](../../aspose.email.mapi/mapipropertycontainer/getpropertybytes/)(long) | Gets the string value of the property specified by tag. |
| [GetPropertyDateTime](../../aspose.email.mapi/mapipropertycontainer/getpropertydatetime/)(long) | Gets the value of the property specified by tag as DateTime type. |
| [GetPropertyInt32](../../aspose.email.mapi/mapipropertycontainer/getpropertyint32/)(long) | Gets the int32 value of the property specified by tag. |
| [GetPropertyLong](../../aspose.email.mapi/mapipropertycontainer/getpropertylong/)(long) | Gets the value of the property specified by tag as Long (int64) type. |
| [GetPropertyShort](../../aspose.email.mapi/mapipropertycontainer/getpropertyshort/)(long) | Gets the value of the property specified by tag as Short type. |
| [GetPropertyString](../../aspose.email.mapi/mapipropertycontainer/getpropertystring/)(long) | Gets the string value of the property specified by tag. |
| [GetPropertyString](../../aspose.email.mapi/mapipropertycontainer/getpropertystring/)(long, int) | Gets the string value of the property specified by tag. |
| [IsStoreUnicodeOk](../../aspose.email.mapi/mapipropertycontainer/isstoreunicodeok/)() | Determines if string properties are Unicode encoded or not. |
| virtual [SetProperty](../../aspose.email.mapi/mapipropertycontainer/setproperty/)(MapiProperty) | Sets the property. |
| virtual [SetProperty](../../aspose.email.mapi/mapipropertycontainer/setproperty/)(PropertyDescriptor, object) | Sets MAPI property. |
| [TryGetPropertyData](../../aspose.email.mapi/mapipropertycontainer/trygetpropertydata/)(long) | Try to get the property data with specified tag key. |
| [TryGetPropertyDateTime](../../aspose.email.mapi/mapipropertycontainer/trygetpropertydatetime/)(long, ref DateTime) | Gets the value of the specified property as DateTime type. A return value indicates whether the operation succeeded. |
| [TryGetPropertyInt32](../../aspose.email.mapi/mapipropertycontainer/trygetpropertyint32/)(long, ref int) | Gets the value of the specified property as Int32 type. A return value indicates whether the operation succeeded. |
| [TryGetPropertyLong](../../aspose.email.mapi/mapipropertycontainer/trygetpropertylong/)(long, ref long) | Gets the value of the specified property as Long type. A return value indicates whether the operation succeeded. |
| [TryGetPropertyString](../../aspose.email.mapi/mapipropertycontainer/trygetpropertystring/)(long) | Try to get a property data as string with specified tag. |
| [TryGetPropertyString](../../aspose.email.mapi/mapipropertycontainer/trygetpropertystring/)(long, int) | Try to get a property data as string with specified tag and code page. |
| [TryGetPropertyString](../../aspose.email.mapi/mapipropertycontainer/trygetpropertystring/)(long, ref string) | Gets the value of the specified property as String type. A return value indicates whether the operation succeeded. |
| [TryGetPropertyString](../../aspose.email.mapi/mapipropertycontainer/trygetpropertystring/)(long, ref string, int) | Gets the value of the specified property as String type. A return value indicates whether the operation succeeded. |

### See Also

* class [MapiPropertyContainer](../mapipropertycontainer/)
* namespace [Aspose.Email.Mapi](../../aspose.email.mapi/)
* assembly [Aspose.Email](../../)


