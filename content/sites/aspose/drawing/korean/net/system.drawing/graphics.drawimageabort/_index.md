---
title: Delegate Graphics.DrawImageAbort
second_title: .NET API 참조용 Aspose.Drawing
description: 언제 결정하기 위한 콜백 메서드를 제공합니다.DrawImage 메서드는 실행을 조기에 취소하고 이미지 그리기를 중지해야 합니다.
type: docs
weight: 540
url: /ko/net/system.drawing/graphics.drawimageabort/
---
## Graphics.DrawImageAbort delegate

언제 결정하기 위한 콜백 메서드를 제공합니다.[`DrawImage`](../graphics/drawimage/) 메서드는 실행을 조기에 취소하고 이미지 그리기를 중지해야 합니다.

```csharp
public delegate bool DrawImageAbort(IntPtr callbackdata);
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| callbackdata | IntPtr | 콜백 메서드에 대한 데이터를 지정하는 내부 포인터입니다. 이 매개변수는 모두 전달되지 않습니다.[`DrawImage`](../graphics/drawimage/) 과부하. 값을 확인하여 부재 여부를 테스트할 수 있습니다.Zero . |

### 반환 값

이 메서드는 다음과 같이 결정되면 true를 반환합니다.[`DrawImage`](../graphics/drawimage/) 메서드는 조기에 실행을 중지해야 합니다. 그렇지 않으면 false를 반환하여[`DrawImage`](../graphics/drawimage/) 메서드는 실행을 계속해야 합니다.

### 또한보십시오

* class [Graphics](../graphics/)
* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


