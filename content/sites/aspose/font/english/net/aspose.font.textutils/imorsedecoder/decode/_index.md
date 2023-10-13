---
title: IMorseDecoder.Decode
second_title: Aspose.Font for .NET API Reference
description: IMorseDecoder method. Deciphers Morse code
type: docs
weight: 10
url: /net/aspose.font.textutils/imorsedecoder/decode/
---
## IMorseDecoder.Decode method

Deciphers Morse code.

```csharp
public string Decode(string morseText, MorseAlphabets alphabet = MorseAlphabets.Latin, 
    char inputSeparator = '/', char outputSeparator = ' ')
```

| Parameter | Type | Description |
| --- | --- | --- |
| morseText | String | Text encoded by Morse code, ie text like "... --- ..."(SOS) |
| alphabet | MorseAlphabets | Alphabet of Morse code |
| inputSeparator | Char | Symbol used to separate words in encoded text |
| outputSeparator | Char | Symbol used to separate words in decoded text |

### Return Value

Decoded text

### See Also

* enum [MorseAlphabets](../../morsealphabets/)
* interface [IMorseDecoder](../)
* namespace [Aspose.Font.TextUtils](../../imorsedecoder/)
* assembly [Aspose.Font](../../../)


