---
title: TableSubstitutionRule.LoadWindowsSettings
linktitle: LoadWindowsSettings
articleTitle: LoadWindowsSettings
second_title: Aspose.Words for .NET
description: Effortlessly load predefined table substitution settings for Windows with the LoadWindowsSettings method. Optimize your workflow today!
type: docs
weight: 60
url: /net/aspose.words.fonts/tablesubstitutionrule/loadwindowssettings/
---
## TableSubstitutionRule.LoadWindowsSettings method

Loads predefined table substitution settings for Windows platform.

```csharp
public void LoadWindowsSettings()
```

## Examples

Shows how to access font substitution tables for Windows and Linux.

```csharp
Document doc = new Document();
FontSettings fontSettings = new FontSettings();
doc.FontSettings = fontSettings;

// Create a new table substitution rule and load the default Microsoft Windows font substitution table.
TableSubstitutionRule tableSubstitutionRule = fontSettings.SubstitutionSettings.TableSubstitution;
tableSubstitutionRule.LoadWindowsSettings();

// In Windows, the default substitute for the "Times New Roman CE" font is "Times New Roman".
Assert.That(tableSubstitutionRule.GetSubstitutes("Times New Roman CE").ToArray(), Is.EqualTo(new[] {"Times New Roman"}));

// We can save the table in the form of an XML document.
tableSubstitutionRule.Save(ArtifactsDir + "FontSettings.TableSubstitutionRule.Windows.xml");

// Linux has its own substitution table.
// There are multiple substitute fonts for "Times New Roman CE".
// If the first substitute, "FreeSerif" is also unavailable,
// this rule will cycle through the others in the array until it finds an available one.
tableSubstitutionRule.LoadLinuxSettings();
Assert.That(tableSubstitutionRule.GetSubstitutes("Times New Roman CE").ToArray(), Is.EqualTo(new[] {"FreeSerif", "Liberation Serif", "DejaVu Serif"}));

// Save the Linux substitution table in the form of an XML document using a stream.
using (FileStream fileStream = new FileStream(ArtifactsDir + "FontSettings.TableSubstitutionRule.Linux.xml",
    FileMode.Create))
{
    tableSubstitutionRule.Save(fileStream);
}
```

### See Also

* class [TableSubstitutionRule](../)
* namespace [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assembly [Aspose.Words](../../../)
