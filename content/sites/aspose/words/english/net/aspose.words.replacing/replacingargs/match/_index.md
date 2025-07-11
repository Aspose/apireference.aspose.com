---
title: ReplacingArgs.Match
linktitle: Match
articleTitle: Match
second_title: Aspose.Words for .NET
description: Discover the ReplacingArgs Match property for seamless regex replacements. Enhance your coding efficiency with precise match results!
type: docs
weight: 30
url: /net/aspose.words.replacing/replacingargs/match/
---
## ReplacingArgs.Match property

The Match resulting from a single regular expression match during a **Replace**.

```csharp
public Match Match { get; }
```

## Remarks

**Match.Index"** gets the zero-based starting position of the match from the start of the find and replace range.

## Examples

Shows how to apply a different font to new content via FindReplaceOptions.

```csharp
public void ConvertNumbersToHexadecimal()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    builder.Font.Name = "Arial";
    builder.Writeln("Numbers that the find-and-replace operation will convert to hexadecimal and highlight:\n" +
                    "123, 456, 789 and 17379.");

    // We can use a "FindReplaceOptions" object to modify the find-and-replace process.
    FindReplaceOptions options = new FindReplaceOptions();

    // Set the "HighlightColor" property to a background color that we want to apply to the operation's resulting text.
    options.ApplyFont.HighlightColor = Color.LightGray;

    NumberHexer numberHexer = new NumberHexer();
    options.ReplacingCallback = numberHexer;

    int replacementCount = doc.Range.Replace(new Regex("[0-9]+"), "", options);

    Console.WriteLine(numberHexer.GetLog());

    Assert.That(replacementCount, Is.EqualTo(4));
    Assert.That(doc.GetText().Trim(), Is.EqualTo("Numbers that the find-and-replace operation will convert to hexadecimal and highlight:\r" +
                    "0x7B, 0x1C8, 0x315 and 0x43E3."));
    Assert.That(doc.GetChildNodes(NodeType.Run, true).OfType<Run>()
            .Count(r => r.Font.HighlightColor.ToArgb() == Color.LightGray.ToArgb()), Is.EqualTo(4));
}

/// <summary>
/// Replaces numeric find-and-replacement matches with their hexadecimal equivalents.
/// Maintains a log of every replacement.
/// </summary>
private class NumberHexer : IReplacingCallback
{
    public ReplaceAction Replacing(ReplacingArgs args)
    {
        mCurrentReplacementNumber++;

        int number = Convert.ToInt32(args.Match.Value);

        args.Replacement = $"0x{number:X}";

        mLog.AppendLine($"Match #{mCurrentReplacementNumber}");
        mLog.AppendLine($"\tOriginal value:\t{args.Match.Value}");
        mLog.AppendLine($"\tReplacement:\t{args.Replacement}");
        mLog.AppendLine($"\tOffset in parent {args.MatchNode.NodeType} node:\t{args.MatchOffset}");

        mLog.AppendLine(string.IsNullOrEmpty(args.GroupName)
            ? $"\tGroup index:\t{args.GroupIndex}"
            : $"\tGroup name:\t{args.GroupName}");

        return ReplaceAction.Replace;
    }

    public string GetLog()
    {
        return mLog.ToString();
    }

    private int mCurrentReplacementNumber;
    private readonly StringBuilder mLog = new StringBuilder();
}
```

### See Also

* class [ReplacingArgs](../)
* namespace [Aspose.Words.Replacing](../../../aspose.words.replacing/)
* assembly [Aspose.Words](../../../)
