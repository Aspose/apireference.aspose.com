---
title: CreateMathFraction()
second_title: Aspose.Slides for C++ API Reference
description: Creates a math fraction
type: docs
weight: 1
url: /cpp/aspose.slides.mathtext/imathfractionfactory/createmathfraction/
---
## IMathFractionFactory::CreateMathFraction(System::SharedPtr\<IMathElement\>, System::SharedPtr\<IMathElement\>, MathFractionTypes) method


Creates a math fraction

```cpp
virtual System::SharedPtr<IMathFraction> Aspose::Slides::MathText::IMathFractionFactory::CreateMathFraction(System::SharedPtr<IMathElement> numerator, System::SharedPtr<IMathElement> denominator, MathFractionTypes fractionType)=0
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| numerator | [System::SharedPtr](../../../system/sharedptr/)\<[IMathElement](../../imathelement/)\> | Numerator |
| denominator | [System::SharedPtr](../../../system/sharedptr/)\<[IMathElement](../../imathelement/)\> | Denominator |
| fractionType | [MathFractionTypes](../../mathfractiontypes/) | Fraction type |

### Return Value

New math fraction [IMathFraction](../../imathfraction/)

## IMathFractionFactory::CreateMathFraction(System::SharedPtr\<IMathElement\>, System::SharedPtr\<IMathElement\>) method


Creates a math fraction

```cpp
virtual System::SharedPtr<IMathFraction> Aspose::Slides::MathText::IMathFractionFactory::CreateMathFraction(System::SharedPtr<IMathElement> numerator, System::SharedPtr<IMathElement> denominator)=0
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| numerator | [System::SharedPtr](../../../system/sharedptr/)\<[IMathElement](../../imathelement/)\> | Numerator |
| denominator | [System::SharedPtr](../../../system/sharedptr/)\<[IMathElement](../../imathelement/)\> | Denominator |

### Return Value

New math fraction [IMathFraction](../../imathfraction/)

## See Also

* Enum [MathFractionTypes](../../mathfractiontypes/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IMathFraction](../../imathfraction/)
* Class [IMathElement](../../imathelement/)
* Class [IMathFractionFactory](../)
* Namespace [Aspose::Slides::MathText](../../)
* Library [Aspose.Slides](../../../)