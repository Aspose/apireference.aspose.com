---
title: Change Locale
linktitle: Change Locale
second_title: Aspose.Words for .NET API Reference
description: Learn how to change the locale for date and number formatting in Word documents using Aspose.Words for .NET.
type: docs
weight: 10
url: /net/working-with-fields/change-locale/
---

In this tutorial, we will guide you through the process of changing the locale in Word documents using Aspose.Words for .NET. By modifying the locale, you can control the formatting of dates and numbers during mail merge operations. We will provide you with the necessary C# source code and step-by-step instructions to achieve this.

## Prerequisites
Before we begin, ensure that you have the following prerequisites:
- Aspose.Words for .NET library installed on your system.

## Step 1: Create a Document and DocumentBuilder
To start, create an instance of the Document class and a DocumentBuilder object:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

## Step 2: Insert a Field
Next, insert a merge field into the document using the InsertField method:

```csharp
builder.InsertField("MERGEFIELD Date");
```

In the above code, we insert a merge field named "Date" into the document.

## Step 3: Change the Locale
To change the locale for date and number formatting, you can modify the current culture of the thread. In this example, we will set the locale to German ("de-DE"):

```csharp
CultureInfo currentCulture = Thread.CurrentThread.CurrentCulture;
Thread.CurrentThread.CurrentCulture = new CultureInfo("de-DE");
```

In the above code, we store the current culture and then set the current thread's culture to German.

## Step 4: Perform Mail Merge
Perform a mail merge operation and provide the date value for the "Date" field:

```csharp
doc.MailMerge.Execute(new[] { "Date" }, new object[] { DateTime.Now });
```

In this code snippet, we execute the mail merge operation and provide the current date as the value for the "Date" field.

## Step 5: Restore the Original Locale
After the mail merge is complete, restore the original culture for the thread:

```csharp
Thread.CurrentThread.CurrentCulture = currentCulture;
```

In the above code, we restore the original culture of the thread.

## Step 6: Save the Document
Save the modified document to a file using the Save method of the Document class:

```csharp
doc.Save(dataDir + "WorkingWithFields.ChangeLocale.docx");
```

### Example Source Code for Changing Locale using Aspose.Words for .NET
Here is the complete source code for changing the locale in Word documents using Aspose.Words for .NET:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.InsertField("MERGEFIELD Date");

CultureInfo currentCulture = Thread.CurrentThread.CurrentCulture;
Thread.CurrentThread.CurrentCulture = new CultureInfo("de-DE");

doc.MailMerge.Execute(new[] { "Date" }, new object[] { DateTime.Now });

Thread.CurrentThread.CurrentCulture = currentCulture;

doc.Save(dataDir + "WorkingWithFields.ChangeLocale.docx");
```

## Conclusion
Congratulations! You have successfully learned how to change the locale in Word documents using Aspose.Words for .NET. By following the step-by-step guide and utilizing the provided source code, you can now control the formatting of dates and numbers during mail merge operations. Customize the locale according to your requirements to ensure accurate and consistent formatting in your documents.

