---
title: PlayAcrossSlides
second_title: Aspose.Slides für .NET-API-Referenz
description: Legt fest ob ein Audio über die Folien abgespielt wird. Lesen/SchreibenBoolean .
type: docs
weight: 100
url: /de/net/aspose.slides/iaudioframe/playacrossslides/
---
## IAudioFrame.PlayAcrossSlides property

Legt fest, ob ein Audio über die Folien abgespielt wird. Lesen/SchreibenBoolean .

```csharp
public bool PlayAcrossSlides { get; set; }
```

### Beispiele

```csharp
[C#]
using (Presentation pres = new Presentation())
{
    ISlide slide = pres.Slides[0];

    // Audioframe hinzufügen
    IAudioFrame audioFrame = slide.Shapes.AddAudioFrameLinked(50, 50, 100, 100, "sampleaudio.wav");

    // Legen Sie fest, dass Audio über die Folien abgespielt wird
    audioFrame.PlayAcrossSlides = true;

    // Stellen Sie Audio so ein, dass es nach dem Abspielen automatisch zurückgespult wird
    audioFrame.RewindAudio = true;

    pres.Save("AudioFrame_out.pptx", SaveFormat.Pptx);
}
```

### Siehe auch

* interface [IAudioFrame](../../iaudioframe)
* namensraum [Aspose.Slides](../../iaudioframe)
* Montage [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
