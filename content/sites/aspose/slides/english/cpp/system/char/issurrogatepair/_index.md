---
title: IsSurrogatePair()
second_title: Aspose.Slides for C++ API Reference
description: Determines whether the two specified characters for a UTF-16 surrogate pair.
type: docs
weight: 27
url: /cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


Determines whether the two specified characters for a UTF-16 surrogate pair.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| highSurrogate | char_t | A character that is tested for being a high surrogate |
| lowSurrogate | char_t | A character that is tested for being a low surrogate |

### Return Value

True if the specified characters form a surrogate pair, otherwise - false

## Char::IsSurrogatePair(const String\&, int) method


Determines whether two consequent characters in the specified character buffer are a surrogate pair.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| str | const [String](../../string/)\& | A string |
| index | int | A zero based index in the specified buffer at which the character sequence to test begins |

### Return Value

True if the specified characters are a surrogate pair, otherwise - false

## See Also

* Class [Char](../)
* Class [String](../../string/)
* Namespace [System](../../)
* Library [Aspose.Slides](../../../)