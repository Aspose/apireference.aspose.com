---
title: Hyphenation.RegisterDictionary
linktitle: RegisterDictionary
articleTitle: RegisterDictionary
second_title: Aspose.Words for .NET
description: Effortlessly enhance text processing with the Hyphenation RegisterDictionary method. Load language-specific hyphenation dictionaries seamlessly for optimal results.
type: docs
weight: 40
url: /net/aspose.words/hyphenation/registerdictionary/
---
## RegisterDictionary(*string, Stream*) {#registerdictionary}

Registers and loads a hyphenation dictionary for the specified language from a stream. Throws if dictionary cannot be read or has invalid format.

```csharp
public static void RegisterDictionary(string language, Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| language | String | A language name, e.g. "en-US". See .NET documentation for "culture name" and RFC 4646 for details. |
| stream | Stream | A stream for the dictionary file in OpenOffice format. |

## Examples

Shows how to open and register a dictionary from a file.

```csharp
public void RegisterDictionary()
{
    // Set up a callback that tracks warnings that occur during hyphenation dictionary registration.
    WarningInfoCollection warningInfoCollection = new WarningInfoCollection();
    Hyphenation.WarningCallback = warningInfoCollection;

    // Register an English (US) hyphenation dictionary by stream.
    Stream dictionaryStream = new FileStream(MyDir + "hyph_en_US.dic", FileMode.Open);
    Hyphenation.RegisterDictionary("en-US", dictionaryStream);

    Assert.That(warningInfoCollection.Count, Is.EqualTo(0));

    // Open a document with a locale that Microsoft Word may not hyphenate on an English machine, such as German.
    Document doc = new Document(MyDir + "German text.docx");

    // To hyphenate that document upon saving, we need a hyphenation dictionary for the "de-CH" language code.
    // This callback will handle the automatic request for that dictionary.
    Hyphenation.Callback = new CustomHyphenationDictionaryRegister();

    // When we save the document, German hyphenation will take effect.
    doc.Save(ArtifactsDir + "Hyphenation.RegisterDictionary.pdf");

    // This dictionary contains two identical patterns, which will trigger a warning.
    Assert.That(warningInfoCollection.Count, Is.EqualTo(1));
    Assert.That(warningInfoCollection[0].WarningType, Is.EqualTo(WarningType.MinorFormattingLoss));
    Assert.That(warningInfoCollection[0].Source, Is.EqualTo(WarningSource.Layout));
    Assert.That(warningInfoCollection[0].Description, Is.EqualTo("Hyphenation dictionary contains duplicate patterns. The only first found pattern will be used. " +
                    "Content can be wrapped differently."));

}

/// <summary>
/// Associates ISO language codes with local system filenames for hyphenation dictionary files.
/// </summary>
private class CustomHyphenationDictionaryRegister : IHyphenationCallback
{
    public CustomHyphenationDictionaryRegister()
    {
        mHyphenationDictionaryFiles = new Dictionary<string, string>
        {
            { "en-US", MyDir + "hyph_en_US.dic" },
            { "de-CH", MyDir + "hyph_de_CH.dic" }
        };
    }

    public void RequestDictionary(string language)
    {
        Console.Write("Hyphenation dictionary requested: " + language);

        if (Hyphenation.IsDictionaryRegistered(language))
        {
            Console.WriteLine(", is already registered.");
            return;
        }

        if (mHyphenationDictionaryFiles.ContainsKey(language))
        {
            Hyphenation.RegisterDictionary(language, mHyphenationDictionaryFiles[language]);
            Console.WriteLine(", successfully registered.");
            return;
        }

        Console.WriteLine(", no respective dictionary file known by this Callback.");
    }

    private readonly Dictionary<string, string> mHyphenationDictionaryFiles;
}
```

### See Also

* class [Hyphenation](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

---

## RegisterDictionary(*string, string*) {#registerdictionary_1}

Registers and loads a hyphenation dictionary for the specified language from file. Throws if dictionary cannot be read or has invalid format.

This method can also be used to register Null dictionary to prevent [`Callback`](../callback/) from being called repeatedly for the same language.

```csharp
public static void RegisterDictionary(string language, string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| language | String | A language name, e.g. "en-US". See .NET documentation for "culture name" and RFC 4646 for details. |
| fileName | String | A path to the dictionary file in Open Office format. |

## Examples

Shows how to register a hyphenation dictionary.

```csharp
// A hyphenation dictionary contains a list of strings that define hyphenation rules for the dictionary's language.
// When a document contains lines of text in which a word could be split up and continued on the next line,
// hyphenation will look through the dictionary's list of strings for that word's substrings.
// If the dictionary contains a substring, then hyphenation will split the word across two lines
// by the substring and add a hyphen to the first half.
// Register a dictionary file from the local file system to the "de-CH" locale.
Hyphenation.RegisterDictionary("de-CH", MyDir + "hyph_de_CH.dic");

Assert.That(Hyphenation.IsDictionaryRegistered("de-CH"), Is.True);

// Open a document containing text with a locale matching that of our dictionary,
// and save it to a fixed-page save format. The text in that document will be hyphenated.
Document doc = new Document(MyDir + "German text.docx");

Assert.That(doc.FirstSection.Body.FirstParagraph.Runs.OfType<Run>().All(
    r => r.Font.LocaleId == new CultureInfo("de-CH").LCID), Is.True);

doc.Save(ArtifactsDir + "Hyphenation.Dictionary.Registered.pdf");

// Re-load the document after un-registering the dictionary,
// and save it to another PDF, which will not have hyphenated text.
Hyphenation.UnregisterDictionary("de-CH");

Assert.That(Hyphenation.IsDictionaryRegistered("de-CH"), Is.False);

doc = new Document(MyDir + "German text.docx");
doc.Save(ArtifactsDir + "Hyphenation.Dictionary.Unregistered.pdf");
```

Shows how to open and register a dictionary from a file.

```csharp
public void RegisterDictionary()
{
    // Set up a callback that tracks warnings that occur during hyphenation dictionary registration.
    WarningInfoCollection warningInfoCollection = new WarningInfoCollection();
    Hyphenation.WarningCallback = warningInfoCollection;

    // Register an English (US) hyphenation dictionary by stream.
    Stream dictionaryStream = new FileStream(MyDir + "hyph_en_US.dic", FileMode.Open);
    Hyphenation.RegisterDictionary("en-US", dictionaryStream);

    Assert.That(warningInfoCollection.Count, Is.EqualTo(0));

    // Open a document with a locale that Microsoft Word may not hyphenate on an English machine, such as German.
    Document doc = new Document(MyDir + "German text.docx");

    // To hyphenate that document upon saving, we need a hyphenation dictionary for the "de-CH" language code.
    // This callback will handle the automatic request for that dictionary.
    Hyphenation.Callback = new CustomHyphenationDictionaryRegister();

    // When we save the document, German hyphenation will take effect.
    doc.Save(ArtifactsDir + "Hyphenation.RegisterDictionary.pdf");

    // This dictionary contains two identical patterns, which will trigger a warning.
    Assert.That(warningInfoCollection.Count, Is.EqualTo(1));
    Assert.That(warningInfoCollection[0].WarningType, Is.EqualTo(WarningType.MinorFormattingLoss));
    Assert.That(warningInfoCollection[0].Source, Is.EqualTo(WarningSource.Layout));
    Assert.That(warningInfoCollection[0].Description, Is.EqualTo("Hyphenation dictionary contains duplicate patterns. The only first found pattern will be used. " +
                    "Content can be wrapped differently."));

}

/// <summary>
/// Associates ISO language codes with local system filenames for hyphenation dictionary files.
/// </summary>
private class CustomHyphenationDictionaryRegister : IHyphenationCallback
{
    public CustomHyphenationDictionaryRegister()
    {
        mHyphenationDictionaryFiles = new Dictionary<string, string>
        {
            { "en-US", MyDir + "hyph_en_US.dic" },
            { "de-CH", MyDir + "hyph_de_CH.dic" }
        };
    }

    public void RequestDictionary(string language)
    {
        Console.Write("Hyphenation dictionary requested: " + language);

        if (Hyphenation.IsDictionaryRegistered(language))
        {
            Console.WriteLine(", is already registered.");
            return;
        }

        if (mHyphenationDictionaryFiles.ContainsKey(language))
        {
            Hyphenation.RegisterDictionary(language, mHyphenationDictionaryFiles[language]);
            Console.WriteLine(", successfully registered.");
            return;
        }

        Console.WriteLine(", no respective dictionary file known by this Callback.");
    }

    private readonly Dictionary<string, string> mHyphenationDictionaryFiles;
}
```

### See Also

* class [Hyphenation](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
