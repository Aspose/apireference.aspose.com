---
title: CreateMathGroupingCharacter()
second_title: Aspose.Slides for C++ API Reference
description: Creates a math grouping character
type: docs
weight: 1
url: /cpp/aspose.slides.mathtext/mathgroupingcharacterfactory/createmathgroupingcharacter/
---
## MathGroupingCharacterFactory::CreateMathGroupingCharacter(System::SharedPtr\<IMathElement\>, char16_t, MathTopBotPositions, MathTopBotPositions) method


Creates a math grouping character

```cpp
System::SharedPtr<IMathGroupingCharacter> Aspose::Slides::MathText::MathGroupingCharacterFactory::CreateMathGroupingCharacter(System::SharedPtr<IMathElement> element, char16_t character, MathTopBotPositions position, MathTopBotPositions verticalJustification) override
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| element | [System::SharedPtr](../../../system/sharedptr/)\<[IMathElement](../../imathelement/)\> | math element to apply grouping character |
| character | char16_t | grouping character |
| position | [MathTopBotPositions](../../mathtopbotpositions/) | position of grouping character |
| verticalJustification | [MathTopBotPositions](../../mathtopbotpositions/) | vertical justification |

### Return Value

new grouping character element

## MathGroupingCharacterFactory::CreateMathGroupingCharacter(System::SharedPtr\<IMathElement\>) method


Creates a math grouping character

```cpp
System::SharedPtr<IMathGroupingCharacter> Aspose::Slides::MathText::MathGroupingCharacterFactory::CreateMathGroupingCharacter(System::SharedPtr<IMathElement> element) override
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| element | [System::SharedPtr](../../../system/sharedptr/)\<[IMathElement](../../imathelement/)\> | math element to apply grouping character |

### Return Value

new grouping character element

## See Also

* Enum [MathTopBotPositions](../../mathtopbotpositions/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IMathGroupingCharacter](../../imathgroupingcharacter/)
* Class [IMathElement](../../imathelement/)
* Class [MathGroupingCharacterFactory](../)
* Namespace [Aspose::Slides::MathText](../../)
* Library [Aspose.Slides](../../../)