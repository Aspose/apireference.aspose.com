---
title: GraphicsPath.AddString
second_title: .NET API 참조용 Aspose.Drawing
description: GraphicsPath 방법. 이 경로에 텍스트 문자열을 추가합니다.
type: docs
weight: 200
url: /ko/net/system.drawing.drawing2d/graphicspath/addstring/
---
## AddString(string, FontFamily, int, float, Point, StringFormat) {#addstring}

이 경로에 텍스트 문자열을 추가합니다.

```csharp
public void AddString(string s, FontFamily family, int style, float emSize, Point origin, 
    StringFormat format)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| s | String | 그만큼String 추가합니다. |
| family | FontFamily | ㅏFontFamily 테스트가 그려지는 글꼴의 이름을 나타냅니다. |
| style | Int32 | ㅏFontStyle 텍스트에 대한 스타일 정보 를 나타내는 열거형(굵게, 기울임꼴 등). 이는 integer 로 캐스트되어야 합니다(이 섹션의 뒷부분에 있는 예제 코드 참조). |
| emSize | Single | 캐릭터의 경계를 이루는 EM 사각형 상자의 높이입니다. |
| origin | Point | ㅏPoint 텍스트가 시작되는 지점을 나타냅니다. |
| format | StringFormat | ㅏStringFormat줄 간격 및 정렬과 같은 텍스트 형식 정보 를 지정합니다. |

### 또한보십시오

* class [FontFamily](../../../system.drawing/fontfamily/)
* struct [Point](../../../system.drawing/point/)
* class [StringFormat](../../../system.drawing/stringformat/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)

---

## AddString(string, FontFamily, int, float, PointF, StringFormat) {#addstring_1}

이 경로에 텍스트 문자열을 추가합니다.

```csharp
public void AddString(string s, FontFamily family, int style, float emSize, PointF origin, 
    StringFormat format)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| s | String | 그만큼String 추가합니다. |
| family | FontFamily | ㅏFontFamily 테스트가 그려지는 글꼴의 이름을 나타냅니다. |
| style | Int32 | ㅏFontStyle 텍스트에 대한 스타일 정보 를 나타내는 열거형(굵게, 기울임꼴 등). 이는 integer 로 캐스트되어야 합니다(이 섹션의 뒷부분에 있는 예제 코드 참조). |
| emSize | Single | 캐릭터의 경계를 이루는 EM 사각형 상자의 높이입니다. |
| origin | PointF | ㅏPointF 텍스트가 시작되는 지점을 나타냅니다. |
| format | StringFormat | ㅏStringFormat줄 간격 및 정렬과 같은 텍스트 형식 정보 를 지정합니다. |

### 또한보십시오

* class [FontFamily](../../../system.drawing/fontfamily/)
* struct [PointF](../../../system.drawing/pointf/)
* class [StringFormat](../../../system.drawing/stringformat/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)

---

## AddString(string, FontFamily, int, float, Rectangle, StringFormat) {#addstring_2}

이 경로에 텍스트 문자열을 추가합니다.

```csharp
public void AddString(string s, FontFamily family, int style, float emSize, Rectangle layoutRect, 
    StringFormat format)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| s | String | 그만큼String 추가합니다. |
| family | FontFamily | ㅏFontFamily 테스트가 그려지는 글꼴의 이름을 나타냅니다. |
| style | Int32 | ㅏFontStyle text 에 대한 스타일 정보(굵게, 기울임꼴 등)를 나타내는 열거형입니다. 이는 정수로 캐스트되어야 합니다(이 섹션의 뒷부분에 있는 예제 코드 참조). |
| emSize | Single | 캐릭터의 경계를 이루는 EM 사각형 상자의 높이입니다. |
| layoutRect | Rectangle | ㅏRectangle 텍스트의 경계를 이루는 사각형을 나타냅니다. |
| format | StringFormat | ㅏStringFormat줄 간격 및 정렬과 같은 텍스트 형식 정보 를 지정합니다. |

### 또한보십시오

* class [FontFamily](../../../system.drawing/fontfamily/)
* struct [Rectangle](../../../system.drawing/rectangle/)
* class [StringFormat](../../../system.drawing/stringformat/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)

---

## AddString(string, FontFamily, int, float, RectangleF, StringFormat) {#addstring_3}

이 경로에 텍스트 문자열을 추가합니다.

```csharp
public void AddString(string s, FontFamily family, int style, float emSize, RectangleF layoutRect, 
    StringFormat format)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| s | String | 그만큼String 추가합니다. |
| family | FontFamily | ㅏFontFamily 테스트가 그려지는 글꼴의 이름을 나타냅니다. |
| style | Int32 | ㅏFontStyle text 에 대한 스타일 정보(굵게, 기울임꼴 등)를 나타내는 열거형입니다. 이는 정수로 캐스트되어야 합니다(이 섹션의 뒷부분에 있는 예제 코드 참조). |
| emSize | Single | 캐릭터의 경계를 이루는 EM 사각형 상자의 높이입니다. |
| layoutRect | RectangleF | ㅏRectangleF 텍스트의 경계를 이루는 사각형을 나타냅니다. |
| format | StringFormat | ㅏStringFormat줄 간격 및 정렬과 같은 텍스트 형식 정보 를 지정합니다. |

### 또한보십시오

* class [FontFamily](../../../system.drawing/fontfamily/)
* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [StringFormat](../../../system.drawing/stringformat/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)


