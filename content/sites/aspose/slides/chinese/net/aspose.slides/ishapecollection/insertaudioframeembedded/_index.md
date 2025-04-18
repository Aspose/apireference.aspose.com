---
title: InsertAudioFrameEmbedded
second_title: Aspose.Slides for .NET API 参考
description: 插入带有嵌入音频文件的 AudioFrame 嵌入的音频文件声音只能是 WAV 它将新音频添加到 Presentation.Audios 列表中
type: docs
weight: 230
url: /zh/net/aspose.slides/ishapecollection/insertaudioframeembedded/
---
## InsertAudioFrameEmbedded(int, float, float, float, float, Stream) {#insertaudioframeembedded_1}

插入带有嵌入音频文件的 AudioFrame。 嵌入的音频文件声音只能是 WAV。 它将新音频添加到 Presentation.Audios 列表中。

```csharp
public IAudioFrame InsertAudioFrameEmbedded(int index, float x, float y, float width, float height, 
    Stream audio_stream)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| index | Int32 | 应该插入值的从零开始的索引。 |
| x | Single | 新音频帧的 X 坐标。 |
| y | Single | 新音频帧的 Y 坐标。 |
| width | Single | 新音频帧的宽度。 |
| height | Single | 新音频帧的高度。 |
| audio_stream | Stream | 音频流。 |

### 返回值

创建了 AudioFrame 对象。

### 也可以看看

* interface [IAudioFrame](../../iaudioframe)
* interface [IShapeCollection](../../ishapecollection)
* 命名空间 [Aspose.Slides](../../ishapecollection)
* 部件 [Aspose.Slides](../../../)

---

## InsertAudioFrameEmbedded(int, float, float, float, float, IAudio) {#insertaudioframeembedded}

插入带有嵌入音频文件的 AudioFrame。 它使用 Presentation.Audios 列表中的音频文件。

```csharp
public IAudioFrame InsertAudioFrameEmbedded(int index, float x, float y, float width, float height, 
    IAudio audio)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| index | Int32 | 应该插入值的从零开始的索引。 |
| x | Single | 新音频帧的 X 坐标。 |
| y | Single | 新音频帧的 Y 坐标。 |
| width | Single | 新音频帧的宽度。 |
| height | Single | 新音频帧的高度。 |
| audio | IAudio | Presentation.Audios 列表中的音频。 |

### 返回值

创建了 AudioFrame 对象。

### 也可以看看

* interface [IAudioFrame](../../iaudioframe)
* interface [IAudio](../../iaudio)
* interface [IShapeCollection](../../ishapecollection)
* 命名空间 [Aspose.Slides](../../ishapecollection)
* 部件 [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
