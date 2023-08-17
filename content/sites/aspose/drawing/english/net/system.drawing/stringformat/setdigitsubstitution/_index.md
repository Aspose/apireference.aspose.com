---
title: StringFormat.SetDigitSubstitution
second_title: Aspose.Drawing for .NET API Reference
description: StringFormat method. Specifies the language and method to be used when local digits are substituted for western digits
type: docs
weight: 140
url: /net/system.drawing/stringformat/setdigitsubstitution/
---
## StringFormat.SetDigitSubstitution method

Specifies the language and method to be used when local digits are substituted for western digits.

```csharp
public void SetDigitSubstitution(int language, StringDigitSubstitute substitute)
```

| Parameter | Type | Description |
| --- | --- | --- |
| language | Int32 | A National Language Support (NLS) language identifier that identifies the language that will be used when local digits are substituted for western digits. You can pass the LCID property of a CultureInfo object as the NLS language identifier. For example, suppose you create a CultureInfo object by passing the string `"ar-EG"` to a CultureInfo constructor. If you pass the LCID property of that CultureInfo object along with Traditional to the Int32,StringDigitSubstitute) method, then Arabic-Indic digits will be substituted for western digits at display time. |
| substitute | StringDigitSubstitute | An element of the StringDigitSubstitute enumeration that specifies how digits are displayed. |

### See Also

* enum [StringDigitSubstitute](../../stringdigitsubstitute/)
* class [StringFormat](../)
* namespace [System.Drawing](../../stringformat/)
* assembly [Aspose.Drawing](../../../)


