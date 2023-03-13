---
title: get_TrimFromStart()
second_title: Aspose.Slides for C++ API Reference
description: Trim start [ms]
type: docs
weight: 209
url: /cpp/aspose.slides/ivideoframe/get_trimfromstart/
---
## IVideoFrame::get_TrimFromStart() method


Trim start [ms]

```cpp
virtual float Aspose::Slides::IVideoFrame::get_TrimFromStart()=0
```

## Remarks


Example: 
```cpp
[C#]
using (Presentation pres = new Presentation())
{
    ISlide slide = pres.Slides[0];
    IVideo video = pres.Videos.AddVideo(File.ReadAllBytes("video.mp4"));
    var videoFrame = slide.Shapes.AddVideoFrame(0, 0, 100, 100, video);

    //set triming start time 1sec
    videoFrame.TrimFromStart = 1000f;

    //set triming end time 2sec
    videoFrame.TrimFromEnd = 2000f;
}
```

## See Also

* Class [IVideoFrame](../)
* Namespace [Aspose::Slides](../../)
* Library [Aspose.Slides](../../../)
