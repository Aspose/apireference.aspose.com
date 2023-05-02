---
title: Enum ImageLockMode
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Imaging.ImageLockMode 열거형. 플래그 매개변수에 전달되는 플래그를 지정합니다.LockBits 방법. LockBits 메서드는 픽셀 데이터를 읽거나 쓸 수 있도록 image 의 일부를 잠급니다.
type: docs
weight: 780
url: /ko/net/system.drawing.imaging/imagelockmode/
---
## ImageLockMode enumeration

플래그 매개변수에 전달되는 플래그를 지정합니다.[`LockBits`](../../system.drawing/bitmap/lockbits/) 방법. [`LockBits`](../../system.drawing/bitmap/lockbits/) 메서드는 픽셀 데이터를 읽거나 쓸 수 있도록 image 의 일부를 잠급니다.

```csharp
public enum ImageLockMode
```

### 가치

| 이름 | 값 | 설명 |
| --- | --- | --- |
| ReadOnly | `1` | 읽기를 위해 이미지의 일부가 잠겨 있음을 지정합니다. |
| WriteOnly | `2` | 쓰기를 위해 이미지의 일부가 잠겨 있음을 지정합니다. |
| ReadWrite | `3` | 읽기 또는 쓰기를 위해 이미지의 일부가 잠겨 있음을 지정합니다. |
| UserInputBuffer | `4` | 픽셀 데이터를 읽거나 쓰는 데 사용되는 버퍼가 사용자에 의해 할당됨을 지정합니다. 이 플래그가 설정되면*flags* 의 매개변수[`LockBits`](../../system.drawing/bitmap/lockbits/) 메서드는 입력 매개변수(및 가능한 출력 매개변수) 역할을 합니다. 이 플래그가 지워지면*flags* 매개변수는 출력 매개변수로만 사용됩니다. |

### 또한보십시오

* 네임스페이스 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 집회 [Aspose.Drawing](../../)


