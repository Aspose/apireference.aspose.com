---
title: Break A Link
linktitle: Break A Link
second_title: Aspose.Words for .NET API Reference
description: Learn how to break links in a Word document with Aspose.Words for .NET.
type: docs
weight: 10
url: /net/working-with-textboxes/break-a-link/
---

Aspose.Words for .NET is a powerful library that offers various features for working with Microsoft Word documents programmatically. One of its useful features is the ability to break links within a document. In this tutorial, we'll explore source code in C# that demonstrates how to break a link using Aspose.Words for .NET.

## Step 1: C# Source Code Preview

The provided C# source code focuses on the "Break A Link" feature of Aspose.Words for .NET. It shows how to break a link in a TextBox shape inside a document. The code presents different scenarios for breaking links and provides clear instructions on how to achieve the desired results.

## Step 2: Setting up the document and creating a TextBox shape

To start, we need to set up the document and create a TextBox shape. The following code initializes a new instance of the `Document` class and creates a text box shape:

```csharp
Document doc = new Document();
Shape shape = new Shape(doc, ShapeType.TextBox);
TextBox textBox = shape.TextBox;
```

## Step 3: Break forward link in TextBox

To break a forward link in the TextBox, we can use the `BreakForwardLink()` method. This method breaks the link to the next shape in the sequence. The following code shows how to break a forward link:

```csharp
textBox.BreakForwardLink();
```

## Step 4: Break a forward link by setting a null value

Alternatively, we can break a forward link by setting the TextBox's `Next` property to `null`. This effectively removes the connection to the next shape. The following code demonstrates this approach:

```csharp
textBox. Next = null;
```

## Step 5: Break a link that leads to the TextBox

In some cases, we need to break a link that leads to the TextBox shape. We can achieve this by calling the `BreakForwardLink()` method on the `Previous` form, which breaks the link to the TextBox. Here is an example of how to break such a link:

```csharp
textBox.Previous?.BreakForwardLink();
```

### Sample source code for breaking a link with Aspose.Words for .NET

```csharp
Document doc = new Document();
Shape shape = new Shape(doc, ShapeType.TextBox);
TextBox textBox = shape.TextBox;

// Break forward link.
textBox.BreakForwardLink();

// Break a forward link by setting a null value.
textBox. Next = null;

// Break a link that leads to this text box.
textBox.Previous?.BreakForwardLink();
```


