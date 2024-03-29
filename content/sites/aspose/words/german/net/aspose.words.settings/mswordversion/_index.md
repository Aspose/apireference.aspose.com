---
title: MsWordVersion Enum
linktitle: MsWordVersion
articleTitle: MsWordVersion
second_title: Aspose.Words für .NET
description: Aspose.Words.Settings.MsWordVersion opsomming. Ermöglicht Aspose.Wods das versionspezifische Anwendungsverhalten von MS Word nachzuahmen in C#.
type: docs
weight: 5860
url: /de/net/aspose.words.settings/mswordversion/
---
## MsWordVersion enumeration

Ermöglicht Aspose.Wods, das versionspezifische Anwendungsverhalten von MS Word nachzuahmen.

```csharp
public enum MsWordVersion
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Word2000 | `0` | Optimieren Sie das Verhalten von Aspose.Words, um es an die Version von MS Word 2000 anzupassen. |
| Word2002 | `1` | Optimieren Sie das Verhalten von Aspose.Words, um es an die Version von MS Word 2002 anzupassen. |
| Word2003 | `2` | Optimieren Sie das Verhalten von Aspose.Words, um es an die Version von MS Word 2003 anzupassen. |
| Word2007 | `3` | Optimieren Sie das Verhalten von Aspose.Words, um es an die Version von MS Word 2007 anzupassen. |
| Word2010 | `4` | Optimieren Sie das Verhalten von Aspose.Words, um es an die Version von MS Word 2010 anzupassen. |
| Word2013 | `5` | Optimieren Sie das Verhalten von Aspose.Words, um es an die Version von MS Word 2013 anzupassen. |
| Word2016 | `6` | Optimieren Sie das Verhalten von Aspose.Words, um es an die Version von MS Word 2016 anzupassen. |
| Word2019 | `7` | Optimieren Sie das Verhalten von Aspose.Words, um es an die Version von MS Word 2019 anzupassen. |

## Beispiele

Zeigt, wie das Dokument für verschiedene Versionen von Microsoft Word optimiert wird.

```csharp
public void OptimizeFor()
{
    Document doc = new Document();

    // Dieses Objekt enthält eine umfangreiche Liste von Flags, die für jedes Dokument einzigartig sind
    // die es uns ermöglichen, die Abwärtskompatibilität mit älteren Versionen von Microsoft Word zu erleichtern.
    CompatibilityOptions options = doc.CompatibilityOptions;

    // Standardeinstellungen für ein leeres Dokument drucken.
    Console.WriteLine("\nDefault optimization settings:");
    PrintCompatibilityOptions(options);

    // Auf diese Einstellungen können wir in Microsoft Word über „Datei“ -> zugreifen. „Optionen“ -> „Erweitert“ –> „Kompatibilitätsoptionen für…“.
    doc.Save(ArtifactsDir + "CompatibilityOptions.OptimizeFor.DefaultSettings.docx");

    // Wir können die OptimizeFor-Methode verwenden, um eine optimale Kompatibilität mit einer bestimmten Microsoft Word-Version sicherzustellen.
    doc.CompatibilityOptions.OptimizeFor(MsWordVersion.Word2010);
    Console.WriteLine("\nOptimized for Word 2010:");
    PrintCompatibilityOptions(options);

    doc.CompatibilityOptions.OptimizeFor(MsWordVersion.Word2000);
    Console.WriteLine("\nOptimized for Word 2000:");
    PrintCompatibilityOptions(options);
}

/// <summary>
/// Gruppiert alle Flags in den Kompatibilitätsoptionen eines Dokuments nach Status und gibt dann jede Gruppe aus.
/// </summary>
private static void PrintCompatibilityOptions(CompatibilityOptions options)
{
    for (int i = 1; i >= 0; i--)
    {
        Console.WriteLine(Convert.ToBoolean(i) ? "\tEnabled options:" : "\tDisabled options:");
        SortedSet<string> optionNames = new SortedSet<string>();

        foreach (System.ComponentModel.PropertyDescriptor descriptor in System.ComponentModel.TypeDescriptor.GetProperties(options))
        {
            if (descriptor.PropertyType == Type.GetType("System.Boolean") && i == Convert.ToInt32(descriptor.GetValue(options)))
            {
                optionNames.Add(descriptor.Name);
            }
        }

        foreach (string s in optionNames)
        {
            Console.WriteLine($"\t\t{s}");
        }
    }
}
```

### Siehe auch

* namensraum [Aspose.Words.Settings](../../aspose.words.settings/)
* Montage [Aspose.Words](../../)
