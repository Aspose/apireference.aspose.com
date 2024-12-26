---
title: IMorseEncoder.Encode
second_title: Aspose.Font for .NET API Reference
description: IMorseEncoder method. Encodes text by Morse code
type: docs
weight: 10
url: /net/aspose.font.textutils/imorseencoder/encode/
---
## Encode(string, MorseAlphabets, char, char) {#encode}

Encodes text by Morse code.

```csharp
public string Encode(string text, MorseAlphabets alphabet, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | Text to encode by Morse code |
| alphabet | MorseAlphabets | Alphabet of Morse code |
| inputSeparator | Char | Symbol used to separate words in input text |
| outputSeparator | Char | Symbol used to separate words in encoded text |

### Return Value

Encoded text, ie "... --- ..." for the input text "SOS"

### See Also

* enum [MorseAlphabets](../../morsealphabets/)
* interface [IMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)

---

## Encode(string, char, char) {#encode_1}

Encodes text by Morse code. Heuristic analysis is used to calculate the alphabet of the input text. The alphabet is selected by the first word.

```csharp
public string Encode(string text, char inputSeparator = ' ', char outputSeparator = '/')
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | Text to encode by Morse code |
| inputSeparator | Char | Symbol used to separate words in input text |
| outputSeparator | Char | Symbol used to separate words in encoded text |

### Return Value

Encoded text, ie "... --- ..." for the input text "SOS"

### See Also

* interface [IMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)


