---
title: set_Rewind()
second_title: Aspose.Slides for C++ API Reference
description: This attribute specifies if the effect will rewind when done playing. Write bool.
type: docs
weight: 248
url: /cpp/aspose.slides.animation/timing/set_rewind/
---
## Timing::set_Rewind(**bool**) method


This attribute specifies if the effect will rewind when done playing. Write **bool**.

```cpp
void Aspose::Slides::Animation::Timing::set_Rewind(bool value) override
```

## Remarks



```cpp
using (Presentation presentation = new Presentation("demo.pptx"))
{
    // Get the effects sequence for the first slide
    ISequence effectsSequence = presentation.Slides[0].Timeline.MainSequence;

    // Get the first effect of main sequence.
    IEffect effect = effectsSequence[0];

    // Turn the effect Timing/Rewind on.
    effect.Timing.Rewind = true;
}
```

## See Also

* Class [Timing](../)
* Namespace [Aspose::Slides::Animation](../../)
* Library [Aspose.Slides](../../../)
