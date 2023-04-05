---
title: Interface ITrFont
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.ITrFont 상호 작용. 이 인터페이스는 font. 의 주요 매개변수에 대한 액세스를 제공합니다.
type: docs
weight: 260
url: /ko/net/aspose.page/itrfont/
---
## ITrFont interface

이 인터페이스는 font. 의 주요 매개변수에 대한 액세스를 제공합니다.

```csharp
public interface ITrFont
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [CharStrings](../../aspose.page/itrfont/charstrings/) { get; } | 문자 이름과 글리프 간의 매핑을 반환합니다. |
| [Encoding](../../aspose.page/itrfont/encoding/) { get; } | 인코딩 배열을 반환합니다. |
| [EncodingTable](../../aspose.page/itrfont/encodingtable/) { get; } | 인코딩 이름을 반환합니다. |
| [FID](../../aspose.page/itrfont/fid/) { get; } | 글꼴 식별자를 반환합니다. |
| [Font](../../aspose.page/itrfont/font/) { get; } | 이 글꼴에 해당하는 DrFont를 반환합니다. |
| [FontName](../../aspose.page/itrfont/fontname/) { get; } | 글꼴 이름을 반환합니다. |
| [FontType](../../aspose.page/itrfont/fonttype/) { get; } | Adobe 분류에서 글꼴 유형을 반환합니다. |
| [NativeFont](../../aspose.page/itrfont/nativefont/) { get; } | 이 글꼴에 해당하는 System.Drawing.Font를 반환합니다. |
| [Size](../../aspose.page/itrfont/size/) { get; } | 글꼴 크기를 반환합니다. |
| [Style](../../aspose.page/itrfont/style/) { get; } | 글꼴 스타일을 반환합니다. |
| [Transform](../../aspose.page/itrfont/transform/) { get; } | 글꼴 변환을 반환합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../aspose.page/itrfont/clone/)() | 글꼴을 복제합니다. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont)(float) | 새 크기로 이 글꼴과 동일하게 만듭니다. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_3)(FontStyle) | 새 스타일로 이 글꼴과 동일하게 만듭니다. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_2)(Matrix) | f character 새 변환으로 이 글꼴과 동일한 글꼴을 만듭니다. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_1)(float, FontStyle) | 새로운 크기와 스타일로 이 글꼴과 동일하게 만듭니다. |
| [GetCharWidth](../../aspose.page/itrfont/getcharwidth/)(char) | 문자의 너비를 반환합니다. |
| [GetOutline](../../aspose.page/itrfont/getoutline/)(char, float, float) | 지정된 위치에 있는 글리프의 개요를 반환합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Page](../../aspose.page/)
* 집회 [Aspose.Page](../../)


