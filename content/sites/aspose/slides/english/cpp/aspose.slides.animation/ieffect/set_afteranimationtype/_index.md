---
title: set_AfterAnimationType()
second_title: Aspose.Slides for C++ API Reference
description: Defined an after animation type for effect. Write AfterAnimationType.
type: docs
weight: 235
url: /cpp/aspose.slides.animation/ieffect/set_afteranimationtype/
---
## IEffect::set_AfterAnimationType(Aspose::Slides::Animation::AfterAnimationType) method


Defined an after animation type for effect. Write [AfterAnimationType](../../afteranimationtype/).

```cpp
virtual void Aspose::Slides::Animation::IEffect::set_AfterAnimationType(Aspose::Slides::Animation::AfterAnimationType value)=0
```

## Remarks



```cpp
auto presentation = System::MakeObject<Presentation>(u"demo.pptx");

// Get the first effect of the first slide.
System::SharedPtr<IEffect> firstSlideEffect = presentation->get_Slide(0)->get_Timeline()->get_MainSequenceEffect(0);

// Change the effect After animation to "Hide on Next Mouse Click"
firstSlideEffect->set_AfterAnimationType(AfterAnimationType::HideOnNextMouseClick);
```

## See Also

* Enum [AfterAnimationType](../../afteranimationtype/)
* Class [IEffect](../)
* Namespace [Aspose::Slides::Animation](../../)
* Library [Aspose.Slides](../../../)