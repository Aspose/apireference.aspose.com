---
title: FontConfigSubstitutionRule Class
linktitle: FontConfigSubstitutionRule
articleTitle: FontConfigSubstitutionRule
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Fonts.FontConfigSubstitutionRule class for seamless font management and customization in your documents. Enhance your text styling today!
type: docs
weight: 3290
url: /net/aspose.words.fonts/fontconfigsubstitutionrule/
---
## FontConfigSubstitutionRule class

Font config substitution rule.

To learn more, visit the [Working with Fonts](https://docs.aspose.com/words/net/working-with-fonts/) documentation article.

```csharp
public class FontConfigSubstitutionRule : FontSubstitutionRule
```

## Properties

| Name | Description |
| --- | --- |
| override [Enabled](../../aspose.words.fonts/fontconfigsubstitutionrule/enabled/) { set; } | Specifies whether the rule is enabled or not. |

## Methods

| Name | Description |
| --- | --- |
| [IsFontConfigAvailable](../../aspose.words.fonts/fontconfigsubstitutionrule/isfontconfigavailable/)() | Check if fontconfig utility is available or not. |
| [ResetCache](../../aspose.words.fonts/fontconfigsubstitutionrule/resetcache/)() | Resets the cache of fontconfig calling results. |

## Remarks

This rule uses fontconfig utility on Linux (and other Unix-like) platforms to get the substitution if the original font is not available.

If fontconfig utility is not available then this rule will be ignored.

## Examples

Shows operating system-dependent font config substitution.

```csharp
FontSettings fontSettings = new FontSettings();
FontConfigSubstitutionRule fontConfigSubstitution =
    fontSettings.SubstitutionSettings.FontConfigSubstitution;

bool isWindows = new[] {PlatformID.Win32NT, PlatformID.Win32S, PlatformID.Win32Windows, PlatformID.WinCE}
    .Any(p => Environment.OSVersion.Platform == p);

// The FontConfigSubstitutionRule object works differently on Windows/non-Windows platforms.
// On Windows, it is unavailable.
if (isWindows)
{
    Assert.That(fontConfigSubstitution.Enabled, Is.False);
    Assert.That(fontConfigSubstitution.IsFontConfigAvailable(), Is.False);
}

bool isLinuxOrMac =
    new[] {PlatformID.Unix, PlatformID.MacOSX}.Any(p => Environment.OSVersion.Platform == p);

// On Linux/Mac, we will have access to it, and will be able to perform operations.
if (isLinuxOrMac)
{
    Assert.That(fontConfigSubstitution.Enabled, Is.True);
    Assert.That(fontConfigSubstitution.IsFontConfigAvailable(), Is.True);

    fontConfigSubstitution.ResetCache();
}
```

### See Also

* class [FontSubstitutionRule](../fontsubstitutionrule/)
* namespace [Aspose.Words.Fonts](../../aspose.words.fonts/)
* assembly [Aspose.Words](../../)
