---
title: StringFormat.DigitSubstitutionLanguage
second_title: Aspose.Drawing for .NET API Reference
description: StringFormat property. Gets the language that is used when local digits are substituted for western digits
type: docs
weight: 50
url: /net/aspose.drawing/stringformat/digitsubstitutionlanguage/
---
## StringFormat.DigitSubstitutionLanguage property

Gets the language that is used when local digits are substituted for western digits.

```csharp
public int DigitSubstitutionLanguage { get; }
```

### Return Value

A National Language Support (NLS) language identifier that identifies the language that will be used when local digits are substituted for western digits. You can pass the LCID property of a CultureInfo object as the NLS language identifier. For example, suppose you create a CultureInfo object by passing the string "ar-EG" to a CultureInfo constructor. If you pass the LCID property of that CultureInfo object along with.Traditional to the [`SetDigitSubstitution`](../setdigitsubstitution/) method, then Arabic-Indic digits will be substituted for western digits at display time.

### See Also

* class [StringFormat](../)
* namespace [Aspose.Drawing](../../stringformat/)
* assembly [Aspose.Drawing.Common](../../../)


