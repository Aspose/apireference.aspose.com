---
title: XpsDocument.InsertGlyphs
second_title: .NET API 참조용 Aspose.Page
description: XpsDocument 방법. 활성 페이지에 새 글리프를 삽입합니다.index 위치.
type: docs
weight: 420
url: /ko/net/aspose.page.xps/xpsdocument/insertglyphs/
---
## InsertGlyphs(int, string, float, FontStyle, float, float, string) {#insertglyphs_1}

활성 페이지에 새 글리프를 삽입합니다.*index* 위치.

```csharp
public XpsGlyphs InsertGlyphs(int index, string fontFamily, float fontSize, FontStyle fontStyle, 
    float originX, float originY, string unicodeString)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| index | Int32 | 새 글리프를 삽입해야 하는 위치입니다. |
| fontFamily | String | 글꼴 패밀리. |
| fontSize | Single | 글꼴 크기. |
| fontStyle | FontStyle | 글꼴 스타일. |
| originX | Single | 글리프 원점 X 좌표. |
| originY | Single | 글리프 원점 Y 좌표. |
| unicodeString | String | 인쇄할 문자열입니다. |

### 반환 값

삽입된 글리프.

### 또한보십시오

* class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* class [XpsDocument](../)
* 네임스페이스 [Aspose.Page.XPS](../../xpsdocument/)
* 집회 [Aspose.Page](../../../)

---

## InsertGlyphs(int, XpsFont, float, float, float, string) {#insertglyphs}

활성 페이지에 새 글리프를 삽입합니다.*index* 위치.

```csharp
public XpsGlyphs InsertGlyphs(int index, XpsFont font, float fontSize, float originX, 
    float originY, string unicodeString)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| index | Int32 | 새 글리프를 삽입해야 하는 위치입니다. |
| font | XpsFont | 글꼴 리소스. |
| fontSize | Single | 글꼴 크기. |
| originX | Single | 글리프 원점 X 좌표. |
| originY | Single | 글리프 원점 Y 좌표. |
| unicodeString | String | 인쇄할 문자열입니다. |

### 반환 값

삽입된 글리프.

### 또한보십시오

* class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* class [XpsDocument](../)
* 네임스페이스 [Aspose.Page.XPS](../../xpsdocument/)
* 집회 [Aspose.Page](../../../)


