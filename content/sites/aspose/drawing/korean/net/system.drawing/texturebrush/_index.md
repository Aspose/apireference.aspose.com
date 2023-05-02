---
title: Class TextureBrush
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.TextureBrush 수업. TextureBrush 클래스의 각 속성은 이미지를 사용하여 모양의 내부를 채우는 Brush 개체입니다. 이 클래스는 상속될 수 없습니다.
type: docs
weight: 1260
url: /ko/net/system.drawing/texturebrush/
---
## TextureBrush class

TextureBrush 클래스의 각 속성은 이미지를 사용하여 모양의 내부를 채우는 Brush 개체입니다. 이 클래스는 상속될 수 없습니다.

```csharp
public sealed class TextureBrush : Brush
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [TextureBrush](texturebrush/#constructor)(Image) | 의 새 인스턴스를 초기화합니다.`TextureBrush` 지정된 이미지를 사용하는 클래스. |
| [TextureBrush](texturebrush/#constructor_3)(Image, RectangleF) | 의 새 인스턴스를 초기화합니다.`TextureBrush` 지정된 이미지를 사용하는 클래스 및 경계 사각형. |
| [TextureBrush](texturebrush/#constructor_1)(Image, WrapMode) | 의 새 인스턴스를 초기화합니다.`TextureBrush` 지정된 이미지와 랩 모드를 사용하는 클래스. |
| [TextureBrush](texturebrush/#constructor_4)(Image, RectangleF, ImageAttributes) | 의 새 인스턴스를 초기화합니다.`TextureBrush` 지정된 이미지, 경계 사각형 및 이미지 속성을 사용하는 클래스입니다. |
| [TextureBrush](texturebrush/#constructor_2)(Image, WrapMode, RectangleF) | 의 새 인스턴스를 초기화합니다.`TextureBrush` 지정된 이미지, 랩 모드 및 경계 사각형을 사용하는 클래스입니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Image](../../system.drawing/texturebrush/image/) { get; } | 이 TextureBrush 개체와 연결된 Image 개체를 가져옵니다. |
| [Transform](../../system.drawing/texturebrush/transform/) { get; set; } | 이 TextureBrush 개체와 연결된 image 에 대한 로컬 기하학적 변환을 정의하는 Matrix 개체의 복사본을 가져오거나 설정합니다. |
| [WrapMode](../../system.drawing/texturebrush/wrapmode/) { get; set; } | 이 TextureBrush 개체의 래핑 모드를 나타내는 WrapMode 열거형을 가져오거나 설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| override [Clone](../../system.drawing/texturebrush/clone/)() | 이것의 정확한 복사본을 만듭니다.TextureBrush object. |
| [Dispose](../../system.drawing/brush/dispose/)() | 이 Brush 개체에서 사용하는 모든 리소스를 해제합니다. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform)(Matrix) | 곱하기Matrix 이것의 지역 기하 변환 를 나타내는 객체TextureBrush 지정된 객체Matrix 지정된 를 prepending 하여 객체Matrix object. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | 곱하기Matrix 이것의 지역 기하 변환 를 나타내는 객체TextureBrush 지정된 객체Matrix 지정된 order. 의 객체 |
| [ResetTransform](../../system.drawing/texturebrush/resettransform/)() | 이 변환 속성을 재설정합니다.TextureBrush 신원에 대한 객체. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform)(float) | 이것의 로컬 기하 변환을 회전합니다.TextureBrush 객체를 지정된 양만큼. 이 방법은 변환 앞에 회전을 추가합니다. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | 이것의 로컬 기하 변환을 회전합니다.TextureBrush 지정된 order. 에서 지정된 양만큼 객체 |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform)(float, float) | 이것의 로컬 기하학적 변환을 확장합니다.TextureBrush 객체를 지정된 양만큼. 이 방법은 스케일링 매트릭스를 변환 앞에 추가합니다. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | 이것의 로컬 기하학적 변환을 확장합니다.TextureBrush object 지정된 order. 의 지정된 양만큼 |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform)(float, float) | 이의 로컬 기하학적 변환을 변환합니다.TextureBrush객체를 지정된 치수로 지정합니다. 이 방법은 변환 앞에 변환을 추가합니다. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | 이의 로컬 기하학적 변환을 변환합니다.TextureBrush 지정된 순서로 지정된 치수 만큼 개체. |

### 또한보십시오

* class [Brush](../brush/)
* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


