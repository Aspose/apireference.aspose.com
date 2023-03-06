---
title: Class LayeredSymbolizer
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Rendering.Symbolizers.LayeredSymbolizer 수업. 다른 여러 심볼라이저를 렌더링하는 심볼라이저입니다.
type: docs
weight: 1830
url: /ko/net/aspose.gis.rendering.symbolizers/layeredsymbolizer/
---
## LayeredSymbolizer class

다른 여러 심볼라이저를 렌더링하는 심볼라이저입니다.

```csharp
public class LayeredSymbolizer : VectorSymbolizer, IReadOnlyList<VectorSymbolizer>
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [LayeredSymbolizer](layeredsymbolizer/#constructor)() | 새 인스턴스를 만듭니다. |
| [LayeredSymbolizer](layeredsymbolizer/#constructor_1)(RenderingOrder) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/count/) { get; } | 심볼라이저의 수를 가져옵니다. |
| [Item](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/item/) { get; } | 지정된 인덱스에서 심볼라이저를 가져옵니다. |
| [RenderingOrder](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/renderingorder/) { get; set; } | 렌더링 순서를 결정합니다. ByFeatures - 기능에 대한 모든 심볼라이저를 렌더링한 후 다음 기능으로 진행합니다.ByLayers - 심볼라이저로 모든 기능을 렌더링한 후 다음 심볼라이저로 진행합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/add/)(VectorSymbolizer) | 지정된 심볼라이저를 추가합니다. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/getenumerator/)() | 컬렉션을 반복하는 열거자를 반환합니다. |

### 또한보십시오

* class [VectorSymbolizer](../vectorsymbolizer/)
* 네임스페이스 [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* 집회 [Aspose.GIS](../../)


