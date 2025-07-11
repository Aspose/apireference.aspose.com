---
title: FindReplaceOptions.UseSubstitutions
linktitle: UseSubstitutions
articleTitle: UseSubstitutions
second_title: Aspose.Words for .NET
description: Discover the UseSubstitutions property in FindReplaceOptions. Easily enable substitutions in replacement patterns for enhanced text editing flexibility.
type: docs
weight: 190
url: /net/aspose.words.replacing/findreplaceoptions/usesubstitutions/
---
## FindReplaceOptions.UseSubstitutions property

Gets or sets a boolean value indicating whether to recognize and use substitutions within replacement patterns. The default value is `false`.

```csharp
public bool UseSubstitutions { get; set; }
```

## Remarks

For the details on substitution elements please refer to: https://docs.microsoft.com/en-us/dotnet/standard/base-types/substitutions-in-regular-expressions.

## Examples

Shows how to recognize and use substitutions within replacement patterns.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Write("Jason gave money to Paul.");

Regex regex = new Regex(@"([A-z]+) gave money to ([A-z]+)");

FindReplaceOptions options = new FindReplaceOptions();
options.UseSubstitutions = true;

// Using legacy mode does not support many advanced features, so we need to set it to 'false'.
options.LegacyMode = false;

doc.Range.Replace(regex, @"$2 took money from $1", options);

Assert.That("Paul took money from Jason.\f", Is.EqualTo(doc.GetText()));
```

Shows how to replace the text with substitutions.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("John sold a car to Paul.");
builder.Writeln("Jane sold a house to Joe.");

// We can use a "FindReplaceOptions" object to modify the find-and-replace process.
FindReplaceOptions options = new FindReplaceOptions();

// Set the "UseSubstitutions" property to "true" to get
// the find-and-replace operation to recognize substitution elements.
// Set the "UseSubstitutions" property to "false" to ignore substitution elements.
options.UseSubstitutions = useSubstitutions;

Regex regex = new Regex(@"([A-z]+) sold a ([A-z]+) to ([A-z]+)");
doc.Range.Replace(regex, @"$3 bought a $2 from $1", options);

Assert.That(doc.GetText().Trim(), Is.EqualTo(useSubstitutions
        ? "Paul bought a car from John.\rJoe bought a house from Jane."
        : "$3 bought a $2 from $1.\r$3 bought a $2 from $1."));
```

### See Also

* class [FindReplaceOptions](../)
* namespace [Aspose.Words.Replacing](../../../aspose.words.replacing/)
* assembly [Aspose.Words](../../../)
