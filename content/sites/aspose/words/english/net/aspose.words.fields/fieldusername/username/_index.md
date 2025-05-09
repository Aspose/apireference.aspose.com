---
title: FieldUserName.UserName
linktitle: UserName
articleTitle: UserName
second_title: Aspose.Words for .NET
description: Manage the current user's name effortlessly with the FieldUserName property. Enhance user experience and personalize interactions seamlessly.
type: docs
weight: 20
url: /net/aspose.words.fields/fieldusername/username/
---
## FieldUserName.UserName property

Gest or sets the current user's name.

```csharp
public string UserName { get; set; }
```

## Examples

Shows how to use the USERNAME field.

```csharp
Document doc = new Document();

// Create a UserInformation object and set it as the source of user information for any fields that we create.
UserInformation userInformation = new UserInformation();
userInformation.Name = "John Doe";
doc.FieldOptions.CurrentUser = userInformation;

DocumentBuilder builder = new DocumentBuilder(doc);

// Create a USERNAME field to display the current user's name,
// taken from the UserInformation object we created above.
FieldUserName fieldUserName = (FieldUserName)builder.InsertField(FieldType.FieldUserName, true);
Assert.AreEqual(userInformation.Name, fieldUserName.Result);

Assert.AreEqual(" USERNAME ", fieldUserName.GetFieldCode());
Assert.AreEqual("John Doe", fieldUserName.Result);

// We can set this property to get our field to override the value currently stored in the UserInformation object. 
fieldUserName.UserName = "Jane Doe";
fieldUserName.Update();

Assert.AreEqual(" USERNAME  \"Jane Doe\"", fieldUserName.GetFieldCode());
Assert.AreEqual("Jane Doe", fieldUserName.Result);

// This does not affect the value in the UserInformation object.
Assert.AreEqual("John Doe", doc.FieldOptions.CurrentUser.Name);

doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.USERNAME.docx");
```

### See Also

* class [FieldUserName](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
