---
title: PsDocument.FillAndStrokeText
second_title: .NET API 참조용 Aspose.Page
description: PsDocument 방법. 글리프 내부를 채우고 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.
type: docs
weight: 110
url: /ko/net/aspose.page.eps/psdocument/fillandstroketext/
---
## FillAndStrokeText(string, Font, float, float, Brush, Brush, Pen) {#fillandstroketext_1}

글리프 내부를 채우고 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

```csharp
public void FillAndStrokeText(string text, Font font, float x, float y, Brush fillPaint, 
    Brush strokePaint, Pen stroke)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| text | String | 추가할 텍스트입니다. |
| font | Font | 텍스트를 그리는 데 사용할 시스템 글꼴입니다. |
| x | Single | 텍스트 원점의 X 좌표. |
| y | Single | 텍스트 원점의 Y 좌표. |
| fillPaint | Brush | 글리프 내부 페인팅에 사용되는 채우기입니다. |
| strokePaint | Brush | 그만큼Brush 글리프 윤곽을 그리는 데 사용됩니다. 의 하위 클래스일 수 있습니다.Brush .NET 플랫폼의 클래스. |
| stroke | Pen | 글리프 윤곽을 그리는 데 사용되는 획입니다. |

### 또한보십시오

* class [PsDocument](../)
* 네임스페이스 [Aspose.Page.EPS](../../psdocument/)
* 집회 [Aspose.Page](../../../)

---

## FillAndStrokeText(string, float[], Font, float, float, Brush, Brush, Pen) {#fillandstroketext}

글리프 내부를 채우고 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

```csharp
public void FillAndStrokeText(string text, float[] advances, Font font, float x, float y, 
    Brush fillPaint, Brush strokePaint, Pen stroke)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| text | String | 추가할 텍스트입니다. |
| advances | Single[] | 글리프 너비의 배열입니다. 길이는 문자열의 글리프 수와 일치해야 합니다. |
| font | Font | 텍스트를 그리는 데 사용할 시스템 글꼴입니다. |
| x | Single | 텍스트 원점의 X 좌표. |
| y | Single | 텍스트 원점의 Y 좌표. |
| fillPaint | Brush | 글리프 내부 페인팅에 사용되는 채우기입니다. |
| strokePaint | Brush | 그만큼Brush 글리프 윤곽을 그리는 데 사용됩니다. 의 하위 클래스일 수 있습니다.Brush .NET 플랫폼의 클래스. |
| stroke | Pen | 글리프 윤곽을 그리는 데 사용되는 획입니다. |

### 또한보십시오

* class [PsDocument](../)
* 네임스페이스 [Aspose.Page.EPS](../../psdocument/)
* 집회 [Aspose.Page](../../../)


