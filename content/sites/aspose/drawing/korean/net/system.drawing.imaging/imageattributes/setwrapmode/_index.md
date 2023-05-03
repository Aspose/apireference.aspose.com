---
title: ImageAttributes.SetWrapMode
second_title: .NET API 참조용 Aspose.Drawing
description: ImageAttributes 방법. 모양 또는 모양 경계에서 텍스처를 바둑판식으로 배열하는 방법을 결정하는 데 사용되는 랩 모드를 설정합니다. 텍스처가 채우는 모양보다 작을 때 채우기 위해 모양을 가로질러 텍스처가 바둑판식으로 배열됩니다.
type: docs
weight: 240
url: /ko/net/system.drawing.imaging/imageattributes/setwrapmode/
---
## SetWrapMode(WrapMode) {#setwrapmode}

모양 또는 모양 경계에서 텍스처를 바둑판식으로 배열하는 방법을 결정하는 데 사용되는 랩 모드를 설정합니다. 텍스처가 채우는 모양보다 작을 때 채우기 위해 모양을 가로질러 텍스처가 바둑판식으로 배열됩니다.

```csharp
public void SetWrapMode(WrapMode mode)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| mode | WrapMode | 의 요소WrapMode image 의 반복 복사본이 영역을 타일링하는 데 사용되는 방식을 지정합니다. |

### 또한보십시오

* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* class [ImageAttributes](../)
* 네임스페이스 [System.Drawing.Imaging](../../imageattributes/)
* 집회 [Aspose.Drawing](../../../)

---

## SetWrapMode(WrapMode, Color) {#setwrapmode_1}

모양 또는 모양 경계에서 텍스처를 바둑판식으로 배열하는 방법을 결정하는 데 사용되는 랩 모드 및 색상을 설정합니다. 텍스처가 채우는 모양보다 작을 때 채우기 위해 모양을 가로질러 텍스처가 바둑판식으로 배열됩니다.

```csharp
public void SetWrapMode(WrapMode mode, Color color)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| mode | WrapMode | 의 요소WrapMode image 의 반복 복사본이 영역을 타일링하는 데 사용되는 방식을 지정합니다. |
| color | Color | 안Color렌더링된 이미지 외부의 픽셀 색상을 지정하는 객체입니다. 이 색상은 모드 매개변수가Clamp 소스 사각형에 전달된 [`DrawImage`](../../../system.drawing/graphics/drawimage/) 이미지 자체보다 큽니다. |

### 또한보십시오

* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* struct [Color](../../../system.drawing/color/)
* class [ImageAttributes](../)
* 네임스페이스 [System.Drawing.Imaging](../../imageattributes/)
* 집회 [Aspose.Drawing](../../../)

---

## SetWrapMode(WrapMode, Color, bool) {#setwrapmode_2}

모양 또는 모양 경계에서 텍스처를 바둑판식으로 배열하는 방법을 결정하는 데 사용되는 랩 모드 및 색상을 설정합니다. 텍스처가 채우는 모양보다 작을 때 채우기 위해 모양을 가로질러 텍스처가 바둑판식으로 배열됩니다.

```csharp
public void SetWrapMode(WrapMode mode, Color color, bool clamp)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| mode | WrapMode | 의 요소WrapMode image 의 반복 복사본이 영역을 타일링하는 데 사용되는 방식을 지정합니다. |
| color | Color | 렌더링된 이미지 외부의 픽셀 색상을 지정하는 색상 개체입니다. 이 색상은 모드 매개변수가Clamp 및 소스 rectangle 가 전달되었습니다.[`DrawImage`](../../../system.drawing/graphics/drawimage/) 이미지 자체보다 큽니다. |
| clamp | Boolean | 이 매개변수는 효과가 없습니다. 거짓으로 설정하십시오. |

### 또한보십시오

* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* struct [Color](../../../system.drawing/color/)
* class [ImageAttributes](../)
* 네임스페이스 [System.Drawing.Imaging](../../imageattributes/)
* 집회 [Aspose.Drawing](../../../)


