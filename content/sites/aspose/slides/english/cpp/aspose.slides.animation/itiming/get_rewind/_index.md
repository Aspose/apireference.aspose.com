---
title: get_Rewind()
second_title: Aspose.Slides for C++ API Reference
description: This attribute specifies if the effect will rewind when done playing. Read bool.
type: docs
weight: 313
url: /cpp/aspose.slides.animation/itiming/get_rewind/
---
## ITiming::get_Rewind() method


This attribute specifies if the effect will rewind when done playing. Read **bool**.

```cpp
virtual bool Aspose::Slides::Animation::ITiming::get_Rewind()=0
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

* Class [ITiming](../)
* Namespace [Aspose::Slides::Animation](../../)
* Library [Aspose.Slides](../../../)
