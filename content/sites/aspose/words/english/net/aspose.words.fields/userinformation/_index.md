---
title: UserInformation Class
linktitle: UserInformation
articleTitle: UserInformation
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Fields.UserInformation class to manage user details effectively and enhance document processing in your applications.
type: docs
weight: 3190
url: /net/aspose.words.fields/userinformation/
---
## UserInformation class

Specifies information about the user.

To learn more, visit the [Working with Fields](https://docs.aspose.com/words/net/working-with-fields/) documentation article.

```csharp
public class UserInformation
```

## Constructors

| Name | Description |
| --- | --- |
| [UserInformation](userinformation/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| static [DefaultUser](../../aspose.words.fields/userinformation/defaultuser/) { get; } | Default user information. |
| [Address](../../aspose.words.fields/userinformation/address/) { get; set; } | Gets or sets the user's postal address. |
| [Initials](../../aspose.words.fields/userinformation/initials/) { get; set; } | Gets or sets the user's initials. |
| [Name](../../aspose.words.fields/userinformation/name/) { get; set; } | Gets or sets the user's name. |

## Examples

Shows how to set user details, and display them using fields.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Create a UserInformation object and set it as the data source for fields that display user information.
UserInformation userInformation = new UserInformation
{
    Name = "John Doe",
    Initials = "J. D.",
    Address = "123 Main Street"
};
doc.FieldOptions.CurrentUser = userInformation;

// Insert USERNAME, USERINITIALS, and USERADDRESS fields, which display values of
// the respective properties of the UserInformation object that we have created above. 
Assert.That(builder.InsertField(" USERNAME ").Result, Is.EqualTo(userInformation.Name));
Assert.That(builder.InsertField(" USERINITIALS ").Result, Is.EqualTo(userInformation.Initials));
Assert.That(builder.InsertField(" USERADDRESS ").Result, Is.EqualTo(userInformation.Address));

// The field options object also has a static default user that fields from all documents can refer to.
UserInformation.DefaultUser.Name = "Default User";
UserInformation.DefaultUser.Initials = "D. U.";
UserInformation.DefaultUser.Address = "One Microsoft Way";
doc.FieldOptions.CurrentUser = UserInformation.DefaultUser;

Assert.That(builder.InsertField(" USERNAME ").Result, Is.EqualTo("Default User"));
Assert.That(builder.InsertField(" USERINITIALS ").Result, Is.EqualTo("D. U."));
Assert.That(builder.InsertField(" USERADDRESS ").Result, Is.EqualTo("One Microsoft Way"));

doc.UpdateFields();
doc.Save(ArtifactsDir + "FieldOptions.CurrentUser.docx");
```

### See Also

* namespace [Aspose.Words.Fields](../../aspose.words.fields/)
* assembly [Aspose.Words](../../)
