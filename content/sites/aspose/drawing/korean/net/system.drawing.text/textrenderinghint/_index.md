---
title: Enum TextRenderingHint
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Text.TextRenderingHint 열거형. 텍스트 렌더링 품질을 지정합니다.
type: docs
weight: 1250
url: /ko/net/system.drawing.text/textrenderinghint/
---
## TextRenderingHint enumeration

텍스트 렌더링 품질을 지정합니다.

```csharp
public enum TextRenderingHint
```

### 가치

| 이름 | 값 | 설명 |
| --- | --- | --- |
| SystemDefault | `0` | 각 문자는 시스템 기본 렌더링 힌트와 함께 글리프 비트맵을 사용하여 그려집니다. 텍스트는 사용자가 시스템에 대해 선택한 글꼴 다듬기 설정을 사용하여 그려집니다. |
| SingleBitPerPixelGridFit | `1` | 각 문자는 글리프 비트맵을 사용하여 그려집니다. 힌트는 줄기와 곡률의 문자 모양을 개선하는 데 사용됩니다. |
| SingleBitPerPixel | `2` | 각 문자는 글리프 비트맵을 사용하여 그려집니다. 힌트는 사용하지 않습니다. |
| AntiAliasGridFit | `3` | 각 문자는 힌팅이 있는 앤티앨리어싱된 글리프 비트맵을 사용하여 그려집니다. 앤티앨리어싱으로 인해 품질이 훨씬 좋아지지만 성능 비용이 높아집니다. |
| AntiAlias | `4` | 각 문자는 힌트 없이 안티앨리어싱된 글리프 비트맵을 사용하여 그려집니다. |
| ClearTypeGridFit | `5` | 각 문자는 힌트가 있는 글리프 ClearType 비트맵을 사용하여 그려집니다. 최고 품질 설정. ClearType 글꼴 기능을 활용하는 데 사용됩니다. |

### 또한보십시오

* 네임스페이스 [System.Drawing.Text](../../system.drawing.text/)
* 집회 [Aspose.Drawing](../../)


