---
title: DrawingSettings.StrictMode
second_title: .NET API 참조용 Aspose.Drawing
description: DrawingSettings 재산. 구현되지 않은 기능을 보다 엄격하게 포착할 수 있는지 여부를 나타내는 값을 가져오거나 설정합니다.
type: docs
weight: 10
url: /ko/net/system.drawing/drawingsettings/strictmode/
---
## DrawingSettings.StrictMode property

구현되지 않은 기능을 보다 엄격하게 포착할 수 있는지 여부를 나타내는 값을 가져오거나 설정합니다.

```csharp
public static bool StrictMode { get; set; }
```

### 비고

true로 설정하면 현재 구현에서 올바르게 작동하지 않는 기능/매개변수를 사용하는 경우 라이브러리에서 NotImplementedException이 발생합니다. false로 설정하면 사용자 프로그램이 작동할 기회를 주기 위해 일부 매개변수가 무시될 수 있습니다. 이 경우 드로잉 결과는 GDI+. 와 비교하여 다르게 보일 수 있습니다.

### 또한보십시오

* class [DrawingSettings](../)
* 네임스페이스 [System.Drawing](../../drawingsettings/)
* 집회 [Aspose.Drawing](../../../)


