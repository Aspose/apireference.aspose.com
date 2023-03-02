---
title: Class VectorMapLayer
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Rendering.VectorMapLayer 수업. 내부 레이어Map 벡터 레이어 데이터를 나타냅니다.
type: docs
weight: 2000
url: /ko/net/aspose.gis.rendering/vectormaplayer/
---
## VectorMapLayer class

내부 레이어[`Map`](../map/) 벡터 레이어 데이터를 나타냅니다.

```csharp
public class VectorMapLayer : MapLayer
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [VectorMapLayer](vectormaplayer/#constructor)(FeaturesSequence) | 기본 심볼라이저로 새 인스턴스를 만듭니다. |
| [VectorMapLayer](vectormaplayer/#constructor_1)(FeaturesSequence, VectorSymbolizer) | 기본 심볼라이저로 새 인스턴스를 만듭니다. |
| [VectorMapLayer](vectormaplayer/#constructor_5)(VectorLayer, bool) | 기본 심볼라이저로 새 인스턴스를 만듭니다. |
| [VectorMapLayer](vectormaplayer/#constructor_2)(FeaturesSequence, VectorSymbolizer, Labeling) | 기본 심볼라이저로 새 인스턴스를 만듭니다. |
| [VectorMapLayer](vectormaplayer/#constructor_4)(VectorLayer, VectorSymbolizer, bool) | 새 인스턴스를 만듭니다. |
| [VectorMapLayer](vectormaplayer/#constructor_3)(VectorLayer, VectorSymbolizer, Labeling, bool) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [FeaturesSequence](../../aspose.gis.rendering/vectormaplayer/featuressequence/) { get; } | 이 표시되는 기능 시퀀스`벡터지도층` . |
| [Labeling](../../aspose.gis.rendering/vectormaplayer/labeling/) { get; set; } | 맵 레이어의 뒤틀기 옵션을 지정합니다. |
| [Opacity](../../aspose.gis.rendering/maplayer/opacity/) { get; set; } | 레이어의 불투명도. |
| [Symbolizer](../../aspose.gis.rendering/vectormaplayer/symbolizer/) { get; set; } | 레이어의 피처를 렌더링하는 데 사용할 심볼라이저입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| override [Dispose](../../aspose.gis.rendering/vectormaplayer/dispose/)() | 리소스를 폐기합니다. |
| [ImportSld](../../aspose.gis.rendering/vectormaplayer/importsld/#importsld)(AbstractPath, SldImportOptions) | 지정된 경로에 있는 Styled Layer Descriptor 파일에서 스타일을 가져옵니다. |
| [ImportSld](../../aspose.gis.rendering/vectormaplayer/importsld/#importsld_1)(string, SldImportOptions) | 지정된 경로에 있는 Styled Layer Descriptor 파일에서 스타일을 가져옵니다. |
| [ImportSldFromString](../../aspose.gis.rendering/vectormaplayer/importsldfromstring/)(string, SldImportOptions) | 지정된 스타일 레이어 설명자 문자열에서 스타일을 가져옵니다. |

### 또한보십시오

* class [MapLayer](../maplayer/)
* 네임스페이스 [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* 집회 [Aspose.GIS](../../)


