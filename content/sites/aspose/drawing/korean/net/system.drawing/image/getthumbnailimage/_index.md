---
title: Image.GetThumbnailImage
second_title: .NET API 참조용 Aspose.Drawing
description: Image 방법. 이에 대한 썸네일을 반환합니다.Image .
type: docs
weight: 230
url: /ko/net/system.drawing/image/getthumbnailimage/
---
## Image.GetThumbnailImage method

이에 대한 썸네일을 반환합니다.Image .

```csharp
public Image GetThumbnailImage(int thumbWidth, int thumbHeight, GetThumbnailImageAbort callback, 
    IntPtr callbackData)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| thumbWidth | Int32 | 요청된 썸네일 이미지의 너비(픽셀)입니다. |
| thumbHeight | Int32 | 요청된 썸네일 이미지의 높이(픽셀)입니다. |
| callback | GetThumbnailImageAbort | ㅏ[`GetThumbnailImageAbort`](../../image.getthumbnailimageabort/) 대리자. 참고 대리자를 만들고 대리자에 대한 참조를*callback* 매개변수이지만 대리자는 사용되지 않습니다. |
| callbackData | IntPtr | 반드시Zero . |

### 반환 값

안Image 축소판을 나타냅니다.

### 또한보십시오

* delegate [GetThumbnailImageAbort](../../image.getthumbnailimageabort/)
* class [Image](../)
* 네임스페이스 [System.Drawing](../../image/)
* 집회 [Aspose.Drawing](../../../)


