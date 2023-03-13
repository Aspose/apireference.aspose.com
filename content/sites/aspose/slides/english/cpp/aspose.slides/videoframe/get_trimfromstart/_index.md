---
title: get_TrimFromStart()
second_title: Aspose.Slides for C++ API Reference
description: Trim start [ms]
type: docs
weight: 209
url: /cpp/aspose.slides/videoframe/get_trimfromstart/
---
## VideoFrame::get_TrimFromStart() method


Trim start [ms]

```cpp
float Aspose::Slides::VideoFrame::get_TrimFromStart() override
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

* Class [VideoFrame](../)
* Namespace [Aspose::Slides](../../)
* Library [Aspose.Slides](../../../)
